package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import p001o.a0f;
import p001o.n64;
import p001o.n75;
import p001o.qx0;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public class CognitoCredentialsProvider implements AuthCredentialsProvider {
    private final AuthCategory authCategory;

    @InternalAmplifyApi
    public CognitoCredentialsProvider(AuthCategory authCategory) {
        sq8.m48649h(authCategory, "authCategory");
        this.authCategory = authCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$3(Consumer consumer, Consumer consumer2, AuthSession authSession) {
        sq8.m48649h(consumer, "$onFailure");
        sq8.m48649h(consumer2, "$onResult");
        sq8.m48649h(authSession, OutcomeEventsTable.COLUMN_NAME_SESSION);
        AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
        y3i y3iVar = null;
        String accessToken = aWSAuthSession != null ? aWSAuthSession.getAccessToken() : null;
        if (accessToken != null) {
            consumer2.accept(accessToken);
            y3iVar = y3i.f54824a;
        }
        if (y3iVar == null) {
            consumer.accept(new AuthException("Token is null", "Token received but is null. Check if you are signed in", null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAccessToken$lambda$4(Consumer consumer, AuthException authException) {
        sq8.m48649h(consumer, "$onFailure");
        sq8.m48649h(authException, "it");
        consumer.accept(authException);
    }

    public static /* synthetic */ Object getIdentityId$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                y3i y3iVar;
                AuthSessionResult<String> identityIdResult;
                String value;
                sq8.m48649h(authSession, "authSession");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                if (aWSAuthSession == null || (identityIdResult = aWSAuthSession.getIdentityIdResult()) == null || (value = identityIdResult.getValue()) == null) {
                    y3iVar = null;
                } else {
                    a0fVar.resumeWith(vre.m53351b(value));
                    y3iVar = y3i.f54824a;
                }
                if (y3iVar == null) {
                    n64 n64Var2 = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var2.resumeWith(vre.m53351b(wre.m54933a(new AuthException("Failed to get identity ID. Check if you are signed in and configured identity pools correctly.", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null))));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$getIdentityId$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public static /* synthetic */ Object resolve$suspendImpl(CognitoCredentialsProvider cognitoCredentialsProvider, qx0 qx0Var, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        cognitoCredentialsProvider.authCategory.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                y3i y3iVar;
                AuthSessionResult<AWSCredentials> awsCredentialsResult;
                AuthSessionResult<AWSCredentials> awsCredentialsResult2;
                AWSCredentials value;
                sq8.m48649h(authSession, "authSession");
                AWSAuthSessionBehavior aWSAuthSession = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                AuthException error = null;
                if (aWSAuthSession == null || (awsCredentialsResult2 = aWSAuthSession.getAwsCredentialsResult()) == null || (value = awsCredentialsResult2.getValue()) == null) {
                    y3iVar = null;
                } else {
                    n64 n64Var2 = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var2.resumeWith(vre.m53351b(AWSCredentialsKt.toSdkCredentials(value)));
                    y3iVar = y3i.f54824a;
                }
                if (y3iVar == null) {
                    n64 n64Var3 = a0fVar;
                    AWSAuthSessionBehavior aWSAuthSession2 = CognitoCredentialsProviderKt.toAWSAuthSession(authSession);
                    if (aWSAuthSession2 != null && (awsCredentialsResult = aWSAuthSession2.getAwsCredentialsResult()) != null) {
                        error = awsCredentialsResult.getError();
                    }
                    AuthException authException = new AuthException("Failed to get credentials. Check if you are signed in and configured identity pools correctly.", "Sorry, we don’t have a recovery suggestion for this error.", error);
                    vre.C17665a c17665a2 = vre.f50797b;
                    n64Var3.resumeWith(vre.m53351b(wre.m54933a(authException)));
                }
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.CognitoCredentialsProvider$resolve$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public void getAccessToken(final Consumer<String> consumer, final Consumer<Exception> consumer2) {
        sq8.m48649h(consumer, "onResult");
        sq8.m48649h(consumer2, "onFailure");
        this.authCategory.fetchAuthSession(new Consumer() { // from class: o.xf3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                CognitoCredentialsProvider.getAccessToken$lambda$3(consumer2, consumer, (AuthSession) obj);
            }
        }, new Consumer() { // from class: o.yf3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                CognitoCredentialsProvider.getAccessToken$lambda$4(consumer2, (AuthException) obj);
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider
    public Object getIdentityId(n64 n64Var) {
        return getIdentityId$suspendImpl(this, n64Var);
    }

    @Override // com.amplifyframework.auth.AuthCredentialsProvider, p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return resolve$suspendImpl(this, qx0Var, n64Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CognitoCredentialsProvider() {
        AuthCategory authCategory = Amplify.Auth;
        sq8.m48648g(authCategory, "Auth");
        this(authCategory);
    }
}
