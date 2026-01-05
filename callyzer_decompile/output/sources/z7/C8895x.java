package z7;

import android.database.Cursor;
import c8.C0898a;
import d8.AbstractC1655a;
import eb.w0;
import ge.C2581m;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jf.C3758a;
import kotlin.jvm.internal.AbstractC4154l;
import l8.AbstractC4428b;
import m8.C4672b;
import nx.AbstractC5185w;
import og.pe;
import og.q1;
import qw.C6361k;
import rw.AbstractC6674x;
import sw.C6957a;
import sw.C6959c;
import u8.C7353a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.x */
/* loaded from: classes.dex */
public final class C8895x extends AbstractC4428b {

    /* renamed from: b */
    public C8873b f42842b;

    /* renamed from: c */
    public final List f42843c;

    /* renamed from: d */
    public final l4.d0 f42844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8895x(C8873b configuration, l4.d0 d0Var) {
        super(23);
        AbstractC4154l.m8923f(configuration, "configuration");
        this.f42843c = configuration.f42694e;
        this.f42842b = configuration;
        this.f42844d = d0Var;
    }

    @Override // l8.AbstractC4428b
    /* renamed from: c */
    public final void mo9268c(C4672b c4672b) throws IOException {
        Cursor cursorQ0 = c4672b.q0(new w0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z6 = false;
            if (cursorQ0.moveToFirst()) {
                if (cursorQ0.getInt(0) == 0) {
                    z6 = true;
                }
            }
            cursorQ0.close();
            l4.d0.m9073s(c4672b);
            if (!z6) {
                C3758a c3758aM9074u = l4.d0.m9074u(c4672b);
                if (!c3758aM9074u.f19627c) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c3758aM9074u.f19626b);
                }
            }
            c4672b.mo9263p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c4672b.mo9263p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = this.f42843c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C7353a) it.next()).getClass();
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q1.m10844a(cursorQ0, th2);
                throw th3;
            }
        }
    }

    @Override // l8.AbstractC4428b
    /* renamed from: d */
    public final void mo9269d(C4672b c4672b, int i10, int i11) throws IOException {
        mo9271f(c4672b, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // l8.AbstractC4428b
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9270e(m8.C4672b r5) throws java.io.IOException {
        /*
            r4 = this;
            eb.w0 r0 = new eb.w0
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.q0(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L1d
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1a:
            r5 = move-exception
            goto Lb9
        L1d:
            r1 = r2
        L1e:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L63
            eb.w0 r1 = new eb.w0
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r3)
            android.database.Cursor r1 = r5.q0(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3c
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r5 = move-exception
            goto L5d
        L3c:
            r2 = r0
        L3d:
            r1.close()
            java.lang.String r1 = "86254750241babac4b8d52996a675549"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L75
            java.lang.String r1 = "1cbd3130fa23b59692c061c594c16cc0"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L51
            goto L75
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: "
            java.lang.String r0 = i0.m0.m7378k(r0, r2)
            r5.<init>(r0)
            throw r5
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            og.q1.m10844a(r1, r5)
            throw r0
        L63:
            jf.a r1 = l4.d0.m9074u(r5)
            boolean r2 = r1.f19627c
            if (r2 == 0) goto La3
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.mo9263p(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r5.mo9263p(r1)
        L75:
            l4.d0 r1 = r4.f42844d
            java.lang.Object r1 = r1.f21881b
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            java.lang.String r2 = "PRAGMA foreign_keys = ON"
            r5.mo9263p(r2)
            c8.a r2 = new c8.a
            r2.<init>(r5)
            r1.m16396s(r2)
            java.util.List r1 = r4.f42843c
            if (r1 == 0) goto La0
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r1.next()
            u8.a r2 = (u8.C7353a) r2
            r2.m13766a(r5)
            goto L90
        La0:
            r4.f42842b = r0
            return
        La3:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f19626b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lb9:
            throw r5     // Catch: java.lang.Throwable -> Lba
        Lba:
            r1 = move-exception
            og.q1.m10844a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C8895x.mo9270e(m8.b):void");
    }

    @Override // l8.AbstractC4428b
    /* renamed from: f */
    public final void mo9271f(C4672b c4672b, int i10, int i11) throws IOException {
        C8873b c8873b = this.f42842b;
        if (c8873b != null) {
            C2581m c2581m = c8873b.f42693d;
            c2581m.getClass();
            List listM12773a = AbstractC6674x.m12773a(c2581m, i10, i11);
            if (listM12773a != null) {
                pe.m10830e(new C0898a(c4672b));
                Iterator it = listM12773a.iterator();
                while (it.hasNext()) {
                    ((AbstractC1655a) it.next()).mo5365a(new C0898a(c4672b));
                }
                C3758a c3758aM9074u = l4.d0.m9074u(c4672b);
                if (c3758aM9074u.f19627c) {
                    c4672b.mo9263p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c4672b.mo9263p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + c3758aM9074u.f19626b);
                }
            }
        }
        C8873b c8873b2 = this.f42842b;
        if (c8873b2 == null || AbstractC6674x.m12775c(c8873b2, i10, i11)) {
            throw new IllegalStateException(i0.m0.m7377j(i10, i11, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (c8873b2.f42708s) {
            Cursor cursorQ0 = c4672b.q0(new w0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                C6959c c6959cM10829d = pe.m10829d();
                while (cursorQ0.moveToNext()) {
                    String string = cursorQ0.getString(0);
                    AbstractC4154l.m8920c(string);
                    if (!AbstractC5185w.m10138t(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        c6959cM10829d.add(new C6361k(string, Boolean.valueOf(AbstractC4154l.m8918a(cursorQ0.getString(1), "view"))));
                    }
                }
                C6959c c6959cM10828c = pe.m10828c(c6959cM10829d);
                cursorQ0.close();
                ListIterator listIterator = c6959cM10828c.listIterator(0);
                while (true) {
                    C6957a c6957a = (C6957a) listIterator;
                    if (!c6957a.hasNext()) {
                        break;
                    }
                    C6361k c6361k = (C6361k) c6957a.next();
                    String str = (String) c6361k.f30755a;
                    if (((Boolean) c6361k.f30756b).booleanValue()) {
                        c4672b.mo9263p("DROP VIEW IF EXISTS " + str);
                    } else {
                        c4672b.mo9263p("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            c4672b.mo9263p("DROP TABLE IF EXISTS `Dependency`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `WorkSpec`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `WorkTag`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `SystemIdInfo`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `WorkName`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `WorkProgress`");
            c4672b.mo9263p("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.f42843c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C7353a) it2.next()).getClass();
            }
        }
        l4.d0.m9073s(c4672b);
    }

    @Override // l8.AbstractC4428b
    /* renamed from: b */
    public final void mo9267b(C4672b c4672b) {
    }
}
