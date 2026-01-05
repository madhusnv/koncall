package com.amplifyframework.storage.s3.operation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.operation.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1233a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5912a;

    /* renamed from: b */
    public final /* synthetic */ AWSS3StorageDownloadFileOperation f5913b;

    public /* synthetic */ RunnableC1233a(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, int i10) {
        this.f5912a = i10;
        this.f5913b = aWSS3StorageDownloadFileOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5912a) {
            case 0:
                AWSS3StorageDownloadFileOperation.cancel$lambda$7(this.f5913b);
                break;
            case 1:
                AWSS3StorageDownloadFileOperation.resume$lambda$5(this.f5913b);
                break;
            default:
                AWSS3StorageDownloadFileOperation.pause$lambda$3(this.f5913b);
                break;
        }
    }
}
