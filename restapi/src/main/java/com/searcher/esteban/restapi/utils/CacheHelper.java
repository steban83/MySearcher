package com.searcher.esteban.restapi.utils;

/**
 * Created by ealcalde on 16/06/2015.
 */

import android.content.Context;

import com.squareup.okhttp.Cache;

import java.io.File;
import java.io.IOException;

public class CacheHelper {

    private final Context mContext;
    private Cache mCache;

    private static CacheHelper instance;

    private static int SIZE_OF_CACHE = 10 * 1024 * 1024; //10MB

    /**
     * Singleton instantiation
     *
     * @param context
     * @return
     */
    public static CacheHelper getInstance(Context context) {
        if (instance == null)
            instance = new CacheHelper(context);

        return instance;
    }

    /**
     * ctor
     *
     * @param context
     */
    public CacheHelper(Context context) {
        this.mContext = context;
    }

    public Cache getCache() throws IOException {
        if (mCache == null) {
            File cacheDirectory = new File(mContext.getCacheDir().getAbsolutePath(), "http");
            mCache = new Cache(cacheDirectory, SIZE_OF_CACHE);
        }

        return mCache;
    }

    /**
     * Check if the key is already in the cache
     *
     * @param url
     * @return
     */
    public boolean inCache(String url) {
    /*    try {
            DiskLruCache cache = DiskLruCache.open(mCache.getDirectory(), 201105, 2, SIZE_OF_CACHE);
            cache.flush();

            String key = Util.shaBase64(url);

            DiskLruCache.Snapshot snapshot = cache.get(key);
            if (snapshot != null) {
                return true;
            } else {
                return false;
            }

        } catch (IOException e) {
            return false;
        }*/
        return false;
    }
}
