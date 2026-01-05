package com.amplifyframework.storage.s3.transfer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.transfer.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1254a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5926a;

    /* renamed from: b */
    public final /* synthetic */ TransferManager f5927b;

    /* renamed from: c */
    public final /* synthetic */ int f5928c;

    public /* synthetic */ RunnableC1254a(TransferManager transferManager, int i10, int i11) {
        this.f5926a = i11;
        this.f5927b = transferManager;
        this.f5928c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5926a) {
            case 0:
                TransferManager.upload$lambda$0(this.f5927b, this.f5928c);
                break;
            case 1:
                TransferManager.resume$lambda$4$lambda$3(this.f5927b, this.f5928c);
                break;
            default:
                TransferManager.download$lambda$1(this.f5927b, this.f5928c);
                break;
        }
    }
}
