package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p001o.gi9;
import p001o.peg;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock;
    private final gi9 stmt$delegate;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        sq8.m48649h(roomDatabase, "database");
        this.database = roomDatabase;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = si9.m48360a(new SharedSQLiteStatement$stmt$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final peg createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final peg getStmt() {
        return (peg) this.stmt$delegate.getValue();
    }

    public peg acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(peg pegVar) {
        sq8.m48649h(pegVar, "statement");
        if (pegVar == getStmt()) {
            this.lock.set(false);
        }
    }

    private final peg getStmt(boolean z) {
        return z ? getStmt() : createNewStatement();
    }
}
