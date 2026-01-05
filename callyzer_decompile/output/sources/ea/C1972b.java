package ea;

import og.rd;
import pg.v9;
import qd.C6185e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ea.b */
/* loaded from: classes.dex */
public final class C1972b extends AbstractC8193c {

    /* renamed from: a */
    public v9 f9226a;

    /* renamed from: b */
    public C6185e f9227b;

    /* renamed from: c */
    public /* synthetic */ Object f9228c;

    /* renamed from: d */
    public final /* synthetic */ rd f9229d;

    /* renamed from: e */
    public int f9230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1972b(rd rdVar, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9229d = rdVar;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9228c = obj;
        this.f9230e |= Integer.MIN_VALUE;
        return this.f9229d.m10876g(null, this);
    }
}
