package br.com.lucasfaria.comuns.helper;

import android.util.Base64;

public class Base64Helper {

    public static String codificarBase64(String texto) {
        return Base64.encodeToString(texto.getBytes(), Base64.DEFAULT).replaceAll("(\\n|\\r)", "");
    }

    public static String decodificarBase64(String textoCodificado) {
        return String.valueOf(Base64.decode(textoCodificado, Base64.DEFAULT));
    }
}
