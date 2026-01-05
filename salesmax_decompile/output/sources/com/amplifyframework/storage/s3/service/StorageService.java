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

/* loaded from: classes5.dex */
public interface StorageService {

    public interface Factory {
        StorageService create(Context context, String str, String str2);
    }

    void cancelTransfer(TransferObserver transferObserver);

    void deleteObject(String str);

    TransferObserver downloadToFile(String str, String str2, File file, boolean z);

    URL getPresignedUrl(String str, int i, boolean z);

    TransferRecord getTransfer(String str);

    StorageListResult listFiles(String str, String str2, int i, String str3);

    StorageListResult listFiles(String str, String str2, int i, String str3, SubpathStrategy subpathStrategy);

    StorageListResult listFiles(String str, String str2, SubpathStrategy subpathStrategy);

    List<StorageItem> listFiles(String str, String str2);

    void pauseTransfer(TransferObserver transferObserver);

    void resumeTransfer(TransferObserver transferObserver);

    TransferObserver uploadFile(String str, String str2, File file, ObjectMetadata objectMetadata, boolean z);

    TransferObserver uploadInputStream(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata, boolean z);

    void validateObjectExists(String str);
}
