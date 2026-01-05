package com.amplifyframework.storage.s3.operation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.operation.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1237e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5920a;

    /* renamed from: b */
    public final /* synthetic */ AWSS3StorageUploadFileOperation f5921b;

    public /* synthetic */ RunnableC1237e(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, int i10) {
        this.f5920a = i10;
        this.f5921b = aWSS3StorageUploadFileOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5920a) {
            case 0:
                AWSS3StorageUploadFileOperation.cancel$lambda$7(this.f5921b);
                break;
            case 1:
                AWSS3StorageUploadFileOperation.resume$lambda$5(this.f5921b);
                break;
            default:
                AWSS3StorageUploadFileOperation.pause$lambda$3(this.f5921b);
                break;
        }
    }
}
