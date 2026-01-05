package xc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.a */
/* loaded from: classes.dex */
public final class C8320a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39881a;

    /* renamed from: b */
    public final /* synthetic */ C8322c f39882b;

    /* renamed from: c */
    public int f39883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8320a(C8322c c8322c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f39882b = c8322c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39881a = obj;
        this.f39883c |= Integer.MIN_VALUE;
        return this.f39882b.m15517b(null, this);
    }
}
