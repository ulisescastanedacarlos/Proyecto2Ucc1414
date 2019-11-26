package ucc.itics.tesoem.edu.proyecto2ucc1414;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cargapantallacrear(View v){
        Intent cargapantallacrear=new Intent(this,CrearActivity.class);
        startActivity(cargapantallacrear);
        finish();
    }
    public void cargapantallaver(View v){
        Intent cargapantalaver=new Intent(this,VerActivity.class);
        startActivity(cargapantalaver);
        finish();
    }
}
