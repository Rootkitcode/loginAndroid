package Rootkit.to.log_inapp.Principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import Rootkit.to.log_inapp.R;

public class PrincipalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);
        /*Creamos una variable string del titulo*/
        String Title="App final ADSI 2184110 Darwin";
        /*Pintamos el titula de la actividad*/
        this.setTitle(Title);
       }
}