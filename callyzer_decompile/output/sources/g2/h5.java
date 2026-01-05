package g2;

import h2.C2796a;
import h2.C2797b;
import java.util.List;
import og.pe;
import og.xe;
import og.ye;
import og.ze;
import s4.C6755k;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h5 implements InterfaceC7930v {

    /* renamed from: a */
    public final int f11720a;

    /* renamed from: b */
    public final k2.w0 f11721b;

    /* renamed from: c */
    public final C2463q f11722c;

    /* renamed from: d */
    public final C2796a f11723d;

    /* renamed from: e */
    public final C2796a f11724e;

    /* renamed from: f */
    public final h2.u0 f11725f;

    /* renamed from: g */
    public final h2.u0 f11726g;

    /* renamed from: h */
    public final C2797b f11727h;

    /* renamed from: i */
    public final C2797b f11728i;

    /* renamed from: j */
    public final h2.v0 f11729j;

    /* renamed from: k */
    public final h2.v0 f11730k;

    public h5(InterfaceC6747c interfaceC6747c, int i10, k2.w0 w0Var, C2463q c2463q) {
        int iE0 = interfaceC6747c.e0(a7.f11170a);
        this.f11720a = i10;
        this.f11721b = w0Var;
        this.f11722c = c2463q;
        C7869h c7869h = C7864c.f37654n;
        this.f11723d = new C2796a(c7869h, c7869h, 0);
        C7869h c7869h2 = C7864c.f37656q;
        this.f11724e = new C2796a(c7869h2, c7869h2, 0);
        this.f11725f = new h2.u0(AbstractC7862a.f37638c);
        this.f11726g = new h2.u0(AbstractC7862a.f37639d);
        C7870i c7870i = C7864c.f37651k;
        C7870i c7870i2 = C7864c.f37653m;
        this.f11727h = new C2797b(c7870i, c7870i2, 0);
        this.f11728i = new C2797b(c7870i2, c7870i, 0);
        this.f11729j = new h2.v0(c7870i, iE0);
        this.f11730k = new h2.v0(c7870i2, iE0);
    }

    @Override // w4.InterfaceC7930v
    /* renamed from: a */
    public final long mo1651a(C6755k c6755k, long j6, EnumC6757m enumC6757m, long j10) {
        C6755k c6755k2;
        long j11;
        int iMo6885a;
        k2.w0 w0Var = this.f11721b;
        if (w0Var != null) {
            w0Var.getValue();
        }
        char c2 = ' ';
        long j12 = 4294967295L;
        long jM11095a = ze.m11095a((int) (j6 >> 32), ((int) (j6 & 4294967295L)) + this.f11720a);
        int i10 = (int) (jM11095a >> 32);
        int i11 = 0;
        List listM10834i = pe.m10834i(this.f11723d, this.f11724e, ((int) (c6755k.m12944a() >> 32)) < i10 / 2 ? this.f11725f : this.f11726g);
        int size = listM10834i.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                c6755k2 = c6755k;
                j11 = j12;
                iMo6885a = 0;
                break;
            }
            char c10 = c2;
            j11 = j12;
            int i13 = (int) (j10 >> c10);
            int i14 = size;
            int i15 = i12;
            c6755k2 = c6755k;
            List list = listM10834i;
            iMo6885a = ((h2.h0) listM10834i.get(i12)).mo6885a(c6755k2, jM11095a, i13, enumC6757m);
            if (i15 == pe.m10832g(list) || (iMo6885a >= 0 && i13 + iMo6885a <= i10)) {
                break;
            }
            i12 = i15 + 1;
            listM10834i = list;
            size = i14;
            c2 = c10;
            j12 = j11;
        }
        int i16 = (int) (jM11095a & j11);
        List listM10834i2 = pe.m10834i(this.f11727h, this.f11728i, ((int) (c6755k2.m12944a() & j11)) < i16 / 2 ? this.f11729j : this.f11730k);
        int size2 = listM10834i2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            int i18 = (int) (j10 & j11);
            int iMo6886a = ((h2.i0) listM10834i2.get(i17)).mo6886a(c6755k2, jM11095a, i18);
            if (i17 == pe.m10832g(listM10834i2) || (iMo6886a >= 0 && i18 + iMo6886a <= i16)) {
                i11 = iMo6886a;
                break;
            }
        }
        long jM11044a = xe.m11044a(iMo6885a, i11);
        this.f11722c.invoke(c6755k2, ye.m11069a(jM11044a, j10));
        return jM11044a;
    }
}
