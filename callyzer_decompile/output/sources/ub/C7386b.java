package ub;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.b */
/* loaded from: classes.dex */
public final class C7386b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f35125a;

    /* renamed from: b */
    public final /* synthetic */ C7392h f35126b;

    /* renamed from: c */
    public int f35127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7386b(C7392h c7392h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35126b = c7392h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35125a = obj;
        this.f35127c |= Integer.MIN_VALUE;
        return this.f35126b.m13797a(this);
    }
}
