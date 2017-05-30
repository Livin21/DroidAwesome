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
import android.util.AttributeSet;

/***
 * Created by livin on 27/11/16.
 */

public class DroidAwesomeAutoCompleteTextView extends android.support.v7.widget.AppCompatAutoCompleteTextView {

    /**
     * @param context context passed
     */
    public DroidAwesomeAutoCompleteTextView(Context context) {
        super(context);
        setTypeface(FontAwesome.getTypeface(context));
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     */
    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontAwesome.getTypeface(context));
    }

    /**
     * @param context context passed
     * @param attrs attributes in xml
     * @param defStyleAttr style attributes
     */
    public DroidAwesomeAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontAwesome.getTypeface(context));
    }
}
