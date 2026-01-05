package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import com.onesignal.core.internal.config.InfluenceConfigModel;
import p001o.j5e;

/* loaded from: classes2.dex */
public class ExtraSupportedOutputSizeQuirk implements j5e {
    /* renamed from: e */
    public static boolean m4555e() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m4556f() {
        return m4555e();
    }

    /* renamed from: c */
    public Size[] m4557c(int i) {
        return (i == 34 && m4555e()) ? m4558d() : new Size[0];
    }

    /* renamed from: d */
    public final Size[] m4558d() {
        return new Size[]{new Size(InfluenceConfigModel.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1080), new Size(960, 720)};
    }
}
