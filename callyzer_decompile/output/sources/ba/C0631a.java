package ba;

import sc.InterfaceC6789i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.a */
/* loaded from: classes.dex */
public final class C0631a implements InterfaceC6789i {

    /* renamed from: a */
    public final /* synthetic */ int f4101a;

    public /* synthetic */ C0631a(int i10) {
        this.f4101a = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1807b(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1807b(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1808c(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Lcd
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> Lbe
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> Lbe
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto Lb3
            int r3 = r2.hashCode()
            switch(r3) {
                case -1416998079: goto La5;
                case -392923018: goto L97;
                case -344619019: goto L89;
                case -26861384: goto L7b;
                case 504305508: goto L6d;
                case 1384808312: goto L5f;
                case 1674340573: goto L51;
                case 1821306386: goto L41;
                case 1937518204: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Lb3
        L31:
            java.lang.String r3 = "PasswordResetRequiredException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto Lb3
        L3b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException r5 = ba.AbstractC0637g.m1850v(r5, r6, r7)
            goto Lba
        L41:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto Lb3
        L4b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto Lba
        L51:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5a
            goto Lb3
        L5a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto Lba
        L5f:
            java.lang.String r3 = "TooManyRequestsException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L68
            goto Lb3
        L68:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException r5 = fb.AbstractC2252z.m5952c(r5, r6, r7)
            goto Lba
        L6d:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L76
            goto Lb3
        L76:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto Lba
        L7b:
            java.lang.String r3 = "UserNotConfirmedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L84
            goto Lb3
        L84:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException r5 = fb.AbstractC2252z.m5956g(r5, r6, r7)
            goto Lba
        L89:
            java.lang.String r3 = "UserNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L92
            goto Lb3
        L92:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException r5 = fb.AbstractC2252z.m5957h(r5, r6, r7)
            goto Lba
        L97:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La0
            goto Lb3
        La0:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto Lba
        La5:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lae
            goto Lb3
        Lae:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto Lba
        Lb3:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        Lba:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        Lbe:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Lcd:
            eb.a1 r5 = new eb.a1
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1808c(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1809d(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Lad
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> L9e
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> L9e
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto L93
            int r3 = r2.hashCode()
            switch(r3) {
                case -1818544159: goto L85;
                case -1416998079: goto L77;
                case -392923018: goto L69;
                case 504305508: goto L5b;
                case 1384808312: goto L4d;
                case 1674340573: goto L3f;
                case 1821306386: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L93
        L31:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            goto L93
        L3a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto L9a
        L3f:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L93
        L48:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto L9a
        L4d:
            java.lang.String r3 = "TooManyRequestsException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L56
            goto L93
        L56:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException r5 = fb.AbstractC2252z.m5952c(r5, r6, r7)
            goto L9a
        L5b:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L93
        L64:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto L9a
        L69:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            goto L93
        L72:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto L9a
        L77:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L80
            goto L93
        L80:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto L9a
        L85:
            java.lang.String r3 = "LimitExceededException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8e
            goto L93
        L8e:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.LimitExceededException r5 = ba.AbstractC0637g.m1847s(r5, r6, r7)
            goto L9a
        L93:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        L9a:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        L9e:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Lad:
            eb.c1 r5 = new eb.c1
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1809d(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1810e(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Ldd
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> Lce
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> Lce
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> Lce
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto Lc3
            int r3 = r2.hashCode()
            switch(r3) {
                case -1416998079: goto Lb5;
                case -392923018: goto La7;
                case -344619019: goto L99;
                case -26861384: goto L8b;
                case 504305508: goto L7d;
                case 1384808312: goto L6f;
                case 1674340573: goto L61;
                case 1821306386: goto L51;
                case 1937518204: goto L41;
                case 2130594583: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Lc3
        L31:
            java.lang.String r3 = "InvalidUserPoolConfigurationException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto Lc3
        L3b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidUserPoolConfigurationException r5 = ba.AbstractC0637g.m1846r(r5, r6, r7)
            goto Lca
        L41:
            java.lang.String r3 = "PasswordResetRequiredException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto Lc3
        L4b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException r5 = ba.AbstractC0637g.m1850v(r5, r6, r7)
            goto Lca
        L51:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Lc3
        L5b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto Lca
        L61:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6a
            goto Lc3
        L6a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto Lca
        L6f:
            java.lang.String r3 = "TooManyRequestsException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            goto Lc3
        L78:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException r5 = fb.AbstractC2252z.m5952c(r5, r6, r7)
            goto Lca
        L7d:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L86
            goto Lc3
        L86:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto Lca
        L8b:
            java.lang.String r3 = "UserNotConfirmedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L94
            goto Lc3
        L94:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException r5 = fb.AbstractC2252z.m5956g(r5, r6, r7)
            goto Lca
        L99:
            java.lang.String r3 = "UserNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La2
            goto Lc3
        La2:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException r5 = fb.AbstractC2252z.m5957h(r5, r6, r7)
            goto Lca
        La7:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb0
            goto Lc3
        Lb0:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto Lca
        Lb5:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbe
            goto Lc3
        Lbe:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto Lca
        Lc3:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        Lca:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        Lce:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Ldd:
            eb.r1 r5 = new eb.r1
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1810e(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1811f(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1811f(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1812g(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1812g(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1813h(bd.C0645a r17, pc.C5884l r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1813h(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1814i(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Lbd
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> Lae
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> Lae
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto La3
            int r3 = r2.hashCode()
            switch(r3) {
                case -1416998079: goto L95;
                case -392923018: goto L87;
                case -26861384: goto L79;
                case 504305508: goto L6b;
                case 1384808312: goto L5d;
                case 1674340573: goto L4f;
                case 1821306386: goto L41;
                case 1937518204: goto L31;
                default: goto L2f;
            }
        L2f:
            goto La3
        L31:
            java.lang.String r3 = "PasswordResetRequiredException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto La3
        L3b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException r5 = ba.AbstractC0637g.m1850v(r5, r6, r7)
            goto Laa
        L41:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            goto La3
        L4a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto Laa
        L4f:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto La3
        L58:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto Laa
        L5d:
            java.lang.String r3 = "TooManyRequestsException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L66
            goto La3
        L66:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException r5 = fb.AbstractC2252z.m5952c(r5, r6, r7)
            goto Laa
        L6b:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            goto La3
        L74:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto Laa
        L79:
            java.lang.String r3 = "UserNotConfirmedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L82
            goto La3
        L82:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException r5 = fb.AbstractC2252z.m5956g(r5, r6, r7)
            goto Laa
        L87:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L90
            goto La3
        L90:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto Laa
        L95:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            goto La3
        L9e:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto Laa
        La3:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        Laa:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        Lae:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Lbd:
            eb.c2 r5 = new eb.c2
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1814i(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1815j(bd.C0645a r10, pc.C5884l r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1815j(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1816k(bd.C0645a r17, pc.C5884l r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1816k(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1817l(bd.C0645a r19, pc.C5884l r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1817l(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1818m(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1818m(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1819n(bd.C0645a r10, pc.C5884l r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1819n(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1820o(bd.C0645a r11, pc.C5884l r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1820o(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1821p(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Lbd
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> Lae
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> Lae
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto La3
            int r3 = r2.hashCode()
            switch(r3) {
                case -1416998079: goto L95;
                case -392923018: goto L87;
                case -344619019: goto L79;
                case -26861384: goto L6b;
                case 504305508: goto L5d;
                case 1674340573: goto L4f;
                case 1821306386: goto L41;
                case 1937518204: goto L31;
                default: goto L2f;
            }
        L2f:
            goto La3
        L31:
            java.lang.String r3 = "PasswordResetRequiredException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto La3
        L3b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException r5 = ba.AbstractC0637g.m1850v(r5, r6, r7)
            goto Laa
        L41:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            goto La3
        L4a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto Laa
        L4f:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto La3
        L58:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto Laa
        L5d:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L66
            goto La3
        L66:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto Laa
        L6b:
            java.lang.String r3 = "UserNotConfirmedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            goto La3
        L74:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException r5 = fb.AbstractC2252z.m5956g(r5, r6, r7)
            goto Laa
        L79:
            java.lang.String r3 = "UserNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L82
            goto La3
        L82:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException r5 = fb.AbstractC2252z.m5957h(r5, r6, r7)
            goto Laa
        L87:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L90
            goto La3
        L90:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto Laa
        L95:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9e
            goto La3
        L9e:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto Laa
        La3:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        Laa:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        Lae:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Lbd:
            eb.w2 r5 = new eb.w2
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1821p(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1822q(bd.C0645a r9, pc.C5884l r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1822q(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1823r(bd.C0645a r10, pc.C5884l r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1823r(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1824s(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r6, r0)
            uc.a r0 = r6.f28691b
            jc.h0 r1 = r0.f35158a
            boolean r1 = pg.h8.m11686e(r1)
            if (r1 != 0) goto Ldd
            uc.a r1 = pg.j6.m11710b(r0, r7)
            pc.l r6 = pc.C5884l.m11501b(r6, r1)
            fd.i r2 = wb.AbstractC7966a.f38328a     // Catch: java.lang.Exception -> Lce
            jc.n r0 = r0.f35159b     // Catch: java.lang.Exception -> Lce
            vb.d r0 = wb.AbstractC7966a.m15142a(r0, r7)     // Catch: java.lang.Exception -> Lce
            java.lang.String r2 = r0.f37202a
            if (r2 == 0) goto Lc3
            int r3 = r2.hashCode()
            switch(r3) {
                case -1416998079: goto Lb5;
                case -392923018: goto La7;
                case -344619019: goto L99;
                case -26861384: goto L8b;
                case 504305508: goto L7d;
                case 1384808312: goto L6f;
                case 1674340573: goto L61;
                case 1821306386: goto L51;
                case 1937518204: goto L41;
                case 2130594583: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Lc3
        L31:
            java.lang.String r3 = "InvalidUserPoolConfigurationException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            goto Lc3
        L3b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidUserPoolConfigurationException r5 = ba.AbstractC0637g.m1846r(r5, r6, r7)
            goto Lca
        L41:
            java.lang.String r3 = "PasswordResetRequiredException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto Lc3
        L4b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException r5 = ba.AbstractC0637g.m1850v(r5, r6, r7)
            goto Lca
        L51:
            java.lang.String r3 = "ResourceNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5b
            goto Lc3
        L5b:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException r5 = ba.AbstractC0637g.m1851w(r5, r6, r7)
            goto Lca
        L61:
            java.lang.String r3 = "InvalidParameterException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6a
            goto Lc3
        L6a:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException r5 = ba.AbstractC0637g.m1842n(r5, r6, r7)
            goto Lca
        L6f:
            java.lang.String r3 = "TooManyRequestsException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            goto Lc3
        L78:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException r5 = fb.AbstractC2252z.m5952c(r5, r6, r7)
            goto Lca
        L7d:
            java.lang.String r3 = "InternalErrorException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L86
            goto Lc3
        L86:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException r5 = ba.AbstractC0637g.m1839k(r5, r6, r7)
            goto Lca
        L8b:
            java.lang.String r3 = "UserNotConfirmedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L94
            goto Lc3
        L94:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException r5 = fb.AbstractC2252z.m5956g(r5, r6, r7)
            goto Lca
        L99:
            java.lang.String r3 = "UserNotFoundException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La2
            goto Lc3
        La2:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException r5 = fb.AbstractC2252z.m5957h(r5, r6, r7)
            goto Lca
        La7:
            java.lang.String r3 = "ForbiddenException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb0
            goto Lc3
        Lb0:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException r5 = ba.AbstractC0637g.m1838j(r5, r6, r7)
            goto Lca
        Lb5:
            java.lang.String r3 = "NotAuthorizedException"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbe
            goto Lc3
        Lbe:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException r5 = ba.AbstractC0637g.m1848t(r5, r6, r7)
            goto Lca
        Lc3:
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r5 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r6 = r0.f37203b
            r5.<init>(r6)
        Lca:
            pg.i6.m11695a(r5, r1, r0)
            throw r5
        Lce:
            r5 = move-exception
            aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException r7 = new aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException
            java.lang.String r0 = "Failed to parse response as 'awsJson1_1' error"
            r7.<init>(r0, r5)
            uc.a r5 = r6.f28691b
            r6 = 0
            pg.i6.m11695a(r7, r5, r6)
            throw r7
        Ldd:
            eb.g3 r5 = new eb.g3
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1824s(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1825t(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1825t(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1826u(bd.C0645a r10, pc.C5884l r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1826u(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1827v(bd.C0645a r5, pc.C5884l r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1827v(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1828w(bd.C0645a r7, pc.C5884l r8, byte[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r0)
            java.lang.String r7 = "call"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r8, r7)
            uc.a r7 = r8.f28691b
            jc.h0 r8 = r7.f35158a
            boolean r0 = pg.h8.m11686e(r8)
            r1 = 0
            if (r0 != 0) goto Laa
            java.util.Set r0 = i9.AbstractC3191i.f17182a
            jc.n r7 = r7.f35159b
            java.lang.String r0 = "Content-Type"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r0 = "application/json"
            boolean r7 = kotlin.jvm.internal.AbstractC4154l.m8918a(r7, r0)
            r0 = 0
            if (r7 == 0) goto L3b
            if (r9 != 0) goto L2b
            goto L3b
        L2b:
            hd.c r7 = new hd.c
            r7.<init>(r9)
            pg.d6 r7 = pg.c6.m11564b(r7)
            boolean r9 = r7 instanceof i9.C3200r
            if (r9 == 0) goto L3b
            r0 = r7
            i9.r r0 = (i9.C3200r) r0
        L3b:
            if (r0 == 0) goto L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "code="
            r7.<init>(r9)
            java.lang.String r9 = r0.f17249a
            r7.append(r9)
            java.lang.String r9 = "; message="
            r7.append(r9)
            java.lang.String r9 = r0.f17250b
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            if (r7 != 0) goto L67
        L59:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "HTTP "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
        L67:
            aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException r9 = new aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException
            java.lang.String r0 = "Error retrieving credentials from container service: "
            java.lang.String r7 = i0.m0.m7378k(r0, r7)
            r9.<init>(r7, r1)
            aws.smithy.kotlin.runtime.a r7 = r9.f3498a
            ec.c r0 = r7.f3503a
            ec.a r2 = aws.smithy.kotlin.runtime.C0488a.f3502d
            jc.h0 r3 = jc.h0.f19572g
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r8, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.mo1862b(r2, r3)
            ec.c r7 = r7.f3503a
            ec.a r0 = aws.smithy.kotlin.runtime.C0488a.f3501c
            java.lang.Object r2 = r7.mo1864e(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L96
            boolean r2 = r2.booleanValue()
            goto L97
        L96:
            r2 = r1
        L97:
            if (r2 != 0) goto La1
            jc.g0 r8 = pg.h8.m11682a(r8)
            jc.g0 r2 = jc.g0.SERVER_ERROR
            if (r8 != r2) goto La2
        La1:
            r1 = 1
        La2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7.mo1862b(r0, r8)
            throw r9
        Laa:
            if (r9 == 0) goto Ld4
            hd.c r7 = new hd.c
            r7.<init>(r9)
            pg.d6 r7 = pg.c6.m11564b(r7)
            boolean r8 = r7 instanceof i9.C3201s
            if (r8 == 0) goto Lcc
            i9.s r7 = (i9.C3201s) r7
            java.lang.String r0 = r7.f17260a
            java.lang.String r1 = r7.f17261b
            java.lang.String r2 = r7.f17262c
            td.c r3 = r7.f17263d
            java.lang.String r4 = "EcsContainer"
            java.lang.String r5 = r7.f17264e
            sb.e r7 = pg.x7.m11930a(r0, r1, r2, r3, r4, r5)
            return r7
        Lcc:
            aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException r7 = new aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException
            java.lang.String r8 = "HTTP credentials response was not of expected format"
            r7.<init>(r8, r1)
            throw r7
        Ld4:
            aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException r7 = new aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException
            java.lang.String r8 = "HTTP credentials response did not contain a payload"
            r7.<init>(r8, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.m1828w(bd.a, pc.l, byte[]):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0bec  */
    @Override // sc.InterfaceC6789i
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1829a(bd.C0645a r26, pc.C5884l r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C0631a.mo1829a(bd.a, pc.l, byte[]):java.lang.Object");
    }
}
