package p001o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC1893c;

/* loaded from: classes2.dex */
public abstract class lic {
    /* renamed from: j */
    public static lic m37316j(Bitmap bitmap, fm6 fm6Var, Rect rect, int i, Matrix matrix, u72 u72Var) {
        return new d51(bitmap, fm6Var, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, u72Var);
    }

    /* renamed from: k */
    public static lic m37317k(InterfaceC1893c interfaceC1893c, fm6 fm6Var, Rect rect, int i, Matrix matrix, u72 u72Var) {
        return m37318l(interfaceC1893c, fm6Var, new Size(interfaceC1893c.getWidth(), interfaceC1893c.getHeight()), rect, i, matrix, u72Var);
    }

    /* renamed from: l */
    public static lic m37318l(InterfaceC1893c interfaceC1893c, fm6 fm6Var, Size size, Rect rect, int i, Matrix matrix, u72 u72Var) {
        if (ke8.m35536i(interfaceC1893c.mo4657l())) {
            fgd.m26664h(fm6Var, "JPEG image must have Exif.");
        }
        return new d51(interfaceC1893c, fm6Var, interfaceC1893c.mo4657l(), size, rect, i, matrix, u72Var);
    }

    /* renamed from: m */
    public static lic m37319m(byte[] bArr, fm6 fm6Var, int i, Size size, Rect rect, int i2, Matrix matrix, u72 u72Var) {
        return new d51(bArr, fm6Var, i, size, rect, i2, matrix, u72Var);
    }

    /* renamed from: a */
    public abstract u72 mo22321a();

    /* renamed from: b */
    public abstract Rect mo22322b();

    /* renamed from: c */
    public abstract Object mo22323c();

    /* renamed from: d */
    public abstract fm6 mo22324d();

    /* renamed from: e */
    public abstract int mo22325e();

    /* renamed from: f */
    public abstract int mo22326f();

    /* renamed from: g */
    public abstract Matrix mo22327g();

    /* renamed from: h */
    public abstract Size mo22328h();

    /* renamed from: i */
    public boolean m37320i() {
        return wuh.m55039h(mo22322b(), mo22328h());
    }
}
