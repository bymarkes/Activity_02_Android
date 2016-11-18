package com.example.dam05.googlefamily;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.Bitmap;

public class Segona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona);

        ImageView lblImg = (ImageView) findViewById(R.id.image);
        TextView lblName = (TextView) findViewById(R.id.Name);
        TextView lblLaunch = (TextView) findViewById(R.id.Launch);
        TextView lblDesc = (TextView) findViewById(R.id.Description);
        Button readmore = (Button) findViewById(R.id.readmore);

        Bundle b = getIntent().getExtras();
        Bitmap imgBITMAP = getIntent().getParcelableExtra("Image");
        lblImg.setImageBitmap(imgBITMAP);

        lblName.setText(b.getString("Name"));
        lblLaunch.setText(b.getString("Launch"));
        lblDesc.setText(b.getString("Description"));

        readmore.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Bundle b = getIntent().getExtras();
                Uri url = Uri.parse(b.getString("Link"));
                Intent intencio = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intencio);
            }

        });
    }

}
