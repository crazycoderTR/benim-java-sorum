package com.crazycoder.io;

public class VIOP implements Hisseler {
    /**
     * Hisseler asagi ve yukari yonlu hareketlilik yapar ve vadesi doldugu zaman erisim kapanir.
     * Bu da aylik olur.
     * Her firmanin VIOP uzerinde hisse senetleri aylik olarak acilir, kullanilir, kapanir ve bir sonraki ay bu sekilde devam eder.
     */
    private String hisse_ismi;
    private int ayin_gunu, kotu_haber_orani, iyi_haber_orani;
    private double aylik_min_deger, aylik_maks_deger, anlik_deger;

    public String getHisse_ismi() {
        return hisse_ismi;
    }

    public void setHisse_ismi(String hisse_ismi) {
        this.hisse_ismi = hisse_ismi;
    }

    public int getAyin_gunu() {
        return ayin_gunu;
    }

    public void setAyin_gunu(int ayin_gunu) {
        this.ayin_gunu = ayin_gunu;
    }

    public int getKotu_haber_orani() {
        return kotu_haber_orani;
    }

    public void setKotu_haber_orani(int kotu_haber_orani) {
        this.kotu_haber_orani = kotu_haber_orani;
    }

    public int getIyi_haber_orani() {
        return iyi_haber_orani;
    }

    public void setIyi_haber_orani(int iyi_haber_orani) {
        this.iyi_haber_orani = iyi_haber_orani;
    }

    public double getAylik_min_deger() {
        return aylik_min_deger;
    }

    public void setAylik_min_deger(double aylik_min_deger) {
        this.aylik_min_deger = aylik_min_deger;
    }

    public double getAylik_maks_deger() {
        return aylik_maks_deger;
    }

    public void setAylik_maks_deger(double aylik_maks_deger) {
        this.aylik_maks_deger = aylik_maks_deger;
    }

    public double getAnlik_deger() {
        return anlik_deger;
    }

    public void setAnlik_deger(double anlik_deger) {
        this.anlik_deger = anlik_deger;
    }

    @Override
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger) {
        double volatilite_degeri = this.aylik_maks_deger - this.aylik_min_deger;
        if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
            if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir hareket beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir belirsizlik beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir belirsizlik beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir hareket beklenmekte!");
            }
        } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
            if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir kesinlik beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir hareket beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir meyil beklenmekte!");
            }
        }
    }

    @Override
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int ayin_gunu) {
        double volatilite_degeri = this.aylik_maks_deger - this.aylik_min_deger;
        if (this.ayin_gunu > 1 && this.ayin_gunu < 16) {
            if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir belirsizlik beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir belirsizlik beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir hareket beklenmekte!");
                }
            } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir kesinlik beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir meyil beklenmekte!");
                }
            }
        } else if (this.ayin_gunu > 16 && this.ayin_gunu < 28) {
            if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönlü bir belirsizlik beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir belirsizlik beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir hareket beklenmekte!");
                }
            } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir hareket beklenmekte!");
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönlü bir kesinlik beklenmekte!");
                }
            }
        }
    }

    @Override
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int kotu_haber_orani, int iyi_haber_orani, int ayin_gunu) {
        double volatilite_degeri = this.aylik_maks_deger - this.aylik_min_deger;
        if (this.ayin_gunu > 1 && this.ayin_gunu < 16) {
            if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir kesinlik beklenmekte!");
                    }
                }
            } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir kesinlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                }
            }
        } else if (this.ayin_gunu > 16 && this.ayin_gunu < 28) {
            if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir kesinlik beklenmekte!");
                    }
                }
            } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
                if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir belirsizlik beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    }
                } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                    if (this.iyi_haber_orani > this.kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                    } else if (iyi_haber_orani == kotu_haber_orani) {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                    } else {
                        System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir kesinlik beklenmekte!");
                    }
                }
            }
        }
    }

    @Override
    public void tahmin(double aylik_min_deger, double aylik_maks_deger, double anlik_deger, int kotu_haber_orani, int iyi_haber_orani) {
        double volatilite_degeri = this.aylik_maks_deger - this.aylik_min_deger;
        if (this.aylik_maks_deger - (volatilite_degeri/2) > this.anlik_deger) {
            if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/4) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/4) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir kesinlik beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir kesinlik beklenmekte!");
                }
            }
        } else if (this.aylik_maks_deger - (volatilite_degeri/2) < this.anlik_deger) {
            if(this.anlik_deger - volatilite_degeri > volatilite_degeri) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir kesinlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri > volatilite_degeri/2) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir belirsizlik beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri/2) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde sabit bir hareket beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                }
            } else if(this.anlik_deger - volatilite_degeri < volatilite_degeri) {
                if (this.iyi_haber_orani > this.kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde yukarı yönde bir belirsizlik beklenmekte!");
                } else if (iyi_haber_orani == kotu_haber_orani) {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir belirsizlik beklenmekte!");
                } else {
                    System.out.println(this.hisse_ismi + " hissesinde aşağı yönde bir hareket beklenmekte!");
                }
            }
        }
    }
}
