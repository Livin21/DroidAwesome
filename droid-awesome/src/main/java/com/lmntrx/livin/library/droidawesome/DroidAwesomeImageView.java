package com.lmntrx.livin.library.droidawesome;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Dimension;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeImageView extends ImageView {
    public DroidAwesomeImageView(Context context) {
        super(context);
        init(context,null,0,0);
    }

    public DroidAwesomeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0,0);
    }

    public DroidAwesomeImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,defStyleAttr,0);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs,defStyleAttr,defStyleRes);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.DroidAwesomeTextDrawable,defStyleAttr,defStyleRes);
        try{
            String text = typedArray.getString(R.styleable.DroidAwesomeTextDrawable_text);
            Float textSize = typedArray.getDimension(R.styleable.DroidAwesomeTextDrawable_textSize,14);
            int textColor = typedArray.getColor(R.styleable.DroidAwesomeTextDrawable_textColor, 0);
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
