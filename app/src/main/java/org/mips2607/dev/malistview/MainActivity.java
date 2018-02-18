package org.mips2607.dev.malistview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(android.view.View v) {

        // Solution 1 pour récupérer le texte d'une zone de saisie
        //EditText editTxtPwd = findViewById(R.id.editText);
        //String strPwd = (editTxtPwd.getText()).toString();

        // Solution 2 pour réupérer le texte d'une zone de saisie
        String strPwd = ((EditText) (findViewById(R.id.editText))).getText().toString();

        // Exemple de comparaison de chaine de caractères
        if (strPwd.equals("1234")) {
            // Exemple d'utilisation d'un Toast
            Toast.makeText(getApplicationContext(), "Mot de Passe Correct!!",
                    Toast.LENGTH_LONG).show();
            // Lancement de la seconde activity
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Mauvais mot de passe!!",
                    Toast.LENGTH_LONG).show();
        }

    }
}
