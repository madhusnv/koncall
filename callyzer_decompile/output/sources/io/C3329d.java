package io;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: io.d */
/* loaded from: classes3.dex */
public final class C3329d extends AbstractC8193c {

    /* renamed from: a */
    public Object f17618a;

    /* renamed from: b */
    public boolean f17619b;

    /* renamed from: c */
    public /* synthetic */ Object f17620c;

    /* renamed from: d */
    public final /* synthetic */ C3330e f17621d;

    /* renamed from: e */
    public int f17622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329d(C3330e c3330e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17621d = c3330e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f17620c = obj;
        this.f17622e |= Integer.MIN_VALUE;
        Object objM7663i = this.f17621d.m7663i(null, null, null, false, this);
        return objM7663i == EnumC7794a.COROUTINE_SUSPENDED ? objM7663i : new C6364n(objM7663i);
    }
}
