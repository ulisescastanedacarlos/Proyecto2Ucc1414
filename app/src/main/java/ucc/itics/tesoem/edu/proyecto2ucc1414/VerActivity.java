package ucc.itics.tesoem.edu.proyecto2ucc1414;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class VerActivity extends AppCompatActivity {
Spinner ObjetSpinner;
ArrayList<Add>colorList;
ArrayAdapter<String>Colorsito;
Button btnmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);
        btnmenu=(Button)findViewById(R.id.btnregresar);
        ObjetSpinner= findViewById(R.id.spinner);
        Colorsito=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Add.miscolores());
        colorList=new ArrayList<Add>();
        ObjetSpinner.setAdapter(Colorsito);
    }
    public void cargapantallaregresamenu2(View v){
        Intent regresamenu2=new Intent(this, MainActivity.class);
        startActivity(regresamenu2);
        finish();
    }
}
