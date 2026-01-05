package bv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.a */
/* loaded from: classes3.dex */
public final class C0783a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f4959a;

    /* renamed from: b */
    public final /* synthetic */ C0784b f4960b;

    /* renamed from: c */
    public int f4961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0783a(C0784b c0784b, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4960b = c0784b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4959a = obj;
        this.f4961c |= Integer.MIN_VALUE;
        return this.f4960b.m2113e(this);
    }
}
