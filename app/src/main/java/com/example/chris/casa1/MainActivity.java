package com.example.chris.casa1;

import android.net.Uri;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    TextView tvRiceBall,                    tvQtyRiceBall;
    TextView tvBananaPepperSand,            tvQtyBananaPepperSand;
    TextView tvWrap,                        tvQtyWrap;
    TextView tvEggplantParm,                tvQtyEggplantParm;
    TextView tvRigatoni,                    tvQtyRigatoni;
    TextView tvSausageBananaPepperSandwich, tvQtySausageBananaPepperSandwich;
    TextView tvSausageSandwich,             tvQtySausageSandwich;
    TextView tvTwoPeppers,                  tvQtyTwoPeppers;
    TextView tvPizza,                       tvQtyPizza;
    TextView tvTotal, tvTendered, tvChangeDue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRiceBall = (TextView) findViewById(R.id.txtRiceBall);
        tvQtyRiceBall = (TextView) findViewById(R.id.txtQtyRiceBall);
        tvBananaPepperSand = (TextView) findViewById(R.id.txtBananaPepperSand);
        tvQtyBananaPepperSand = (TextView) findViewById(R.id.txtQtyBananaPepperSand);
        tvWrap = (TextView) findViewById(R.id.txtWrap);
        tvQtyWrap = (TextView) findViewById(R.id.txtQtyWrap);
        tvEggplantParm = (TextView) findViewById(R.id.txtEggplantParm);
        tvQtyEggplantParm = (TextView) findViewById(R.id.txtQtyEggplantParm);
        tvRigatoni = (TextView) findViewById(R.id.txtRigatoni);
        tvQtyRigatoni = (TextView) findViewById(R.id.txtQtyRigatoni);
        tvSausageBananaPepperSandwich = (TextView) findViewById(R.id.txtSausageBananaPepperSandwich);
        tvQtySausageBananaPepperSandwich = (TextView) findViewById(R.id.txtQtySausageBananaPepperSand);
        tvSausageSandwich = (TextView) findViewById(R.id.txtSausageSandwich);
        tvQtySausageSandwich = (TextView) findViewById(R.id.txtQtySausageSand);
        tvTwoPeppers = (TextView) findViewById(R.id.txtTwoPeppers);
        tvQtyTwoPeppers = (TextView) findViewById(R.id.txtQtyTwoPeppers);
        tvPizza = (TextView) findViewById(R.id.txtPizza);
        tvQtyPizza = (TextView) findViewById(R.id.txtQtyPizza);

        tvTotal = (TextView) findViewById(R.id.txtTotal);
        tvTendered = (TextView) findViewById(R.id.txtTendered);
        tvChangeDue = (TextView) findViewById(R.id.txtChangeDue);

        tvQtyRiceBall.setFocusable(false);
        tvQtyBananaPepperSand.setFocusable(false);
        tvQtyWrap.setFocusable(false);
        tvQtyEggplantParm.setFocusable(false);
        tvQtyRigatoni.setFocusable(false);
        tvQtySausageBananaPepperSandwich.setFocusable(false);
        tvQtySausageSandwich.setFocusable(false);
        tvQtyTwoPeppers.setFocusable(false);
        tvQtyPizza.setFocusable(false);

        tvTotal.setFocusable(false);
        tvChangeDue.setFocusable(false);

        tvTendered.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculateChangeDue();
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void selfDestruct(View view) {

        String host_name = "funwow";
        //TextView tvName = (TextView)findViewById(R.id.textView2);
        //tvName.setText(host_name);
    }

    public void clearAll(View view) {

        String newTotal = "0";

        tvQtyRiceBall.setText(newTotal);
        tvQtyBananaPepperSand.setText(newTotal);
        tvQtyWrap.setText(newTotal);
        tvQtyEggplantParm.setText(newTotal);
        tvQtyRigatoni.setText(newTotal);
        tvQtySausageBananaPepperSandwich.setText(newTotal);
        tvQtySausageSandwich.setText(newTotal);
        tvQtyTwoPeppers.setText(newTotal);
        tvQtyPizza.setText(newTotal);
        tvTotal.setText(newTotal);
        tvTendered.setText("");
        tvChangeDue.setText(newTotal);

        tvRiceBall.requestFocus();

    }

    public void calculateChangeDue() {


        try {
            Integer total = Integer.parseInt(tvTotal.getText().toString());
            Integer tendered = Integer.parseInt(tvTendered.getText().toString());

            Integer changeDue = tendered - total;
            tvChangeDue.setText(changeDue.toString());

        }
        catch(Exception e){
            Integer changeDue = 0;
            tvChangeDue.setText(changeDue.toString());
        }

    }

    public void addToBalance(Integer price) {
        Integer total = Integer.parseInt(tvTotal.getText().toString());
        Integer newTotal = total + price;

        tvTotal.setText(newTotal.toString());

    }

    public void riceBall(View view) {

        Integer quantity = Integer.parseInt(tvQtyRiceBall.getText().toString()) + 1;
        tvQtyRiceBall.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvRiceBall.getText().toString()));
    }

    public void bananaPepperSandwich(View view) {
        Integer quantity = Integer.parseInt(tvQtyBananaPepperSand.getText().toString()) + 1;
        tvQtyBananaPepperSand.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvBananaPepperSand.getText().toString()));
    }


    public void wrap(View view) {

        Integer quantity = Integer.parseInt(tvQtyWrap.getText().toString()) + 1;
        tvQtyWrap.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvWrap.getText().toString()));

    }

    public void eggplantParm(View view) {

        Integer quantity = Integer.parseInt(tvQtyEggplantParm.getText().toString()) + 1;
        tvQtyEggplantParm.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvEggplantParm.getText().toString()));

    }

    public void rigatoni(View view) {
        Integer quantity = Integer.parseInt(tvQtyRigatoni.getText().toString()) + 1;
        tvQtyRigatoni.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvRigatoni.getText().toString()));
    }

    public void sausageBananaPepperSandwich(View view) {
        Integer quantity = Integer.parseInt(tvQtySausageBananaPepperSandwich.getText().toString()) + 1;
        tvQtySausageBananaPepperSandwich.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvSausageBananaPepperSandwich.getText().toString()));

    }

    public void sausageSandwich(View view) {
        Integer quantity = Integer.parseInt(tvQtySausageSandwich.getText().toString()) + 1;
        tvQtySausageSandwich.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvSausageSandwich.getText().toString()));

    }

    public void twoPeppers(View view) {
        Integer quantity = Integer.parseInt(tvQtyTwoPeppers.getText().toString()) + 1;
        tvQtyTwoPeppers.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvTwoPeppers.getText().toString()));

    }

    public void pizza(View view) {
        Integer quantity = Integer.parseInt(tvQtyPizza.getText().toString()) + 1;
        tvQtyPizza.setText(quantity.toString());

        addToBalance(Integer.parseInt(tvPizza.getText().toString()));

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.chris.casa1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.chris.casa1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
