package p001o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.view.C1907b;

/* loaded from: classes2.dex */
public class lhd extends feb {

    /* renamed from: e */
    public static final PointF f33819e = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    public final C1907b f33820b;

    /* renamed from: c */
    public Rect f33821c = null;

    /* renamed from: d */
    public Matrix f33822d;

    public lhd(C1907b c1907b) {
        this.f33820b = c1907b;
    }

    /* renamed from: b */
    public void m37222b(Size size, int i) {
        Rect rect;
        elh.m25220a();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f33821c) != null) {
                this.f33822d = this.f33820b.m4766c(size, i, rect);
                return;
            }
            this.f33822d = null;
        }
    }

    /* renamed from: c */
    public void m37223c(Rect rect) {
        m26516a(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f33821c = rect;
        }
    }
}
