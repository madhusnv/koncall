package oo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oo.b */
/* loaded from: classes3.dex */
public final class C5421b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f27246a;

    /* renamed from: b */
    public final /* synthetic */ C5431l f27247b;

    /* renamed from: c */
    public int f27248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5421b(C5431l c5431l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f27247b = c5431l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f27246a = obj;
        this.f27248c |= Integer.MIN_VALUE;
        return this.f27247b.m11126c(null, this);
    }
}
