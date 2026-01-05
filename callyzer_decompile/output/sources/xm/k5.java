package xm;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k5 extends AbstractC8193c {

    /* renamed from: a */
    public String f40496a;

    /* renamed from: b */
    public /* synthetic */ Object f40497b;

    /* renamed from: c */
    public final /* synthetic */ y5 f40498c;

    /* renamed from: d */
    public int f40499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(y5 y5Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f40498c = y5Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40497b = obj;
        this.f40499d |= Integer.MIN_VALUE;
        return this.f40498c.m15704t(null, this);
    }
}
