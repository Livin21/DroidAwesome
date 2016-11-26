package com.lmntrx.livin.library.droidawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeAutoCompleteTextView extends AutoCompleteTextView {
    public DroidAwesomeAutoCompleteTextView(Context context) {
        super(context);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontManager.getTypeface(context));
    }

    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontManager.getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontManager.getTypeface(context));
    }

    @TargetApi(Build.VERSION_CODES.N)
    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr, defStyleRes, popupTheme);
        setTypeface(FontManager.getTypeface(context));
    }
}
