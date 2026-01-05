package xm;

import rm.C6571c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b3 extends AbstractC8193c {

    /* renamed from: a */
    public C6571c f40171a;

    /* renamed from: b */
    public /* synthetic */ Object f40172b;

    /* renamed from: c */
    public final /* synthetic */ r3 f40173c;

    /* renamed from: d */
    public int f40174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(r3 r3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40173c = r3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40172b = obj;
        this.f40174d |= Integer.MIN_VALUE;
        return this.f40173c.m15602a(null, this);
    }
}
