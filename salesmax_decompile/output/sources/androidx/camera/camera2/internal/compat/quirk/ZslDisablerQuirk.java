package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.j5e;

/* loaded from: classes2.dex */
public class ZslDisablerQuirk implements j5e {

    /* renamed from: a */
    public static final List f6088a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* renamed from: b */
    public static final List f6089b = Arrays.asList("MI 8");

    /* renamed from: c */
    public static boolean m4642c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m4643d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && m4642c(f6088a);
    }

    /* renamed from: e */
    public static boolean m4644e() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && m4642c(f6089b);
    }

    /* renamed from: f */
    public static boolean m4645f() {
        return m4643d() || m4644e();
    }
}
