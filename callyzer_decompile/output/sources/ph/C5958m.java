package ph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.skydoves.balloon.internals.DefinitionKt;
import oh.C5386a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.m */
/* loaded from: classes.dex */
public final class C5958m extends AbstractC5963r {

    /* renamed from: b */
    public final C5960o f29190b;

    public C5958m(C5960o c5960o) {
        this.f29190b = c5960o;
    }

    @Override // ph.AbstractC5963r
    /* renamed from: a */
    public final void mo11997a(Matrix matrix, C5386a c5386a, int i10, Canvas canvas) {
        float f6;
        C5960o c5960o = this.f29190b;
        float f10 = c5960o.f29199f;
        float f11 = c5960o.f29200g;
        RectF rectF = new RectF(c5960o.f29195b, c5960o.f29196c, c5960o.f29197d, c5960o.f29198e);
        Paint paint = c5386a.f27054b;
        boolean z6 = f11 < DefinitionKt.NO_Float_VALUE;
        Path path = c5386a.f27059g;
        int[] iArr = C5386a.f27051k;
        if (z6) {
            iArr[0] = 0;
            iArr[1] = c5386a.f27058f;
            iArr[2] = c5386a.f27057e;
            iArr[3] = c5386a.f27056d;
            f6 = 0.0f;
        } else {
            path.rewind();
            f6 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = c5386a.f27056d;
            iArr[2] = c5386a.f27057e;
            iArr[3] = c5386a.f27058f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f6) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = C5386a.f27052l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c5386a.f27060h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
