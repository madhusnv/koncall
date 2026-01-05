package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public class CaptureFailedRetryQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6128a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    /* renamed from: d */
    public static boolean m4703d() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f6128a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    /* renamed from: c */
    public int m4704c() {
        return 1;
    }
}
