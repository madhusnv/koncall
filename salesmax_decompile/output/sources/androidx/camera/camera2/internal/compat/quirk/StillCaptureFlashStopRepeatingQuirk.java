package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;
import p001o.j5e;

/* loaded from: classes2.dex */
public class StillCaptureFlashStopRepeatingQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4624c() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
