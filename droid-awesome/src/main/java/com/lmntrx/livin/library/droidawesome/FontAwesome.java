/**
 * Copyright 2016 DroidAwesome - Livin Mathew
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.lmntrx.livin.library.droidawesome;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/**
 * Created by livin on 27/11/16.
 * Copyright 2016 DroidAwesome - Livin Mathew
 */

public class FontAwesome {

    /* Root Directory. src/main/assets/fonts/ */
    private static final String ROOT = "fonts/";

    private static String FILE_NAME = "font_awesome.ttf";

    /* FontAwesome font file name */
    private static final String FONT_AWESOME = ROOT + FILE_NAME;

    /* Cache Font asset to avoid extra memory head */
    private static final Hashtable<String, Typeface> cache = new Hashtable<>();


    /**
     * @param context context passed
     * @return returns TypeFace object from cache
     */
    /* Returns FontAwesome TypeFace */
    public static Typeface getTypeface(Context context) {
        synchronized (cache) {
            if (!cache.containsKey(FONT_AWESOME)) {
                cache.put(FONT_AWESOME, processFontFromRaw(context));
            }
            return cache.get(FONT_AWESOME);
        }
    }

    private static Typeface processFontFromRaw(Context context) {
        Typeface typeface = null;
        InputStream inputStream = null;

        String outPath = context.getCacheDir() + "/tmp" + System.currentTimeMillis() + ".raw";

        try {
            inputStream = context.getResources().openRawResource(R.raw.font_awesome);
        } catch (Resources.NotFoundException ignored) {
        }

        try {
            assert inputStream != null;
            byte[] buffer = new byte[inputStream.available()];
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(outPath));
            int num;
            while ((num = inputStream.read(buffer)) > 0) {
                stream.write(buffer, 0, num);
            }
            stream.close();
            typeface = Typeface.createFromFile(outPath);
            new File(outPath).delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return typeface;
    }
}

