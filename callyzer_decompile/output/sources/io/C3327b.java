package io;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: io.b */
/* loaded from: classes3.dex */
public final class C3327b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17606a;

    /* renamed from: b */
    public final /* synthetic */ C3330e f17607b;

    /* renamed from: c */
    public int f17608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3327b(C3330e c3330e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17607b = c3330e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f17606a = obj;
        this.f17608c |= Integer.MIN_VALUE;
        Object objM7662h = this.f17607b.m7662h(null, null, null, this);
        return objM7662h == EnumC7794a.COROUTINE_SUSPENDED ? objM7662h : new C6364n(objM7662h);
    }
}
