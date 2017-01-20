package es.cice.friendsdynamiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private ListView friendsLV;
    private EditText friendET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> listaInical=new ArrayList<String>();
        listaInical.add("Juan");
        listaInical.add("Manuel");
        listaInical.add("Pedro");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                android.R.id.text1,listaInical);
        friendsLV= (ListView) findViewById(R.id.friendsLV);
        friendsLV.setAdapter(adapter);
        friendET= (EditText) findViewById(R.id.newNameET);
    }

    public void addFriend(View v){
        String newFriend=friendET.getText().toString();
        adapter.add(newFriend);
        adapter.notifyDataSetChanged();
        friendET.setText("");
    }
}
