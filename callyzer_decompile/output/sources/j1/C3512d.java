package j1;

import pg.r7;
import s4.C6755k;
import s4.EnumC6757m;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.d */
/* loaded from: classes.dex */
public final class C3512d implements InterfaceC7930v {

    /* renamed from: a */
    public final long f18391a;

    public C3512d(long j6) {
        this.f18391a = j6;
    }

    @Override // w4.InterfaceC7930v
    /* renamed from: a */
    public final long mo1651a(C6755k c6755k, long j6, EnumC6757m enumC6757m, long j10) {
        int i10 = c6755k.f32206a;
        long j11 = this.f18391a;
        return (r7.m11850a(i10 + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j6 >> 32), enumC6757m == EnumC6757m.Ltr) << 32) | (r7.m11850a(c6755k.f32207b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j6 & 4294967295L), true) & 4294967295L);
    }
}
