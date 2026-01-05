package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p001o.bnh;
import p001o.dkh;
import p001o.gk0;
import p001o.lk0;
import p001o.oj0;
import p001o.ok0;
import p001o.rj0;
import p001o.xmh;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatCheckBox extends CheckBox implements bnh {

    /* renamed from: a */
    public final rj0 f5793a;

    /* renamed from: b */
    public final oj0 f5794b;

    /* renamed from: c */
    public final ok0 f5795c;

    /* renamed from: d */
    public gk0 f5796d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.f5796d == null) {
            this.f5796d = new gk0(this);
        }
        return this.f5796d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5795c;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    @Override // p001o.bnh
    public ColorStateList getSupportButtonTintList() {
        rj0 rj0Var = this.f5793a;
        if (rj0Var != null) {
            return rj0Var.m46852b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        rj0 rj0Var = this.f5793a;
        if (rj0Var != null) {
            return rj0Var.m46853c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5795c.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5795c.m42326k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        rj0 rj0Var = this.f5793a;
        if (rj0Var != null) {
            rj0Var.m46855e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5795c;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5795c;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m28943e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m28939a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5794b;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    @Override // p001o.bnh
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        rj0 rj0Var = this.f5793a;
        if (rj0Var != null) {
            rj0Var.m46856f(colorStateList);
        }
    }

    @Override // p001o.bnh
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        rj0 rj0Var = this.f5793a;
        if (rj0Var != null) {
            rj0Var.m46857g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5795c.m42338w(colorStateList);
        this.f5795c.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5795c.m42339x(mode);
        this.f5795c.m42318b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        dkh.m23377a(this, getContext());
        rj0 rj0Var = new rj0(this);
        this.f5793a = rj0Var;
        rj0Var.m46854d(attributeSet, i);
        oj0 oj0Var = new oj0(this);
        this.f5794b = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5795c = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        getEmojiTextViewHelper().m28941c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(lk0.m37353b(getContext(), i));
    }
}
