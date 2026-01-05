package fk;

import an.j2;
import android.content.Context;
import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import ik.C3291o;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import o6.InterfaceC5304f;
import pw.InterfaceC6043a;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.t */
/* loaded from: classes.dex */
public final class C2314t implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10479a = 0;

    /* renamed from: b */
    public final InterfaceC6043a f10480b;

    /* renamed from: c */
    public final InterfaceC2963c f10481c;

    /* renamed from: d */
    public final InterfaceC6043a f10482d;

    public C2314t(m0 m0Var, InterfaceC2963c interfaceC2963c, InterfaceC2963c interfaceC2963c2) {
        this.f10480b = m0Var;
        this.f10482d = interfaceC2963c;
        this.f10481c = interfaceC2963c2;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f10479a) {
            case 0:
                Context appContext = (Context) ((m0) this.f10482d).f10459b;
                InterfaceC7564h blockingDispatcher = (InterfaceC7564h) this.f10480b.get();
                l0 sessionDataSerializer = (l0) this.f10481c.get();
                AbstractC4154l.m8923f(appContext, "appContext");
                AbstractC4154l.m8923f(blockingDispatcher, "blockingDispatcher");
                AbstractC4154l.m8923f(sessionDataSerializer, "sessionDataSerializer");
                return C2311q.m5982b(sessionDataSerializer, new C4327p(14, new j2(13, sessionDataSerializer)), tx.c0.m13479b(blockingDispatcher), new C2310p(appContext, 1));
            default:
                return new C3291o((InterfaceC7564h) this.f10480b.get(), (m1) this.f10482d.get(), (InterfaceC5304f) this.f10481c.get());
        }
    }

    public C2314t(m0 m0Var, m0 m0Var2, InterfaceC2963c interfaceC2963c) {
        this.f10482d = m0Var;
        this.f10480b = m0Var2;
        this.f10481c = interfaceC2963c;
    }
}
