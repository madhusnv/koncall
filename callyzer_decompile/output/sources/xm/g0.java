package xm;

import android.content.Context;
import fn.C2336i;
import hn.C2984a;
import hn.C2985b;
import k2.C3953b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import uw.C7565i;
import uw.InterfaceC7559c;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a */
    public final Context f40313a;

    /* renamed from: b */
    public final C2336i f40314b;

    /* renamed from: c */
    public final C2984a f40315c;

    /* renamed from: d */
    public final C2985b f40316d;

    /* renamed from: e */
    public final gn.x2 f40317e;

    /* renamed from: f */
    public final C8805t f40318f;

    /* renamed from: g */
    public final k2.e1 f40319g;

    /* renamed from: h */
    public volatile String f40320h;

    /* renamed from: i */
    public String f40321i;

    public g0(Context context, C2336i dataStoreSource, C2984a authTokenDataSource, C2985b remoteDataSource, gn.x2 localDataSource, C8805t c8805t) {
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        AbstractC4154l.m8923f(authTokenDataSource, "authTokenDataSource");
        AbstractC4154l.m8923f(remoteDataSource, "remoteDataSource");
        AbstractC4154l.m8923f(localDataSource, "localDataSource");
        this.f40313a = context;
        this.f40314b = dataStoreSource;
        this.f40315c = authTokenDataSource;
        this.f40316d = remoteDataSource;
        this.f40317e = localDataSource;
        this.f40318f = c8805t;
        this.f40319g = C3953b.m8517t(r4.FromDataStore);
        this.f40320h = "No token available";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15574a(xm.g0 r5, java.lang.String r6, ww.AbstractC8193c r7) throws com.websoptimization.callyzerbiz.data.retrofit.ApiException {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof xm.f0
            if (r0 == 0) goto L16
            r0 = r7
            xm.f0 r0 = (xm.f0) r0
            int r1 = r0.f40273d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f40273d = r1
            goto L1b
        L16:
            xm.f0 r0 = new xm.f0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f40271b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40273d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r5 = r0.f40270a
            og.od.m10798c(r7)
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            og.od.m10798c(r7)
            goto L59
        L3b:
            og.od.m10798c(r7)
            hn.a r7 = r5.f40315c
            r0.f40273d = r4
            ym.a r7 = r7.f16122a
            java.lang.String r2 = "@callyzerbiz.co"
            java.lang.String r2 = com.sun.mail.util.AbstractC1452a.m4561h(r6, r2)
            java.lang.String r4 = "#biz_u$er"
            java.lang.String r6 = com.sun.mail.util.AbstractC1452a.m4561h(r6, r4)
            java.lang.String r4 = "password"
            java.lang.Object r7 = r7.m16066T(r2, r6, r4, r0)
            if (r7 != r1) goto L59
            goto L8b
        L59:
            im.f1 r7 = (im.f1) r7
            boolean r6 = r7 instanceof im.d1
            java.lang.String r2 = "getString(...)"
            r4 = 2131952857(0x7f1304d9, float:1.9542169E38)
            if (r6 == 0) goto L9c
            im.d1 r7 = (im.d1) r7
            java.lang.Object r6 = r7.f17545a
            com.websoptimization.callyzerbiz.data.model.response.AuthTokenResponse r6 = (com.websoptimization.callyzerbiz.data.model.response.AuthTokenResponse) r6
            java.lang.String r6 = r6.m4731a()
            yv.f r7 = yv.C8791f.f42457a
            boolean r7 = yv.C8791f.m16171d(r6)
            if (r7 == 0) goto L8d
            r5.f40320h = r6
            xm.r4 r7 = xm.r4.FromVariable
            r5.m15575b(r7)
            fn.i r5 = r5.f40314b
            r0.f40270a = r6
            r0.f40273d = r3
            java.lang.String r7 = "auth_token"
            java.lang.Object r5 = r5.m6034n(r7, r6, r0)
            if (r5 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r6
        L8d:
            com.websoptimization.callyzerbiz.data.retrofit.ApiException r6 = new com.websoptimization.callyzerbiz.data.retrofit.ApiException
            android.content.Context r5 = r5.f40313a
            java.lang.String r5 = r5.getString(r4)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r2)
            r6.<init>(r5)
            throw r6
        L9c:
            boolean r6 = r7 instanceof im.p0
            if (r6 == 0) goto Laf
            com.websoptimization.callyzerbiz.data.retrofit.ApiException r6 = new com.websoptimization.callyzerbiz.data.retrofit.ApiException
            android.content.Context r5 = r5.f40313a
            java.lang.String r5 = r5.getString(r4)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r2)
            r6.<init>(r5)
            throw r6
        Laf:
            com.websoptimization.callyzerbiz.data.retrofit.ApiException r6 = new com.websoptimization.callyzerbiz.data.retrofit.ApiException
            android.content.Context r5 = r5.f40313a
            java.lang.String r5 = r5.getString(r4)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r2)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.g0.m15574a(xm.g0, java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public final synchronized void m15575b(r4 fromTokenStatus) {
        AbstractC4154l.m8923f(fromTokenStatus, "fromTokenStatus");
        this.f40319g.setValue(fromTokenStatus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15576c(ww.AbstractC8193c r10) throws com.websoptimization.callyzerbiz.data.retrofit.ApiException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.g0.m15576c(ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final String m15577d() {
        String str;
        int i10 = c0.f40186a[((r4) this.f40319g.getValue()).ordinal()];
        if (i10 == 1) {
            return this.f40320h;
        }
        InterfaceC7559c interfaceC7559c = null;
        if (i10 == 2) {
            return (String) tx.c0.m13468D(C7565i.f36440a, new e0(this, interfaceC7559c, 1));
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        synchronized (this) {
            try {
                if (this.f40319g.getValue() == r4.FromVariable) {
                    str = this.f40320h;
                } else {
                    str = (String) tx.c0.m13468D(C7565i.f36440a, new e0(this, interfaceC7559c, 2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
