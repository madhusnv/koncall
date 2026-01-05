package com.amplifyframework.util;

import aws.smithy.kotlin.runtime.http.engine.okhttp4.OkHttp4Engine;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.util.AmplifyHttp;
import p001o.s18;
import p001o.sq8;
import p001o.t18;

/* loaded from: classes5.dex */
public final class AmplifyHttpKt {
    @InternalAmplifyApi
    public static final void setHttpEngine(s18 s18Var) {
        sq8.m48649h(s18Var, "<this>");
        if (AmplifyHttp.INSTANCE.getAvailableVersion() == AmplifyHttp.Version.OkHttp4) {
            s18Var.mo20126b((t18) new OkHttp4Engine());
        }
    }
}
