package com.example.mahe.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.*;

public class MainActivity extends AppCompatActivity {
    int qty=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        display(qty);
        displayPrice(qty*5);
    }

    private void display(int num){
        TextView quantityTextView= (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(" "+num);
    }

    private void displayPrice(int num){
        TextView priceTextView= (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(num));
    }

    public void increment(View view){
        qty++;
        display(qty);
    }

    public void decrement(View view){
        if(qty==0){
            qty=0;
        }
        else{
            qty--;
        }
        display(qty);
    }
}
