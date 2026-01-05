package xm;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z4 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f41098a;

    /* renamed from: b */
    public final /* synthetic */ y5 f41099b;

    /* renamed from: c */
    public int f41100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(y5 y5Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f41099b = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41098a = obj;
        this.f41100c |= Integer.MIN_VALUE;
        return this.f41099b.m15694j(this);
    }
}
