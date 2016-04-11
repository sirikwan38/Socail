package ice_pbru.khamhor.sirikwan.social;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    //Explict
    private Button button;
    private ListView social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind wiget

        bindWidget();

        buttonController();

        creatListView();


    }//Main Method

    private void creatListView() {
        final int[] intsIcon = {R.drawable.b0, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,
                R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13,
                R.drawable.b14, R.drawable.b15};


        final String[] titleStrings = new String[20];
        titleStrings[0] = "between";
        titleStrings[1] = "facebook";
        titleStrings[2] = "hangout";
        titleStrings[3] = "instagram";
        titleStrings[4] = "hi5";
        titleStrings[5] = "kakao";
        titleStrings[6] = "line";
        titleStrings[7] = "meaochat";
        titleStrings[8] = "linetv";
        titleStrings[9] = "messenger";
        titleStrings[10] = "pinterest";
        titleStrings[11] = "skype";
        titleStrings[12] = "snapchat";
        titleStrings[13] = "socailcam";
        titleStrings[14] = "wechat";




        String[] deStrings = getResources().getStringArray(R.array.detail_shot);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intsIcon, titleStrings, deStrings);
        social.setAdapter(myAdapter);


    }//creatListView

    private void buttonController() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://sirikwanoumm.wordpress.com/"));
                startActivity(intent);
            }
        });


    }

    private void bindWidget() {
        button = (Button) findViewById(R.id.button);
        social = (ListView) findViewById(R.id.listView);
    }//bindwiget


}//Main Class
