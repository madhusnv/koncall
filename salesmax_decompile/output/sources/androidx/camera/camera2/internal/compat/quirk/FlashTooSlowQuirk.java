package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.s82;

/* loaded from: classes2.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f6069a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    /* renamed from: c */
    public static boolean m4569c() {
        Iterator it = f6069a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m4570d(s82 s82Var) {
        return m4569c() && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
