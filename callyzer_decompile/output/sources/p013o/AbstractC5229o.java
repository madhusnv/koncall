package p013o;

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
import com.websoptimization.callyzerbiz.R;
import g6.InterfaceC2527b;
import iz.C3378k;
import java.lang.reflect.InvocationTargetException;
import og.bg;
import pg.g6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.o */
/* loaded from: classes.dex */
public abstract class AbstractC5229o extends Button implements InterfaceC2527b {

    /* renamed from: a */
    public final C5228n f25591a;

    /* renamed from: b */
    public final f0 f25592b;

    /* renamed from: c */
    public C5235u f25593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5229o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        w1.m10301a(context);
        v1.m10297a(getContext(), this);
        C5228n c5228n = new C5228n(this);
        this.f25591a = c5228n;
        c5228n.m10258d(attributeSet, R.attr.materialButtonStyle);
        f0 f0Var = new f0(this);
        this.f25592b = f0Var;
        f0Var.m10229d(attributeSet, R.attr.materialButtonStyle);
        f0Var.m10228b();
        getEmojiTextViewHelper().m10290a(attributeSet, R.attr.materialButtonStyle);
    }

    private C5235u getEmojiTextViewHelper() {
        if (this.f25593c == null) {
            this.f25593c = new C5235u(this);
        }
        return this.f25593c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l2.f25576a) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25600e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l2.f25576a) {
            return super.getAutoSizeMinTextSize();
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25599d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l2.f25576a) {
            return super.getAutoSizeStepGranularity();
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25598c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l2.f25576a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f0 f0Var = this.f25592b;
        return f0Var != null ? f0Var.f25488i.f25601f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (l2.f25576a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            return f0Var.f25488i.f25596a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return bg.m10564f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C3378k c3378k = this.f25592b.f25487h;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C3378k c3378k = this.f25592b.f25487h;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
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
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        f0 f0Var = this.f25592b;
        if (f0Var == null || l2.f25576a) {
            return;
        }
        f0Var.f25488i.m10266a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            o0 o0Var = f0Var.f25488i;
            if (l2.f25576a || !o0Var.m10268e()) {
                return;
            }
            o0Var.m10266a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11654f(z6);
    }

    @Override // android.widget.TextView, g6.InterfaceC2527b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.m10231f(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.m10232g(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.m10233h(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(bg.m10565g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11655g(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11652a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.f25480a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.f25591a;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f25592b;
        f0Var.m10234i(colorStateList);
        f0Var.m10228b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f25592b;
        f0Var.m10235j(mode);
        f0Var.m10228b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            f0Var.m10230e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z6 = l2.f25576a;
        if (z6) {
            super.setTextSize(i10, f6);
            return;
        }
        f0 f0Var = this.f25592b;
        if (f0Var != null) {
            o0 o0Var = f0Var.f25488i;
            if (z6 || o0Var.m10268e()) {
                return;
            }
            o0Var.m10269f(f6, i10);
        }
    }
}
