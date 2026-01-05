package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIProviderInfo;
import java.util.List;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIHelper {
    public static final HostedUIHelper INSTANCE = new HostedUIHelper();

    private HostedUIHelper() {
    }

    public final HostedUIOptions createHostedUIOptions(Activity activity, AuthProvider authProvider, AuthWebUISignInOptions authWebUISignInOptions) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authWebUISignInOptions, "options");
        List<String> scopes = authWebUISignInOptions.getScopes();
        boolean z = authWebUISignInOptions instanceof AWSCognitoAuthWebUISignInOptions;
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = z ? (AWSCognitoAuthWebUISignInOptions) authWebUISignInOptions : null;
        HostedUIProviderInfo hostedUIProviderInfo = new HostedUIProviderInfo(authProvider, aWSCognitoAuthWebUISignInOptions != null ? aWSCognitoAuthWebUISignInOptions.getIdpIdentifier() : null);
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions2 = z ? (AWSCognitoAuthWebUISignInOptions) authWebUISignInOptions : null;
        return new HostedUIOptions(activity, scopes, hostedUIProviderInfo, aWSCognitoAuthWebUISignInOptions2 != null ? aWSCognitoAuthWebUISignInOptions2.getBrowserPackage() : null);
    }
}
