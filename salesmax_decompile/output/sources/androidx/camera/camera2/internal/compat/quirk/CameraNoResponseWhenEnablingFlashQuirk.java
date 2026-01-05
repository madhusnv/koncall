package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.s82;

/* loaded from: classes2.dex */
public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f6060a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    /* renamed from: c */
    public static boolean m4529c(s82 s82Var) {
        return f6060a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
