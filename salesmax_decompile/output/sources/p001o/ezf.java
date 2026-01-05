package p001o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class ezf extends hc1 {

    /* renamed from: B */
    public final RectF f22454B;

    /* renamed from: C */
    public final Paint f22455C;

    /* renamed from: D */
    public final float[] f22456D;

    /* renamed from: E */
    public final Path f22457E;

    /* renamed from: F */
    public final gh9 f22458F;

    /* renamed from: G */
    public gc1 f22459G;

    public ezf(ema emaVar, gh9 gh9Var) {
        super(emaVar, gh9Var);
        this.f22454B = new RectF();
        we9 we9Var = new we9();
        this.f22455C = we9Var;
        this.f22456D = new float[8];
        this.f22457E = new Path();
        this.f22458F = gh9Var;
        we9Var.setAlpha(0);
        we9Var.setStyle(Paint.Style.FILL);
        we9Var.setColor(gh9Var.m28689o());
    }

    @Override // p001o.hc1, p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        super.mo20000d(obj, qmaVar);
        if (obj == mma.f35706K) {
            if (qmaVar == null) {
                this.f22459G = null;
            } else {
                this.f22459G = new vri(qmaVar);
            }
        }
    }

    @Override // p001o.hc1, p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        super.mo20001e(rectF, matrix, z);
        this.f22454B.set(0.0f, 0.0f, this.f22458F.m28691q(), this.f22458F.m28690p());
        this.f26619m.mapRect(this.f22454B);
        rectF.set(this.f22454B);
    }

    @Override // p001o.hc1
    /* renamed from: t */
    public void mo23320t(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f22458F.m28689o());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.f26628v.m50701h() == null ? 100 : ((Integer) this.f26628v.m50701h().mo28376h()).intValue())) / 100.0f) * 255.0f);
        this.f22455C.setAlpha(iIntValue);
        gc1 gc1Var = this.f22459G;
        if (gc1Var != null) {
            this.f22455C.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f22456D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f22458F.m28691q();
            float[] fArr2 = this.f22456D;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f22458F.m28691q();
            this.f22456D[5] = this.f22458F.m28690p();
            float[] fArr3 = this.f22456D;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f22458F.m28690p();
            matrix.mapPoints(this.f22456D);
            this.f22457E.reset();
            Path path = this.f22457E;
            float[] fArr4 = this.f22456D;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f22457E;
            float[] fArr5 = this.f22456D;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f22457E;
            float[] fArr6 = this.f22456D;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f22457E;
            float[] fArr7 = this.f22456D;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f22457E;
            float[] fArr8 = this.f22456D;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f22457E.close();
            canvas.drawPath(this.f22457E, this.f22455C);
        }
    }
}
