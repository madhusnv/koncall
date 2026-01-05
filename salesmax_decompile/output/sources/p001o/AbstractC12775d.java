package p001o;

import java.io.EOFException;
import java.util.ArrayList;
import p001o.zq1;

/* renamed from: o.d */
/* loaded from: classes6.dex */
public abstract class AbstractC12775d {

    /* renamed from: a */
    public static final zq1 f18907a;

    /* renamed from: b */
    public static final zq1 f18908b;

    /* renamed from: c */
    public static final zq1 f18909c;

    /* renamed from: d */
    public static final zq1 f18910d;

    /* renamed from: e */
    public static final zq1 f18911e;

    static {
        zq1.C18692a c18692a = zq1.f57497d;
        f18907a = c18692a.m59707c("/");
        f18908b = c18692a.m59707c("\\");
        f18909c = c18692a.m59707c("/\\");
        f18910d = c18692a.m59707c(".");
        f18911e = c18692a.m59707c("..");
    }

    /* renamed from: j */
    public static final wzc m22153j(wzc wzcVar, wzc wzcVar2, boolean z) {
        sq8.m48649h(wzcVar, "<this>");
        sq8.m48649h(wzcVar2, "child");
        if (wzcVar2.m55472g() || wzcVar2.m55480u() != null) {
            return wzcVar2;
        }
        zq1 zq1VarM22156m = m22156m(wzcVar);
        if (zq1VarM22156m == null && (zq1VarM22156m = m22156m(wzcVar2)) == null) {
            zq1VarM22156m = m22162s(wzc.f52937c);
        }
        rl1 rl1Var = new rl1();
        rl1Var.M2(wzcVar.m55469c());
        if (rl1Var.f0() > 0) {
            rl1Var.M2(zq1VarM22156m);
        }
        rl1Var.M2(wzcVar2.m55469c());
        return m22160q(rl1Var, z);
    }

    /* renamed from: k */
    public static final wzc m22154k(String str, boolean z) {
        sq8.m48649h(str, "<this>");
        return m22160q(new rl1().n0(str), z);
    }

    /* renamed from: l */
    public static final int m22155l(wzc wzcVar) {
        int iM59685C = zq1.m59685C(wzcVar.m55469c(), f18907a, 0, 2, null);
        return iM59685C != -1 ? iM59685C : zq1.m59685C(wzcVar.m55469c(), f18908b, 0, 2, null);
    }

    /* renamed from: m */
    public static final zq1 m22156m(wzc wzcVar) {
        zq1 zq1VarM55469c = wzcVar.m55469c();
        zq1 zq1Var = f18907a;
        if (zq1.m59688x(zq1VarM55469c, zq1Var, 0, 2, null) != -1) {
            return zq1Var;
        }
        zq1 zq1VarM55469c2 = wzcVar.m55469c();
        zq1 zq1Var2 = f18908b;
        if (zq1.m59688x(zq1VarM55469c2, zq1Var2, 0, 2, null) != -1) {
            return zq1Var2;
        }
        return null;
    }

    /* renamed from: n */
    public static final boolean m22157n(wzc wzcVar) {
        return wzcVar.m55469c().m59698g(f18911e) && (wzcVar.m55469c().m59694L() == 2 || wzcVar.m55469c().mo38685E(wzcVar.m55469c().m59694L() + (-3), f18907a, 0, 1) || wzcVar.m55469c().mo38685E(wzcVar.m55469c().m59694L() + (-3), f18908b, 0, 1));
    }

    /* renamed from: o */
    public static final int m22158o(wzc wzcVar) {
        if (wzcVar.m55469c().m59694L() == 0) {
            return -1;
        }
        boolean z = false;
        if (wzcVar.m55469c().m59699h(0) == 47) {
            return 1;
        }
        if (wzcVar.m55469c().m59699h(0) == 92) {
            if (wzcVar.m55469c().m59694L() <= 2 || wzcVar.m55469c().m59699h(1) != 92) {
                return 1;
            }
            int iM59703t = wzcVar.m55469c().m59703t(f18908b, 2);
            return iM59703t == -1 ? wzcVar.m55469c().m59694L() : iM59703t;
        }
        if (wzcVar.m55469c().m59694L() <= 2 || wzcVar.m55469c().m59699h(1) != 58 || wzcVar.m55469c().m59699h(2) != 92) {
            return -1;
        }
        char cM59699h = (char) wzcVar.m55469c().m59699h(0);
        if ('a' <= cM59699h && cM59699h < '{') {
            return 3;
        }
        if ('A' <= cM59699h && cM59699h < '[') {
            z = true;
        }
        return !z ? -1 : 3;
    }

    /* renamed from: p */
    public static final boolean m22159p(rl1 rl1Var, zq1 zq1Var) {
        if (!sq8.m48644c(zq1Var, f18908b) || rl1Var.f0() < 2 || rl1Var.m46918s(1L) != 58) {
            return false;
        }
        char cM46918s = (char) rl1Var.m46918s(0L);
        if (!('a' <= cM46918s && cM46918s < '{')) {
            if (!('A' <= cM46918s && cM46918s < '[')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static final wzc m22160q(rl1 rl1Var, boolean z) throws EOFException {
        zq1 zq1Var;
        zq1 zq1VarY1;
        sq8.m48649h(rl1Var, "<this>");
        rl1 rl1Var2 = new rl1();
        zq1 zq1VarM22161r = null;
        int i = 0;
        while (true) {
            if (!rl1Var.m46903D(0L, f18907a)) {
                zq1Var = f18908b;
                if (!rl1Var.m46903D(0L, zq1Var)) {
                    break;
                }
            }
            byte b = rl1Var.readByte();
            if (zq1VarM22161r == null) {
                zq1VarM22161r = m22161r(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && sq8.m48644c(zq1VarM22161r, zq1Var);
        if (z2) {
            sq8.m48646e(zq1VarM22161r);
            rl1Var2.M2(zq1VarM22161r);
            rl1Var2.M2(zq1VarM22161r);
        } else if (i > 0) {
            sq8.m48646e(zq1VarM22161r);
            rl1Var2.M2(zq1VarM22161r);
        } else {
            long jR2 = rl1Var.r2(f18909c);
            if (zq1VarM22161r == null) {
                zq1VarM22161r = jR2 == -1 ? m22162s(wzc.f52937c) : m22161r(rl1Var.m46918s(jR2));
            }
            if (m22159p(rl1Var, zq1VarM22161r)) {
                if (jR2 == 2) {
                    rl1Var2.M0(rl1Var, 3L);
                } else {
                    rl1Var2.M0(rl1Var, 2L);
                }
            }
        }
        boolean z3 = rl1Var2.f0() > 0;
        ArrayList arrayList = new ArrayList();
        while (!rl1Var.mo32311n()) {
            long jR22 = rl1Var.r2(f18909c);
            if (jR22 == -1) {
                zq1VarY1 = rl1Var.m46906O();
            } else {
                zq1VarY1 = rl1Var.y1(jR22);
                rl1Var.readByte();
            }
            zq1 zq1Var2 = f18911e;
            if (sq8.m48644c(zq1VarY1, zq1Var2)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || sq8.m48644c(kh3.r0(arrayList), zq1Var2)))) {
                        arrayList.add(zq1VarY1);
                    } else if (!z2 || arrayList.size() != 1) {
                        hh3.m30450J(arrayList);
                    }
                }
            } else if (!sq8.m48644c(zq1VarY1, f18910d) && !sq8.m48644c(zq1VarY1, zq1.f57498e)) {
                arrayList.add(zq1VarY1);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                rl1Var2.M2(zq1VarM22161r);
            }
            rl1Var2.M2((zq1) arrayList.get(i2));
        }
        if (rl1Var2.f0() == 0) {
            rl1Var2.M2(f18910d);
        }
        return new wzc(rl1Var2.m46906O());
    }

    /* renamed from: r */
    public static final zq1 m22161r(byte b) {
        if (b == 47) {
            return f18907a;
        }
        if (b == 92) {
            return f18908b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    /* renamed from: s */
    public static final zq1 m22162s(String str) {
        if (sq8.m48644c(str, "/")) {
            return f18907a;
        }
        if (sq8.m48644c(str, "\\")) {
            return f18908b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
