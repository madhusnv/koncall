package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CustomTabsManagerActivity extends Activity {
    public static final String CUSTOM_TABS_INTENT_KEY = "customTabsIntent";
    public static final String CUSTOM_TABS_LAUNCHED_KEY = "customTabsLaunched";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthClient";
    private Intent customTabsIntent;
    private boolean customTabsLaunched;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final Intent createBaseIntent(Context context) {
            return new Intent(context, (Class<?>) CustomTabsManagerActivity.class);
        }

        public final Intent createResponseHandlingIntent(Context context, Uri uri) {
            AbstractC4154l.m8923f(context, "context");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.setData(uri);
            intentCreateBaseIntent.addFlags(603979776);
            return intentCreateBaseIntent;
        }

        public final Intent createStartIntent(Context context, Intent intent) {
            AbstractC4154l.m8923f(context, "context");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.putExtra(CustomTabsManagerActivity.CUSTOM_TABS_INTENT_KEY, intent);
            return intentCreateBaseIntent;
        }

        private Companion() {
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
        AbstractC4154l.m8923f(intent, "intent");
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
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4154l.m8923f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(CUSTOM_TABS_LAUNCHED_KEY, this.customTabsLaunched);
        outState.putParcelable(CUSTOM_TABS_INTENT_KEY, this.customTabsIntent);
    }
}
