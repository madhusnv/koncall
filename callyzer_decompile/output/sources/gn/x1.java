package gn;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x1 extends AbstractC8193c {

    /* renamed from: a */
    public int f14931a;

    /* renamed from: b */
    public int f14932b;

    /* renamed from: c */
    public boolean f14933c;

    /* renamed from: d */
    public boolean f14934d;

    /* renamed from: e */
    public boolean f14935e;

    /* renamed from: f */
    public InterfaceC1853a f14936f;

    /* renamed from: g */
    public /* synthetic */ Object f14937g;

    /* renamed from: h */
    public final /* synthetic */ x2 f14938h;

    /* renamed from: j */
    public int f14939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(x2 x2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f14938h = x2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f14937g = obj;
        this.f14939j |= Integer.MIN_VALUE;
        return this.f14938h.v0(0, false, false, false, this);
    }
}
