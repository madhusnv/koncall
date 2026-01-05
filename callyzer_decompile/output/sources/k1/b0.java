package k1;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public f0 f20022a;

    /* renamed from: b */
    public /* synthetic */ Object f20023b;

    /* renamed from: c */
    public final /* synthetic */ f0 f20024c;

    /* renamed from: d */
    public int f20025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20024c = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20023b = obj;
        this.f20025d |= Integer.MIN_VALUE;
        return f0.O0(this.f20024c, this);
    }
}
