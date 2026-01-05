package k1;

import ex.InterfaceC2137a;
import qw.InterfaceC6355e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 extends AbstractC8193c {

    /* renamed from: a */
    public l2 f20156a;

    /* renamed from: b */
    public InterfaceC6355e f20157b;

    /* renamed from: c */
    public InterfaceC2137a f20158c;

    /* renamed from: d */
    public float f20159d;

    /* renamed from: e */
    public /* synthetic */ Object f20160e;

    /* renamed from: f */
    public final /* synthetic */ l2 f20161f;

    /* renamed from: g */
    public int f20162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20161f = l2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20160e = obj;
        this.f20162g |= Integer.MIN_VALUE;
        return this.f20161f.m8466a(null, null, this);
    }
}
