package com.amplifyframework.storage;

import a2.AbstractC0030c;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.sun.mail.util.AbstractC1452a;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageItem {
    private final String eTag;
    private final String key;
    private final Date lastModified;
    private final String path;
    private final Object pluginResults;
    private final long size;

    @InternalAmplifyApi
    public StorageItem(String path, String key, long j6, Date lastModified, String eTag, Object obj) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(lastModified, "lastModified");
        AbstractC4154l.m8923f(eTag, "eTag");
        this.path = path;
        this.key = key;
        this.size = j6;
        this.lastModified = lastModified;
        this.eTag = eTag;
        this.pluginResults = obj;
    }

    public static /* synthetic */ StorageItem copy$default(StorageItem storageItem, String str, String str2, long j6, Date date, String str3, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = storageItem.path;
        }
        if ((i10 & 2) != 0) {
            str2 = storageItem.key;
        }
        if ((i10 & 4) != 0) {
            j6 = storageItem.size;
        }
        if ((i10 & 8) != 0) {
            date = storageItem.lastModified;
        }
        if ((i10 & 16) != 0) {
            str3 = storageItem.eTag;
        }
        if ((i10 & 32) != 0) {
            obj = storageItem.pluginResults;
        }
        Object obj3 = obj;
        Date date2 = date;
        long j10 = j6;
        return storageItem.copy(str, str2, j10, date2, str3, obj3);
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

    public final StorageItem copy(String path, String key, long j6, Date lastModified, String eTag, Object obj) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(lastModified, "lastModified");
        AbstractC4154l.m8923f(eTag, "eTag");
        return new StorageItem(path, key, j6, lastModified, eTag, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageItem)) {
            return false;
        }
        StorageItem storageItem = (StorageItem) obj;
        return AbstractC4154l.m8918a(this.path, storageItem.path) && AbstractC4154l.m8918a(this.key, storageItem.key) && this.size == storageItem.size && AbstractC4154l.m8918a(this.lastModified, storageItem.lastModified) && AbstractC4154l.m8918a(this.eTag, storageItem.eTag) && AbstractC4154l.m8918a(this.pluginResults, storageItem.pluginResults);
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
        int iM113d = AbstractC0030c.m113d((this.lastModified.hashCode() + AbstractC1452a.m4557d(AbstractC0030c.m113d(this.path.hashCode() * 31, 31, this.key), 31, this.size)) * 31, 31, this.eTag);
        Object obj = this.pluginResults;
        return iM113d + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        String str = this.path;
        String str2 = this.key;
        long j6 = this.size;
        Date date = this.lastModified;
        String str3 = this.eTag;
        Object obj = this.pluginResults;
        StringBuilder sbM127r = AbstractC0030c.m127r("StorageItem(path=", str, ", key=", str2, ", size=");
        sbM127r.append(j6);
        sbM127r.append(", lastModified=");
        sbM127r.append(date);
        sbM127r.append(", eTag=");
        sbM127r.append(str3);
        sbM127r.append(", pluginResults=");
        sbM127r.append(obj);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6353c
    public StorageItem(String key, long j6, Date lastModified, String eTag, Object obj) {
        this(key, key, j6, lastModified, eTag, obj);
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(lastModified, "lastModified");
        AbstractC4154l.m8923f(eTag, "eTag");
    }

    @InterfaceC6353c
    public static /* synthetic */ void getKey$annotations() {
    }
}
