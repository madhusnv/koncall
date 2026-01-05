package g1;

import java.util.List;
import kx.C4265g;
import kx.C4266h;
import og.pe;
import rw.C6669s;
import s4.C6756l;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.l */
/* loaded from: classes.dex */
public final class C2432l implements t3.j0 {

    /* renamed from: a */
    public final C2438r f11032a;

    public C2432l(C2438r c2438r) {
        this.f11032a = c2438r;
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t3.i0) list.get(0)).mo13311b(i10));
            int iM10832g = pe.m10832g(list);
            int i11 = 1;
            if (1 <= iM10832g) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t3.i0) list.get(i11)).mo13311b(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM10832g) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t3.i0) list.get(0)).mo13313y(i10));
            int iM10832g = pe.m10832g(list);
            int i11 = 1;
            if (1 <= iM10832g) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t3.i0) list.get(i11)).mo13313y(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM10832g) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        t3.w0 w0Var;
        t3.w0 w0Var2;
        int i10;
        int i11;
        int size = list.size();
        t3.w0[] w0VarArr = new t3.w0[size];
        int size2 = list.size();
        long j10 = 0;
        int i12 = 0;
        while (true) {
            w0Var = null;
            if (i12 >= size2) {
                break;
            }
            t3.i0 i0Var = (t3.i0) list.get(i12);
            Object objMo13310C = i0Var.mo13310C();
            C2434n c2434n = objMo13310C instanceof C2434n ? (C2434n) objMo13310C : null;
            if (c2434n != null && ((Boolean) c2434n.f11037a.getValue()).booleanValue()) {
                w0VarArr[i12] = i0Var.mo13314z(j6);
                j10 = (r7.f34031b & 4294967295L) | (r7.f34030a << 32);
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            t3.i0 i0Var2 = (t3.i0) list.get(i13);
            if (w0VarArr[i13] == null) {
                w0VarArr[i13] = i0Var2.mo13314z(j6);
            }
        }
        if (l0Var.mo12874R()) {
            i10 = (int) (j10 >> 32);
        } else {
            if (size == 0) {
                w0Var2 = null;
            } else {
                w0Var2 = w0VarArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = w0Var2 != null ? w0Var2.f34030a : 0;
                    C4265g it = new C4266h(1, i14, 1).iterator();
                    while (it.f21651c) {
                        t3.w0 w0Var3 = w0VarArr[it.nextInt()];
                        int i16 = w0Var3 != null ? w0Var3.f34030a : 0;
                        if (i15 < i16) {
                            w0Var2 = w0Var3;
                            i15 = i16;
                        }
                    }
                }
            }
            i10 = w0Var2 != null ? w0Var2.f34030a : 0;
        }
        if (l0Var.mo12874R()) {
            i11 = (int) (j10 & 4294967295L);
        } else {
            if (size != 0) {
                w0Var = w0VarArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = w0Var != null ? w0Var.f34031b : 0;
                    C4265g it2 = new C4266h(1, i17, 1).iterator();
                    while (it2.f21651c) {
                        t3.w0 w0Var4 = w0VarArr[it2.nextInt()];
                        int i19 = w0Var4 != null ? w0Var4.f34031b : 0;
                        if (i18 < i19) {
                            w0Var = w0Var4;
                            i18 = i19;
                        }
                    }
                }
            }
            i11 = w0Var != null ? w0Var.f34031b : 0;
        }
        if (!l0Var.mo12874R()) {
            this.f11032a.f11062c.setValue(new C6756l((i10 << 32) | (i11 & 4294967295L)));
        }
        return l0Var.g0(i10, i11, C6669s.f31944a, new C2431k(w0VarArr, this, i10, i11));
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t3.i0) list.get(0)).a0(i10));
            int iM10832g = pe.m10832g(list);
            int i11 = 1;
            if (1 <= iM10832g) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t3.i0) list.get(i11)).a0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM10832g) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t3.i0) list.get(0)).mo13312x(i10));
            int iM10832g = pe.m10832g(list);
            int i11 = 1;
            if (1 <= iM10832g) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t3.i0) list.get(i11)).mo13312x(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM10832g) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
