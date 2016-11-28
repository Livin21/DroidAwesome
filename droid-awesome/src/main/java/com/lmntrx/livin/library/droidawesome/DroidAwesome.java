package com.lmntrx.livin.library.droidawesome;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/***
 * Created by livin on 28/11/16.
 */

public class DroidAwesome {

    /**
     * @param context context passed
     * @param view view instance to which icon is applied
     * @param iconText FontAwesome icon text
     * @return returns modified view
     */
    public static View setFontIcon(Context context, View view, String iconText){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontManager.getTypeface(context));
            textView.setText(iconText);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontManager.getTypeface(context));
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @return returns modified view
     */
    public static View setFontIcon(Context context, View view, String iconText, float size){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontManager.getTypeface(context));
            textView.setText(iconText);
            textView.setTextSize(size);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setText(iconText);
            textDrawable.setTypeface(FontManager.getTypeface(context));
            textDrawable.setTextSize(size);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passed
     * @param view view instance to which icon is applied
     * @param iconText FontAwesome icon text
     * @param size icon size
     * @param colorRes color resource
     * @return returns modified view
     */
    public static View setFontIcon(Context context, View view, String iconText, float size, int colorRes){
        if (view instanceof TextView){
            TextView textView = (TextView)view;
            textView.setTypeface(FontManager.getTypeface(context));
            textView.setText(iconText);
            textView.setTextColor(colorRes);
            textView.setTextSize(size);
            return textView;
        }else if (view instanceof ImageView){
            ImageView imageView = (ImageView)view;
            TextDrawable textDrawable = new TextDrawable(context);
            textDrawable.setTypeface(FontManager.getTypeface(context));
            textDrawable.setText(iconText);
            textDrawable.setTextSize(size);
            textDrawable.setTextColor(colorRes);
            imageView.setImageDrawable(textDrawable);
            return imageView;
        }else return null;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @param size FontAwesome icon size
     * @return returns drawable
     */
    public static Drawable getFontIcon(Context context, String text, float size) {
        TextDrawable textDrawable = new TextDrawable(context);
        textDrawable.setTypeface(FontManager.getTypeface(context));
        textDrawable.setText(text);
        textDrawable.setTextSize(size);
        return textDrawable;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @return returns drawable
     */
    public static TextDrawable getFontIcon(Context context, String text) {
        TextDrawable icon = new TextDrawable(context);
        icon.setTypeface(FontManager.getTypeface(context));
        icon.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
        icon.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        icon.setTextColor(ContextCompat.getColor(context, android.R.color.white));
        icon.setText(text);
        return icon;
    }

    /**
     * @param context context passes
     * @param text FontAwesome icon text
     * @param colorRes color resource
     * @param size FontAwesome icon size
     * @return returns drawable
     */
    public static Drawable getFontIcon(Context context, String text, float size, int colorRes) {
        TextDrawable textDrawable = new TextDrawable(context);
        textDrawable.setTypeface(FontManager.getTypeface(context));
        textDrawable.setText(text);
        textDrawable.setTextSize(size);
        textDrawable.setTextColor(colorRes);
        return textDrawable;
    }
}
