package com.amplifyframework.auth.plugins.core;

import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import com.amplifyframework.util.AmplifyHttpKt;
import kotlin.jvm.internal.AbstractC4154l;
import og.ae;
import qw.C6364n;
import qw.a0;
import tc.InterfaceC7116a;
import ua.C7381a;
import ua.C7382b;
import ua.C7384d;
import ua.InterfaceC7383c;
import uc.C7394a;
import uw.InterfaceC7559c;
import vb.C7696c;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;
import zb.InterfaceC8922p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoClientFactory {
    public static final CognitoClientFactory INSTANCE = new CognitoClientFactory();

    private CognitoClientFactory() {
    }

    private static final a0 createIdentityClient$lambda$0(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, final String str, final String str2, C7381a CognitoIdentityClient) {
        AbstractC4154l.m8923f(CognitoIdentityClient, "$this$CognitoIdentityClient");
        AmplifyHttpKt.setHttpEngine(CognitoIdentityClient);
        CognitoIdentityClient.f35092d = aWSCognitoIdentityPoolConfiguration.getRegion();
        CognitoIdentityClient.f35095g.add(new InterfaceC8909c() { // from class: com.amplifyframework.auth.plugins.core.CognitoClientFactory$createIdentityClient$1$1
            @Override // zb.InterfaceC8909c
            /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
            public Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                return interfaceC8916j.mo12203c();
            }

            @Override // zb.InterfaceC8909c
            /* renamed from: modifyBeforeCompletion-gIAlu-s */
            public Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c<? super C6364n> interfaceC7559c) {
                return interfaceC8916j.mo12203c();
            }

            @Override // zb.InterfaceC8909c
            public Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c<? super C7394a> interfaceC7559c) {
                return interfaceC8914h.mo12201a();
            }

            @Override // zb.InterfaceC8909c
            public Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                return interfaceC8913g.mo12204d();
            }

            @Override // zb.InterfaceC8909c
            public Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c<Object> interfaceC7559c) {
                ae.m10531a(interfaceC8915i.mo12202b()).m12496a(AWSCognitoAuthMetadataType.AuthPluginsCore.getKey(), "2.29.2");
                ae.m10531a(interfaceC8915i.mo12202b()).m12496a(str, str2);
                return interfaceC8915i.mo12205e();
            }

            @Override // zb.InterfaceC8909c
            public Object modifyBeforeSigning(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                return interfaceC8913g.mo12204d();
            }

            @Override // zb.InterfaceC8909c
            public Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
                return interfaceC8913g.mo12204d();
            }

            @Override // zb.InterfaceC8909c
            public void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
                super.readAfterAttempt(interfaceC8916j);
            }

            @Override // zb.InterfaceC8909c
            public void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
                super.readAfterDeserialization(interfaceC8916j);
            }

            @Override // zb.InterfaceC8909c
            public void readAfterExecution(InterfaceC8916j interfaceC8916j) {
                super.readAfterExecution(interfaceC8916j);
            }

            @Override // zb.InterfaceC8909c
            public void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
                super.readAfterSerialization(interfaceC8913g);
            }

            @Override // zb.InterfaceC8909c
            public void readAfterSigning(InterfaceC8913g interfaceC8913g) {
                super.readAfterSigning(interfaceC8913g);
            }

            @Override // zb.InterfaceC8909c
            public void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
                super.readAfterTransmit(interfaceC8914h);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
                super.readBeforeAttempt(interfaceC8913g);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
                super.readBeforeDeserialization(interfaceC8914h);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
                super.readBeforeExecution(interfaceC8915i);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
                super.readBeforeSerialization(interfaceC8915i);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
                super.readBeforeSigning(interfaceC8913g);
            }

            @Override // zb.InterfaceC8909c
            public void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
                super.readBeforeTransmit(interfaceC8913g);
            }
        });
        return a0.f30746a;
    }

    public final InterfaceC7383c createIdentityClient(AWSCognitoIdentityPoolConfiguration identityPool, String pluginKey, String pluginVersion) {
        AbstractC4154l.m8923f(identityPool, "identityPool");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(pluginVersion, "pluginVersion");
        C7381a c7381a = new C7381a();
        createIdentityClient$lambda$0(identityPool, pluginKey, pluginVersion, c7381a);
        c7381a.f35095g.add(0, new C7696c());
        C7382b config = (C7382b) ((InterfaceC8922p) c7381a.build());
        AbstractC4154l.m8923f(config, "config");
        return new C7384d(config);
    }
}
