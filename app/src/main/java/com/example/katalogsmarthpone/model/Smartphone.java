package com.example.katalogsmarthpone.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class Smartphone {
    public static final String SAMSUNG="SAMSUNG";
    public static final String OPPO="OPPO";
    public static final String REALME="REALME";
    public static final String VIVO="VIVO";
    public static final String XIAOMI="XIAOMI";
    public static final String IPHONE="IPHONE";
    private String id;
    private Date tanggal;
    private String deskripsi;
    private String nilai;
    private String jenis;
    private String model;
    private String brand;

    public Smartphone() {
        this.id = UUID.randomUUID().toString();
        this.tanggal = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getModel(){
        return model;
    }
    public void setModel( String model){
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public static Smartphone fromJSONObject(JSONObject obj) {
        Smartphone tr = new Smartphone();
        try {
            tr.setId(obj.getString("id"));
            tr.setTanggal(new Date(obj.getLong("tanggal")));
            tr.setDeskripsi(obj.getString("deskripsi"));
            tr.setNilai(obj.getString("nilai"));
            tr.setJenis(obj.getString("jenis"));
            tr.setModel(obj.getString("model"));
            tr.setBrand(obj.getString("brand"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return tr;
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObj = new JSONObject();
        try {
            jsonObj.put("id",this.id);
            jsonObj.put("tanggal",this.tanggal.getTime());
            jsonObj.put("jenis",this.jenis);
            jsonObj.put("nilai",this.nilai);
            jsonObj.put("deskripsi",this.deskripsi);
            jsonObj.put("model",this.model);
            jsonObj.put("brand",this.brand);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObj;
    }
}
