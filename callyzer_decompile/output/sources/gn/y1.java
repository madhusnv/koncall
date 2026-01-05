package gn;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y1 extends AbstractC8193c {

    /* renamed from: a */
    public int f14979a;

    /* renamed from: b */
    public int f14980b;

    /* renamed from: c */
    public InterfaceC1853a f14981c;

    /* renamed from: d */
    public /* synthetic */ Object f14982d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14983e;

    /* renamed from: f */
    public int f14984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14983e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14982d = obj;
        this.f14984f |= Integer.MIN_VALUE;
        return this.f14983e.x0(0, this);
    }
}
