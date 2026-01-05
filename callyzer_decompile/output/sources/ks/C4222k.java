package ks;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.k */
/* loaded from: classes3.dex */
public final class C4222k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21435a;

    /* renamed from: b */
    public final /* synthetic */ C4223l f21436b;

    /* renamed from: c */
    public int f21437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4222k(C4223l c4223l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21436b = c4223l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21435a = obj;
        this.f21437c |= Integer.MIN_VALUE;
        Object objM8959f = C4223l.m8959f(this.f21436b, 0, this);
        return objM8959f == EnumC7794a.COROUTINE_SUSPENDED ? objM8959f : new C6364n(objM8959f);
    }
}
