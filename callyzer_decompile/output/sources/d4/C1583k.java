package d4;

import com.sun.mail.util.AbstractC1452a;
import e1.C1906h;
import e1.C1919u;
import e1.j0;
import e1.r0;
import fx.InterfaceC2395a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.k */
/* loaded from: classes.dex */
public final class C1583k implements InterfaceC1596x, Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final j0 f7868a;

    /* renamed from: b */
    public C1919u f7869b;

    /* renamed from: c */
    public boolean f7870c;

    /* renamed from: d */
    public boolean f7871d;

    public C1583k() {
        long[] jArr = r0.f9045a;
        this.f7868a = new j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d4.C1583k m5199b() {
        /*
            r18 = this;
            r0 = r18
            d4.k r1 = new d4.k
            r1.<init>()
            boolean r2 = r0.f7870c
            r1.f7870c = r2
            boolean r2 = r0.f7871d
            r1.f7871d = r2
            e1.j0 r2 = r1.f7868a
            r2.getClass()
            java.lang.String r3 = "from"
            e1.j0 r4 = r0.f7868a
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r3)
            java.lang.Object[] r3 = r4.f8999b
            java.lang.Object[] r5 = r4.f9000c
            long[] r4 = r4.f8998a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m5579l(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.C1583k.m5199b():d4.k");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1583k)) {
            return false;
        }
        C1583k c1583k = (C1583k) obj;
        return AbstractC4154l.m8918a(this.f7868a, c1583k.f7868a) && this.f7870c == c1583k.f7870c && this.f7871d == c1583k.f7871d;
    }

    /* renamed from: h */
    public final Object m5200h(C1595w c1595w) {
        Object objM5574g = this.f7868a.m5574g(c1595w);
        if (objM5574g != null) {
            return objM5574g;
        }
        throw new IllegalStateException("Key not present: " + c1595w + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7871d) + AbstractC1452a.m4558e(this.f7868a.hashCode() * 31, 31, this.f7870c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1919u c1919u = this.f7869b;
        if (c1919u == null) {
            j0 j0Var = this.f7868a;
            j0Var.getClass();
            C1919u c1919u2 = new C1919u(j0Var);
            this.f7869b = c1919u2;
            c1919u = c1919u2;
        }
        return ((C1906h) c1919u.entrySet()).iterator();
    }

    /* renamed from: j */
    public final void m5201j(C1583k c1583k) {
        j0 j0Var = c1583k.f7868a;
        Object[] objArr = j0Var.f8999b;
        Object[] objArr2 = j0Var.f9000c;
        long[] jArr = j0Var.f8998a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        C1595w c1595w = (C1595w) obj;
                        j0 j0Var2 = this.f7868a;
                        Object objM5574g = j0Var2.m5574g(c1595w);
                        AbstractC4154l.m8921d(c1595w, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = c1595w.f7946b.invoke(objM5574g, obj2);
                        if (objInvoke != null) {
                            j0Var2.m5579l(c1595w, objInvoke);
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: q */
    public final void m5202q(C1595w c1595w, Object obj) {
        boolean z6 = obj instanceof C1573a;
        j0 j0Var = this.f7868a;
        if (!z6 || !j0Var.m5570c(c1595w)) {
            j0Var.m5579l(c1595w, obj);
            return;
        }
        Object objM5574g = j0Var.m5574g(c1595w);
        AbstractC4154l.m8921d(objM5574g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C1573a c1573a = (C1573a) objM5574g;
        C1573a c1573a2 = (C1573a) obj;
        String str = c1573a2.f7825a;
        if (str == null) {
            str = c1573a.f7825a;
        }
        InterfaceC6355e interfaceC6355e = c1573a2.f7826b;
        if (interfaceC6355e == null) {
            interfaceC6355e = c1573a.f7826b;
        }
        j0Var.m5579l(c1595w, new C1573a(str, interfaceC6355e));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f7870c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f7871d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            e1.j0 r4 = r0.f7868a
            java.lang.Object[] r5 = r4.f8999b
            java.lang.Object[] r6 = r4.f9000c
            long[] r4 = r4.f8998a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            d4.w r8 = (d4.C1595w) r8
            r1.append(r2)
            java.lang.String r2 = r8.f7945a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = w3.m0.m14995v(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.C1583k.toString():java.lang.String");
    }
}
