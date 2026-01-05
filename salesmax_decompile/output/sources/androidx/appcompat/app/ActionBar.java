package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p001o.bbe;
import p001o.vm;

/* loaded from: classes2.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public static abstract class AbstractC1754a {
    }

    /* renamed from: g */
    public boolean mo3738g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo3739h();

    /* renamed from: i */
    public abstract void mo3740i(boolean z);

    /* renamed from: j */
    public abstract int mo3741j();

    /* renamed from: k */
    public abstract Context mo3742k();

    /* renamed from: l */
    public boolean mo3743l() {
        return false;
    }

    /* renamed from: m */
    public void mo3744m(Configuration configuration) {
    }

    /* renamed from: n */
    public void mo3745n() {
    }

    /* renamed from: o */
    public abstract boolean mo3746o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo3747p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo3748q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo3749r(boolean z);

    /* renamed from: s */
    public abstract void mo3750s(boolean z);

    /* renamed from: t */
    public abstract void mo3751t(int i);

    /* renamed from: u */
    public abstract void mo3752u(boolean z);

    /* renamed from: v */
    public abstract void mo3753v(CharSequence charSequence);

    /* renamed from: w */
    public abstract void mo3754w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo3755x(CharSequence charSequence);

    /* renamed from: y */
    public vm mo3756y(vm.InterfaceC17615a interfaceC17615a) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f5276a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5276a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ActionBarLayout);
            this.f5276a = typedArrayObtainStyledAttributes.getInt(bbe.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f5276a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f5276a = 0;
            this.f5276a = layoutParams.f5276a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5276a = 0;
        }
    }
}
