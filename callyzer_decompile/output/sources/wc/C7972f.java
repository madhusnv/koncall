package wc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.f */
/* loaded from: classes.dex */
public final class C7972f extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC7986t f38343a;

    /* renamed from: b */
    public /* synthetic */ Object f38344b;

    /* renamed from: c */
    public final /* synthetic */ C7973g f38345c;

    /* renamed from: d */
    public int f38346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7972f(C7973g c7973g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38345c = c7973g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38344b = obj;
        this.f38346d |= Integer.MIN_VALUE;
        return this.f38345c.read(null, 0L, this);
    }
}
