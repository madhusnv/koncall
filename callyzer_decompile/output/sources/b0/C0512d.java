package b0;

import android.content.Context;
import android.content.Intent;
import b8.C0611f;
import b8.InterfaceC0607b;
import c0.h1;
import c8.C0898a;
import c8.C0899b;
import d8.AbstractC1655a;
import ge.C2581m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import jf.C3758a;
import k0.ExecutorC3900j;
import k8.InterfaceC4024a;
import k8.InterfaceC4025b;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import l8.C4429c;
import l8.InterfaceC4427a;
import l8.InterfaceC4430d;
import l8.InterfaceC4431e;
import mq.C4833a;
import nf.C5047i;
import nx.AbstractC5185w;
import og.mb;
import og.od;
import og.pe;
import p020v.C7599i;
import pg.a9;
import qw.C6361k;
import qw.C6363m;
import qw.C6364n;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import rw.C6668r;
import sw.C6957a;
import sw.C6959c;
import tb.C7105p;
import u8.C7353a;
import uw.InterfaceC7564h;
import y7.AbstractC8586u;
import z7.AbstractC8872a;
import z7.C8873b;
import z7.C8890s;
import z7.C8891t;
import z7.EnumC8893v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b0.d */
/* loaded from: classes.dex */
public final class C0512d {

    /* renamed from: a */
    public boolean f3574a;

    /* renamed from: b */
    public boolean f3575b;

    /* renamed from: c */
    public final Object f3576c;

    /* renamed from: d */
    public final Object f3577d;

    /* renamed from: e */
    public final Object f3578e;

    /* renamed from: f */
    public Object f3579f;

    /* renamed from: g */
    public Object f3580g;

    public C0512d(C8873b c8873b, C4833a c4833a) {
        EnumC8893v journalMode = c8873b.f42696g;
        this.f3576c = c8873b;
        this.f3577d = new C8890s(-1, "", "");
        List list = c8873b.f42694e;
        C6668r c6668r = C6668r.f31943a;
        this.f3578e = list == null ? c6668r : list;
        ArrayList arrayListM12753Q = AbstractC6663m.m12753Q(new C7353a(new C4833a(28, this)), list == null ? c6668r : list);
        Context context = c8873b.f42690a;
        String str = c8873b.f42691b;
        InterfaceC4430d interfaceC4430d = c8873b.f42692c;
        C2581m migrationContainer = c8873b.f42693d;
        boolean z6 = c8873b.f42695f;
        Executor queryExecutor = c8873b.f42697h;
        Executor transactionExecutor = c8873b.f42698i;
        Intent intent = c8873b.f42699j;
        boolean z10 = c8873b.f42700k;
        boolean z11 = c8873b.f42701l;
        Set set = c8873b.f42702m;
        String str2 = c8873b.f42703n;
        File file = c8873b.f42704o;
        Callable callable = c8873b.f42705p;
        List typeConverters = c8873b.f42706q;
        List autoMigrationSpecs = c8873b.f42707r;
        boolean z12 = c8873b.f42708s;
        InterfaceC4025b interfaceC4025b = c8873b.f42709t;
        InterfaceC7564h interfaceC7564h = c8873b.f42710u;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(migrationContainer, "migrationContainer");
        AbstractC4154l.m8923f(journalMode, "journalMode");
        AbstractC4154l.m8923f(queryExecutor, "queryExecutor");
        AbstractC4154l.m8923f(transactionExecutor, "transactionExecutor");
        AbstractC4154l.m8923f(typeConverters, "typeConverters");
        AbstractC4154l.m8923f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3579f = new C0899b(new C5047i((InterfaceC4431e) c4833a.invoke(new C8873b(context, str, interfaceC4430d, migrationContainer, arrayListM12753Q, z6, journalMode, queryExecutor, transactionExecutor, intent, z10, z11, set, str2, file, callable, typeConverters, autoMigrationSpecs, z12, interfaceC4025b, interfaceC7564h))));
        boolean z13 = journalMode == EnumC8893v.WRITE_AHEAD_LOGGING;
        InterfaceC4431e interfaceC4431eM1508c = m1508c();
        if (interfaceC4431eM1508c != null) {
            interfaceC4431eM1508c.setWriteAheadLoggingEnabled(z13);
        }
    }

    /* renamed from: a */
    public static final void m1506a(C0512d c0512d, InterfaceC4024a interfaceC4024a) throws Throwable {
        Object objM10796a;
        AbstractC8586u abstractC8586u = (AbstractC8586u) c0512d.f3577d;
        C8873b c8873b = (C8873b) c0512d.f3576c;
        EnumC8893v enumC8893v = c8873b.f42696g;
        EnumC8893v enumC8893v2 = EnumC8893v.WRITE_AHEAD_LOGGING;
        if (enumC8893v == enumC8893v2) {
            a9.m11538a(interfaceC4024a, "PRAGMA journal_mode = WAL");
        } else {
            a9.m11538a(interfaceC4024a, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c8873b.f42696g == enumC8893v2) {
            a9.m11538a(interfaceC4024a, "PRAGMA synchronous = NORMAL");
        } else {
            a9.m11538a(interfaceC4024a, "PRAGMA synchronous = FULL");
        }
        m1507b(interfaceC4024a);
        InterfaceC4026c interfaceC4026cY0 = interfaceC4024a.y0("PRAGMA user_version");
        try {
            interfaceC4026cY0.r0();
            int i10 = (int) interfaceC4026cY0.getLong(0);
            mb.m10760a(interfaceC4026cY0, null);
            int i11 = abstractC8586u.f41810a;
            if (i10 != i11) {
                a9.m11538a(interfaceC4024a, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i10 == 0) {
                        c0512d.m1509d(interfaceC4024a);
                    } else {
                        c0512d.m1510e(interfaceC4024a, i10, i11);
                    }
                    a9.m11538a(interfaceC4024a, "PRAGMA user_version = " + i11);
                    objM10796a = a0.f30746a;
                } catch (Throwable th2) {
                    objM10796a = od.m10796a(th2);
                }
                if (!(objM10796a instanceof C6363m)) {
                    a9.m11538a(interfaceC4024a, "END TRANSACTION");
                }
                Throwable thM12363a = C6364n.m12363a(objM10796a);
                if (thM12363a != null) {
                    a9.m11538a(interfaceC4024a, "ROLLBACK TRANSACTION");
                    throw thM12363a;
                }
            }
            c0512d.m1511f(interfaceC4024a);
        } finally {
        }
    }

    /* renamed from: b */
    public static void m1507b(InterfaceC4024a interfaceC4024a) {
        InterfaceC4026c interfaceC4026cY0 = interfaceC4024a.y0("PRAGMA busy_timeout");
        try {
            interfaceC4026cY0.r0();
            long j6 = interfaceC4026cY0.getLong(0);
            mb.m10760a(interfaceC4026cY0, null);
            if (j6 < 3000) {
                a9.m11538a(interfaceC4024a, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mb.m10760a(interfaceC4026cY0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public InterfaceC4431e m1508c() {
        C5047i c5047i;
        InterfaceC0607b interfaceC0607b = (InterfaceC0607b) this.f3579f;
        C0899b c0899b = interfaceC0607b instanceof C0899b ? (C0899b) interfaceC0607b : null;
        if (c0899b == null || (c5047i = c0899b.f5552a) == null) {
            return null;
        }
        return (InterfaceC4431e) c5047i.f24823b;
    }

    /* renamed from: d */
    public void m1509d(InterfaceC4024a connection) {
        AbstractC8586u abstractC8586u = (AbstractC8586u) this.f3577d;
        AbstractC4154l.m8923f(connection, "connection");
        InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z6 = false;
            if (interfaceC4026cY0.r0()) {
                if (interfaceC4026cY0.getLong(0) == 0) {
                    z6 = true;
                }
            }
            mb.m10760a(interfaceC4026cY0, null);
            abstractC8586u.mo15933a(connection);
            if (!z6) {
                C3758a c3758aMo15939v = abstractC8586u.mo15939v(connection);
                if (!c3758aMo15939v.f19627c) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c3758aMo15939v.f19626b).toString());
                }
            }
            a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            a9.m11538a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) abstractC8586u.f41811b) + "')");
            abstractC8586u.mo15935r(connection);
            Iterator it = ((List) this.f3578e).iterator();
            while (it.hasNext()) {
                ((C7353a) it.next()).getClass();
                if (connection instanceof C0898a) {
                    InterfaceC4427a db2 = ((C0898a) connection).f5551a;
                    AbstractC4154l.m8923f(db2, "db");
                }
            }
        } finally {
        }
    }

    /* renamed from: e */
    public void m1510e(InterfaceC4024a connection, int i10, int i11) {
        AbstractC8586u abstractC8586u = (AbstractC8586u) this.f3577d;
        AbstractC4154l.m8923f(connection, "connection");
        C8873b c8873b = (C8873b) this.f3576c;
        List listM12773a = AbstractC6674x.m12773a(c8873b.f42693d, i10, i11);
        if (listM12773a != null) {
            abstractC8586u.mo15938u(connection);
            Iterator it = listM12773a.iterator();
            while (it.hasNext()) {
                ((AbstractC1655a) it.next()).mo5365a(connection);
            }
            C3758a c3758aMo15939v = abstractC8586u.mo15939v(connection);
            if (!c3758aMo15939v.f19627c) {
                throw new IllegalStateException(("Migration didn't properly handle: " + c3758aMo15939v.f19626b).toString());
            }
            abstractC8586u.mo15937t(connection);
            a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            a9.m11538a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) abstractC8586u.f41811b) + "')");
            return;
        }
        if (AbstractC6674x.m12775c(c8873b, i10, i11)) {
            throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c8873b.f42708s) {
            InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C6959c c6959cM10829d = pe.m10829d();
                while (interfaceC4026cY0.r0()) {
                    String strMo1777W = interfaceC4026cY0.mo1777W(0);
                    if (!AbstractC5185w.m10138t(strMo1777W, "sqlite_", false) && !strMo1777W.equals("android_metadata")) {
                        c6959cM10829d.add(new C6361k(strMo1777W, Boolean.valueOf(AbstractC4154l.m8918a(interfaceC4026cY0.mo1777W(1), "view"))));
                    }
                }
                C6959c c6959cM10828c = pe.m10828c(c6959cM10829d);
                mb.m10760a(interfaceC4026cY0, null);
                ListIterator listIterator = c6959cM10828c.listIterator(0);
                while (true) {
                    C6957a c6957a = (C6957a) listIterator;
                    if (!c6957a.hasNext()) {
                        break;
                    }
                    C6361k c6361k = (C6361k) c6957a.next();
                    String str = (String) c6361k.f30755a;
                    if (((Boolean) c6361k.f30756b).booleanValue()) {
                        a9.m11538a(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        a9.m11538a(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            abstractC8586u.mo15934c(connection);
        }
        Iterator it2 = ((List) this.f3578e).iterator();
        while (it2.hasNext()) {
            ((C7353a) it2.next()).getClass();
            if (connection instanceof C0898a) {
                InterfaceC4427a db2 = ((C0898a) connection).f5551a;
                AbstractC4154l.m8923f(db2, "db");
            }
        }
        abstractC8586u.mo15933a(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1511f(k8.InterfaceC4024a r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0512d.m1511f(k8.a):void");
    }

    public C0512d(C8873b c8873b, AbstractC8586u abstractC8586u) {
        int i10;
        C0611f c0611f;
        EnumC8893v enumC8893v = c8873b.f42696g;
        InterfaceC4430d interfaceC4430d = c8873b.f42692c;
        String str = c8873b.f42691b;
        this.f3576c = c8873b;
        this.f3577d = abstractC8586u;
        Object obj = c8873b.f42694e;
        this.f3578e = obj == null ? C6668r.f31943a : obj;
        InterfaceC4025b interfaceC4025b = c8873b.f42709t;
        if (interfaceC4025b != null) {
            if (str == null) {
                c0611f = new C0611f(new C7105p(this, interfaceC4025b));
            } else {
                C7105p c7105p = new C7105p(this, interfaceC4025b);
                AbstractC4154l.m8923f(enumC8893v, "<this>");
                int[] iArr = AbstractC8872a.f42688a;
                int i11 = iArr[enumC8893v.ordinal()];
                if (i11 == 1) {
                    i10 = 1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + enumC8893v + '\'').toString());
                    }
                    i10 = 4;
                }
                int i12 = iArr[enumC8893v.ordinal()];
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + enumC8893v + '\'').toString());
                }
                c0611f = new C0611f(c7105p, str, i10);
            }
            this.f3579f = c0611f;
        } else if (interfaceC4430d != null) {
            Context context = c8873b.f42690a;
            AbstractC4154l.m8923f(context, "context");
            this.f3579f = new C0899b(new C5047i(interfaceC4430d.mo25c(new C4429c(context, str, new C8891t(this, abstractC8586u.f41810a), false, false))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z6 = enumC8893v == EnumC8893v.WRITE_AHEAD_LOGGING;
        InterfaceC4431e interfaceC4431eM1508c = m1508c();
        if (interfaceC4431eM1508c != null) {
            interfaceC4431eM1508c.setWriteAheadLoggingEnabled(z6);
        }
    }

    public C0512d(C7599i c7599i, ExecutorC3900j executorC3900j) {
        this.f3574a = false;
        this.f3575b = false;
        this.f3578e = new Object();
        this.f3579f = new h1(1);
        this.f3576c = c7599i;
        this.f3577d = executorC3900j;
    }
}
