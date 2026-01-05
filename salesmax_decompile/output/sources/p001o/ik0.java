package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class ik0 {

    /* renamed from: a */
    public final ImageView f28757a;

    /* renamed from: b */
    public ymh f28758b;

    /* renamed from: c */
    public ymh f28759c;

    /* renamed from: d */
    public ymh f28760d;

    /* renamed from: e */
    public int f28761e = 0;

    public ik0(ImageView imageView) {
        this.f28757a = imageView;
    }

    /* renamed from: a */
    public final boolean m32217a(Drawable drawable) {
        if (this.f28760d == null) {
            this.f28760d = new ymh();
        }
        ymh ymhVar = this.f28760d;
        ymhVar.m58002a();
        ColorStateList colorStateListM38810a = me8.m38810a(this.f28757a);
        if (colorStateListM38810a != null) {
            ymhVar.f55711d = true;
            ymhVar.f55708a = colorStateListM38810a;
        }
        PorterDuff.Mode modeM38811b = me8.m38811b(this.f28757a);
        if (modeM38811b != null) {
            ymhVar.f55710c = true;
            ymhVar.f55709b = modeM38811b;
        }
        if (!ymhVar.f55711d && !ymhVar.f55710c) {
            return false;
        }
        ek0.m25166i(drawable, ymhVar, this.f28757a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m32218b() {
        if (this.f28757a.getDrawable() != null) {
            this.f28757a.getDrawable().setLevel(this.f28761e);
        }
    }

    /* renamed from: c */
    public void m32219c() {
        Drawable drawable = this.f28757a.getDrawable();
        if (drawable != null) {
            vy5.m53596b(drawable);
        }
        if (drawable != null) {
            if (m32228l() && m32217a(drawable)) {
                return;
            }
            ymh ymhVar = this.f28759c;
            if (ymhVar != null) {
                ek0.m25166i(drawable, ymhVar, this.f28757a.getDrawableState());
                return;
            }
            ymh ymhVar2 = this.f28758b;
            if (ymhVar2 != null) {
                ek0.m25166i(drawable, ymhVar2, this.f28757a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m32220d() {
        ymh ymhVar = this.f28759c;
        if (ymhVar != null) {
            return ymhVar.f55708a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m32221e() {
        ymh ymhVar = this.f28759c;
        if (ymhVar != null) {
            return ymhVar.f55709b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m32222f() {
        return !(this.f28757a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void m32223g(AttributeSet attributeSet, int i) {
        int iM17539n;
        anh anhVarM17525v = anh.m17525v(this.f28757a.getContext(), attributeSet, bbe.AppCompatImageView, i, 0);
        ImageView imageView = this.f28757a;
        wvi.k0(imageView, imageView.getContext(), bbe.AppCompatImageView, attributeSet, anhVarM17525v.m17543r(), i, 0);
        try {
            Drawable drawable = this.f28757a.getDrawable();
            if (drawable == null && (iM17539n = anhVarM17525v.m17539n(bbe.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = lk0.m37353b(this.f28757a.getContext(), iM17539n)) != null) {
                this.f28757a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vy5.m53596b(drawable);
            }
            if (anhVarM17525v.m17544s(bbe.AppCompatImageView_tint)) {
                me8.m38812c(this.f28757a, anhVarM17525v.m17528c(bbe.AppCompatImageView_tint));
            }
            if (anhVarM17525v.m17544s(bbe.AppCompatImageView_tintMode)) {
                me8.m38813d(this.f28757a, vy5.m53599e(anhVarM17525v.m17536k(bbe.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            anhVarM17525v.m17546x();
        }
    }

    /* renamed from: h */
    public void m32224h(Drawable drawable) {
        this.f28761e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m32225i(int i) {
        if (i != 0) {
            Drawable drawableM37353b = lk0.m37353b(this.f28757a.getContext(), i);
            if (drawableM37353b != null) {
                vy5.m53596b(drawableM37353b);
            }
            this.f28757a.setImageDrawable(drawableM37353b);
        } else {
            this.f28757a.setImageDrawable(null);
        }
        m32219c();
    }

    /* renamed from: j */
    public void m32226j(ColorStateList colorStateList) {
        if (this.f28759c == null) {
            this.f28759c = new ymh();
        }
        ymh ymhVar = this.f28759c;
        ymhVar.f55708a = colorStateList;
        ymhVar.f55711d = true;
        m32219c();
    }

    /* renamed from: k */
    public void m32227k(PorterDuff.Mode mode) {
        if (this.f28759c == null) {
            this.f28759c = new ymh();
        }
        ymh ymhVar = this.f28759c;
        ymhVar.f55709b = mode;
        ymhVar.f55710c = true;
        m32219c();
    }

    /* renamed from: l */
    public final boolean m32228l() {
        return this.f28758b != null;
    }
}
