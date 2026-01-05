package l1;

import androidx.compose.foundation.gestures.AbstractC0241a;
import h1.C2790u;
import h1.a1;
import k1.C3929d;
import k1.f1;
import k1.k0;
import k1.t1;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.h */
/* loaded from: classes.dex */
public final class C4319h implements k0 {

    /* renamed from: a */
    public final InterfaceC4324m f21763a;

    /* renamed from: b */
    public final C2790u f21764b;

    /* renamed from: c */
    public final a1 f21765c;

    /* renamed from: d */
    public final f1 f21766d = AbstractC0241a.f1938b;

    public C4319h(InterfaceC4324m interfaceC4324m, C2790u c2790u, a1 a1Var) {
        this.f21763a = interfaceC4324m;
        this.f21764b = c2790u;
        this.f21765c = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9038b(l1.C4319h r4, k1.d1 r5, float r6, float r7, l1.C4316e r8, ww.AbstractC8193c r9) {
        /*
            boolean r0 = r9 instanceof l1.C4318g
            if (r0 == 0) goto L14
            r0 = r9
            l1.g r0 = (l1.C4318g) r0
            int r1 = r0.f21762c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f21762c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            l1.g r0 = new l1.g
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f21760a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r9.f21762c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r0)
            goto L89
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            og.od.m10798c(r0)
            float r0 = java.lang.Math.abs(r6)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L46
        L3e:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
        L46:
            r4 = 28
            h1.k r4 = h1.AbstractC2773d.m6779b(r6, r7, r4)
            return r4
        L4d:
            r9.f21762c = r3
            h1.u r0 = r4.f21764b
            h1.x1 r3 = h1.y1.f15664a
            h1.a0 r3 = r0.f15616a
            float r2 = r3.mo6104U(r2, r7)
            float r2 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L6d
            k4.v r4 = new k4.v
            r2 = 3
            r4.<init>(r2, r0)
        L6b:
            r0 = r6
            goto L77
        L6d:
            l1.p r0 = new l1.p
            h1.a1 r4 = r4.f21765c
            r2 = 0
            r0.<init>(r2, r4)
            r4 = r0
            goto L6b
        L77:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.mo8773n(r5, r6, r7, r8, r9)
            if (r0 != r1) goto L89
            return r1
        L89:
            l1.a r0 = (l1.C4312a) r0
            h1.k r4 = r0.f21746b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4319h.m9038b(l1.h, k1.d1, float, float, l1.e, ww.c):java.lang.Object");
    }

    @Override // k1.k0
    /* renamed from: a */
    public Object mo8465a(t1 t1Var, float f6, InterfaceC7559c interfaceC7559c) {
        return m9040d(t1Var, f6, C3929d.f20051g, (AbstractC8193c) interfaceC7559c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9039c(k1.d1 r11, float r12, ex.InterfaceC2139c r13, ww.AbstractC8193c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof l1.C4315d
            if (r0 == 0) goto L13
            r0 = r14
            l1.d r0 = (l1.C4315d) r0
            int r1 = r0.f21753d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21753d = r1
            goto L18
        L13:
            l1.d r0 = new l1.d
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f21751b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21753d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ex.c r13 = r0.f21750a
            og.od.m10798c(r14)
            r5 = r10
            goto L4d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            og.od.m10798c(r14)
            k1.j r4 = new k1.j
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f21750a = r7
            r0.f21753d = r3
            k1.f1 r11 = r5.f21766d
            java.lang.Object r14 = tx.c0.m13475K(r11, r4, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            r13 = r7
        L4d:
            l1.a r14 = (l1.C4312a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4319h.m9039c(k1.d1, float, ex.c, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9040d(k1.d1 r5, float r6, ex.InterfaceC2139c r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof l1.C4317f
            if (r0 == 0) goto L13
            r0 = r8
            l1.f r0 = (l1.C4317f) r0
            int r1 = r0.f21759c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21759c = r1
            goto L18
        L13:
            l1.f r0 = new l1.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f21757a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21759c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r8)
            r0.f21759c = r3
            java.lang.Object r8 = r4.m9039c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            l1.a r8 = (l1.C4312a) r8
            java.lang.Float r5 = r8.f21745a
            float r5 = r5.floatValue()
            h1.k r6 = r8.f21746b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.m6828b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4319h.m9040d(k1.d1, float, ex.c, ww.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4319h)) {
            return false;
        }
        C4319h c4319h = (C4319h) obj;
        return c4319h.f21765c.equals(this.f21765c) && AbstractC4154l.m8918a(c4319h.f21764b, this.f21764b) && AbstractC4154l.m8918a(c4319h.f21763a, this.f21763a);
    }

    public final int hashCode() {
        return this.f21763a.hashCode() + ((this.f21764b.hashCode() + (this.f21765c.hashCode() * 31)) * 31);
    }
}
