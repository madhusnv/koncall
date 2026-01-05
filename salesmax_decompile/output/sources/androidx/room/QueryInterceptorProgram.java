package androidx.room;

import java.util.ArrayList;
import java.util.List;
import p001o.neg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements neg {
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i2) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i2, obj);
    }

    @Override // p001o.neg
    public void bindBlob(int i, byte[] bArr) {
        sq8.m48649h(bArr, "value");
        saveArgsToCache(i, bArr);
    }

    @Override // p001o.neg
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
    }

    @Override // p001o.neg
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
    }

    @Override // p001o.neg
    public void bindNull(int i) {
        saveArgsToCache(i, null);
    }

    @Override // p001o.neg
    public void bindString(int i, String str) {
        sq8.m48649h(str, "value");
        saveArgsToCache(i, str);
    }

    @Override // p001o.neg
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }
}
