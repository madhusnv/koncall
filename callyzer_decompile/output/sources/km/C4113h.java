package km;

import s6.C6765d;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.h */
/* loaded from: classes3.dex */
public final class C4113h extends AbstractC8193c {

    /* renamed from: a */
    public C6765d f21024a;

    /* renamed from: b */
    public /* synthetic */ Object f21025b;

    /* renamed from: c */
    public final /* synthetic */ C4120o f21026c;

    /* renamed from: d */
    public int f21027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4113h(C4120o c4120o, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21026c = c4120o;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21025b = obj;
        this.f21027d |= Integer.MIN_VALUE;
        return this.f21026c.m8883e(null, this);
    }
}
