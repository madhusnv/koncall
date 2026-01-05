package a1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.skydoves.balloon.internals.DefinitionKt;
import j0.AbstractC3506f;
import og.u1;
import og.y0;
import pg.j7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.h */
/* loaded from: classes.dex */
public final class C0009h {

    /* renamed from: i */
    public static final EnumC0016o f51i = EnumC0016o.FILL_CENTER;

    /* renamed from: a */
    public Size f52a;

    /* renamed from: b */
    public Rect f53b;

    /* renamed from: c */
    public int f54c;

    /* renamed from: d */
    public Matrix f55d;

    /* renamed from: e */
    public int f56e;

    /* renamed from: f */
    public boolean f57f;

    /* renamed from: g */
    public boolean f58g;

    /* renamed from: h */
    public EnumC0016o f59h;

    /* renamed from: a */
    public final void m90a(Size size, int i10, Rect rect) {
        Matrix matrix;
        if (m95f()) {
            Matrix matrix2 = new Matrix();
            if (m95f()) {
                Matrix matrix3 = new Matrix(this.f55d);
                matrix3.postConcat(m92c(size, i10));
                matrix = matrix3;
            } else {
                matrix = null;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, rect.width(), rect.height()), new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    /* renamed from: b */
    public final Size m91b() {
        return AbstractC3506f.m8068c(this.f54c) ? new Size(this.f53b.height(), this.f53b.width()) : new Size(this.f53b.width(), this.f53b.height());
    }

    /* renamed from: c */
    public final Matrix m92c(Size size, int i10) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        y0.m11056f(null, m95f());
        if (AbstractC3506f.m8069d(size, true, m91b())) {
            rectF = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, size.getWidth(), size.getHeight());
            Size sizeM91b = m91b();
            RectF rectF3 = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, sizeM91b.getWidth(), sizeM91b.getHeight());
            Matrix matrix = new Matrix();
            EnumC0016o enumC0016o = this.f59h;
            switch (AbstractC0008g.f50a[enumC0016o.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    enumC0016o.toString();
                    u1.m10943b("PreviewTransform");
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (enumC0016o == EnumC0016o.FIT_CENTER || enumC0016o == EnumC0016o.FIT_START || enumC0016o == EnumC0016o.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i10 == 1) {
                float width = size.getWidth() / 2.0f;
                float f6 = width + width;
                rectF = new RectF(f6 - rectF3.right, rectF3.top, f6 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixM8066a = AbstractC3506f.m8066a(new RectF(this.f53b), rectF, this.f54c, false);
        if (this.f57f && this.f58g) {
            if (AbstractC3506f.m8068c(this.f54c)) {
                matrixM8066a.preScale(1.0f, -1.0f, this.f53b.centerX(), this.f53b.centerY());
                return matrixM8066a;
            }
            matrixM8066a.preScale(-1.0f, 1.0f, this.f53b.centerX(), this.f53b.centerY());
        }
        return matrixM8066a;
    }

    /* renamed from: d */
    public final Matrix m93d() {
        y0.m11056f(null, m95f());
        RectF rectF = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, this.f52a.getWidth(), this.f52a.getHeight());
        return AbstractC3506f.m8066a(rectF, rectF, !this.f58g ? this.f54c : -j7.m11713c(this.f56e), false);
    }

    /* renamed from: e */
    public final RectF m94e(Size size, int i10) {
        y0.m11056f(null, m95f());
        Matrix matrixM92c = m92c(size, i10);
        RectF rectF = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, this.f52a.getWidth(), this.f52a.getHeight());
        matrixM92c.mapRect(rectF);
        return rectF;
    }

    /* renamed from: f */
    public final boolean m95f() {
        return (this.f53b == null || this.f52a == null || !(!this.f58g || this.f56e != -1)) ? false : true;
    }
}
