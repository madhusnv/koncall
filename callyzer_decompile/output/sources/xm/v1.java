package xm;

import dy.InterfaceC1853a;
import kn.C4121a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v1 extends AbstractC8193c {

    /* renamed from: a */
    public C4121a f40925a;

    /* renamed from: b */
    public InterfaceC1853a f40926b;

    /* renamed from: c */
    public int f40927c;

    /* renamed from: d */
    public /* synthetic */ Object f40928d;

    /* renamed from: e */
    public final /* synthetic */ x1 f40929e;

    /* renamed from: f */
    public int f40930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40929e = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40928d = obj;
        this.f40930f |= Integer.MIN_VALUE;
        return this.f40929e.m15658I(null, this);
    }
}
