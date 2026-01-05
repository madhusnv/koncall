package p001o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import p001o.meg;
import p001o.mk7;

/* loaded from: classes2.dex */
public final class mk7 implements meg {

    /* renamed from: h */
    public static final C15348a f35600h = new C15348a(null);

    /* renamed from: a */
    public final Context f35601a;

    /* renamed from: b */
    public final String f35602b;

    /* renamed from: c */
    public final meg.AbstractC15301a f35603c;

    /* renamed from: d */
    public final boolean f35604d;

    /* renamed from: e */
    public final boolean f35605e;

    /* renamed from: f */
    public final gi9 f35606f;

    /* renamed from: g */
    public boolean f35607g;

    /* renamed from: o.mk7$a */
    public static final class C15348a {
        public C15348a() {
        }

        public /* synthetic */ C15348a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.mk7$b */
    public static final class C15349b {

        /* renamed from: a */
        public lk7 f35608a;

        public C15349b(lk7 lk7Var) {
            this.f35608a = lk7Var;
        }

        /* renamed from: a */
        public final lk7 m39280a() {
            return this.f35608a;
        }

        /* renamed from: b */
        public final void m39281b(lk7 lk7Var) {
            this.f35608a = lk7Var;
        }
    }

    /* renamed from: o.mk7$c */
    public static final class C15350c extends SQLiteOpenHelper {

        /* renamed from: h */
        public static final c f35609h = new c(null);

        /* renamed from: a */
        public final Context f35610a;

        /* renamed from: b */
        public final C15349b f35611b;

        /* renamed from: c */
        public final meg.AbstractC15301a f35612c;

        /* renamed from: d */
        public final boolean f35613d;

        /* renamed from: e */
        public boolean f35614e;

        /* renamed from: f */
        public final rid f35615f;

        /* renamed from: g */
        public boolean f35616g;

        /* renamed from: o.mk7$c$a */
        public static final class a extends RuntimeException {

            /* renamed from: a */
            public final b f35617a;

            /* renamed from: b */
            public final Throwable f35618b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                sq8.m48649h(bVar, "callbackName");
                sq8.m48649h(th, "cause");
                this.f35617a = bVar;
                this.f35618b = th;
            }

            /* renamed from: a */
            public final b m39288a() {
                return this.f35617a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f35618b;
            }
        }

        /* renamed from: o.mk7$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: o.mk7$c$c */
        public static final class c {
            public c() {
            }

            public /* synthetic */ c(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final lk7 m39289a(C15349b c15349b, SQLiteDatabase sQLiteDatabase) {
                sq8.m48649h(c15349b, "refHolder");
                sq8.m48649h(sQLiteDatabase, "sqLiteDatabase");
                lk7 lk7VarM39280a = c15349b.m39280a();
                if (lk7VarM39280a != null && lk7VarM39280a.m37373d(sQLiteDatabase)) {
                    return lk7VarM39280a;
                }
                lk7 lk7Var = new lk7(sQLiteDatabase);
                c15349b.m39281b(lk7Var);
                return lk7Var;
            }
        }

        /* renamed from: o.mk7$c$d */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35619a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f35619a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15350c(Context context, String str, final C15349b c15349b, final meg.AbstractC15301a abstractC15301a, boolean z) {
            super(context, str, null, abstractC15301a.version, new DatabaseErrorHandler() { // from class: o.nk7
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    mk7.C15350c.m39283c(abstractC15301a, c15349b, sQLiteDatabase);
                }
            });
            sq8.m48649h(context, "context");
            sq8.m48649h(c15349b, "dbRef");
            sq8.m48649h(abstractC15301a, "callback");
            this.f35610a = context;
            this.f35611b = c15349b;
            this.f35612c = abstractC15301a;
            this.f35613d = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                sq8.m48648g(str, "randomUUID().toString()");
            }
            this.f35615f = new rid(str, context.getCacheDir(), false);
        }

        /* renamed from: c */
        public static final void m39283c(meg.AbstractC15301a abstractC15301a, C15349b c15349b, SQLiteDatabase sQLiteDatabase) {
            sq8.m48649h(abstractC15301a, "$callback");
            sq8.m48649h(c15349b, "$dbRef");
            c cVar = f35609h;
            sq8.m48648g(sQLiteDatabase, "dbObj");
            abstractC15301a.onCorruption(cVar.m39289a(c15349b, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                rid.m46831c(this.f35615f, false, 1, null);
                super.close();
                this.f35611b.m39281b(null);
                this.f35616g = false;
            } finally {
                this.f35615f.m46833d();
            }
        }

        /* renamed from: d */
        public final leg m39284d(boolean z) throws IOException {
            try {
                this.f35615f.m46832b((this.f35616g || getDatabaseName() == null) ? false : true);
                this.f35614e = false;
                SQLiteDatabase sQLiteDatabaseM39287h = m39287h(z);
                if (!this.f35614e) {
                    return m39285f(sQLiteDatabaseM39287h);
                }
                close();
                return m39284d(z);
            } finally {
                this.f35615f.m46833d();
            }
        }

        /* renamed from: f */
        public final lk7 m39285f(SQLiteDatabase sQLiteDatabase) {
            sq8.m48649h(sQLiteDatabase, "sqLiteDatabase");
            return f35609h.m39289a(this.f35611b, sQLiteDatabase);
        }

        /* renamed from: g */
        public final SQLiteDatabase m39286g(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                sq8.m48648g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            sq8.m48648g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* renamed from: h */
        public final SQLiteDatabase m39287h(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.f35616g;
            if (databaseName != null && !z2 && (parentFile = this.f35610a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid database parent file, not a directory: ");
                    sb.append(parentFile);
                }
            }
            try {
                return m39286g(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m39286g(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i = d.f35619a[aVar.m39288a().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f35613d) {
                        throw th;
                    }
                    this.f35610a.deleteDatabase(databaseName);
                    try {
                        return m39286g(z);
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sq8.m48649h(sQLiteDatabase, "db");
            if (!this.f35614e && this.f35612c.version != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f35612c.onConfigure(m39285f(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sq8.m48649h(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f35612c.onCreate(m39285f(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sq8.m48649h(sQLiteDatabase, "db");
            this.f35614e = true;
            try {
                this.f35612c.onDowngrade(m39285f(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            sq8.m48649h(sQLiteDatabase, "db");
            if (!this.f35614e) {
                try {
                    this.f35612c.onOpen(m39285f(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f35616g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sq8.m48649h(sQLiteDatabase, "sqLiteDatabase");
            this.f35614e = true;
            try {
                this.f35612c.onUpgrade(m39285f(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: o.mk7$d */
    public static final class C15351d extends kf9 implements uk7 {
        public C15351d() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C15350c invoke() {
            C15350c c15350c;
            if (mk7.this.f35602b == null || !mk7.this.f35604d) {
                c15350c = new C15350c(mk7.this.f35601a, mk7.this.f35602b, new C15349b(null), mk7.this.f35603c, mk7.this.f35605e);
            } else {
                c15350c = new C15350c(mk7.this.f35601a, new File(ieg.m31997a(mk7.this.f35601a), mk7.this.f35602b).getAbsolutePath(), new C15349b(null), mk7.this.f35603c, mk7.this.f35605e);
            }
            geg.m28537h(c15350c, mk7.this.f35607g);
            return c15350c;
        }
    }

    public mk7(Context context, String str, meg.AbstractC15301a abstractC15301a, boolean z, boolean z2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(abstractC15301a, "callback");
        this.f35601a = context;
        this.f35602b = str;
        this.f35603c = abstractC15301a;
        this.f35604d = z;
        this.f35605e = z2;
        this.f35606f = si9.m48360a(new C15351d());
    }

    @Override // p001o.meg, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f35606f.isInitialized()) {
            m39279k().close();
        }
    }

    @Override // p001o.meg
    public String getDatabaseName() {
        return this.f35602b;
    }

    @Override // p001o.meg
    public leg getReadableDatabase() {
        return m39279k().m39284d(false);
    }

    @Override // p001o.meg
    public leg getWritableDatabase() {
        return m39279k().m39284d(true);
    }

    /* renamed from: k */
    public final C15350c m39279k() {
        return (C15350c) this.f35606f.getValue();
    }

    @Override // p001o.meg
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f35606f.isInitialized()) {
            geg.m28537h(m39279k(), z);
        }
        this.f35607g = z;
    }
}
