package z5;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c9.C0927v;
import com.websoptimization.callyzerbiz.MainActivity;
import gm.a0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z5.c */
/* loaded from: classes.dex */
public final class C8870c extends C0927v {

    /* renamed from: d */
    public ViewTreeObserverOnPreDrawListenerC8868a f42686d;

    /* renamed from: e */
    public final ViewGroupOnHierarchyChangeListenerC8869b f42687e;

    public C8870c(MainActivity mainActivity) {
        super(mainActivity);
        this.f42687e = new ViewGroupOnHierarchyChangeListenerC8869b(this, mainActivity);
    }

    @Override // c9.C0927v
    /* renamed from: l */
    public final void mo2704l() {
        MainActivity mainActivity = (MainActivity) this.f5668b;
        Resources.Theme theme = mainActivity.getTheme();
        AbstractC4154l.m8922e(theme, "getTheme(...)");
        m2708r(theme, new TypedValue());
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            AbstractC4154l.m8921d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f42687e);
        }
    }

    @Override // c9.C0927v
    /* renamed from: q */
    public final void mo2707q(a0 a0Var) {
        this.f5669c = a0Var;
        View viewFindViewById = ((MainActivity) this.f5668b).findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.f42686d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f42686d);
        }
        ViewTreeObserverOnPreDrawListenerC8868a viewTreeObserverOnPreDrawListenerC8868a = new ViewTreeObserverOnPreDrawListenerC8868a(this, viewFindViewById, 1);
        this.f42686d = viewTreeObserverOnPreDrawListenerC8868a;
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8868a);
    }
}
