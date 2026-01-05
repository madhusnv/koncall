package ss;

import im.q1;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 extends AbstractC8193c {

    /* renamed from: a */
    public q1 f33475a;

    /* renamed from: b */
    public /* synthetic */ Object f33476b;

    /* renamed from: c */
    public final /* synthetic */ n0 f33477c;

    /* renamed from: d */
    public int f33478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n0 n0Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f33477c = n0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33476b = obj;
        this.f33478d |= Integer.MIN_VALUE;
        return this.f33477c.m13181c(null, this);
    }
}
