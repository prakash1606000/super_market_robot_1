package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class dairy_activity extends AppCompatActivity {
    String list="";
    Button butter_buy_button,cheese_buy_button,condensed_milk_buy_button,cream_buy_button,curd_buy_button,ghee_buy_button,ice_cream_buy_button,milk_buy_button,milk_powder_buy_button,paneer_buy_button,save;
    EditText butter_quantity_button,cheese_quantity_button,condensed_milk_quantity_button,cream_quantity_button,curd_quantity_button,ghee_quantity_button,ice_cream_quantity_button,milk_quantity_button,milk_powder_quantity_button,paneer_quantity_button;
    String butter_quantity_value,cheese_quantity_value,condensed_milk_quantity_value,cream_quantity_value,curd_quantity_value,ghee_quantity_value,ice_cream_quantity_value,milk_quantity_value,milk_powder_quantity_value,paneer_quantity_value;
    String butter,cheese,condensed_milk,cream,curd,ghee,ice_cream,milk,milk_powder,paneer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy_activity);
        butter_quantity_button = (EditText) findViewById(R.id.butter_quantity);
        butter_buy_button = (Button) findViewById(R.id.butter_buy);
        cheese_quantity_button = (EditText) findViewById(R.id.cheese_quantity);
        cheese_buy_button = (Button) findViewById(R.id.cheese_buy);
        condensed_milk_quantity_button = (EditText) findViewById(R.id.condensed_milk_quantity);
        condensed_milk_buy_button = (Button) findViewById(R.id.condensed_milk_buy);
        cream_quantity_button = (EditText) findViewById(R.id.cream_quantity);
        cream_buy_button = (Button) findViewById(R.id.cream_buy);
        curd_quantity_button = (EditText) findViewById(R.id.curd_quantity);
        curd_buy_button = (Button) findViewById(R.id.curd_buy);
        ghee_quantity_button = (EditText) findViewById(R.id.ghee_quantity);
        ghee_buy_button = (Button) findViewById(R.id.ghee_buy);
        ice_cream_quantity_button = (EditText) findViewById(R.id.ice_cream_quantity);
        ice_cream_buy_button = (Button) findViewById(R.id.ice_cream_buy);
        milk_quantity_button = (EditText) findViewById(R.id.milk_quantity);
        milk_buy_button = (Button) findViewById(R.id.milk_buy);
        milk_powder_quantity_button = (EditText) findViewById(R.id.milk_powder_quantity);
        milk_powder_buy_button = (Button) findViewById(R.id.milk_powder_buy);
        paneer_quantity_button = (EditText) findViewById(R.id.paneer_quantity);
        paneer_buy_button = (Button) findViewById(R.id.paneer_buy);
        save=(Button) findViewById(R.id.returnbutton);

        butter_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butter_quantity_value = String.valueOf(butter_quantity_button.getText().toString());
                if (butter_quantity_value.length()!=0) {
                    butter = "butter";
                    String toast = String.valueOf(butter_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += butter + "-" + String.valueOf(butter_quantity_value) + ",";
                    Log.d("butter", String.valueOf(butter_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cheese_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cheese_quantity_value = String.valueOf(cheese_quantity_button.getText().toString());
                if (cheese_quantity_value.length()!=0) {
                    cheese = "cheese";
                    String toast = String.valueOf(cheese_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += cheese + "-" + String.valueOf(cheese_quantity_value) + ",";
                    Log.d("cheese", String.valueOf(cheese_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        condensed_milk_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                condensed_milk_quantity_value = String.valueOf(condensed_milk_quantity_button.getText().toString());
                if (condensed_milk_quantity_value.length()!=0) {
                    condensed_milk = "condensed_milk";
                    String toast = String.valueOf(condensed_milk_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += condensed_milk + "-" + String.valueOf(condensed_milk_quantity_value) + ",";
                    Log.d("condensed_milk", String.valueOf(condensed_milk_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cream_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cream_quantity_value = String.valueOf(cream_quantity_button.getText().toString());
                if (cream_quantity_value.length()!=0) {
                    cream = "cream";
                    String toast = String.valueOf(cream_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += cream + "-" + String.valueOf(cream_quantity_value) + ",";
                    Log.d("cream", String.valueOf(cream_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        curd_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curd_quantity_value = String.valueOf(curd_quantity_button.getText().toString());
                if (curd_quantity_value.length()!=0) {
                    curd = "curd";
                    String toast = String.valueOf(curd_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += curd + "-" + String.valueOf(curd_quantity_value) + ",";
                    Log.d("curd", String.valueOf(curd_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ghee_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ghee_quantity_value = String.valueOf(ghee_quantity_button.getText().toString());
                if (ghee_quantity_value.length()!=0) {
                    ghee = "ghee";
                    String toast = String.valueOf(ghee_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += ghee + "-" + String.valueOf(ghee_quantity_value) + ",";
                    Log.d("ghee", String.valueOf(ghee_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ice_cream_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ice_cream_quantity_value = String.valueOf(ice_cream_quantity_button.getText().toString());
                if (ice_cream_quantity_value.length()!=0) {
                    ice_cream = "ice_cream";
                    String toast = String.valueOf(ice_cream_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += ice_cream + "-" + String.valueOf(ice_cream_quantity_value) + ",";
                    Log.d("ice_cream", String.valueOf(ice_cream_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        milk_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milk_quantity_value = String.valueOf(milk_quantity_button.getText().toString());
                if (milk_quantity_value.length()!=0) {
                    milk = "milk";
                    String toast = String.valueOf(milk_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += milk + "-" + String.valueOf(milk_quantity_value) + ",";
                    Log.d("milk", String.valueOf(milk_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        milk_powder_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milk_powder_quantity_value = String.valueOf(milk_powder_quantity_button.getText().toString());
                if (milk_powder_quantity_value.length()!=0) {
                    milk_powder = "milk_powder";
                    String toast = String.valueOf(milk_powder_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += milk_powder + "-" + String.valueOf(milk_powder_quantity_value) + ",";
                    Log.d("milk_powder", String.valueOf(milk_powder_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });
        paneer_buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paneer_quantity_value = String.valueOf(paneer_quantity_button.getText().toString());
                if (paneer_quantity_value.length()!=0) {
                    paneer = "paneer";
                    String toast = String.valueOf(paneer_quantity_value) + " quantity Added";
                    Toast.makeText(dairy_activity.this, toast, Toast.LENGTH_SHORT).show();
                    list += paneer + "-" + String.valueOf(paneer_quantity_value) + ",";
                    Log.d("paneer", String.valueOf(paneer_quantity_value));
                }
                else
                {
                    Toast.makeText(dairy_activity.this,"Please Enter Valid Quantity",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Log.d("logmsg",list);
        Log.d("listlen",String.valueOf(list.length()));
        /*
         */
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len=list.length();
                list = list.substring(0,len-1);
                SharedPreferences sp = getSharedPreferences("infos",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("dairylist",list);
                editor.commit();
                finish();
            }
        });



    }

}
