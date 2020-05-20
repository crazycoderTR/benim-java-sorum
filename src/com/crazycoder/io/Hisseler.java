package com.crazycoder.io;

public interface Hisseler {

    String yatirimci_ismi = "Mesut KILINCASLAN";

    /**
     * Her hissenin piyasa uzerinde aylik maksimum, minimum degerleri vardir. Bir de o anlik degeri vardir;
     * ki bu da kullanicinin hisseyi izledigi ana tekabul eder.
     * Bir de volatilite degeri vardir bu da o ay ki maksimum ve minimum arasindaki fark anlamina gelir.
     * Ayin kacinci gunu olduguna gore hisse uzerinde belirli tahminler yapilabiliyor.
     * Burada hazirladigimiz soyut siniftaki (aslinda interface) tum islemler piyasadaki tum hisseler icin gecerlidir ve biz VIOP'a gore ozellestirecegiz
     */

    // Hangi parametrelere gore hesaplama yapilmasi isteniyorsa ona gore yapilabilir

    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger);
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int ayin_gunu);
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int kotu_haber_orani, int iyi_haber_orani);
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int kotu_haber_orani, int iyi_haber_orani, int ayin_gunu);

}
