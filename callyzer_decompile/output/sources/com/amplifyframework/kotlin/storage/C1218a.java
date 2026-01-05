package com.amplifyframework.kotlin.storage;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import org.bouncycastle.iana.AEADAlgorithm;
import wx.b1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.kotlin.storage.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1218a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f5905a;

    /* renamed from: b */
    public final /* synthetic */ b1 f5906b;

    public /* synthetic */ C1218a(b1 b1Var, int i10) {
        this.f5905a = i10;
        this.f5906b = b1Var;
    }

    @Override // com.amplifyframework.core.Consumer
    public final void accept(Object obj) {
        switch (this.f5905a) {
            case 0:
                KotlinStorageFacade.downloadFile$lambda$5(this.f5906b, (StorageTransferProgress) obj);
                break;
            case 1:
                KotlinStorageFacade.uploadInputStream$lambda$18(this.f5906b, (StorageUploadInputStreamResult) obj);
                break;
            case 2:
                KotlinStorageFacade.uploadInputStream$lambda$19(this.f5906b, (StorageException) obj);
                break;
            case 3:
                KotlinStorageFacade.downloadFile$lambda$2(this.f5906b, (StorageTransferProgress) obj);
                break;
            case 4:
                KotlinStorageFacade.downloadFile$lambda$3(this.f5906b, (StorageDownloadFileResult) obj);
                break;
            case 5:
                KotlinStorageFacade.downloadFile$lambda$4(this.f5906b, (StorageException) obj);
                break;
            case 6:
                KotlinStorageFacade.uploadInputStream$lambda$14(this.f5906b, (StorageTransferProgress) obj);
                break;
            case 7:
                KotlinStorageFacade.uploadInputStream$lambda$15(this.f5906b, (StorageUploadInputStreamResult) obj);
                break;
            case 8:
                KotlinStorageFacade.uploadInputStream$lambda$16(this.f5906b, (StorageException) obj);
                break;
            case 9:
                KotlinStorageFacade.downloadFile$lambda$6(this.f5906b, (StorageDownloadFileResult) obj);
                break;
            case 10:
                KotlinStorageFacade.downloadFile$lambda$7(this.f5906b, (StorageException) obj);
                break;
            case 11:
                KotlinStorageFacade.uploadFile$lambda$11(this.f5906b, (StorageTransferProgress) obj);
                break;
            case 12:
                KotlinStorageFacade.uploadFile$lambda$12(this.f5906b, (StorageUploadFileResult) obj);
                break;
            case 13:
                KotlinStorageFacade.uploadFile$lambda$13(this.f5906b, (StorageException) obj);
                break;
            case 14:
                KotlinStorageFacade.uploadFile$lambda$8(this.f5906b, (StorageTransferProgress) obj);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                KotlinStorageFacade.uploadFile$lambda$9(this.f5906b, (StorageUploadFileResult) obj);
                break;
            case 16:
                KotlinStorageFacade.uploadFile$lambda$10(this.f5906b, (StorageException) obj);
                break;
            default:
                KotlinStorageFacade.uploadInputStream$lambda$17(this.f5906b, (StorageTransferProgress) obj);
                break;
        }
    }
}
