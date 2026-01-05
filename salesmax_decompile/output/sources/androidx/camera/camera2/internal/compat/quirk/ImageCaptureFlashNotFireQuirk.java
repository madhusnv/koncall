package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.s82;

/* loaded from: classes2.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f6072a = Arrays.asList("itel w6004");

    /* renamed from: b */
    public static final List f6073b = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: c */
    public static boolean m4583c(s82 s82Var) {
        List list = f6073b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f6072a.contains(str.toLowerCase(locale));
    }
}
