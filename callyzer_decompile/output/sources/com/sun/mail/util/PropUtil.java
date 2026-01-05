package com.sun.mail.util;

import jakarta.mail.c0;
import java.util.Properties;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class PropUtil {
    private PropUtil() {
    }

    private static boolean getBoolean(Object obj, boolean z6) {
        if (obj != null) {
            if (obj instanceof String) {
                return z6 ? !((String) obj).equalsIgnoreCase("false") : ((String) obj).equalsIgnoreCase("true");
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return z6;
    }

    public static boolean getBooleanProperty(Properties properties, String str, boolean z6) {
        return getBoolean(getProp(properties, str), z6);
    }

    @Deprecated
    public static boolean getBooleanSessionProperty(c0 c0Var, String str, boolean z6) {
        return getBoolean(getProp(c0Var.f19287a, str), z6);
    }

    public static boolean getBooleanSystemProperty(String str, boolean z6) {
        try {
            try {
                return getBoolean(getProp(System.getProperties(), str), z6);
            } catch (SecurityException unused) {
            }
        } catch (SecurityException unused2) {
            String property = System.getProperty(str);
            return property == null ? z6 : z6 ? !property.equalsIgnoreCase("false") : property.equalsIgnoreCase("true");
        }
    }

    private static int getInt(Object obj, int i10) {
        if (obj != null) {
            if (obj instanceof String) {
                try {
                    String str = (String) obj;
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return i10;
    }

    public static int getIntProperty(Properties properties, String str, int i10) {
        return getInt(getProp(properties, str), i10);
    }

    @Deprecated
    public static int getIntSessionProperty(c0 c0Var, String str, int i10) {
        return getInt(getProp(c0Var.f19287a, str), i10);
    }

    private static Object getProp(Properties properties, String str) {
        Object obj = properties.get(str);
        return obj != null ? obj : properties.getProperty(str);
    }
}
