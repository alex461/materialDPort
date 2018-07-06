package com.example.alexander.miappalex.post.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.alexander.miappalex.R;
import com.squareup.picasso.Picasso;

public class NewPostActivity extends AppCompatActivity {

    private ImageView imgphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        imgphoto =findViewById(R.id.imgPost);
        if(getIntent().getExtras() != null){
            String photoPath = getIntent().getExtras().getString("PHOTO_PATH_TEMP");
            Picasso.with(this).load(photoPath).into(imgphoto);
        }

    }
}
