package com.example.ourshop.model;

import java.io.Serializable;

/**
 * Created by Azhar Rivaldi on 22-12-2019.
 */

public class ModelWisata implements Serializable {

    private String idWisata, txtJarakWisata, txtNamaWisata, GambarWisata, KategoriWisata;

    public String getIdWisata() {
        return idWisata;
    }

    public void setIdWisata(String idWisata) {
        this.idWisata = idWisata;
    }

    public String getJarakWisata() {
        return txtJarakWisata;
    }

    public void setJarakWisata(String txtJarakWisata) {
        this.txtJarakWisata = txtJarakWisata;
    }

    public String getTxtNamaWisata() {
        return txtNamaWisata;
    }

    public void setTxtNamaWisata(String txtNamaWisata) {
        this.txtNamaWisata = txtNamaWisata;
    }

    public String getGambarWisata() {
        return GambarWisata;
    }

    public void setGambarWisata(String gambarWisata) {
        GambarWisata = gambarWisata;
    }

    public String getKategoriWisata() {
        return KategoriWisata;
    }

    public void setKategoriWisata(String kategoriWisata) {
        KategoriWisata = kategoriWisata;
    }
}
