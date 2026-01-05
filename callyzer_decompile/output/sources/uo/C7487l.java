package uo;

import android.content.Context;
import hn.C2987d;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uo.l */
/* loaded from: classes3.dex */
public final class C7487l {

    /* renamed from: a */
    public final C2987d f36153a;

    /* renamed from: b */
    public final C8805t f36154b;

    /* renamed from: c */
    public final Context f36155c;

    public C7487l(C2987d remoteDataSource, C8805t c8805t, Context context, int i10) {
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
                this.f36153a = remoteDataSource;
                this.f36154b = c8805t;
                this.f36155c = context;
                break;
            default:
                AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
                this.f36153a = remoteDataSource;
                this.f36154b = c8805t;
                this.f36155c = context;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14287a(java.lang.String r5, java.lang.String r6, ww.AbstractC8193c r7) throws com.websoptimization.callyzerbiz.data.retrofit.ApiException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7487l.m14287a(java.lang.String, java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14288b(com.websoptimization.callyzerbiz.data.model.request.SendOTPRequest r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xm.s4
            if (r0 == 0) goto L13
            r0 = r8
            xm.s4 r0 = (xm.s4) r0
            int r1 = r0.f40832d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40832d = r1
            goto L18
        L13:
            xm.s4 r0 = new xm.s4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f40830b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40832d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.websoptimization.callyzerbiz.data.model.request.SendOTPRequest r7 = r0.f40829a
            og.od.m10798c(r8)
            goto L9e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            og.od.m10798c(r8)
            r0.f40829a = r7
            r0.f40832d = r3
            hn.d r8 = r6.f36153a
            ym.a r8 = r8.f16127a
            java.lang.String r2 = r7.f7362a
            qw.k r3 = new qw.k
            java.lang.String r4 = "DCC"
            r3.<init>(r4, r2)
            qw.k[] r2 = new qw.C6361k[]{r3}
            java.util.LinkedHashMap r2 = rw.AbstractC6674x.m12779g(r2)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r4 = "sim1Mobile"
            java.lang.String r5 = r7.m4684b()
            r3.put(r4, r5)
            java.lang.String r4 = "sim1EmpName"
            java.lang.String r5 = r7.m4685c()
            r3.put(r4, r5)
            java.lang.String r4 = "sim1EmpCode"
            java.lang.String r5 = r7.m4683a()
            r3.put(r4, r5)
            java.lang.String r4 = r7.m4687e()
            if (r4 == 0) goto L97
            java.lang.String r4 = "sim2Mobile"
            java.lang.String r5 = r7.m4687e()
            r3.put(r4, r5)
            java.lang.String r4 = r7.m4688f()
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            java.lang.String r5 = "sim2EmpName"
            r3.put(r5, r4)
            java.lang.String r4 = r7.m4686d()
            if (r4 == 0) goto L97
            java.lang.String r4 = "sim2EmpCode"
            java.lang.String r5 = r7.m4686d()
            r3.put(r4, r5)
        L97:
            java.lang.Object r8 = r8.m16069b(r2, r3, r0)
            if (r8 != r1) goto L9e
            return r1
        L9e:
            im.f1 r8 = (im.f1) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request :- "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " \n response: "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            yv.t r8 = r6.f36154b
            java.lang.String r0 = "TwoFactorVerificationRepository : "
            r8.m16232g(r0, r7)
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7487l.m14288b(com.websoptimization.callyzerbiz.data.model.request.SendOTPRequest, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m14289c(com.websoptimization.callyzerbiz.data.model.request.VerifyOTPRequest r7, ww.AbstractC8193c r8) throws com.websoptimization.callyzerbiz.data.retrofit.ApiException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7487l.m14289c(com.websoptimization.callyzerbiz.data.model.request.VerifyOTPRequest, ww.c):java.lang.Object");
    }
}
