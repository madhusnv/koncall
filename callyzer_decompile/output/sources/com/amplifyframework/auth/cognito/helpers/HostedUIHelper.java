package com.amplifyframework.auth.cognito.helpers;

import android.app.Activity;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.data.HostedUIProviderInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIHelper {
    public static final HostedUIHelper INSTANCE = new HostedUIHelper();

    private HostedUIHelper() {
    }

    public final HostedUIOptions createHostedUIOptions(Activity callingActivity, AuthProvider authProvider, AuthWebUISignInOptions options) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        List<String> scopes = options.getScopes();
        boolean z6 = options instanceof AWSCognitoAuthWebUISignInOptions;
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = z6 ? (AWSCognitoAuthWebUISignInOptions) options : null;
        HostedUIProviderInfo hostedUIProviderInfo = new HostedUIProviderInfo(authProvider, aWSCognitoAuthWebUISignInOptions != null ? aWSCognitoAuthWebUISignInOptions.getIdpIdentifier() : null);
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions2 = z6 ? (AWSCognitoAuthWebUISignInOptions) options : null;
        return new HostedUIOptions(callingActivity, scopes, hostedUIProviderInfo, aWSCognitoAuthWebUISignInOptions2 != null ? aWSCognitoAuthWebUISignInOptions2.getBrowserPackage() : null);
    }

    public final String selectRedirectUri(List<String> redirectUris) {
        AbstractC4154l.m8923f(redirectUris, "redirectUris");
        Object obj = null;
        if (redirectUris.isEmpty()) {
            return null;
        }
        Iterator<T> it = redirectUris.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String lowerCase = AbstractC5178p.c0((String) next, "://", "").toLowerCase(Locale.ROOT);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            if (!lowerCase.equals("http") && !lowerCase.equals("https") && lowerCase.length() > 0) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str == null ? (String) AbstractC6663m.m12743G(redirectUris) : str;
    }
}
