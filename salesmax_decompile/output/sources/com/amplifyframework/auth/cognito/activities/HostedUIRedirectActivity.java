package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;

/* loaded from: classes5.dex */
public final class HostedUIRedirectActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(CustomTabsManagerActivity.Companion.createResponseHandlingIntent(this, getIntent().getData()));
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Amplify.Auth.handleWebUISignInResponse(getIntent());
        finish();
    }
}
