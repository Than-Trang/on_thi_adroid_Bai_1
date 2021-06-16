package com.example.bai2_thi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewCo;
    ArrayList<Co> coArrayList;
    Co_Adapter adapter;
    EditText editText1,editText2;
    Button button1,button2,button3;
    int ViTri =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        coArrayList = new ArrayList<>();
        coArrayList.add(new Co(R.drawable.ic_launcher_background, "title1","Mo tả"));
        coArrayList.add(new Co(R.drawable.ic_launcher_background, "title2","Mo tả"));
        coArrayList.add(new Co(R.drawable.ic_launcher_background, "title3","Mo tả"));
        coArrayList.add(new Co(R.drawable.ic_launcher_background, "title4","Mo tả"));
        adapter = new Co_Adapter(this,R.layout.dong_co,coArrayList);
        listViewCo.setAdapter(adapter);

        Xoa();
        Update();
        Them();

    }
    public void AnhXa(){
        listViewCo = (ListView) findViewById(R.id.lv1);
        editText1 = (EditText) findViewById(R.id.edt3);
        editText2 = (EditText) findViewById(R.id.edt4);
        button1 = (Button) findViewById(R.id.btn4);
        button2 = (Button) findViewById(R.id.btn5);
        button3 = (Button) findViewById(R.id.btn6);

    }
    public void Update(){
        listViewCo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ViTri= position;
                editText1.setText(coArrayList.get(position).getTitle());
                editText2.setText(coArrayList.get(position).getMoTa());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coArrayList.set(ViTri,new Co(
                        R.drawable.ic_launcher_background,
                        editText1.getText().toString(),
                        editText2.getText().toString()
                ));
            }
        });
    }
    public void Xoa(){
        listViewCo.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                coArrayList.remove(position);
                adapter.notifyDataSetChanged();

                return false;
            }
        });
    }
    public void Them (){
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coArrayList.add(new Co(
                        R.drawable.ic_launcher_background,
                        editText1.getText().toString(),
                        editText2.getText().toString()));
                adapter.notifyDataSetChanged();
            }
        });
    }
}