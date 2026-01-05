package p001o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes2.dex */
public class mk0 extends jk0 {

    /* renamed from: d */
    public final SeekBar f35574d;

    /* renamed from: e */
    public Drawable f35575e;

    /* renamed from: f */
    public ColorStateList f35576f;

    /* renamed from: g */
    public PorterDuff.Mode f35577g;

    /* renamed from: h */
    public boolean f35578h;

    /* renamed from: i */
    public boolean f35579i;

    public mk0(SeekBar seekBar) {
        super(seekBar);
        this.f35576f = null;
        this.f35577g = null;
        this.f35578h = false;
        this.f35579i = false;
        this.f35574d = seekBar;
    }

    @Override // p001o.jk0
    /* renamed from: c */
    public void mo33888c(AttributeSet attributeSet, int i) {
        super.mo33888c(attributeSet, i);
        anh anhVarM17525v = anh.m17525v(this.f35574d.getContext(), attributeSet, bbe.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f35574d;
        wvi.k0(seekBar, seekBar.getContext(), bbe.AppCompatSeekBar, attributeSet, anhVarM17525v.m17543r(), i, 0);
        Drawable drawableM17533h = anhVarM17525v.m17533h(bbe.AppCompatSeekBar_android_thumb);
        if (drawableM17533h != null) {
            this.f35574d.setThumb(drawableM17533h);
        }
        m39255j(anhVarM17525v.m17532g(bbe.AppCompatSeekBar_tickMark));
        if (anhVarM17525v.m17544s(bbe.AppCompatSeekBar_tickMarkTintMode)) {
            this.f35577g = vy5.m53599e(anhVarM17525v.m17536k(bbe.AppCompatSeekBar_tickMarkTintMode, -1), this.f35577g);
            this.f35579i = true;
        }
        if (anhVarM17525v.m17544s(bbe.AppCompatSeekBar_tickMarkTint)) {
            this.f35576f = anhVarM17525v.m17528c(bbe.AppCompatSeekBar_tickMarkTint);
            this.f35578h = true;
        }
        anhVarM17525v.m17546x();
        m39251f();
    }

    /* renamed from: f */
    public final void m39251f() {
        Drawable drawable = this.f35575e;
        if (drawable != null) {
            if (this.f35578h || this.f35579i) {
                Drawable drawableM27744r = fy5.m27744r(drawable.mutate());
                this.f35575e = drawableM27744r;
                if (this.f35578h) {
                    fy5.m27741o(drawableM27744r, this.f35576f);
                }
                if (this.f35579i) {
                    fy5.m27742p(this.f35575e, this.f35577g);
                }
                if (this.f35575e.isStateful()) {
                    this.f35575e.setState(this.f35574d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m39252g(Canvas canvas) {
        if (this.f35575e != null) {
            int max = this.f35574d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f35575e.getIntrinsicWidth();
                int intrinsicHeight = this.f35575e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f35575e.setBounds(-i, -i2, i, i2);
                float width = ((this.f35574d.getWidth() - this.f35574d.getPaddingLeft()) - this.f35574d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f35574d.getPaddingLeft(), this.f35574d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f35575e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* renamed from: h */
    public void m39253h() {
        Drawable drawable = this.f35575e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f35574d.getDrawableState())) {
            this.f35574d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m39254i() {
        Drawable drawable = this.f35575e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m39255j(Drawable drawable) {
        Drawable drawable2 = this.f35575e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f35575e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f35574d);
            fy5.m27739m(drawable, this.f35574d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f35574d.getDrawableState());
            }
            m39251f();
        }
        this.f35574d.invalidate();
    }
}
