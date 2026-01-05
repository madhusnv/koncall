package ec;

import dy.C1855c;
import ww.AbstractC8193c;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.k */
/* loaded from: classes.dex */
public final class C2013k extends AbstractC8193c {

    /* renamed from: a */
    public Object f9546a;

    /* renamed from: b */
    public C1855c f9547b;

    /* renamed from: c */
    public /* synthetic */ Object f9548c;

    /* renamed from: d */
    public final /* synthetic */ C8849i f9549d;

    /* renamed from: e */
    public int f9550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2013k(C8849i c8849i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9549d = c8849i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9548c = obj;
        this.f9550e |= Integer.MIN_VALUE;
        return this.f9549d.m16320r(null, this);
    }
}
