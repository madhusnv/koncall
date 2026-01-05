package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p001o.dkh;
import p001o.gjh;
import p001o.gk0;
import p001o.hk0;
import p001o.lk0;
import p001o.oj0;
import p001o.ok0;
import p001o.qj0;
import p001o.xmh;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    public final qj0 f5797a;

    /* renamed from: b */
    public final oj0 f5798b;

    /* renamed from: c */
    public final ok0 f5799c;

    /* renamed from: d */
    public gk0 f5800d;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.f5800d == null) {
            this.f5800d = new gk0(this);
        }
        return this.f5800d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ok0 ok0Var = this.f5799c;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            qj0Var.m45524a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return gjh.m28916o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            return qj0Var.m45525b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            return qj0Var.m45526c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5799c.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5799c.m42326k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return hk0.m30674a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            qj0Var.m45528e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5799c;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5799c;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(gjh.m28917p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m28943e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5798b;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            qj0Var.m45529f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        qj0 qj0Var = this.f5797a;
        if (qj0Var != null) {
            qj0Var.m45530g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5799c.m42338w(colorStateList);
        this.f5799c.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5799c.m42339x(mode);
        this.f5799c.m42318b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ok0 ok0Var = this.f5799c;
        if (ok0Var != null) {
            ok0Var.m42332q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        dkh.m23377a(this, getContext());
        ok0 ok0Var = new ok0(this);
        this.f5799c = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        ok0Var.m42318b();
        oj0 oj0Var = new oj0(this);
        this.f5798b = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        qj0 qj0Var = new qj0(this);
        this.f5797a = qj0Var;
        qj0Var.m45527d(attributeSet, i);
        getEmojiTextViewHelper().m28941c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(lk0.m37353b(getContext(), i));
    }
}
