package tb;

import ic.InterfaceC3227e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.w */
/* loaded from: classes.dex */
public final class C7112w extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC3227e f34304a;

    /* renamed from: b */
    public /* synthetic */ Object f34305b;

    /* renamed from: c */
    public final /* synthetic */ l4.d0 f34306c;

    /* renamed from: d */
    public int f34307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7112w(l4.d0 d0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34306c = d0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34305b = obj;
        this.f34307d |= Integer.MIN_VALUE;
        return this.f34306c.m9088v(null, this);
    }
}
