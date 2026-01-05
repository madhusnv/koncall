package p001o;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p001o.zya;

/* loaded from: classes3.dex */
public abstract class gk4 extends zya {
    public C13767b v0;

    /* renamed from: o.gk4$c */
    public static class C13768c extends gk4 {
        public C13768c(C13767b c13767b) {
            super(c13767b);
        }

        @Override // p001o.zya
        /* renamed from: v */
        public void mo28947v(Canvas canvas) {
            if (this.v0.f25373x.isEmpty()) {
                super.mo28947v(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.v0.f25373x);
            } else {
                canvas.clipRect(this.v0.f25373x, Region.Op.DIFFERENCE);
            }
            super.mo28947v(canvas);
            canvas.restore();
        }
    }

    public static gk4 A0(C13767b c13767b) {
        return new C13768c(c13767b);
    }

    public static gk4 B0(ykf ykfVar) {
        if (ykfVar == null) {
            ykfVar = new ykf();
        }
        return A0(new C13767b(ykfVar, new RectF()));
    }

    public boolean C0() {
        return !this.v0.f25373x.isEmpty();
    }

    public void D0() {
        E0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void E0(float f, float f2, float f3, float f4) {
        if (f == this.v0.f25373x.left && f2 == this.v0.f25373x.top && f3 == this.v0.f25373x.right && f4 == this.v0.f25373x.bottom) {
            return;
        }
        this.v0.f25373x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void F0(RectF rectF) {
        E0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p001o.zya, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.v0 = new C13767b(this.v0);
        return this;
    }

    /* renamed from: o.gk4$b */
    public static final class C13767b extends zya.C18729c {

        /* renamed from: x */
        public final RectF f25373x;

        @Override // p001o.zya.C18729c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            gk4 gk4VarA0 = gk4.A0(this);
            gk4VarA0.invalidateSelf();
            return gk4VarA0;
        }

        public C13767b(ykf ykfVar, RectF rectF) {
            super(ykfVar, null);
            this.f25373x = rectF;
        }

        public C13767b(C13767b c13767b) {
            super(c13767b);
            this.f25373x = c13767b.f25373x;
        }
    }

    public gk4(C13767b c13767b) {
        super(c13767b);
        this.v0 = c13767b;
    }
}
