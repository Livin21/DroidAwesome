package com.lmntrx.livin.library.droidawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;


/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeTextView extends TextView {

    public DroidAwesomeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeTextView(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }
}
