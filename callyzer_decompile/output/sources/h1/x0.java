package h1;

import a2.C0036i;
import ai.AbstractC0151h;
import com.skydoves.balloon.internals.DefinitionKt;
import dy.AbstractC1856d;
import dy.C1855c;
import gx.AbstractC2747a;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import pg.w9;
import tx.C7251k;
import u2.C7325v;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends AbstractC0151h {

    /* renamed from: t */
    public static final C2781l f15643t = new C2781l(DefinitionKt.NO_Float_VALUE);

    /* renamed from: v */
    public static final C2781l f15644v = new C2781l(1.0f);

    /* renamed from: b */
    public final k2.e1 f15645b;

    /* renamed from: c */
    public final k2.e1 f15646c;

    /* renamed from: d */
    public Object f15647d;

    /* renamed from: e */
    public s1 f15648e;

    /* renamed from: f */
    public long f15649f;

    /* renamed from: g */
    public final C0036i f15650g;

    /* renamed from: h */
    public final k2.a1 f15651h;

    /* renamed from: j */
    public C7251k f15652j;

    /* renamed from: k */
    public final C1855c f15653k;

    /* renamed from: l */
    public final m0 f15654l;

    /* renamed from: m */
    public long f15655m;

    /* renamed from: n */
    public final e1.e0 f15656n;

    /* renamed from: p */
    public p0 f15657p;

    /* renamed from: q */
    public final q0 f15658q;

    /* renamed from: r */
    public float f15659r;

    /* renamed from: s */
    public final q0 f15660s;

    public x0(C4409i c4409i) {
        super(3);
        this.f15645b = C3953b.m8517t(c4409i);
        this.f15646c = C3953b.m8517t(c4409i);
        this.f15647d = c4409i;
        this.f15650g = new C0036i(12, this);
        this.f15651h = new k2.a1(DefinitionKt.NO_Float_VALUE);
        this.f15653k = AbstractC1856d.m5490a();
        this.f15654l = new m0();
        this.f15655m = Long.MIN_VALUE;
        this.f15656n = new e1.e0();
        this.f15658q = new q0(this, 1);
        this.f15660s = new q0(this, 0);
    }

    /* renamed from: N */
    public static final void m6873N(x0 x0Var) {
        s1 s1Var = x0Var.f15648e;
        k2.a1 a1Var = x0Var.f15651h;
        if (s1Var == null) {
            return;
        }
        p0 p0Var = x0Var.f15657p;
        if (p0Var == null) {
            if (x0Var.f15649f <= 0 || a1Var.m8490f() == 1.0f || AbstractC4154l.m8918a(x0Var.f15646c.getValue(), x0Var.f15645b.getValue())) {
                p0Var = null;
            } else {
                p0Var = new p0();
                p0Var.f15530d = a1Var.m8490f();
                long j6 = x0Var.f15649f;
                p0Var.f15533g = j6;
                p0Var.f15534h = AbstractC2747a.m6748l((1.0d - a1Var.m8490f()) * j6);
                p0Var.f15531e.mo6835e(a1Var.m8490f(), 0);
            }
        }
        if (p0Var != null) {
            p0Var.f15533g = x0Var.f15649f;
            x0Var.f15656n.m5543a(p0Var);
            s1Var.m6864m(p0Var);
        }
        x0Var.f15657p = null;
    }

    /* renamed from: O */
    public static final void m6874O(x0 x0Var, p0 p0Var, long j6) {
        long j10 = p0Var.f15527a;
        C2781l c2781l = p0Var.f15531e;
        long j11 = j10 + j6;
        p0Var.f15527a = j11;
        long j12 = p0Var.f15534h;
        if (j11 >= j12) {
            p0Var.f15530d = 1.0f;
            return;
        }
        c2 c2Var = p0Var.f15528b;
        if (c2Var == null) {
            float f6 = j11 / j12;
            p0Var.f15530d = (f6 * 1.0f) + ((1 - f6) * c2781l.mo6831a(0));
            return;
        }
        C2781l c2781l2 = p0Var.f15532f;
        if (c2781l2 == null) {
            c2781l2 = f15643t;
        }
        p0Var.f15530d = w9.m11911b(((C2781l) c2Var.mo2730B(j11, c2781l, f15644v, c2781l2)).mo6831a(0), DefinitionKt.NO_Float_VALUE, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6875P(h1.x0 r10, ww.AbstractC8193c r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof h1.s0
            if (r0 == 0) goto L16
            r0 = r11
            h1.s0 r0 = (h1.s0) r0
            int r1 = r0.f15587d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15587d = r1
            goto L1b
        L16:
            h1.s0 r0 = new h1.s0
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f15585b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15587d
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            qw.a0 r7 = qw.a0.f30746a
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            h1.x0 r10 = r0.f15584a
            og.od.m10798c(r11)
            goto L7a
        L3c:
            og.od.m10798c(r11)
            e1.e0 r11 = r10.f15656n
            boolean r11 = r11.m5549g()
            if (r11 == 0) goto L4c
            h1.p0 r11 = r10.f15657p
            if (r11 != 0) goto L4c
            return r7
        L4c:
            uw.h r11 = r0.getContext()
            float r11 = h1.AbstractC2773d.m6791n(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5f
            r10.m6879T()
            r10.f15655m = r5
            return r7
        L5f:
            long r8 = r10.f15655m
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L7a
            h1.q0 r11 = r10.f15658q
            r0.f15584a = r10
            r0.f15587d = r4
            uw.h r2 = r0.getContext()
            k2.t0 r2 = k2.C3953b.m8515r(r2)
            java.lang.Object r11 = r2.mo8536u(r11, r0)
            if (r11 != r1) goto L7a
            goto L94
        L7a:
            e1.e0 r11 = r10.f15656n
            boolean r11 = r11.m5550h()
            if (r11 != 0) goto L8a
            h1.p0 r11 = r10.f15657p
            if (r11 == 0) goto L87
            goto L8a
        L87:
            r10.f15655m = r5
            return r7
        L8a:
            r0.f15584a = r10
            r0.f15587d = r3
            java.lang.Object r11 = r10.m6878S(r0)
            if (r11 != r1) goto L7a
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x0.m6875P(h1.x0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6876Q(h1.x0 r6, ww.AbstractC8193c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof h1.v0
            if (r0 == 0) goto L16
            r0 = r7
            h1.v0 r0 = (h1.v0) r0
            int r1 = r0.f15629e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15629e = r1
            goto L1b
        L16:
            h1.v0 r0 = new h1.v0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f15627c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15629e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f15626b
            h1.x0 r0 = r0.f15625a
            og.od.m10798c(r7)
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.f15626b
            h1.x0 r2 = r0.f15625a
            og.od.m10798c(r7)
            r7 = r6
            r6 = r2
            goto L5b
        L43:
            og.od.m10798c(r7)
            k2.e1 r7 = r6.f15645b
            java.lang.Object r7 = r7.getValue()
            dy.c r2 = r6.f15653k
            r0.f15625a = r6
            r0.f15626b = r7
            r0.f15629e = r4
            java.lang.Object r2 = r2.mo1768h(r0)
            if (r2 != r1) goto L5b
            goto L7b
        L5b:
            r0.f15625a = r6
            r0.f15626b = r7
            r0.f15629e = r3
            tx.k r2 = new tx.k
            uw.c r0 = pg.n6.m11797c(r0)
            r2.<init>(r4, r0)
            r2.m13540p()
            r6.f15652j = r2
            dy.c r0 = r6.f15653k
            r3 = 0
            r0.mo1769j(r3)
            java.lang.Object r0 = r2.m13539o()
            if (r0 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            boolean r6 = kotlin.jvm.internal.AbstractC4154l.m8918a(r7, r6)
            if (r6 == 0) goto L89
            qw.a0 r6 = qw.a0.f30746a
            return r6
        L89:
            r6 = -9223372036854775808
            r0.f15655m = r6
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "targetState while waiting for composition"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x0.m6876Q(h1.x0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6877R(h1.x0 r7, ww.AbstractC8193c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof h1.w0
            if (r0 == 0) goto L16
            r0 = r8
            h1.w0 r0 = (h1.w0) r0
            int r1 = r0.f15635e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15635e = r1
            goto L1b
        L16:
            h1.w0 r0 = new h1.w0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f15633c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15635e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f15632b
            h1.x0 r0 = r0.f15631a
            og.od.m10798c(r8)
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f15632b
            h1.x0 r2 = r0.f15631a
            og.od.m10798c(r8)
            goto L5b
        L41:
            og.od.m10798c(r8)
            k2.e1 r8 = r7.f15645b
            java.lang.Object r8 = r8.getValue()
            dy.c r2 = r7.f15653k
            r0.f15631a = r7
            r0.f15632b = r8
            r0.f15635e = r4
            java.lang.Object r2 = r2.mo1768h(r0)
            if (r2 != r1) goto L59
            goto L87
        L59:
            r2 = r7
            r7 = r8
        L5b:
            java.lang.Object r8 = r2.f15647d
            dy.c r5 = r2.f15653k
            boolean r8 = kotlin.jvm.internal.AbstractC4154l.m8918a(r7, r8)
            r6 = 0
            if (r8 == 0) goto L6a
            r5.mo1769j(r6)
            goto L8f
        L6a:
            r0.f15631a = r2
            r0.f15632b = r7
            r0.f15635e = r3
            tx.k r8 = new tx.k
            uw.c r0 = pg.n6.m11797c(r0)
            r8.<init>(r4, r0)
            r8.m13540p()
            r2.f15652j = r8
            r5.mo1769j(r6)
            java.lang.Object r8 = r8.m13539o()
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            r0 = r2
        L89:
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r7)
            if (r1 == 0) goto L92
        L8f:
            qw.a0 r7 = qw.a0.f30746a
            return r7
        L92:
            r1 = -9223372036854775808
            r0.f15655m = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x0.m6877R(h1.x0, ww.c):java.lang.Object");
    }

    @Override // ai.AbstractC0151h
    /* renamed from: A */
    public final Object mo313A() {
        return this.f15645b.getValue();
    }

    @Override // ai.AbstractC0151h
    /* renamed from: G */
    public final void mo319G(Object obj) {
        this.f15646c.setValue(obj);
    }

    @Override // ai.AbstractC0151h
    /* renamed from: J */
    public final void mo322J(s1 s1Var) {
        s1 s1Var2 = this.f15648e;
        if (s1Var2 != null && !s1Var.equals(s1Var2)) {
            n0.m6840b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f15648e + ", new instance: " + s1Var);
        }
        this.f15648e = s1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qw.g] */
    @Override // ai.AbstractC0151h
    /* renamed from: K */
    public final void mo323K() {
        this.f15648e = null;
        ((C7325v) v1.f15630a.getValue()).m13720c(this);
    }

    /* renamed from: S */
    public final Object m6878S(AbstractC8193c abstractC8193c) {
        float fM6791n = AbstractC2773d.m6791n(abstractC8193c.getContext());
        qw.a0 a0Var = qw.a0.f30746a;
        if (fM6791n <= DefinitionKt.NO_Float_VALUE) {
            m6879T();
            return a0Var;
        }
        this.f15659r = fM6791n;
        Object objMo8536u = C3953b.m8515r(abstractC8193c.getContext()).mo8536u(this.f15660s, abstractC8193c);
        return objMo8536u == EnumC7794a.COROUTINE_SUSPENDED ? objMo8536u : a0Var;
    }

    /* renamed from: T */
    public final void m6879T() {
        s1 s1Var = this.f15648e;
        if (s1Var != null) {
            s1Var.m6854c();
        }
        this.f15656n.m5545c();
        if (this.f15657p != null) {
            this.f15657p = null;
            m6882W(1.0f);
            m6881V();
        }
    }

    /* renamed from: U */
    public final Object m6880U(float f6, Object obj, AbstractC8199i abstractC8199i) {
        if (DefinitionKt.NO_Float_VALUE > f6 || f6 > 1.0f) {
            n0.m6839a("Expecting fraction between 0 and 1. Got " + f6);
        }
        s1 s1Var = this.f15648e;
        if (s1Var != null) {
            Object objM6837a = m0.m6837a(this.f15654l, new u0(obj, this.f15645b.getValue(), this, s1Var, f6, null), abstractC8199i);
            if (objM6837a == EnumC7794a.COROUTINE_SUSPENDED) {
                return objM6837a;
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: V */
    public final void m6881V() {
        s1 s1Var = this.f15648e;
        if (s1Var == null) {
            return;
        }
        s1Var.m6863l(AbstractC2747a.m6748l(this.f15651h.m8490f() * ((Number) s1Var.f15599l.getValue()).longValue()));
    }

    /* renamed from: W */
    public final void m6882W(float f6) {
        this.f15651h.m8491g(f6);
    }

    @Override // ai.AbstractC0151h
    /* renamed from: y */
    public final Object mo345y() {
        return this.f15646c.getValue();
    }
}
