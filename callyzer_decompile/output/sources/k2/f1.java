package k2;

import ex.InterfaceC2139c;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends AbstractC8193c {

    /* renamed from: a */
    public g1 f20377a;

    /* renamed from: b */
    public InterfaceC2139c f20378b;

    /* renamed from: c */
    public /* synthetic */ Object f20379c;

    /* renamed from: d */
    public final /* synthetic */ g1 f20380d;

    /* renamed from: e */
    public int f20381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f20380d = g1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20379c = obj;
        this.f20381e |= Integer.MIN_VALUE;
        return this.f20380d.mo8536u(null, this);
    }
}
