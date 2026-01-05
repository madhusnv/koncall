package fk;

import kotlin.jvm.internal.AbstractC4154l;
import qj.InterfaceC6237b;
import ue.C7419a;
import ue.C7421c;
import ue.EnumC7422d;
import ue.InterfaceC7424f;
import w3.C7892j;
import xe.C8363o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.l */
/* loaded from: classes.dex */
public final class C2306l {

    /* renamed from: a */
    public final InterfaceC6237b f10451a;

    public C2306l(InterfaceC6237b transportFactoryProvider) {
        AbstractC4154l.m8923f(transportFactoryProvider, "transportFactoryProvider");
        this.f10451a = transportFactoryProvider;
    }

    /* renamed from: a */
    public final void m5976a(q0 q0Var) {
        ((C8363o) ((InterfaceC7424f) this.f10451a.get())).m15534a("FIREBASE_APPQUALITY_SESSION", new C7421c("json"), new a1.c0(12, this)).m15535a(new C7419a(q0Var, EnumC7422d.DEFAULT, null), new C7892j(12));
    }
}
