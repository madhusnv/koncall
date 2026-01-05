package pn;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pn.a */
/* loaded from: classes3.dex */
public final class C5975a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f29219a;

    /* renamed from: b */
    public final /* synthetic */ C5979e f29220b;

    /* renamed from: c */
    public int f29221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5975a(C5979e c5979e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f29220b = c5979e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f29219a = obj;
        this.f29221c |= Integer.MIN_VALUE;
        Object objM12010a = this.f29220b.m12010a(null, null, 0, 0, this);
        return objM12010a == EnumC7794a.COROUTINE_SUSPENDED ? objM12010a : new C6364n(objM12010a);
    }
}
