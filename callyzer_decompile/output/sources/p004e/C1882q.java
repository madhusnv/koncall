package p004e;

import android.os.Build;
import android.view.View;
import android.view.Window;
import c6.a2;
import c6.b2;
import c6.c2;
import c6.z1;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import og.ga;
import og.jd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.q */
/* loaded from: classes.dex */
public class C1882q extends jd {
    @Override // og.jd
    /* renamed from: f */
    public void mo5512f(g0 statusBarStyle, g0 navigationBarStyle, Window window, View view, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(statusBarStyle, "statusBarStyle");
        AbstractC4154l.m8923f(navigationBarStyle, "navigationBarStyle");
        AbstractC4154l.m8923f(window, "window");
        AbstractC4154l.m8923f(view, "view");
        AbstractC5179q.m10121c(window, false);
        window.setStatusBarColor(z6 ? statusBarStyle.f8883b : statusBarStyle.f8882a);
        window.setNavigationBarColor(z10 ? navigationBarStyle.f8883b : navigationBarStyle.f8882a);
        int i10 = Build.VERSION.SDK_INT;
        ga c2Var = i10 >= 35 ? new c2(window) : i10 >= 30 ? new b2(window) : i10 >= 26 ? new a2(window) : new z1(window);
        c2Var.mo2344c(!z6);
        c2Var.mo2334b(!z10);
    }
}
