package ucc.itics.tesoem.edu.proyecto2ucc1414;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CrearActivity extends AppCompatActivity {
    EditText txtcolor;
    Button btnagregar;
    ArrayList<String> agregarr=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
        txtcolor = (EditText)findViewById(R.id.txtcolor);
        btnagregar=(Button)findViewById(R.id.add);
    }
    public void add(View v){
        String ingres = txtcolor.getText().toString();
        if(agregarr.contains((ingres))){
            Toast.makeText(this,"Favor de llenar bien el color",Toast.LENGTH_LONG).show();
        }else{
            Add.agregar(txtcolor.getText().toString());
            txtcolor.setText("");
            Toast.makeText(getApplicationContext(),"Color agregado"+ingres,Toast.LENGTH_LONG).show();
        }
    }
    public void cargapantallaregresarmenu(View v){
        Intent regresamenu=new Intent(this,MainActivity.class);
        startActivity(regresamenu);
        finish();
    }
}
