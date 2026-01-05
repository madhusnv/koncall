package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import p001o.leg;
import p001o.meg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class QueryInterceptorOpenHelper implements meg, DelegatingOpenHelper {
    private final meg delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelper(meg megVar, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        sq8.m48649h(megVar, "delegate");
        sq8.m48649h(executor, "queryCallbackExecutor");
        sq8.m48649h(queryCallback, "queryCallback");
        this.delegate = megVar;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
    }

    @Override // p001o.meg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // p001o.meg
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public meg getDelegate() {
        return this.delegate;
    }

    @Override // p001o.meg
    public leg getReadableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getReadableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // p001o.meg
    public leg getWritableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getWritableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // p001o.meg
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.delegate.setWriteAheadLoggingEnabled(z);
    }
}
