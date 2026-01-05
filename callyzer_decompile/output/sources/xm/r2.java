package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r2 extends AbstractC8193c {

    /* renamed from: a */
    public String f40773a;

    /* renamed from: b */
    public /* synthetic */ Object f40774b;

    /* renamed from: c */
    public final /* synthetic */ s2 f40775c;

    /* renamed from: d */
    public int f40776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(s2 s2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40775c = s2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40774b = obj;
        this.f40776d |= Integer.MIN_VALUE;
        return this.f40775c.m15630o(null, this);
    }
}
