package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p001o.j5e;

/* loaded from: classes2.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements j5e {

    /* renamed from: a */
    public static final List f6082a = Arrays.asList("NEXUS 4");

    /* renamed from: d */
    public static boolean m4607d() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    /* renamed from: c */
    public int m4608c() {
        return 2;
    }
}
