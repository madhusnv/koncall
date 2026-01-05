package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CustomTabsManagerActivity extends Activity {
    public static final String CUSTOM_TABS_INTENT_KEY = "customTabsIntent";
    public static final String CUSTOM_TABS_LAUNCHED_KEY = "customTabsLaunched";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthClient";
    private Intent customTabsIntent;
    private boolean customTabsLaunched;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final Intent createBaseIntent(Context context) {
            return new Intent(context, (Class<?>) CustomTabsManagerActivity.class);
        }

        public final Intent createResponseHandlingIntent(Context context, Uri uri) {
            sq8.m48649h(context, "context");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.setData(uri);
            intentCreateBaseIntent.addFlags(603979776);
            return intentCreateBaseIntent;
        }

        public final Intent createStartIntent(Context context, Intent intent) {
            sq8.m48649h(context, "context");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.putExtra(CustomTabsManagerActivity.CUSTOM_TABS_INTENT_KEY, intent);
            return intentCreateBaseIntent;
        }
    }

    public static final Intent createResponseHandlingIntent(Context context, Uri uri) {
        return Companion.createResponseHandlingIntent(context, uri);
    }

    private final void extractState(Bundle bundle) {
        if (bundle == null) {
            finish();
        } else {
            this.customTabsIntent = (Intent) bundle.getParcelable(CUSTOM_TABS_INTENT_KEY);
            this.customTabsLaunched = bundle.getBoolean(CUSTOM_TABS_LAUNCHED_KEY, false);
        }
    }

    private final void handleAuthorizationCanceled() {
        setResult(0);
        Amplify.Auth.handleWebUISignInResponse(null);
    }

    private final void handleAuthorizationComplete() {
        setResult(-1, getIntent());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            extractState(getIntent().getExtras());
        } else {
            extractState(bundle);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        sq8.m48649h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.customTabsLaunched) {
            startActivity(this.customTabsIntent);
            this.customTabsLaunched = true;
        } else {
            if (getIntent().getData() != null) {
                handleAuthorizationComplete();
            } else {
                handleAuthorizationCanceled();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        sq8.m48649h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(CUSTOM_TABS_LAUNCHED_KEY, this.customTabsLaunched);
        bundle.putParcelable(CUSTOM_TABS_INTENT_KEY, this.customTabsIntent);
    }
}
