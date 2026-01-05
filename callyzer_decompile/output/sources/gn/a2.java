package gn;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a2 extends AbstractC8193c {

    /* renamed from: a */
    public int f14401a;

    /* renamed from: b */
    public int f14402b;

    /* renamed from: c */
    public InterfaceC1853a f14403c;

    /* renamed from: d */
    public /* synthetic */ Object f14404d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14405e;

    /* renamed from: f */
    public int f14406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14405e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14404d = obj;
        this.f14406f |= Integer.MIN_VALUE;
        return this.f14405e.z0(0, this);
    }
}
