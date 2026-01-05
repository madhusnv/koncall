package androidx.camera.camera2.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import i0.s1;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements s1 {

    /* renamed from: a */
    public static final PreviewUnderExposureQuirk f1844a = new PreviewUnderExposureQuirk();

    /* renamed from: b */
    public static final boolean f1845b = AbstractC5185w.m10130l(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }
}
