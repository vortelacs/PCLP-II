package com.company;

public class Consumer {
    
    private String name;
    private String adress;
    private int phone_nr;
    private int factura;


    public void set_Name(String nume) {
        name = nume;
    }

    public void set_Adress(String adr) {
        adress = adr;
    }

    public void set_Phone(int phone) {
        phone_nr = phone;
    }

    public void set_Factura(int fact) {
        factura = fact;
    }

    public String get_Name() {
        return name;
    }

    public String get_Adress() {
        return adress;
    }

    public int get_Phone() {
        return phone_nr;
    }

    public int get_Factura() {
        return factura;
    }

}
