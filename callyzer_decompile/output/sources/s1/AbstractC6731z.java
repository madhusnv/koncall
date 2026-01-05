package s1;

import a3.C0043b;
import androidx.compose.foundation.lazy.layout.C0249c;
import au.C0447k;
import b2.C0554l;
import c9.C0917l;
import cj.C0975a;
import cp.C1476g;
import e1.AbstractC1909k;
import e1.C1921w;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.C2452f;
import g2.v3;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import k2.e1;
import k2.i2;
import k2.n1;
import kx.C4266h;
import m2.C4640e;
import mm.AbstractC4801l;
import n1.AbstractC4941a;
import og.hg;
import og.ig;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pg.w9;
import r1.C6431p;
import rw.AbstractC6663m;
import rw.AbstractC6666p;
import rw.C6668r;
import s2.AbstractC6740i;
import s2.C6734c;
import t2.AbstractC7011j;
import t2.AbstractC7013l;
import t2.C7006e;
import t2.InterfaceC7003b;
import t2.InterfaceC7009h;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.z */
/* loaded from: classes.dex */
public abstract class AbstractC6731z {

    /* renamed from: a */
    public static final C0975a f32170a = new C0975a(7);

    /* renamed from: a */
    public static final void m12876a(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, h0 h0Var, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2002163445);
        int i11 = (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | i10 | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | (c3966o.m8614g(h0Var) ? 256 : 128) | (c3966o.m8616i(interfaceC2141e) ? NewHope.SENDB_BYTES : 1024);
        if (c3966o.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            m12878c(AbstractC6740i.m12902d(-1488997347, new C0249c(h0Var, interfaceC7879r, interfaceC2141e, C3953b.m8520w(interfaceC2137a, c3966o)), c3966o), c3966o, 6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0447k(interfaceC2137a, interfaceC7879r, h0Var, interfaceC2141e, i10, 11);
        }
    }

    /* renamed from: b */
    public static final void m12877b(Object obj, int i10, e0 e0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8616i(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8612e(i10) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o.m8616i(e0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zM8614g = c3966o.m8614g(obj) | c3966o.m8614g(e0Var);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                objM8596M = new d0(obj, e0Var);
                c3966o.j0(objM8596M);
            }
            d0 d0Var = (d0) objM8596M;
            d0Var.f32058c = i10;
            e1 e1Var = d0Var.f32062g;
            C3977z c3977z = t3.u0.f34027a;
            d0 d0Var2 = (d0) c3966o.m8618k(c3977z);
            AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
            InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
            AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
            try {
                if (d0Var2 != ((d0) e1Var.getValue())) {
                    e1Var.setValue(d0Var2);
                    if (d0Var.f32059d > 0) {
                        d0 d0Var3 = d0Var.f32060e;
                        if (d0Var3 != null) {
                            d0Var3.m12846b();
                        }
                        if (d0Var2 != null) {
                            d0Var2.m12845a();
                        } else {
                            d0Var2 = null;
                        }
                        d0Var.f32060e = d0Var2;
                    }
                }
                AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                boolean zM8614g2 = c3966o.m8614g(d0Var);
                Object objM8596M2 = c3966o.m8596M();
                if (zM8614g2 || objM8596M2 == s0Var) {
                    objM8596M2 = new C6725t(1, d0Var);
                    c3966o.j0(objM8596M2);
                }
                C3953b.m8500c(d0Var, (InterfaceC2139c) objM8596M2, c3966o);
                C3953b.m8498a(c3977z.mo8541a(d0Var), c6734c, c3966o, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                throw th2;
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new o1.i0(obj, i10, e0Var, c6734c, i11);
        }
    }

    /* renamed from: c */
    public static final void m12878c(C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(674185128);
        if (c3966o.m8598P(i10 & 1, (i10 & 3) != 2)) {
            i2 i2Var = AbstractC7011j.f33948a;
            InterfaceC7009h interfaceC7009h = (InterfaceC7009h) c3966o.m8618k(i2Var);
            C7006e c7006eM10702a = ig.m10702a(c3966o);
            Object[] objArr = {interfaceC7009h};
            C6431p c6431p = new C6431p(4, interfaceC7009h, c7006eM10702a);
            C0917l c0917l = AbstractC7013l.f33949a;
            C0917l c0917l2 = new C0917l(16, s0.f32132a, c6431p);
            boolean zM8616i = c3966o.m8616i(interfaceC7009h) | c3966o.m8616i(c7006eM10702a);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C0043b(18, interfaceC7009h, c7006eM10702a);
                c3966o.j0(objM8596M);
            }
            t0 t0Var = (t0) hg.m10691b(objArr, c0917l2, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
            C3953b.m8498a(i2Var.mo8541a(t0Var), AbstractC6740i.m12902d(1863926504, new C1476g(22, c6734c, t0Var), c3966o), c3966o, 56);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2452f(c6734c, i10, 9);
        }
    }

    /* renamed from: d */
    public static final void m12879d(InterfaceC6728w interfaceC6728w, Object obj, int i10, Object obj2, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC6728w) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8614g(obj) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o.m8612e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8614g(obj2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            ((InterfaceC7003b) obj).mo12855a(obj2, AbstractC6740i.m12902d(980966366, new v3(i10, obj2, interfaceC6728w), c3966o), c3966o, 48);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new o1.i0(interfaceC6728w, obj, i10, obj2, i11);
        }
    }

    /* renamed from: e */
    public static final int m12880e(int i10, C4640e c4640e) {
        int i11 = c4640e.f22886c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int iM9727a = AbstractC4801l.m9727a(i11, i12, 2, i12);
            Object[] objArr = c4640e.f22884a;
            int i13 = ((C6713h) objArr[iM9727a]).f32068a;
            if (i13 != i10) {
                if (i13 < i10) {
                    i12 = iM9727a + 1;
                    if (i10 < ((C6713h) objArr[i12]).f32068a) {
                    }
                } else {
                    i11 = iM9727a - 1;
                }
            }
            return iM9727a;
        }
        return i12;
    }

    /* renamed from: f */
    public static final List m12881f(b0 b0Var, ArrayList arrayList, C1921w c1921w, int i10, int i11, int i12, InterfaceC2139c interfaceC2139c) {
        C1921w c1921w2;
        long j6;
        long j10;
        int i13;
        Object obj;
        int i14;
        int i15;
        if (b0Var == null || arrayList.isEmpty() || c1921w.f9077b == 0) {
            return C6668r.f31943a;
        }
        int index = ((InterfaceC6730y) AbstractC6663m.m12742F(arrayList)).getIndex();
        int i16 = -1;
        if (((InterfaceC6730y) AbstractC6663m.m12750N(arrayList)).getIndex() - index < 0 || (i15 = c1921w.f9077b) == 0) {
            c1921w2 = AbstractC1909k.f9004a;
        } else {
            C4266h c4266hM11919j = w9.m11919j(0, i15);
            int i17 = c4266hM11919j.f21646a;
            int i18 = c4266hM11919j.f21647b;
            int iM5653c = -1;
            if (i17 <= i18) {
                while (c1921w.m5653c(i17) <= index) {
                    iM5653c = c1921w.m5653c(i17);
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
            if (iM5653c == -1) {
                c1921w2 = AbstractC1909k.f9004a;
            } else {
                C1921w c1921w3 = AbstractC1909k.f9004a;
                c1921w2 = new C1921w(1);
                c1921w2.m5651a(iM5653c);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            Object obj2 = arrayList.get(i19);
            int index2 = ((InterfaceC6730y) obj2).getIndex();
            int[] iArr = c1921w.f9076a;
            int i20 = c1921w.f9077b;
            int i21 = 0;
            while (true) {
                if (i21 >= i20) {
                    break;
                }
                if (iArr[i21] == index2) {
                    arrayList3.add(obj2);
                    break;
                }
                i21++;
            }
        }
        int[] iArr2 = c1921w2.f9076a;
        int i22 = c1921w2.f9077b;
        int i23 = 0;
        while (i23 < i22) {
            int i24 = iArr2[i23];
            int size2 = arrayList.size();
            int i25 = 0;
            int i26 = 0;
            while (true) {
                if (i26 >= size2) {
                    i25 = i16;
                    break;
                }
                Object obj3 = arrayList.get(i26);
                i26++;
                if (((InterfaceC6730y) obj3).getIndex() == i24) {
                    break;
                }
                i25++;
            }
            InterfaceC6730y interfaceC6730y = i25 == i16 ? (InterfaceC6730y) interfaceC2139c.invoke(Integer.valueOf(i24)) : (InterfaceC6730y) arrayList.remove(i25);
            int iMo12114b = interfaceC6730y.mo12114b();
            if (i25 == i16) {
                i13 = Integer.MIN_VALUE;
                j6 = 4294967295L;
            } else {
                long jMo12121i = interfaceC6730y.mo12121i(0);
                if (interfaceC6730y.mo12118f()) {
                    j6 = 4294967295L;
                    j10 = jMo12121i & 4294967295L;
                } else {
                    j6 = 4294967295L;
                    j10 = jMo12121i >> 32;
                }
                i13 = (int) j10;
            }
            int size3 = arrayList3.size();
            int i27 = 0;
            while (true) {
                if (i27 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i27);
                if (((InterfaceC6730y) obj).getIndex() != i24) {
                    break;
                }
                i27++;
            }
            InterfaceC6730y interfaceC6730y2 = (InterfaceC6730y) obj;
            if (interfaceC6730y2 != null) {
                long jMo12121i2 = interfaceC6730y2.mo12121i(0);
                i14 = (int) (interfaceC6730y2.mo12118f() ? jMo12121i2 & j6 : jMo12121i2 >> 32);
            } else {
                i14 = Integer.MIN_VALUE;
            }
            int iMax = i13 == Integer.MIN_VALUE ? -i10 : Math.max(-i10, i13);
            if (i14 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i14 - iMo12114b);
            }
            interfaceC6730y.mo12119g();
            interfaceC6730y.mo12120h(iMax, i11, i12);
            arrayList2.add(interfaceC6730y);
            i23++;
            i16 = -1;
        }
        return arrayList2;
    }

    /* renamed from: g */
    public static final List m12882g(InterfaceC6728w interfaceC6728w, e0 e0Var, l4.d0 d0Var) {
        C4266h c4266h;
        C4640e c4640e = (C4640e) d0Var.f21881b;
        if (!(c4640e.f22886c != 0) && e0Var.f32063a.isEmpty()) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList();
        if (((C4640e) d0Var.f21881b).f22886c != 0) {
            int i10 = c4640e.f22886c;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = c4640e.f22884a;
            int i11 = ((C6715j) objArr[0]).f32078a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((C6715j) objArr[i12]).f32078a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                AbstractC4941a.m9884a("negative minIndex");
            }
            int i14 = c4640e.f22886c;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = c4640e.f22884a;
            int i15 = ((C6715j) objArr2[0]).f32079b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = ((C6715j) objArr2[i16]).f32079b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            c4266h = new C4266h(i11, Math.min(i15, interfaceC6728w.mo12101a() - 1), 1);
        } else {
            c4266h = C4266h.f21653d;
        }
        int size = e0Var.f32063a.size();
        for (int i18 = 0; i18 < size; i18++) {
            d0 d0Var2 = (d0) e0Var.get(i18);
            int iM12884i = m12884i(d0Var2.f32058c, d0Var2.f32056a, interfaceC6728w);
            int i19 = c4266h.f21646a;
            if ((iM12884i > c4266h.f21647b || i19 > iM12884i) && iM12884i >= 0 && iM12884i < interfaceC6728w.mo12101a()) {
                arrayList.add(Integer.valueOf(iM12884i));
            }
        }
        int i20 = c4266h.f21646a;
        int i21 = c4266h.f21647b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static k2.w0 m12883h() {
        return new e1(qw.a0.f30746a, k2.s0.f20544c);
    }

    /* renamed from: i */
    public static final int m12884i(int i10, Object obj, InterfaceC6728w interfaceC6728w) {
        int iMo12104d;
        return (obj == null || interfaceC6728w.mo12101a() == 0 || (i10 < interfaceC6728w.mo12101a() && obj.equals(interfaceC6728w.mo12102b(i10))) || (iMo12104d = interfaceC6728w.mo12104d(obj)) == -1) ? i10 : iMo12104d;
    }

    /* renamed from: m */
    public static final List m12885m(int i10, int i11, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return C6668r.f31943a;
        }
        ArrayList arrayListD0 = AbstractC6663m.d0(list);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC6730y interfaceC6730y = (InterfaceC6730y) arrayList.get(i12);
            int index = interfaceC6730y.getIndex();
            if (i10 <= index && index <= i11) {
                arrayListD0.add(interfaceC6730y);
            }
        }
        AbstractC6666p.m12771u(arrayListD0, f32170a);
        return arrayListD0;
    }

    /* renamed from: j */
    public Object m12886j(int i10) {
        C6713h c6713hM1636e = mo12097k().m1636e(i10);
        return c6713hM1636e.f32070c.getType().invoke(Integer.valueOf(i10 - c6713hM1636e.f32068a));
    }

    /* renamed from: k */
    public abstract C0554l mo12097k();

    /* renamed from: l */
    public Object m12887l(int i10) {
        Object objInvoke;
        C6713h c6713hM1636e = mo12097k().m1636e(i10);
        int i11 = i10 - c6713hM1636e.f32068a;
        InterfaceC2139c key = c6713hM1636e.f32070c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new C6711f(i10) : objInvoke;
    }
}
