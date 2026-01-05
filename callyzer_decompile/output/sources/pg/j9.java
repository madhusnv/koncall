package pg;

import android.graphics.PointF;
import c3.C0847b;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import g4.C2501q;
import og.yf;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j9 {
    /* renamed from: a */
    public static final int m11716a(x1.v0 v0Var, long j6, w3.t2 t2Var) {
        long jMo13297N;
        int iM11721f;
        x1.r1 r1VarM15480d = v0Var.m15480d();
        if (r1VarM15480d != null) {
            C2501q c2501q = r1VarM15480d.f39668a.f13671b;
            InterfaceC7033t interfaceC7033tM15479c = v0Var.m15479c();
            if (interfaceC7033tM15479c != null && (iM11721f = m11721f(c2501q, (jMo13297N = interfaceC7033tM15479c.mo13297N(j6)), t2Var)) != -1) {
                return c2501q.m6474g(C0847b.m2270a((c2501q.m6469b(iM11721f) + c2501q.m6473f(iM11721f)) / 2.0f, 1, jMo13297N));
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final long m11717b(x1.v0 v0Var, C0848c c0848c, C0848c c0848c2, int i10) {
        long jM11722g = m11722g(v0Var, c0848c, i10);
        if (g4.n0.m6455b(jM11722g)) {
            return g4.n0.f13684b;
        }
        long jM11722g2 = m11722g(v0Var, c0848c2, i10);
        if (g4.n0.m6455b(jM11722g2)) {
            return g4.n0.f13684b;
        }
        int i11 = (int) (jM11722g >> 32);
        int i12 = (int) (jM11722g2 & 4294967295L);
        return yf.m11072a(Math.min(i11, i11), Math.max(i12, i12));
    }

    /* renamed from: c */
    public static final boolean m11718c(g4.l0 l0Var, int i10) {
        C2501q c2501q = l0Var.f13671b;
        int iM6471d = c2501q.m6471d(i10);
        return i10 == l0Var.m6449g(iM6471d) || i10 == c2501q.m6470c(iM6471d, false) ? l0Var.m6450h(i10) != l0Var.m6443a(i10) : l0Var.m6443a(i10) != l0Var.m6443a(i10 - 1);
    }

    /* renamed from: d */
    public static final long m11719d(PointF pointF) {
        float f6 = pointF.x;
        float f10 = pointF.y;
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11720e(d7.AbstractC1646r r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ke.C4061b
            if (r0 == 0) goto L13
            r0 = r7
            ke.b r0 = (ke.C4061b) r0
            int r1 = r0.f20915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20915d = r1
            goto L18
        L13:
            ke.b r0 = new ke.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20914c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20915d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.z r6 = r0.f20913b
            d7.r r0 = r0.f20912a
            og.od.m10798c(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            og.od.m10798c(r7)
            d7.q r7 = r6.mo5344b()
            d7.q r2 = d7.EnumC1645q.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L47
            goto L7a
        L47:
            kotlin.jvm.internal.z r7 = new kotlin.jvm.internal.z
            r7.<init>()
            r0.f20912a = r6     // Catch: java.lang.Throwable -> L7b
            r0.f20913b = r7     // Catch: java.lang.Throwable -> L7b
            r0.f20915d = r4     // Catch: java.lang.Throwable -> L7b
            tx.k r2 = new tx.k     // Catch: java.lang.Throwable -> L7b
            uw.c r0 = pg.n6.m11797c(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.m13540p()     // Catch: java.lang.Throwable -> L7b
            ke.c r0 = new ke.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f21164a = r0     // Catch: java.lang.Throwable -> L7b
            r6.mo5343a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.m13539o()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f21164a
            d7.t r6 = (d7.InterfaceC1648t) r6
            if (r6 == 0) goto L7a
            r0.mo5346d(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f21164a
            d7.t r6 = (d7.InterfaceC1648t) r6
            if (r6 == 0) goto L89
            r0.mo5346d(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.j9.m11720e(d7.r, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final int m11721f(C2501q c2501q, long j6, w3.t2 t2Var) {
        float fMo15006g = t2Var != null ? t2Var.mo15006g() : DefinitionKt.NO_Float_VALUE;
        int i10 = (int) (4294967295L & j6);
        int iM6472e = c2501q.m6472e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < c2501q.m6473f(iM6472e) - fMo15006g || Float.intBitsToFloat(i10) > c2501q.m6469b(iM6472e) + fMo15006g) {
            return -1;
        }
        int i11 = (int) (j6 >> 32);
        if (Float.intBitsToFloat(i11) < (-fMo15006g) || Float.intBitsToFloat(i11) > c2501q.f13700d + fMo15006g) {
            return -1;
        }
        return iM6472e;
    }

    /* renamed from: g */
    public static final long m11722g(x1.v0 v0Var, C0848c c0848c, int i10) {
        x1.r1 r1VarM15480d = v0Var.m15480d();
        C2501q c2501q = r1VarM15480d != null ? r1VarM15480d.f39668a.f13671b : null;
        InterfaceC7033t interfaceC7033tM15479c = v0Var.m15479c();
        return (c2501q == null || interfaceC7033tM15479c == null) ? g4.n0.f13684b : c2501q.m6475h(c0848c.m2287i(interfaceC7033tM15479c.mo13297N(0L)), i10, g4.j0.f13659b);
    }

    /* renamed from: h */
    public static final boolean m11723h(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* renamed from: i */
    public static final boolean m11724i(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    /* renamed from: j */
    public static final boolean m11725j(int i10) {
        int type;
        return (!m11724i(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }
}
