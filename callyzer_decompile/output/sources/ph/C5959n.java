package ph;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.skydoves.balloon.internals.DefinitionKt;
import oh.C5386a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.n */
/* loaded from: classes.dex */
public final class C5959n extends AbstractC5963r {

    /* renamed from: b */
    public final C5961p f29191b;

    /* renamed from: c */
    public final float f29192c;

    /* renamed from: d */
    public final float f29193d;

    public C5959n(C5961p c5961p, float f6, float f10) {
        this.f29191b = c5961p;
        this.f29192c = f6;
        this.f29193d = f10;
    }

    @Override // ph.AbstractC5963r
    /* renamed from: a */
    public final void mo11997a(Matrix matrix, C5386a c5386a, int i10, Canvas canvas) {
        C5961p c5961p = this.f29191b;
        float f6 = c5961p.f29202c;
        float f10 = this.f29193d;
        float f11 = c5961p.f29201b;
        float f12 = this.f29192c;
        RectF rectF = new RectF(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (float) Math.hypot(f6 - f10, f11 - f12), DefinitionKt.NO_Float_VALUE);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(m11998b());
        c5386a.getClass();
        rectF.bottom += i10;
        rectF.offset(DefinitionKt.NO_Float_VALUE, -i10);
        int i11 = c5386a.f27058f;
        int[] iArr = C5386a.f27049i;
        iArr[0] = i11;
        iArr[1] = c5386a.f27057e;
        iArr[2] = c5386a.f27056d;
        Paint paint = c5386a.f27055c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, C5386a.f27050j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m11998b() {
        C5961p c5961p = this.f29191b;
        return (float) Math.toDegrees(Math.atan((c5961p.f29202c - this.f29193d) / (c5961p.f29201b - this.f29192c)));
    }
}
