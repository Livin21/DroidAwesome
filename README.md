# ![icon-96x96.png](https://s18.postimg.org/tboj9r74p/icon_96x96.png) DroidAwesome
A library to display FontAwesome Icons in any View or a MenuItem

[ ![Download](https://api.bintray.com/packages/lmntrx-tech/DroidAwesome/droid-awesome/images/download.svg) ](https://bintray.com/lmntrx-tech/DroidAwesome/droid-awesome/_latestVersion) [![](https://jitpack.io/v/Livin21/DroidAwesome.svg)](https://jitpack.io/#Livin21/DroidAwesome) [![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/Livin21/droidawesome) [![TravisCI](https://api.travis-ci.org/Livin21/DroidAwesome.svg?branch=master)](https://travis-ci.org/Livin21/DroidAwesome) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-DroidAwesome-yellowgreen.svg?style=flat)](http://android-arsenal.com/details/1/4895) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/5f09cf084d7e4957b75fc8508b2c8da9)](https://www.codacy.com/app/livinmathew99/DroidAwesome?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Livin21/DroidAwesome&amp;utm_campaign=Badge_Grade)

## Views Supported: ##
* TextView
* AutoComplete TextView
* EditText
* Switch
* CheckBox
* Radio Button
* Button
* Toggle Button
* ImageView
* ImageButton
* FloatingActionButton
* MenuItem

## Screenshot ##
![Screenshot_1480330061.png](https://s16.postimg.org/63vrfifdh/Screenshot_1480330061.png) ![Screenshot_1480244308.png](https://s21.postimg.org/4mk08gn93/Screenshot_1480244308.png)

## Gradle Setup ##
Add the following code snippet to module/build.gradle
```gradle
dependencies {
    compile 'com.lmntrx.livin.library.droidawesome:droid-awesome:1.1.8'
}
```


## Maven Setup ##
```xml
<dependency>
  <groupId>com.lmntrx.livin.library.droidawesome</groupId>
  <artifactId>droid-awesome</artifactId>
  <version>1.1.8</version>
  <type>pom</type>
</dependency>
```

## How to use it? ##
### Define required icons in res/values/icons.xml ###
```xml
<?xml version="1.0" encoding="utf-8"?>
  <resources>
    <string name="android_icon_font_awesome">&#xf17b;</string> //http://fontawesome.io/cheatsheet/
    <string name="not_allowed_font_awesome">&#xf05e;</string>
    <string name="fa_settings_gears">&#xf085;</string>
  </resources>
```
### Now use custom view in activity.xml ###
```xml
<com.lmntrx.livin.library.droidawesome.DroidAwesomeAutoCompleteTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="65sp"
        android:textColor="#0f0"
        android:gravity="center"
        android:text="@string/android_icon_font_awesome"/>

<com.lmntrx.livin.library.droidawesome.DroidAwesomeImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:text="@string/not_allowed_font_awesome"
        app:textColor="@color/colorAccent"
        app:textSize="38sp"/>
```
* Or in java file
```java
DroidAwesomeTextView textView = new DroidAwesomeTextView(context);
textView.setText(getString(R.string.your_icon_string));
```
Or
```java
//TextView, EditText, Button, etc.
TextView textView = new TextView(context);
textView.setText(
                new DroidAwesome.StringBuilder(this)
                        .icon(getString(R.string.android_icon_font_awesome)) //icon
                        .build()
        );

//Imageview, ImageButton, FloatingActionButton, etc.
Imageview imageView = new Imageview(context);
imageView.setImageDrawable(
                new DroidAwesome.DrawableBuilder(this)
                        .color(R.color.colorPrimaryDark) //colorRes
                        .size(75f) //dimension float (sp)
                        .icon(getString(R.string.fa_settings_gears)) //icon
                        .build()
        );
```
### To use with menu items ###
```xml
<!--XML-->
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    tools:context="com.lmntrx.livin.droidawesome.MainActivity">
    <item
        android:id="@+id/action_settings"
        android:orderInCategory="100"
        android:title="@string/action_settings"
        />
</menu>
```
```java
//Java
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    MenuItem menuItem = menu.findItem(R.id.action_settings);
    menuItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
    menuItem.setIcon(
                new DroidAwesome.DrawableBuilder(this)
                        .icon(getString(R.string.fa_settings_gears)) //icon
                        .color(R.color.colorAccent) //colorRes
                        .size(25f) //dimension float (sp)
                        .build()
        );
    return true;
}
```
### Tip: For smooth rendering in android studio one might have to include [font-awesome.ttf](https://github.com/Livin21/DroidAwesome/blob/master/droid-awesome/src/main/assets/fonts/font-awesome.ttf?raw=true) in assets/fonts/ ###
You can change font file name as follows:
```java
  DroidAwesome.setFontFileName("my-font.ttf");
``` 
Set font filename in onCreate() of your activity file

## ChangeLog ##

### 1.1.8 ###
* Minor Bug Fixes

### 1.1.7 ###
* Set Font Filename

### 1.1.6 ###
* Minor Bug Fix

### 1.1.5 ###
* Added DrawableBuilder and StringBuilder
* Deprecated setFontIcon() and getFontIcon methods

### 1.1.4 ###
* Added setIcon() method to ImageView, ImageButton, FAB

### 1.1.3 ###
* Minor Bug Fixes
* Updated build version and support library 

### 1.1.2 ###
* Minor Bug Fix

### 1.1.1 ###
* Add FontAwesome icon programmatically
* Added support for MenuItem 

### 1.1.0 ###
* Added ImageView
* Added ImageButton
* Added FloatingActionButton

### 1.0.1 ###
* Minor Bug Fix

### 1.0.0 ###
* Added custom TextView
* Added custom AutoComplete TextView
* Added custom EditText
* Added custom Button
* Added custom ToggleButton
* Added custom Switch
* Added custom CheckBox
* Added custom Radio Button

## Credits ##
Icon designed by [Aswin CJ](https://github.com/ACJLionsRoar)

[![BehanceProfile](https://s29.postimg.org/4tb0l0q9z/behance.png)](https://www.behance.net/ACJLionsRoar) [![GitHubProfile](https://s27.postimg.org/8a185gi0j/github_logo_2.png)](https://github.com/ACJLionsRoar)

## Copyright ##
```
Copyright 2016 DroidAwesome - Livin Mathew

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```