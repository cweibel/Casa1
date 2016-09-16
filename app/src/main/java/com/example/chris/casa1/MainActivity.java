package com.example.chris.casa1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selfDestruct(View view) {

        String host_name = "funwow";
        //TextView tvName = (TextView)findViewById(R.id.textView2);
        //tvName.setText(host_name);
    }


    public void clearAll(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        Integer newTotal = 0;
        tv_total.setText(newTotal.toString());
    }


    public void riceBall(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_riceball = (TextView)findViewById(R.id.txtRiceBall);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_riceball.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void bananaPepperSandwich(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtBananaPepperSand);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }


    public void wrap(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtWrap);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void eggplantParm(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtEggplantParm);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void rigatoni(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtRigatoni);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void sausageBananaPepperSandwich(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtSausageBananaPepperSandwich);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void sausageSandwich(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtSausageSandwich);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void twoPeppers(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtTwoPeppers);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

    public void pizza(View view) {

        TextView tv_total = (TextView)findViewById(R.id.txtTotal);
        TextView tv_item = (TextView)findViewById(R.id.txtPizza);

        Integer total = Integer.parseInt(tv_total.getText().toString());
        Integer riceball = Integer.parseInt(tv_item.getText().toString());


        Integer newTotal = total + riceball;

        tv_total.setText(newTotal.toString());
    }

}
