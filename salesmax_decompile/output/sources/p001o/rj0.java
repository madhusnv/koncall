package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes2.dex */
public class rj0 {

    /* renamed from: a */
    public final CompoundButton f43698a;

    /* renamed from: b */
    public ColorStateList f43699b = null;

    /* renamed from: c */
    public PorterDuff.Mode f43700c = null;

    /* renamed from: d */
    public boolean f43701d = false;

    /* renamed from: e */
    public boolean f43702e = false;

    /* renamed from: f */
    public boolean f43703f;

    public rj0(CompoundButton compoundButton) {
        this.f43698a = compoundButton;
    }

    /* renamed from: a */
    public void m46851a() {
        Drawable drawableM42523a = op3.m42523a(this.f43698a);
        if (drawableM42523a != null) {
            if (this.f43701d || this.f43702e) {
                Drawable drawableMutate = fy5.m27744r(drawableM42523a).mutate();
                if (this.f43701d) {
                    fy5.m27741o(drawableMutate, this.f43699b);
                }
                if (this.f43702e) {
                    fy5.m27742p(drawableMutate, this.f43700c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f43698a.getDrawableState());
                }
                this.f43698a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m46852b() {
        return this.f43699b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m46853c() {
        return this.f43700c;
    }

    /* renamed from: d */
    public void m46854d(AttributeSet attributeSet, int i) {
        boolean z;
        int iM17539n;
        int iM17539n2;
        anh anhVarM17525v = anh.m17525v(this.f43698a.getContext(), attributeSet, bbe.CompoundButton, i, 0);
        CompoundButton compoundButton = this.f43698a;
        wvi.k0(compoundButton, compoundButton.getContext(), bbe.CompoundButton, attributeSet, anhVarM17525v.m17543r(), i, 0);
        try {
            if (!anhVarM17525v.m17544s(bbe.CompoundButton_buttonCompat) || (iM17539n2 = anhVarM17525v.m17539n(bbe.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f43698a;
                    compoundButton2.setButtonDrawable(lk0.m37353b(compoundButton2.getContext(), iM17539n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && anhVarM17525v.m17544s(bbe.CompoundButton_android_button) && (iM17539n = anhVarM17525v.m17539n(bbe.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton3 = this.f43698a;
                compoundButton3.setButtonDrawable(lk0.m37353b(compoundButton3.getContext(), iM17539n));
            }
            if (anhVarM17525v.m17544s(bbe.CompoundButton_buttonTint)) {
                op3.m42526d(this.f43698a, anhVarM17525v.m17528c(bbe.CompoundButton_buttonTint));
            }
            if (anhVarM17525v.m17544s(bbe.CompoundButton_buttonTintMode)) {
                op3.m42527e(this.f43698a, vy5.m53599e(anhVarM17525v.m17536k(bbe.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            anhVarM17525v.m17546x();
        }
    }

    /* renamed from: e */
    public void m46855e() {
        if (this.f43703f) {
            this.f43703f = false;
        } else {
            this.f43703f = true;
            m46851a();
        }
    }

    /* renamed from: f */
    public void m46856f(ColorStateList colorStateList) {
        this.f43699b = colorStateList;
        this.f43701d = true;
        m46851a();
    }

    /* renamed from: g */
    public void m46857g(PorterDuff.Mode mode) {
        this.f43700c = mode;
        this.f43702e = true;
        m46851a();
    }
}
