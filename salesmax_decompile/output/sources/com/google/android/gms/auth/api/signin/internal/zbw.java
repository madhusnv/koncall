package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import p001o.aha;
import p001o.wga;

/* loaded from: classes5.dex */
final class zbw implements aha.InterfaceC12172a {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // p001o.aha.InterfaceC12172a
    public final wga onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // p001o.aha.InterfaceC12172a
    public final /* bridge */ /* synthetic */ void onLoadFinished(wga wgaVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // p001o.aha.InterfaceC12172a
    public final void onLoaderReset(wga wgaVar) {
    }
}
