package p001o;

import android.util.Pair;
import p001o.lmh;

/* loaded from: classes2.dex */
public abstract class d7 extends lmh {

    /* renamed from: e */
    public final int f19158e;

    /* renamed from: f */
    public final crf f19159f;

    /* renamed from: g */
    public final boolean f19160g;

    public d7(boolean z, crf crfVar) {
        this.f19160g = z;
        this.f19159f = crfVar;
        this.f19158e = crfVar.getLength();
    }

    /* renamed from: v */
    public static Object m22370v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m22371w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m22372y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    public abstract int mo22373A(int i);

    /* renamed from: B */
    public final int m22374B(int i, boolean z) {
        if (z) {
            return this.f19159f.mo21627c(i);
        }
        if (i < this.f19158e - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: C */
    public final int m22375C(int i, boolean z) {
        if (z) {
            return this.f19159f.mo21626b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: D */
    public abstract lmh mo22376D(int i);

    @Override // p001o.lmh
    /* renamed from: a */
    public int mo22377a(boolean z) {
        if (this.f19158e == 0) {
            return -1;
        }
        if (this.f19160g) {
            z = false;
        }
        int iMo21630f = z ? this.f19159f.mo21630f() : 0;
        while (mo22376D(iMo21630f).m37477q()) {
            iMo21630f = m22374B(iMo21630f, z);
            if (iMo21630f == -1) {
                return -1;
            }
        }
        return mo22373A(iMo21630f) + mo22376D(iMo21630f).mo22377a(z);
    }

    @Override // p001o.lmh
    /* renamed from: b */
    public final int mo6949b(Object obj) {
        int iMo6949b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objM22371w = m22371w(obj);
        Object objM22370v = m22370v(obj);
        int iMo22382s = mo22382s(objM22371w);
        if (iMo22382s == -1 || (iMo6949b = mo22376D(iMo22382s).mo6949b(objM22370v)) == -1) {
            return -1;
        }
        return mo22386z(iMo22382s) + iMo6949b;
    }

    @Override // p001o.lmh
    /* renamed from: c */
    public int mo22378c(boolean z) {
        int i = this.f19158e;
        if (i == 0) {
            return -1;
        }
        if (this.f19160g) {
            z = false;
        }
        int iMo21628d = z ? this.f19159f.mo21628d() : i - 1;
        while (mo22376D(iMo21628d).m37477q()) {
            iMo21628d = m22375C(iMo21628d, z);
            if (iMo21628d == -1) {
                return -1;
            }
        }
        return mo22373A(iMo21628d) + mo22376D(iMo21628d).mo22378c(z);
    }

    @Override // p001o.lmh
    /* renamed from: e */
    public int mo22379e(int i, int i2, boolean z) {
        if (this.f19160g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo22384u = mo22384u(i);
        int iMo22373A = mo22373A(iMo22384u);
        int iMo22379e = mo22376D(iMo22384u).mo22379e(i - iMo22373A, i2 != 2 ? i2 : 0, z);
        if (iMo22379e != -1) {
            return iMo22373A + iMo22379e;
        }
        int iM22374B = m22374B(iMo22384u, z);
        while (iM22374B != -1 && mo22376D(iM22374B).m37477q()) {
            iM22374B = m22374B(iM22374B, z);
        }
        if (iM22374B != -1) {
            return mo22373A(iM22374B) + mo22376D(iM22374B).mo22377a(z);
        }
        if (i2 == 2) {
            return mo22377a(z);
        }
        return -1;
    }

    @Override // p001o.lmh
    /* renamed from: g */
    public final lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
        int iMo22383t = mo22383t(i);
        int iMo22373A = mo22373A(iMo22383t);
        mo22376D(iMo22383t).mo6950g(i - mo22386z(iMo22383t), c15105b, z);
        c15105b.f34059c += iMo22373A;
        if (z) {
            c15105b.f34058b = m22372y(mo22385x(iMo22383t), op0.m42515e(c15105b.f34058b));
        }
        return c15105b;
    }

    @Override // p001o.lmh
    /* renamed from: h */
    public final lmh.C15105b mo22380h(Object obj, lmh.C15105b c15105b) {
        Object objM22371w = m22371w(obj);
        Object objM22370v = m22370v(obj);
        int iMo22382s = mo22382s(objM22371w);
        int iMo22373A = mo22373A(iMo22382s);
        mo22376D(iMo22382s).mo22380h(objM22370v, c15105b);
        c15105b.f34059c += iMo22373A;
        c15105b.f34058b = obj;
        return c15105b;
    }

    @Override // p001o.lmh
    /* renamed from: l */
    public int mo22381l(int i, int i2, boolean z) {
        if (this.f19160g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo22384u = mo22384u(i);
        int iMo22373A = mo22373A(iMo22384u);
        int iMo22381l = mo22376D(iMo22384u).mo22381l(i - iMo22373A, i2 != 2 ? i2 : 0, z);
        if (iMo22381l != -1) {
            return iMo22373A + iMo22381l;
        }
        int iM22375C = m22375C(iMo22384u, z);
        while (iM22375C != -1 && mo22376D(iM22375C).m37477q()) {
            iM22375C = m22375C(iM22375C, z);
        }
        if (iM22375C != -1) {
            return mo22373A(iM22375C) + mo22376D(iM22375C).mo22378c(z);
        }
        if (i2 == 2) {
            return mo22378c(z);
        }
        return -1;
    }

    @Override // p001o.lmh
    /* renamed from: m */
    public final Object mo6952m(int i) {
        int iMo22383t = mo22383t(i);
        return m22372y(mo22385x(iMo22383t), mo22376D(iMo22383t).mo6952m(i - mo22386z(iMo22383t)));
    }

    @Override // p001o.lmh
    /* renamed from: o */
    public final lmh.C15106c mo6953o(int i, lmh.C15106c c15106c, long j) {
        int iMo22384u = mo22384u(i);
        int iMo22373A = mo22373A(iMo22384u);
        int iMo22386z = mo22386z(iMo22384u);
        mo22376D(iMo22384u).mo6953o(i - iMo22373A, c15106c, j);
        Object objMo22385x = mo22385x(iMo22384u);
        if (!lmh.C15106c.f34070q.equals(c15106c.f34080a)) {
            objMo22385x = m22372y(objMo22385x, c15106c.f34080a);
        }
        c15106c.f34080a = objMo22385x;
        c15106c.f34093n += iMo22386z;
        c15106c.f34094o += iMo22386z;
        return c15106c;
    }

    /* renamed from: s */
    public abstract int mo22382s(Object obj);

    /* renamed from: t */
    public abstract int mo22383t(int i);

    /* renamed from: u */
    public abstract int mo22384u(int i);

    /* renamed from: x */
    public abstract Object mo22385x(int i);

    /* renamed from: z */
    public abstract int mo22386z(int i);
}
