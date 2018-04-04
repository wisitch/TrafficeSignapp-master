package sdu.cs58.wisit.trafficesignapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView titleTextView, detialTextView;
    ImageView signImageView;
    Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        titleTextView = findViewById(R.id.txvTitle);
        detialTextView = findViewById(R.id.txvDetial);
        signImageView = findViewById(R.id.imvSign);

        //รับข้อมูลจากการ intent ไปเเสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detialTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));


    }//end method

}//end class
