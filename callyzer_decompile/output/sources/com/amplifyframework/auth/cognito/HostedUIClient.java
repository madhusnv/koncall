package com.amplifyframework.auth.cognito;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
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
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import i0.m0;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import p001b.C0506a;
import p001b.InterfaceC0508c;
import p017s.AbstractC6693b;
import p017s.AbstractServiceConnectionC6695d;
import p017s.BinderC6692a;
import p017s.C6696e;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"QueryPermissionsNeeded"})
/* loaded from: classes.dex */
public final class HostedUIClient extends AbstractServiceConnectionC6695d {
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;
    public static final Companion Companion = new Companion(null);
    private AbstractC6693b client;
    private final OauthConfiguration configuration;
    private final Context context;
    private final String defaultCustomTabsPackage;
    private final Logger logger;
    private final String proofKey;
    private final String proofKeyHash;
    private C6696e session;
    private final String state;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final HostedUIClient create(Context context, OauthConfiguration oauthConfiguration, Logger logger) {
            AbstractC4154l.m8923f(context, "context");
            AbstractC4154l.m8923f(logger, "logger");
            AbstractC4148f abstractC4148f = null;
            if (oauthConfiguration != null) {
                return new HostedUIClient(context, oauthConfiguration, logger, abstractC4148f);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HostedUIClient(Context context, OauthConfiguration oauthConfiguration, Logger logger, AbstractC4148f abstractC4148f) {
        this(context, oauthConfiguration, logger);
    }

    private final Uri createAuthorizeUri(HostedUIOptions hostedUIOptions) {
        String strM12748L;
        String userPoolProviderName;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("oauth2").appendPath("authorize").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("redirect_uri", this.configuration.getSignInRedirectURI()).appendQueryParameter("response_type", "code").appendQueryParameter("code_challenge", this.proofKeyHash).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter(TransferTable.COLUMN_STATE, this.state);
        AuthProvider authProvider = hostedUIOptions.getProviderInfo().getAuthProvider();
        List<String> list = null;
        if (authProvider != null && (userPoolProviderName = CodegenExtensionsKt.getUserPoolProviderName(authProvider)) != null) {
            if (userPoolProviderName.length() <= 0) {
                userPoolProviderName = null;
            }
            if (userPoolProviderName != null) {
                builderAppendQueryParameter.appendQueryParameter("identity_provider", userPoolProviderName);
            }
        }
        String idpIdentifier = hostedUIOptions.getProviderInfo().getIdpIdentifier();
        if (idpIdentifier != null) {
            if (idpIdentifier.length() <= 0) {
                idpIdentifier = null;
            }
            if (idpIdentifier != null) {
                builderAppendQueryParameter.appendQueryParameter("idp_identifier", idpIdentifier);
            }
        }
        List<String> scopes = hostedUIOptions.getScopes();
        if (scopes != null) {
            if (scopes.isEmpty()) {
                scopes = AbstractC6663m.c0(this.configuration.getScopes());
            }
            list = scopes;
        }
        List<String> list2 = list;
        if (list2 != null && (strM12748L = AbstractC6663m.m12748L(list2, " ", null, null, null, 62)) != null) {
            builderAppendQueryParameter.appendQueryParameter("scope", strM12748L);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        AbstractC4154l.m8922e(uriBuild, "build(...)");
        return uriBuild;
    }

    private final Map<String, String> createFetchTokenHeaders() {
        LinkedHashMap linkedHashMapM12779g = AbstractC6674x.m12779g(new C6361k(ObjectMetadata.CONTENT_TYPE, "application/x-www-form-urlencoded"));
        if (this.configuration.getAppSecret() != null) {
            String strEncodeBase64 = PkceHelper.INSTANCE.encodeBase64(this.configuration.getAppClient() + ":" + this.configuration.getAppSecret());
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(strEncodeBase64);
            linkedHashMapM12779g.put("Authorization", sb2.toString());
        }
        return linkedHashMapM12779g;
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
        C6696e c6696e = this.session;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (c6696e != null) {
            intent.setPackage(c6696e.f32004b.getPackageName());
            BinderC6692a binderC6692a = c6696e.f32003a;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC6692a);
            intent.putExtras(bundle);
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        if (str != null) {
            intent.setPackage(str);
        }
        intent.setData(uri);
        Intent intentCreateStartIntent = CustomTabsManagerActivity.Companion.createStartIntent(this.context, intent);
        if (activity != null) {
            activity.startActivityForResult(intentCreateStartIntent, CUSTOM_TABS_ACTIVITY_CODE);
        } else {
            intentCreateStartIntent.addFlags(268435456);
            this.context.startActivity(intentCreateStartIntent);
        }
    }

    public static /* synthetic */ void launchCustomTabs$default(HostedUIClient hostedUIClient, Uri uri, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activity = null;
        }
        hostedUIClient.launchCustomTabs(uri, activity, str);
    }

    private final void preWarmCustomTabs(Context context, String str) {
        setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, this, 33);
    }

    public final Uri createSignOutUri$aws_auth_cognito_release() {
        Uri uriBuild = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("logout").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("logout_uri", this.configuration.getSignOutRedirectURI()).build();
        AbstractC4154l.m8922e(uriBuild, "build(...)");
        return uriBuild;
    }

    public final CognitoUserPoolTokens fetchToken(Uri uri) {
        AbstractC4154l.m8923f(uri, "uri");
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter(TransferTable.COLUMN_STATE);
        String queryParameter3 = uri.getQueryParameter("code");
        if (queryParameter == null) {
            if (queryParameter2 == null || queryParameter3 == null) {
                throw new CodeValidationException(null, 1, null);
            }
            return HostedUIHttpHelper.INSTANCE.fetchTokens(createFetchTokenUrl(), createFetchTokenHeaders(), AbstractC6674x.m12778f(new C6361k("grant_type", "authorization_code"), new C6361k("client_id", this.configuration.getAppClient()), new C6361k("redirect_uri", this.configuration.getSignInRedirectURI()), new C6361k("code_verifier", this.proofKey), new C6361k("code", queryParameter3)));
        }
        String queryParameter4 = uri.getQueryParameter("error_description");
        String string = queryParameter4 != null ? AbstractC5178p.g0(queryParameter4).toString() : null;
        if (string != null && string.length() > 0) {
            queryParameter = m0.m7379l(queryParameter, ": ", string);
        }
        throw new CodeValidationException(queryParameter);
    }

    public final void launchCustomTabsSignIn(HostedUIOptions hostedUIOptions) {
        AbstractC4154l.m8923f(hostedUIOptions, "hostedUIOptions");
        launchCustomTabs(createAuthorizeUri(hostedUIOptions), hostedUIOptions.getCallingActivity(), hostedUIOptions.getBrowserPackage());
    }

    public final void launchCustomTabsSignOut(String str) {
        launchCustomTabs$default(this, createSignOutUri$aws_auth_cognito_release(), null, str, 2, null);
    }

    @Override // p017s.AbstractServiceConnectionC6695d
    public void onCustomTabsServiceConnected(ComponentName name, AbstractC6693b client) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(client, "client");
        InterfaceC0508c interfaceC0508c = client.f32001a;
        this.client = client;
        try {
            ((C0506a) interfaceC0508c).m1505f();
        } catch (RemoteException unused) {
        }
        BinderC6692a binderC6692a = new BinderC6692a();
        binderC6692a.attachInterface(binderC6692a, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        C6696e c6696e = !((C0506a) interfaceC0508c).m1504d(binderC6692a) ? null : new C6696e(binderC6692a, client.f32002b);
        this.session = c6696e;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        AbstractC4154l.m8923f(name, "name");
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
