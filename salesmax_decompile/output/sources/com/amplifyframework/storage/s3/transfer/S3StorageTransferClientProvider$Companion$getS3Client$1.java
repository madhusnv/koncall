package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.auth.AuthCredentialsProvider;
import com.amplifyframework.util.AmplifyHttpKt;
import p001o.cxe;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class S3StorageTransferClientProvider$Companion$getS3Client$1 extends kf9 implements xk7 {
    final /* synthetic */ AuthCredentialsProvider $authCredentialsProvider;
    final /* synthetic */ String $region;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3StorageTransferClientProvider$Companion$getS3Client$1(String str, AuthCredentialsProvider authCredentialsProvider) {
        super(1);
        this.$region = str;
        this.$authCredentialsProvider = authCredentialsProvider;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((cxe.C12766c.a) obj);
        return y3i.f54824a;
    }

    public final void invoke(cxe.C12766c.a aVar) {
        sq8.m48649h(aVar, "$this$invoke");
        AmplifyHttpKt.setHttpEngine(aVar);
        aVar.mo20132h(this.$region);
        aVar.m22014M(this.$authCredentialsProvider);
    }
}
