package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* loaded from: classes2.dex */
public class qj0 {

    /* renamed from: a */
    public final CheckedTextView f42047a;

    /* renamed from: b */
    public ColorStateList f42048b = null;

    /* renamed from: c */
    public PorterDuff.Mode f42049c = null;

    /* renamed from: d */
    public boolean f42050d = false;

    /* renamed from: e */
    public boolean f42051e = false;

    /* renamed from: f */
    public boolean f42052f;

    public qj0(CheckedTextView checkedTextView) {
        this.f42047a = checkedTextView;
    }

    /* renamed from: a */
    public void m45524a() {
        Drawable drawableM43159a = p83.m43159a(this.f42047a);
        if (drawableM43159a != null) {
            if (this.f42050d || this.f42051e) {
                Drawable drawableMutate = fy5.m27744r(drawableM43159a).mutate();
                if (this.f42050d) {
                    fy5.m27741o(drawableMutate, this.f42048b);
                }
                if (this.f42051e) {
                    fy5.m27742p(drawableMutate, this.f42049c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f42047a.getDrawableState());
                }
                this.f42047a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m45525b() {
        return this.f42048b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m45526c() {
        return this.f42049c;
    }

    /* renamed from: d */
    public void m45527d(AttributeSet attributeSet, int i) {
        boolean z;
        int iM17539n;
        int iM17539n2;
        anh anhVarM17525v = anh.m17525v(this.f42047a.getContext(), attributeSet, bbe.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.f42047a;
        wvi.k0(checkedTextView, checkedTextView.getContext(), bbe.CheckedTextView, attributeSet, anhVarM17525v.m17543r(), i, 0);
        try {
            if (!anhVarM17525v.m17544s(bbe.CheckedTextView_checkMarkCompat) || (iM17539n2 = anhVarM17525v.m17539n(bbe.CheckedTextView_checkMarkCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f42047a;
                    checkedTextView2.setCheckMarkDrawable(lk0.m37353b(checkedTextView2.getContext(), iM17539n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && anhVarM17525v.m17544s(bbe.CheckedTextView_android_checkMark) && (iM17539n = anhVarM17525v.m17539n(bbe.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView3 = this.f42047a;
                checkedTextView3.setCheckMarkDrawable(lk0.m37353b(checkedTextView3.getContext(), iM17539n));
            }
            if (anhVarM17525v.m17544s(bbe.CheckedTextView_checkMarkTint)) {
                p83.m43160b(this.f42047a, anhVarM17525v.m17528c(bbe.CheckedTextView_checkMarkTint));
            }
            if (anhVarM17525v.m17544s(bbe.CheckedTextView_checkMarkTintMode)) {
                p83.m43161c(this.f42047a, vy5.m53599e(anhVarM17525v.m17536k(bbe.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            anhVarM17525v.m17546x();
        }
    }

    /* renamed from: e */
    public void m45528e() {
        if (this.f42052f) {
            this.f42052f = false;
        } else {
            this.f42052f = true;
            m45524a();
        }
    }

    /* renamed from: f */
    public void m45529f(ColorStateList colorStateList) {
        this.f42048b = colorStateList;
        this.f42050d = true;
        m45524a();
    }

    /* renamed from: g */
    public void m45530g(PorterDuff.Mode mode) {
        this.f42049c = mode;
        this.f42051e = true;
        m45524a();
    }
}
