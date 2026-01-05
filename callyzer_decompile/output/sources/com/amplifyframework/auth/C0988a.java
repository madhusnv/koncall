package com.amplifyframework.auth;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.s3.operation.AWSS3StorageDownloadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadInputStreamOperation;
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0988a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f5821a;

    /* renamed from: b */
    public final /* synthetic */ Object f5822b;

    /* renamed from: c */
    public final /* synthetic */ Object f5823c;

    public /* synthetic */ C0988a(int i10, Object obj, Object obj2) {
        this.f5821a = i10;
        this.f5822b = obj;
        this.f5823c = obj2;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        switch (this.f5821a) {
            case 0:
                CognitoCredentialsProvider.getAccessToken$lambda$3((Consumer) this.f5822b, (Consumer) this.f5823c, (AuthSession) obj);
                break;
            case 1:
                AWSS3StorageDownloadFileOperation.start$lambda$1$lambda$0((AWSS3StorageDownloadFileRequest) this.f5822b, (AWSS3StorageDownloadFileOperation) this.f5823c, (String) obj);
                break;
            case 2:
                AWSS3StorageUploadFileOperation.start$lambda$1$lambda$0((AWSS3StorageUploadRequest) this.f5822b, (AWSS3StorageUploadFileOperation) this.f5823c, (String) obj);
                break;
            default:
                AWSS3StorageUploadInputStreamOperation.start$lambda$1$lambda$0((AWSS3StorageUploadRequest) this.f5822b, (AWSS3StorageUploadInputStreamOperation) this.f5823c, (String) obj);
                break;
        }
    }
}
