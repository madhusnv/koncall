package d9;

import d7.f0;
import d7.h0;
import e9.InterfaceC1970a;
import p016r.InterfaceC6409a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.g */
/* loaded from: classes.dex */
public final class C1662g implements h0 {

    /* renamed from: a */
    public Object f8181a = null;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1970a f8182b;

    /* renamed from: c */
    public final /* synthetic */ Object f8183c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6409a f8184d;

    /* renamed from: e */
    public final /* synthetic */ f0 f8185e;

    public C1662g(InterfaceC1970a interfaceC1970a, Object obj, InterfaceC6409a interfaceC6409a, f0 f0Var) {
        this.f8182b = interfaceC1970a;
        this.f8183c = obj;
        this.f8184d = interfaceC6409a;
        this.f8185e = f0Var;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        this.f8182b.m5712a(new RunnableC8956c(4, this, obj, false));
    }
}
