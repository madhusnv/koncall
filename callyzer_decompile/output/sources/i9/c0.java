package i9;

import nc.InterfaceC4991b;
import og.gf;
import sb.InterfaceC6779f;
import td.C7124a;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements InterfaceC6779f {

    /* renamed from: a */
    public final String f17132a;

    /* renamed from: b */
    public final String f17133b;

    /* renamed from: c */
    public final String f17134c;

    /* renamed from: d */
    public final String f17135d;

    /* renamed from: e */
    public final String f17136e;

    /* renamed from: f */
    public final InterfaceC4991b f17137f;

    /* renamed from: g */
    public final InterfaceC7411o f17138g;

    /* renamed from: h */
    public final C7124a f17139h;

    /* renamed from: j */
    public final l0 f17140j;

    public c0(String str, String str2, String str3, String str4, String str5, InterfaceC4991b interfaceC4991b, InterfaceC7411o interfaceC7411o, int i10) {
        str5 = (i10 & 16) != 0 ? null : str5;
        this.f17132a = str;
        this.f17133b = str2;
        this.f17134c = str3;
        this.f17135d = str4;
        this.f17136e = str5;
        this.f17137f = interfaceC4991b;
        this.f17138g = interfaceC7411o;
        String str6 = str5;
        C7124a c7124a = C7124a.f34340a;
        this.f17139h = c7124a;
        this.f17140j = str6 != null ? new l0(str6, str3, str4, interfaceC4991b, interfaceC7411o, c7124a) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7541a(ww.AbstractC8193c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof i9.a0
            if (r0 == 0) goto L13
            r0 = r5
            i9.a0 r0 = (i9.a0) r0
            int r1 = r0.f17117c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17117c = r1
            goto L18
        L13:
            i9.a0 r0 = new i9.a0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17115a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17117c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f17117c = r3
            java.lang.String r5 = r4.f17134c
            ud.o r2 = r4.f17138g
            java.lang.Object r5 = pg.e6.m11599e(r5, r2, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            i9.d0 r5 = (i9.d0) r5
            td.a r0 = r4.f17139h
            r0.getClass()
            j$.time.format.DateTimeFormatter r0 = td.C7126c.f34342b
            td.c r0 = td.C7124a.m13407e()
            td.c r1 = r5.f17145b
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L55
            return r5
        L55:
            aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException r5 = new aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException
            java.lang.String r0 = "The SSO session has expired. To refresh this SSO session run `aws sso login` with the corresponding profile."
            r1 = 0
            r5.<init>(r0, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.c0.m7541a(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r14, uw.InterfaceC7559c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.c0.resolve(ec.b, uw.c):java.lang.Object");
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
