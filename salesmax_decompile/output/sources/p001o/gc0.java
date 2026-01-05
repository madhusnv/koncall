package p001o;

import android.util.SparseArray;
import androidx.media3.common.C2181a;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import java.io.IOException;
import java.util.List;
import p001o.kz0;
import p001o.mad;
import p001o.x8b;

/* loaded from: classes2.dex */
public interface gc0 {

    /* renamed from: o.gc0$a */
    public static final class C13667a {

        /* renamed from: a */
        public final long f24880a;

        /* renamed from: b */
        public final lmh f24881b;

        /* renamed from: c */
        public final int f24882c;

        /* renamed from: d */
        public final x8b.C18076b f24883d;

        /* renamed from: e */
        public final long f24884e;

        /* renamed from: f */
        public final lmh f24885f;

        /* renamed from: g */
        public final int f24886g;

        /* renamed from: h */
        public final x8b.C18076b f24887h;

        /* renamed from: i */
        public final long f24888i;

        /* renamed from: j */
        public final long f24889j;

        public C13667a(long j, lmh lmhVar, int i, x8b.C18076b c18076b, long j2, lmh lmhVar2, int i2, x8b.C18076b c18076b2, long j3, long j4) {
            this.f24880a = j;
            this.f24881b = lmhVar;
            this.f24882c = i;
            this.f24883d = c18076b;
            this.f24884e = j2;
            this.f24885f = lmhVar2;
            this.f24886g = i2;
            this.f24887h = c18076b2;
            this.f24888i = j3;
            this.f24889j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13667a.class != obj.getClass()) {
                return false;
            }
            C13667a c13667a = (C13667a) obj;
            return this.f24880a == c13667a.f24880a && this.f24882c == c13667a.f24882c && this.f24884e == c13667a.f24884e && this.f24886g == c13667a.f24886g && this.f24888i == c13667a.f24888i && this.f24889j == c13667a.f24889j && r6c.m46255a(this.f24881b, c13667a.f24881b) && r6c.m46255a(this.f24883d, c13667a.f24883d) && r6c.m46255a(this.f24885f, c13667a.f24885f) && r6c.m46255a(this.f24887h, c13667a.f24887h);
        }

        public int hashCode() {
            return r6c.m46256b(Long.valueOf(this.f24880a), this.f24881b, Integer.valueOf(this.f24882c), this.f24883d, Long.valueOf(this.f24884e), this.f24885f, Integer.valueOf(this.f24886g), this.f24887h, Long.valueOf(this.f24888i), Long.valueOf(this.f24889j));
        }
    }

    /* renamed from: o.gc0$b */
    public static final class C13668b {

        /* renamed from: a */
        public final k27 f24890a;

        /* renamed from: b */
        public final SparseArray f24891b;

        public C13668b(k27 k27Var, SparseArray sparseArray) {
            this.f24890a = k27Var;
            SparseArray sparseArray2 = new SparseArray(k27Var.m34925d());
            for (int i = 0; i < k27Var.m34925d(); i++) {
                int iM34924c = k27Var.m34924c(i);
                sparseArray2.append(iM34924c, (C13667a) op0.m42515e((C13667a) sparseArray.get(iM34924c)));
            }
            this.f24891b = sparseArray2;
        }

        /* renamed from: a */
        public boolean m28364a(int i) {
            return this.f24890a.m34922a(i);
        }

        /* renamed from: b */
        public int m28365b(int i) {
            return this.f24890a.m34924c(i);
        }

        /* renamed from: c */
        public C13667a m28366c(int i) {
            return (C13667a) op0.m42515e((C13667a) this.f24891b.get(i));
        }

        /* renamed from: d */
        public int m28367d() {
            return this.f24890a.m34925d();
        }
    }

    /* renamed from: A */
    default void m28315A(C13667a c13667a, Object obj, long j) {
    }

    /* renamed from: B */
    default void m28316B(C13667a c13667a, String str, long j) {
    }

    /* renamed from: C */
    default void m28317C(C13667a c13667a, tga tgaVar, u2b u2bVar) {
    }

    /* renamed from: D */
    default void m28318D(C13667a c13667a, yth ythVar) {
    }

    /* renamed from: E */
    default void m28319E(C13667a c13667a, String str, long j, long j2) {
    }

    /* renamed from: F */
    default void m28320F(C13667a c13667a, boolean z, int i) {
    }

    /* renamed from: G */
    default void m28321G(C13667a c13667a, Exception exc) {
    }

    /* renamed from: H */
    default void m28322H(C13667a c13667a) {
    }

    /* renamed from: I */
    default void m28323I(C13667a c13667a, s2b s2bVar, int i) {
    }

    /* renamed from: J */
    void mo28324J(C13667a c13667a, mad.C15267e c15267e, mad.C15267e c15267e2, int i);

    /* renamed from: K */
    default void m28325K(C13667a c13667a, Metadata metadata) {
    }

    /* renamed from: L */
    default void m28326L(C13667a c13667a, long j, int i) {
    }

    /* renamed from: M */
    default void m28327M(C13667a c13667a, C2181a c2181a, c85 c85Var) {
    }

    /* renamed from: N */
    default void m28328N(C13667a c13667a, mad.C15264b c15264b) {
    }

    /* renamed from: O */
    default void m28329O(C13667a c13667a) {
    }

    /* renamed from: P */
    default void m28330P(C13667a c13667a, int i, long j) {
    }

    /* renamed from: Q */
    default void m28331Q(C13667a c13667a, boolean z) {
    }

    /* renamed from: S */
    default void m28332S(C13667a c13667a) {
    }

    /* renamed from: T */
    default void m28333T(C13667a c13667a, int i) {
    }

    /* renamed from: U */
    default void m28334U(C13667a c13667a, String str, long j) {
    }

    /* renamed from: V */
    default void m28335V(C13667a c13667a, String str, long j, long j2) {
    }

    /* renamed from: W */
    default void m28336W(C13667a c13667a, boolean z) {
    }

    /* renamed from: X */
    default void m28337X(C13667a c13667a, C2181a c2181a, c85 c85Var) {
    }

    /* renamed from: Y */
    default void m28338Y(C13667a c13667a) {
    }

    /* renamed from: Z */
    default void m28339Z(C13667a c13667a, tga tgaVar, u2b u2bVar) {
    }

    /* renamed from: a */
    default void m28340a(C13667a c13667a) {
    }

    default void a0(C13667a c13667a, iad iadVar) {
    }

    /* renamed from: b */
    default void m28341b(C13667a c13667a, boolean z, int i) {
    }

    default void b0(C13667a c13667a, Exception exc) {
    }

    /* renamed from: c */
    default void m28342c(C13667a c13667a, kz0.C14937a c14937a) {
    }

    void c0(mad madVar, C13668b c13668b);

    /* renamed from: d */
    default void m28343d(C13667a c13667a, Exception exc) {
    }

    default void d0(C13667a c13667a) {
    }

    /* renamed from: e */
    default void m28344e(C13667a c13667a, int i, int i2) {
    }

    /* renamed from: f */
    void mo28345f(C13667a c13667a, iad iadVar);

    default void f0(C13667a c13667a, long j) {
    }

    /* renamed from: g */
    default void m28346g(C13667a c13667a) {
    }

    default void g0(C13667a c13667a, int i, int i2, int i3, float f) {
    }

    /* renamed from: h */
    default void m28347h(C13667a c13667a, int i) {
    }

    default void h0(C13667a c13667a, kad kadVar) {
    }

    /* renamed from: i */
    default void m28348i(C13667a c13667a, boolean z) {
    }

    default void i0(C13667a c13667a, int i, boolean z) {
    }

    /* renamed from: j */
    default void m28349j(C13667a c13667a, String str) {
    }

    default void j0(C13667a c13667a, int i, long j, long j2) {
    }

    /* renamed from: k */
    default void m28350k(C13667a c13667a, kz0.C14937a c14937a) {
    }

    default void k0(C13667a c13667a, y75 y75Var) {
    }

    /* renamed from: l */
    default void m28351l(C13667a c13667a, wx0 wx0Var) {
    }

    void l0(C13667a c13667a, tga tgaVar, u2b u2bVar, IOException iOException, boolean z);

    default void m0(C13667a c13667a, C2182b c2182b) {
    }

    /* renamed from: n */
    default void m28352n(C13667a c13667a, int i) {
    }

    default void n0(C13667a c13667a, y75 y75Var) {
    }

    /* renamed from: o */
    default void m28353o(C13667a c13667a, String str) {
    }

    default void o0(C13667a c13667a, int i) {
    }

    default void p0(C13667a c13667a, euh euhVar) {
    }

    /* renamed from: q */
    default void m28354q(C13667a c13667a, y75 y75Var) {
    }

    default void q0(C13667a c13667a, tga tgaVar, u2b u2bVar) {
    }

    /* renamed from: r */
    default void m28355r(C13667a c13667a, boolean z) {
    }

    void r0(C13667a c13667a, bvi bviVar);

    /* renamed from: s */
    default void m28356s(C13667a c13667a, int i) {
    }

    default void s0(C13667a c13667a, boolean z) {
    }

    /* renamed from: t */
    default void m28357t(C13667a c13667a, Exception exc) {
    }

    default void t0(C13667a c13667a, List list) {
    }

    /* renamed from: u */
    default void m28358u(C13667a c13667a, int i) {
    }

    void u0(C13667a c13667a, int i, long j, long j2);

    /* renamed from: v */
    default void m28359v(C13667a c13667a, u2b u2bVar) {
    }

    /* renamed from: w */
    void mo28360w(C13667a c13667a, u2b u2bVar);

    /* renamed from: x */
    default void m28361x(C13667a c13667a, hd4 hd4Var) {
    }

    /* renamed from: y */
    default void m28362y(C13667a c13667a, sq5 sq5Var) {
    }

    /* renamed from: z */
    void mo28363z(C13667a c13667a, y75 y75Var);
}
