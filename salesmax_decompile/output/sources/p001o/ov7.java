package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import p001o.rf1;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class ov7 {
    /* renamed from: a */
    public static q8j m42714a(zt3 zt3Var, int i, ArrayList arrayList, q8j q8jVar) {
        int iX1;
        int i2 = i == 0 ? zt3Var.S0 : zt3Var.T0;
        if (i2 != -1 && (q8jVar == null || i2 != q8jVar.m45022c())) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                q8j q8jVar2 = (q8j) arrayList.get(i3);
                if (q8jVar2.m45022c() == i2) {
                    if (q8jVar != null) {
                        q8jVar.m45026g(i, q8jVar2);
                        arrayList.remove(q8jVar);
                    }
                    q8jVar = q8jVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return q8jVar;
        }
        if (q8jVar == null) {
            if ((zt3Var instanceof dy7) && (iX1 = ((dy7) zt3Var).x1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    q8j q8jVar3 = (q8j) arrayList.get(i4);
                    if (q8jVar3.m45022c() == iX1) {
                        q8jVar = q8jVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (q8jVar == null) {
                q8jVar = new q8j(i);
            }
            arrayList.add(q8jVar);
        }
        if (q8jVar.m45020a(zt3Var)) {
            if (zt3Var instanceof rv7) {
                rv7 rv7Var = (rv7) zt3Var;
                rv7Var.w1().m50470c(rv7Var.x1() == 0 ? 1 : 0, arrayList, q8jVar);
            }
            if (i == 0) {
                zt3Var.S0 = q8jVar.m45022c();
                zt3Var.f57631Q.m50470c(i, arrayList, q8jVar);
                zt3Var.f57633S.m50470c(i, arrayList, q8jVar);
            } else {
                zt3Var.T0 = q8jVar.m45022c();
                zt3Var.f57632R.m50470c(i, arrayList, q8jVar);
                zt3Var.f57635U.m50470c(i, arrayList, q8jVar);
                zt3Var.f57634T.m50470c(i, arrayList, q8jVar);
            }
            zt3Var.f57638X.m50470c(i, arrayList, q8jVar);
        }
        return q8jVar;
    }

    /* renamed from: b */
    public static q8j m42715b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q8j q8jVar = (q8j) arrayList.get(i2);
            if (i == q8jVar.m45022c()) {
                return q8jVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x034b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m42716c(au3 au3Var, rf1.InterfaceC16599b interfaceC16599b) {
        q8j q8jVar;
        boolean z;
        boolean z2;
        q8j q8jVar2;
        ArrayList arrayListW1 = au3Var.w1();
        int size = arrayListW1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zt3 zt3Var = (zt3) arrayListW1.get(i2);
            if (!m42717d(au3Var.m59825C(), au3Var.m59843V(), zt3Var.m59825C(), zt3Var.m59843V()) || (zt3Var instanceof u37)) {
                return false;
            }
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            zt3 zt3Var2 = (zt3) arrayListW1.get(i3);
            if (!m42717d(au3Var.m59825C(), au3Var.m59843V(), zt3Var2.m59825C(), zt3Var2.m59843V())) {
                au3.Y1(i, zt3Var2, interfaceC16599b, au3Var.z1, rf1.C16598a.f43467k);
            }
            boolean z3 = zt3Var2 instanceof rv7;
            if (z3) {
                rv7 rv7Var = (rv7) zt3Var2;
                if (rv7Var.x1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(rv7Var);
                }
                if (rv7Var.x1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rv7Var);
                }
            }
            if (zt3Var2 instanceof dy7) {
                if (zt3Var2 instanceof ya1) {
                    ya1 ya1Var = (ya1) zt3Var2;
                    if (ya1Var.C1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(ya1Var);
                    }
                    if (ya1Var.C1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(ya1Var);
                    }
                } else {
                    dy7 dy7Var = (dy7) zt3Var2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(dy7Var);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(dy7Var);
                }
            }
            if (zt3Var2.f57631Q.f47687f == null && zt3Var2.f57633S.f47687f == null && !z3 && !(zt3Var2 instanceof ya1)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(zt3Var2);
            }
            if (zt3Var2.f57632R.f47687f == null && zt3Var2.f57634T.f47687f == null && zt3Var2.f57635U.f47687f == null && !z3 && !(zt3Var2 instanceof ya1)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(zt3Var2);
            }
            i3++;
            i = 0;
        }
        ArrayList arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m42714a((rv7) it.next(), 0, arrayList7, null);
            }
        }
        q8j q8jVar3 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                dy7 dy7Var2 = (dy7) it2.next();
                q8j q8jVarM42714a = m42714a(dy7Var2, i4, arrayList7, q8jVar3);
                dy7Var2.w1(arrayList7, i4, q8jVarM42714a);
                q8jVarM42714a.m45021b(arrayList7);
                q8jVar3 = null;
                i4 = 0;
            }
        }
        tt3 tt3VarMo47185q = au3Var.mo47185q(tt3.EnumC17197a.LEFT);
        if (tt3VarMo47185q.m50471d() != null) {
            Iterator it3 = tt3VarMo47185q.m50471d().iterator();
            while (it3.hasNext()) {
                m42714a(((tt3) it3.next()).f47685d, 0, arrayList7, null);
            }
        }
        tt3 tt3VarMo47185q2 = au3Var.mo47185q(tt3.EnumC17197a.RIGHT);
        if (tt3VarMo47185q2.m50471d() != null) {
            Iterator it4 = tt3VarMo47185q2.m50471d().iterator();
            while (it4.hasNext()) {
                m42714a(((tt3) it4.next()).f47685d, 0, arrayList7, null);
            }
        }
        tt3 tt3VarMo47185q3 = au3Var.mo47185q(tt3.EnumC17197a.CENTER);
        if (tt3VarMo47185q3.m50471d() != null) {
            Iterator it5 = tt3VarMo47185q3.m50471d().iterator();
            while (it5.hasNext()) {
                m42714a(((tt3) it5.next()).f47685d, 0, arrayList7, null);
            }
        }
        q8j q8jVar4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                m42714a((zt3) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                m42714a((rv7) it7.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                dy7 dy7Var3 = (dy7) it8.next();
                q8j q8jVarM42714a2 = m42714a(dy7Var3, i5, arrayList7, q8jVar4);
                dy7Var3.w1(arrayList7, i5, q8jVarM42714a2);
                q8jVarM42714a2.m45021b(arrayList7);
                q8jVar4 = null;
                i5 = 1;
            }
        }
        tt3 tt3VarMo47185q4 = au3Var.mo47185q(tt3.EnumC17197a.TOP);
        if (tt3VarMo47185q4.m50471d() != null) {
            Iterator it9 = tt3VarMo47185q4.m50471d().iterator();
            while (it9.hasNext()) {
                m42714a(((tt3) it9.next()).f47685d, 1, arrayList7, null);
            }
        }
        tt3 tt3VarMo47185q5 = au3Var.mo47185q(tt3.EnumC17197a.BASELINE);
        if (tt3VarMo47185q5.m50471d() != null) {
            Iterator it10 = tt3VarMo47185q5.m50471d().iterator();
            while (it10.hasNext()) {
                m42714a(((tt3) it10.next()).f47685d, 1, arrayList7, null);
            }
        }
        tt3 tt3VarMo47185q6 = au3Var.mo47185q(tt3.EnumC17197a.BOTTOM);
        if (tt3VarMo47185q6.m50471d() != null) {
            Iterator it11 = tt3VarMo47185q6.m50471d().iterator();
            while (it11.hasNext()) {
                m42714a(((tt3) it11.next()).f47685d, 1, arrayList7, null);
            }
        }
        tt3 tt3VarMo47185q7 = au3Var.mo47185q(tt3.EnumC17197a.CENTER);
        if (tt3VarMo47185q7.m50471d() != null) {
            Iterator it12 = tt3VarMo47185q7.m50471d().iterator();
            while (it12.hasNext()) {
                m42714a(((tt3) it12.next()).f47685d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                m42714a((zt3) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            zt3 zt3Var3 = (zt3) arrayListW1.get(i6);
            if (zt3Var3.u0()) {
                q8j q8jVarM42715b = m42715b(arrayList7, zt3Var3.S0);
                q8j q8jVarM42715b2 = m42715b(arrayList7, zt3Var3.T0);
                if (q8jVarM42715b != null && q8jVarM42715b2 != null) {
                    q8jVarM42715b.m45026g(0, q8jVarM42715b2);
                    q8jVarM42715b2.m45028i(2);
                    arrayList7.remove(q8jVarM42715b);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (au3Var.m59825C() == zt3.EnumC18702b.WRAP_CONTENT) {
            Iterator it14 = arrayList7.iterator();
            q8jVar = null;
            int i7 = 0;
            while (it14.hasNext()) {
                q8j q8jVar5 = (q8j) it14.next();
                if (q8jVar5.m45023d() != 1) {
                    q8jVar5.m45027h(false);
                    int iM45025f = q8jVar5.m45025f(au3Var.Q1(), 0);
                    if (iM45025f > i7) {
                        q8jVar = q8jVar5;
                        i7 = iM45025f;
                    }
                }
            }
            if (q8jVar != null) {
                au3Var.U0(zt3.EnumC18702b.FIXED);
                au3Var.p1(i7);
                q8jVar.m45027h(true);
            } else {
                q8jVar = null;
            }
        }
        if (au3Var.m59843V() == zt3.EnumC18702b.WRAP_CONTENT) {
            Iterator it15 = arrayList7.iterator();
            q8j q8jVar6 = null;
            int i8 = 0;
            while (it15.hasNext()) {
                q8j q8jVar7 = (q8j) it15.next();
                if (q8jVar7.m45023d() != 0) {
                    q8jVar7.m45027h(false);
                    int iM45025f2 = q8jVar7.m45025f(au3Var.Q1(), 1);
                    if (iM45025f2 > i8) {
                        q8jVar6 = q8jVar7;
                        i8 = iM45025f2;
                    }
                }
            }
            z = false;
            z2 = true;
            if (q8jVar6 != null) {
                au3Var.l1(zt3.EnumC18702b.FIXED);
                au3Var.Q0(i8);
                q8jVar6.m45027h(true);
                q8jVar2 = q8jVar6;
            }
            return (q8jVar == null || q8jVar2 != null) ? z2 : z;
        }
        z = false;
        z2 = true;
        q8jVar2 = null;
        if (q8jVar == null) {
        }
    }

    /* renamed from: d */
    public static boolean m42717d(zt3.EnumC18702b enumC18702b, zt3.EnumC18702b enumC18702b2, zt3.EnumC18702b enumC18702b3, zt3.EnumC18702b enumC18702b4) {
        zt3.EnumC18702b enumC18702b5;
        zt3.EnumC18702b enumC18702b6;
        zt3.EnumC18702b enumC18702b7 = zt3.EnumC18702b.FIXED;
        return (enumC18702b3 == enumC18702b7 || enumC18702b3 == (enumC18702b6 = zt3.EnumC18702b.WRAP_CONTENT) || (enumC18702b3 == zt3.EnumC18702b.MATCH_PARENT && enumC18702b != enumC18702b6)) || (enumC18702b4 == enumC18702b7 || enumC18702b4 == (enumC18702b5 = zt3.EnumC18702b.WRAP_CONTENT) || (enumC18702b4 == zt3.EnumC18702b.MATCH_PARENT && enumC18702b2 != enumC18702b5));
    }
}
