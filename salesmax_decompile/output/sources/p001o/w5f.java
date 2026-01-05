package p001o;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class w5f extends SQLiteOpenHelper {

    /* renamed from: c */
    public static final String f51503c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    public static int f51504d = 5;

    /* renamed from: e */
    public static final InterfaceC17783a f51505e;

    /* renamed from: f */
    public static final InterfaceC17783a f51506f;

    /* renamed from: g */
    public static final InterfaceC17783a f51507g;

    /* renamed from: h */
    public static final InterfaceC17783a f51508h;

    /* renamed from: q */
    public static final InterfaceC17783a f51509q;

    /* renamed from: s */
    public static final List f51510s;

    /* renamed from: a */
    public final int f51511a;

    /* renamed from: b */
    public boolean f51512b;

    /* renamed from: o.w5f$a */
    public interface InterfaceC17783a {
        /* renamed from: a */
        void mo46247a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        InterfaceC17783a interfaceC17783a = new InterfaceC17783a() { // from class: o.r5f
            @Override // p001o.w5f.InterfaceC17783a
            /* renamed from: a */
            public final void mo46247a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                w5f.m53979k(sQLiteDatabase);
            }
        };
        f51505e = interfaceC17783a;
        InterfaceC17783a interfaceC17783a2 = new InterfaceC17783a() { // from class: o.s5f
            @Override // p001o.w5f.InterfaceC17783a
            /* renamed from: a */
            public final void mo46247a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                w5f.m53980o(sQLiteDatabase);
            }
        };
        f51506f = interfaceC17783a2;
        InterfaceC17783a interfaceC17783a3 = new InterfaceC17783a() { // from class: o.t5f
            @Override // p001o.w5f.InterfaceC17783a
            /* renamed from: a */
            public final void mo46247a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f51507g = interfaceC17783a3;
        InterfaceC17783a interfaceC17783a4 = new InterfaceC17783a() { // from class: o.u5f
            @Override // p001o.w5f.InterfaceC17783a
            /* renamed from: a */
            public final void mo46247a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                w5f.m53982s(sQLiteDatabase);
            }
        };
        f51508h = interfaceC17783a4;
        InterfaceC17783a interfaceC17783a5 = new InterfaceC17783a() { // from class: o.v5f
            @Override // p001o.w5f.InterfaceC17783a
            /* renamed from: a */
            public final void mo46247a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                w5f.m53983t(sQLiteDatabase);
            }
        };
        f51509q = interfaceC17783a5;
        f51510s = Arrays.asList(interfaceC17783a, interfaceC17783a2, interfaceC17783a3, interfaceC17783a4, interfaceC17783a5);
    }

    public w5f(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f51512b = false;
        this.f51511a = i;
    }

    /* renamed from: k */
    public static /* synthetic */ void m53979k(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: o */
    public static /* synthetic */ void m53980o(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: s */
    public static /* synthetic */ void m53982s(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: t */
    public static /* synthetic */ void m53983t(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f51503c);
    }

    /* renamed from: C */
    public final void m53984C(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = f51510s;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((InterfaceC17783a) f51510s.get(i)).mo46247a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: h */
    public final void m53985h(SQLiteDatabase sQLiteDatabase) {
        if (this.f51512b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f51512b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m53986u(sQLiteDatabase, this.f51511a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m53986u(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m53985h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m53985h(sQLiteDatabase);
        m53984C(sQLiteDatabase, i, i2);
    }

    /* renamed from: u */
    public final void m53986u(SQLiteDatabase sQLiteDatabase, int i) {
        m53985h(sQLiteDatabase);
        m53984C(sQLiteDatabase, 0, i);
    }
}
