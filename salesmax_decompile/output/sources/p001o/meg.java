package p001o;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public interface meg extends Closeable {

    /* renamed from: o.meg$a */
    public static abstract class AbstractC15301a {
        public static final a Companion = new a(null);
        private static final String TAG = "SupportSQLite";
        public final int version;

        /* renamed from: o.meg$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public AbstractC15301a(int i) {
            this.version = i;
        }

        /* renamed from: a */
        public final void m38855a(String str) {
            if (e9g.m24606x(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = sq8.m48651j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("deleting the database file: ");
            sb.append(str);
            try {
                geg.m28532c(new File(str));
            } catch (Exception unused) {
            }
        }

        public void onConfigure(leg legVar) {
            sq8.m48649h(legVar, "db");
        }

        public void onCorruption(leg legVar) {
            sq8.m48649h(legVar, "db");
            StringBuilder sb = new StringBuilder();
            sb.append("Corruption reported by sqlite on database: ");
            sb.append(legVar);
            sb.append(".path");
            if (!legVar.isOpen()) {
                String path = legVar.getPath();
                if (path != null) {
                    m38855a(path);
                    return;
                }
                return;
            }
            List attachedDbs = null;
            try {
                try {
                    attachedDbs = legVar.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    legVar.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            } finally {
                if (attachedDbs != null) {
                    Iterator it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        sq8.m48648g(obj, "p.second");
                        m38855a((String) obj);
                    }
                } else {
                    String path2 = legVar.getPath();
                    if (path2 != null) {
                        m38855a(path2);
                    }
                }
            }
        }

        public abstract void onCreate(leg legVar);

        public void onDowngrade(leg legVar, int i, int i2) {
            sq8.m48649h(legVar, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onOpen(leg legVar) {
            sq8.m48649h(legVar, "db");
        }

        public abstract void onUpgrade(leg legVar, int i, int i2);
    }

    /* renamed from: o.meg$b */
    public static final class C15302b {

        /* renamed from: f */
        public static final b f35294f = new b(null);

        /* renamed from: a */
        public final Context f35295a;

        /* renamed from: b */
        public final String f35296b;

        /* renamed from: c */
        public final AbstractC15301a f35297c;

        /* renamed from: d */
        public final boolean f35298d;

        /* renamed from: e */
        public final boolean f35299e;

        /* renamed from: o.meg$b$a */
        public static class a {

            /* renamed from: a */
            public final Context f35300a;

            /* renamed from: b */
            public String f35301b;

            /* renamed from: c */
            public AbstractC15301a f35302c;

            /* renamed from: d */
            public boolean f35303d;

            /* renamed from: e */
            public boolean f35304e;

            public a(Context context) {
                sq8.m48649h(context, "context");
                this.f35300a = context;
            }

            /* renamed from: a */
            public a m38857a(boolean z) {
                this.f35304e = z;
                return this;
            }

            /* renamed from: b */
            public C15302b m38858b() {
                AbstractC15301a abstractC15301a = this.f35302c;
                if (abstractC15301a == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                boolean z = true;
                if (this.f35303d) {
                    String str = this.f35301b;
                    if (str == null || str.length() == 0) {
                        z = false;
                    }
                }
                if (z) {
                    return new C15302b(this.f35300a, this.f35301b, abstractC15301a, this.f35303d, this.f35304e);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
            }

            /* renamed from: c */
            public a m38859c(AbstractC15301a abstractC15301a) {
                sq8.m48649h(abstractC15301a, "callback");
                this.f35302c = abstractC15301a;
                return this;
            }

            /* renamed from: d */
            public a m38860d(String str) {
                this.f35301b = str;
                return this;
            }

            /* renamed from: e */
            public a m38861e(boolean z) {
                this.f35303d = z;
                return this;
            }
        }

        /* renamed from: o.meg$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final a m38862a(Context context) {
                sq8.m48649h(context, "context");
                return new a(context);
            }
        }

        public C15302b(Context context, String str, AbstractC15301a abstractC15301a, boolean z, boolean z2) {
            sq8.m48649h(context, "context");
            sq8.m48649h(abstractC15301a, "callback");
            this.f35295a = context;
            this.f35296b = str;
            this.f35297c = abstractC15301a;
            this.f35298d = z;
            this.f35299e = z2;
        }

        /* renamed from: a */
        public static final a m38856a(Context context) {
            return f35294f.m38862a(context);
        }
    }

    /* renamed from: o.meg$c */
    public interface InterfaceC15303c {
        meg create(C15302b c15302b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    leg getReadableDatabase();

    leg getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
