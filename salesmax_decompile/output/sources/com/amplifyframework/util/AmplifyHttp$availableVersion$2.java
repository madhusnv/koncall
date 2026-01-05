package com.amplifyframework.util;

import com.amplifyframework.util.AmplifyHttp;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class AmplifyHttp$availableVersion$2 extends kf9 implements uk7 {
    public static final AmplifyHttp$availableVersion$2 INSTANCE = new AmplifyHttp$availableVersion$2();

    public AmplifyHttp$availableVersion$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final AmplifyHttp.Version invoke() throws ClassNotFoundException {
        try {
            Class.forName("aws.smithy.kotlin.runtime.http.engine.okhttp4.OkHttp4Engine");
            AmplifyHttp.logger.info("Using OkHttp4 Engine");
            return AmplifyHttp.Version.OkHttp4;
        } catch (ClassNotFoundException unused) {
            AmplifyHttp.logger.info("Using default OkHttp5 Engine");
            return AmplifyHttp.Version.OkHttp5;
        }
    }
}
