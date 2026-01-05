package p004e;

import a1.RunnableC0024w;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import aw.C0465e;
import com.websoptimization.callyzerbiz.R;
import d7.AbstractC1646r;
import d7.C1651w;
import d7.EnumC1644p;
import d7.InterfaceC1649u;
import d7.q0;
import g8.C2545e;
import g8.C2546f;
import g8.InterfaceC2547g;
import i8.C3182a;
import kotlin.jvm.internal.AbstractC4154l;
import og.gg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.n */
/* loaded from: classes.dex */
public class DialogC1879n extends Dialog implements InterfaceC1649u, e0, InterfaceC2547g {

    /* renamed from: a */
    public C1651w f8893a;

    /* renamed from: b */
    public final C2546f f8894b;

    /* renamed from: c */
    public final c0 f8895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1879n(Context context, int i10) {
        super(context, i10);
        AbstractC4154l.m8923f(context, "context");
        this.f8894b = new C2546f(new C3182a(this, new C0465e(9, this)));
        this.f8895c = new c0(new RunnableC0024w(14, this));
    }

    /* renamed from: a */
    public static void m5510a(DialogC1879n dialogC1879n) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC4154l.m8923f(view, "view");
        m5511b();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final void m5511b() {
        Window window = getWindow();
        AbstractC4154l.m8920c(window);
        View decorView = window.getDecorView();
        AbstractC4154l.m8922e(decorView, "window!!.decorView");
        q0.m5341h(decorView, this);
        Window window2 = getWindow();
        AbstractC4154l.m8920c(window2);
        View decorView2 = window2.getDecorView();
        AbstractC4154l.m8922e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC4154l.m8920c(window3);
        View decorView3 = window3.getDecorView();
        AbstractC4154l.m8922e(decorView3, "window!!.decorView");
        gg.m10676c(decorView3, this);
    }

    @Override // d7.InterfaceC1649u
    public final AbstractC1646r getLifecycle() {
        C1651w c1651w = this.f8893a;
        if (c1651w != null) {
            return c1651w;
        }
        C1651w c1651w2 = new C1651w(this);
        this.f8893a = c1651w2;
        return c1651w2;
    }

    @Override // p004e.e0
    public final c0 getOnBackPressedDispatcher() {
        return this.f8895c;
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        return this.f8894b.f13877b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f8895c.m5502c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC4154l.m8922e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c0 c0Var = this.f8895c;
            c0Var.f8871e = onBackInvokedDispatcher;
            c0Var.m5503d(c0Var.f8873g);
        }
        this.f8894b.m6568b(bundle);
        C1651w c1651w = this.f8893a;
        if (c1651w == null) {
            c1651w = new C1651w(this);
            this.f8893a = c1651w;
        }
        c1651w.m5355g(EnumC1644p.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC4154l.m8922e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f8894b.m6569c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1651w c1651w = this.f8893a;
        if (c1651w == null) {
            c1651w = new C1651w(this);
            this.f8893a = c1651w;
        }
        c1651w.m5355g(EnumC1644p.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C1651w c1651w = this.f8893a;
        if (c1651w == null) {
            c1651w = new C1651w(this);
            this.f8893a = c1651w;
        }
        c1651w.m5355g(EnumC1644p.ON_DESTROY);
        this.f8893a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        m5511b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        AbstractC4154l.m8923f(view, "view");
        m5511b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC4154l.m8923f(view, "view");
        m5511b();
        super.setContentView(view, layoutParams);
    }
}
