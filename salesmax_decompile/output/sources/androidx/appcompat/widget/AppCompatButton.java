package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p001o.dkh;
import p001o.gjh;
import p001o.gk0;
import p001o.oj0;
import p001o.ok0;
import p001o.xmh;
import p001o.yzi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatButton extends Button {

    /* renamed from: a */
    public final oj0 f5790a;

    /* renamed from: b */
    public final ok0 f5791b;

    /* renamed from: c */
    public gk0 f5792c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.f5792c == null) {
            this.f5792c = new gk0(this);
        }
        return this.f5792c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (yzi.f56345c) {
            return super.getAutoSizeMaxTextSize();
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            return ok0Var.m42320e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (yzi.f56345c) {
            return super.getAutoSizeMinTextSize();
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            return ok0Var.m42321f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (yzi.f56345c) {
            return super.getAutoSizeStepGranularity();
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            return ok0Var.m42322g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (yzi.f56345c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ok0 ok0Var = this.f5791b;
        return ok0Var != null ? ok0Var.m42323h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (yzi.f56345c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            return ok0Var.m42324i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return gjh.m28916o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5791b.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5791b.m42326k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42330o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ok0 ok0Var = this.f5791b;
        if ((ok0Var == null || yzi.f56345c || !ok0Var.m42327l()) ? false : true) {
            this.f5791b.m42319c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (yzi.f56345c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42335t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (yzi.f56345c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42336u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (yzi.f56345c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42337v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(gjh.m28917p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m28943e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m28939a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42334s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5790a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5791b.m42338w(colorStateList);
        this.f5791b.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5791b.m42339x(mode);
        this.f5791b.m42318b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42332q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (yzi.f56345c) {
            super.setTextSize(i, f);
            return;
        }
        ok0 ok0Var = this.f5791b;
        if (ok0Var != null) {
            ok0Var.m42314A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5790a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5791b = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        ok0Var.m42318b();
        getEmojiTextViewHelper().m28941c(attributeSet, i);
    }
}
