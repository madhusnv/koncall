package com.websoptimization.callyzerbiz;

import android.os.Bundle;
import d7.y0;
import g7.AbstractC2538c;
import gm.C2632a;
import gm.C2653v;
import gw.C2740b;
import iw.InterfaceC3359b;
import og.pf;
import p004e.AbstractActivityC1878m;
import p005f.AbstractC2159h;
import s2.C6734c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingAttachActivity extends AbstractActivityC1878m implements InterfaceC3359b {

    /* renamed from: e */
    public static final /* synthetic */ int f7248e = 0;

    /* renamed from: a */
    public C8989c f7249a;

    /* renamed from: b */
    public volatile C2740b f7250b;

    /* renamed from: c */
    public final Object f7251c = new Object();

    /* renamed from: d */
    public boolean f7252d = false;

    public CallRecordingAttachActivity() {
        addOnContextAvailableListener(new C2653v(this, 0));
    }

    @Override // iw.InterfaceC3359b
    /* renamed from: a */
    public final Object mo1432a() {
        return m4580e().mo1432a();
    }

    /* renamed from: e */
    public final C2740b m4580e() {
        if (this.f7250b == null) {
            synchronized (this.f7251c) {
                try {
                    if (this.f7250b == null) {
                        this.f7250b = new C2740b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.f7250b;
    }

    /* renamed from: f */
    public final void m4581f(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof InterfaceC3359b) {
            C8989c c8989cM6736c = m4580e().m6736c();
            this.f7249a = c8989cM6736c;
            if (((AbstractC2538c) c8989cM6736c.f43339b) == null) {
                c8989cM6736c.f43339b = getDefaultViewModelCreationExtras();
            }
        }
    }

    @Override // p004e.AbstractActivityC1878m, d7.InterfaceC1637j
    public final y0 getDefaultViewModelProviderFactory() {
        return pf.m10843a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // p004e.AbstractActivityC1878m, q5.AbstractActivityC6110c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m4581f(bundle);
        AbstractC2159h.m5821a(this, new C6734c(new C2632a(this, 0), true, 62061066));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C8989c c8989c = this.f7249a;
        if (c8989c != null) {
            c8989c.f43339b = null;
        }
    }
}
