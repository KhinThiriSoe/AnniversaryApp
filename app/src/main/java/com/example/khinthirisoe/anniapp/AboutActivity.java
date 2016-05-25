package com.example.khinthirisoe.anniapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    //    http://stackoverflow.com/questions/3470042/intent-uri-to-launch-gmail-app
    public void btnGmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "khinthirisoe@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "This is my subject text");
        startActivity(Intent.createChooser(emailIntent, null));
    }

    //    http://stackoverflow.com/questions/4810803/open-facebook-page-from-android-app
    public void btnFacebook(View view) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100010460402906"));
            startActivity(intent);
        } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100010460402906")));
        }

    }

    //    http://stackoverflow.com/questions/2077008/android-intent-for-twitter-application
    public void btnTwitter(View view) {
        String url = "https://twitter.com/Khin_Thiri_Soe";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void btnLinkedin(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/khinthirisoe")));
    }

}