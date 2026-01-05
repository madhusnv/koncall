package z7;

import c9.C0910e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC8193c {

    /* renamed from: a */
    public C0910e f42777a;

    /* renamed from: b */
    public /* synthetic */ Object f42778b;

    /* renamed from: c */
    public final /* synthetic */ n0 f42779c;

    /* renamed from: d */
    public int f42780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42779c = n0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42778b = obj;
        this.f42780d |= Integer.MIN_VALUE;
        return this.f42779c.m16382f(this);
    }
}
