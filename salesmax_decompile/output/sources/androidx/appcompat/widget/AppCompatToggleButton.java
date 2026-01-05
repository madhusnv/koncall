package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p001o.dkh;
import p001o.gk0;
import p001o.oj0;
import p001o.ok0;

/* loaded from: classes2.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a */
    public final oj0 f5860a;

    /* renamed from: b */
    public final ok0 f5861b;

    /* renamed from: c */
    public gk0 f5862c;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.f5862c == null) {
            this.f5862c = new gk0(this);
        }
        return this.f5862c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5861b;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5861b.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5861b.m42326k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5861b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5861b;
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
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5860a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5861b.m42338w(colorStateList);
        this.f5861b.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5861b.m42339x(mode);
        this.f5861b.m42318b();
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5860a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5861b = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        getEmojiTextViewHelper().m28941c(attributeSet, i);
    }
}
