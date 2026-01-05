package ss;

import tq.EnumC7204p;
import ts.C7217d;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x0 extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f33520a;

    /* renamed from: b */
    public C7217d f33521b;

    /* renamed from: c */
    public /* synthetic */ Object f33522c;

    /* renamed from: d */
    public final /* synthetic */ z0 f33523d;

    /* renamed from: e */
    public int f33524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33523d = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33522c = obj;
        this.f33524e |= Integer.MIN_VALUE;
        return z0.m13193p(this.f33523d, this);
    }
}
