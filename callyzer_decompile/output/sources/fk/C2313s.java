package fk;

import android.content.Context;
import cv.C1517m;
import hk.InterfaceC2962b;
import hk.InterfaceC2963c;
import ik.C3281e;
import ik.C3285i;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import pw.InterfaceC6043a;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.s */
/* loaded from: classes.dex */
public final class C2313s implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10476a;

    /* renamed from: b */
    public final m0 f10477b;

    /* renamed from: c */
    public final InterfaceC6043a f10478c;

    public /* synthetic */ C2313s(m0 m0Var, InterfaceC2963c interfaceC2963c, int i10) {
        this.f10476a = i10;
        this.f10477b = m0Var;
        this.f10478c = interfaceC2963c;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        switch (this.f10476a) {
            case 0:
                Context appContext = (Context) this.f10477b.f10459b;
                InterfaceC7564h blockingDispatcher = (InterfaceC7564h) this.f10478c.get();
                AbstractC4154l.m8923f(appContext, "appContext");
                AbstractC4154l.m8923f(blockingDispatcher, "blockingDispatcher");
                return C2311q.m5982b(C3285i.f17498a, new C4327p(14, new C1517m(6)), tx.c0.m13479b(blockingDispatcher), new C2310p(appContext, 0));
            case 1:
                return new f0((Context) this.f10477b.f10459b, (n1) this.f10478c.get());
            default:
                return new C3281e((C2296b) this.f10478c.get(), (InterfaceC7564h) this.f10477b.f10459b);
        }
    }

    public C2313s(InterfaceC2963c interfaceC2963c, m0 m0Var) {
        this.f10476a = 2;
        this.f10478c = interfaceC2963c;
        this.f10477b = m0Var;
    }
}
