package i9;

import nc.InterfaceC4991b;
import sb.InterfaceC6775b;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 implements InterfaceC6775b {

    /* renamed from: a */
    public final InterfaceC7411o f17280a;

    /* renamed from: b */
    public final InterfaceC4991b f17281b;

    /* renamed from: c */
    public final String f17282c;

    public u0(String str, InterfaceC4991b interfaceC4991b, InterfaceC7411o interfaceC7411o) {
        this.f17280a = interfaceC7411o;
        this.f17281b = interfaceC4991b;
        this.f17282c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r14, uw.InterfaceC7559c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof i9.t0
            if (r0 == 0) goto L13
            r0 = r15
            i9.t0 r0 = (i9.t0) r0
            int r1 = r0.f17275c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17275c = r1
            goto L1a
        L13:
            i9.t0 r0 = new i9.t0
            ww.c r15 = (ww.AbstractC8193c) r15
            r0.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r0.f17273a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17275c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            og.od.m10798c(r15)
            goto L79
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            og.od.m10798c(r15)
            int r15 = ox.C5770a.f28335d
            r15 = 900(0x384, float:1.261E-42)
            ox.c r2 = ox.EnumC5772c.SECONDS
            long r9 = og.bb.m10551g(r15, r2)
            gc.b r15 = ea.AbstractC1976f.f9255n
            ud.o r11 = r13.f17280a
            java.lang.Object r2 = gc.AbstractC2562f.m6572a(r15, r11)
            r4 = 0
            r5 = 96
            java.lang.String r6 = "`, or set the JVM system property `"
            if (r2 == 0) goto L9d
            java.lang.String r2 = (java.lang.String) r2
            gc.b r15 = ea.AbstractC1976f.f9257p
            java.lang.Object r7 = gc.AbstractC2562f.m6572a(r15, r11)
            if (r7 == 0) goto L82
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r15 = r13.f17282c
            if (r15 != 0) goto L66
            gc.b r15 = ea.AbstractC1976f.f9245d
            java.lang.Object r15 = gc.AbstractC2562f.m6572a(r15, r11)
            java.lang.String r15 = (java.lang.String) r15
        L66:
            r7 = r15
            i9.s0 r4 = new i9.s0
            r8 = 0
            nc.b r12 = r13.f17281b
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            r0.f17275c = r3
            java.lang.Object r15 = r4.resolve(r14, r0)
            if (r15 != r1) goto L79
            return r1
        L79:
            sb.d r15 = (sb.InterfaceC6777d) r15
            pa.a$a r14 = pa.EnumC5867a.a.CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN
            sb.d r14 = og.mb.m10761b(r15, r14)
            return r14
        L82:
            aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException r14 = new aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field `webIdentityTokenFilePath` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `"
            r0.<init>(r1)
            java.lang.String r1 = r15.f13959c
            r0.append(r1)
            r0.append(r6)
            java.lang.String r15 = r15.f13958b
            java.lang.String r15 = a2.AbstractC0030c.m123n(r0, r15, r5)
            r14.<init>(r15, r4)
            throw r14
        L9d:
            aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException r14 = new aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field `roleArn` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `"
            r0.<init>(r1)
            java.lang.String r1 = r15.f13959c
            r0.append(r1)
            r0.append(r6)
            java.lang.String r15 = r15.f13958b
            java.lang.String r15 = a2.AbstractC0030c.m123n(r0, r15, r5)
            r14.<init>(r15, r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.u0.resolve(ec.b, uw.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
