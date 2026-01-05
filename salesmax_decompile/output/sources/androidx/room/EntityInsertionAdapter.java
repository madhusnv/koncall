package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.bh3;
import p001o.ch3;
import p001o.peg;
import p001o.qo0;
import p001o.sq8;

/* loaded from: classes2.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        sq8.m48649h(roomDatabase, "database");
    }

    public abstract void bind(peg pegVar, T t);

    public final void insert(T t) {
        peg pegVarAcquire = acquire();
        try {
            bind(pegVarAcquire, t);
            pegVarAcquire.executeInsert();
        } finally {
            release(pegVarAcquire);
        }
    }

    public final long insertAndReturnId(T t) {
        peg pegVarAcquire = acquire();
        try {
            bind(pegVarAcquire, t);
            return pegVarAcquire.executeInsert();
        } finally {
            release(pegVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        sq8.m48649h(collection, "entities");
        peg pegVarAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                bind(pegVarAcquire, t);
                jArr[i] = pegVarAcquire.executeInsert();
                i = i2;
            }
            return jArr;
        } finally {
            release(pegVarAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        sq8.m48649h(collection, "entities");
        peg pegVarAcquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(pegVarAcquire, it.next());
                lArr[i] = Long.valueOf(pegVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(pegVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        peg pegVarAcquire = acquire();
        try {
            List listM18961c = bh3.m18961c();
            for (T t : tArr) {
                bind(pegVarAcquire, t);
                listM18961c.add(Long.valueOf(pegVarAcquire.executeInsert()));
            }
            return bh3.m18959a(listM18961c);
        } finally {
            release(pegVarAcquire);
        }
    }

    public final void insert(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        peg pegVarAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(pegVarAcquire, t);
                pegVarAcquire.executeInsert();
            }
        } finally {
            release(pegVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        peg pegVarAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(pegVarAcquire, tArr[i]);
                jArr[i2] = pegVarAcquire.executeInsert();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(pegVarAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        peg pegVarAcquire = acquire();
        Iterator itM45707a = qo0.m45707a(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(pegVarAcquire, itM45707a.next());
                lArr[i] = Long.valueOf(pegVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(pegVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        sq8.m48649h(collection, "entities");
        peg pegVarAcquire = acquire();
        try {
            List listM18961c = bh3.m18961c();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(pegVarAcquire, it.next());
                listM18961c.add(Long.valueOf(pegVarAcquire.executeInsert()));
            }
            return bh3.m18959a(listM18961c);
        } finally {
            release(pegVarAcquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        sq8.m48649h(iterable, "entities");
        peg pegVarAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(pegVarAcquire, it.next());
                pegVarAcquire.executeInsert();
            }
        } finally {
            release(pegVarAcquire);
        }
    }
}
