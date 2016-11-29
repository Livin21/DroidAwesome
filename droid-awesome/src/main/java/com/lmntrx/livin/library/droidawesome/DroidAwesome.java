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
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by livin on 28/11/16.
 */

/**
 * DroidAwesome class contains static methods used to set FontAwesome icon to any native View (that supports
 * text or drawable) or a MenuItem
 * */
@SuppressWarnings("unused")
public class DroidAwesome {

    /**
     * @param context context passed
     * @param view view instance to which icon is applied. It can be an instance of
     *             a TextView or an ImageView
     * @param iconText FontAwesome icon text
     * @return returns modified view, returns null if the view is incompatible
     */
    /* Set TypeFace to a View */
    public static View setFontIcon(Context context, View view, String iconText){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied. It can be an instance of
     *             a TextView or an ImageView
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @return returns modified view, returns null if the view is incompatible
     */
    /* Set TypeFace to a View */
    public static View setFontIcon(Context context, View view, String iconText, float size){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            textView.setTextSize(size);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            textDrawable.setTextSize(size);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied. It can be an instance of
     *             a TextView or an ImageView
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @param colorRes color resource
     * @return returns modified view, returns null if the view is incompatible
     */
    /* Set TypeFace to a View */
    public static View setFontIcon(Context context, View view, String iconText, float size, int colorRes){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            textView.setTextColor(colorRes);
            textView.setTextSize(size);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            textDrawable.setText(iconText);
            textDrawable.setTextSize(size);
            textDrawable.setTextColor(colorRes);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @param size FontAwesome icon size
     * @return returns a drawable with icon
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    public static TextDrawable getFontIcon(Context context, String text, float size) {
        TextDrawable textDrawable = new TextDrawable(context);
        textDrawable.setTypeface(FontAwesome.getTypeface(context));
        textDrawable.setText(text);
        textDrawable.setTextSize(size);
        return textDrawable;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @return returns a drawable with icon
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    public static TextDrawable getFontIcon(Context context, String text) {
        TextDrawable icon = new TextDrawable(context);
        icon.setTypeface(FontAwesome.getTypeface(context));
        icon.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
        icon.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        icon.setTextColor(ContextCompat.getColor(context, android.R.color.white));
        icon.setText(text);
        return icon;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @param colorRes color resource
     * @param size FontAwesome icon size
     * @return returns a drawable with icon
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    public static TextDrawable getFontIcon(Context context, String text, float size, int colorRes) {
        TextDrawable textDrawable = new TextDrawable(context);
        textDrawable.setTypeface(FontAwesome.getTypeface(context));
        textDrawable.setText(text);
        textDrawable.setTextSize(size);
        textDrawable.setTextColor(colorRes);
        return textDrawable;
    }
}
