package androidx.room;

import java.util.Iterator;
import p001o.peg;
import p001o.sq8;

/* loaded from: classes2.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        sq8.m48649h(roomDatabase, "database");
    }

    public abstract void bind(peg pegVar, T t);

    @Override // androidx.room.SharedSQLiteStatement
    public abstract String createQuery();

    public final int handle(T t) {
        peg pegVarAcquire = acquire();
        try {
            bind(pegVarAcquire, t);
            return pegVarAcquire.executeUpdateDelete();
        } finally {
            release(pegVarAcquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        sq8.m48649h(iterable, "entities");
        peg pegVarAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(pegVarAcquire, it.next());
                iExecuteUpdateDelete += pegVarAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(pegVarAcquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        peg pegVarAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t : tArr) {
                bind(pegVarAcquire, t);
                iExecuteUpdateDelete += pegVarAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(pegVarAcquire);
        }
    }
}
