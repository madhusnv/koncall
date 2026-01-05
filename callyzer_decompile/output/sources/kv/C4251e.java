package kv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kv.e */
/* loaded from: classes3.dex */
public final class C4251e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21601a;

    /* renamed from: b */
    public final /* synthetic */ C4252f f21602b;

    /* renamed from: c */
    public int f21603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4251e(C4252f c4252f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21602b = c4252f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21601a = obj;
        this.f21603c |= Integer.MIN_VALUE;
        return C4252f.m8981f(this.f21602b, null, this);
    }
}
