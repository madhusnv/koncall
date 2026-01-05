package com.amplifyframework.storage.s3.operation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.operation.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1238f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5922a;

    /* renamed from: b */
    public final /* synthetic */ AWSS3StorageUploadInputStreamOperation f5923b;

    public /* synthetic */ RunnableC1238f(AWSS3StorageUploadInputStreamOperation aWSS3StorageUploadInputStreamOperation, int i10) {
        this.f5922a = i10;
        this.f5923b = aWSS3StorageUploadInputStreamOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5922a) {
            case 0:
                AWSS3StorageUploadInputStreamOperation.pause$lambda$3(this.f5923b);
                break;
            case 1:
                AWSS3StorageUploadInputStreamOperation.cancel$lambda$7(this.f5923b);
                break;
            default:
                AWSS3StorageUploadInputStreamOperation.resume$lambda$5(this.f5923b);
                break;
        }
    }
}
