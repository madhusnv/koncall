package oa;

import jc.InterfaceC3738n;
import og.ad;
import qc.C6167m;
import qc.C6169o;
import qc.C6170p;
import qd.InterfaceC6187g;
import uc.C7394a;
import uw.InterfaceC7559c;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oa.c */
/* loaded from: classes.dex */
public final class C5331c implements InterfaceC8909c {

    /* renamed from: a */
    public static final C5331c f26228a = new C5331c();

    /* renamed from: a */
    public static void m10475a(InterfaceC6187g interfaceC6187g, C7394a c7394a) {
        if (interfaceC6187g == null || c7394a == null) {
            return;
        }
        InterfaceC3738n interfaceC3738n = c7394a.f35159b;
        String str = (String) interfaceC3738n.get("x-amz-request-id");
        if (str != null) {
            ad.m10530b(interfaceC6187g, "aws.request_id", str);
        }
        String str2 = (String) interfaceC3738n.get("x-amz-id-2");
        if (str2 != null) {
            ad.m10530b(interfaceC6187g, "aws.extended_request_id", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo16556modifyBeforeAttemptCompletiongIAlus(zb.InterfaceC8916j r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof oa.C5329a
            if (r0 == 0) goto L13
            r0 = r6
            oa.a r0 = (oa.C5329a) r0
            int r1 = r0.f26224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26224c = r1
            goto L1a
        L13:
            oa.a r0 = new oa.a
            ww.c r6 = (ww.AbstractC8193c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f26222a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26224c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            og.od.m10798c(r6)
            qw.n r6 = (qw.C6364n) r6
            java.lang.Object r5 = r6.f30758a
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r6)
            r6 = r5
            qc.k r6 = (qc.C6165k) r6
            uc.a r6 = r6.f30042d
            uw.h r2 = r0.getContext()
            qd.g r2 = og.zc.m11093a(r2)
            m10475a(r2, r6)
            r0.f26224c = r3
            qc.k r5 = (qc.C6165k) r5
            java.lang.Object r5 = r5.f30040b
            if (r5 != r1) goto L51
            return r1
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.C5331c.mo16556modifyBeforeAttemptCompletiongIAlus(zb.j, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo16557modifyBeforeCompletiongIAlus(zb.InterfaceC8916j r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof oa.C5330b
            if (r0 == 0) goto L13
            r0 = r6
            oa.b r0 = (oa.C5330b) r0
            int r1 = r0.f26227c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26227c = r1
            goto L1a
        L13:
            oa.b r0 = new oa.b
            ww.c r6 = (ww.AbstractC8193c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f26225a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26227c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            og.od.m10798c(r6)
            qw.n r6 = (qw.C6364n) r6
            java.lang.Object r5 = r6.f30758a
            return r5
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r6)
            r6 = r5
            qc.l r6 = (qc.C6166l) r6
            uc.a r6 = r6.f30047d
            uw.h r2 = r0.getContext()
            qd.g r2 = og.zc.m11093a(r2)
            m10475a(r2, r6)
            r0.f26227c = r3
            qc.l r5 = (qc.C6166l) r5
            java.lang.Object r5 = r5.f30045b
            if (r5 != r1) goto L51
            return r1
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.C5331c.mo16557modifyBeforeCompletiongIAlus(zb.j, uw.c):java.lang.Object");
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c interfaceC7559c) {
        return ((C6170p) interfaceC8914h).f30062c;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c interfaceC7559c) {
        return ((C6167m) interfaceC8915i).f30049a;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterExecution(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
    }
}
