package b2;

import og.xe;
import s4.C6754j;
import s4.C6755k;
import s4.EnumC6757m;
import w2.InterfaceC7866e;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.n */
/* loaded from: classes.dex */
public final class C0556n implements InterfaceC7930v {

    /* renamed from: a */
    public final InterfaceC7866e f3788a;

    /* renamed from: b */
    public final InterfaceC0557o f3789b;

    /* renamed from: c */
    public long f3790c = 0;

    public C0556n(InterfaceC7866e interfaceC7866e, InterfaceC0557o interfaceC0557o) {
        this.f3788a = interfaceC7866e;
        this.f3789b = interfaceC0557o;
    }

    @Override // w4.InterfaceC7930v
    /* renamed from: a */
    public final long mo1651a(C6755k c6755k, long j6, EnumC6757m enumC6757m, long j10) {
        long jMo1652a = this.f3789b.mo1652a();
        if ((9223372034707292159L & jMo1652a) == 9205357640488583168L) {
            jMo1652a = this.f3790c;
        }
        this.f3790c = jMo1652a;
        return C6754j.m12942c(C6754j.m12942c(c6755k.m12946c(), xe.m11048e(jMo1652a)), this.f3788a.mo14848a(j10, 0L, enumC6757m));
    }
}
