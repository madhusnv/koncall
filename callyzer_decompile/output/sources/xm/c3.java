package xm;

import rm.C6571c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c3 extends AbstractC8193c {

    /* renamed from: a */
    public C6571c f40197a;

    /* renamed from: b */
    public /* synthetic */ Object f40198b;

    /* renamed from: c */
    public final /* synthetic */ r3 f40199c;

    /* renamed from: d */
    public int f40200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r3 r3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40199c = r3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40198b = obj;
        this.f40200d |= Integer.MIN_VALUE;
        return this.f40199c.m15603b(null, this);
    }
}
