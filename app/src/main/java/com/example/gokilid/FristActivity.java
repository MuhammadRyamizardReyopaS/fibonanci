package com.example.gokilid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FristActivity extends AppCompatActivity {
    private static final string LOG_TAG = FristActivity.class.getSimpleName();
    public static  final string EXTRA_MESSAGE = "com.example.android.gokilid.Extra.Message"
            public startic final int TEXT_REQUEST =1;
    private EditText mMessageEditText;
    private TextView mReplyReadTextview;
    private Textview mReplyTextView;
    @Override
    protected void onCreate(Bundle saveIntanceState){
        super .onCreate(saveIntanceState);
        setContentView(R.layout.activity_pertama);
        mMessageEditText = findViewById(R.id.EditText_main);
        mReplyheadTextview = findViewById(R.id.Text_header_Reply);
        mReplyTextview = findViewById(R.id.text_message_reply);
        
    }
}
