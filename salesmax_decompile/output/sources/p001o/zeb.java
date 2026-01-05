package p001o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zeb {

    /* renamed from: a */
    public static final PointF f57106a = new PointF();

    /* renamed from: a */
    public static PointF m59346a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m59347b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m59348c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m59349d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m59350e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    public static int m59351f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: g */
    public static int m59352g(float f, float f2) {
        return m59353h((int) f, (int) f2);
    }

    /* renamed from: h */
    public static int m59353h(int i, int i2) {
        return i - (i2 * m59351f(i, i2));
    }

    /* renamed from: i */
    public static void m59354i(clf clfVar, Path path) {
        path.reset();
        PointF pointFM21383b = clfVar.m21383b();
        path.moveTo(pointFM21383b.x, pointFM21383b.y);
        f57106a.set(pointFM21383b.x, pointFM21383b.y);
        for (int i = 0; i < clfVar.m21382a().size(); i++) {
            zc4 zc4Var = (zc4) clfVar.m21382a().get(i);
            PointF pointFM59172a = zc4Var.m59172a();
            PointF pointFM59173b = zc4Var.m59173b();
            PointF pointFM59174c = zc4Var.m59174c();
            PointF pointF = f57106a;
            if (pointFM59172a.equals(pointF) && pointFM59173b.equals(pointFM59174c)) {
                path.lineTo(pointFM59174c.x, pointFM59174c.y);
            } else {
                path.cubicTo(pointFM59172a.x, pointFM59172a.y, pointFM59173b.x, pointFM59173b.y, pointFM59174c.x, pointFM59174c.y);
            }
            pointF.set(pointFM59174c.x, pointFM59174c.y);
        }
        if (clfVar.m21385d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m59355j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m59356k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m59357l(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: m */
    public static void m59358m(yc9 yc9Var, int i, List list, yc9 yc9Var2, ad9 ad9Var) {
        if (yc9Var.m57514c(ad9Var.getName(), i)) {
            list.add(yc9Var2.m57512a(ad9Var.getName()).m57520i(ad9Var));
        }
    }
}
