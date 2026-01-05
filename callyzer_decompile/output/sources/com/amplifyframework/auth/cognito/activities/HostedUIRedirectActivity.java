package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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
