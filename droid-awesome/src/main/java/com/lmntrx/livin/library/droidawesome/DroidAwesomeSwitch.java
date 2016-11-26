package com.lmntrx.livin.library.droidawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Switch;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeSwitch extends Switch {
    public DroidAwesomeSwitch(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeSwitch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }
}
