package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.s82;

/* loaded from: classes2.dex */
public class ImageCaptureWashedOutImageQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f6075a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* renamed from: c */
    public static boolean m4585c(s82 s82Var) {
        return f6075a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
