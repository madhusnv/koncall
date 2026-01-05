package g1;

import java.util.ArrayList;
import java.util.List;
import og.pe;
import rw.C6669s;
import s4.C6756l;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.s */
/* loaded from: classes.dex */
public final class C2439s implements t3.j0 {

    /* renamed from: a */
    public final C2445y f11067a;

    /* renamed from: b */
    public boolean f11068b;

    public C2439s(C2445y c2445y) {
        this.f11067a = c2445y;
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13311b = ((t3.i0) list.get(0)).mo13311b(i10);
        int iM10832g = pe.m10832g(list);
        int i11 = 1;
        if (1 <= iM10832g) {
            while (true) {
                int iMo13311b2 = ((t3.i0) list.get(i11)).mo13311b(i10);
                if (iMo13311b2 > iMo13311b) {
                    iMo13311b = iMo13311b2;
                }
                if (i11 == iM10832g) {
                    break;
                }
                i11++;
            }
        }
        return iMo13311b;
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13313y = ((t3.i0) list.get(0)).mo13313y(i10);
        int iM10832g = pe.m10832g(list);
        int i11 = 1;
        if (1 <= iM10832g) {
            while (true) {
                int iMo13313y2 = ((t3.i0) list.get(i11)).mo13313y(i10);
                if (iMo13313y2 > iMo13313y) {
                    iMo13313y = iMo13313y2;
                }
                if (i11 == iM10832g) {
                    break;
                }
                i11++;
            }
        }
        return iMo13313y;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            t3.w0 w0VarMo13314z = ((t3.i0) list.get(i10)).mo13314z(j6);
            iMax = Math.max(iMax, w0VarMo13314z.f34030a);
            iMax2 = Math.max(iMax2, w0VarMo13314z.f34031b);
            arrayList.add(w0VarMo13314z);
        }
        boolean zMo12874R = l0Var.mo12874R();
        C2445y c2445y = this.f11067a;
        if (zMo12874R) {
            this.f11068b = true;
            c2445y.f11117a.setValue(new C6756l((4294967295L & iMax2) | (iMax << 32)));
        } else if (!this.f11068b) {
            c2445y.f11117a.setValue(new C6756l((4294967295L & iMax2) | (iMax << 32)));
        }
        return l0Var.g0(iMax, iMax2, C6669s.f31944a, new b2.o0(1, arrayList));
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((t3.i0) list.get(0)).a0(i10);
        int iM10832g = pe.m10832g(list);
        int i11 = 1;
        if (1 <= iM10832g) {
            while (true) {
                int iA02 = ((t3.i0) list.get(i11)).a0(i10);
                if (iA02 > iA0) {
                    iA0 = iA02;
                }
                if (i11 == iM10832g) {
                    break;
                }
                i11++;
            }
        }
        return iA0;
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13312x = ((t3.i0) list.get(0)).mo13312x(i10);
        int iM10832g = pe.m10832g(list);
        int i11 = 1;
        if (1 <= iM10832g) {
            while (true) {
                int iMo13312x2 = ((t3.i0) list.get(i11)).mo13312x(i10);
                if (iMo13312x2 > iMo13312x) {
                    iMo13312x = iMo13312x2;
                }
                if (i11 == iM10832g) {
                    break;
                }
                i11++;
            }
        }
        return iMo13312x;
    }
}
