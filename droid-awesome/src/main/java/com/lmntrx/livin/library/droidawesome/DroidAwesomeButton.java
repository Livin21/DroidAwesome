package com.lmntrx.livin.library.droidawesome;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeButton extends Button {
    public DroidAwesomeButton(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }
}
