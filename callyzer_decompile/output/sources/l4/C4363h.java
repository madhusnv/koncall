package l4;

import b2.C0558p;
import com.sun.mail.util.AbstractC1452a;
import fm.C2322a;
import g4.C2492h;
import g4.n0;
import m4.AbstractC4646a;
import og.yf;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ty.AbstractC7280n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.h */
/* loaded from: classes.dex */
public final class C4363h {

    /* renamed from: a */
    public final C2322a f21902a;

    /* renamed from: b */
    public int f21903b;

    /* renamed from: c */
    public int f21904c;

    /* renamed from: d */
    public int f21905d;

    /* renamed from: e */
    public int f21906e;

    public C4363h(C2492h c2492h, long j6) {
        String str = c2492h.f13620b;
        C2322a c2322a = new C2322a(2);
        c2322a.f10539d = str;
        c2322a.f10537b = -1;
        c2322a.f10538c = -1;
        this.f21902a = c2322a;
        this.f21903b = n0.m6458e(j6);
        this.f21904c = n0.m6457d(j6);
        this.f21905d = -1;
        this.f21906e = -1;
        int iM6458e = n0.m6458e(j6);
        int iM6457d = n0.m6457d(j6);
        if (iM6458e < 0 || iM6458e > str.length()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(iM6458e, "start (", ") offset is outside of text region ");
            sbM4567n.append(str.length());
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
        if (iM6457d < 0 || iM6457d > str.length()) {
            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(iM6457d, "end (", ") offset is outside of text region ");
            sbM4567n2.append(str.length());
            throw new IndexOutOfBoundsException(sbM4567n2.toString());
        }
        if (iM6458e > iM6457d) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Do not set reversed range: ", iM6458e, iM6457d, " > "));
        }
    }

    /* renamed from: a */
    public final void m9104a(int i10, int i11) {
        long jM11072a = yf.m11072a(i10, i11);
        this.f21902a.m6003m(i10, i11, "");
        long jM13603a = AbstractC7280n.m13603a(yf.m11072a(this.f21903b, this.f21904c), jM11072a);
        m9111h(n0.m6458e(jM13603a));
        m9110g(n0.m6457d(jM13603a));
        int i12 = this.f21905d;
        if (i12 != -1) {
            long jM13603a2 = AbstractC7280n.m13603a(yf.m11072a(i12, this.f21906e), jM11072a);
            if (n0.m6455b(jM13603a2)) {
                this.f21905d = -1;
                this.f21906e = -1;
            } else {
                this.f21905d = n0.m6458e(jM13603a2);
                this.f21906e = n0.m6457d(jM13603a2);
            }
        }
    }

    /* renamed from: b */
    public final char m9105b(int i10) {
        C2322a c2322a = this.f21902a;
        C0558p c0558p = (C0558p) c2322a.f10540e;
        if (c0558p == null) {
            return ((String) c2322a.f10539d).charAt(i10);
        }
        if (i10 < c2322a.f10537b) {
            return ((String) c2322a.f10539d).charAt(i10);
        }
        int iM1657e = c0558p.f3795b - c0558p.m1657e();
        int i11 = c2322a.f10537b;
        if (i10 >= iM1657e + i11) {
            return ((String) c2322a.f10539d).charAt(i10 - ((iM1657e - c2322a.f10538c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = c0558p.f3796c;
        return i12 < i13 ? ((char[]) c0558p.f3798e)[i12] : ((char[]) c0558p.f3798e)[(i12 - i13) + c0558p.f3797d];
    }

    /* renamed from: c */
    public final n0 m9106c() {
        int i10 = this.f21905d;
        if (i10 != -1) {
            return new n0(yf.m11072a(i10, this.f21906e));
        }
        return null;
    }

    /* renamed from: d */
    public final void m9107d(int i10, int i11, String str) {
        C2322a c2322a = this.f21902a;
        if (i10 < 0 || i10 > c2322a.m5992b()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "start (", ") offset is outside of text region ");
            sbM4567n.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
        if (i11 < 0 || i11 > c2322a.m5992b()) {
            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(i11, "end (", ") offset is outside of text region ");
            sbM4567n2.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Do not set reversed range: ", i10, i11, " > "));
        }
        c2322a.m6003m(i10, i11, str);
        m9111h(str.length() + i10);
        m9110g(str.length() + i10);
        this.f21905d = -1;
        this.f21906e = -1;
    }

    /* renamed from: e */
    public final void m9108e(int i10, int i11) {
        C2322a c2322a = this.f21902a;
        if (i10 < 0 || i10 > c2322a.m5992b()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "start (", ") offset is outside of text region ");
            sbM4567n.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
        if (i11 < 0 || i11 > c2322a.m5992b()) {
            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(i11, "end (", ") offset is outside of text region ");
            sbM4567n2.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Do not set reversed or empty range: ", i10, i11, " > "));
        }
        this.f21905d = i10;
        this.f21906e = i11;
    }

    /* renamed from: f */
    public final void m9109f(int i10, int i11) {
        C2322a c2322a = this.f21902a;
        if (i10 < 0 || i10 > c2322a.m5992b()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "start (", ") offset is outside of text region ");
            sbM4567n.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n.toString());
        }
        if (i11 < 0 || i11 > c2322a.m5992b()) {
            StringBuilder sbM4567n2 = AbstractC1452a.m4567n(i11, "end (", ") offset is outside of text region ");
            sbM4567n2.append(c2322a.m5992b());
            throw new IndexOutOfBoundsException(sbM4567n2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Do not set reversed range: ", i10, i11, " > "));
        }
        m9111h(i10);
        m9110g(i11);
    }

    /* renamed from: g */
    public final void m9110g(int i10) {
        if (!(i10 >= 0)) {
            AbstractC4646a.m9525a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f21904c = i10;
    }

    /* renamed from: h */
    public final void m9111h(int i10) {
        if (!(i10 >= 0)) {
            AbstractC4646a.m9525a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f21903b = i10;
    }

    public final String toString() {
        return this.f21902a.toString();
    }
}
