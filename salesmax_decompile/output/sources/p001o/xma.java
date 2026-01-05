package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class xma {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final iia lock;
    private final zma map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public xma(int i) {
        this.maxSize = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.map = new zma(0, 0.75f);
        this.lock = new iia();
    }

    /* renamed from: a */
    public final int m56473a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object obj) {
        Object objM59614d;
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        synchronized (this.lock) {
            Object objM59611a = this.map.m59611a(obj);
            if (objM59611a != null) {
                this.hitCount++;
                return objM59611a;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                objM59614d = this.map.m59614d(obj, objCreate);
                if (objM59614d != null) {
                    this.map.m59614d(obj, objM59614d);
                } else {
                    this.size += m56473a(obj, objCreate);
                    y3i y3iVar = y3i.f54824a;
                }
            }
            if (objM59614d != null) {
                entryRemoved(false, obj, objCreate, objM59614d);
                return objM59614d;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        Object objM59614d;
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += m56473a(obj, obj2);
            objM59614d = this.map.m59614d(obj, obj2);
            if (objM59614d != null) {
                this.size -= m56473a(obj, objM59614d);
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (objM59614d != null) {
            entryRemoved(false, obj, objM59614d, obj2);
        }
        trimToSize(this.maxSize);
        return objM59614d;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object obj) {
        Object objM59615e;
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        synchronized (this.lock) {
            objM59615e = this.map.m59615e(obj);
            if (objM59615e != null) {
                this.size -= m56473a(obj, objM59615e);
            }
            y3i y3iVar = y3i.f54824a;
        }
        if (objM59615e != null) {
            entryRemoved(false, obj, objM59615e, null);
        }
        return objM59615e;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.lock) {
            this.maxSize = i;
            y3i y3iVar = y3i.f54824a;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(Object obj, Object obj2) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            for (Map.Entry entry : this.map.m59612b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            y3i y3iVar = y3i.f54824a;
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i = this.hitCount;
            int i2 = this.missCount + i;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                if (!(this.size >= 0 && (!this.map.m59613c() || this.size == 0))) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
                }
                if (this.size <= i || this.map.m59613c()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) kh3.g0(this.map.m59612b());
                if (entry == null) {
                    return;
                }
                key = entry.getKey();
                value = entry.getValue();
                this.map.m59615e(key);
                this.size -= m56473a(key, value);
                this.evictionCount++;
            }
            entryRemoved(true, key, value, null);
        }
    }
}
