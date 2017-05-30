/**
 * Copyright 2016 DroidAwesome - Livin Mathew
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lmntrx.livin.library.droidawesome

import android.content.Context
import android.content.res.Resources
import android.graphics.Typeface
import android.util.Log

import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.Hashtable

/**
 * Created by livin on 27/11/16.
 * Copyright 2016 DroidAwesome - Livin Mathew
 */

object FontAwesome {

    /* Root Directory. src/main/assets/fonts/ */
    private val ROOT = "fonts/"

    private val FILE_NAME = "font_awesome.ttf"

    /* FontAwesome font file name */
    private val FONT_AWESOME = ROOT + FILE_NAME

    /* Cache Font asset to avoid extra memory head */
    private val cache = Hashtable<String, Typeface>()


    /**
     * @param context context passed
     * *
     * @return returns TypeFace object from cache
     */
    /* Returns FontAwesome TypeFace */
    fun getTypeface(context: Context): Typeface? {
        synchronized(cache) {
            if (!cache.containsKey(FONT_AWESOME)) {
                cache.put(FONT_AWESOME, processFontFromRaw(context))
            } else {
                Log.i(FontAwesome::class.java.simpleName, "Loading typeface from cache")
            }
            return cache[FONT_AWESOME]
        }
    }

    private fun processFontFromRaw(context: Context): Typeface? {
        var typeface: Typeface? = null
        var inputStream: InputStream? = null

        val outPath = context.cacheDir.toString() + "/tmp" + System.currentTimeMillis() + ".raw"

        try {
            inputStream = context.resources.openRawResource(R.raw.font_awesome)
        } catch (ignored: Resources.NotFoundException) {
        }

        try {
            assert(inputStream != null)
            val buffer = ByteArray(inputStream!!.available())
            val stream = BufferedOutputStream(FileOutputStream(outPath))
            var num: Int
            num = inputStream.read(buffer)
            while (num > 0) {
                stream.write(buffer, 0, num)
                num = inputStream.read(buffer)
            }
            stream.close()
            typeface = Typeface.createFromFile(outPath)
            if (File(outPath).delete()) {
                Log.i(FontAwesome::class.java.simpleName, "Deleted " + outPath)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return typeface
    }
}

