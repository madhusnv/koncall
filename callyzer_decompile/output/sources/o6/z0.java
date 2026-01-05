package o6;

import dy.C1855c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends AbstractC8193c {

    /* renamed from: a */
    public C1855c f26209a;

    /* renamed from: b */
    public boolean f26210b;

    /* renamed from: c */
    public /* synthetic */ Object f26211c;

    /* renamed from: d */
    public final /* synthetic */ a1 f26212d;

    /* renamed from: e */
    public int f26213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26212d = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26211c = obj;
        this.f26213e |= Integer.MIN_VALUE;
        return this.f26212d.mo10442c(null, this);
    }
}
