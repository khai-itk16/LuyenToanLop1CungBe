package com.itk16.bk.pc.luyentoanlop1cungbe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button bt_menu1;
    private Button bt_menu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt_menu1= (Button)findViewById(R.id.bt_menu1);
        bt_menu2= (Button)findViewById(R.id.bt_menu2);
        bt_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Menu.this, Menu1.class);
                startActivity(it1);
            }
        });


    }
}
