package pt;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pt.d */
/* loaded from: classes3.dex */
public final class C6030d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f29463a;

    /* renamed from: b */
    public final /* synthetic */ C6032f f29464b;

    /* renamed from: c */
    public int f29465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6030d(C6032f c6032f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f29464b = c6032f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f29463a = obj;
        this.f29465c |= Integer.MIN_VALUE;
        return C6032f.m12045e(this.f29464b, this);
    }
}
