package km;

import s6.C6765d;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.c */
/* loaded from: classes3.dex */
public final class C4108c extends AbstractC8193c {

    /* renamed from: a */
    public C6765d f21006a;

    /* renamed from: b */
    public boolean f21007b;

    /* renamed from: c */
    public /* synthetic */ Object f21008c;

    /* renamed from: d */
    public final /* synthetic */ C4120o f21009d;

    /* renamed from: e */
    public int f21010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4108c(C4120o c4120o, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21009d = c4120o;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21008c = obj;
        this.f21010e |= Integer.MIN_VALUE;
        return this.f21009d.m8880b(null, false, this);
    }
}
