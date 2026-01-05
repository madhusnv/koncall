package xm;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xm.q */
/* loaded from: classes3.dex */
public final class C8409q extends AbstractC8193c {

    /* renamed from: a */
    public long f40719a;

    /* renamed from: b */
    public /* synthetic */ Object f40720b;

    /* renamed from: c */
    public final /* synthetic */ C8090p f40721c;

    /* renamed from: d */
    public int f40722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8409q(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40721c = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40720b = obj;
        this.f40722d |= Integer.MIN_VALUE;
        return this.f40721c.m15241S(0L, this);
    }
}
