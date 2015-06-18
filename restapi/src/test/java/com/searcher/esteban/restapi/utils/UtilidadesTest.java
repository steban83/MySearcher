package com.searcher.esteban.restapi.utils;

import android.app.Activity;

import com.searcher.esteban.restapi.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ealcalde on 16/06/2015.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = Config.NONE)
public class UtilidadesTest {
    private Activity mockActivity;


    @Test
    public void testGetLocalObject() throws Exception {
        assertEquals(Utilidades.getLocalObject(), "alutim" + Utilidades.getDateFormatted() + "searcher");
    }

    @Test
    public void testGetEncryptLocalObject() throws Exception {

        String encondeObjet = Utilidades.getEncryptLocalObject(mockActivity);
        System.out.print(encondeObjet);
        assertNotNull(encondeObjet);
    }
}
