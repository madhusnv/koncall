package com.amplifyframework.storage.s3.service;

import android.content.Context;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.StorageItem;
import com.amplifyframework.storage.options.SubpathStrategy;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface StorageService {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Factory {
        StorageService create(Context context, String str, String str2);
    }

    void cancelTransfer(TransferObserver transferObserver);

    void deleteObject(String str);

    TransferObserver downloadToFile(String str, String str2, File file, boolean z6);

    URL getPresignedUrl(String str, int i10, boolean z6);

    TransferRecord getTransfer(String str);

    StorageListResult listFiles(String str, String str2, int i10, String str3);

    StorageListResult listFiles(String str, String str2, int i10, String str3, SubpathStrategy subpathStrategy);

    StorageListResult listFiles(String str, String str2, SubpathStrategy subpathStrategy);

    List<StorageItem> listFiles(String str, String str2);

    void pauseTransfer(TransferObserver transferObserver);

    void resumeTransfer(TransferObserver transferObserver);

    TransferObserver uploadFile(String str, String str2, File file, ObjectMetadata objectMetadata, boolean z6);

    TransferObserver uploadInputStream(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, boolean z6);

    void validateObjectExists(String str);
}
