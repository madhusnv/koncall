package ph;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.o */
/* loaded from: classes.dex */
public final class C5960o extends AbstractC5962q {

    /* renamed from: h */
    public static final RectF f29194h = new RectF();

    /* renamed from: b */
    public final float f29195b;

    /* renamed from: c */
    public final float f29196c;

    /* renamed from: d */
    public final float f29197d;

    /* renamed from: e */
    public final float f29198e;

    /* renamed from: f */
    public float f29199f;

    /* renamed from: g */
    public float f29200g;

    public C5960o(float f6, float f10, float f11, float f12) {
        this.f29195b = f6;
        this.f29196c = f10;
        this.f29197d = f11;
        this.f29198e = f12;
    }

    @Override // ph.AbstractC5962q
    /* renamed from: a */
    public final void mo11999a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29203a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f6 = this.f29197d;
        float f10 = this.f29198e;
        RectF rectF = f29194h;
        rectF.set(this.f29195b, this.f29196c, f6, f10);
        path.arcTo(rectF, this.f29199f, this.f29200g, false);
        path.transform(matrix);
    }
}
