package xm;

import rm.C6569a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e3 extends AbstractC8193c {

    /* renamed from: a */
    public C6569a f40246a;

    /* renamed from: b */
    public /* synthetic */ Object f40247b;

    /* renamed from: c */
    public final /* synthetic */ r3 f40248c;

    /* renamed from: d */
    public int f40249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(r3 r3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40248c = r3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40247b = obj;
        this.f40249d |= Integer.MIN_VALUE;
        return this.f40248c.m15605d(null, this);
    }
}
