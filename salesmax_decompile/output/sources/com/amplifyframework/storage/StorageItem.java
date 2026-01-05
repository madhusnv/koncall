package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Date;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class StorageItem {
    private final String eTag;
    private final String key;
    private final Date lastModified;
    private final String path;
    private final Object pluginResults;
    private final long size;

    @InternalAmplifyApi
    public StorageItem(String str, String str2, long j, Date date, String str3, Object obj) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(date, "lastModified");
        sq8.m48649h(str3, "eTag");
        this.path = str;
        this.key = str2;
        this.size = j;
        this.lastModified = date;
        this.eTag = str3;
        this.pluginResults = obj;
    }

    public static /* synthetic */ StorageItem copy$default(StorageItem storageItem, String str, String str2, long j, Date date, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = storageItem.path;
        }
        if ((i & 2) != 0) {
            str2 = storageItem.key;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = storageItem.size;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            date = storageItem.lastModified;
        }
        Date date2 = date;
        if ((i & 16) != 0) {
            str3 = storageItem.eTag;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            obj = storageItem.pluginResults;
        }
        return storageItem.copy(str, str4, j2, date2, str5, obj);
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.key;
    }

    public final long component3() {
        return this.size;
    }

    public final Date component4() {
        return this.lastModified;
    }

    public final String component5() {
        return this.eTag;
    }

    public final Object component6() {
        return this.pluginResults;
    }

    public final StorageItem copy(String str, String str2, long j, Date date, String str3, Object obj) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        sq8.m48649h(date, "lastModified");
        sq8.m48649h(str3, "eTag");
        return new StorageItem(str, str2, j, date, str3, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageItem)) {
            return false;
        }
        StorageItem storageItem = (StorageItem) obj;
        return sq8.m48644c(this.path, storageItem.path) && sq8.m48644c(this.key, storageItem.key) && this.size == storageItem.size && sq8.m48644c(this.lastModified, storageItem.lastModified) && sq8.m48644c(this.eTag, storageItem.eTag) && sq8.m48644c(this.pluginResults, storageItem.pluginResults);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final String getKey() {
        return this.key;
    }

    public final Date getLastModified() {
        return this.lastModified;
    }

    public final String getPath() {
        return this.path;
    }

    public final Object getPluginResults() {
        return this.pluginResults;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.path.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.lastModified.hashCode()) * 31) + this.eTag.hashCode()) * 31;
        Object obj = this.pluginResults;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "StorageItem(path=" + this.path + ", key=" + this.key + ", size=" + this.size + ", lastModified=" + this.lastModified + ", eTag=" + this.eTag + ", pluginResults=" + this.pluginResults + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StorageItem(String str, long j, Date date, String str2, Object obj) {
        this(str, str, j, date, str2, obj);
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(date, "lastModified");
        sq8.m48649h(str2, "eTag");
    }
}
