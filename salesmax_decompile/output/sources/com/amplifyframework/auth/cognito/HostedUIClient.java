package com.amplifyframework.auth.cognito;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.activities.CustomTabsManagerActivity;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.cognito.exceptions.service.CodeValidationException;
import com.amplifyframework.auth.cognito.helpers.BrowserHelper;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.HostedUIHttpHelper;
import com.amplifyframework.auth.cognito.helpers.PkceHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.data.OauthConfiguration;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import p001o.f9g;
import p001o.fi4;
import p001o.gi4;
import p001o.id5;
import p001o.ii4;
import p001o.isa;
import p001o.ji4;
import p001o.kh3;
import p001o.sq8;
import p001o.vyh;

@SuppressLint({"QueryPermissionsNeeded"})
/* loaded from: classes5.dex */
public final class HostedUIClient extends ii4 {
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;
    public static final Companion Companion = new Companion(null);
    private fi4 client;
    private final OauthConfiguration configuration;
    private final Context context;
    private final String defaultCustomTabsPackage;
    private final Logger logger;
    private final String proofKey;
    private final String proofKeyHash;
    private ji4 session;
    private final String state;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final HostedUIClient create(Context context, OauthConfiguration oauthConfiguration, Logger logger) {
            sq8.m48649h(context, "context");
            sq8.m48649h(logger, "logger");
            id5 id5Var = null;
            if (oauthConfiguration != null) {
                return new HostedUIClient(context, oauthConfiguration, logger, id5Var);
            }
            return null;
        }
    }

    public /* synthetic */ HostedUIClient(Context context, OauthConfiguration oauthConfiguration, Logger logger, id5 id5Var) {
        this(context, oauthConfiguration, logger);
    }

    private final Uri createAuthorizeUri(HostedUIOptions hostedUIOptions) {
        String strP0;
        String userPoolProviderName;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("oauth2").appendPath("authorize").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("redirect_uri", this.configuration.getSignInRedirectURI()).appendQueryParameter("response_type", "code").appendQueryParameter("code_challenge", this.proofKeyHash).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("state", this.state);
        AuthProvider authProvider = hostedUIOptions.getProviderInfo().getAuthProvider();
        List<String> list = null;
        if (authProvider != null && (userPoolProviderName = CodegenExtensionsKt.getUserPoolProviderName(authProvider)) != null) {
            if (!(userPoolProviderName.length() > 0)) {
                userPoolProviderName = null;
            }
            if (userPoolProviderName != null) {
                builderAppendQueryParameter.appendQueryParameter("identity_provider", userPoolProviderName);
            }
        }
        String idpIdentifier = hostedUIOptions.getProviderInfo().getIdpIdentifier();
        if (idpIdentifier != null) {
            if (!(idpIdentifier.length() > 0)) {
                idpIdentifier = null;
            }
            if (idpIdentifier != null) {
                builderAppendQueryParameter.appendQueryParameter("idp_identifier", idpIdentifier);
            }
        }
        List<String> scopes = hostedUIOptions.getScopes();
        if (scopes != null) {
            if (scopes.isEmpty()) {
                scopes = kh3.Q0(this.configuration.getScopes());
            }
            list = scopes;
        }
        List<String> list2 = list;
        if (list2 != null && (strP0 = kh3.p0(list2, " ", null, null, 0, null, null, 62, null)) != null) {
            builderAppendQueryParameter.appendQueryParameter("scope", strP0);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        sq8.m48648g(uriBuild, "build(...)");
        return uriBuild;
    }

    private final Map<String, String> createFetchTokenHeaders() {
        Map<String, String> mapM32685l = isa.m32685l(vyh.m53620a("Content-Type", "application/x-www-form-urlencoded"));
        if (this.configuration.getAppSecret() != null) {
            String strEncodeBase64 = PkceHelper.INSTANCE.encodeBase64(this.configuration.getAppClient() + ":" + this.configuration.getAppSecret());
            StringBuilder sb = new StringBuilder();
            sb.append("Basic ");
            sb.append(strEncodeBase64);
            mapM32685l.put("Authorization", sb.toString());
        }
        return mapM32685l;
    }

    private final URL createFetchTokenUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("oauth2").appendPath(AWSCognitoLegacyCredentialStore.TOKEN_KEY).build().toString());
    }

    private final void launchCustomTabs(Uri uri, Activity activity, String str) {
        if (!BrowserHelper.INSTANCE.isBrowserInstalled(this.context)) {
            throw new RuntimeException("No browsers installed");
        }
        if (str == null) {
            str = this.defaultCustomTabsPackage;
        }
        gi4 gi4VarM28790a = new gi4.C13739a(this.session).m28790a();
        if (str != null) {
            gi4VarM28790a.f25267a.setPackage(str);
        }
        gi4VarM28790a.f25267a.setData(uri);
        sq8.m48648g(gi4VarM28790a, "apply(...)");
        Intent intentCreateStartIntent = CustomTabsManagerActivity.Companion.createStartIntent(this.context, gi4VarM28790a.f25267a);
        if (activity != null) {
            activity.startActivityForResult(intentCreateStartIntent, CUSTOM_TABS_ACTIVITY_CODE);
        } else {
            intentCreateStartIntent.addFlags(268435456);
            this.context.startActivity(intentCreateStartIntent);
        }
    }

    public static /* synthetic */ void launchCustomTabs$default(HostedUIClient hostedUIClient, Uri uri, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            activity = null;
        }
        hostedUIClient.launchCustomTabs(uri, activity, str);
    }

    private final void preWarmCustomTabs(Context context, String str) {
        fi4.m26733a(context, str, this);
    }

    public final Uri createSignOutUri$aws_auth_cognito_release() {
        Uri uriBuild = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("logout").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("logout_uri", this.configuration.getSignOutRedirectURI()).build();
        sq8.m48648g(uriBuild, "build(...)");
        return uriBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CognitoUserPoolTokens fetchToken(Uri uri) {
        sq8.m48649h(uri, "uri");
        String queryParameter = uri.getQueryParameter(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter("code");
        boolean z = true;
        if (queryParameter == null) {
            if (queryParameter2 == null || queryParameter3 == null) {
                throw new CodeValidationException(null, 1, null);
            }
            return HostedUIHttpHelper.INSTANCE.fetchTokens(createFetchTokenUrl(), createFetchTokenHeaders(), isa.m32684k(vyh.m53620a("grant_type", "authorization_code"), vyh.m53620a("client_id", this.configuration.getAppClient()), vyh.m53620a("redirect_uri", this.configuration.getSignInRedirectURI()), vyh.m53620a("code_verifier", this.proofKey), vyh.m53620a("code", queryParameter3)));
        }
        String queryParameter4 = uri.getQueryParameter("error_description");
        String string = queryParameter4 != null ? f9g.Z0(queryParameter4).toString() : null;
        if (string == null) {
            z = false;
        } else {
            if (!(string.length() > 0)) {
            }
        }
        if (z) {
            queryParameter = queryParameter + ": " + string;
        }
        throw new CodeValidationException(queryParameter);
    }

    public final void launchCustomTabsSignIn(HostedUIOptions hostedUIOptions) {
        sq8.m48649h(hostedUIOptions, "hostedUIOptions");
        launchCustomTabs(createAuthorizeUri(hostedUIOptions), hostedUIOptions.getCallingActivity(), hostedUIOptions.getBrowserPackage());
    }

    public final void launchCustomTabsSignOut(String str) {
        launchCustomTabs$default(this, createSignOutUri$aws_auth_cognito_release(), null, str, 2, null);
    }

    @Override // p001o.ii4
    public void onCustomTabsServiceConnected(ComponentName componentName, fi4 fi4Var) {
        sq8.m48649h(componentName, "name");
        sq8.m48649h(fi4Var, "client");
        this.client = fi4Var;
        fi4Var.m26740h(0L);
        this.session = fi4Var.m26738f(null);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        sq8.m48649h(componentName, "name");
        this.client = null;
    }

    private HostedUIClient(Context context, OauthConfiguration oauthConfiguration, Logger logger) {
        this.context = context;
        this.configuration = oauthConfiguration;
        this.logger = logger;
        PkceHelper pkceHelper = PkceHelper.INSTANCE;
        String strGenerateRandom = pkceHelper.generateRandom();
        this.proofKey = strGenerateRandom;
        this.proofKeyHash = pkceHelper.generateHash(strGenerateRandom);
        this.state = pkceHelper.generateRandom();
        String defaultCustomTabPackage = BrowserHelper.INSTANCE.getDefaultCustomTabPackage(context);
        if (defaultCustomTabPackage != null) {
            preWarmCustomTabs(context, defaultCustomTabPackage);
        } else {
            defaultCustomTabPackage = null;
        }
        this.defaultCustomTabsPackage = defaultCustomTabPackage;
    }
}
