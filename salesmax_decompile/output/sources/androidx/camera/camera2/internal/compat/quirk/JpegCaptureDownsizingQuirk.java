package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.s82;

/* loaded from: classes2.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a */
    public static final Set f6080a = new HashSet(Arrays.asList("redmi note 8 pro"));

    /* renamed from: c */
    public static boolean m4602c(s82 s82Var) {
        return f6080a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
