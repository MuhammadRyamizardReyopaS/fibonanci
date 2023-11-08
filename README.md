# Tugas UTS Fibonacci
```
Muhammad Ryamizard Reyopa S
312210185

```
## 1.Buatlah kode java dan aktiviti layout seperti di bawah ini

## Activity Layout

```

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.gokilid.fibonanci">

    <EditText
        android:id="@+id/edit_max_fibonacci"
        android:layout_width="0dp"
        android:layout_height="48dp"
        android:layout_marginEnd="8dp"
        android:layout_marginTop="8dp"
        android:hint="@string/maksimum_fibonanci"
        android:inputType="number"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="MissingTranslation"/>

    <Button
        android:id="@+id/button_toast"
        android:layout_width="190dp"
        android:layout_height="48dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:background="@color/colorPrimary"
        android:onClick="showToast"
        android:textColor="@android:color/white"
        android:text="@string/button_label_Toast"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


    <Button
        android:id="@+id/button_count"
        android:layout_width="190dp"
        android:layout_height="48dp"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:background="@color/colorPrimary"
        android:onClick="countUp"
        android:text="@string/button_label_count"
        android:textColor="@android:color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="UsingOnClickInXml,VisualLintButtonSize" />

    <Button
        android:id="@+id/button_finish"
        android:layout_width="190dp"
        android:layout_height="48dp"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:background="@color/colorPrimary"
        android:onClick="back1"
        android:text="@string/button_label_finish"
        android:textColor="@android:color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="UsingOnClickInXml" />

    <TextView
        android:id="@+id/show_count"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:background="#FFFF00"
        android:gravity="center_vertical"
        android:textAlignment="center"
        android:textColor="@color/colorPrimary"
        android:textSize="160sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@id/button_count"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/button_toast"
        tools:ignore="RtlCompat" />

```

## fibonacci.java

```
package com.example.gokilid;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fibonanci extends AppCompatActivity {
    int first = 0;
    int second = 1;
    TextView Fibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);

        Fibonacci = findViewById(R.id.show_count);
        updateFibonacciText();
    }

    public void showToast(View view) {
        Toast.makeText(this, "Fibonacci", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        int next = first + second;
        first = second;
        second = next;
        updateFibonacciText();
    }

    private void updateFibonacciText() {
        String fibonacciText = Integer.toString(first);
        SpannableString spannable = new SpannableString(fibonacciText);


        int redColor = 0xFFFF0000;
        int blueColor = 0xFF0000FF;
        int greenColor = 0x008000;

        if (first % 3 == 0) {
            spannable.setSpan(new ForegroundColorSpan(redColor), 0, fibonacciText.length(), 0);
        } else if (first % 3 == 1) {
            spannable.setSpan(new ForegroundColorSpan(blueColor), 0, fibonacciText.length(), 0);
        } else {
            spannable.setSpan(new ForegroundColorSpan(greenColor), 0, fibonacciText.length(), 0);
        }

        Fibonacci.setText(spannable);
    }
}

```
## hasil
![gambar](foto1.jpeg)
![gambar](foto2.jpeg)
