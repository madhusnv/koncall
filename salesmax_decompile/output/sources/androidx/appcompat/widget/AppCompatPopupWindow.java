package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p001o.anh;
import p001o.bbe;
import p001o.oed;

/* loaded from: classes2.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    public static final boolean f5818b = false;

    /* renamed from: a */
    public boolean f5819a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4212a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public final void m4212a(Context context, AttributeSet attributeSet, int i, int i2) {
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.PopupWindow, i, i2);
        if (anhVarM17525v.m17544s(bbe.PopupWindow_overlapAnchor)) {
            m4213b(anhVarM17525v.m17526a(bbe.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(anhVarM17525v.m17532g(bbe.PopupWindow_android_popupBackground));
        anhVarM17525v.m17546x();
    }

    /* renamed from: b */
    public final void m4213b(boolean z) {
        if (f5818b) {
            this.f5819a = z;
        } else {
            oed.m42133a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f5818b && this.f5819a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f5818b && this.f5819a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4212a(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f5818b && this.f5819a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
