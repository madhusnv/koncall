package ko;

import p020v.x0;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ko.h */
/* loaded from: classes3.dex */
public final class C4140h extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f21129a;

    /* renamed from: b */
    public final /* synthetic */ x0 f21130b;

    /* renamed from: c */
    public int f21131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140h(x0 x0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21130b = x0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21129a = obj;
        this.f21131c |= Integer.MIN_VALUE;
        return this.f21130b.m14471F(this);
    }
}
