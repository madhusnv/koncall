package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class oj0 {

    /* renamed from: a */
    public final View f38429a;

    /* renamed from: d */
    public ymh f38432d;

    /* renamed from: e */
    public ymh f38433e;

    /* renamed from: f */
    public ymh f38434f;

    /* renamed from: c */
    public int f38431c = -1;

    /* renamed from: b */
    public final ek0 f38430b = ek0.m25163b();

    public oj0(View view) {
        this.f38429a = view;
    }

    /* renamed from: a */
    public final boolean m42282a(Drawable drawable) {
        if (this.f38434f == null) {
            this.f38434f = new ymh();
        }
        ymh ymhVar = this.f38434f;
        ymhVar.m58002a();
        ColorStateList colorStateListM55131r = wvi.m55131r(this.f38429a);
        if (colorStateListM55131r != null) {
            ymhVar.f55711d = true;
            ymhVar.f55708a = colorStateListM55131r;
        }
        PorterDuff.Mode modeM55132s = wvi.m55132s(this.f38429a);
        if (modeM55132s != null) {
            ymhVar.f55710c = true;
            ymhVar.f55709b = modeM55132s;
        }
        if (!ymhVar.f55711d && !ymhVar.f55710c) {
            return false;
        }
        ek0.m25166i(drawable, ymhVar, this.f38429a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m42283b() {
        Drawable background = this.f38429a.getBackground();
        if (background != null) {
            if (m42292k() && m42282a(background)) {
                return;
            }
            ymh ymhVar = this.f38433e;
            if (ymhVar != null) {
                ek0.m25166i(background, ymhVar, this.f38429a.getDrawableState());
                return;
            }
            ymh ymhVar2 = this.f38432d;
            if (ymhVar2 != null) {
                ek0.m25166i(background, ymhVar2, this.f38429a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m42284c() {
        ymh ymhVar = this.f38433e;
        if (ymhVar != null) {
            return ymhVar.f55708a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m42285d() {
        ymh ymhVar = this.f38433e;
        if (ymhVar != null) {
            return ymhVar.f55709b;
        }
        return null;
    }

    /* renamed from: e */
    public void m42286e(AttributeSet attributeSet, int i) {
        anh anhVarM17525v = anh.m17525v(this.f38429a.getContext(), attributeSet, bbe.ViewBackgroundHelper, i, 0);
        View view = this.f38429a;
        wvi.k0(view, view.getContext(), bbe.ViewBackgroundHelper, attributeSet, anhVarM17525v.m17543r(), i, 0);
        try {
            if (anhVarM17525v.m17544s(bbe.ViewBackgroundHelper_android_background)) {
                this.f38431c = anhVarM17525v.m17539n(bbe.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListM25169f = this.f38430b.m25169f(this.f38429a.getContext(), this.f38431c);
                if (colorStateListM25169f != null) {
                    m42289h(colorStateListM25169f);
                }
            }
            if (anhVarM17525v.m17544s(bbe.ViewBackgroundHelper_backgroundTint)) {
                wvi.q0(this.f38429a, anhVarM17525v.m17528c(bbe.ViewBackgroundHelper_backgroundTint));
            }
            if (anhVarM17525v.m17544s(bbe.ViewBackgroundHelper_backgroundTintMode)) {
                wvi.r0(this.f38429a, vy5.m53599e(anhVarM17525v.m17536k(bbe.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            anhVarM17525v.m17546x();
        }
    }

    /* renamed from: f */
    public void m42287f(Drawable drawable) {
        this.f38431c = -1;
        m42289h(null);
        m42283b();
    }

    /* renamed from: g */
    public void m42288g(int i) {
        this.f38431c = i;
        ek0 ek0Var = this.f38430b;
        m42289h(ek0Var != null ? ek0Var.m25169f(this.f38429a.getContext(), i) : null);
        m42283b();
    }

    /* renamed from: h */
    public void m42289h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f38432d == null) {
                this.f38432d = new ymh();
            }
            ymh ymhVar = this.f38432d;
            ymhVar.f55708a = colorStateList;
            ymhVar.f55711d = true;
        } else {
            this.f38432d = null;
        }
        m42283b();
    }

    /* renamed from: i */
    public void m42290i(ColorStateList colorStateList) {
        if (this.f38433e == null) {
            this.f38433e = new ymh();
        }
        ymh ymhVar = this.f38433e;
        ymhVar.f55708a = colorStateList;
        ymhVar.f55711d = true;
        m42283b();
    }

    /* renamed from: j */
    public void m42291j(PorterDuff.Mode mode) {
        if (this.f38433e == null) {
            this.f38433e = new ymh();
        }
        ymh ymhVar = this.f38433e;
        ymhVar.f55709b = mode;
        ymhVar.f55710c = true;
        m42283b();
    }

    /* renamed from: k */
    public final boolean m42292k() {
        return this.f38432d != null;
    }
}
