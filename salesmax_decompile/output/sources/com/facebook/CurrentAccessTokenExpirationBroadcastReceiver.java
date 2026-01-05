package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        if (sq8.m48644c("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && C10773c.m12993G()) {
            C10772b.f11380f.m12973e().m12958g();
        }
    }
}
