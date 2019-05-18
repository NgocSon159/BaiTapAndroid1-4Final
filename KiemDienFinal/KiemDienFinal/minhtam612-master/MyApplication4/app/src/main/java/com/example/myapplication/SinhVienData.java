package com.example.myapplication;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SinhVienData implements Serializable {
    String MaSV;
    String MaVach;
    String HoTen;
    Date date;
    String email;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getMaVach() {
        return MaVach;
    }

    public void setMaVach(String maVach) {
        MaVach = maVach;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SinhVienData findSvData(String MaSV, List<SinhVienData> l) {
        for (int i = 0; i < l.size(); i++)
        {
            SinhVienData sv = l.get(i);
            if (MaSV.equals(sv.getMaSV()))
            {
                return sv;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        Date date = this.getDate();

        SimpleDateFormat df = new SimpleDateFormat("M/dd/yyyy");
        String formattedDate = df.format(date);

        String object = "";

        object = this.getMaSV()+
                ", "+ this.getMaVach() +
                ", "+ this.getHoTen() +
                ", "+ formattedDate +
                ", " + this.getEmail();

        return object;
    }
}
