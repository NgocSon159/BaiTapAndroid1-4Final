package com.example.milk_tea_order;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    RadioGroup _rgroupSize = null;
    RadioButton _rbtnM = null;
    RadioButton _rbtnL = null;

    RadioGroup _rgroupHuongVi = null;
    RadioButton _rbtnItNgot = null;
    RadioButton _rbtnNgot = null;

    CheckBox _ckbMatcha = null;
    CheckBox _ckbThai = null;
    CheckBox _ckbDao = null;
    CheckBox _ckbBacHa = null;
    CheckBox _ckbDauTay = null;
    CheckBox _ckbOlong = null;
    CheckBox _ckbSocola = null;
    CheckBox _ckbVai = null;
    CheckBox _ckbKiwi = null;
    CheckBox _ckbHokkaido = null;

    CheckBox _ckbTranChau = null;
    CheckBox _ckbThach = null;
    CheckBox _ckbFlan = null;
    CheckBox _ckbCheese = null;

    Button _btnOrder = null;

    int OrderMoney = 0;

    int SizeMoney = 0;

    int ToppingMoney = 0;

    String Size = "";

    String HuongVi = "";

    String Order = "";

    String Topping = "* Topping ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _rgroupSize = findViewById(R.id.radiogroupSize);
        _rbtnM = findViewById(R.id.radiobtnMedium);
        _rbtnL = findViewById(R.id.radiobtnLarge);

        _rgroupHuongVi = findViewById(R.id.radiogroupHuongVi);
        _rbtnItNgot = findViewById(R.id.radiobtnItNgot);
        _rbtnNgot = findViewById(R.id.radiobtnNgot);

        _ckbMatcha = findViewById(R.id.ckbMatcha);
        _ckbThai = findViewById(R.id.ckbThai);
        _ckbDao = findViewById(R.id.ckbDao);
        _ckbBacHa = findViewById(R.id.ckbBacHa);
        _ckbDauTay = findViewById(R.id.ckbDauTay);
        _ckbOlong = findViewById(R.id.ckbOlong);
        _ckbSocola = findViewById(R.id.ckbSocola);
        _ckbVai = findViewById(R.id.ckbVai);
        _ckbKiwi = findViewById(R.id.ckbKiwi);
        _ckbHokkaido = findViewById(R.id.ckbHokkaido);

        _ckbTranChau = findViewById(R.id.ckbTranChau);
        _ckbThach = findViewById(R.id.ckbThach);
        _ckbFlan = findViewById(R.id.ckbFlan);
        _ckbCheese = findViewById(R.id.ckbCheese);

        _btnOrder = findViewById(R.id.btnOrder);


        // Size
        _rbtnL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    SizeMoney = 5000;
                    Size = "Size L";
                }
            }
        });

        _rbtnM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    SizeMoney = 0;
                    Size = "Size M";
                }
            }
        });

        // Huong vi
        _rbtnNgot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    HuongVi = "Vị Ngọt";
                }
            }
        });

        _rbtnItNgot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    HuongVi = "Vị Ít ngọt";
                }
            }
        });

        // Tra sua
        _ckbMatcha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 17000;
                    Order += "Trà sữa Matcha, ";
                }
                else
                {
                    OrderMoney -= 17000;
                    String Undo = "Trà sữa Matcha, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbThai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 17000;
                    Order += "Trà sữa Thái, ";
                }
                else
                {
                    OrderMoney -= 17000;
                    String Undo = "Trà sữa Thái, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbDao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 17000;
                    Order += "Trà sữa Đào, ";
                }
                else
                {
                    OrderMoney -= 17000;
                    String Undo = "Trà sữa Đào, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbBacHa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 17000;
                    Order += "Trà sữa Bạc Hà, ";
                }
                else
                {
                    OrderMoney -= 17000;
                    String Undo = "Trà sữa Bạc Hà, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbDauTay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 17000;
                    Order += "Trà sữa Dâu Tây, ";
                }
                else
                {
                    OrderMoney -= 17000;
                    String Undo = "Trà sữa Dâu Tây, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbOlong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 20000;
                    Order += "Trà sữa Olong, ";
                }
                else
                {
                    OrderMoney -= 20000;
                    String Undo = "Trà sữa Olong, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbSocola.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 20000;
                    Order += "Trà sữa Socola, ";
                }
                else
                {
                    OrderMoney -= 20000;
                    String Undo = "Trà sữa Socola, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbVai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 20000;
                    Order += "Trà sữa Vải, ";
                }
                else
                {
                    OrderMoney -= 20000;
                    String Undo = "Trà sữa Vải, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbKiwi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 20000;
                    Order += "Trà sữa Kiwi, ";
                }
                else
                {
                    OrderMoney -= 20000;
                    String Undo = "Trà sữa Kiwi, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });

        _ckbHokkaido.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    OrderMoney += 25000;
                    Order += "Trà sữa Hokkaido, ";
                }
                else
                {
                    OrderMoney -= 25000;
                    String Undo = "Trà sữa Hokkaido, ";
                    Order = Order.replace(Undo, "");
                }
            }
        });


        // Topping
        _ckbTranChau.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ToppingMoney += 2000;
                    Topping += "Trân Châu, ";
                }
                else
                {
                    ToppingMoney -= 2000;
                    String Undo = "Trân Châu, ";
                    Topping = Topping.replace(Undo, "");
                }
            }
        });

        _ckbThach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ToppingMoney += 3000;
                    Topping += "Thạch, ";
                }
                else
                {
                    ToppingMoney -= 3000;
                    String Undo = "Thạch, ";
                    Topping = Topping.replace(Undo, "");
                }
            }
        });

        _ckbFlan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ToppingMoney += 5000;
                    Topping += "Flan, ";
                }
                else
                {
                    ToppingMoney -= 5000;
                    String Undo = "Flan, ";
                    Topping = Topping.replace(Undo, "");
                }
            }
        });

        _ckbCheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ToppingMoney += 5000;
                    Topping += "Cheese, ";
                }
                else
                {
                    ToppingMoney -= 5000;
                    String Undo = "Cheese, ";
                    Topping = Topping.replace(Undo, "");
                }
            }
        });


        // Order
        _btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (OrderMoney == 0){
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn đồ uống!", Toast.LENGTH_LONG).show();
                }
                else if (_rgroupSize.getCheckedRadioButtonId() == -1)
                {
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn Size!", Toast.LENGTH_LONG).show();
                }
                else if (_rgroupHuongVi.getCheckedRadioButtonId() == -1)
                {
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn hương vị!", Toast.LENGTH_LONG).show();
                }
                else {
                    //int TongTien = OrderMoney + SizeMoney + ToppingMoney;

                    //String FormatMoney = ThousandSeparator(Double.parseDouble(String.valueOf(TongTien)));

                    String Message = "Cho tôi  " + Order + Topping + " | " + Size + " | " + HuongVi;

                    Toast.makeText(getApplicationContext(), "Vui lòng xem lại order sau đó ấn Gửi", Toast.LENGTH_SHORT).show();


                    // Send SMS via Message App
                    String phoneNumber = "0916382198";

                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:" + phoneNumber));

                    intent.putExtra("sms_body", Message);

                    startActivity(intent);
                }
            }
        });
    }

    public static String ThousandSeparator (Double d) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        formatter.applyPattern("#,###");

        return formatter.format(d);
    }
}
