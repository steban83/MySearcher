package com.searcher.esteban.restapi.utils;

/**
 * Created by ealcalde on 16/06/2015.
 */

import android.content.Context;
import android.util.Log;

import com.searcher.esteban.restapi.R;

import java.io.IOException;
import java.io.InputStream;

import javax.crypto.spec.SecretKeySpec;

public class EncryptionHelper {
    private static final String LOG_TAG = "EncryptionHelper";
    private static Context context;
    private static EncryptionHelper eh;
    private static byte[] key;
    private DesEncrypter des;

    public EncryptionHelper(Context paramContext) {
        context = paramContext;
        try {
            getKey();
            this.des = new DesEncrypter(new SecretKeySpec(key, "DESede"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static EncryptionHelper getInstance(Context paramContext) {
        if (eh == null) {
            eh = new EncryptionHelper(paramContext);
        }
        return eh;
    }


    private void getKey()
            throws IOException {
        try {
            InputStream localInputStream = context.getResources().openRawResource(R.raw.des);
            byte[] arrayOfByte = new byte[localInputStream.available()];
            localInputStream.read(arrayOfByte);
            localInputStream.close();
            key = arrayOfByte;
            Log.d("EncryptionHelper.getKey", "key = " + key.toString());
            return;
        } catch (IOException localIOException) {
            Log.e("EncryptionHelper.getKey", "IO error", localIOException);
            throw localIOException;
        }
    }


    public String decrypt(String paramString) {
        String str = "";
        if (paramString != null) {

            str = this.des.decrypt(paramString);
        }
        return str;
    }

    public String encrypt(String paramString) {
        String str = "";
        if (paramString != null) {
            str = this.des.encrypt(paramString);
        }
        return str;
    }
}