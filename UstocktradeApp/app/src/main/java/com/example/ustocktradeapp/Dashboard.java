package com.example.ustocktradeapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Country Codes","Change Passwords","Dummy","Dummy","Dummy","Dummy","Dummy","Dummy","Dummy"};
//    int images[] = {R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(Dashboard.this,"description",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];

        MyAdapter(Context c,String title[]){
            super(c, R.layout.row, R.id.title, title);
            this.context = c;
            this.rTitle = title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);

            TextView myTitle = row.findViewById(R.id.title);


            myTitle.setText(rTitle[position]);



            return row;
        }
    }
}
