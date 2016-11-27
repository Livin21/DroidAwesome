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
import android.support.annotation.Dimension;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeFloatingActionButton extends FloatingActionButton {
    public DroidAwesomeFloatingActionButton(Context context) {
        super(context);
        init(context, null, 0);
    }

    public DroidAwesomeFloatingActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public DroidAwesomeFloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.DroidAwesomeTextDrawable,defStyleAttr,0);
        try{
            String text = typedArray.getString(R.styleable.DroidAwesomeTextDrawable_text);
            Float textSize = typedArray.getDimension(R.styleable.DroidAwesomeTextDrawable_textSize,14);
            int textColor = typedArray.getColor(R.styleable.DroidAwesomeTextDrawable_textColor, ContextCompat.getColor(context,android.R.color.primary_text_dark));
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(text);
            if (textColor!=0)
                textDrawable.setTextColor(textColor);
            else
                textDrawable.setTextColor(new TextView(context).getTextColors());
            textDrawable.setTextSize(Dimension.SP,textSize);
            textDrawable.setTypeface(FontManager.getTypeface(context));
            setImageDrawable(textDrawable);
        }finally {
            typedArray.recycle();
        }
    }
}
