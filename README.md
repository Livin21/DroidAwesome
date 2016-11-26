# DroidAwesome
Custom Views that support FontAwesome directly

## Views Supported: ##
* TextView
* AutoComplete TextView
* EditText
* Switch
* CheckBox
* Radio Button
* Button
* Toggle Button

## Screenshot ##
![picture alt](https://lh4.googleusercontent.com/TN3y4ipqjTAHQJKV7Ok88uobRM1QZIthvYJqgA4BQ4g9I5DsPCMmgBE38nc8Y8SSsq5YdwUqrsztcgM=w971-h654-rw "Screenshot")

## Gradle Setup ##
To be added soon

## Maven Setup ##
To be added soon

## How to use it? ##
1. Define required icons in res/values/icons.xml
```
<?xml version="1.0" encoding="utf-8"?>
  <resources>
     <string name="android_icon_font_awesome">&#xf17b;</string> // http://fontawesome.io/cheatsheet/
  </resources>
```
2. Now use custom view in activity.xml
```
<com.lmntrx.livin.library.droidawesome.DroidAwesomeAutoCompleteTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="65sp"
        android:textColor="#0f0"
        android:gravity="center"
        android:text="@string/android_icon_font_awesome"/>
```

## ChangeLog ##
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
