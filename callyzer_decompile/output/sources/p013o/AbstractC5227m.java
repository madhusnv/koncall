package p013o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import c9.C0917l;
import iz.C3378k;
import l4.C4367l;
import og.bg;
import og.ga;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.m */
/* loaded from: classes.dex */
public abstract class AbstractC5227m extends AutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f25577d = {R.attr.popupBackground};

    /* renamed from: a */
    public final C5228n f25578a;

    /* renamed from: b */
    public final f0 f25579b;

    /* renamed from: c */
    public final C0917l f25580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5227m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.autoCompleteTextViewStyle);
        w1.m10301a(context);
        v1.m10297a(getContext(), this);
        C4367l c4367lM9117H = C4367l.m9117H(getContext(), attributeSet, f25577d, com.websoptimization.callyzerbiz.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c4367lM9117H.f21922c).hasValue(0)) {
            setDropDownBackgroundDrawable(c4367lM9117H.m9145y(0));
        }
        c4367lM9117H.m9124I();
        C5228n c5228n = new C5228n(this);
        this.f25578a = c5228n;
        c5228n.m10258d(attributeSet, com.websoptimization.callyzerbiz.R.attr.autoCompleteTextViewStyle);
        f0 f0Var = new f0(this);
        this.f25579b = f0Var;
        f0Var.m10229d(attributeSet, com.websoptimization.callyzerbiz.R.attr.autoCompleteTextViewStyle);
        f0Var.m10228b();
        C0917l c0917l = new C0917l(this);
        this.f25580c = c0917l;
        c0917l.m2645l(attributeSet, com.websoptimization.callyzerbiz.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2642h = c0917l.m2642h(keyListener);
        if (keyListenerM2642h == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2642h);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        f0 f0Var = this.f25579b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return bg.m10564f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C3378k c3378k = this.f25579b.f25487h;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C3378k c3378k = this.f25579b.f25487h;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ga.m10663a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f25580c.m2647n(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25579b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25579b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(bg.m10565g(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(s8.m11864b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f25580c.m2652s(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25580c.m2642h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.f25578a;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f25579b;
        f0Var.m10234i(colorStateList);
        f0Var.m10228b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f25579b;
        f0Var.m10235j(mode);
        f0Var.m10228b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f25579b;
        if (f0Var != null) {
            f0Var.m10230e(context, i10);
        }
    }
}
