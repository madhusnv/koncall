package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import sb.InterfaceC6777d;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CognitoCredentialsProvider implements AuthCredentialsProvider {
    private final AuthCategory authCategory;

    @InternalAmplifyApi
    public CognitoCredentialsProvider(AuthCategory authCategory) {
        AbstractC4154l.m8923f(authCategory, "authCategory");
        this.authCategory = authCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$3(Consumer consumer, Consumer consumer2, AuthSession session) {
        AbstractC4154l.m8923f(session, "session");
        AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(session);
        String accessToken = aWSAuthSession != null ? aWSAuthSession.getAccessToken() : null;
        if (accessToken != null) {
            consumer2.accept(accessToken);
        } else {
            consumer.accept(new AuthException("Token is null", "Token received but is null. Check if you are signed in", null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$4(Consumer consumer, AuthException it) {
        AbstractC4154l.m8923f(it, "it");
        consumer.accept(it);
    }

    public static Object getIdentityId$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, InterfaceC7559c<? super String> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                AuthSessionResult<String> identityIdResult;
                String value;
                AbstractC4154l.m8923f(authSession, "authSession");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                if (aWSAuthSession == null || (identityIdResult = aWSAuthSession.getIdentityIdResult()) == null || (value = identityIdResult.getValue()) == null) {
                    c7566j.resumeWith(od.m10796a(new AuthException("Failed to get identity ID. Check if you are signed in and configured identity pools correctly.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null)));
                } else {
                    c7566j.resumeWith(value);
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public static Object resolve$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, InterfaceC2004b interfaceC2004b, InterfaceC7559c<? super InterfaceC6777d> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                AuthSessionResult<AWSCredentials> awsCredentialsResult;
                AuthSessionResult<AWSCredentials> awsCredentialsResult2;
                AWSCredentials value;
                AbstractC4154l.m8923f(authSession, "authSession");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                if (aWSAuthSession != null && (awsCredentialsResult2 = aWSAuthSession.getAwsCredentialsResult()) != null && (value = awsCredentialsResult2.getValue()) != null) {
                    c7566j.resumeWith(AWSCredentialsKt.toSdkCredentials(value));
                    return;
                }
                InterfaceC7559c<InterfaceC6777d> interfaceC7559c2 = c7566j;
                AWSAuthSessionBehavior aWSAuthSession2 = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                interfaceC7559c2.resumeWith(od.m10796a(new AuthException("Failed to get credentials. Check if you are signed in and configured identity pools correctly.", "Sorry, we don’t have a recovery suggestion for this error.", (aWSAuthSession2 == null || (awsCredentialsResult = aWSAuthSession2.getAwsCredentialsResult()) == null) ? null : awsCredentialsResult.getError())));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public void getAccessToken(Consumer<String> onResult, Consumer<Exception> onFailure) {
        AbstractC4154l.m8923f(onResult, "onResult");
        AbstractC4154l.m8923f(onFailure, "onFailure");
        int i10 = 0;
        this.authCategory.fetchAuthSession(new C0988a(i10, onFailure, onResult), new C0989b(i10, onFailure));
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public Object getIdentityId(InterfaceC7559c<? super String> interfaceC7559c) {
        return getIdentityId$suspendImpl(this, interfaceC7559c);
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider, vc.InterfaceC7700c
    public Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c<? super InterfaceC6777d> interfaceC7559c) {
        return resolve$suspendImpl(this, interfaceC2004b, interfaceC7559c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CognitoCredentialsProvider() {
        AuthCategory Auth = Amplify.Auth;
        AbstractC4154l.m8922e(Auth, "Auth");
        this(Auth);
    }
}
