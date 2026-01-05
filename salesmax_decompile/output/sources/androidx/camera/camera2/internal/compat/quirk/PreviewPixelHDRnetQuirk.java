package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.j5e;

/* loaded from: classes2.dex */
public class PreviewPixelHDRnetQuirk implements j5e {

    /* renamed from: a */
    public static final List f6083a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* renamed from: c */
    public static boolean m4612c() {
        return "Google".equals(Build.MANUFACTURER) && f6083a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
