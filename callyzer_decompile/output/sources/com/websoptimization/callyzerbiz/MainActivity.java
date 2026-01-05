package com.websoptimization.callyzerbiz;

import a1.c0;
import a9.C0065d;
import an.j2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.d1;
import ay.C0496f;
import ay.ExecutorC0495e;
import ba.C0636f;
import c6.a2;
import c6.b2;
import c6.c2;
import c6.z1;
import c9.C0914i;
import c9.C0927v;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.google.android.play.core.install.InstallException;
import d7.b1;
import d7.y0;
import dr.C1770t;
import eb.g2;
import g7.AbstractC2538c;
import gm.C2653v;
import gm.C2655x;
import gm.C2657z;
import gw.C2740b;
import h6.C2856l;
import im.EnumC3323y;
import iw.InterfaceC3359b;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l4.C4367l;
import l7.AbstractC4422v;
import l7.a0;
import l7.d0;
import og.ga;
import og.jd;
import og.nd;
import og.pf;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p004e.AbstractActivityC1878m;
import p004e.AbstractC1880o;
import p004e.C1881p;
import p004e.C1882q;
import p004e.C1883r;
import p004e.C1884s;
import p004e.C1885t;
import p004e.f0;
import p004e.g0;
import p005f.AbstractC2159h;
import p007h.AbstractC2751c;
import p007h.C2759k;
import pg.l8;
import q7.C6138e;
import qw.C6366p;
import rw.AbstractC6663m;
import s2.C6734c;
import th.AbstractC7152b;
import th.C7151a;
import th.C7154d;
import th.C7155e;
import th.C7156f;
import th.C7158h;
import th.C7160j;
import tx.m0;
import uh.C7469n;
import uw.InterfaceC7559c;
import wx.C8203d;
import xv.C8489p;
import yg.AbstractC8651h;
import yg.C8650g;
import yg.C8656m;
import yv.C8805t;
import z5.C8870c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class MainActivity extends AbstractActivityC1878m implements InterfaceC3359b {

    /* renamed from: m */
    public static final /* synthetic */ int f7256m = 0;

    /* renamed from: a */
    public C8989c f7257a;

    /* renamed from: b */
    public volatile C2740b f7258b;

    /* renamed from: c */
    public final Object f7259c = new Object();

    /* renamed from: d */
    public boolean f7260d = false;

    /* renamed from: e */
    public C8805t f7261e;

    /* renamed from: f */
    public C7154d f7262f;

    /* renamed from: g */
    public a0 f7263g;

    /* renamed from: h */
    public a0 f7264h;

    /* renamed from: j */
    public final C6366p f7265j;

    /* renamed from: k */
    public C8489p f7266k;

    /* renamed from: l */
    public final AbstractC2751c f7267l;

    public MainActivity() {
        addOnContextAvailableListener(new C2653v(this, 1));
        this.f7265j = nd.m10782c(new C1226a(18));
        this.f7267l = registerForActivityResult(new d1(7), new C2657z(0));
    }

    /* renamed from: e */
    public static final void m4582e(MainActivity mainActivity, C0636f c0636f) {
        C8656m c8656mM11764e;
        C7154d c7154d = mainActivity.f7262f;
        if (c7154d == null) {
            AbstractC4154l.m8928k("appUpdateManager");
            throw null;
        }
        C7158h c7158h = c7154d.f34391a;
        String packageName = c7154d.f34392b.getPackageName();
        g2 g2Var = C7158h.f34402e;
        C7469n c7469n = c7158h.f34404a;
        if (c7469n == null) {
            Object[] objArr = {-9};
            g2Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                g2.m5718f(g2Var.f9320a, "onError(%d)", objArr);
            }
            c8656mM11764e = l8.m11764e(new InstallException(-9));
        } else {
            g2Var.m5720e("requestUpdateInfo(%s)", packageName);
            C8650g c8650g = new C8650g();
            c7469n.m14273a().post(new C7156f(c7469n, c8650g, c8650g, new C7156f(c7158h, c8650g, packageName, c8650g)));
            c8656mM11764e = c8650g.f41930a;
        }
        AbstractC4154l.m8922e(c8656mM11764e, "getAppUpdateInfo(...)");
        c8656mM11764e.m15979f(AbstractC8651h.f41931a, new c0(13, new j2(16, c0636f)));
        c8656mM11764e.m15978e(new gm.a0(mainActivity));
    }

    /* renamed from: f */
    public static final void m4583f(MainActivity mainActivity, C7151a c7151a, int i10) {
        try {
            if (mainActivity.f7262f == null) {
                AbstractC4154l.m8928k("appUpdateManager");
                throw null;
            }
            AbstractC2751c abstractC2751c = mainActivity.f7267l;
            byte b10 = (byte) (((byte) (0 | 1)) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" appUpdateType");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" allowAssetPackDeletion");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            C7160j c7160j = new C7160j(i10);
            if (abstractC2751c != null && c7151a.m13414a(c7160j) != null && !c7151a.f34389f) {
                c7151a.f34389f = true;
                IntentSender intentSender = c7151a.m13414a(c7160j).getIntentSender();
                AbstractC4154l.m8923f(intentSender, "intentSender");
                abstractC2751c.mo1274a(new C2759k(intentSender, null, 0, 0));
            }
        } catch (Exception e2) {
            e2.getMessage();
            C8805t c8805t = mainActivity.f7261e;
            if (c8805t != null) {
                c8805t.m16240o("In-App-Updates", AbstractC5601a.m11238i("checkForUpdate addOnFailureListener ", e2.getMessage(), " "), e2);
            } else {
                AbstractC4154l.m8928k("traceLogs");
                throw null;
            }
        }
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        return m4584g().mo1432a();
    }

    /* renamed from: g */
    public final C2740b m4584g() {
        if (this.f7258b == null) {
            synchronized (this.f7259c) {
                try {
                    if (this.f7258b == null) {
                        this.f7258b = new C2740b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.f7258b;
    }

    @Override // p004e.AbstractActivityC1878m, d7.InterfaceC1637j
    public final y0 getDefaultViewModelProviderFactory() {
        return pf.m10843a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: h */
    public final void m4585h(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC3359b) {
            C8989c c8989cM6736c = m4584g().m6736c();
            this.f7257a = c8989cM6736c;
            if (((AbstractC2538c) c8989cM6736c.f43339b) == null) {
                c8989cM6736c.f43339b = getDefaultViewModelCreationExtras();
            }
        }
    }

    /* renamed from: i */
    public final void m4586i() {
        super.onDestroy();
        C8989c c8989c = this.f7257a;
        if (c8989c != null) {
            c8989c.f43339b = null;
        }
    }

    /* renamed from: j */
    public final void m4587j(int i10, boolean z6) {
        getWindow().setStatusBarColor(getColor(i10));
        getWindow().setNavigationBarColor(getColor(i10));
        Window window = getWindow();
        getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        ga c2Var = i11 >= 35 ? new c2(window) : i11 >= 30 ? new b2(window) : i11 >= 26 ? new a2(window) : new z1(window);
        boolean z10 = !z6;
        c2Var.mo2344c(z10);
        c2Var.mo2334b(z10);
    }

    @Override // p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C7155e c7155e;
        m4585h(bundle);
        C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(C8489p.class);
        b1 store = getViewModelStore();
        y0 defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        AbstractC2538c extras = getDefaultViewModelCreationExtras();
        AbstractC4154l.m8923f(store, "store");
        AbstractC4154l.m8923f(extras, "extras");
        C0914i c0914i = new C0914i(store, defaultViewModelProviderFactory, extras);
        String strM8913b = c4147eM8901a.m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f7266k = (C8489p) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b));
        synchronized (AbstractC7152b.class) {
            try {
                if (AbstractC7152b.f34390a == null) {
                    Context applicationContext = getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = this;
                    }
                    AbstractC7152b.f34390a = new C7155e(new C2856l(applicationContext, false));
                }
                c7155e = AbstractC7152b.f34390a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C7154d c7154d = (C7154d) c7155e.f34393a.zza();
        AbstractC4154l.m8922e(c7154d, "create(...)");
        this.f7262f = c7154d;
        C8489p c8489p = this.f7266k;
        InterfaceC7559c interfaceC7559c = null;
        if (c8489p == null) {
            AbstractC4154l.m8928k("permissionsViewModel");
            throw null;
        }
        C8203d c8203d = c8489p.f41347C;
        C0496f c0496f = m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C1770t(c8203d, this, interfaceC7559c, 26), 3);
        int i10 = Build.VERSION.SDK_INT;
        C0927v c8870c = i10 >= 31 ? new C8870c(this) : new C0927v(this);
        c8870c.mo2704l();
        c8870c.mo2707q(new gm.a0(this));
        int i11 = AbstractC1880o.f8896a;
        f0 f0Var = f0.f8881a;
        g0 g0Var = new g0(0, 0, f0Var);
        g0 g0Var2 = new g0(AbstractC1880o.f8896a, AbstractC1880o.f8897b, f0Var);
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        AbstractC4154l.m8922e(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) f0Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        AbstractC4154l.m8922e(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) f0Var.invoke(resources2)).booleanValue();
        jd c1885t = i10 >= 30 ? new C1885t() : i10 >= 29 ? new C1884s() : i10 >= 28 ? new C1883r() : i10 >= 26 ? new C1882q() : new C1881p();
        Window window = getWindow();
        AbstractC4154l.m8922e(window, "window");
        c1885t.mo5512f(g0Var, g0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        AbstractC4154l.m8922e(window2, "window");
        c1885t.mo5513e(window2);
        AbstractC2159h.m5821a(this, new C6734c(new C2655x(this, 1), true, -1665206128));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m4586i();
        C8489p c8489p = this.f7266k;
        if (c8489p == null) {
            AbstractC4154l.m8928k("permissionsViewModel");
            throw null;
        }
        C0065d c0065d = c8489p.f41353I;
        if (c0065d != null) {
            c8489p.f41354b.unregisterReceiver(c0065d);
        }
    }

    @Override // p004e.AbstractActivityC1878m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        d0 d0Var;
        AbstractC4154l.m8923f(intent, "intent");
        super.onNewIntent(intent);
        Uri data = intent.getData();
        Object obj = null;
        if (this.f7263g == null || data == null) {
            C8805t c8805t = this.f7261e;
            if (c8805t != null) {
                c8805t.m16232g("onNewIntent Deep link", " navHostController or uri is found null");
                return;
            } else {
                AbstractC4154l.m8928k("traceLogs");
                throw null;
            }
        }
        String lastPathSegment = data.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        int i10 = 2;
        if (!((List) this.f7265j.getValue()).contains(lastPathSegment)) {
            List<String> pathSegments = data.getPathSegments();
            AbstractC4154l.m8922e(pathSegments, "getPathSegments(...)");
            String popUpRoute = (String) AbstractC6663m.m12744H(pathSegments, 0);
            if (popUpRoute == null) {
                return;
            }
            EnumC3323y enumC3323y = EnumC3323y.LEAD_DETAILS_SCREEN;
            if (popUpRoute.equals(enumC3323y.getRoute())) {
                popUpRoute = enumC3323y.getPopUpRoute();
            }
            if (popUpRoute != null) {
                int i11 = AbstractC4422v.f22133f;
                d0Var = new d0(true, true, "android-app://androidx.navigation/".concat(popUpRoute).hashCode(), false, false, -1, -1, -1, -1);
                d0Var.f22025j = popUpRoute;
            } else {
                d0Var = new d0(true, true, -1, false, false, -1, -1, -1, -1);
            }
            a0 a0Var = this.f7263g;
            AbstractC4154l.m8920c(a0Var);
            a0Var.f21996b.m12179n(new C4367l(i10, data, obj, obj), d0Var);
            return;
        }
        a0 a0Var2 = this.f7264h;
        if ((a0Var2 != null ? a0Var2.f21996b.m12172g() : null) == null) {
            a0 a0Var3 = this.f7263g;
            AbstractC4154l.m8920c(a0Var3);
            C6138e c6138e = a0Var3.f21996b;
            C4367l c4367l = new C4367l(i10, data, obj, obj);
            c6138e.getClass();
            c6138e.m12179n(c4367l, null);
            return;
        }
        a0 a0Var4 = this.f7263g;
        AbstractC4154l.m8920c(a0Var4);
        a0 a0Var5 = this.f7263g;
        AbstractC4154l.m8920c(a0Var5);
        String str = a0Var5.f21996b.m12174i().f22140g.f22765d;
        AbstractC4154l.m8920c(str);
        a0.m9182h(a0Var4, str, false);
        a0 a0Var6 = this.f7264h;
        if (a0Var6 != null) {
            a0.m9181f(a0Var6, lastPathSegment);
        }
    }
}
