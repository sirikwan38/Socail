package ice_pbru.khamhor.sirikwan.social;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    //Explict
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind wiget

        bindWidget();

        buttonController();


    }//Main Method

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
    }//bindwiget


}//Main Class
