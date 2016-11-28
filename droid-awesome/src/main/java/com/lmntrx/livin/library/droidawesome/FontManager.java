/**
 * Copyright 2016 DroidAwesome - Livin Mathew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.lmntrx.livin.library.droidawesome;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/***
 * Created by livin on 27/11/16.
 */

class FontManager {

    private static final String ROOT = "fonts/";
    private static final String FONT_AWESOME = ROOT + "font-awesome.ttf";

    private static final Hashtable<String, Typeface> cache = new Hashtable<>();


    /**
     * @param context context passed
     * @return returns TypeFace object from cache
     */
    static Typeface getTypeface(Context context) {
        synchronized (cache) {
            if (!cache.containsKey(FONT_AWESOME)) {
                cache.put(FONT_AWESOME,Typeface.createFromAsset(context.getAssets(), FONT_AWESOME));
            }
            return cache.get(FONT_AWESOME);
        }
    }
}

