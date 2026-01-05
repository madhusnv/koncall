package yn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.a */
/* loaded from: classes3.dex */
public final class C8703a extends AbstractC8193c {

    /* renamed from: a */
    public boolean f42073a;

    /* renamed from: b */
    public /* synthetic */ Object f42074b;

    /* renamed from: c */
    public final /* synthetic */ C8716n f42075c;

    /* renamed from: d */
    public int f42076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8703a(C8716n c8716n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42075c = c8716n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42074b = obj;
        this.f42076d |= Integer.MIN_VALUE;
        return C8716n.m16103a(this.f42075c, false, this);
    }
}
