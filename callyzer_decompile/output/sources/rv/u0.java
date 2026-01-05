package rv;

import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f31909a;

    /* renamed from: b */
    public v0 f31910b;

    /* renamed from: c */
    public Throwable f31911c;

    /* renamed from: d */
    public int f31912d;

    /* renamed from: e */
    public final /* synthetic */ v0 f31913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31913e = v0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new u0(this.f31913e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            rv.v0 r7 = r13.f31913e
            wo.s r8 = r7.f31921h
            java.lang.String r9 = r7.f31928o
            yv.t r10 = r7.f31920g
            vw.a r11 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r0 = r13.f31912d
            r12 = 2
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L25
            if (r0 != r12) goto L1d
            java.lang.Throwable r0 = r13.f31911c
            rv.v0 r7 = r13.f31910b
            og.od.m10798c(r14)
            goto L8f
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            og.od.m10798c(r14)
            r0 = r14
            qw.n r0 = (qw.C6364n) r0
            java.lang.Object r0 = r0.f30758a
            goto L51
        L2e:
            og.od.m10798c(r14)
            wx.w0 r0 = r7.f31923j
            wx.k1 r0 = r0.f39340a
            java.lang.Object r0 = r0.getValue()
            yv.p r0 = (yv.C8801p) r0
            boolean r0 = r0.f42464a
            if (r0 == 0) goto Lb9
            wo.s r0 = r7.f31921h
            java.lang.String r4 = r7.f31928o
            r13.f31912d = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = 7
            r5 = r13
            java.lang.Object r0 = wo.C8134s.m15300o(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r11) goto L51
            goto L8d
        L51:
            boolean r1 = r0 instanceof qw.C6363m
            if (r1 != 0) goto L5d
            r1 = r0
            com.websoptimization.callyzerbiz.data.model.response.SyncResponse r1 = (com.websoptimization.callyzerbiz.data.model.response.SyncResponse) r1
            java.lang.String r1 = "syncCallLogs: success"
            r10.m16232g(r9, r1)
        L5d:
            java.lang.Throwable r1 = qw.C6364n.m12363a(r0)
            if (r1 == 0) goto Lc3
            boolean r2 = r1 instanceof com.websoptimization.callyzerbiz.common.exception.RestApiException
            if (r2 == 0) goto La5
            r2 = r1
            com.websoptimization.callyzerbiz.common.exception.RestApiException r2 = (com.websoptimization.callyzerbiz.common.exception.RestApiException) r2
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "APi exception caught >>> message := "
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r10.m16233h(r9, r3, r1)
            r13.f31909a = r0
            r13.f31910b = r7
            r13.f31911c = r1
            r13.f31912d = r12
            java.lang.Object r0 = r8.m15307j(r2, r13)
            if (r0 != r11) goto L8e
        L8d:
            return r11
        L8e:
            r0 = r1
        L8f:
            com.websoptimization.callyzerbiz.common.exception.RestApiException r0 = (com.websoptimization.callyzerbiz.common.exception.RestApiException) r0
            com.websoptimization.callyzerbiz.common.exception.RestApiException$a r0 = r0.f7325a
            com.websoptimization.callyzerbiz.common.exception.RestApiException$a r1 = com.websoptimization.callyzerbiz.common.exception.RestApiException.EnumC1454a.NETWORK_ERROR
            if (r0 != r1) goto Lc3
            yv.t r1 = r7.f31920g
            java.lang.String r2 = r7.f31928o
            java.lang.String r0 = r0.name()
            java.lang.String r3 = "There is some network error >>  "
            p020v.a1.m14346z(r3, r0, r1, r2)
            goto Lc3
        La5:
            java.lang.String r0 = r1.getMessage()
            java.lang.String r2 = r1.getLocalizedMessage()
            java.lang.String r3 = "syncCallLogs: exception caught :- "
            java.lang.String r4 = " localizedMessage >> "
            java.lang.String r0 = a2.AbstractC0030c.m121l(r3, r0, r4, r2)
            r10.m16233h(r9, r0, r1)
            goto Lc3
        Lb9:
            im.g r0 = im.C3305g.f17555a
            r8.m15308k(r0)
            java.lang.String r0 = "syncCallLogs: No internet connection, unable to sync call logs"
            r10.m16232g(r9, r0)
        Lc3:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
