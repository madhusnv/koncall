package gn;

import dy.InterfaceC1853a;
import nm.C5107b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b2 extends AbstractC8193c {

    /* renamed from: a */
    public C5107b f14420a;

    /* renamed from: b */
    public InterfaceC1853a f14421b;

    /* renamed from: c */
    public int f14422c;

    /* renamed from: d */
    public /* synthetic */ Object f14423d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14424e;

    /* renamed from: f */
    public int f14425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14424e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14423d = obj;
        this.f14425f |= Integer.MIN_VALUE;
        return this.f14424e.A0(null, this);
    }
}
