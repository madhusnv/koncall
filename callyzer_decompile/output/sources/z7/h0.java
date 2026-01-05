package z7;

import c9.C0910e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends AbstractC8193c {

    /* renamed from: a */
    public n0 f42735a;

    /* renamed from: b */
    public C0910e f42736b;

    /* renamed from: c */
    public /* synthetic */ Object f42737c;

    /* renamed from: d */
    public final /* synthetic */ n0 f42738d;

    /* renamed from: e */
    public int f42739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42738d = n0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42737c = obj;
        this.f42739e |= Integer.MIN_VALUE;
        return n0.m16378b(this.f42738d, this);
    }
}
