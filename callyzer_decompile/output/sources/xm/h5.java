package xm;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h5 extends AbstractC8193c {

    /* renamed from: a */
    public int f40387a;

    /* renamed from: b */
    public /* synthetic */ Object f40388b;

    /* renamed from: c */
    public final /* synthetic */ y5 f40389c;

    /* renamed from: d */
    public int f40390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(y5 y5Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40389c = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40388b = obj;
        this.f40390d |= Integer.MIN_VALUE;
        return this.f40389c.m15700p(this);
    }
}
