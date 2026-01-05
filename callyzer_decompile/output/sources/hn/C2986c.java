package hn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hn.c */
/* loaded from: classes3.dex */
public final class C2986c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f16124a;

    /* renamed from: b */
    public final /* synthetic */ C2987d f16125b;

    /* renamed from: c */
    public int f16126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2986c(C2987d c2987d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16125b = c2987d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16124a = obj;
        this.f16126c |= Integer.MIN_VALUE;
        return this.f16125b.m7246a(null, this);
    }
}
