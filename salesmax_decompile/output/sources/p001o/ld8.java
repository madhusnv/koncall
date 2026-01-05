package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class ld8 extends hc1 {

    /* renamed from: B */
    public final Paint f33645B;

    /* renamed from: C */
    public final Rect f33646C;

    /* renamed from: D */
    public final Rect f33647D;

    /* renamed from: E */
    public gc1 f33648E;

    /* renamed from: F */
    public gc1 f33649F;

    public ld8(ema emaVar, gh9 gh9Var) {
        super(emaVar, gh9Var);
        this.f33645B = new we9(3);
        this.f33646C = new Rect();
        this.f33647D = new Rect();
    }

    /* renamed from: N */
    public final Bitmap m36971N() {
        Bitmap bitmap;
        gc1 gc1Var = this.f33649F;
        return (gc1Var == null || (bitmap = (Bitmap) gc1Var.mo28376h()) == null) ? this.f26620n.m25331t(this.f26621o.m28687m()) : bitmap;
    }

    @Override // p001o.hc1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35706K) {
            if (qmaVar == null) {
                this.f33648E = null;
                return;
            } else {
                this.f33648E = new vri(qmaVar);
                return;
            }
        }
        if (obj == mma.f35709N) {
            if (qmaVar == null) {
                this.f33649F = null;
            } else {
                this.f33649F = new vri(qmaVar);
            }
        }
    }

    @Override // p001o.hc1, p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        super.mo20001e(rectF, matrix, z);
        if (m36971N() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * hri.m31025e(), r3.getHeight() * hri.m31025e());
            this.f26619m.mapRect(rectF);
        }
    }

    @Override // p001o.hc1
    /* renamed from: t */
    public void mo23320t(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapM36971N = m36971N();
        if (bitmapM36971N == null || bitmapM36971N.isRecycled()) {
            return;
        }
        float fM31025e = hri.m31025e();
        this.f33645B.setAlpha(i);
        gc1 gc1Var = this.f33648E;
        if (gc1Var != null) {
            this.f33645B.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f33646C.set(0, 0, bitmapM36971N.getWidth(), bitmapM36971N.getHeight());
        this.f33647D.set(0, 0, (int) (bitmapM36971N.getWidth() * fM31025e), (int) (bitmapM36971N.getHeight() * fM31025e));
        canvas.drawBitmap(bitmapM36971N, this.f33646C, this.f33647D, this.f33645B);
        canvas.restore();
    }
}
