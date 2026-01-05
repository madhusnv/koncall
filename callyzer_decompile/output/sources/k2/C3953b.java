package k2;

import be.C0649d;
import e1.C1921w;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f9.C2222e;
import hp.C2995b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import m2.C4640e;
import rw.AbstractC6662l;
import rw.C6668r;
import s2.C6737f;
import s2.C6738g;
import tx.C7260t;
import tx.C7263w;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.b */
/* loaded from: classes.dex */
public final class C3953b {

    /* renamed from: a */
    public static final Object f20347a = new Object();

    /* renamed from: b */
    public static final f0 f20348b = new f0();

    /* renamed from: A */
    public static final int m8496A(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    /* renamed from: B */
    public static final C6738g m8497B(m1[] m1VarArr, i1 i1Var, i1 i1Var2) {
        C6738g c6738g = C6738g.f32179d;
        C6737f c6737f = new C6737f(c6738g);
        c6737f.f32178g = c6738g;
        for (m1 m1Var : m1VarArr) {
            l1 l1Var = m1Var.f20432a;
            if (m1Var.f20437f || !i1Var.containsKey(l1Var)) {
                c6737f.put(l1Var, l1Var.m8555c(m1Var, (k2) i1Var2.get(l1Var)));
            }
        }
        return c6737f.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8498a(k2.m1 r11, ex.InterfaceC2141e r12, k2.InterfaceC3962k r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3953b.m8498a(k2.m1, ex.e, k2.k, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k2.i1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ex.e, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8499b(k2.m1[] r8, ex.InterfaceC2141e r9, k2.InterfaceC3962k r10, int r11) {
        /*
            k2.o r10 = (k2.C3966o) r10
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r10.a0(r0)
            k2.l0 r0 = r10.f20486w
            k2.i1 r1 = r10.m8620m()
            r2 = 201(0xc9, float:2.82E-43)
            k2.y0 r3 = k2.AbstractC3967p.f20493b
            r10.m8604V(r2, r3)
            boolean r2 = r10.f20461O
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L29
            s2.g r2 = s2.C6738g.f32179d
            s2.g r2 = m8497B(r8, r1, r2)
            s2.g r1 = r10.i0(r1, r2)
            r10.f20455I = r3
        L27:
            r2 = r4
            goto L76
        L29:
            k2.u1 r2 = r10.f20452F
            int r5 = r2.f20583g
            java.lang.Object r2 = r2.m8688g(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r2, r5)
            k2.i1 r2 = (k2.i1) r2
            k2.u1 r6 = r10.f20452F
            int r7 = r6.f20583g
            java.lang.Object r6 = r6.m8688g(r7, r3)
            kotlin.jvm.internal.AbstractC4154l.m8921d(r6, r5)
            k2.i1 r6 = (k2.i1) r6
            s2.g r5 = m8497B(r8, r1, r6)
            boolean r7 = r10.m8586C()
            if (r7 == 0) goto L67
            boolean r7 = r10.f20487x
            if (r7 != 0) goto L67
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L5a
            goto L67
        L5a:
            int r1 = r10.f20474k
            k2.u1 r5 = r10.f20452F
            int r5 = r5.m8697p()
            int r5 = r5 + r1
            r10.f20474k = r5
            r1 = r2
            goto L27
        L67:
            s2.g r1 = r10.i0(r1, r5)
            boolean r5 = r10.f20487x
            if (r5 != 0) goto L75
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r2)
            if (r2 != 0) goto L27
        L75:
            r2 = r3
        L76:
            if (r2 == 0) goto L7f
            boolean r5 = r10.f20461O
            if (r5 != 0) goto L7f
            r10.m8594K(r1)
        L7f:
            boolean r5 = r10.f20485v
            r0.m8549c(r5)
            r10.f20485v = r2
            r10.f20456J = r1
            r2 = 202(0xca, float:2.83E-43)
            k2.y0 r5 = k2.AbstractC3967p.f20494c
            r10.m8602T(r5, r2, r1, r4)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.m8623p(r4)
            r10.m8623p(r4)
            int r0 = r0.m8548b()
            if (r0 == 0) goto La7
            goto La8
        La7:
            r3 = r4
        La8:
            r10.f20485v = r3
            r0 = 0
            r10.f20456J = r0
            k2.n1 r10 = r10.m8628u()
            if (r10 == 0) goto Lbb
            g2.v3 r0 = new g2.v3
            r1 = 5
            r0.<init>(r8, r9, r11, r1)
            r10.f20443d = r0
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3953b.m8499b(k2.m1[], ex.e, k2.k, int):void");
    }

    /* renamed from: c */
    public static final void m8500c(Object obj, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8614g = c3966o.m8614g(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new d0(interfaceC2139c);
            c3966o.j0(objM8596M);
        }
    }

    /* renamed from: d */
    public static final void m8501d(Object obj, Object obj2, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8614g = c3966o.m8614g(obj) | c3966o.m8614g(obj2);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new d0(interfaceC2139c);
            c3966o.j0(objM8596M);
        }
    }

    /* renamed from: e */
    public static final void m8502e(Object[] objArr, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k) {
        boolean zM8614g = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM8614g |= ((C3966o) interfaceC3962k).m8614g(obj);
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            c3966o.j0(new d0(interfaceC2139c));
        }
    }

    /* renamed from: f */
    public static final void m8503f(InterfaceC2141e interfaceC2141e, Object obj, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        InterfaceC7564h interfaceC7564hMo8563h = c3966o.f20465b.mo8563h();
        boolean zM8614g = c3966o.m8614g(obj);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new q0(interfaceC7564hMo8563h, interfaceC2141e);
            c3966o.j0(objM8596M);
        }
    }

    /* renamed from: g */
    public static final void m8504g(Object obj, Object obj2, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        InterfaceC7564h interfaceC7564hMo8563h = c3966o.f20465b.mo8563h();
        boolean zM8614g = c3966o.m8614g(obj) | c3966o.m8614g(obj2);
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            objM8596M = new q0(interfaceC7564hMo8563h, interfaceC2141e);
            c3966o.j0(objM8596M);
        }
    }

    /* renamed from: h */
    public static final void m8505h(InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k) {
        l2.j0 j0Var = ((C3966o) interfaceC3962k).f20458L.f21792b.f21789a;
        j0Var.m9066g(l2.a0.f21790c);
        sc.c0.m12976b(j0Var, 0, interfaceC2137a);
    }

    /* renamed from: i */
    public static final void m8506i(C1921w c1921w, int i10) {
        if (c1921w.f9077b == 0 || !(c1921w.m5653c(0) == i10 || c1921w.m5653c(c1921w.f9077b - 1) == i10)) {
            int i11 = c1921w.f9077b;
            c1921w.m5651a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iM5653c = c1921w.m5653c(i12);
                if (i10 <= iM5653c) {
                    break;
                }
                c1921w.m5657g(i11, iM5653c);
                i11 = i12;
            }
            c1921w.m5657g(i11, i10);
        }
    }

    /* renamed from: j */
    public static void m8507j(y1 y1Var, List list, C3972u c3972u) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iM8734c = y1Var.m8734c((C3952a) list.get(i10));
            int iM8723K = y1Var.m8723K(y1Var.m8747q(iM8734c), y1Var.f20611b);
            Object obj = iM8723K < y1Var.m8737f(y1Var.m8747q(iM8734c + 1), y1Var.f20611b) ? y1Var.f20612c[y1Var.m8738g(iM8723K)] : C3961j.f20408a;
            n1 n1Var = obj instanceof n1 ? (n1) obj : null;
            if (n1Var != null) {
                n1Var.f20441b = c3972u;
            }
        }
    }

    /* renamed from: k */
    public static final w0 m8508k(wx.x0 x0Var, Object obj, InterfaceC7564h interfaceC7564h, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC7564h = C7565i.f36440a;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8616i = c3966o.m8616i(interfaceC7564h) | c3966o.m8616i(x0Var);
        Object objM8596M = c3966o.m8596M();
        InterfaceC7559c interfaceC7559c = null;
        s0 s0Var = C3961j.f20408a;
        if (zM8616i || objM8596M == s0Var) {
            objM8596M = new C2995b(interfaceC7564h, x0Var, interfaceC7559c, 16);
            c3966o.j0(objM8596M);
        }
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M;
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == s0Var) {
            objM8596M2 = m8517t(obj);
            c3966o.j0(objM8596M2);
        }
        w0 w0Var = (w0) objM8596M2;
        boolean zM8616i2 = c3966o.m8616i(interfaceC2141e);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8616i2 || objM8596M3 == s0Var) {
            objM8596M3 = new f2(interfaceC2141e, w0Var, interfaceC7559c, 1);
            c3966o.j0(objM8596M3);
        }
        m8504g(x0Var, interfaceC7564h, (InterfaceC2141e) objM8596M3, c3966o);
        return w0Var;
    }

    /* renamed from: l */
    public static final w0 m8509l(wx.k1 k1Var, InterfaceC3962k interfaceC3962k) {
        return m8508k(k1Var, k1Var.getValue(), C7565i.f36440a, interfaceC3962k, 0, 0);
    }

    /* renamed from: m */
    public static final InterfaceC7266z m8510m(InterfaceC7564h interfaceC7564h, InterfaceC3962k interfaceC3962k) {
        if (interfaceC7564h.o0(C7263w.f34689b) == null) {
            return new t1(((C3966o) interfaceC3962k).f20465b.mo8563h(), interfaceC7564h);
        }
        tx.f1 f1VarM13480c = tx.c0.m13480c();
        f1VarM13480c.m13558R(new C7260t(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return tx.c0.m13479b(f1VarM13480c);
    }

    /* renamed from: n */
    public static final C4640e m8511n() {
        C4367l c4367l = e2.f20375b;
        C4640e c4640e = (C4640e) c4367l.m9138r();
        if (c4640e != null) {
            return c4640e;
        }
        C4640e c4640e2 = new C4640e(new C3965n[0]);
        c4367l.m9125J(c4640e2);
        return c4640e2;
    }

    /* renamed from: o */
    public static final c0 m8512o(InterfaceC2137a interfaceC2137a) {
        C4367l c4367l = e2.f20374a;
        return new c0(interfaceC2137a, null);
    }

    /* renamed from: p */
    public static final c0 m8513p(InterfaceC2137a interfaceC2137a, d2 d2Var) {
        C4367l c4367l = e2.f20374a;
        return new c0(interfaceC2137a, d2Var);
    }

    /* renamed from: q */
    public static final int m8514q(InterfaceC3962k interfaceC3962k) {
        return ((C3966o) interfaceC3962k).f20462P;
    }

    /* renamed from: r */
    public static final t0 m8515r(InterfaceC7564h interfaceC7564h) {
        t0 t0Var = (t0) interfaceC7564h.o0(s0.f20543b);
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static List m8516s(y1 y1Var, int i10, y1 y1Var2, boolean z6, boolean z10, boolean z11) {
        C6668r c6668r;
        boolean z12;
        C3952a c3952aM8728P;
        int i11;
        int i12;
        int iM8749s = y1Var.m8749s(i10);
        int i13 = i10 + iM8749s;
        int iM8737f = y1Var.m8737f(y1Var.m8747q(i10), y1Var.f20611b);
        int iM8737f2 = y1Var.m8737f(y1Var.m8747q(i13), y1Var.f20611b);
        int i14 = iM8737f2 - iM8737f;
        boolean z13 = i10 >= 0 && (y1Var.f20611b[(y1Var.m8747q(i10) * 5) + 1] & 201326592) != 0;
        y1Var2.m8751u(iM8749s);
        y1Var2.m8752v(i14, y1Var2.f20629t);
        if (y1Var.f20616g < i13) {
            y1Var.m8755z(i13);
        }
        if (y1Var.f20620k < iM8737f2) {
            y1Var.m8713A(iM8737f2, i13);
        }
        int[] iArr = y1Var2.f20611b;
        int i15 = y1Var2.f20629t;
        int i16 = i15 * 5;
        AbstractC6662l.m12717g(i16, y1Var.f20611b, i10 * 5, i13 * 5, iArr);
        Object[] objArr = y1Var2.f20612c;
        int i17 = y1Var2.f20618i;
        System.arraycopy(y1Var.f20612c, iM8737f, objArr, i17, i14);
        int i18 = y1Var2.f20631v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i10;
        int i20 = i15 + iM8749s;
        int iM8737f3 = i17 - y1Var2.m8737f(i15, iArr);
        int i21 = y1Var2.f20622m;
        int i22 = y1Var2.f20621l;
        int length = objArr.length;
        boolean z14 = z13;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int iM8737f4 = y1Var2.m8737f(i24, iArr) + iM8737f3;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = y1Var2.f20620k;
            }
            iArr2[(i24 * 5) + 4] = y1.m8711h(iM8737f4, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        y1Var2.f20622m = i23;
        int iM8706b = x1.m8706b(y1Var.f20613d, i10, y1Var.m8744n());
        int iM8706b2 = x1.m8706b(y1Var.f20613d, i13, y1Var.m8744n());
        if (iM8706b < iM8706b2) {
            ArrayList arrayList = y1Var.f20613d;
            ArrayList arrayList2 = new ArrayList(iM8706b2 - iM8706b);
            for (int i26 = iM8706b; i26 < iM8706b2; i26++) {
                C3952a c3952a = (C3952a) arrayList.get(i26);
                c3952a.f20343a += i19;
                arrayList2.add(c3952a);
            }
            y1Var2.f20613d.addAll(x1.m8706b(y1Var2.f20613d, y1Var2.f20629t, y1Var2.m8744n()), arrayList2);
            arrayList.subList(iM8706b, iM8706b2).clear();
            c6668r = arrayList2;
        } else {
            c6668r = C6668r.f31943a;
        }
        if (!c6668r.isEmpty()) {
            HashMap map = y1Var.f20614e;
            HashMap map2 = y1Var2.f20614e;
            if (map != null && map2 != null) {
                int size = c6668r.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = y1Var2.f20631v;
        HashMap map3 = y1Var2.f20614e;
        if (map3 != null && (c3952aM8728P = y1Var2.m8728P(i18)) != null) {
        }
        int iM8715C = y1Var.m8715C(i10, y1Var.f20611b);
        if (!z11) {
            z12 = false;
        } else if (z6) {
            boolean z15 = iM8715C >= 0;
            if (z15) {
                y1Var.m8726N();
                y1Var.m8732a(iM8715C - y1Var.f20629t);
                y1Var.m8726N();
            }
            y1Var.m8732a(i10 - y1Var.f20629t);
            boolean zM8718F = y1Var.m8718F();
            if (z15) {
                y1Var.m8722J();
                y1Var.m8739i();
                y1Var.m8722J();
                y1Var.m8739i();
            }
            z12 = zM8718F;
        } else {
            boolean zM8719G = y1Var.m8719G(i10, iM8749s);
            y1Var.m8720H(iM8737f, i14, i10 - 1);
            z12 = zM8719G;
        }
        if (z12) {
            AbstractC3967p.m8636c("Unexpectedly removed anchors");
        }
        int i29 = y1Var2.f20624o;
        int i30 = iArr3[i16 + 1];
        y1Var2.f20624o = i29 + ((1073741824 & i30) != 0 ? 1 : i30 & 67108863);
        if (z10) {
            y1Var2.f20629t = i20;
            y1Var2.f20618i = i17 + i14;
        }
        if (z14) {
            y1Var2.m8730R(i18);
        }
        return c6668r;
    }

    /* renamed from: t */
    public static e1 m8517t(Object obj) {
        return new e1(obj, s0.f20547f);
    }

    /* renamed from: u */
    public static final Object m8518u(i1 i1Var, l1 l1Var) {
        AbstractC4154l.m8921d(l1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objMo8554b = i1Var.get(l1Var);
        if (objMo8554b == null) {
            objMo8554b = l1Var.mo8554b();
        }
        return ((k2) objMo8554b).mo8487a(i1Var);
    }

    /* renamed from: v */
    public static final C3964m m8519v(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8604V(206, AbstractC3967p.f20496e);
        if (c3966o.f20461O) {
            y1.m8712x(c3966o.f20454H);
        }
        Object objM8588E = c3966o.m8588E();
        C3963l c3963l = objM8588E instanceof C3963l ? (C3963l) objM8588E : null;
        if (c3963l == null) {
            c3963l = new C3963l(new C3964m(c3966o, c3966o.f20462P, c3966o.f20479p, c3966o.f20448B, c3966o.f20470g.f20574t));
            c3966o.k0(c3963l);
        }
        C3964m c3964m = c3963l.f20418a;
        c3964m.f20427f.setValue(c3966o.m8620m());
        c3966o.m8623p(false);
        return c3964m;
    }

    /* renamed from: w */
    public static final w0 m8520w(Object obj, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (objM8596M == C3961j.f20408a) {
            objM8596M = m8517t(obj);
            c3966o.j0(objM8596M);
        }
        w0 w0Var = (w0) objM8596M;
        w0Var.setValue(obj);
        return w0Var;
    }

    /* renamed from: x */
    public static final void m8521x(InterfaceC2141e interfaceC2141e, Object obj, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), obj)) {
            c3966o.j0(obj);
            c3966o.m8610c(obj, interfaceC2141e);
        }
    }

    /* renamed from: y */
    public static final C2222e m8522y(InterfaceC2137a interfaceC2137a) {
        return new C2222e(new C0649d(interfaceC2137a, null));
    }

    /* renamed from: z */
    public static final int m8523z(C1921w c1921w) {
        int iM5653c;
        int i10 = c1921w.f9077b;
        int iM5653c2 = c1921w.m5653c(0);
        while (c1921w.f9077b != 0 && c1921w.m5653c(0) == iM5653c2) {
            c1921w.m5657g(0, c1921w.m5654d());
            c1921w.m5656f(c1921w.f9077b - 1);
            int i11 = c1921w.f9077b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iM5653c3 = c1921w.m5653c(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iM5653c4 = c1921w.m5653c(i15);
                if (i14 >= i11 || (iM5653c = c1921w.m5653c(i14)) <= iM5653c4) {
                    if (iM5653c4 > iM5653c3) {
                        c1921w.m5657g(i13, iM5653c4);
                        c1921w.m5657g(i15, iM5653c3);
                        i13 = i15;
                    }
                } else if (iM5653c > iM5653c3) {
                    c1921w.m5657g(i13, iM5653c);
                    c1921w.m5657g(i14, iM5653c3);
                    i13 = i14;
                }
            }
        }
        return iM5653c2;
    }
}
