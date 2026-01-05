package p001o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.C2144m;

/* loaded from: classes2.dex */
public class fn3 extends Dialog implements xca, hbc, h1f {
    private C2144m _lifecycleRegistry;
    private final ebc onBackPressedDispatcher;
    private final g1f savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn3(Context context, int i) {
        super(context, i);
        sq8.m48649h(context, "context");
        this.savedStateRegistryController = g1f.f24466d.m27980a(this);
        this.onBackPressedDispatcher = new ebc(new Runnable() { // from class: o.en3
            @Override // java.lang.Runnable
            public final void run() {
                fn3.m27121c(this.f21945a);
            }
        });
    }

    /* renamed from: c */
    public static final void m27121c(fn3 fn3Var) {
        sq8.m48649h(fn3Var, "this$0");
        super.onBackPressed();
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        sq8.m48649h(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final C2144m m27122b() {
        C2144m c2144m = this._lifecycleRegistry;
        if (c2144m != null) {
            return c2144m;
        }
        C2144m c2144m2 = new C2144m(this);
        this._lifecycleRegistry = c2144m2;
        return c2144m2;
    }

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        return m27122b();
    }

    @Override // p001o.hbc
    public final ebc getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // p001o.h1f
    public f1f getSavedStateRegistry() {
        return this.savedStateRegistryController.m27976b();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        sq8.m48646e(window);
        View decorView = window.getDecorView();
        sq8.m48648g(decorView, "window!!.decorView");
        rzi.m47366b(decorView, this);
        Window window2 = getWindow();
        sq8.m48646e(window2);
        View decorView2 = window2.getDecorView();
        sq8.m48648g(decorView2, "window!!.decorView");
        szi.m49110a(decorView2, this);
        Window window3 = getWindow();
        sq8.m48646e(window3);
        View decorView3 = window3.getDecorView();
        sq8.m48648g(decorView3, "window!!.decorView");
        tzi.m50817b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m24715l();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ebc ebcVar = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            sq8.m48648g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            ebcVar.m24718o(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m27978d(bundle);
        m27122b().m6538i(AbstractC2139h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        sq8.m48648g(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m27979e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m27122b().m6538i(AbstractC2139h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m27122b().m6538i(AbstractC2139h.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        sq8.m48649h(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        sq8.m48649h(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
