package eo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eo.c */
/* loaded from: classes3.dex */
public final class C2077c extends AbstractC8193c {

    /* renamed from: a */
    public int f9713a;

    /* renamed from: b */
    public /* synthetic */ Object f9714b;

    /* renamed from: c */
    public final /* synthetic */ C2082h f9715c;

    /* renamed from: d */
    public int f9716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2077c(C2082h c2082h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9715c = c2082h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9714b = obj;
        this.f9716d |= Integer.MIN_VALUE;
        return C2082h.m5792a(this.f9715c, 0, this);
    }
}
