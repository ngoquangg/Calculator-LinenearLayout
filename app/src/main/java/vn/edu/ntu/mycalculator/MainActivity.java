package vn.edu.ntu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget() {
        editSoA = (EditText) findViewById(R.id.edSoA);
        editSoB = (EditText) findViewById(R.id.edSoB);
        textViewKetQua = (TextView) findViewById(R.id.tvKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    //Ham xu ly
    public void XuLyCong(View v) {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int tong = a + b;
        String chuoiTong = String.valueOf(tong);
        textViewKetQua.setText("Tổng là: " + chuoiTong);
    }
    public void XuLyTru(View v) {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int hieu = a - b;
        String chuoiHieu = String.valueOf(hieu);
        textViewKetQua.setText("Hiệu là: " + chuoiHieu);
    }

    public void XuLyNhan(View v) {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int tich = a * b;
        String chuoiTich = String.valueOf(tich);
        textViewKetQua.setText("Tích là: " + chuoiTich);
    }

    public void XuLyChia(View v) {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int thuong = a / b;
        String chuoiThuong = String.valueOf(thuong);
        textViewKetQua.setText("Thương là: " + chuoiThuong);
    }
}