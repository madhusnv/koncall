package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import i0.s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements s1 {

    /* renamed from: a */
    public static final HashSet f1831a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"));

    /* renamed from: b */
    public static boolean m602b() {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (f1831a.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        String str3 = Build.BRAND;
        if ("itel".equalsIgnoreCase(str3) && str2.toLowerCase(locale).startsWith("sp")) {
            return true;
        }
        return "HUAWEI".equalsIgnoreCase(str3) && "FIG-LX1".equalsIgnoreCase(str);
    }
}
