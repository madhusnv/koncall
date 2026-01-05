package com.amplifyframework.storage.s3.transfer.worker;

import com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker;
import ex.InterfaceC2139c;
import gb.C2554d;
import t8.AbstractC7076v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.transfer.worker.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1268b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5942a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7076v f5943b;

    public /* synthetic */ C1268b(AbstractC7076v abstractC7076v, int i10) {
        this.f5942a = i10;
        this.f5943b = abstractC7076v;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5942a) {
            case 0:
                return PartUploadTransferWorker.C12641.invokeSuspend$lambda$0((PartUploadTransferWorker) this.f5943b, (C2554d) obj);
            case 1:
                return AbortMultiPartUploadWorker.performWork$lambda$0((AbortMultiPartUploadWorker) this.f5943b, (C2554d) obj);
            case 2:
                return CompleteMultiPartUploadWorker.performWork$lambda$0((CompleteMultiPartUploadWorker) this.f5943b, (C2554d) obj);
            case 3:
                return InitiateMultiPartUploadTransferWorker.performWork$lambda$0((InitiateMultiPartUploadTransferWorker) this.f5943b, (C2554d) obj);
            default:
                return SinglePartUploadWorker.performWork$lambda$0((SinglePartUploadWorker) this.f5943b, (C2554d) obj);
        }
    }
}
