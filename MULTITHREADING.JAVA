ACTIVITY_MAIN.XML:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
xmlns:android="http://schemas.android.com/apk/res/and
roid"
xmlns:app="http://schemas.android.com/apk/resauto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<Button
android:id="@+id/button"
 
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="58dp"
android:layout_marginBottom="172dp"
android:text="Button" />
<Button
android:id="@+id/button2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="49dp"
android:layout_marginBottom="171dp"
android:text="Button" />
<ImageView
android:id="@+id/imageView"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentTop="true"
android:layout_marginStart="37dp"
android:layout_marginTop="159dp"
tools:srcCompat="@tools:sample/avatars" />
<ImageView
android:id="@+id/imageView2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentTop="true"
android:layout_alignParentEnd="true"
android:layout_marginTop="163dp"
android:layout_marginEnd="52dp"
tools:srcCompat="@tools:sample/avatars" />
</RelativeLayout>
MAINACTIVITY.JAVA:
package com.example.multithreadingpavi;
import androidx.appcompat.app.AppCompatActivity;
 
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle
savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ImageView img = (ImageView)
findViewById(R.id.imageView);
Button click= (Button)
findViewById(R.id.button);
Button click2 = (Button)
findViewById(R.id.button2);
click.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View view) {
new Thread(new Runnable() {
@Override
public void run() {
img.post(new Runnable() {
@Override
public void run() {
img.setImageResource(R.drawable.india1);
}
});
}
}).start();
}
});
click2.setOnClickListener(new
View.OnClickListener() {
@Override
public void onClick(View view) {
new Thread(new Runnable() {
@Override
public void run() {
 
img.post(new Runnable() {
@Override
public void run() {
img.setImageResource(R.drawable.india2);
}
});
}
}).start();
}
});
}
}
