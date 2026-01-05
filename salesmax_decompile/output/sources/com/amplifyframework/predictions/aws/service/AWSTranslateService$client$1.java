package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.util.AmplifyHttpKt;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.xvh;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSTranslateService$client$1 extends kf9 implements xk7 {
    final /* synthetic */ AWSTranslateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTranslateService$client$1(AWSTranslateService aWSTranslateService) {
        super(1);
        this.this$0 = aWSTranslateService;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((xvh.C18256c.a) obj);
        return y3i.f54824a;
    }

    public final void invoke(xvh.C18256c.a aVar) {
        sq8.m48649h(aVar, "$this$invoke");
        AmplifyHttpKt.setHttpEngine(aVar);
        aVar.mo20132h(this.this$0.pluginConfiguration.getDefaultRegion());
        aVar.m56907z(this.this$0.authCredentialsProvider);
    }
}
