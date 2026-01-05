package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6071a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    /* renamed from: c */
    public static boolean m4572c() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m4573d() {
        Set set = f6071a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!set.contains(str.toLowerCase(locale)) && (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
            String str2 = Build.HARDWARE;
            if (!str2.toLowerCase(locale).startsWith("ums") && (!"itel".equalsIgnoreCase(Build.BRAND) || !str2.toLowerCase(locale).startsWith("sp"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m4574e() {
        return m4573d() || m4572c();
    }
}
