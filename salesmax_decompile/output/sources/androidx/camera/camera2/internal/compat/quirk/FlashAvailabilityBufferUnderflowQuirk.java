package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6068a = new HashSet();

    static {
        m4567c("sprd", "lemp");
        m4567c("sprd", "DM20C");
    }

    /* renamed from: c */
    public static void m4567c(String str, String str2) {
        Set set = f6068a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* renamed from: d */
    public static boolean m4568d() {
        Set set = f6068a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
