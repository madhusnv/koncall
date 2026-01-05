package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p001o.anh;
import p001o.dkh;
import p001o.fk0;
import p001o.hk0;
import p001o.lk0;
import p001o.oj0;
import p001o.ok0;
import p001o.xmh;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f5814d = {R.attr.popupBackground};

    /* renamed from: a */
    public final oj0 f5815a;

    /* renamed from: b */
    public final ok0 f5816b;

    /* renamed from: c */
    public final fk0 f5817c;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m4211a(fk0 fk0Var) {
        KeyListener keyListener = getKeyListener();
        if (fk0Var.m26941b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM26940a = fk0Var.m26940a(keyListener);
            if (keyListenerM26940a == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM26940a);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5816b;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5816b.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5816b.m42326k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f5817c.m26943d(hk0.m30674a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5816b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5816b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(lk0.m37353b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f5817c.m26944e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5817c.m26940a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5815a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5816b.m42338w(colorStateList);
        this.f5816b.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5816b.m42339x(mode);
        this.f5816b.m42318b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ok0 ok0Var = this.f5816b;
        if (ok0Var != null) {
            ok0Var.m42332q(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        dkh.m23377a(this, getContext());
        anh anhVarM17525v = anh.m17525v(getContext(), attributeSet, f5814d, i, 0);
        if (anhVarM17525v.m17544s(0)) {
            setDropDownBackgroundDrawable(anhVarM17525v.m17532g(0));
        }
        anhVarM17525v.m17546x();
        oj0 oj0Var = new oj0(this);
        this.f5815a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5816b = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        ok0Var.m42318b();
        fk0 fk0Var = new fk0(this);
        this.f5817c = fk0Var;
        fk0Var.m26942c(attributeSet, i);
        m4211a(fk0Var);
    }
}
