package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p001o.nfa;
import p001o.xf1;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2401g {

    /* renamed from: a */
    public static final Comparator f10026a = new a();

    /* renamed from: androidx.recyclerview.widget.g$a */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f10029a - dVar2.f10029a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public static abstract class b {
        /* renamed from: a */
        public abstract boolean mo9439a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo9440b(int i, int i2);

        /* renamed from: c */
        public abstract Object mo9441c(int i, int i2);

        /* renamed from: d */
        public abstract int mo9442d();

        /* renamed from: e */
        public abstract int mo9443e();
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    public static class c {

        /* renamed from: a */
        public final int[] f10027a;

        /* renamed from: b */
        public final int f10028b;

        public c(int i) {
            int[] iArr = new int[i];
            this.f10027a = iArr;
            this.f10028b = iArr.length / 2;
        }

        /* renamed from: a */
        public int[] m9491a() {
            return this.f10027a;
        }

        /* renamed from: b */
        public int m9492b(int i) {
            return this.f10027a[i + this.f10028b];
        }

        /* renamed from: c */
        public void m9493c(int i, int i2) {
            this.f10027a[i + this.f10028b] = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    public static class d {

        /* renamed from: a */
        public final int f10029a;

        /* renamed from: b */
        public final int f10030b;

        /* renamed from: c */
        public final int f10031c;

        public d(int i, int i2, int i3) {
            this.f10029a = i;
            this.f10030b = i2;
            this.f10031c = i3;
        }

        /* renamed from: a */
        public int m9494a() {
            return this.f10029a + this.f10031c;
        }

        /* renamed from: b */
        public int m9495b() {
            return this.f10030b + this.f10031c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    public static class e {

        /* renamed from: a */
        public final List f10032a;

        /* renamed from: b */
        public final int[] f10033b;

        /* renamed from: c */
        public final int[] f10034c;

        /* renamed from: d */
        public final b f10035d;

        /* renamed from: e */
        public final int f10036e;

        /* renamed from: f */
        public final int f10037f;

        /* renamed from: g */
        public final boolean f10038g;

        public e(b bVar, List list, int[] iArr, int[] iArr2, boolean z) {
            this.f10032a = list;
            this.f10033b = iArr;
            this.f10034c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f10035d = bVar;
            this.f10036e = bVar.mo9443e();
            this.f10037f = bVar.mo9442d();
            this.f10038g = z;
            m9497a();
            m9500d();
        }

        /* renamed from: f */
        public static g m9496f(Collection collection, int i, boolean z) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f10039a == i && gVar.f10041c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z) {
                    gVar2.f10040b--;
                } else {
                    gVar2.f10040b++;
                }
            }
            return gVar;
        }

        /* renamed from: a */
        public final void m9497a() {
            d dVar = this.f10032a.isEmpty() ? null : (d) this.f10032a.get(0);
            if (dVar == null || dVar.f10029a != 0 || dVar.f10030b != 0) {
                this.f10032a.add(0, new d(0, 0, 0));
            }
            this.f10032a.add(new d(this.f10036e, this.f10037f, 0));
        }

        /* renamed from: b */
        public void m9498b(nfa nfaVar) {
            int i;
            xf1 xf1Var = nfaVar instanceof xf1 ? (xf1) nfaVar : new xf1(nfaVar);
            int i2 = this.f10036e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f10036e;
            int i4 = this.f10037f;
            for (int size = this.f10032a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f10032a.get(size);
                int iM9494a = dVar.m9494a();
                int iM9495b = dVar.m9495b();
                while (true) {
                    if (i3 <= iM9494a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f10033b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g gVarM9496f = m9496f(arrayDeque, i6, false);
                        if (gVarM9496f != null) {
                            int i7 = (i2 - gVarM9496f.f10040b) - 1;
                            xf1Var.mo9429d(i3, i7);
                            if ((i5 & 4) != 0) {
                                xf1Var.mo9428c(i7, 1, this.f10035d.mo9441c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        xf1Var.mo9427b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iM9495b) {
                    i4--;
                    int i8 = this.f10034c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g gVarM9496f2 = m9496f(arrayDeque, i9, true);
                        if (gVarM9496f2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            xf1Var.mo9429d((i2 - gVarM9496f2.f10040b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                xf1Var.mo9428c(i3, 1, this.f10035d.mo9441c(i9, i4));
                            }
                        }
                    } else {
                        xf1Var.mo9426a(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f10029a;
                int i11 = dVar.f10030b;
                for (i = 0; i < dVar.f10031c; i++) {
                    if ((this.f10033b[i10] & 15) == 2) {
                        xf1Var.mo9428c(i10, 1, this.f10035d.mo9441c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f10029a;
                i4 = dVar.f10030b;
            }
            xf1Var.m56206e();
        }

        /* renamed from: c */
        public final void m9499c(int i) {
            int size = this.f10032a.size();
            int iM9495b = 0;
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = (d) this.f10032a.get(i2);
                while (iM9495b < dVar.f10030b) {
                    if (this.f10034c[iM9495b] == 0 && this.f10035d.mo9440b(i, iM9495b)) {
                        int i3 = this.f10035d.mo9439a(i, iM9495b) ? 8 : 4;
                        this.f10033b[i] = (iM9495b << 4) | i3;
                        this.f10034c[iM9495b] = (i << 4) | i3;
                        return;
                    }
                    iM9495b++;
                }
                iM9495b = dVar.m9495b();
            }
        }

        /* renamed from: d */
        public final void m9500d() {
            for (d dVar : this.f10032a) {
                for (int i = 0; i < dVar.f10031c; i++) {
                    int i2 = dVar.f10029a + i;
                    int i3 = dVar.f10030b + i;
                    int i4 = this.f10035d.mo9439a(i2, i3) ? 1 : 2;
                    this.f10033b[i2] = (i3 << 4) | i4;
                    this.f10034c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f10038g) {
                m9501e();
            }
        }

        /* renamed from: e */
        public final void m9501e() {
            int iM9494a = 0;
            for (d dVar : this.f10032a) {
                while (iM9494a < dVar.f10029a) {
                    if (this.f10033b[iM9494a] == 0) {
                        m9499c(iM9494a);
                    }
                    iM9494a++;
                }
                iM9494a = dVar.m9494a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    public static abstract class f {
        /* renamed from: a */
        public abstract boolean mo9502a(Object obj, Object obj2);

        /* renamed from: b */
        public abstract boolean mo9503b(Object obj, Object obj2);

        /* renamed from: c */
        public Object m9504c(Object obj, Object obj2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    public static class g {

        /* renamed from: a */
        public int f10039a;

        /* renamed from: b */
        public int f10040b;

        /* renamed from: c */
        public boolean f10041c;

        public g(int i, int i2, boolean z) {
            this.f10039a = i;
            this.f10040b = i2;
            this.f10041c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    public static class h {

        /* renamed from: a */
        public int f10042a;

        /* renamed from: b */
        public int f10043b;

        /* renamed from: c */
        public int f10044c;

        /* renamed from: d */
        public int f10045d;

        public h() {
        }

        /* renamed from: a */
        public int m9505a() {
            return this.f10045d - this.f10044c;
        }

        /* renamed from: b */
        public int m9506b() {
            return this.f10043b - this.f10042a;
        }

        public h(int i, int i2, int i3, int i4) {
            this.f10042a = i;
            this.f10043b = i2;
            this.f10044c = i3;
            this.f10045d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    public static class i {

        /* renamed from: a */
        public int f10046a;

        /* renamed from: b */
        public int f10047b;

        /* renamed from: c */
        public int f10048c;

        /* renamed from: d */
        public int f10049d;

        /* renamed from: e */
        public boolean f10050e;

        /* renamed from: a */
        public int m9507a() {
            return Math.min(this.f10048c - this.f10046a, this.f10049d - this.f10047b);
        }

        /* renamed from: b */
        public boolean m9508b() {
            return this.f10049d - this.f10047b != this.f10048c - this.f10046a;
        }

        /* renamed from: c */
        public boolean m9509c() {
            return this.f10049d - this.f10047b > this.f10048c - this.f10046a;
        }

        /* renamed from: d */
        public d m9510d() {
            if (m9508b()) {
                return this.f10050e ? new d(this.f10046a, this.f10047b, m9507a()) : m9509c() ? new d(this.f10046a, this.f10047b + 1, m9507a()) : new d(this.f10046a + 1, this.f10047b, m9507a());
            }
            int i = this.f10046a;
            return new d(i, this.f10047b, this.f10048c - i);
        }
    }

    /* renamed from: a */
    public static i m9485a(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM9492b;
        int i3;
        int i4;
        boolean z = (hVar.m9506b() - hVar.m9505a()) % 2 == 0;
        int iM9506b = hVar.m9506b() - hVar.m9505a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar2.m9492b(i6 + 1) < cVar2.m9492b(i6 - 1))) {
                iM9492b = cVar2.m9492b(i6 + 1);
                i3 = iM9492b;
            } else {
                iM9492b = cVar2.m9492b(i6 - 1);
                i3 = iM9492b - 1;
            }
            int i7 = hVar.f10045d - ((hVar.f10043b - i3) - i6);
            int i8 = (i2 == 0 || i3 != iM9492b) ? i7 : i7 + 1;
            while (i3 > hVar.f10042a && i7 > hVar.f10044c && bVar.mo9440b(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.m9493c(i6, i3);
            if (z && (i4 = iM9506b - i6) >= i5 && i4 <= i2 && cVar.m9492b(i4) >= i3) {
                i iVar = new i();
                iVar.f10046a = i3;
                iVar.f10047b = i7;
                iVar.f10048c = iM9492b;
                iVar.f10049d = i8;
                iVar.f10050e = true;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static e m9486b(b bVar) {
        return m9487c(bVar, true);
    }

    /* renamed from: c */
    public static e m9487c(b bVar, boolean z) {
        int iMo9443e = bVar.mo9443e();
        int iMo9442d = bVar.mo9442d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iMo9443e, 0, iMo9442d));
        int i2 = ((((iMo9443e + iMo9442d) + 1) / 2) * 2) + 1;
        c cVar = new c(i2);
        c cVar2 = new c(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarM9489e = m9489e(hVar, bVar, cVar, cVar2);
            if (iVarM9489e != null) {
                if (iVarM9489e.m9507a() > 0) {
                    arrayList.add(iVarM9489e.m9510d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f10042a = hVar.f10042a;
                hVar2.f10044c = hVar.f10044c;
                hVar2.f10043b = iVarM9489e.f10046a;
                hVar2.f10045d = iVarM9489e.f10047b;
                arrayList2.add(hVar2);
                hVar.f10043b = hVar.f10043b;
                hVar.f10045d = hVar.f10045d;
                hVar.f10042a = iVarM9489e.f10048c;
                hVar.f10044c = iVarM9489e.f10049d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f10026a);
        return new e(bVar, arrayList, cVar.m9491a(), cVar2.m9491a(), z);
    }

    /* renamed from: d */
    public static i m9488d(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int iM9492b;
        int i3;
        int i4;
        boolean z = Math.abs(hVar.m9506b() - hVar.m9505a()) % 2 == 1;
        int iM9506b = hVar.m9506b() - hVar.m9505a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar.m9492b(i6 + 1) > cVar.m9492b(i6 - 1))) {
                iM9492b = cVar.m9492b(i6 + 1);
                i3 = iM9492b;
            } else {
                iM9492b = cVar.m9492b(i6 - 1);
                i3 = iM9492b + 1;
            }
            int i7 = (hVar.f10044c + (i3 - hVar.f10042a)) - i6;
            int i8 = (i2 == 0 || i3 != iM9492b) ? i7 : i7 - 1;
            while (i3 < hVar.f10043b && i7 < hVar.f10045d && bVar.mo9440b(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.m9493c(i6, i3);
            if (z && (i4 = iM9506b - i6) >= i5 + 1 && i4 <= i2 - 1 && cVar2.m9492b(i4) <= i3) {
                i iVar = new i();
                iVar.f10046a = iM9492b;
                iVar.f10047b = i8;
                iVar.f10048c = i3;
                iVar.f10049d = i7;
                iVar.f10050e = false;
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static i m9489e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.m9506b() >= 1 && hVar.m9505a() >= 1) {
            int iM9506b = ((hVar.m9506b() + hVar.m9505a()) + 1) / 2;
            cVar.m9493c(1, hVar.f10042a);
            cVar2.m9493c(1, hVar.f10043b);
            for (int i2 = 0; i2 < iM9506b; i2++) {
                i iVarM9488d = m9488d(hVar, bVar, cVar, cVar2, i2);
                if (iVarM9488d != null) {
                    return iVarM9488d;
                }
                i iVarM9485a = m9485a(hVar, bVar, cVar, cVar2, i2);
                if (iVarM9485a != null) {
                    return iVarM9485a;
                }
            }
        }
        return null;
    }
}
