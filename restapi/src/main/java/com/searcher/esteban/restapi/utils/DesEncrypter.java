package com.searcher.esteban.restapi.utils;

/**
 * Created by ealcalde on 16/06/2015.
 */

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class DesEncrypter {
    private static final String ERROR_MSG = "<Error>66</Error><TextoAviso>Error en servicio SOAP</TextoAviso>";
    @NonNull
    private static String algorithm = "DESede/CBC/PKCS5Padding";
    Cipher dcipher;
    Cipher ecipher;

    DesEncrypter(SecretKey paramSecretKey) {
        try {
            IvParameterSpec localIvParameterSpec = new IvParameterSpec(getIvBytes());
            this.ecipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            this.dcipher = Cipher.getInstance(algorithm);
            try {
                this.ecipher.init(1, paramSecretKey, localIvParameterSpec);
                this.dcipher.init(2, paramSecretKey, localIvParameterSpec);
            } catch (InvalidAlgorithmParameterException exception) {
                exception.printStackTrace();
            }
        } catch (@NonNull NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException exception) {
            exception.printStackTrace();
        }
    }

    @NonNull
    private byte[] getIvBytes() {
        return new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    @NonNull
    public String decrypt(@NonNull String paramString) {
        try {
            return new String(this.dcipher.doFinal(Base64.decode(paramString.getBytes(), 0)), "UTF-8");
        } catch (@NonNull BadPaddingException | IllegalBlockSizeException | UnsupportedEncodingException exception) {
            exception.printStackTrace();
            return ERROR_MSG;
        }
    }

    @Nullable
    public String encrypt(@NonNull String paramString) {
        try {
            return new String(Base64.encode(this.ecipher.doFinal(paramString.getBytes("ASCII")), 0)).replaceAll("\n", "");
        } catch (UnsupportedEncodingException | IllegalBlockSizeException | BadPaddingException exception) {
            return null;
        }
    }
}