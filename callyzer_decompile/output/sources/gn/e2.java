package gn;

import dy.InterfaceC1853a;
import kn.C4121a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e2 extends AbstractC8193c {

    /* renamed from: a */
    public C4121a f14477a;

    /* renamed from: b */
    public InterfaceC1853a f14478b;

    /* renamed from: c */
    public int f14479c;

    /* renamed from: d */
    public /* synthetic */ Object f14480d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14481e;

    /* renamed from: f */
    public int f14482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14481e = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14480d = obj;
        this.f14482f |= Integer.MIN_VALUE;
        return this.f14481e.D0(null, this);
    }
}
