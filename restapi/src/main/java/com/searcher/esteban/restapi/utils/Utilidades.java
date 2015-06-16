package com.searcher.esteban.restapi.utils;

/**
 * Created by ealcalde on 16/06/2015.
 */

import android.content.Context;
import android.preference.PreferenceManager;

import com.searcher.esteban.restapi.model.TypeResult;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Utilidades {
    public static int findHomeinArray(ArrayList<TypeResult> paramArrayList, String paramString, Context paramContext) {
        paramString = getSettingsSharedPreferences(paramString, paramContext);
        if (paramString != null) {
            int i = 0;
            for (TypeResult typeResult : paramArrayList) {
                if (paramString.equalsIgnoreCase(typeResult.getValorParaFiltro())) {
                    return i;
                }
                i += 1;
            }
        }
        return 0;
    }


    public static String getLocalObject(String param) {
        return "alutim" + Utilidades.getDateFormatted() + "searcher";
    }

    public static int findLocationinArray(ArrayList<TypeResult> paramArrayList, String paramString, Context paramContext) {
        paramString = getSettingsSharedPreferences(paramString, paramContext);
        if (paramString != null) {
            int i = 0;
            for (TypeResult typeResult : paramArrayList) {
                if (paramString.equalsIgnoreCase(typeResult.getNombreTraducido())) {
                    return i;
                }
                i += 1;
            }
        }
        return paramArrayList.size() - 1;
    }

    public static String formatearConComaPeriodo(long paramLong, int paramInt1, int paramInt2) {
        DecimalFormat localDecimalFormat = new DecimalFormat();
        if ((localDecimalFormat instanceof DecimalFormat)) {
            ((DecimalFormat) localDecimalFormat).setMaximumFractionDigits(paramInt2);
            ((DecimalFormat) localDecimalFormat).setMinimumIntegerDigits(paramInt1);
        }
        return localDecimalFormat.format(paramLong);
    }

    public static String formatearSoloConComa(Float paramFloat, int paramInt1, int paramInt2) {
        DecimalFormat localDecimalFormat = new DecimalFormat();
        if ((localDecimalFormat instanceof DecimalFormat)) {
            ((DecimalFormat) localDecimalFormat).setMaximumFractionDigits(paramInt2);
            ((DecimalFormat) localDecimalFormat).setMinimumIntegerDigits(paramInt1);
        }
        localDecimalFormat.setGroupingUsed(false);
        return localDecimalFormat.format(paramFloat);
    }

    public static String getDateFormatted() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

 /*   public static Filter getFilter(ArrayList<Filter> paramArrayList, String paramString) {
        if (paramArrayList != null) {
            paramArrayList = paramArrayList.iterator();
            while (paramArrayList.hasNext()) {
                Filter localFilter = (Filter) paramArrayList.next();
                if (localFilter.getNombre().equals(paramString)) {
                    return localFilter;
                }
            }
        }
        return null;
    }*/

   /* public static String getNombreTraducido(ArrayList<TypeResult> paramArrayList, String paramString) {
        paramString = getSettingsSharedPreferences(paramString, paramContext);
        if (paramString != null) {
            int i = 0;
            for (TypeResult typeResult : paramArrayList) {
                if (paramString.equalsIgnoreCase(typeResult.getValorParaFiltro())) {
                    return typeResult.getNombreTraducido();
                }
            }
        }
        return "";
    }*/


    public static String getSettingsSharedPreferences(String paramString, Context paramContext) {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramString, null);
    }

    public static boolean isAllItemsChecked(boolean[] paramArrayOfBoolean) {
        boolean result = true;
        for (boolean element : paramArrayOfBoolean) {
            result &= element;
            if (!result) {
                break;
            }
        }
        return result;
    }

    public static int loadItemCheckedFilter(CharSequence[] paramArrayOfCharSequence, String paramString) {
        int i = 0;
        while (i < paramArrayOfCharSequence.length) {
            if (paramArrayOfCharSequence[i].equals(paramString)) {
                return i;
            }
            i += 1;
        }
        return -1;
    }
/*
    public static boolean[] loadItemsCheckedFilter(CharSequence[] paramArrayOfCharSequence, String paramString) {
        boolean[] arrayOfBoolean = new boolean[paramArrayOfCharSequence.length];
        paramString = paramString.split(",");
        int k = paramString.length;
        int i = 0;
        while (i < k) {
            Object localObject = paramString[i];
            int j = 0;
            while (j < paramArrayOfCharSequence.length) {
                if (paramArrayOfCharSequence[j].equals(localObject)) {
                    arrayOfBoolean[j] = true;
                }
                j += 1;
            }
            i += 1;
        }
        return arrayOfBoolean;
    }

    public static CharSequence[] loadNameItemsFilter(ArrayList<TypeResult> paramArrayList) {
        ArrayList localArrayList = new ArrayList();
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            localArrayList.add(StringEscapeUtils.unescapeHtml4(((TypeResult) paramArrayList.next()).getNombreTraducido()));
        }
        return (CharSequence[]) localArrayList.toArray(new CharSequence[localArrayList.size()]);
    }

    public static CharSequence[] loadValueItemsFilter(ArrayList<TypeResult> paramArrayList) {
        ArrayList localArrayList = new ArrayList();
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            localArrayList.add(StringEscapeUtils.unescapeHtml4(((TypeResult) paramArrayList.next()).getValorParaFiltro()));
        }
        return (CharSequence[]) localArrayList.toArray(new CharSequence[localArrayList.size()]);
    }

    public static String loadValueRangeBotoneraInFilter(String paramString, ArrayList<Filter> paramArrayList) {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            Filter localFilter = (Filter) paramArrayList.next();
            if (localFilter.getNombre().equalsIgnoreCase(paramString)) {
                return localFilter.getRango().getRangoMinimo();
            }
        }
        return "";
    }

    public static String loadValueRangeSliderInFilter(String paramString1, ArrayList<Filter> paramArrayList, String paramString2) {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            Filter localFilter = (Filter) paramArrayList.next();
            if (localFilter.getNombre().equalsIgnoreCase(paramString1)) {
                if (paramString2.equalsIgnoreCase("min")) {
                    return localFilter.getRango().getRangoMinimo();
                }
                return localFilter.getRango().getRangoMaximo();
            }
        }
        return "";
    }

    public static Number parsear(String paramString, int paramInt1, int paramInt2)
            throws ParseException {
        DecimalFormat localDecimalFormat = new DecimalFormat();
        if ((localDecimalFormat instanceof DecimalFormat)) {
            ((DecimalFormat) localDecimalFormat).setMaximumFractionDigits(paramInt2);
            ((DecimalFormat) localDecimalFormat).setMinimumIntegerDigits(paramInt1);
        }
        try {
            paramString = localDecimalFormat.parse(paramString);
            if (paramString.doubleValue() > 3.402823466385289E+038D) {
                return Float.valueOf(3.4028235E+38F);
            }
            if (paramString.doubleValue() < 0.0D) {
                return Integer.valueOf(0);
            }
        } catch (ParseException paramString) {
            throw paramString;
        }
        return paramString;
    }

    public static void putSettingsSharedPreferences(String paramString1, String paramString2, Context paramContext) {
        paramContext = (Context) PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()).edit();
        paramContext.putString(paramString1, paramString2);
        paramContext.apply();
    }

    public static boolean[] resetAllItemsCheck(boolean[] paramArrayOfBoolean) {
        int i = 0;
        while (i < paramArrayOfBoolean.length) {
            paramArrayOfBoolean[i] = false;
            i += 1;
        }
        return paramArrayOfBoolean;
    }

    public static void resetItemsCheckedList(ArrayList<Filter> paramArrayList, String paramString, Context paramContext) {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            Filter localFilter = (Filter) paramArrayList.next();
            if (localFilter.getTipo().equals(paramString)) {
                putSettingsSharedPreferences(localFilter.getTraduccionTitulo() + "itemsChecked", null, paramContext);
                putSettingsSharedPreferences(localFilter.getTraduccionTitulo() + "itemChecked", null, paramContext);
                putSettingsSharedPreferences(localFilter.getTraduccionTitulo() + "isChecked", null, paramContext);
            }
        }
    }

    public static HashMap<String, String> setCommonHeaders(Context paramContext) {
        HashMap localHashMap = new HashMap();
        localHashMap.put("Accept", "application/json");
        localHashMap.put("Mobile", "true");
        localHashMap.put("Platform", "Android");
        localHashMap.put("Vertical", "1");
        if (getSettingsSharedPreferences("idPais", paramContext) != null) {
            localHashMap.put("Country", getSettingsSharedPreferences("idPais", paramContext));
        }
        localHashMap.put("Manufacturer", Build.MANUFACTURER);
        localHashMap.put("Model", Build.MODEL);
        Object localObject = null;
        try {
            paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
            if (paramContext != null) {
                localHashMap.put("AppVersion", paramContext.versionName);
            }
            return localHashMap;
        } catch (PackageManager.NameNotFoundException paramContext) {
            for (; ; ) {
                paramContext.printStackTrace();
                paramContext = localObject;
            }
        }
    }

    public static void setValueListInFilter(String paramString1, String paramString2, ArrayList<Filter> paramArrayList) {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            Filter localFilter = (Filter) paramArrayList.next();
            if (localFilter.getNombre().equalsIgnoreCase(paramString1)) {
                localFilter.setValor(paramString2);
            }
        }
    }

    public static void setValueRangeInFilter(String paramString1, String paramString2, String paramString3, ArrayList<Filter> paramArrayList) {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
            Filter localFilter = (Filter) paramArrayList.next();
            if (localFilter.getNombre().equalsIgnoreCase(paramString1)) {
                localFilter.getRango().setRangoMinimo(paramString2);
                localFilter.getRango().setRangoMaximo(paramString3);
            }
        }
    }*/
}


