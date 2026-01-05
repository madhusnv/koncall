package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p001o.sq8;
import p001o.srb;

/* loaded from: classes5.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public void m12804a(String str, String str2, Bundle bundle) {
        sq8.m48649h(str, "appCallId");
        sq8.m48649h(str2, "action");
        sq8.m48649h(bundle, "extras");
    }

    /* renamed from: b */
    public void m12805b(String str, String str2, Bundle bundle) {
        sq8.m48649h(str, "appCallId");
        sq8.m48649h(str2, "action");
        sq8.m48649h(bundle, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "intent");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        if (srb.m48794x(intent)) {
            m12804a(stringExtra, stringExtra2, extras);
        } else {
            m12805b(stringExtra, stringExtra2, extras);
        }
    }
}
