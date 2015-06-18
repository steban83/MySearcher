package com.searcher.esteban.restapi.utils;

import android.app.Activity;

import com.searcher.esteban.restapi.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ealcalde on 16/06/2015.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = Config.NONE)
public class EncryptionHelperTest {


    @Test
    public void testDecrypt() throws Exception {
        assertNotNull(EncryptionHelper.getInstance(new Activity()).encrypt("pepe"));
    }

    @Test
    public void testEncrypt() throws Exception {
        assertNotNull(EncryptionHelper.getInstance(new Activity()).decrypt("pepe"));
    }
}