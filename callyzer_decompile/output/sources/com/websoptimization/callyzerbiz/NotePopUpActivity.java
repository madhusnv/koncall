package com.websoptimization.callyzerbiz;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import aq.C0403f;
import bv.C0784b;
import c9.C0914i;
import com.websoptimization.callyzerbiz.services.NotePopupService;
import d7.b1;
import d7.y0;
import g7.AbstractC2538c;
import gm.C2653v;
import gw.C2740b;
import iw.InterfaceC3359b;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import og.pf;
import p004e.AbstractActivityC1878m;
import p005f.AbstractC2159h;
import s2.C6734c;
import si.C6847c;
import yv.C8791f;
import yv.C8805t;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class NotePopUpActivity extends AbstractActivityC1878m implements InterfaceC3359b {

    /* renamed from: g */
    public static final /* synthetic */ int f7268g = 0;

    /* renamed from: a */
    public C8989c f7269a;

    /* renamed from: b */
    public volatile C2740b f7270b;

    /* renamed from: c */
    public final Object f7271c = new Object();

    /* renamed from: d */
    public boolean f7272d = false;

    /* renamed from: e */
    public final String f7273e;

    /* renamed from: f */
    public C8805t f7274f;

    public NotePopUpActivity() {
        addOnContextAvailableListener(new C2653v(this, 2));
        this.f7273e = "NotePopUpActivity";
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        return m4588e().mo1432a();
    }

    /* renamed from: e */
    public final C2740b m4588e() {
        if (this.f7270b == null) {
            synchronized (this.f7271c) {
                try {
                    if (this.f7270b == null) {
                        this.f7270b = new C2740b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.f7270b;
    }

    /* renamed from: f */
    public final void m4589f(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC3359b) {
            C8989c c8989cM6736c = m4588e().m6736c();
            this.f7269a = c8989cM6736c;
            if (((AbstractC2538c) c8989cM6736c.f43339b) == null) {
                c8989cM6736c.f43339b = getDefaultViewModelCreationExtras();
            }
        }
    }

    /* renamed from: g */
    public final void m4590g() {
        C8805t c8805t = this.f7274f;
        if (c8805t == null) {
            AbstractC4154l.m8928k("traceLogs");
            throw null;
        }
        c8805t.m16231f("NotePopUpActivity >>> stopping foreground service");
        C8791f c8791f = C8791f.f42457a;
        String name = NotePopupService.class.getName();
        try {
            Object systemService = getSystemService("activity");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(250).iterator();
            while (it.hasNext()) {
                if (AbstractC4154l.m8918a(it.next().service.getClassName(), name)) {
                    try {
                        stopService(new Intent(getApplicationContext(), (Class<?>) NotePopupService.class));
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        C8805t c8805t2 = this.f7274f;
                        if (c8805t2 == null) {
                            AbstractC4154l.m8928k("traceLogs");
                            throw null;
                        }
                        c8805t2.m16234i(this.f7273e, e2);
                        C6847c.m13044a().m13046c(e2);
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e10.toString();
        }
    }

    @Override // p004e.AbstractActivityC1878m, d7.InterfaceC1637j
    public final y0 getDefaultViewModelProviderFactory() {
        return pf.m10843a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m4589f(bundle);
        C8805t c8805t = this.f7274f;
        if (c8805t == null) {
            AbstractC4154l.m8928k("traceLogs");
            throw null;
        }
        c8805t.m16231f("NotePopUpActivity started>>");
        C4147e c4147eM8901a = a0.m8901a(C0784b.class);
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
        AbstractC2159h.m5821a(this, new C6734c(new C0403f(18, (C0784b) c0914i.m2630j(c4147eM8901a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM8913b)), this), true, -1983679994));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C8989c c8989c = this.f7269a;
        if (c8989c != null) {
            c8989c.f43339b = null;
        }
    }
}
