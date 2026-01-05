package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import com.google.firebase.messaging.Constants;
import p001o.sq8;
import p001o.t9d;

/* renamed from: com.facebook.login.c */
/* loaded from: classes5.dex */
public final class C10828c extends t9d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10828c(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.m13265a(), request.m13277m());
        sq8.m48649h(context, "context");
        sq8.m48649h(request, "request");
    }

    @Override // p001o.t9d
    /* renamed from: d */
    public void mo13363d(Bundle bundle) {
        sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }
}
