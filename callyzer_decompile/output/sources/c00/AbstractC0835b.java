package c00;

import ap.C0390c;
import b00.C0526k;
import b00.a0;
import b00.d0;
import b00.g0;
import ex.InterfaceC2141e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4167y;
import kotlin.jvm.internal.C4168z;
import mm.AbstractC4801l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.d2;
import org.bouncycastle.crypto.hpke.HPKE;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0835b {

    /* renamed from: a */
    public static final char[] f5298a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m2248a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* renamed from: b */
    public static final LinkedHashMap m2249b(ArrayList arrayList) {
        String str = a0.f3585b;
        a0 a0VarM16037m = C8687a.m16037m("/");
        LinkedHashMap linkedHashMapM12779g = AbstractC6674x.m12779g(new C6361k(a0VarM16037m, new C0841h(a0VarM16037m, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (C0841h c0841h : AbstractC6663m.m12760X(arrayList, new C0390c(2))) {
            if (((C0841h) linkedHashMapM12779g.put(c0841h.f5314a, c0841h)) == null) {
                while (true) {
                    a0 a0Var = c0841h.f5314a;
                    a0 a0VarM1517b = a0Var.m1517b();
                    if (a0VarM1517b != null) {
                        C0841h c0841h2 = (C0841h) linkedHashMapM12779g.get(a0VarM1517b);
                        if (c0841h2 != null) {
                            c0841h2.f5330q.add(a0Var);
                            break;
                        }
                        C0841h c0841h3 = new C0841h(a0VarM1517b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapM12779g.put(a0VarM1517b, c0841h3);
                        c0841h3.f5330q.add(a0Var);
                        c0841h = c0841h3;
                    }
                }
            }
        }
        return linkedHashMapM12779g;
    }

    /* renamed from: c */
    public static final String m2250c(int i10) {
        d2.m10599b(16);
        String string = Integer.toString(i10, 16);
        AbstractC4154l.m8922e(string, "toString(...)");
        return "0x".concat(string);
    }

    /* renamed from: d */
    public static final C0841h m2251d(final d0 d0Var) throws IOException {
        int iM1547j = d0Var.m1547j();
        if (iM1547j != 33639248) {
            throw new IOException("bad zip: expected " + m2250c(33639248) + " but was " + m2250c(iM1547j));
        }
        d0Var.skip(4L);
        short sM1550u = d0Var.m1550u();
        int i10 = sM1550u & HPKE.aead_EXPORT_ONLY;
        if ((sM1550u & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m2250c(i10));
        }
        int iM1550u = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        int iM1550u2 = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        int iM1550u3 = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        long jM1547j = d0Var.m1547j() & 4294967295L;
        final C4167y c4167y = new C4167y();
        c4167y.f21163a = d0Var.m1547j() & 4294967295L;
        final C4167y c4167y2 = new C4167y();
        c4167y2.f21163a = d0Var.m1547j() & 4294967295L;
        int iM1550u4 = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        int iM1550u5 = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        int iM1550u6 = 65535 & d0Var.m1550u();
        d0Var.skip(8L);
        final C4167y c4167y3 = new C4167y();
        c4167y3.f21163a = d0Var.m1547j() & 4294967295L;
        String strM1551w = d0Var.m1551w(iM1550u4);
        if (AbstractC5178p.m10117y(strM1551w, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j6 = c4167y2.f21163a == 4294967295L ? 8 : 0L;
        if (c4167y.f21163a == 4294967295L) {
            j6 += 8;
        }
        if (c4167y3.f21163a == 4294967295L) {
            j6 += 8;
        }
        final C4168z c4168z = new C4168z();
        final C4168z c4168z2 = new C4168z();
        final C4168z c4168z3 = new C4168z();
        final C4164v c4164v = new C4164v();
        m2252e(d0Var, iM1550u5, new InterfaceC2141e() { // from class: c00.j
            @Override // ex.InterfaceC2141e
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                d0 d0Var2 = d0Var;
                if (iIntValue == 1) {
                    C4164v c4164v2 = c4164v;
                    if (c4164v2.f21160a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    c4164v2.f21160a = true;
                    if (jLongValue < j6) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    C4167y c4167y4 = c4167y2;
                    long jM1548n = c4167y4.f21163a;
                    if (jM1548n == 4294967295L) {
                        jM1548n = d0Var2.m1548n();
                    }
                    c4167y4.f21163a = jM1548n;
                    C4167y c4167y5 = c4167y;
                    c4167y5.f21163a = c4167y5.f21163a == 4294967295L ? d0Var2.m1548n() : 0L;
                    C4167y c4167y6 = c4167y3;
                    c4167y6.f21163a = c4167y6.f21163a == 4294967295L ? d0Var2.m1548n() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    d0Var2.skip(4L);
                    AbstractC0835b.m2252e(d0Var2, (int) (jLongValue - 4), new C0842i(c4168z, d0Var2, c4168z2, c4168z3));
                }
                return qw.a0.f30746a;
            }
        });
        if (j6 > 0 && !c4164v.f21160a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM1551w2 = d0Var.m1551w(iM1550u6);
        String str = a0.f3585b;
        return new C0841h(C8687a.m16037m("/").m1519d(strM1551w), AbstractC5185w.m10129k(strM1551w, "/", false), strM1551w2, jM1547j, c4167y.f21163a, c4167y2.f21163a, iM1550u, c4167y3.f21163a, iM1550u3, iM1550u2, (Long) c4168z.f21164a, (Long) c4168z2.f21164a, (Long) c4168z3.f21164a, 57344);
    }

    /* renamed from: e */
    public static final void m2252e(d0 d0Var, int i10, InterfaceC2141e interfaceC2141e) throws IOException {
        C0526k c0526k = d0Var.f3602b;
        long j6 = i10;
        while (j6 != 0) {
            if (j6 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM1550u = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
            long jM1550u = d0Var.m1550u() & 65535;
            long j10 = j6 - 4;
            if (j10 < jM1550u) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            d0Var.s0(jM1550u);
            long j11 = c0526k.f3638b;
            interfaceC2141e.invoke(Integer.valueOf(iM1550u), Long.valueOf(jM1550u));
            long j12 = (c0526k.f3638b + jM1550u) - j11;
            if (j12 < 0) {
                throw new IOException(AbstractC4801l.m9730d(iM1550u, "unsupported zip: too many bytes processed for "));
            }
            if (j12 > 0) {
                c0526k.skip(j12);
            }
            j6 = j10 - jM1550u;
        }
    }

    /* renamed from: f */
    public static final C0841h m2253f(d0 d0Var, C0841h c0841h) throws IOException {
        int iM1547j = d0Var.m1547j();
        if (iM1547j != 67324752) {
            throw new IOException("bad zip: expected " + m2250c(67324752) + " but was " + m2250c(iM1547j));
        }
        d0Var.skip(2L);
        short sM1550u = d0Var.m1550u();
        int i10 = sM1550u & HPKE.aead_EXPORT_ONLY;
        if ((sM1550u & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m2250c(i10));
        }
        d0Var.skip(18L);
        int iM1550u = d0Var.m1550u() & HPKE.aead_EXPORT_ONLY;
        d0Var.skip(d0Var.m1550u() & 65535);
        if (c0841h == null) {
            d0Var.skip(iM1550u);
            return null;
        }
        C4168z c4168z = new C4168z();
        C4168z c4168z2 = new C4168z();
        C4168z c4168z3 = new C4168z();
        m2252e(d0Var, iM1550u, new C0842i(d0Var, c4168z, c4168z2, c4168z3));
        return new C0841h(c0841h.f5314a, c0841h.f5315b, c0841h.f5316c, c0841h.f5317d, c0841h.f5318e, c0841h.f5319f, c0841h.f5320g, c0841h.f5321h, c0841h.f5322i, c0841h.f5323j, c0841h.f5324k, c0841h.f5325l, c0841h.f5326m, (Integer) c4168z.f21164a, (Integer) c4168z2.f21164a, (Integer) c4168z3.f21164a);
    }

    /* renamed from: g */
    public static final int m2254g(g0 g0Var, int i10) {
        int i11;
        int[] iArr = g0Var.f3626f;
        int i12 = i10 + 1;
        int length = g0Var.f3625e.length;
        AbstractC4154l.m8923f(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }
}
