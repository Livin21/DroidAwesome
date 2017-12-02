package com.lmntrx.livin.droidawesome

import android.content.Context
import com.lmntrx.livin.library.droidawesome.DroidAwesome

/**
 * Created by jglanz on 12/1/17.
 */

fun Context.fa(faResId:Int) = DroidAwesome.StringBuilder(this)
  .icon(getString(faResId))
  .build()

fun Context.faDrawable(faResId:Int, colorRefId:Int, size:Float) = DroidAwesome.DrawableBuilder(this)
  .icon(getString(faResId))
  .color(colorRefId)
  .size(size)
  .build()