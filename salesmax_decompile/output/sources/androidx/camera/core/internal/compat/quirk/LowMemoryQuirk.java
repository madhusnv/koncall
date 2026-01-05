package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public class LowMemoryQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6132a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* renamed from: c */
    public static boolean m4721c() {
        return f6132a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
