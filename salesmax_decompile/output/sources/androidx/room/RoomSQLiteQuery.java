package androidx.room;

import com.google.android.gms.actions.SearchIntents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p001o.id5;
import p001o.neg;
import p001o.oeg;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class RoomSQLiteQuery implements oeg, neg {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Binding {
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }

        public final RoomSQLiteQuery acquire(String str, int i) {
            sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    y3i y3iVar = y3i.f54824a;
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i, null);
                    roomSQLiteQuery.init(str, i);
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery value = entryCeilingEntry.getValue();
                value.init(str, i);
                sq8.m48648g(value, "sqliteQuery");
                return value;
            }
        }

        public final RoomSQLiteQuery copyFrom(oeg oegVar) {
            sq8.m48649h(oegVar, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(oegVar.getSql(), oegVar.getArgCount());
            oegVar.bindTo(new neg() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // p001o.neg
                public void bindBlob(int i, byte[] bArr) {
                    sq8.m48649h(bArr, "value");
                    roomSQLiteQueryAcquire.bindBlob(i, bArr);
                }

                @Override // p001o.neg
                public void bindDouble(int i, double d) {
                    roomSQLiteQueryAcquire.bindDouble(i, d);
                }

                @Override // p001o.neg
                public void bindLong(int i, long j) {
                    roomSQLiteQueryAcquire.bindLong(i, j);
                }

                @Override // p001o.neg
                public void bindNull(int i) {
                    roomSQLiteQueryAcquire.bindNull(i);
                }

                @Override // p001o.neg
                public void bindString(int i, String str) {
                    sq8.m48649h(str, "value");
                    roomSQLiteQueryAcquire.bindString(i, str);
                }

                @Override // p001o.neg
                public void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            sq8.m48648g(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }
    }

    public /* synthetic */ RoomSQLiteQuery(int i, id5 id5Var) {
        this(i);
    }

    public static final RoomSQLiteQuery acquire(String str, int i) {
        return Companion.acquire(str, i);
    }

    public static final RoomSQLiteQuery copyFrom(oeg oegVar) {
        return Companion.copyFrom(oegVar);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // p001o.neg
    public void bindBlob(int i, byte[] bArr) {
        sq8.m48649h(bArr, "value");
        this.bindingTypes[i] = 5;
        this.blobBindings[i] = bArr;
    }

    @Override // p001o.neg
    public void bindDouble(int i, double d) {
        this.bindingTypes[i] = 3;
        this.doubleBindings[i] = d;
    }

    @Override // p001o.neg
    public void bindLong(int i, long j) {
        this.bindingTypes[i] = 2;
        this.longBindings[i] = j;
    }

    @Override // p001o.neg
    public void bindNull(int i) {
        this.bindingTypes[i] = 1;
    }

    @Override // p001o.neg
    public void bindString(int i, String str) {
        sq8.m48649h(str, "value");
        this.bindingTypes[i] = 4;
        this.stringBindings[i] = str;
    }

    @Override // p001o.oeg
    public void bindTo(neg negVar) {
        sq8.m48649h(negVar, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                negVar.bindNull(i);
            } else if (i2 == 2) {
                negVar.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                negVar.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                negVar.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                negVar.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p001o.neg
    public void clearBindings() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(RoomSQLiteQuery roomSQLiteQuery) {
        sq8.m48649h(roomSQLiteQuery, "other");
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        System.arraycopy(roomSQLiteQuery.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(roomSQLiteQuery.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // p001o.oeg
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // p001o.oeg
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void init(String str, int i) {
        sq8.m48649h(str, SearchIntents.EXTRA_QUERY);
        this.query = str;
        this.argCount = i;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            y3i y3iVar = y3i.f54824a;
        }
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2][];
    }
}
