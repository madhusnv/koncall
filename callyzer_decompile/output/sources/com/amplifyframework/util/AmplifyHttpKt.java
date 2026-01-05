package com.amplifyframework.util;

import aws.smithy.kotlin.runtime.http.engine.okhttp4.OkHttp4Engine;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.util.AmplifyHttp;
import kotlin.jvm.internal.AbstractC4154l;
import lc.InterfaceC4438a;
import nc.InterfaceC4991b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AmplifyHttpKt {
    @InternalAmplifyApi
    public static final void setHttpEngine(InterfaceC4438a interfaceC4438a) {
        AbstractC4154l.m8923f(interfaceC4438a, "<this>");
        if (AmplifyHttp.INSTANCE.getAvailableVersion() == AmplifyHttp.Version.OkHttp4) {
            interfaceC4438a.mo245l((InterfaceC4991b) new OkHttp4Engine());
        }
    }
}
