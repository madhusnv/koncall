package cd;

import aws.smithy.kotlin.runtime.retries.TooManyAttemptsException;
import b2.C0554l;
import ed.AbstractC2029e;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6363m;
import qw.C6364n;
import qw.a0;
import uw.InterfaceC7559c;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cd.n */
/* loaded from: classes.dex */
public class C0959n {

    /* renamed from: b */
    public static final C8687a f5761b = new C8687a(4);

    /* renamed from: a */
    public final C0554l f5762a;

    public C0959n(C0554l c0554l) {
        this.f5762a = c0554l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r7v5, types: [ed.g] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m2720g(cd.C0959n r7, z1.C8849i r8, an.d3 r9, ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof cd.C0957l
            if (r0 == 0) goto L14
            r0 = r10
            cd.l r0 = (cd.C0957l) r0
            int r1 = r0.f5755k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5755k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            cd.l r0 = new cd.l
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f5753h
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f5755k
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L53
            if (r1 == r4) goto L46
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            og.od.m10798c(r10)
            return r10
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            int r4 = r6.f5752g
            ed.g r7 = r6.f5751f
            ex.c r8 = r6.f5750e
            cd.n r9 = r6.f5749d
            og.od.m10798c(r10)
            r3 = r7
            r1 = r9
            goto L87
        L46:
            an.d3 r9 = r6.f5748c
            z1.i r8 = r6.f5747b
            cd.n r7 = r6.f5746a
            og.od.m10798c(r10)     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            goto L65
        L50:
            r0 = move-exception
            r8 = r0
            goto La1
        L53:
            og.od.m10798c(r10)
            r6.f5746a = r7     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            r6.f5747b = r8     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            r6.f5748c = r9     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            r6.f5755k = r4     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            java.lang.Object r10 = r7.mo2716b(r6)     // Catch: aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException -> L50
            if (r10 != r0) goto L65
            goto L9f
        L65:
            b2.l r10 = r7.mo2718e()
            java.lang.Object r10 = r10.f3780d
            dd.r r10 = (dd.C1700r) r10
            r6.f5746a = r5
            r6.f5747b = r5
            r6.f5748c = r5
            r6.f5749d = r7
            r6.f5750e = r9
            r6.f5751f = r8
            r6.f5752g = r4
            r6.f5755k = r3
            java.lang.Object r10 = r10.m5392b(r6)
            if (r10 != r0) goto L84
            goto L9f
        L84:
            r1 = r7
            r3 = r8
            r8 = r9
        L87:
            dd.n r10 = (dd.C1696n) r10
            r6.f5746a = r5
            r6.f5747b = r5
            r6.f5748c = r5
            r6.f5749d = r5
            r6.f5750e = r5
            r6.f5751f = r5
            r6.f5755k = r2
            r2 = r8
            r5 = r10
            java.lang.Object r7 = r1.m2721d(r2, r3, r4, r5, r6)
            if (r7 != r0) goto La0
        L9f:
            return r0
        La0:
            return r7
        La1:
            r7.m2723i(r8, r4, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C0959n.m2720g(cd.n, z1.i, an.d3, ww.c):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo2715a(int i10, AbstractC2029e abstractC2029e, InterfaceC7559c interfaceC7559c) {
        return a0.f30746a;
    }

    /* renamed from: b */
    public Object mo2716b(InterfaceC7559c interfaceC7559c) {
        return a0.f30746a;
    }

    /* renamed from: c */
    public Object mo2717c(int i10, InterfaceC7559c interfaceC7559c) {
        return a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148 A[Catch: all -> 0x0166, RetryCapacityExceededException -> 0x016b, TryCatch #5 {RetryCapacityExceededException -> 0x016b, all -> 0x0166, blocks: (B:57:0x0144, B:59:0x0148, B:67:0x0171, B:69:0x0175, B:71:0x0179, B:73:0x0185, B:86:0x0200, B:87:0x0207, B:88:0x0208, B:89:0x020d, B:90:0x020e, B:92:0x021b, B:96:0x0226, B:97:0x022b, B:98:0x022c), top: B:112:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171 A[Catch: all -> 0x0166, RetryCapacityExceededException -> 0x016b, TryCatch #5 {RetryCapacityExceededException -> 0x016b, all -> 0x0166, blocks: (B:57:0x0144, B:59:0x0148, B:67:0x0171, B:69:0x0175, B:71:0x0179, B:73:0x0185, B:86:0x0200, B:87:0x0207, B:88:0x0208, B:89:0x020d, B:90:0x020e, B:92:0x021b, B:96:0x0226, B:97:0x022b, B:98:0x022c), top: B:112:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01f0 -> B:85:0x01f6). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2721d(ex.InterfaceC2139c r17, ed.InterfaceC2031g r18, int r19, dd.C1696n r20, ww.AbstractC8193c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C0959n.m2721d(ex.c, ed.g, int, dd.n, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public C0554l mo2718e() {
        return this.f5762a;
    }

    /* renamed from: f */
    public /* bridge */ C0554l mo2719f() {
        return mo2718e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2722h(dd.C1696n r5, int r6, java.lang.Object r7, ww.AbstractC8193c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof cd.C0958m
            if (r0 == 0) goto L13
            r0 = r8
            cd.m r0 = (cd.C0958m) r0
            int r1 = r0.f5760e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5760e = r1
            goto L18
        L13:
            cd.m r0 = new cd.m
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f5758c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f5760e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.f5757b
            java.lang.Object r7 = r0.f5756a
            og.od.m10798c(r8)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r8)
            r0.f5756a = r7
            r0.f5757b = r6
            r0.f5760e = r3
            dd.r r8 = r5.f8288b
            int r5 = r5.f8287a
            java.lang.Object r5 = dd.C1700r.m5391a(r8, r5, r0)
            if (r5 != r1) goto L47
            goto L49
        L47:
            qw.a0 r5 = qw.a0.f30746a
        L49:
            if (r5 != r1) goto L4c
            return r1
        L4c:
            boolean r5 = r7 instanceof qw.C6363m
            if (r5 == 0) goto L52
            r5 = 0
            goto L53
        L52:
            r5 = r7
        L53:
            if (r5 != 0) goto L62
            cd.g r5 = new cd.g
            java.lang.Throwable r7 = qw.C6364n.m12363a(r7)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            r5.<init>(r7, r6)
            return r5
        L62:
            cd.h r7 = new cd.h
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C0959n.m2722h(dd.n, int, java.lang.Object, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2723i(aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException r9, int r10, qw.C6364n r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Insufficient client capacity to attempt retry, halting on attempt "
            java.lang.String r1 = " of "
            java.lang.StringBuilder r0 = com.sun.mail.util.AbstractC1452a.m4567n(r10, r0, r1)
            b2.l r1 = r8.mo2718e()
            int r1 = r1.f3778b
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r0 = 0
            if (r11 == 0) goto L1f
            java.lang.Object r1 = r11.f30758a
            java.lang.Throwable r1 = qw.C6364n.m12363a(r1)
            goto L20
        L1f:
            r1 = r0
        L20:
            if (r1 != 0) goto L3e
            aws.smithy.kotlin.runtime.retries.TooManyAttemptsException r2 = new aws.smithy.kotlin.runtime.retries.TooManyAttemptsException
            if (r11 == 0) goto L2c
            java.lang.Object r1 = r11.f30758a
            boolean r4 = r1 instanceof qw.C6363m
            if (r4 == 0) goto L2e
        L2c:
            r6 = r0
            goto L2f
        L2e:
            r6 = r1
        L2f:
            if (r11 == 0) goto L37
            java.lang.Object r11 = r11.f30758a
            java.lang.Throwable r0 = qw.C6364n.m12363a(r11)
        L37:
            r4 = r9
            r5 = r10
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            throw r2
        L3e:
            boolean r9 = r1 instanceof aws.smithy.kotlin.runtime.ServiceException
            if (r9 == 0) goto L6f
            r9 = r1
            aws.smithy.kotlin.runtime.ServiceException r9 = (aws.smithy.kotlin.runtime.ServiceException) r9
            qb.a r10 = new qb.a
            java.lang.String r11 = "Early retry termination"
            r10.<init>(r11, r3)
            aws.smithy.kotlin.runtime.b r9 = r9.mo1480b()
            ec.c r9 = r9.f3503a
            ec.a r11 = aws.smithy.kotlin.runtime.C0488a.f3500b
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r9, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r11, r0)
            java.lang.Object r0 = r9.mo1864e(r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L68
            rw.r r0 = rw.C6668r.f31943a
        L68:
            java.util.ArrayList r10 = rw.AbstractC6663m.m12753Q(r10, r0)
            r9.mo1862b(r11, r10)
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C0959n.m2723i(aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException, int, qw.n):void");
    }

    /* renamed from: j */
    public final void m2724j(int i10, Object obj) throws Throwable {
        Throwable thM12363a = C6364n.m12363a(obj);
        if (thM12363a != null) {
            throw thM12363a;
        }
        throw new TooManyAttemptsException(AbstractC5601a.m11233d(mo2718e().f3778b, " attempts to get a successful response", new StringBuilder("Took more than ")), null, i10, obj instanceof C6363m ? null : obj, C6364n.m12363a(obj));
    }
}
