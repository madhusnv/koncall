package h2;

import com.sun.mail.util.AbstractC1452a;
import g2.C2463q;
import g2.a7;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.xe;
import og.ye;
import s4.C6751g;
import s4.C6755k;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w4.InterfaceC7930v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.t */
/* loaded from: classes.dex */
public final class C2815t implements InterfaceC7930v {

    /* renamed from: a */
    public final long f15782a;

    /* renamed from: b */
    public final InterfaceC6747c f15783b;

    /* renamed from: c */
    public final int f15784c;

    /* renamed from: d */
    public final C2463q f15785d;

    /* renamed from: e */
    public final C2796a f15786e;

    /* renamed from: f */
    public final C2796a f15787f;

    /* renamed from: g */
    public final u0 f15788g;

    /* renamed from: h */
    public final u0 f15789h;

    /* renamed from: i */
    public final C2797b f15790i;

    /* renamed from: j */
    public final C2797b f15791j;

    /* renamed from: k */
    public final C2797b f15792k;

    /* renamed from: l */
    public final v0 f15793l;

    /* renamed from: m */
    public final v0 f15794m;

    public C2815t(long j6, InterfaceC6747c interfaceC6747c, C2463q c2463q) {
        int iE0 = interfaceC6747c.e0(a7.f11170a);
        this.f15782a = j6;
        this.f15783b = interfaceC6747c;
        this.f15784c = iE0;
        this.f15785d = c2463q;
        int iE02 = interfaceC6747c.e0(Float.intBitsToFloat((int) (j6 >> 32)));
        C7869h c7869h = C7864c.f37654n;
        this.f15786e = new C2796a(c7869h, c7869h, iE02);
        C7869h c7869h2 = C7864c.f37656q;
        this.f15787f = new C2796a(c7869h2, c7869h2, iE02);
        this.f15788g = new u0(AbstractC7862a.f37638c);
        this.f15789h = new u0(AbstractC7862a.f37639d);
        int iE03 = interfaceC6747c.e0(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        C7870i c7870i = C7864c.f37651k;
        C7870i c7870i2 = C7864c.f37653m;
        this.f15790i = new C2797b(c7870i, c7870i2, iE03);
        this.f15791j = new C2797b(c7870i2, c7870i, iE03);
        this.f15792k = new C2797b(C7864c.f37652l, c7870i, iE03);
        this.f15793l = new v0(c7870i, iE0);
        this.f15794m = new v0(c7870i2, iE0);
    }

    @Override // w4.InterfaceC7930v
    /* renamed from: a */
    public final long mo1651a(C6755k c6755k, long j6, EnumC6757m enumC6757m, long j10) {
        C6755k c6755k2;
        long j11;
        int iMo6885a;
        int i10;
        char c2 = ' ';
        int i11 = (int) (j6 >> 32);
        int i12 = 0;
        List listM10834i = pe.m10834i(this.f15786e, this.f15787f, ((int) (c6755k.m12944a() >> 32)) < i11 / 2 ? this.f15788g : this.f15789h);
        int size = listM10834i.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                c6755k2 = c6755k;
                j11 = j6;
                iMo6885a = 0;
                break;
            }
            h0 h0Var = (h0) listM10834i.get(i13);
            int i14 = (int) (j10 >> c2);
            int i15 = size;
            int i16 = i13;
            c6755k2 = c6755k;
            j11 = j6;
            iMo6885a = h0Var.mo6885a(c6755k2, j11, i14, enumC6757m);
            if (i16 == pe.m10832g(listM10834i) || (iMo6885a >= 0 && i14 + iMo6885a <= i11)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c2 = ' ';
        }
        int i17 = (int) (j11 & 4294967295L);
        List listM10834i2 = pe.m10834i(this.f15790i, this.f15791j, this.f15792k, ((int) (c6755k2.m12944a() & 4294967295L)) < i17 / 2 ? this.f15793l : this.f15794m);
        int size2 = listM10834i2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j10 & 4294967295L);
            int iMo6886a = ((i0) listM10834i2.get(i18)).mo6886a(c6755k2, j11, i19);
            if (i18 == pe.m10832g(listM10834i2) || (iMo6886a >= (i10 = this.f15784c) && i19 + iMo6886a <= i17 - i10)) {
                i12 = iMo6886a;
                break;
            }
        }
        long jM11044a = xe.m11044a(iMo6885a, i12);
        this.f15785d.invoke(c6755k2, ye.m11069a(jM11044a, j10));
        return jM11044a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2815t)) {
            return false;
        }
        C2815t c2815t = (C2815t) obj;
        return this.f15782a == c2815t.f15782a && AbstractC4154l.m8918a(this.f15783b, c2815t.f15783b) && this.f15784c == c2815t.f15784c && AbstractC4154l.m8918a(this.f15785d, c2815t.f15785d);
    }

    public final int hashCode() {
        return this.f15785d.hashCode() + AbstractC1452a.m4556c(this.f15784c, (this.f15783b.hashCode() + (Long.hashCode(this.f15782a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C6751g.m12937a(this.f15782a)) + ", density=" + this.f15783b + ", verticalMargin=" + this.f15784c + ", onPositionCalculated=" + this.f15785d + ')';
    }
}
