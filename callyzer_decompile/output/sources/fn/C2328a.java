package fn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fn.a */
/* loaded from: classes3.dex */
public final class C2328a extends AbstractC8193c {

    /* renamed from: a */
    public int f10558a;

    /* renamed from: b */
    public long f10559b;

    /* renamed from: c */
    public /* synthetic */ Object f10560c;

    /* renamed from: d */
    public final /* synthetic */ C2336i f10561d;

    /* renamed from: e */
    public int f10562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328a(C2336i c2336i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10561d = c2336i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10560c = obj;
        this.f10562e |= Integer.MIN_VALUE;
        return this.f10561d.m6021a(0, 0L, this);
    }
}
