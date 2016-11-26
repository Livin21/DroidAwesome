package com.lmntrx.livin.library.droidawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeToggleButton extends ToggleButton {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeToggleButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeToggleButton(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }
}
