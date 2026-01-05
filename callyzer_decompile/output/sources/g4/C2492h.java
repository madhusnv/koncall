package g4;

import c9.C0917l;
import e1.AbstractC1909k;
import e1.C1921w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;
import rw.AbstractC6663m;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.h */
/* loaded from: classes.dex */
public final class C2492h implements CharSequence {

    /* renamed from: a */
    public final List f13619a;

    /* renamed from: b */
    public final String f13620b;

    /* renamed from: c */
    public final ArrayList f13621c;

    /* renamed from: d */
    public final ArrayList f13622d;

    static {
        C0917l c0917l = e0.f13572a;
    }

    public C2492h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f13619a = list;
        this.f13620b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                C2490f c2490f = (C2490f) list.get(i10);
                Object obj = c2490f.f13595a;
                if (obj instanceof g0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c2490f);
                } else if (obj instanceof C2506v) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c2490f);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f13621c = arrayList;
        this.f13622d = arrayList2;
        List listM12760X = arrayList2 != null ? AbstractC6663m.m12760X(arrayList2, new C2491g(0)) : null;
        if (listM12760X == null || listM12760X.isEmpty()) {
            return;
        }
        int i11 = ((C2490f) AbstractC6663m.m12742F(listM12760X)).f13597c;
        C1921w c1921w = AbstractC1909k.f9004a;
        C1921w c1921w2 = new C1921w(1);
        c1921w2.m5651a(i11);
        int size2 = listM12760X.size();
        for (int i12 = 1; i12 < size2; i12++) {
            C2490f c2490f2 = (C2490f) listM12760X.get(i12);
            while (true) {
                if (c1921w2.f9077b != 0) {
                    int iM5654d = c1921w2.m5654d();
                    int i13 = c2490f2.f13596b;
                    int i14 = c2490f2.f13597c;
                    if (i13 >= iM5654d) {
                        c1921w2.m5656f(c1921w2.f9077b - 1);
                    } else if (i14 > iM5654d) {
                        AbstractC4646a.m9525a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + iM5654d);
                    }
                }
            }
            c1921w2.m5651a(c2490f2.f13597c);
        }
    }

    /* renamed from: a */
    public final List m6434a(int i10) {
        List list = this.f13619a;
        if (list == null) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            C2490f c2490f = (C2490f) obj;
            if ((c2490f.f13595a instanceof AbstractC2499o) && AbstractC2494j.m6442b(0, i10, c2490f.f13596b, c2490f.f13597c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List m6435b(int i10, int i11) {
        List list = this.f13619a;
        if (list == null) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C2490f c2490f = (C2490f) list.get(i12);
            Object obj = c2490f.f13595a;
            int i13 = c2490f.f13597c;
            int i14 = c2490f.f13596b;
            if ((obj instanceof i0) && AbstractC2494j.m6442b(i10, i11, i14, i13)) {
                Object obj2 = c2490f.f13595a;
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                arrayList.add(new C2490f(((i0) obj2).f13656a, i14, i13, c2490f.f13598d));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m6436c(int i10, int i11, String str) {
        List list = this.f13619a;
        if (list == null) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C2490f c2490f = (C2490f) list.get(i12);
            Object obj = c2490f.f13595a;
            int i13 = c2490f.f13597c;
            int i14 = c2490f.f13596b;
            String str2 = c2490f.f13598d;
            if ((obj instanceof i0) && str.equals(str2) && AbstractC2494j.m6442b(i10, i11, i14, i13)) {
                Object obj2 = c2490f.f13595a;
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                arrayList.add(new C2490f(((i0) obj2).f13656a, i14, i13, str2));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13620b.charAt(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g4.C2492h subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m4.AbstractC4646a.m9525a(r1)
        L26:
            java.lang.String r1 = r10.f13620b
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r4)
            g4.h r4 = g4.AbstractC2494j.f13657a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            m4.AbstractC4646a.m9525a(r2)
        L59:
            java.util.List r2 = r10.f13619a
            if (r2 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L6b:
            if (r0 >= r4) goto L98
            java.lang.Object r5 = r2.get(r0)
            g4.f r5 = (g4.C2490f) r5
            int r6 = r5.f13596b
            int r7 = r5.f13597c
            boolean r6 = g4.AbstractC2494j.m6442b(r11, r12, r6, r7)
            if (r6 == 0) goto L95
            g4.f r6 = new g4.f
            java.lang.Object r8 = r5.f13595a
            int r9 = r5.f13596b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f13598d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9f
        L9e:
            r3 = 0
        L9f:
            g4.h r11 = new g4.h
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.C2492h.subSequence(int, int):g4.h");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2492h)) {
            return false;
        }
        C2492h c2492h = (C2492h) obj;
        return AbstractC4154l.m8918a(this.f13620b, c2492h.f13620b) && AbstractC4154l.m8918a(this.f13619a, c2492h.f13619a);
    }

    public final int hashCode() {
        int iHashCode = this.f13620b.hashCode() * 31;
        List list = this.f13619a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13620b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13620b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2492h(int i10, String str, ArrayList arrayList) {
        List list = (i10 & 2) != 0 ? C6668r.f31943a : arrayList;
        C2492h c2492h = AbstractC2494j.f13657a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ C2492h(String str) {
        this(str, C6668r.f31943a);
    }

    public C2492h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
