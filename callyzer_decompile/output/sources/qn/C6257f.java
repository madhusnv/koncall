package qn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.f */
/* loaded from: classes3.dex */
public final class C6257f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f30327a;

    /* renamed from: b */
    public final /* synthetic */ C6263l f30328b;

    /* renamed from: c */
    public int f30329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6257f(C6263l c6263l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30328b = c6263l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30327a = obj;
        this.f30329c |= Integer.MIN_VALUE;
        return this.f30328b.m12262h(0, this);
    }
}
