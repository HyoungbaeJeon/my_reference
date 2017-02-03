package com.eddie.myreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.image_settings)
    ImageView settingsImage;

    @BindView(R.id.layout_reference)
    LinearLayout referencerLayout;

    @BindView(R.id.text_hello_world1)
    TextView helloWorldText1;

    @BindView(R.id.text_hello_world2)
    TextView helloWorldText2;

    @BindView(R.id.text_hello_world3)
    TextView helloWorldText3;

    @BindView(R.id.text_hello_world4)
    TextView helloWorldText4;

    @BindView(R.id.text_hello_world5)
    TextView helloWorldText5;

    @BindView(R.id.text_hello_world6)
    TextView helloWorldText6;

    @BindView(R.id.text_hello_world7)
    TextView helloWorldText7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), helloWorldText1.getText(), Toast.LENGTH_LONG).show();
    }
}
