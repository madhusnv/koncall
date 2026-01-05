package w4;

import s4.C6754j;
import s4.C6755k;
import s4.EnumC6757m;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class C7909a implements InterfaceC7930v {

    /* renamed from: a */
    public final InterfaceC7866e f38071a;

    /* renamed from: b */
    public final long f38072b;

    public C7909a(InterfaceC7866e interfaceC7866e, long j6) {
        this.f38071a = interfaceC7866e;
        this.f38072b = j6;
    }

    @Override // w4.InterfaceC7930v
    /* renamed from: a */
    public final long mo1651a(C6755k c6755k, long j6, EnumC6757m enumC6757m, long j10) {
        long jMo14848a = this.f38071a.mo14848a(0L, (c6755k.m12947d() << 32) | (c6755k.m12945b() & 4294967295L), enumC6757m);
        long jMo14848a2 = this.f38071a.mo14848a(0L, j10, enumC6757m);
        long j11 = ((-((int) (jMo14848a2 >> 32))) << 32) | ((-((int) (jMo14848a2 & 4294967295L))) & 4294967295L);
        long j12 = this.f38072b;
        return C6754j.m12942c(C6754j.m12942c(C6754j.m12942c(c6755k.m12946c(), jMo14848a), j11), (((int) (j12 & 4294967295L)) & 4294967295L) | ((((int) (j12 >> 32)) * (enumC6757m == EnumC6757m.Ltr ? 1 : -1)) << 32));
    }
}
