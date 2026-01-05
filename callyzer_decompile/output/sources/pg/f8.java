package pg;

import aws.smithy.kotlin.runtime.ClientException;
import ay.C0496f;
import ay.ExecutorC0495e;
import hc.AbstractC2879b;
import hc.AbstractC2880c;
import ic.InterfaceC3227e;
import jc.AbstractC3740p;
import jc.AbstractC3741q;
import jc.AbstractC3744t;
import jc.AbstractC3745u;
import jc.C3725a;
import jc.C3726b;
import jc.C3728d;
import jc.C3743s;
import jc.C3747w;
import jc.C3748x;
import jc.C3750z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import tx.C7265y;
import wc.C7973g;
import wc.C7975i;
import wc.C7983q;
import wc.InterfaceC7988v;
import wc.InterfaceC7989w;
import xc.C8324e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f8 {
    /* renamed from: a */
    public static final String m11620a(t3.i0 i0Var) {
        i0Var.mo13310C();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [byte[], java.io.Serializable] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m11621b(jc.AbstractC3745u r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof jc.C3746v
            if (r0 == 0) goto L13
            r0 = r6
            jc.v r0 = (jc.C3746v) r0
            int r1 = r0.f19598b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19598b = r1
            goto L18
        L13:
            jc.v r0 = new jc.v
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19597a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f19598b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r6)
            goto L82
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            og.od.m10798c(r6)
            goto L5d
        L36:
            og.od.m10798c(r6)
            boolean r6 = r5 instanceof jc.C3743s
            r2 = 0
            if (r6 == 0) goto L3f
            return r2
        L3f:
            boolean r6 = r5 instanceof jc.AbstractC3740p
            if (r6 == 0) goto L4a
            jc.p r5 = (jc.AbstractC3740p) r5
            byte[] r5 = r5.mo8273b()
            return r5
        L4a:
            boolean r6 = r5 instanceof jc.AbstractC3741q
            if (r6 == 0) goto L64
            jc.q r5 = (jc.AbstractC3741q) r5
            wc.w r5 = r5.readFrom()
            r0.f19598b = r4
            java.lang.Object r6 = wc.AbstractC7984r.m15163g(r5, r0)
            if (r6 != r1) goto L5d
            goto L81
        L5d:
            wc.s r6 = (wc.C7985s) r6
            byte[] r5 = r6.mo15148v()
            return r5
        L64:
            boolean r6 = r5 instanceof jc.AbstractC3744t
            if (r6 == 0) goto L85
            jc.t r5 = (jc.AbstractC3744t) r5
            wc.e0 r5 = r5.readFrom()
            r0.f19598b = r3
            ay.f r6 = tx.m0.f34659a
            ay.e r6 = ay.ExecutorC0495e.f3538c
            bu.a r3 = new bu.a
            r4 = 26
            r3.<init>(r5, r2, r4)
            java.lang.Object r6 = tx.c0.m13475K(r6, r3, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            byte[] r6 = (byte[]) r6
            return r6
        L85:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.f8.m11621b(jc.u, ww.c):java.io.Serializable");
    }

    /* renamed from: c */
    public static final AbstractC3745u m11622c(AbstractC3745u abstractC3745u, InterfaceC3227e interfaceC3227e, Long l9) {
        AbstractC4154l.m8923f(abstractC3745u, "<this>");
        if (abstractC3745u instanceof AbstractC3744t) {
            return m11625f(l9, new C7975i(interfaceC3227e, ((AbstractC3744t) abstractC3745u).readFrom()));
        }
        if (abstractC3745u instanceof AbstractC3741q) {
            return m11624e(l9, new C7973g(interfaceC3227e, ((AbstractC3741q) abstractC3745u).readFrom()));
        }
        throw new ClientException("HttpBody type is not supported");
    }

    /* renamed from: d */
    public static final AbstractC3745u m11623d(AbstractC2880c abstractC2880c) {
        AbstractC4154l.m8923f(abstractC2880c, "<this>");
        if (abstractC2880c instanceof C3747w) {
            return new C3725a((C3747w) abstractC2880c);
        }
        if (abstractC2880c instanceof C3748x) {
            return new C3726b((C3748x) abstractC2880c);
        }
        if (abstractC2880c instanceof AbstractC2879b) {
            return new C3728d((AbstractC2879b) abstractC2880c);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public static final C3750z m11624e(Long l9, InterfaceC7989w interfaceC7989w) {
        AbstractC4154l.m8923f(interfaceC7989w, "<this>");
        return new C3750z(l9, interfaceC7989w);
    }

    /* renamed from: f */
    public static final jc.a0 m11625f(Long l9, wc.e0 e0Var) {
        AbstractC4154l.m8923f(e0Var, "<this>");
        return new jc.a0(l9, e0Var);
    }

    /* renamed from: g */
    public static InterfaceC7989w m11626g(AbstractC3745u abstractC3745u) {
        AbstractC4154l.m8923f(abstractC3745u, "<this>");
        if (abstractC3745u instanceof C3743s) {
            return null;
        }
        if (abstractC3745u instanceof AbstractC3740p) {
            byte[] bArrMo8273b = ((AbstractC3740p) abstractC3745u).mo8273b();
            int length = bArrMo8273b.length;
            C7983q c7983q = new C7983q(length);
            if (length > c7983q.f38406c.f39895c) {
                throw new IllegalArgumentException("Initial contents overflow maximum channel capacity");
            }
            c7983q.f38405b.write(bArrMo8273b, 0, length);
            c7983q.m15151h(length);
            c7983q.mo15150Y(null);
            return c7983q;
        }
        if (abstractC3745u instanceof AbstractC3741q) {
            return ((AbstractC3741q) abstractC3745u).readFrom();
        }
        if (!(abstractC3745u instanceof AbstractC3744t)) {
            throw new NoWhenBranchMatchedException();
        }
        wc.e0 from = ((AbstractC3744t) abstractC3745u).readFrom();
        AbstractC4154l.m8923f(from, "<this>");
        C8324e c8324e = new C8324e();
        tx.z0 z0Var = tx.z0.f34701a;
        C0496f c0496f = tx.m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        C7265y c7265y = new C7265y("sdk-source-reader");
        executorC0495e.getClass();
        tx.s1 s1VarM13502y = tx.c0.m13502y(z0Var, x5.m11928d(executorC0495e, c7265y), null, new wc.f0(c8324e, from, null), 2);
        InterfaceC7988v interfaceC7988v = c8324e.f39897a;
        if (interfaceC7988v.isClosedForRead()) {
            s1VarM13502y.mo13510j(tx.c0.m13478a("channel was already closed", interfaceC7988v.getClosedCause()));
            return c8324e;
        }
        c8324e.f39898b = s1VarM13502y;
        return c8324e;
    }
}
