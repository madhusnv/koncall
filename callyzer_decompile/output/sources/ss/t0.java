package ss;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f33493a;

    /* renamed from: b */
    public final /* synthetic */ z0 f33494b;

    /* renamed from: c */
    public int f33495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f33494b = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33493a = obj;
        this.f33495c |= Integer.MIN_VALUE;
        return z0.m13190m(this.f33494b, this);
    }
}
