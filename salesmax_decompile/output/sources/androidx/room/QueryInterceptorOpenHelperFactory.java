package androidx.room;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import p001o.meg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class QueryInterceptorOpenHelperFactory implements meg.InterfaceC15303c {
    private final meg.InterfaceC15303c delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelperFactory(meg.InterfaceC15303c interfaceC15303c, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        sq8.m48649h(interfaceC15303c, "delegate");
        sq8.m48649h(executor, "queryCallbackExecutor");
        sq8.m48649h(queryCallback, "queryCallback");
        this.delegate = interfaceC15303c;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
    }

    @Override // p001o.meg.InterfaceC15303c
    public meg create(meg.C15302b c15302b) {
        sq8.m48649h(c15302b, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(c15302b), this.queryCallbackExecutor, this.queryCallback);
    }
}
