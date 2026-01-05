package xm;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xm.d */
/* loaded from: classes3.dex */
public final class C8396d extends AbstractC8193c {

    /* renamed from: a */
    public long f40206a;

    /* renamed from: b */
    public /* synthetic */ Object f40207b;

    /* renamed from: c */
    public final /* synthetic */ C8090p f40208c;

    /* renamed from: d */
    public int f40209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8396d(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40208c = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40207b = obj;
        this.f40209d |= Integer.MIN_VALUE;
        return this.f40208c.m15259o(this);
    }
}
