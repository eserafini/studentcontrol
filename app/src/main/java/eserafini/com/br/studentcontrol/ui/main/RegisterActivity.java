package eserafini.com.br.studentcontrol.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import eserafini.com.br.studentcontrol.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
