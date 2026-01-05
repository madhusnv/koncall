package com.amplifyframework.storage.s3.operation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.operation.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1234b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5914a;

    /* renamed from: b */
    public final /* synthetic */ AWSS3StoragePathDownloadFileOperation f5915b;

    public /* synthetic */ RunnableC1234b(AWSS3StoragePathDownloadFileOperation aWSS3StoragePathDownloadFileOperation, int i10) {
        this.f5914a = i10;
        this.f5915b = aWSS3StoragePathDownloadFileOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5914a) {
            case 0:
                AWSS3StoragePathDownloadFileOperation.start$lambda$0(this.f5915b);
                break;
            case 1:
                AWSS3StoragePathDownloadFileOperation.resume$lambda$4(this.f5915b);
                break;
            case 2:
                AWSS3StoragePathDownloadFileOperation.pause$lambda$2(this.f5915b);
                break;
            default:
                AWSS3StoragePathDownloadFileOperation.cancel$lambda$6(this.f5915b);
                break;
        }
    }
}
