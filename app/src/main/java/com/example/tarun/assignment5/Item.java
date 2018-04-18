package com.example.tarun.assignment5;

public class Item {
    int idno;
    String iname3;
    String iprice3;
    String idescrip3;
    String ireview3;


    public Item(int idno, String iname3, String iprice3, String idescrip3, String ireview3) {
        this.idno = idno;
        this.iname3 = iname3;
        this.iprice3 = iprice3;
        this.idescrip3 = idescrip3;
        this.ireview3 = ireview3;
    }

    public int getIdno() {
        return idno;
    }

    public String getIname3() {
        return iname3;
    }

    public String getIprice3() {
        return iprice3;
    }

    public String getIdescrip3() {
        return idescrip3;
    }

    public String getIreview3() {
        return ireview3;
    }
}
