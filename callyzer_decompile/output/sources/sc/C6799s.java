package sc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.s */
/* loaded from: classes.dex */
public final class C6799s extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32312a;

    /* renamed from: b */
    public final /* synthetic */ C6800t f32313b;

    /* renamed from: c */
    public int f32314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6799s(C6800t c6800t, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32313b = c6800t;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32312a = obj;
        this.f32314c |= Integer.MIN_VALUE;
        return this.f32313b.mo8275a(null, this);
    }
}
