package og;

import ea.C1971a;
import ex.InterfaceC2139c;
import h1.C2790u;
import java.util.ArrayList;
import k1.C3936k;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import l4.C4367l;
import o1.InterfaceC5247f;
import o1.InterfaceC5249h;
import r1.C6417b;
import r1.C6423h;
import r1.C6440y;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class rd {
    /* renamed from: a */
    public static final void m10873a(C6417b c6417b, InterfaceC7879r interfaceC7879r, C6440y c6440y, o1.h1 h1Var, InterfaceC5249h interfaceC5249h, InterfaceC5247f interfaceC5247f, k1.k0 k0Var, boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i10) {
        o1.h1 h1Var2;
        k1.k0 k0Var2;
        boolean z10;
        o1.h1 i1Var;
        int i11;
        k1.k0 k0Var3;
        boolean z11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1485410512);
        int i12 = i10 | (c3966o.m8614g(c6417b) ? 4 : 2) | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | (c3966o.m8614g(c6440y) ? 256 : 128) | 104885248 | (c3966o.m8616i(interfaceC2139c) ? 536870912 : 268435456);
        if (c3966o.m8598P(i12 & 1, (306783379 & i12) != 306783378)) {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                float f6 = 0;
                i1Var = new o1.i1(f6, f6, f6, f6);
                C2790u c2790uM6086a = g1.h1.m6086a(c3966o);
                boolean zM8614g = c3966o.m8614g(c2790uM6086a);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new C3936k(c2790uM6086a);
                    c3966o.j0(objM8596M);
                }
                i11 = i12 & (-29360129);
                k0Var3 = (C3936k) objM8596M;
                z11 = true;
            } else {
                c3966o.m8601S();
                i11 = i12 & (-29360129);
                i1Var = h1Var;
                k0Var3 = k0Var;
                z11 = z6;
            }
            c3966o.m8624q();
            m10874b(c6417b, interfaceC7879r, c6440y, i1Var, interfaceC5249h, interfaceC5247f, k0Var3, z11, i1.e1.m7494a(c3966o), interfaceC2139c, c3966o, i11 & 268435454, (i11 >> 27) & 14, 0);
            h1Var2 = i1Var;
            k0Var2 = k0Var3;
            z10 = z11;
        } else {
            c3966o.m8601S();
            h1Var2 = h1Var;
            k0Var2 = k0Var;
            z10 = z6;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6423h(c6417b, interfaceC7879r, c6440y, h1Var2, interfaceC5249h, interfaceC5247f, k0Var2, z10, interfaceC2139c, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10874b(r1.InterfaceC6418c r27, w2.InterfaceC7879r r28, r1.C6440y r29, o1.h1 r30, o1.InterfaceC5249h r31, o1.InterfaceC5247f r32, k1.k0 r33, boolean r34, i1.C3128g r35, ex.InterfaceC2139c r36, k2.InterfaceC3962k r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.rd.m10874b(r1.c, w2.r, r1.y, o1.h1, o1.h, o1.f, k1.k0, boolean, i1.g, ex.c, k2.k, int, int, int):void");
    }

    /* renamed from: c */
    public static final ArrayList m10875c(int i10, int i11, int i12) {
        int i13 = i10 - ((i11 - 1) * i12);
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    /* renamed from: d */
    public abstract pg.v9 mo8827d();

    /* renamed from: e */
    public abstract void mo8828e(pg.v9 v9Var);

    /* renamed from: f */
    public abstract Object mo8829f(pg.v9 v9Var, C4367l c4367l, C4367l c4367l2, C1971a c1971a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:12:0x0027, B:54:0x00e6, B:56:0x00ea, B:58:0x00fa, B:57:0x00f2), top: B:61:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2 A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:12:0x0027, B:54:0x00e6, B:56:0x00ea, B:58:0x00fa, B:57:0x00f2), top: B:61:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m10876g(ex.InterfaceC2139c r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.rd.m10876g(ex.c, ww.c):java.lang.Object");
    }
}
