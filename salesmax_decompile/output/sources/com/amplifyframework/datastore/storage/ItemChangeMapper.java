package com.amplifyframework.datastore.storage;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.storage.StorageItemChange;

/* loaded from: classes5.dex */
public final class ItemChangeMapper {

    /* renamed from: com.amplifyframework.datastore.storage.ItemChangeMapper$1 */
    public static /* synthetic */ class C105591 {

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$storage$StorageItemChange$Initiator */
        static final /* synthetic */ int[] f10647x94c219dc;

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$storage$StorageItemChange$Type */
        static final /* synthetic */ int[] f10648x4d065f6d;

        static {
            int[] iArr = new int[StorageItemChange.Type.values().length];
            f10648x4d065f6d = iArr;
            try {
                iArr[StorageItemChange.Type.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10648x4d065f6d[StorageItemChange.Type.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10648x4d065f6d[StorageItemChange.Type.CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[StorageItemChange.Initiator.values().length];
            f10647x94c219dc = iArr2;
            try {
                iArr2[StorageItemChange.Initiator.SYNC_ENGINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10647x94c219dc[StorageItemChange.Initiator.DATA_STORE_API.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private ItemChangeMapper() {
    }

    public static <T extends Model> DataStoreItemChange<T> map(StorageItemChange<T> storageItemChange) {
        return DataStoreItemChange.builder().initiator(map(storageItemChange.initiator())).item(storageItemChange.item()).itemClass(storageItemChange.modelSchema().getModelClass()).type(map(storageItemChange.type())).uuid(storageItemChange.changeId().toString()).build();
    }

    private static DataStoreItemChange.Initiator map(StorageItemChange.Initiator initiator) throws DataStoreException {
        int i = C105591.f10647x94c219dc[initiator.ordinal()];
        if (i == 1) {
            return DataStoreItemChange.Initiator.REMOTE;
        }
        if (i == 2) {
            return DataStoreItemChange.Initiator.LOCAL;
        }
        throw new DataStoreException("Unknown initiator of storage change: " + initiator, "Sorry, we don’t have a recovery suggestion for this error.");
    }

    private static DataStoreItemChange.Type map(StorageItemChange.Type type2) throws DataStoreException {
        int i = C105591.f10648x4d065f6d[type2.ordinal()];
        if (i == 1) {
            return DataStoreItemChange.Type.DELETE;
        }
        if (i == 2) {
            return DataStoreItemChange.Type.UPDATE;
        }
        if (i == 3) {
            return DataStoreItemChange.Type.CREATE;
        }
        throw new DataStoreException("Unknown type of storage change: " + type2, "Sorry, we don’t have a recovery suggestion for this error.");
    }
}
