package d3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c3.C0848c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.i */
/* loaded from: classes.dex */
public final class C1555i implements g0 {

    /* renamed from: a */
    public final Path f7752a;

    /* renamed from: b */
    public RectF f7753b;

    /* renamed from: c */
    public float[] f7754c;

    /* renamed from: d */
    public Matrix f7755d;

    public C1555i(Path path) {
        this.f7752a = path;
    }

    /* renamed from: j */
    public static void m5153j(C0848c c0848c) {
        if (Float.isNaN(c0848c.f5354a) || Float.isNaN(c0848c.f5355b) || Float.isNaN(c0848c.f5356c) || Float.isNaN(c0848c.f5357d)) {
            AbstractC1558l.m5179b("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* renamed from: c */
    public final void m5154c(C0848c c0848c, float f6, float f10) {
        m5153j(c0848c);
        if (this.f7753b == null) {
            this.f7753b = new RectF();
        }
        RectF rectF = this.f7753b;
        AbstractC4154l.m8920c(rectF);
        rectF.set(c0848c.f5354a, c0848c.f5355b, c0848c.f5356c, c0848c.f5357d);
        RectF rectF2 = this.f7753b;
        AbstractC4154l.m8920c(rectF2);
        this.f7752a.addArc(rectF2, f6, f10);
    }

    /* renamed from: d */
    public final C0848c m5155d() {
        if (this.f7753b == null) {
            this.f7753b = new RectF();
        }
        RectF rectF = this.f7753b;
        AbstractC4154l.m8920c(rectF);
        this.f7752a.computeBounds(rectF, true);
        return new C0848c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: e */
    public final void m5156e(float f6, float f10) {
        this.f7752a.lineTo(f6, f10);
    }

    /* renamed from: f */
    public final boolean m5157f(g0 g0Var, g0 g0Var2, int i10) {
        Path.Op op2 = i10 == 0 ? Path.Op.DIFFERENCE : i10 == 1 ? Path.Op.INTERSECT : i10 == 4 ? Path.Op.REVERSE_DIFFERENCE : i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(g0Var instanceof C1555i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C1555i) g0Var).f7752a;
        if (g0Var2 instanceof C1555i) {
            return this.f7752a.op(path, ((C1555i) g0Var2).f7752a, op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: g */
    public final void m5158g() {
        this.f7752a.reset();
    }

    /* renamed from: h */
    public final void m5159h(int i10) {
        this.f7752a.setFillType(i10 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* renamed from: i */
    public final void m5160i(long j6) {
        Matrix matrix = this.f7755d;
        if (matrix == null) {
            this.f7755d = new Matrix();
        } else {
            AbstractC4154l.m8920c(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f7755d;
        AbstractC4154l.m8920c(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
        Matrix matrix3 = this.f7755d;
        AbstractC4154l.m8920c(matrix3);
        this.f7752a.transform(matrix3);
    }
}
