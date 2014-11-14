package com.example.victor.lanzarmoneda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity implements View.OnClickListener{

     Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void lanzarMoneda(){

        //Creamos Array, 1 cara, 0 cruz
        String [] moneda = {"0","1"};
        Random random = new Random();
        String aleatorio= moneda[random.nextInt(moneda.length)];
        Toast.makeText(MainActivity.this,aleatorio,Toast.LENGTH_LONG).show();

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            //Caso por cada boton que tengas
            case(R.id.button):
                lanzarMoneda();
                break;
        }
    }
}
