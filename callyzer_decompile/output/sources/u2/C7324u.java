package u2;

import e1.j0;
import e1.k0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.HashMap;
import k2.C3953b;
import k2.C3965n;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import s1.C6725t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.u */
/* loaded from: classes.dex */
public final class C7324u {

    /* renamed from: a */
    public final InterfaceC2139c f34913a;

    /* renamed from: b */
    public Object f34914b;

    /* renamed from: c */
    public e1.d0 f34915c;

    /* renamed from: j */
    public int f34922j;

    /* renamed from: d */
    public int f34916d = -1;

    /* renamed from: e */
    public final j0 f34917e = fb.b0.m5941b();

    /* renamed from: f */
    public final j0 f34918f = new j0();

    /* renamed from: g */
    public final k0 f34919g = new k0();

    /* renamed from: h */
    public final C4640e f34920h = new C4640e(new k2.c0[16]);

    /* renamed from: i */
    public final C3965n f34921i = new C3965n(1, this);

    /* renamed from: k */
    public final j0 f34923k = fb.b0.m5941b();

    /* renamed from: l */
    public final HashMap f34924l = new HashMap();

    public C7324u(InterfaceC2139c interfaceC2139c) {
        this.f34913a = interfaceC2139c;
    }

    /* renamed from: a */
    public final void m13713a(Object obj, C6725t c6725t, InterfaceC2137a interfaceC2137a) {
        boolean z6;
        int i10;
        int i11;
        Object obj2 = this.f34914b;
        e1.d0 d0Var = this.f34915c;
        int i12 = this.f34916d;
        this.f34914b = obj;
        this.f34915c = (e1.d0) this.f34918f.m5574g(obj);
        if (this.f34916d == -1) {
            this.f34916d = Long.hashCode(AbstractC7316m.m13686k().mo13652g());
        }
        C3965n c3965n = this.f34921i;
        C4640e c4640eM8511n = C3953b.m8511n();
        boolean z10 = true;
        try {
            c4640eM8511n.m9506b(c3965n);
            AbstractC7321r.m13708e(interfaceC2137a, c6725t);
            c4640eM8511n.m9515m(c4640eM8511n.f22886c - 1);
            Object obj3 = this.f34914b;
            AbstractC4154l.m8920c(obj3);
            int i13 = this.f34916d;
            e1.d0 d0Var2 = this.f34915c;
            if (d0Var2 != null) {
                long[] jArr = d0Var2.f8947a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j6 = jArr[i14];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            z6 = z10;
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j6 & 255) < 128) {
                                    int i18 = (i14 << 3) + i17;
                                    i11 = i15;
                                    Object obj4 = d0Var2.f8948b[i18];
                                    i10 = i17;
                                    boolean z11 = d0Var2.f8949c[i18] != i13 ? z6 : false;
                                    if (z11) {
                                        m13716d(obj3, obj4);
                                    }
                                    if (z11) {
                                        d0Var2.m5538g(i18);
                                    }
                                } else {
                                    i10 = i17;
                                    i11 = i15;
                                }
                                j6 >>= i11;
                                i17 = i10 + 1;
                                i15 = i11;
                            }
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            z6 = z10;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        z10 = z6;
                    }
                }
            }
            this.f34914b = obj2;
            this.f34915c = d0Var;
            this.f34916d = i12;
        } catch (Throwable th2) {
            c4640eM8511n.m9515m(c4640eM8511n.f22886c - 1);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027e A[PHI: r13
      0x027e: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x0256, B:117:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a7 A[PHI: r13
      0x04a7: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x047f, B:218:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0506 A[EDGE_INSN: B:241:0x0506->B:321:0x050f BREAK  A[LOOP:18: B:231:0x04d4->B:242:0x0508], PHI: r13
      0x0506: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04de, B:240:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136 A[PHI: r33
      0x0136: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x010a, B:56:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f A[PHI: r13
      0x020f: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e7, B:93:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13714b(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7324u.m13714b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13715c(java.lang.Object r21, int r22, java.lang.Object r23, e1.d0 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f34922j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.m5534c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f8949c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f8948b
            r7[r4] = r1
            int[] r3 = r3.f8949c
            r3[r4] = r2
            boolean r3 = r1 instanceof k2.c0
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            k2.c0 r2 = (k2.c0) r2
            k2.b0 r2 = r2.m8530g()
            java.util.HashMap r3 = r0.f34924l
            java.lang.Object r7 = r2.f20353f
            r3.put(r1, r7)
            e1.d0 r2 = r2.f20352e
            e1.j0 r3 = r0.f34923k
            fb.b0.m5943d(r3, r1)
            java.lang.Object[] r7 = r2.f8948b
            long[] r2 = r2.f8947a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            u2.y r9 = (u2.InterfaceC7328y) r9
            boolean r5 = r9 instanceof u2.AbstractC7329z
            if (r5 == 0) goto L82
            r5 = r9
            u2.z r5 = (u2.AbstractC7329z) r5
            r5.m13725e(r4)
        L82:
            fb.b0.m5940a(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof u2.AbstractC7329z
            if (r2 == 0) goto L9d
            r2 = r1
            u2.z r2 = (u2.AbstractC7329z) r2
            r2.m13725e(r4)
        L9d:
            e1.j0 r2 = r0.f34917e
            r3 = r23
            fb.b0.m5940a(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7324u.m13715c(java.lang.Object, int, java.lang.Object, e1.d0):void");
    }

    /* renamed from: d */
    public final void m13716d(Object obj, Object obj2) {
        j0 j0Var = this.f34917e;
        fb.b0.m5942c(j0Var, obj2, obj);
        if (!(obj2 instanceof k2.c0) || j0Var.m5570c(obj2)) {
            return;
        }
        fb.b0.m5943d(this.f34923k, obj2);
        this.f34924l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13717e() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7324u.m13717e():void");
    }
}
