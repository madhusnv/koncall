package x1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4381z;
import l4.InterfaceC4374s;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.y */
/* loaded from: classes.dex */
public final class C8275y extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ b2.y0 f39744a;

    /* renamed from: b */
    public final /* synthetic */ v0 f39745b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39746c;

    /* renamed from: d */
    public final /* synthetic */ boolean f39747d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f39748e;

    /* renamed from: f */
    public final /* synthetic */ C4381z f39749f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC4374s f39750g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6747c f39751h;

    /* renamed from: j */
    public final /* synthetic */ int f39752j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8275y(b2.y0 y0Var, v0 v0Var, boolean z6, boolean z10, InterfaceC2139c interfaceC2139c, C4381z c4381z, InterfaceC4374s interfaceC4374s, InterfaceC6747c interfaceC6747c, int i10) {
        super(2);
        this.f39744a = y0Var;
        this.f39745b = v0Var;
        this.f39746c = z6;
        this.f39747d = z10;
        this.f39748e = interfaceC2139c;
        this.f39749f = c4381z;
        this.f39750g = interfaceC4374s;
        this.f39751h = interfaceC6747c;
        this.f39752j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    @Override // ex.InterfaceC2141e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            k2.k r12 = (k2.InterfaceC3962k) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r3
        L12:
            r13 = r13 & r2
            k2.o r12 = (k2.C3966o) r12
            boolean r13 = r12.m8598P(r13, r0)
            if (r13 == 0) goto Lc1
            x1.x r4 = new x1.x
            s4.c r9 = r11.f39751h
            int r10 = r11.f39752j
            x1.v0 r5 = r11.f39745b
            ex.c r6 = r11.f39748e
            l4.z r7 = r11.f39749f
            l4.s r8 = r11.f39750g
            r4.<init>(r5, r6, r7, r8, r9, r10)
            int r13 = r12.f20462P
            k2.i1 r0 = r12.m8620m()
            w2.o r1 = w2.C7876o.f37669a
            w2.r r1 = w2.AbstractC7862a.m14845c(r12, r1)
            v3.j r6 = v3.InterfaceC7639k.V0
            r6.getClass()
            v3.i r6 = v3.C7638j.f36921b
            r12.c0()
            boolean r7 = r12.f20461O
            if (r7 == 0) goto L4a
            r12.m8619l(r6)
            goto L4d
        L4a:
            r12.m0()
        L4d:
            v3.h r6 = v3.C7638j.f36925f
            k2.C3953b.m8521x(r6, r4, r12)
            v3.h r4 = v3.C7638j.f36924e
            k2.C3953b.m8521x(r4, r0, r12)
            v3.h r0 = v3.C7638j.f36926g
            boolean r4 = r12.f20461O
            if (r4 != 0) goto L6b
            java.lang.Object r4 = r12.m8596M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            boolean r4 = kotlin.jvm.internal.AbstractC4154l.m8918a(r4, r6)
            if (r4 != 0) goto L6e
        L6b:
            com.sun.mail.util.AbstractC1452a.m4577x(r13, r12, r13, r0)
        L6e:
            v3.h r13 = v3.C7638j.f36923d
            k2.C3953b.m8521x(r13, r1, r12)
            r12.m8623p(r2)
            x1.k0 r13 = r5.m15477a()
            x1.k0 r0 = x1.k0.None
            boolean r1 = r11.f39746c
            if (r13 == r0) goto L96
            t3.t r13 = r5.m15479c()
            if (r13 == 0) goto L96
            t3.t r13 = r5.m15479c()
            kotlin.jvm.internal.AbstractC4154l.m8920c(r13)
            boolean r13 = r13.mo13305s()
            if (r13 == 0) goto L96
            if (r1 == 0) goto L96
            goto L97
        L96:
            r2 = r3
        L97:
            b2.y0 r13 = r11.f39744a
            x1.r0.m15451k(r13, r2, r12, r3)
            x1.k0 r0 = r5.m15477a()
            x1.k0 r2 = x1.k0.Cursor
            if (r0 != r2) goto Lb7
            boolean r0 = r11.f39747d
            if (r0 != 0) goto Lb7
            if (r1 == 0) goto Lb7
            r0 = -7167858(0xffffffffff92a08e, float:NaN)
            r12.m8607Y(r0)
            x1.r0.m15450j(r13, r12, r3)
            r12.m8623p(r3)
            goto Lc4
        Lb7:
            r13 = -7090978(0xffffffffff93ccde, float:NaN)
            r12.m8607Y(r13)
            r12.m8623p(r3)
            goto Lc4
        Lc1:
            r12.m8601S()
        Lc4:
            qw.a0 r12 = qw.a0.f30746a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C8275y.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
