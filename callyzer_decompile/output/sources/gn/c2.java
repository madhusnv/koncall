package gn;

import dy.InterfaceC1853a;
import nm.C5107b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c2 extends AbstractC8193c {

    /* renamed from: a */
    public C5107b f14438a;

    /* renamed from: b */
    public InterfaceC1853a f14439b;

    /* renamed from: c */
    public int f14440c;

    /* renamed from: d */
    public /* synthetic */ Object f14441d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14442e;

    /* renamed from: f */
    public int f14443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14442e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14441d = obj;
        this.f14443f |= Integer.MIN_VALUE;
        return this.f14442e.C0(null, this);
    }
}
