package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.s82;

/* loaded from: classes2.dex */
public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f6076a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    /* renamed from: c */
    public static boolean m4586c(s82 s82Var) {
        return f6076a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
