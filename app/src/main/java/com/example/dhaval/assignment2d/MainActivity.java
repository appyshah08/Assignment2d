package com.example.dhaval.assignment2d;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt_text;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_text=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);

        bt_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // ImageSpan imageSpan=new ImageSpan(this,R.drawable.ic_launcher);

                    if(bt_text.getText().equals("Show")) {
                        textView.setVisibility(View.VISIBLE);
                        //Spannable=This is the interface for text to which markup objects can be attached and detached.
                        SpannableString spannableString = new SpannableString("ima");
                        Drawable drawable = getResources().getDrawable(R.drawable.ic_launcher);
                        //getIntrinsicWidth() gives you the width of the object.
                        //getIntrinsicHeight() gives you the height of the object.
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        //align baseline meaning the image will be aligned or surrounded by the text.
                        // A constant indicating that the bottom of this span should be aligned with the baseline of the surrounding text.
                        //spans of type SPAN_INCLUSIVE_EXCLUSIVE expand to include text inserted at their starting point but not at their ending point.
                        //setSpan(draw,start,end,flag)
                        spannableString.setSpan(new ImageSpan(drawable, ImageSpan.ALIGN_BASELINE), 0, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                        textView.setText(spannableString);
                        bt_text.setText("Hide");
                    }
                else
                    {
                        bt_text.setText("Show");
                        textView.setVisibility(View.GONE);
                    }

            }
        });
    }
}
