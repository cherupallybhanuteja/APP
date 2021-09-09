package com.example.whatsappstickersapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
ListView listview,listview1;
Button button;
int[] img={R.drawable.emoji1,R.drawable.emoji1,R.drawable.emoji1,R.drawable.emoji1,R.drawable.emoji1,R.drawable.emoji1};
String[] s={"+","+","+","+","+","+"};
//Button[] but={(Button)convertView.findViewById}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listview=findViewById(R.id.listview);
//        listview1=findViewById(R.id.listview1);
//        button=findViewById(R.id.button4);
//ArrayAdapter ar=new ArrayAdapter(this,android.R.layout.simple_list_item_1,img);
//listview.setAdapter(ar);
        CustomAdapter customAdapter=new CustomAdapter();
      CustomAdapter customAdapter1=new CustomAdapter();
        //ArrayAdapter ar=new ArrayAdapter(this,android.R.layout.simple_list_item_1,s);
        //listview1.setAdapter(ar);
//       listview.setAdapter(customAdapter1);
        listview.setAdapter(customAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              //  for(int i=0;i<img.length;i++)
                if(position==0){
                    Toast.makeText(getBaseContext(), "toast", Toast.LENGTH_SHORT).show();
                }
                    Intent intent =new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(intent);
                Toast.makeText(getBaseContext(), "toast", Toast.LENGTH_SHORT).show();
               // }
            }
        });
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                //  for(int i=0;i<img.length;i++)
//
//                Intent intent =new Intent(getApplicationContext(),MainActivity3.class);
//                startActivity(intent);
//                Toast.makeText(getBaseContext(), "toast", Toast.LENGTH_SHORT).show();
//                // }
//            }
//        });


    }

    public void tej(View v) {
            Toast.makeText(this, "Added To Whatsapp", Toast.LENGTH_SHORT).show();
        }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.row,null);

            ImageView images=view1.findViewById(R.id.imageview3);
            images.setImageResource(img[position]);

            return view1;
        }
    }
    private class CustomAdapter1 extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.row,null);
            Button plus=(Button)view1.findViewById(R.id.plus);
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "rey modda", Toast.LENGTH_SHORT).show();
                }
            });
            return view1;
        }
    }

}
