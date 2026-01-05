package fk;

import android.content.Context;
import hk.InterfaceC2962b;
import ik.C3277a;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import qj.InterfaceC6237b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.m */
/* loaded from: classes.dex */
public final class C2307m implements InterfaceC2962b {

    /* renamed from: a */
    public final /* synthetic */ int f10456a;

    /* renamed from: b */
    public final m0 f10457b;

    public /* synthetic */ C2307m(m0 m0Var, int i10) {
        this.f10456a = i10;
        this.f10457b = m0Var;
    }

    @Override // pw.InterfaceC6043a
    public final Object get() {
        int i10 = this.f10456a;
        m0 m0Var = this.f10457b;
        switch (i10) {
            case 0:
                return new C2306l((InterfaceC6237b) m0Var.f10459b);
            case 1:
                C3773g firebaseApp = (C3773g) m0Var.f10459b;
                AbstractC4154l.m8923f(firebaseApp, "firebaseApp");
                r0 r0Var = r0.f10474a;
                return r0.m5984a(firebaseApp);
            default:
                return new C3277a((Context) m0Var.f10459b);
        }
    }
}
