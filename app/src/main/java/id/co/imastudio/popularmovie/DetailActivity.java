package id.co.imastudio.popularmovie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivDetailPoster;
    private TextView tvRating;
    private TextView tvRelease;
    private TextView tvSinopsisFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String datajudulFilm = getIntent().getStringExtra("DATA_JUDUL");
        String dataposterFilm = getIntent().getStringExtra("DATA_POSTER");
        String datasinopsisFilm = getIntent().getStringExtra("DATA_SINOPSIS");
        String dataratingFilm = getIntent().getStringExtra("DATA_RATING");
        String datareleaseFilm = getIntent().getStringExtra("DATA_RELEASE");

        initView();
        Log.d("DATA",""+datajudulFilm + dataposterFilm + datasinopsisFilm + dataratingFilm +datareleaseFilm);
        getSupportActionBar().setTitle(datajudulFilm);
        Glide.with(this)
                .load("https://image.tmdb.org/t/p/w500" + dataposterFilm)
                .into(ivDetailPoster);
        tvRating.setText(dataratingFilm);
        tvRelease.setText(datareleaseFilm);
        tvSinopsisFilm.setText(datasinopsisFilm);


    }

    private void initView() {
        ivDetailPoster = (ImageView) findViewById(R.id.ivDetailPoster);
        tvRating = (TextView) findViewById(R.id.tvRating);
        tvRelease = (TextView) findViewById(R.id.tvRelease);
        tvSinopsisFilm = (TextView) findViewById(R.id.tvSinopsisFilm);

    }
}
