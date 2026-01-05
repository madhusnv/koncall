package xv;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.o */
/* loaded from: classes3.dex */
public final class C8488o extends AbstractC8193c {

    /* renamed from: a */
    public Object f41339a;

    /* renamed from: b */
    public Throwable f41340b;

    /* renamed from: c */
    public int f41341c;

    /* renamed from: d */
    public /* synthetic */ Object f41342d;

    /* renamed from: e */
    public final /* synthetic */ C8489p f41343e;

    /* renamed from: f */
    public int f41344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8488o(C8489p c8489p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41343e = c8489p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41342d = obj;
        this.f41344f |= Integer.MIN_VALUE;
        return C8489p.m15782k(this.f41343e, this);
    }
}
