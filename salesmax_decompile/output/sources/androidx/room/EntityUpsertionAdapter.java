package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.bh3;
import p001o.f9g;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> entityInsertionAdapter, EntityDeletionOrUpdateAdapter<T> entityDeletionOrUpdateAdapter) {
        sq8.m48649h(entityInsertionAdapter, "insertionAdapter");
        sq8.m48649h(entityDeletionOrUpdateAdapter, "updateAdapter");
        this.insertionAdapter = entityInsertionAdapter;
        this.updateAdapter = entityDeletionOrUpdateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        boolean z = true;
        if (!f9g.m26304N(message, "unique", true) && !f9g.m26306P(message, "2067", false, 2, null) && !f9g.m26306P(message, "1555", false, 2, null)) {
            z = false;
        }
        if (!z) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T t) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(t);
        }
    }

    public final long upsertAndReturnId(T t) {
        try {
            return this.insertionAdapter.insertAndReturnId(t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(t);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] tArr) {
        long jInsertAndReturnId;
        sq8.m48649h(tArr, "entities");
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(tArr[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(tArr[i]);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] tArr) {
        long jInsertAndReturnId;
        sq8.m48649h(tArr, "entities");
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(tArr[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(tArr[i]);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        List listM18961c = bh3.m18961c();
        for (T t : tArr) {
            try {
                listM18961c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                listM18961c.add(-1L);
            }
        }
        return bh3.m18959a(listM18961c);
    }

    public final void upsert(T[] tArr) {
        sq8.m48649h(tArr, "entities");
        for (T t : tArr) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> collection) {
        long jInsertAndReturnId;
        sq8.m48649h(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        long jInsertAndReturnId;
        sq8.m48649h(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(Iterable<? extends T> iterable) {
        sq8.m48649h(iterable, "entities");
        for (T t : iterable) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> collection) {
        sq8.m48649h(collection, "entities");
        List listM18961c = bh3.m18961c();
        for (T t : collection) {
            try {
                listM18961c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                listM18961c.add(-1L);
            }
        }
        return bh3.m18959a(listM18961c);
    }
}
