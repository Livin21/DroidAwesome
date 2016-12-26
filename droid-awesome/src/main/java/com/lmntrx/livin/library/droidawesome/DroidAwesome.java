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
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/***
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
     * @deprecated use {@link StringBuilder().#build()} or {@link DrawableBuilder().#build()} instead
     */
    /* Set TypeFace to a View */
    @Deprecated
    public static View setFontIcon(Context context, View view, String iconText) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            return textView;
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            imageView.setImageDrawable(textDrawable);
            return imageView;
        } else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied. It can be an instance of
     *             a TextView or an ImageView
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @return returns modified view, returns null if the view is incompatible
     * @deprecated use {@link StringBuilder().#build()} or {@link DrawableBuilder().#build()} instead
     */
    /* Set TypeFace to a View */
    @Deprecated
    public static View setFontIcon(Context context, View view, String iconText, float size) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            textView.setTextSize(size);
            return textView;
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            textDrawable.setTextSize(size);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        } else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied. It can be an instance of
     *             a TextView or an ImageView
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @param colorRes color resource
     * @return returns modified view, returns null if the view is incompatible
     * @deprecated use {@link StringBuilder().#build()} or {@link DrawableBuilder().#build()} instead
     */
    /* Set TypeFace to a View */
    @Deprecated
    public static View setFontIcon(Context context, View view, String iconText, float size, int colorRes) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTypeface(FontAwesome.getTypeface(context));
            textView.setText(iconText);
            textView.setTextColor(colorRes);
            textView.setTextSize(size);
            return textView;
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            textDrawable.setText(iconText);
            textDrawable.setTextSize(size);
            textDrawable.setTextColor(colorRes);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        } else return null;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @param size FontAwesome icon size
     * @return returns a drawable with icon
     * @deprecated use {@link DrawableBuilder().#build()} instead
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated
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
     * @deprecated use {@link DrawableBuilder().#build()} instead
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated
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
     * @deprecated use {@link DrawableBuilder().#build()} instead
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated
    public static TextDrawable getFontIcon(Context context, String text, float size, int colorRes) {
        TextDrawable textDrawable = new TextDrawable(context);
        textDrawable.setTypeface(FontAwesome.getTypeface(context));
        textDrawable.setText(text);
        textDrawable.setTextSize(size);
        textDrawable.setTextColor(colorRes);
        return textDrawable;
    }

    /**
     * Build Drawables with FontAwesome Icons in it
     */
    /* DrawableBuilder class to build a Drawable with FontAwesome Icon init */
    public static class DrawableBuilder {

        /* FontAwesome icon special character */
        String iconText;

        /* icon color */
        int colorRes;

        /* icon size */
        float iconSize;

        /* context */
        Context context;


        /**
         * @param context context passes
         */
        public DrawableBuilder(Context context) {
            this.context = context;
        }

        /**
         * @param iconText FontAwesome icon text
         */
        public DrawableBuilder icon(String iconText) {
            this.iconText = iconText;
            return this;
        }

        /**
         * @param colorRes color resource
         */
        public DrawableBuilder color(int colorRes) {
            this.colorRes = colorRes;
            return this;
        }

        /**
         * @param iconSize FontAwesome icon size
         */
        public DrawableBuilder iconSize(float iconSize) {
            this.iconSize = iconSize;
            return this;
        }

        /**
         * @return returns a drawable with set properties
         */
        public TextDrawable build(){
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            if (colorRes != 0)
                textDrawable.setTextColor(ContextCompat.getColor(context,colorRes));
            if (iconSize != 0)
                textDrawable.setTextSize(iconSize);
            if (iconText != null)
                textDrawable.setText(iconText);
            return textDrawable;
        }

    }


    /**
     * Build Strings with FontAwesome Icons in it
     */
    /* StringBuilder class to build a Strings with FontAwesome Icon init */
    public static class StringBuilder {

        /* FontAwesome icon special character */
        String iconText;

        /* context */
        Context context;

        /**
         * @param context context passed
         */
        public StringBuilder(Context context){
            this.context = context;
        }

        /**
         * @param iconText FontAwesome icon text
         */
        public StringBuilder icon(String iconText) {
            this.iconText = iconText;
            return this;
        }

        /**
         * @return returns a string with FontAwesome icon
         */
        public SpannableStringBuilder build(){
            SpannableStringBuilder builder = new SpannableStringBuilder(iconText);
            builder.setSpan(
                            new CustomTypefaceSpan(
                                    FontAwesome.getTypeface(context)
                            ),
                            0,
                            iconText.length(),
                            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
                    );
            return builder;
        }

    }


}
