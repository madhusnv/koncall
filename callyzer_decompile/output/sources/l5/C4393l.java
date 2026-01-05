package l5;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.l */
/* loaded from: classes.dex */
public final class C4393l {

    /* renamed from: a */
    public AbstractC4398q f21975a;

    /* renamed from: b */
    public ArrayList f21976b;

    /* renamed from: a */
    public static long m9170a(C4387f c4387f, long j6) {
        AbstractC4398q abstractC4398q = c4387f.f21963d;
        ArrayList arrayList = c4387f.f21970k;
        if (abstractC4398q instanceof C4390i) {
            return j6;
        }
        int size = arrayList.size();
        long jMin = j6;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4385d interfaceC4385d = (InterfaceC4385d) arrayList.get(i10);
            if (interfaceC4385d instanceof C4387f) {
                C4387f c4387f2 = (C4387f) interfaceC4385d;
                if (c4387f2.f21963d != abstractC4398q) {
                    jMin = Math.min(jMin, m9170a(c4387f2, c4387f2.f21965f + j6));
                }
            }
        }
        C4387f c4387f3 = abstractC4398q.f21989i;
        C4387f c4387f4 = abstractC4398q.f21988h;
        if (c4387f != c4387f3) {
            return jMin;
        }
        long jMo9159j = j6 - abstractC4398q.mo9159j();
        return Math.min(Math.min(jMin, m9170a(c4387f4, jMo9159j)), jMo9159j - c4387f4.f21965f);
    }

    /* renamed from: b */
    public static long m9171b(C4387f c4387f, long j6) {
        AbstractC4398q abstractC4398q = c4387f.f21963d;
        ArrayList arrayList = c4387f.f21970k;
        if (abstractC4398q instanceof C4390i) {
            return j6;
        }
        int size = arrayList.size();
        long jMax = j6;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4385d interfaceC4385d = (InterfaceC4385d) arrayList.get(i10);
            if (interfaceC4385d instanceof C4387f) {
                C4387f c4387f2 = (C4387f) interfaceC4385d;
                if (c4387f2.f21963d != abstractC4398q) {
                    jMax = Math.max(jMax, m9171b(c4387f2, c4387f2.f21965f + j6));
                }
            }
        }
        C4387f c4387f3 = abstractC4398q.f21988h;
        C4387f c4387f4 = abstractC4398q.f21989i;
        if (c4387f != c4387f3) {
            return jMax;
        }
        long jMo9159j = abstractC4398q.mo9159j() + j6;
        return Math.max(Math.max(jMax, m9171b(c4387f4, jMo9159j)), jMo9159j - c4387f4.f21965f);
    }
}
