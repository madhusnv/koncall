package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p001o.j5e;

/* loaded from: classes2.dex */
public class ImageCapturePixelHDRPlusQuirk implements j5e {

    /* renamed from: a */
    public static final List f6074a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    /* renamed from: c */
    public static boolean m4584c() {
        return f6074a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
