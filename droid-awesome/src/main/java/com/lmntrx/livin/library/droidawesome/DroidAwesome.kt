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
import android.support.v4.content.ContextCompat
import android.text.Layout
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.util.TypedValue
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/***
 * Created by livin on 28/11/16.
 */

/**
 * DroidAwesome class contains static methods used to set FontAwesome icon to any native View (that supports
 * text or drawable) or a MenuItem
 */
object DroidAwesome {

    /**
     * @param context context passed
     * *
     * @param view view instance to which icon is applied. It can be an instance of
     * *             a TextView or an ImageView
     * *
     * @param iconText FontAwesome icon text
     * *
     * @return returns modified view, returns null if the view is incompatible
     * *
     */
    /* Set TypeFace to a View */
    @Deprecated("use StringBuilder.build() or DrawableBuilder.build() instead")
    fun setFontIcon(context: Context, view: View, iconText: String): View? {
        if (view is TextView) {
            val textView = view
            textView.typeface = FontAwesome.getTypeface(context)
            textView.text = iconText
            return textView
        } else if (view is ImageView) {
            val imageView = view
            val textDrawable = TextDrawable(context)
            textDrawable.text = iconText
            textDrawable.typeface = FontAwesome.getTypeface(context)
            imageView.setImageDrawable(textDrawable)
            return imageView
        } else
            return null
    }

    /**
     * @param context context passed
     * *
     * @param view view instance to which icon is applied. It can be an instance of
     * *             a TextView or an ImageView
     * *
     * @param iconText FontAwesome icon text
     * *
     * @param size icon size
     * *
     * @return returns modified view, returns null if the view is incompatible
     * *
     */
    /* Set TypeFace to a View */
    @Deprecated("use StringBuilder.build() or DrawableBuilder.build() instead")
    fun setFontIcon(context: Context, view: View, iconText: String, size: Float): View? {
        if (view is TextView) {
            val textView = view
            textView.typeface = FontAwesome.getTypeface(context)
            textView.text = iconText
            textView.textSize = size
            return textView
        } else if (view is ImageView) {
            val imageView = view
            val textDrawable = TextDrawable(context)
            textDrawable.text = iconText
            textDrawable.typeface = FontAwesome.getTypeface(context)
            textDrawable.textSize = size
            imageView.setImageDrawable(textDrawable)
            return imageView
        } else
            return null
    }

    /**
     * @param context context passed
     * *
     * @param view view instance to which icon is applied. It can be an instance of
     * *             a TextView or an ImageView
     * *
     * @param iconText FontAwesome icon text
     * *
     * @param size icon size
     * *
     * @param colorRes color resource
     * *
     * @return returns modified view, returns null if the view is incompatible
     * *
     */
    /* Set TypeFace to a View */
    @Deprecated("use StringBuilder.build() or DrawableBuilder.build() instead")
    fun setFontIcon(context: Context, view: View, iconText: String, size: Float, colorRes: Int): View? {
        if (view is TextView) {
            val textView = view
            textView.typeface = FontAwesome.getTypeface(context)
            textView.text = iconText
            textView.setTextColor(colorRes)
            textView.textSize = size
            return textView
        } else if (view is ImageView) {
            val imageView = view
            val textDrawable = TextDrawable(context)
            textDrawable.typeface = FontAwesome.getTypeface(context)
            textDrawable.text = iconText
            textDrawable.textSize = size
            textDrawable.setTextColor(colorRes)
            imageView.setImageDrawable(textDrawable)
            return imageView
        } else
            return null
    }

    /**
     * @param context context passes
     * *
     * @param text FontAwesome icon text
     * *
     * @param size FontAwesome icon size
     * *
     * @return returns a drawable with icon
     * *
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated("use DrawableBuilder.build() instead")
    fun getFontIcon(context: Context, text: String, size: Float): TextDrawable {
        val textDrawable = TextDrawable(context)
        textDrawable.typeface = FontAwesome.getTypeface(context)
        textDrawable.text = text
        textDrawable.textSize = size
        return textDrawable
    }

    /**
     * @param context context passes
     * *
     * @param text FontAwesome icon text
     * *
     * @return returns a drawable with icon
     * *
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated("use DrawableBuilder.build() instead")
    fun getFontIcon(context: Context, text: String): TextDrawable {
        val icon = TextDrawable(context)
        icon.typeface = FontAwesome.getTypeface(context)
        icon.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20f)
        icon.setTextAlign(Layout.Alignment.ALIGN_CENTER)
        icon.setTextColor(ContextCompat.getColor(context, android.R.color.white))
        icon.text = text
        return icon
    }

    /**
     * @param context context passes
     * *
     * @param text FontAwesome icon text
     * *
     * @param colorRes color resource
     * *
     * @param size FontAwesome icon size
     * *
     * @return returns a drawable with icon
     * *
     */
    /* Get a drawable with icon in it. Useful for MenuItems */
    @Deprecated("use DrawableBuilder.build() instead")
    fun getFontIcon(context: Context, text: String, size: Float, colorRes: Int): TextDrawable {
        val textDrawable = TextDrawable(context)
        textDrawable.typeface = FontAwesome.getTypeface(context)
        textDrawable.text = text
        textDrawable.textSize = size
        textDrawable.setTextColor(colorRes)
        return textDrawable
    }

    /**
     * Build Drawables with FontAwesome Icons in it
     */
    /* DrawableBuilder class to build a Drawable with FontAwesome Icon init */
    class DrawableBuilder
    /**
     * @param context context passes
     */
    (/* context */
            private val context: Context) {

        /* FontAwesome icon special character */
        private var iconText: String? = null

        /* icon color */
        private var colorRes: Int = 0

        /* icon size */
        private var iconSize: Float = 0.toFloat()

        /**
         * @param iconText FontAwesome icon text
         * *
         * @return returns DrawableBuilder instance
         */
        fun icon(iconText: String): DrawableBuilder {
            this.iconText = iconText
            return this
        }

        /**
         * @param colorRes color resource
         * *
         * @return returns DrawableBuilder instance
         */
        fun color(colorRes: Int): DrawableBuilder {
            this.colorRes = colorRes
            return this
        }

        /**
         * @param iconSize FontAwesome icon size
         * *
         * @return returns DrawableBuilder instance
         */
        fun size(iconSize: Float): DrawableBuilder {
            this.iconSize = iconSize
            return this
        }

        /**
         * @return returns a drawable with set properties
         */
        fun build(): TextDrawable {
            val textDrawable = TextDrawable(context)
            textDrawable.typeface = FontAwesome.getTypeface(context)
            if (colorRes != 0)
                textDrawable.setTextColor(ContextCompat.getColor(context, colorRes))
            if (iconSize != 0f)
                textDrawable.setTextSize(TypedValue.COMPLEX_UNIT_SP, iconSize)
            if (iconText != null)
                textDrawable.text = iconText
            return textDrawable
        }

    }


    /**
     * Build Strings with FontAwesome Icons in it
     */
    /* StringBuilder class to build a Strings with FontAwesome Icon init */
    class StringBuilder
    /**
     * @param context context passed
     */
    (/* context */
            private val context: Context) {

        /* FontAwesome icon special character */
        private var iconText: String? = null

        /**
         * @param iconText FontAwesome icon text
         * *
         * @return returns StringBuilder instance
         */
        fun icon(iconText: String): StringBuilder {
            this.iconText = iconText
            return this
        }

        /**
         * @return returns a string with FontAwesome icon
         */
        fun build(): SpannableStringBuilder {
            val builder = SpannableStringBuilder(iconText)
            builder.setSpan(
                    CustomTypefaceSpan(
                            FontAwesome.getTypeface(context)
                    ),
                    0,
                    iconText!!.length,
                    Spanned.SPAN_EXCLUSIVE_INCLUSIVE
            )
            return builder
        }

    }

}
