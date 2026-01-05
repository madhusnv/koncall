package androidx.room;

import androidx.room.QueryInterceptorStatement;
import androidx.room.RoomDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.peg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements peg {
    private final List<Object> bindArgsCache;
    private final peg delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;
    private final String sqlStatement;

    public QueryInterceptorStatement(peg pegVar, String str, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        sq8.m48649h(pegVar, "delegate");
        sq8.m48649h(str, "sqlStatement");
        sq8.m48649h(executor, "queryCallbackExecutor");
        sq8.m48649h(queryCallback, "queryCallback");
        this.delegate = pegVar;
        this.sqlStatement = str;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(QueryInterceptorStatement queryInterceptorStatement) {
        sq8.m48649h(queryInterceptorStatement, "this$0");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement queryInterceptorStatement) {
        sq8.m48649h(queryInterceptorStatement, "this$0");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement queryInterceptorStatement) {
        sq8.m48649h(queryInterceptorStatement, "this$0");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    private final void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size()) {
            int size = (i2 - this.bindArgsCache.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement queryInterceptorStatement) {
        sq8.m48649h(queryInterceptorStatement, "this$0");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement queryInterceptorStatement) {
        sq8.m48649h(queryInterceptorStatement, "this$0");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    @Override // p001o.neg
    public void bindBlob(int i, byte[] bArr) {
        sq8.m48649h(bArr, "value");
        saveArgsToCache(i, bArr);
        this.delegate.bindBlob(i, bArr);
    }

    @Override // p001o.neg
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.delegate.bindDouble(i, d);
    }

    @Override // p001o.neg
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.delegate.bindLong(i, j);
    }

    @Override // p001o.neg
    public void bindNull(int i) {
        saveArgsToCache(i, null);
        this.delegate.bindNull(i);
    }

    @Override // p001o.neg
    public void bindString(int i, String str) {
        sq8.m48649h(str, "value");
        saveArgsToCache(i, str);
        this.delegate.bindString(i, str);
    }

    @Override // p001o.neg
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // p001o.peg
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.x4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.execute$lambda$0(this.f53188a);
            }
        });
        this.delegate.execute();
    }

    @Override // p001o.peg
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.y4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(this.f54878a);
            }
        });
        return this.delegate.executeInsert();
    }

    @Override // p001o.peg
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.w4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(this.f51467a);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    @Override // p001o.peg
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.a5e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(this.f14159a);
            }
        });
        return this.delegate.simpleQueryForLong();
    }

    @Override // p001o.peg
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: o.z4e
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForString$lambda$4(this.f56519a);
            }
        });
        return this.delegate.simpleQueryForString();
    }
}
