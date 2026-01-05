package gn;

import dy.InterfaceC1853a;
import nm.C5107b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w1 extends AbstractC8193c {

    /* renamed from: a */
    public C5107b f14914a;

    /* renamed from: b */
    public InterfaceC1853a f14915b;

    /* renamed from: c */
    public boolean f14916c;

    /* renamed from: d */
    public int f14917d;

    /* renamed from: e */
    public /* synthetic */ Object f14918e;

    /* renamed from: f */
    public final /* synthetic */ x2 f14919f;

    /* renamed from: g */
    public int f14920g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14919f = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14918e = obj;
        this.f14920g |= Integer.MIN_VALUE;
        return this.f14919f.u0(null, false, this);
    }
}
