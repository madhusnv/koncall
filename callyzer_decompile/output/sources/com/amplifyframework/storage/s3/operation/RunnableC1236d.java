package com.amplifyframework.storage.s3.operation;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.operation.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1236d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5918a;

    /* renamed from: b */
    public final /* synthetic */ AWSS3StoragePathUploadInputStreamOperation f5919b;

    public /* synthetic */ RunnableC1236d(AWSS3StoragePathUploadInputStreamOperation aWSS3StoragePathUploadInputStreamOperation, int i10) {
        this.f5918a = i10;
        this.f5919b = aWSS3StoragePathUploadInputStreamOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5918a) {
            case 0:
                AWSS3StoragePathUploadInputStreamOperation.pause$lambda$2(this.f5919b);
                break;
            case 1:
                AWSS3StoragePathUploadInputStreamOperation.resume$lambda$4(this.f5919b);
                break;
            case 2:
                AWSS3StoragePathUploadInputStreamOperation.cancel$lambda$6(this.f5919b);
                break;
            default:
                AWSS3StoragePathUploadInputStreamOperation.start$lambda$0(this.f5919b);
                break;
        }
    }
}
