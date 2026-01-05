package ks;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.v */
/* loaded from: classes3.dex */
public final class C4233v extends AbstractC8193c {

    /* renamed from: a */
    public boolean f21529a;

    /* renamed from: b */
    public /* synthetic */ Object f21530b;

    /* renamed from: c */
    public final /* synthetic */ c0 f21531c;

    /* renamed from: d */
    public int f21532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4233v(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21531c = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21530b = obj;
        this.f21532d |= Integer.MIN_VALUE;
        return this.f21531c.m8955p(false, this);
    }
}
