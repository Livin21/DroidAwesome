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

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RadioButton;

/**
 * Created by livin on 27/11/16.
 * Copyright 2016 DroidAwesome - Livin Mathew
 */

/**
 * DroidAwesomeRadioButton Class. A RadioButton subclass with pre set TypeFace to FontAwesome
 */
@SuppressWarnings("unused")
public class DroidAwesomeRadioButton extends RadioButton {

    /**
     * @param context context passed
     */
    public DroidAwesomeRadioButton(Context context) {
        super(context);
        setTypeface(FontAwesome.getTypeface(context));
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     */
    public DroidAwesomeRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontAwesome.getTypeface(context));
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     */
    public DroidAwesomeRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontAwesome.getTypeface(context));
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     * @param defStyleRes style resource
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DroidAwesomeRadioButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(FontAwesome.getTypeface(context));
    }
}
