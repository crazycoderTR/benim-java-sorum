package com.crazycoder.io;

public class Main {

    public static void main(String[] args) {
        VIOP hisse = new VIOP();
        hisse.setHisse_ismi("F_ENJSA0520");
        hisse.setAnlik_deger(8.08);
        hisse.setAyin_gunu(20);
        hisse.setAylik_maks_deger(8.32);
        hisse.setAylik_min_deger(8.00);
        hisse.setIyi_haber_orani(58);
        hisse.setKotu_haber_orani(42);
        hisse.tahmin(8.00, 8.32, 8.08, 20);
    }
}
