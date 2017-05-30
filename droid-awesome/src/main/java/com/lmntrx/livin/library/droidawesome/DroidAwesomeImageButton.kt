/**
 * Copyright 2016 DroidAwesome - Livin Mathew

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lmntrx.livin.library.droidawesome

import android.content.Context
import android.content.res.TypedArray
import android.os.Build
import android.support.annotation.Dimension
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.ImageButton
import android.widget.TextView

/**
 * Created by livin on 27/11/16.
 * Copyright 2016 DroidAwesome - Livin Mathew
 */

/**
 * DroidAwesomeImageButton Class. A ImageButton subclass with pre set TypeFace to FontAwesome
 */
class DroidAwesomeImageButton : android.support.v7.widget.AppCompatImageButton {

    /**
     * @param context context passed
     */
    constructor(context: Context) : super(context) {
        init(context, null, 0, 0)
    }

    /**
     * @param context context passed
     * *
     * @param attrs attributes in xml
     */
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs, 0, 0)
    }

    /**
     * @param context context passed
     * *
     * @param attrs attributes in xml
     * *
     * @param defStyleAttr style attributes
     */
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs, defStyleAttr, 0)
    }

    /**
     * @param context context passed
     * *
     * @param attrs attributes in xml
     * *
     * @param defStyleAttr style attributes
     * *
     * @param defStyleRes style resource
     * * init function to avoid repetition
     */
    private fun init(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.DroidAwesomeTextDrawable, defStyleAttr, defStyleRes)
        try {
            val text = typedArray.getString(R.styleable.DroidAwesomeTextDrawable_text)
            val textSize = typedArray.getDimension(R.styleable.DroidAwesomeTextDrawable_textSize, 14f)
            val textColor = typedArray.getColor(R.styleable.DroidAwesomeTextDrawable_textColor, ContextCompat.getColor(context, R.color.primary_icon_color))
            val textDrawable = TextDrawable(context)
            textDrawable.text = text
            if (textColor != 0)
                textDrawable.setTextColor(textColor)
            else
                textDrawable.setTextColor(TextView(context).textColors)
            textDrawable.setTextSize(Dimension.SP, textSize)
            textDrawable.typeface = FontAwesome.getTypeface(context)
            setImageDrawable(textDrawable)
        } finally {
            typedArray.recycle()
        }
    }

    /**
     * @param iconText FontAwesome icon text
     * *
     * @param iconColorRes set color to icon
     */
    fun setIcon(iconText: String, iconColorRes: Int) {
        setIcon(iconText, 0f, iconColorRes)
    }

    /**
     * @param iconText FontAwesome icon text
     * *
     * @param iconColorRes set color to icon
     * *
     * @param iconSizeSP set icon size
     */
    @JvmOverloads fun setIcon(iconText: String, iconSizeSP: Float = 0f, iconColorRes: Int = 0) {
        val textDrawable = TextDrawable(context)
        textDrawable.text = iconText
        if (iconColorRes != 0) {
            textDrawable.setTextColor(iconColorRes)
        } else {
            textDrawable.setTextColor(TextView(context).textColors)
        }
        if (iconSizeSP != 0f) {
            textDrawable.setTextSize(TypedValue.COMPLEX_UNIT_SP, iconSizeSP)
        }
        textDrawable.typeface = FontAwesome.getTypeface(context)
        setImageDrawable(textDrawable)
    }

}
