package com.amplifyframework.storage.s3.transfer;

import com.amplifyframework.auth.AuthCredentialsProvider;
import p001o.cxe;
import p001o.id5;
import p001o.nl7;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class S3StorageTransferClientProvider implements StorageTransferClientProvider {
    public static final Companion Companion = new Companion(null);
    private final nl7 createS3Client;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final cxe getS3Client(String str, AuthCredentialsProvider authCredentialsProvider) {
            sq8.m48649h(str, TransferTable.COLUMN_REGION);
            sq8.m48649h(authCredentialsProvider, "authCredentialsProvider");
            return (cxe) cxe.f18758V.m38580c(new S3StorageTransferClientProvider$Companion$getS3Client$1(str, authCredentialsProvider));
        }
    }

    public S3StorageTransferClientProvider(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "createS3Client");
        this.createS3Client = nl7Var;
    }

    public static final cxe getS3Client(String str, AuthCredentialsProvider authCredentialsProvider) {
        return Companion.getS3Client(str, authCredentialsProvider);
    }

    @Override // com.amplifyframework.storage.s3.transfer.StorageTransferClientProvider
    public cxe getStorageTransferClient(String str, String str2) {
        return (cxe) this.createS3Client.invoke(str, str2);
    }
}
