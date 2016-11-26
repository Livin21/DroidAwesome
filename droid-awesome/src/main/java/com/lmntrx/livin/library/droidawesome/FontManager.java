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


    static Typeface getTypeface(Context context) {
        synchronized (cache) {
            if (!cache.containsKey(FONT_AWESOME)) {
                cache.put(FONT_AWESOME,Typeface.createFromAsset(context.getAssets(), FONT_AWESOME));
            }
            return cache.get(FONT_AWESOME);
        }
    }
}

