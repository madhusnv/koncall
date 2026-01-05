package p001o;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC1783b;
import androidx.appcompat.app.ActionBar;
import p001o.pc9;
import p001o.vm;

/* loaded from: classes2.dex */
public class dk0 extends fn3 implements pj0 {
    private AbstractC1783b mDelegate;
    private final pc9.InterfaceC16053a mKeyDispatcher;

    public dk0(Context context, int i) {
        super(context, m23341d(context, i));
        this.mKeyDispatcher = new pc9.InterfaceC16053a() { // from class: o.ck0
            @Override // p001o.pc9.InterfaceC16053a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f18261a.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC1783b delegate = getDelegate();
        delegate.mo3800Q(m23341d(context, i));
        delegate.mo3787A(null);
    }

    /* renamed from: d */
    public static int m23341d(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(z5e.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p001o.fn3, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo3810e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo3788B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return pc9.m43340e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public final void m23342e() {
        rzi.m47366b(getWindow().getDecorView(), this);
        tzi.m50817b(getWindow().getDecorView(), this);
        szi.m49110a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo3813l(i);
    }

    public AbstractC1783b getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC1783b.m3890k(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo3818u();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo3820w();
    }

    @Override // p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo3819v();
        super.onCreate(bundle);
        getDelegate().mo3787A(bundle);
    }

    @Override // p001o.fn3, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo3793G();
    }

    @Override // p001o.pj0
    public void onSupportActionModeFinished(vm vmVar) {
    }

    @Override // p001o.pj0
    public void onSupportActionModeStarted(vm vmVar) {
    }

    @Override // p001o.pj0
    public vm onWindowStartingSupportActionMode(vm.InterfaceC17615a interfaceC17615a) {
        return null;
    }

    @Override // p001o.fn3, android.app.Dialog
    public void setContentView(int i) {
        m23342e();
        getDelegate().mo3795K(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo3801R(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo3794J(i);
    }

    @Override // p001o.fn3, android.app.Dialog
    public void setContentView(View view) {
        m23342e();
        getDelegate().mo3796L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo3801R(getContext().getString(i));
    }

    @Override // p001o.fn3, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m23342e();
        getDelegate().mo3797M(view, layoutParams);
    }
}
