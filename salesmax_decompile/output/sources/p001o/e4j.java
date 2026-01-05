package p001o;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class e4j {

    /* renamed from: o.e4j$a */
    public static final class C13100a {

        /* renamed from: a */
        public final int f20965a;

        /* renamed from: b */
        public final long f20966b;

        public C13100a(int i, long j) {
            this.f20965a = i;
            this.f20966b = j;
        }

        /* renamed from: a */
        public static C13100a m24312a(uq6 uq6Var, zwc zwcVar) {
            uq6Var.mo40498m(zwcVar.m60024e(), 0, 8);
            zwcVar.m60017U(0);
            return new C13100a(zwcVar.m60036q(), zwcVar.m60043x());
        }
    }

    /* renamed from: a */
    public static boolean m24307a(uq6 uq6Var) {
        zwc zwcVar = new zwc(8);
        int i = C13100a.m24312a(uq6Var, zwcVar).f20965a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        uq6Var.mo40498m(zwcVar.m60024e(), 0, 4);
        zwcVar.m60017U(0);
        int iM60036q = zwcVar.m60036q();
        if (iM60036q == 1463899717) {
            return true;
        }
        ria.m46819c("WavHeaderReader", "Unsupported form type: " + iM60036q);
        return false;
    }

    /* renamed from: b */
    public static d4j m24308b(uq6 uq6Var) throws byc {
        byte[] bArr;
        zwc zwcVar = new zwc(16);
        C13100a c13100aM24310d = m24310d(1718449184, uq6Var, zwcVar);
        op0.m42517g(c13100aM24310d.f20966b >= 16);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, 16);
        zwcVar.m60017U(0);
        int iM60045z = zwcVar.m60045z();
        int iM60045z2 = zwcVar.m60045z();
        int iM60044y = zwcVar.m60044y();
        int iM60044y2 = zwcVar.m60044y();
        int iM60045z3 = zwcVar.m60045z();
        int iM60045z4 = zwcVar.m60045z();
        int i = ((int) c13100aM24310d.f20966b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            uq6Var.mo40498m(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = sqi.f45795f;
        }
        uq6Var.mo40496k((int) (uq6Var.mo40493g() - uq6Var.getPosition()));
        return new d4j(iM60045z, iM60045z2, iM60044y, iM60044y2, iM60045z3, iM60045z4, bArr);
    }

    /* renamed from: c */
    public static long m24309c(uq6 uq6Var) {
        zwc zwcVar = new zwc(8);
        C13100a c13100aM24312a = C13100a.m24312a(uq6Var, zwcVar);
        if (c13100aM24312a.f20965a != 1685272116) {
            uq6Var.mo40490c();
            return -1L;
        }
        uq6Var.mo40494h(8);
        zwcVar.m60017U(0);
        uq6Var.mo40498m(zwcVar.m60024e(), 0, 8);
        long jM60041v = zwcVar.m60041v();
        uq6Var.mo40496k(((int) c13100aM24312a.f20966b) + 8);
        return jM60041v;
    }

    /* renamed from: d */
    public static C13100a m24310d(int i, uq6 uq6Var, zwc zwcVar) throws byc {
        C13100a c13100aM24312a = C13100a.m24312a(uq6Var, zwcVar);
        while (c13100aM24312a.f20965a != i) {
            ria.m46824h("WavHeaderReader", "Ignoring unknown WAV chunk: " + c13100aM24312a.f20965a);
            long j = c13100aM24312a.f20966b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2++;
            }
            if (j2 > 2147483647L) {
                throw byc.m19924d("Chunk is too large (~2GB+) to skip; id: " + c13100aM24312a.f20965a);
            }
            uq6Var.mo40496k((int) j2);
            c13100aM24312a = C13100a.m24312a(uq6Var, zwcVar);
        }
        return c13100aM24312a;
    }

    /* renamed from: e */
    public static Pair m24311e(uq6 uq6Var) throws byc {
        uq6Var.mo40490c();
        C13100a c13100aM24310d = m24310d(1684108385, uq6Var, new zwc(8));
        uq6Var.mo40496k(8);
        return Pair.create(Long.valueOf(uq6Var.getPosition()), Long.valueOf(c13100aM24310d.f20966b));
    }
}
