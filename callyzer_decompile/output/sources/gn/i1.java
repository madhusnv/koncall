package gn;

import dy.InterfaceC1853a;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f14564a;

    /* renamed from: b */
    public InterfaceC1853a f14565b;

    /* renamed from: c */
    public int f14566c;

    /* renamed from: d */
    public /* synthetic */ Object f14567d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14568e;

    /* renamed from: f */
    public int f14569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14568e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14567d = obj;
        this.f14569f |= Integer.MIN_VALUE;
        return this.f14568e.g0(null, this);
    }
}
