package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.skydoves.balloon.internals.DefinitionKt;
import ph.C5952g;
import ph.C5955j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.i */
/* loaded from: classes.dex */
public final class C6530i extends C5952g {

    /* renamed from: B */
    public final Paint f31314B;

    /* renamed from: C */
    public final RectF f31315C;

    /* renamed from: D */
    public int f31316D;

    public C6530i(C5955j c5955j) {
        super(c5955j == null ? new C5955j() : c5955j);
        Paint paint = new Paint(1);
        this.f31314B = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f31315C = new RectF();
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.f31316D = canvas2.saveLayer(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas2);
        canvas2.drawRect(this.f31315C, this.f31314B);
        if (getCallback() instanceof View) {
            return;
        }
        canvas2.restoreToCount(this.f31316D);
    }

    /* renamed from: m */
    public final void m12554m(float f6, float f10, float f11, float f12) {
        RectF rectF = this.f31315C;
        if (f6 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f10, f11, f12);
        invalidateSelf();
    }
}
