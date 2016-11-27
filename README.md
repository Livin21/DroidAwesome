# [![icon-96x96.png](https://s18.postimg.org/tboj9r74p/icon_96x96.png)](https://postimg.org/image/efq025vpx/) DroidAwesome
Custom Views that support FontAwesome directly

[ ![Download](https://api.bintray.com/packages/lmntrx-tech/DroidAwesome/droid-awesome/images/download.svg) ](https://bintray.com/lmntrx-tech/DroidAwesome/droid-awesome/_latestVersion) [ ![Download](https://jitpack.io/v/Livin21/DroidAwesome.svg "jitpack.io") ](https://jitpack.io/#Livin21/DroidAwesome/v1.1.0) [![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/Livin21/droidawesome)

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

## Screenshot ##
[![Screenshot_1480200614.png](https://s22.postimg.org/sdpaqnqyp/Screenshot_1480200614.png)](https://postimg.org/image/mpizzrmm5/) [![Screenshot_1480244308.png](https://s21.postimg.org/4mk08gn93/Screenshot_1480244308.png)](https://postimg.org/image/nrn9i81wz/)

## Gradle Setup ##
Add the following code snippet to module/build.gradle
```
dependencies {
    compile 'com.lmntrx.livin.library.droidawesome:droid-awesome:1.1.0'
}
```


## Maven Setup ##
```
<dependency>
  <groupId>com.lmntrx.livin.library.droidawesome</groupId>
  <artifactId>droid-awesome</artifactId>
  <version>1.1.0</version>
  <type>pom</type>
</dependency>
```

## How to use it? ##
* Define required icons in res/values/icons.xml
```
<?xml version="1.0" encoding="utf-8"?>
  <resources>
     <string name="android_icon_font_awesome">&#xf17b;</string> //http://fontawesome.io/cheatsheet/
     <string name="not_allowed_font_awesome">&#xf05e;</string>
  </resources>
```
* Now use custom view in activity.xml
```
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

### Tip: For smooth rendering in android studio one might have to include [font-awesome.ttf](https://github.com/Livin21/DroidAwesome/blob/master/droid-awesome/src/main/assets/fonts/font-awesome.ttf?raw=true) in assets/fonts/ ###

## ChangeLog ##

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