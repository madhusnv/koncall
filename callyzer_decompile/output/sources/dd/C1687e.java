package dd;

import bl.C0689a;
import dy.AbstractC1856d;
import dy.C1855c;
import ox.C5770a;
import ox.C5774e;
import ox.C5775f;
import ox.EnumC5772c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.e */
/* loaded from: classes.dex */
public final class C1687e {

    /* renamed from: j */
    public static final C0689a f8250j = new C0689a(6);

    /* renamed from: a */
    public final C1684b f8251a;

    /* renamed from: b */
    public final C5775f f8252b;

    /* renamed from: c */
    public final C1688f f8253c;

    /* renamed from: d */
    public final C1689g f8254d;

    /* renamed from: e */
    public double f8255e;

    /* renamed from: f */
    public C5774e f8256f;

    /* renamed from: g */
    public double f8257g;

    /* renamed from: h */
    public double f8258h;

    /* renamed from: i */
    public final C1855c f8259i;

    public C1687e(C1684b c1684b) {
        C1688f c1688f = new C1688f(c1684b);
        C1689g c1689g = new C1689g(c1684b);
        this.f8251a = c1684b;
        this.f8252b = C5775f.f28341a;
        this.f8253c = c1688f;
        this.f8254d = c1689g;
        this.f8259i = AbstractC1856d.m5490a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v14, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r5v7, types: [dy.a] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5384a(int r13, ww.AbstractC8193c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof dd.C1685c
            if (r0 == 0) goto L13
            r0 = r14
            dd.c r0 = (dd.C1685c) r0
            int r1 = r0.f8244f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8244f = r1
            goto L18
        L13:
            dd.c r0 = new dd.c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f8242d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8244f
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            dy.a r13 = r0.f8241c
            og.od.m10798c(r14)     // Catch: java.lang.Throwable -> L30
            goto L9b
        L30:
            r14 = move-exception
            goto La4
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            int r13 = r0.f8240b
            int r2 = r0.f8239a
            dy.a r5 = r0.f8241c
            og.od.m10798c(r14)
            r14 = r2
            r2 = r13
            r13 = r14
            r14 = r5
            goto L5e
        L49:
            og.od.m10798c(r14)
            dy.c r14 = r12.f8259i
            r0.f8241c = r14
            r0.f8239a = r13
            r2 = 0
            r0.f8240b = r2
            r0.f8244f = r5
            java.lang.Object r5 = r14.mo1768h(r0)
            if (r5 != r1) goto L5e
            goto L99
        L5e:
            dd.g r5 = r12.f8254d     // Catch: java.lang.Throwable -> L72
            boolean r5 = r5.f8269e     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto La0
            r12.m5385b()     // Catch: java.lang.Throwable -> L72
            double r7 = (double) r13     // Catch: java.lang.Throwable -> L72
            double r9 = r12.f8255e     // Catch: java.lang.Throwable -> L72
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L77
            double r9 = r9 - r7
            r12.f8255e = r9     // Catch: java.lang.Throwable -> L72
            goto La0
        L72:
            r13 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
            goto La4
        L77:
            double r7 = r7 - r9
            int r5 = ox.C5770a.f28335d     // Catch: java.lang.Throwable -> L72
            double r9 = r12.f8257g     // Catch: java.lang.Throwable -> L72
            double r7 = r7 / r9
            ox.c r5 = ox.EnumC5772c.SECONDS     // Catch: java.lang.Throwable -> L72
            long r7 = og.bb.m10550f(r7, r5)     // Catch: java.lang.Throwable -> L72
            r0.f8241c = r14     // Catch: java.lang.Throwable -> L72
            r0.f8239a = r13     // Catch: java.lang.Throwable -> L72
            r0.f8240b = r2     // Catch: java.lang.Throwable -> L72
            r0.f8244f = r4     // Catch: java.lang.Throwable -> L72
            long r4 = tx.c0.m13472H(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r13 = tx.c0.m13489l(r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r13 != r1) goto L96
            goto L97
        L96:
            r13 = r3
        L97:
            if (r13 != r1) goto L9a
        L99:
            return r1
        L9a:
            r13 = r14
        L9b:
            r0 = 0
            r12.f8255e = r0     // Catch: java.lang.Throwable -> L30
            r14 = r13
        La0:
            r14.mo1769j(r6)
            return r3
        La4:
            r13.mo1769j(r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C1687e.m5384a(int, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void m5385b() {
        C5774e c5774e = this.f8256f;
        if (c5774e != null) {
            this.f8255e = Math.min(this.f8258h, this.f8255e + (this.f8257g * C5770a.m11301l(C5774e.m11306a(c5774e.f28340a), EnumC5772c.SECONDS)));
        }
        this.f8256f = this.f8252b.mo11308a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5386c(ed.EnumC2030f r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof dd.C1686d
            if (r0 == 0) goto L13
            r0 = r10
            dd.d r0 = (dd.C1686d) r0
            int r1 = r0.f8249e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8249e = r1
            goto L18
        L13:
            dd.d r0 = new dd.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f8247c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8249e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            dy.c r9 = r0.f8246b
            ed.f r0 = r0.f8245a
            og.od.m10798c(r10)
            r3 = r0
            goto L48
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            og.od.m10798c(r10)
            r0.f8245a = r9
            dy.c r10 = r8.f8259i
            r0.f8246b = r10
            r0.f8249e = r3
            java.lang.Object r0 = r10.mo1768h(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r3 = r9
            r9 = r10
        L48:
            r10 = 0
            dd.f r0 = r8.f8253c     // Catch: java.lang.Throwable -> L81
            double r4 = r0.m5387a()     // Catch: java.lang.Throwable -> L81
            dd.g r2 = r8.f8254d     // Catch: java.lang.Throwable -> L81
            double r6 = r8.f8257g     // Catch: java.lang.Throwable -> L81
            double r0 = r2.m5388a(r3, r4, r6)     // Catch: java.lang.Throwable -> L81
            r2 = 2
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L81
            double r2 = r2 * r4
            double r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L81
            r8.m5385b()     // Catch: java.lang.Throwable -> L81
            dd.b r2 = r8.f8251a     // Catch: java.lang.Throwable -> L81
            double r3 = r2.f8236c     // Catch: java.lang.Throwable -> L81
            double r3 = java.lang.Math.max(r0, r3)     // Catch: java.lang.Throwable -> L81
            r8.f8257g = r3     // Catch: java.lang.Throwable -> L81
            double r2 = r2.f8235b     // Catch: java.lang.Throwable -> L81
            double r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L81
            r8.f8258h = r0     // Catch: java.lang.Throwable -> L81
            double r2 = r8.f8255e     // Catch: java.lang.Throwable -> L81
            double r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L81
            r8.f8255e = r0     // Catch: java.lang.Throwable -> L81
            qw.a0 r0 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L81
            r9.mo1769j(r10)
            return r0
        L81:
            r0 = move-exception
            r9.mo1769j(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C1687e.m5386c(ed.f, ww.c):java.lang.Object");
    }
}
