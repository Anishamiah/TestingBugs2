package ahmed.niaz.chinatown_tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import ahmed.niaz.chinatown_tour.HistoryActivity;
import ahmed.niaz.chinatown_tour.R;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import ahmed.niaz.chinatown_tour.HistoryActivity;
import ahmed.niaz.chinatown_tour.HistoryLanding;
import ahmed.niaz.chinatown_tour.MainActivity;
import ahmed.niaz.chinatown_tour.R;

public class ImageButtonActivity extends AppCompatActivity {

    ImageView myImageButton_timeline;
    ImageView  myImageButton_historical_sights;
    ImageView  myImageButton_fun_Facts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.history_landing_buttons);

        myImageButton_timeline = (ImageView) findViewById( R.id.slide_image2);
        myImageButton_historical_sights = (ImageView) findViewById( R.id.slide_image2);
        myImageButton_fun_Facts = (ImageView) findViewById( R.id.slide_image2);



        myImageButton_timeline.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadMainActivity = new Intent( ImageButtonActivity.this, MainActivity.class );
                startActivity( intentLoadMainActivity );
            }
        } );
        myImageButton_historical_sights.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadHistoryActivity = new Intent( ImageButtonActivity.this, HistoryActivity.class );
                startActivity( intentLoadHistoryActivity );
            }
        } );
        myImageButton_fun_Facts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadHotelActivity = new Intent( ImageButtonActivity.this, HotelActivity.class );
                startActivity( intentLoadHotelActivity );
            }
        } );

    }
}