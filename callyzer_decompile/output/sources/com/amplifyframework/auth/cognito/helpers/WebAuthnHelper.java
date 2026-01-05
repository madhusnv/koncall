package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnCredentialAlreadyExistsException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnNotSupportedException;
import com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnRpMismatchException;
import com.amplifyframework.logging.Logger;
import h6.C2856l;
import h6.InterfaceC2854j;
import i6.AbstractC3174c;
import i6.C3173b;
import i6.C3175d;
import i6.C3176e;
import i6.C3177f;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WebAuthnHelper {
    private final Context context;
    private final InterfaceC2854j credentialManager;
    private final Logger logger;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.helpers.WebAuthnHelper", m15344f = "WebAuthnHelper.kt", m15345l = {87}, m15346m = "createCredential")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$createCredential$1 */
    public static final class C11431 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11431(InterfaceC7559c<? super C11431> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebAuthnHelper.this.createCredential(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.helpers.WebAuthnHelper", m15344f = "WebAuthnHelper.kt", m15345l = {66}, m15346m = "getCredential")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$getCredential$1 */
    public static final class C11441 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11441(InterfaceC7559c<? super C11441> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebAuthnHelper.this.getCredential(null, null, this);
        }
    }

    public WebAuthnHelper(Context context, InterfaceC2854j interfaceC2854j, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 2) != 0) {
            AbstractC4154l.m8923f(context, "context");
            interfaceC2854j = new C2856l(context, false);
        }
        this(context, interfaceC2854j);
    }

    private final WebAuthnCredentialAlreadyExistsException alreadyExists(CreatePublicKeyCredentialException createPublicKeyCredentialException) {
        return new WebAuthnCredentialAlreadyExistsException(createPublicKeyCredentialException);
    }

    private final WebAuthnNotSupportedException notSupported(Exception exc) {
        return new WebAuthnNotSupportedException(exc);
    }

    private final Context resolveContext(WeakReference<Activity> weakReference) {
        Activity activity = weakReference.get();
        if (activity == null) {
            this.logger.warn("No Activity context available when accessing device PassKey. This will result in the system UI appearing in a new Task. We recommend setting the callingActivity option when invoking Amplify Auth APIs if you are using WebAuthn.");
        }
        return activity != null ? activity : this.context;
    }

    private final WebAuthnRpMismatchException rpMismatch(Exception exc) {
        return new WebAuthnRpMismatchException(exc);
    }

    private final AuthException toAuthException(CreateCredentialException createCredentialException) {
        if (createCredentialException instanceof CreateCredentialCancellationException) {
            return userCancelledException(createCredentialException);
        }
        if (!(createCredentialException instanceof CreateCredentialProviderConfigurationException) && !(createCredentialException instanceof CreateCredentialUnsupportedException)) {
            if (!(createCredentialException instanceof CreatePublicKeyCredentialDomException)) {
                return unknownException(createCredentialException);
            }
            AbstractC3174c abstractC3174c = ((CreatePublicKeyCredentialDomException) createCredentialException).f2244b;
            return abstractC3174c instanceof C3176e ? userCancelledException(createCredentialException) : abstractC3174c instanceof C3175d ? alreadyExists((CreatePublicKeyCredentialException) createCredentialException) : abstractC3174c instanceof C3173b ? rpMismatch(createCredentialException) : abstractC3174c instanceof C3177f ? notSupported(createCredentialException) : unknownException(createCredentialException);
        }
        return notSupported(createCredentialException);
    }

    private final WebAuthnFailedException unknownException(CreateCredentialException createCredentialException) {
        return new WebAuthnFailedException("Unable to create the passkey using the Androidx CredentialManager", null, createCredentialException, 2, null);
    }

    private final UserCancelledException userCancelledException(Exception exc) {
        UserCancelledException userCancelledException = new UserCancelledException("User cancelled granting access to PassKey", "Re-show the previous UI and allow user to try again", exc);
        this.logger.verbose("User cancelled the PassKey authorization UI");
        return userCancelledException;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createCredential(java.lang.String r7, android.app.Activity r8, uw.InterfaceC7559c<? super java.lang.String> r9) throws com.amplifyframework.auth.AuthException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.C11431
            if (r0 == 0) goto L13
            r0 = r9
            com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$createCredential$1 r0 = (com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.C11431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$createCredential$1 r0 = new com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$createCredential$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$2
            h6.f r7 = (h6.C2850f) r7
            java.lang.Object r7 = r0.L$1
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            og.od.m10798c(r9)     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            goto L65
        L34:
            r0 = move-exception
            r7 = r0
            goto L80
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            og.od.m10798c(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r9 < r2) goto L85
            h6.f r9 = new h6.f     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            r9.<init>(r7)     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            com.amplifyframework.logging.Logger r7 = r6.logger     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            java.lang.String r2 = "Prompting user to create a PassKey"
            r7.verbose(r2)     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            h6.j r7 = r6.credentialManager     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            r0.L$0 = r4     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            r0.L$1 = r4     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            r0.L$2 = r4     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            r0.label = r3     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            java.lang.Object r9 = r7.m6986a(r8, r9, r0)     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            if (r9 != r1) goto L65
            return r1
        L65:
            h6.c r9 = (h6.AbstractC2847c) r9     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            boolean r7 = r9 instanceof h6.C2851g     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            if (r7 == 0) goto L6e
            r4 = r9
            h6.g r4 = (h6.C2851g) r4     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
        L6e:
            if (r4 == 0) goto L73
            java.lang.String r7 = r4.f15861a     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            return r7
        L73:
            com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException r0 = new com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            java.lang.String r1 = "Android created wrong credential type"
            java.lang.String r2 = "There is a possibility that there is a bug if this error persists. Please take a look at \nhttps://github.com/aws-amplify/amplify-android/issues to see if there are any existing issues that \nmatch your scenario, and file an issue with the details of the bug if there isn't."
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
            throw r0     // Catch: androidx.credentials.exceptions.CreateCredentialException -> L34
        L80:
            com.amplifyframework.auth.AuthException r7 = r6.toAuthException(r7)
            throw r7
        L85:
            com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnNotSupportedException r7 = new com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnNotSupportedException
            java.lang.String r8 = "Passkeys are only supported on API 28 and above"
            r9 = 2
            r7.<init>(r8, r4, r9, r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.createCredential(java.lang.String, android.app.Activity, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCredential(java.lang.String r7, java.lang.ref.WeakReference<android.app.Activity> r8, uw.InterfaceC7559c<? super java.lang.String> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.C11441
            if (r0 == 0) goto L13
            r0 = r9
            com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$getCredential$1 r0 = (com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.C11441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$getCredential$1 r0 = new com.amplifyframework.auth.cognito.helpers.WebAuthnHelper$getCredential$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$3
            h6.s r7 = (h6.C2863s) r7
            java.lang.Object r7 = r0.L$2
            h6.u r7 = (h6.C2865u) r7
            java.lang.Object r7 = r0.L$1
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            og.od.m10798c(r9)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            goto L75
        L38:
            r0 = move-exception
            r7 = r0
            goto L92
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            og.od.m10798c(r9)
            h6.u r9 = new h6.u     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r9.<init>(r7)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            h6.s r7 = new h6.s     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            java.util.List r9 = og.pe.m10833h(r9)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r7.<init>(r9)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            com.amplifyframework.logging.Logger r9 = r6.logger     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            java.lang.String r2 = "Prompting user for PassKey authorization"
            r9.verbose(r2)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            h6.j r9 = r6.credentialManager     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            android.content.Context r8 = r6.resolveContext(r8)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r0.L$0 = r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r0.L$1 = r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r0.L$2 = r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r0.L$3 = r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r0.label = r3     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            r9.getClass()     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            java.lang.Object r9 = h6.InterfaceC2854j.m6985b(r8, r7, r0)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            if (r9 != r1) goto L75
            return r1
        L75:
            h6.t r9 = (h6.C2864t) r9     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            pg.h r7 = r9.f15873a     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            boolean r8 = r7 instanceof h6.C2867w     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            if (r8 == 0) goto L80
            r4 = r7
            h6.w r4 = (h6.C2867w) r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
        L80:
            if (r4 == 0) goto L85
            java.lang.String r7 = r4.f15875a     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            return r7
        L85:
            com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException r0 = new com.amplifyframework.auth.cognito.exceptions.webauthn.WebAuthnFailedException     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            java.lang.String r1 = "Android returned wrong credential type"
            java.lang.String r2 = "There is a possibility that there is a bug if this error persists. Please take a look at \nhttps://github.com/aws-amplify/amplify-android/issues to see if there are any existing issues that \nmatch your scenario, and file an issue with the details of the bug if there isn't."
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
            throw r0     // Catch: androidx.credentials.exceptions.GetCredentialException -> L38
        L92:
            com.amplifyframework.auth.AuthException r7 = r6.toAuthException(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.helpers.WebAuthnHelper.getCredential(java.lang.String, java.lang.ref.WeakReference, uw.c):java.lang.Object");
    }

    private final WebAuthnFailedException unknownException(GetCredentialException getCredentialException) {
        return new WebAuthnFailedException("Unable to retrieve the passkey from the Androidx CredentialManager", null, getCredentialException, 2, null);
    }

    public WebAuthnHelper(Context context, InterfaceC2854j credentialManager) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(credentialManager, "credentialManager");
        this.context = context;
        this.credentialManager = credentialManager;
        this.logger = AuthLogger.authLogger(this);
    }

    private final AuthException toAuthException(GetCredentialException getCredentialException) {
        if (getCredentialException instanceof GetCredentialCancellationException) {
            return userCancelledException(getCredentialException);
        }
        if (!(getCredentialException instanceof GetCredentialProviderConfigurationException) && !(getCredentialException instanceof GetCredentialUnsupportedException)) {
            if (getCredentialException instanceof GetPublicKeyCredentialDomException) {
                AbstractC3174c abstractC3174c = ((GetPublicKeyCredentialDomException) getCredentialException).f2247b;
                return abstractC3174c instanceof C3176e ? userCancelledException(getCredentialException) : abstractC3174c instanceof C3173b ? rpMismatch(getCredentialException) : abstractC3174c instanceof C3177f ? notSupported(getCredentialException) : unknownException(getCredentialException);
            }
            return unknownException(getCredentialException);
        }
        return notSupported(getCredentialException);
    }
}
