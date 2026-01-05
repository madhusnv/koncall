package p001o;

import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class hh9 {

    /* renamed from: a */
    public final nl7 f26866a;

    /* renamed from: b */
    public Matrix f26867b;

    /* renamed from: c */
    public Matrix f26868c;

    /* renamed from: d */
    public float[] f26869d;

    /* renamed from: e */
    public float[] f26870e;

    /* renamed from: f */
    public boolean f26871f;

    /* renamed from: g */
    public boolean f26872g;

    /* renamed from: h */
    public boolean f26873h;

    public hh9(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "getMatrix");
        this.f26866a = nl7Var;
        this.f26871f = true;
        this.f26872g = true;
        this.f26873h = true;
    }

    /* renamed from: a */
    public final float[] m30462a(Object obj) {
        float[] fArrM45993b = this.f26870e;
        if (fArrM45993b == null) {
            fArrM45993b = qza.m45993b(null, 1, null);
            this.f26870e = fArrM45993b;
        }
        if (this.f26872g) {
            this.f26873h = ov8.m42718a(m30463b(obj), fArrM45993b);
            this.f26872g = false;
        }
        if (this.f26873h) {
            return fArrM45993b;
        }
        return null;
    }

    /* renamed from: b */
    public final float[] m30463b(Object obj) {
        float[] fArrM45993b = this.f26869d;
        if (fArrM45993b == null) {
            fArrM45993b = qza.m45993b(null, 1, null);
            this.f26869d = fArrM45993b;
        }
        if (!this.f26871f) {
            return fArrM45993b;
        }
        Matrix matrix = this.f26867b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f26867b = matrix;
        }
        this.f26866a.invoke(obj, matrix);
        Matrix matrix2 = this.f26868c;
        if (matrix2 == null || !sq8.m48644c(matrix, matrix2)) {
            ze0.m59285b(fArrM45993b, matrix);
            this.f26867b = matrix2;
            this.f26868c = matrix;
        }
        this.f26871f = false;
        return fArrM45993b;
    }

    /* renamed from: c */
    public final void m30464c() {
        this.f26871f = true;
        this.f26872g = true;
    }
}
