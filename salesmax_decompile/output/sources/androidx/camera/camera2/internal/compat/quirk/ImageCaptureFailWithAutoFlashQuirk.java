package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements j5e {

    /* renamed from: a */
    public static final List f6070a = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: c */
    public static boolean m4571c(s82 s82Var) {
        return f6070a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
