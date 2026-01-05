package pg;

import c3.C0847b;
import d4.AbstractC1592t;
import d4.C1574b;
import d4.C1589q;
import d6.C1616f;
import d6.C1617g;
import iz.C3389v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.pe;
import rw.AbstractC6663m;
import rw.C6668r;
import u4.AbstractC7338a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g7 {
    /* renamed from: a */
    public static final boolean m11656a(ArrayList arrayList) {
        List list;
        long j6;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C6668r.f31943a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iM10832g = pe.m10832g(arrayList);
                int i10 = 0;
                while (i10 < iM10832g) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    C1589q c1589q = (C1589q) obj2;
                    C1589q c1589q2 = (C1589q) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (c1589q2.m5211e().m2280b() >> 32)) - Float.intBitsToFloat((int) (c1589q.m5211e().m2280b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (c1589q2.m5211e().m2280b() & 4294967295L)) - Float.intBitsToFloat((int) (c1589q.m5211e().m2280b() & 4294967295L)));
                    arrayList2.add(new C0847b((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j6 = ((C0847b) AbstractC6663m.m12742F(list)).f5352a;
            } else {
                if (list.isEmpty()) {
                    AbstractC7338a.m13730b("Empty collection can't be reduced.");
                }
                Object objM12742F = AbstractC6663m.m12742F(list);
                int iM10832g2 = pe.m10832g(list);
                if (1 <= iM10832g2) {
                    int i11 = 1;
                    while (true) {
                        objM12742F = new C0847b(C0847b.m2276g(((C0847b) objM12742F).f5352a, ((C0847b) list.get(i11)).f5352a));
                        if (i11 == iM10832g2) {
                            break;
                        }
                        i11++;
                    }
                }
                j6 = ((C0847b) objM12742F).f5352a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j6)) >= Float.intBitsToFloat((int) (j6 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C3389v m11657b(String... strArr) {
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC4154l.m8923f(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr2[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = AbstractC5178p.g0(inputNamesAndValues[i11]).toString();
        }
        int iM11687a = h9.m11687a(0, strArr2.length - 1, 2);
        if (iM11687a >= 0) {
            while (true) {
                String str = strArr2[i10];
                String str2 = strArr2[i10 + 1];
                ba.m11554b(str);
                ba.m11555c(str2, str);
                if (i10 == iM11687a) {
                    break;
                }
                i10 += 2;
            }
        }
        return new C3389v(strArr2);
    }

    /* renamed from: c */
    public static final void m11658c(C1589q c1589q, C1617g c1617g) {
        Object objM5574g = c1589q.m5214i().f7868a.m5574g(AbstractC1592t.f7923g);
        if (objM5574g == null) {
            objM5574g = null;
        }
        if (objM5574g != null) {
            throw new ClassCastException();
        }
        C1589q c1589qM5215j = c1589q.m5215j();
        if (c1589qM5215j == null) {
            return;
        }
        Object objM5574g2 = c1589qM5215j.m5214i().f7868a.m5574g(AbstractC1592t.f7921e);
        if (objM5574g2 == null) {
            objM5574g2 = null;
        }
        if (objM5574g2 != null) {
            Object objM5574g3 = c1589qM5215j.m5214i().f7868a.m5574g(AbstractC1592t.f7922f);
            C1574b c1574b = (C1574b) (objM5574g3 != null ? objM5574g3 : null);
            if (c1574b == null || (c1574b.f7827a >= 0 && c1574b.f7828b >= 0)) {
                if (c1589q.m5214i().f7868a.m5570c(AbstractC1592t.f7910G)) {
                    ArrayList arrayList = new ArrayList();
                    List listM5206h = C1589q.m5206h(4, c1589qM5215j);
                    int size = listM5206h.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        C1589q c1589q2 = (C1589q) listM5206h.get(i11);
                        if (c1589q2.m5214i().f7868a.m5570c(AbstractC1592t.f7910G)) {
                            arrayList.add(c1589q2);
                            if (c1589q2.f7878c.m14610w() < c1589q.f7878c.m14610w()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM11656a = m11656a(arrayList);
                    int i12 = zM11656a ? 0 : i10;
                    int i13 = zM11656a ? i10 : 0;
                    Object objM5574g4 = c1589q.m5214i().f7868a.m5574g(AbstractC1592t.f7910G);
                    if (objM5574g4 == null) {
                        objM5574g4 = Boolean.FALSE;
                    }
                    c1617g.m5294m(C1616f.m5280a(((Boolean) objM5574g4).booleanValue(), i12, 1, i13, 1));
                }
            }
        }
    }
}
