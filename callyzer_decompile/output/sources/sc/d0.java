package sc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f32277a;

    /* renamed from: b */
    public /* synthetic */ Object f32278b;

    /* renamed from: c */
    public final /* synthetic */ C6785e f32279c;

    /* renamed from: d */
    public int f32280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(C6785e c6785e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32279c = c6785e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32278b = obj;
        this.f32280d |= Integer.MIN_VALUE;
        return this.f32279c.m12978b(null, this);
    }
}
