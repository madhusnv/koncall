package dd;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.m */
/* loaded from: classes.dex */
public final class C1695m extends AbstractC8193c {

    /* renamed from: a */
    public int f8283a;

    /* renamed from: b */
    public /* synthetic */ Object f8284b;

    /* renamed from: c */
    public final /* synthetic */ C1696n f8285c;

    /* renamed from: d */
    public int f8286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1695m(C1696n c1696n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8285c = c1696n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8284b = obj;
        this.f8286d |= Integer.MIN_VALUE;
        return this.f8285c.m5390a(null, this);
    }
}
