package g1;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.w */
/* loaded from: classes.dex */
public final class C2443w extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11105a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11106b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11107c;

    /* renamed from: d */
    public final /* synthetic */ C6734c f11108d;

    /* renamed from: e */
    public final /* synthetic */ Object f11109e;

    /* renamed from: f */
    public final /* synthetic */ Object f11110f;

    /* renamed from: g */
    public final /* synthetic */ Object f11111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443w(InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC4630l interfaceC4630l, i1.p0 p0Var, InterfaceC2137a interfaceC2137a, C6734c c6734c) {
        super(2);
        this.f11106b = interfaceC7879r;
        this.f11107c = z6;
        this.f11109e = interfaceC4630l;
        this.f11110f = p0Var;
        this.f11111g = interfaceC2137a;
        this.f11108d = c6734c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // ex.InterfaceC2141e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r0 = r8.f11105a
            switch(r0) {
                case 0: goto Laa;
                default: goto L5;
            }
        L5:
            k2.k r9 = (k2.InterfaceC3962k) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r10 = r10 & 3
            r0 = 2
            if (r10 != r0) goto L21
            r10 = r9
            k2.o r10 = (k2.C3966o) r10
            boolean r0 = r10.m8586C()
            if (r0 != 0) goto L1c
            goto L21
        L1c:
            r10.m8601S()
            goto La7
        L21:
            java.lang.Object r10 = r8.f11109e
            r2 = r10
            m1.l r2 = (m1.InterfaceC4630l) r2
            java.lang.Object r10 = r8.f11110f
            r3 = r10
            i1.p0 r3 = (i1.p0) r3
            d4.h r5 = new d4.h
            r10 = 4
            r5.<init>(r10)
            java.lang.Object r10 = r8.f11111g
            r6 = r10
            ex.a r6 = (ex.InterfaceC2137a) r6
            w2.r r0 = r8.f11106b
            boolean r1 = r8.f11107c
            r4 = 1
            w2.r r10 = androidx.compose.foundation.selection.AbstractC0252b.m697a(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            w2.r r10 = androidx.compose.foundation.layout.AbstractC0245d.m668e(r10, r0)
            w2.h r0 = w2.C7864c.f37655p
            o1.e r1 = o1.AbstractC5251j.f25761e
            r2 = 54
            o1.t r0 = o1.AbstractC5260s.m10367a(r1, r0, r9, r2)
            r1 = r9
            k2.o r1 = (k2.C3966o) r1
            int r2 = r1.f20462P
            k2.i1 r3 = r1.m8620m()
            w2.r r10 = w2.AbstractC7862a.m14845c(r9, r10)
            v3.j r4 = v3.InterfaceC7639k.V0
            r4.getClass()
            v3.i r4 = v3.C7638j.f36921b
            r1.c0()
            boolean r5 = r1.f20461O
            if (r5 == 0) goto L6e
            r1.m8619l(r4)
            goto L71
        L6e:
            r1.m0()
        L71:
            v3.h r4 = v3.C7638j.f36925f
            k2.C3953b.m8521x(r4, r0, r9)
            v3.h r0 = v3.C7638j.f36924e
            k2.C3953b.m8521x(r0, r3, r9)
            v3.h r0 = v3.C7638j.f36926g
            boolean r3 = r1.f20461O
            if (r3 != 0) goto L8f
            java.lang.Object r3 = r1.m8596M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r4)
            if (r3 != 0) goto L92
        L8f:
            com.sun.mail.util.AbstractC1452a.m4577x(r2, r1, r2, r0)
        L92:
            v3.h r0 = v3.C7638j.f36923d
            k2.C3953b.m8521x(r0, r10, r9)
            r10 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            s2.c r0 = r8.f11108d
            o1.v r2 = o1.C5263v.f25855a
            r0.invoke(r2, r9, r10)
            r9 = 1
            r1.m8623p(r9)
        La7:
            qw.a0 r9 = qw.a0.f30746a
            return r9
        Laa:
            r6 = r9
            k2.k r6 = (k2.InterfaceC3962k) r6
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            java.lang.Object r9 = r8.f11109e
            r2 = r9
            g1.u0 r2 = (g1.u0) r2
            java.lang.Object r9 = r8.f11110f
            r3 = r9
            g1.v0 r3 = (g1.v0) r3
            java.lang.Object r9 = r8.f11111g
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            r9 = 1572871(0x180007, float:2.204062E-39)
            int r7 = k2.C3953b.m8496A(r9)
            boolean r0 = r8.f11107c
            w2.r r1 = r8.f11106b
            s2.c r5 = r8.f11108d
            androidx.compose.animation.AbstractC0235b.m628c(r0, r1, r2, r3, r4, r5, r6, r7)
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C2443w.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443w(boolean z6, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, String str, C6734c c6734c, int i10) {
        super(2);
        this.f11107c = z6;
        this.f11106b = interfaceC7879r;
        this.f11109e = u0Var;
        this.f11110f = v0Var;
        this.f11111g = str;
        this.f11108d = c6734c;
    }
}
