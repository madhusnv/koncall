package k2;

import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import u2.AbstractC7311h;
import u2.AbstractC7316m;
import u2.InterfaceC7328y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends u2.a0 {

    /* renamed from: h */
    public static final Object f20349h = new Object();

    /* renamed from: c */
    public long f20350c;

    /* renamed from: d */
    public int f20351d;

    /* renamed from: e */
    public e1.d0 f20352e;

    /* renamed from: f */
    public Object f20353f;

    /* renamed from: g */
    public int f20354g;

    public b0(long j6) {
        super(j6);
        e1.d0 d0Var = e1.o0.f9033a;
        AbstractC4154l.m8921d(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f20352e = d0Var;
        this.f20353f = f20349h;
    }

    @Override // u2.a0
    /* renamed from: a */
    public final void mo8494a(u2.a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        b0 b0Var = (b0) a0Var;
        this.f20352e = b0Var.f20352e;
        this.f20353f = b0Var.f20353f;
        this.f20354g = b0Var.f20354g;
    }

    @Override // u2.a0
    /* renamed from: b */
    public final u2.a0 mo8495b(long j6) {
        return new b0(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m8524c(k2.c0 r7, u2.AbstractC7311h r8) {
        /*
            r6 = this;
            java.lang.Object r0 = u2.AbstractC7316m.f34890b
            monitor-enter(r0)
            long r1 = r6.f20350c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.mo13652g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f20351d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.mo13653h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f20353f
            java.lang.Object r5 = k2.b0.f20349h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f20354g
            int r7 = r6.m8525d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.mo13652g()     // Catch: java.lang.Throwable -> L43
            r6.f20350c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.mo13653h()     // Catch: java.lang.Throwable -> L43
            r6.f20351d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b0.m8524c(k2.c0, u2.h):boolean");
    }

    /* renamed from: d */
    public final int m8525d(c0 c0Var, AbstractC7311h abstractC7311h) throws Throwable {
        e1.d0 d0Var;
        int iIdentityHashCode;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        u2.a0 a0VarM8529f;
        synchronized (AbstractC7316m.f34890b) {
            d0Var = this.f20352e;
        }
        int i13 = 7;
        if (d0Var.f8951e == 0) {
            return 7;
        }
        C4640e c4640eM8511n = C3953b.m8511n();
        Object[] objArr = c4640eM8511n.f22884a;
        int i14 = c4640eM8511n.f22886c;
        for (int i15 = 0; i15 < i14; i15++) {
            ((C3965n) objArr[i15]).m8575b();
        }
        try {
            Object[] objArr2 = d0Var.f8948b;
            int[] iArr = d0Var.f8949c;
            long[] jArr3 = d0Var.f8947a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i16 = 0;
                while (true) {
                    long j6 = jArr3[i16];
                    if ((((~j6) << i13) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j6 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                Object obj = objArr2[i20];
                                i11 = i13;
                                int i21 = iArr[i20];
                                i12 = i17;
                                InterfaceC7328y interfaceC7328y = (InterfaceC7328y) obj;
                                if (i21 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (interfaceC7328y instanceof c0) {
                                        try {
                                            c0 c0Var2 = (c0) interfaceC7328y;
                                            a0VarM8529f = c0Var2.m8529f((b0) AbstractC7316m.m13685j(c0Var2.f20359d, abstractC7311h), abstractC7311h, false, c0Var2.f20357b);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = c4640eM8511n.f22884a;
                                            int i22 = c4640eM8511n.f22886c;
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                ((C3965n) objArr3[i23]).m8574a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        a0VarM8529f = AbstractC7316m.m13685j(interfaceC7328y.mo8488b(), abstractC7311h);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(a0VarM8529f)) * 31) + Long.hashCode(a0VarM8529f.f34838a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                                i12 = i17;
                            }
                            j6 >>= i12;
                            i19++;
                            i13 = i11;
                            jArr3 = jArr2;
                            i17 = i12;
                        }
                        jArr = jArr3;
                        i10 = i13;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i13;
                    }
                    if (i16 == length) {
                        i13 = iIdentityHashCode;
                        break;
                    }
                    i16++;
                    i13 = i10;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i13;
            Object[] objArr4 = c4640eM8511n.f22884a;
            int i24 = c4640eM8511n.f22886c;
            for (int i25 = 0; i25 < i24; i25++) {
                ((C3965n) objArr4[i25]).m8574a();
            }
            return iIdentityHashCode;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
