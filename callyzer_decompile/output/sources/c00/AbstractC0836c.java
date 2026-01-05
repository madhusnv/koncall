package c00;

import b00.C0526k;
import b00.C0529n;
import b00.a0;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.c */
/* loaded from: classes3.dex */
public abstract class AbstractC0836c {

    /* renamed from: a */
    public static final C0529n f5299a;

    /* renamed from: b */
    public static final C0529n f5300b;

    /* renamed from: c */
    public static final C0529n f5301c;

    /* renamed from: d */
    public static final C0529n f5302d;

    /* renamed from: e */
    public static final C0529n f5303e;

    static {
        C0529n c0529n = C0529n.f3647d;
        f5299a = C5950e.m11977h("/");
        f5300b = C5950e.m11977h("\\");
        f5301c = C5950e.m11977h("/\\");
        f5302d = C5950e.m11977h(".");
        f5303e = C5950e.m11977h("..");
    }

    /* renamed from: a */
    public static final int m2255a(a0 a0Var) {
        C0529n c0529n = a0Var.f3586a;
        if (c0529n.mo1563d() != 0) {
            if (c0529n.mo1567i(0) != 47) {
                if (c0529n.mo1567i(0) == 92) {
                    if (c0529n.mo1563d() > 2 && c0529n.mo1567i(1) == 92) {
                        C0529n other = f5300b;
                        AbstractC4154l.m8923f(other, "other");
                        int iMo1565f = c0529n.mo1565f(2, other.mo1566h());
                        return iMo1565f == -1 ? c0529n.mo1563d() : iMo1565f;
                    }
                } else if (c0529n.mo1563d() > 2 && c0529n.mo1567i(1) == 58 && c0529n.mo1567i(2) == 92) {
                    char cMo1567i = (char) c0529n.mo1567i(0);
                    if ('a' <= cMo1567i && cMo1567i < '{') {
                        return 3;
                    }
                    if ('A' <= cMo1567i && cMo1567i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static final a0 m2256b(a0 a0Var, a0 child, boolean z6) {
        AbstractC4154l.m8923f(child, "child");
        if (m2255a(child) != -1 || child.m1521f() != null) {
            return child;
        }
        C0529n c0529nM2257c = m2257c(a0Var);
        if (c0529nM2257c == null && (c0529nM2257c = m2257c(child)) == null) {
            c0529nM2257c = m2260f(a0.f3585b);
        }
        C0526k c0526k = new C0526k();
        c0526k.A0(a0Var.f3586a);
        if (c0526k.f3638b > 0) {
            c0526k.A0(c0529nM2257c);
        }
        c0526k.A0(child.f3586a);
        return m2258d(c0526k, z6);
    }

    /* renamed from: c */
    public static final C0529n m2257c(a0 a0Var) {
        C0529n c0529n = a0Var.f3586a;
        C0529n c0529n2 = f5299a;
        if (C0529n.m1609g(c0529n, c0529n2) != -1) {
            return c0529n2;
        }
        C0529n c0529n3 = a0Var.f3586a;
        C0529n c0529n4 = f5300b;
        if (C0529n.m1609g(c0529n3, c0529n4) != -1) {
            return c0529n4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b00.a0 m2258d(b00.C0526k r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c00.AbstractC0836c.m2258d(b00.k, boolean):b00.a0");
    }

    /* renamed from: e */
    public static final C0529n m2259e(byte b10) {
        if (b10 == 47) {
            return f5299a;
        }
        if (b10 == 92) {
            return f5300b;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(b10, "not a directory separator: "));
    }

    /* renamed from: f */
    public static final C0529n m2260f(String str) {
        if (AbstractC4154l.m8918a(str, "/")) {
            return f5299a;
        }
        if (AbstractC4154l.m8918a(str, "\\")) {
            return f5300b;
        }
        throw new IllegalArgumentException(m0.m7378k("not a directory separator: ", str));
    }
}
