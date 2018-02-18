package org.mips2607.dev.malistview;

import android.app.ListActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListViewActivity extends ListActivity {

    private String[] kyuList = {"blanche", "blanche-jaune", "jaune", "jaune-orange", "orange","orange-verte",
            "verte", "verte-bleue", "bleue","marron", "noire", "rouge-blanche", "rouge", "blanche"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // pour activer la flèche de navigation sur l'activity - mais ne fonctionne pas avec ListActivity
        // ActionBar actionBar = getSupportActionBar();
        // actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                kyuList);
        setListAdapter(adapter);


    }


}
