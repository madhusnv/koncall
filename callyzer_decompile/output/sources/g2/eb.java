package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import i1.C3138q;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class eb extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7879r f11476a;

    /* renamed from: b */
    public final /* synthetic */ d3.l0 f11477b;

    /* renamed from: c */
    public final /* synthetic */ long f11478c;

    /* renamed from: d */
    public final /* synthetic */ float f11479d;

    /* renamed from: e */
    public final /* synthetic */ C3138q f11480e;

    /* renamed from: f */
    public final /* synthetic */ boolean f11481f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC4630l f11482g;

    /* renamed from: h */
    public final /* synthetic */ boolean f11483h;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2137a f11484j;

    /* renamed from: k */
    public final /* synthetic */ float f11485k;

    /* renamed from: l */
    public final /* synthetic */ C6734c f11486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(InterfaceC7879r interfaceC7879r, d3.l0 l0Var, long j6, float f6, C3138q c3138q, boolean z6, InterfaceC4630l interfaceC4630l, boolean z10, InterfaceC2137a interfaceC2137a, float f10, C6734c c6734c) {
        super(2);
        this.f11476a = interfaceC7879r;
        this.f11477b = l0Var;
        this.f11478c = j6;
        this.f11479d = f6;
        this.f11480e = c3138q;
        this.f11481f = z6;
        this.f11482g = interfaceC4630l;
        this.f11483h = z10;
        this.f11484j = interfaceC2137a;
        this.f11485k = f10;
        this.f11486l = c6734c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ex.InterfaceC2141e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            k2.k r1 = (k2.InterfaceC3962k) r1
            r2 = r22
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r2 = r2 & 3
            r3 = 2
            if (r2 != r3) goto L22
            r2 = r1
            k2.o r2 = (k2.C3966o) r2
            boolean r3 = r2.m8586C()
            if (r3 != 0) goto L1d
            goto L22
        L1d:
            r2.m8601S()
            goto Lc3
        L22:
            k2.i2 r2 = g2.g6.f11636a
            androidx.compose.material3.MinimumInteractiveModifier r2 = androidx.compose.material3.MinimumInteractiveModifier.f2066a
            w2.r r3 = r0.f11476a
            w2.r r4 = r3.mo14852e(r2)
            long r2 = r0.f11478c
            float r5 = r0.f11479d
            long r6 = g2.fb.m6168e(r2, r5, r1)
            k2.i2 r2 = w3.k1.f37836h
            r12 = r1
            k2.o r12 = (k2.C3966o) r12
            java.lang.Object r1 = r12.m8618k(r2)
            float r2 = r0.f11485k
            s4.c r1 = (s4.InterfaceC6747c) r1
            float r9 = r1.mo8435T(r2)
            d3.l0 r5 = r0.f11477b
            i1.q r8 = r0.f11480e
            w2.r r1 = g2.fb.m6167d(r4, r5, r6, r8, r9)
            r13 = 0
            r14 = 7
            r8 = 0
            r9 = 0
            r10 = 0
            i1.p0 r16 = g2.q9.m6291c(r8, r9, r10, r12, r13, r14)
            boolean r2 = r0.f11483h
            ex.a r3 = r0.f11484j
            boolean r14 = r0.f11481f
            m1.l r15 = r0.f11482g
            r18 = 0
            r13 = r1
            r17 = r2
            r19 = r3
            w2.r r1 = androidx.compose.foundation.selection.AbstractC0252b.m697a(r13, r14, r15, r16, r17, r18, r19)
            w2.j r2 = w2.C7864c.f37642a
            r3 = 1
            t3.j0 r2 = o1.AbstractC5256o.m10361d(r2, r3)
            int r4 = r12.f20462P
            k2.i1 r5 = r12.m8620m()
            w2.r r1 = w2.AbstractC7862a.m14845c(r12, r1)
            v3.j r6 = v3.InterfaceC7639k.V0
            r6.getClass()
            v3.i r6 = v3.C7638j.f36921b
            r12.c0()
            boolean r7 = r12.f20461O
            if (r7 == 0) goto L8d
            r12.m8619l(r6)
            goto L90
        L8d:
            r12.m0()
        L90:
            v3.h r6 = v3.C7638j.f36925f
            k2.C3953b.m8521x(r6, r2, r12)
            v3.h r2 = v3.C7638j.f36924e
            k2.C3953b.m8521x(r2, r5, r12)
            v3.h r2 = v3.C7638j.f36926g
            boolean r5 = r12.f20461O
            if (r5 != 0) goto Lae
            java.lang.Object r5 = r12.m8596M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r6)
            if (r5 != 0) goto Lb1
        Lae:
            com.sun.mail.util.AbstractC1452a.m4577x(r4, r12, r4, r2)
        Lb1:
            v3.h r2 = v3.C7638j.f36923d
            k2.C3953b.m8521x(r2, r1, r12)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            s2.c r2 = r0.f11486l
            r2.invoke(r12, r1)
            r12.m8623p(r3)
        Lc3:
            qw.a0 r1 = qw.a0.f30746a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.eb.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
