package p001o;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import p001o.bhf;
import p001o.d72;

/* loaded from: classes2.dex */
public abstract class chd {

    /* renamed from: a */
    public static final Rational f18188a = new Rational(16, 9);

    /* renamed from: a */
    public static boolean m21261a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    /* renamed from: b */
    public static void m21262b(Size size, bhf.C12402b c12402b) {
        if (((PreviewPixelHDRnetQuirk) zq5.m59712b(PreviewPixelHDRnetQuirk.class)) == null || m21261a(size, f18188a)) {
            return;
        }
        d72.C12801a c12801a = new d72.C12801a();
        c12801a.m22395f(CaptureRequest.TONEMAP_MODE, 2);
        c12402b.m19044g(c12801a.m22392c());
    }
}
