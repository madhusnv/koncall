package i9;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17115a;

    /* renamed from: b */
    public final /* synthetic */ c0 f17116b;

    /* renamed from: c */
    public int f17117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17116b = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17115a = obj;
        this.f17117c |= Integer.MIN_VALUE;
        return this.f17116b.m7541a(this);
    }
}
