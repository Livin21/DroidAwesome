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
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Dimension;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by livin on 27/11/16.
 * Copyright 2016 DroidAwesome - Livin Mathew
 */

/**
 * DroidAwesomeImageView Class. A ImageView subclass with pre set TypeFace to FontAwesome
 */
@SuppressWarnings("unused")
public class DroidAwesomeImageView extends ImageView {

    /**
     * @param context context passed
     */
    public DroidAwesomeImageView(Context context) {
        super(context);
        init(context,null,0,0);
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     */
    public DroidAwesomeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0,0);
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     */
    public DroidAwesomeImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,defStyleAttr,0);
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     * @param defStyleRes style resource
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs,defStyleAttr,defStyleRes);
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     * @param defStyleRes style resource
     * init function to avoid repetition
     */
    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.DroidAwesomeTextDrawable,defStyleAttr,defStyleRes);
        try{
            String text = typedArray.getString(R.styleable.DroidAwesomeTextDrawable_text);
            Float textSize = typedArray.getDimension(R.styleable.DroidAwesomeTextDrawable_textSize,14);
            int textColor = typedArray.getColor(R.styleable.DroidAwesomeTextDrawable_textColor, ContextCompat.getColor(context,R.color.primary_icon_color));
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(text);
            if (textColor!=0)
                textDrawable.setTextColor(textColor);
            else
                textDrawable.setTextColor(new TextView(context).getTextColors());
            textDrawable.setTextSize(Dimension.SP,textSize);
            textDrawable.setTypeface(FontAwesome.getTypeface(context));
            setImageDrawable(textDrawable);
        }finally {
            typedArray.recycle();
        }
    }

    /**
     * @param iconText FontAwesome icon text
     */
    public void setIcon(String iconText){
        setIcon(iconText,0,0);
    }

    /**
     * @param iconText FontAwesome icon text
     * @param iconSizeSP set icon size
     */
    public void setIcon(String iconText, float iconSizeSP){
        setIcon(iconText,iconSizeSP,0);
    }

    /**
     * @param iconText FontAwesome icon text
     * @param iconColorRes set color to icon
     */
    public void setIcon(String iconText, int iconColorRes){
        setIcon(iconText,0,iconColorRes);
    }

    /**
     * @param iconText FontAwesome icon text
     * @param iconColorRes set color to icon
     * @param iconSizeSP set icon size
     */
    public void setIcon(String iconText, float iconSizeSP, int iconColorRes){
        TextDrawable textDrawable = new TextDrawable(getContext());
        textDrawable.setText(iconText);
        if (iconColorRes != 0) {
            textDrawable.setTextColor(iconColorRes);
        }else {
            textDrawable.setTextColor(new TextView(getContext()).getTextColors());
        }
        if (iconSizeSP != 0){
            textDrawable.setTextSize(TypedValue.COMPLEX_UNIT_SP,iconSizeSP);
        }
        textDrawable.setTypeface(FontAwesome.getTypeface(getContext()));
        setImageDrawable(textDrawable);
    }
}
