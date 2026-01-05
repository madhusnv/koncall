package p001o;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public final class o4g {

    /* renamed from: e */
    public static final o4g f37764e = new o4g(zqh.f57552b, 0, 0, 0);

    /* renamed from: a */
    public final int f37765a;

    /* renamed from: b */
    public final zqh f37766b;

    /* renamed from: c */
    public final int f37767c;

    /* renamed from: d */
    public final int f37768d;

    public o4g(zqh zqhVar, int i, int i2, int i3) {
        this.f37766b = zqhVar;
        this.f37765a = i;
        this.f37767c = i2;
        this.f37768d = i3;
    }

    /* renamed from: a */
    public o4g m41528a(int i) {
        zqh zqhVarM59777a = this.f37766b;
        int i2 = this.f37765a;
        int i3 = this.f37768d;
        if (i2 == 4 || i2 == 2) {
            int i4 = oy7.f39045c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            zqhVarM59777a = zqhVarM59777a.m59777a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f37767c;
        o4g o4gVar = new o4g(zqhVarM59777a, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return o4gVar.f37767c == 2078 ? o4gVar.m41529b(i + 1) : o4gVar;
    }

    /* renamed from: b */
    public o4g m41529b(int i) {
        int i2 = this.f37767c;
        return i2 == 0 ? this : new o4g(this.f37766b.m59778b(i - i2, i2), this.f37765a, 0, this.f37768d);
    }

    /* renamed from: c */
    public int m41530c() {
        return this.f37767c;
    }

    /* renamed from: d */
    public int m41531d() {
        return this.f37768d;
    }

    /* renamed from: e */
    public int m41532e() {
        return this.f37765a;
    }

    /* renamed from: f */
    public boolean m41533f(o4g o4gVar) {
        int i;
        int i2 = this.f37768d + (oy7.f39045c[this.f37765a][o4gVar.f37765a] >> 16);
        int i3 = o4gVar.f37767c;
        if (i3 > 0 && ((i = this.f37767c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= o4gVar.f37768d;
    }

    /* renamed from: g */
    public o4g m41534g(int i, int i2) {
        int i3 = this.f37768d;
        zqh zqhVarM59777a = this.f37766b;
        int i4 = this.f37765a;
        if (i != i4) {
            int i5 = oy7.f39045c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            zqhVarM59777a = zqhVarM59777a.m59777a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new o4g(zqhVarM59777a.m59777a(i2, i8), i, 0, i3 + i8);
    }

    /* renamed from: h */
    public o4g m41535h(int i, int i2) {
        zqh zqhVar = this.f37766b;
        int i3 = this.f37765a;
        int i4 = i3 == 2 ? 4 : 5;
        return new o4g(zqhVar.m59777a(oy7.f39047e[i3][i], i4).m59777a(i2, 5), this.f37765a, 0, this.f37768d + i4 + 5);
    }

    /* renamed from: i */
    public xh1 m41536i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (zqh zqhVarM59779d = m41529b(bArr.length).f37766b; zqhVarM59779d != null; zqhVarM59779d = zqhVarM59779d.m59779d()) {
            linkedList.addFirst(zqhVarM59779d);
        }
        xh1 xh1Var = new xh1();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((zqh) it.next()).mo46741c(xh1Var, bArr);
        }
        return xh1Var;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", oy7.f39044b[this.f37765a], Integer.valueOf(this.f37768d), Integer.valueOf(this.f37767c));
    }
}
