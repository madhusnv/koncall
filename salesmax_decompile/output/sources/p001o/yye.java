package p001o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import p001o.ak6;
import p001o.bb3;
import p001o.sgg;
import p001o.xia;

/* loaded from: classes5.dex */
public class yye implements nk6, sgg, za3 {

    /* renamed from: f */
    public static final n76 f56283f = n76.m40202b("proto");

    /* renamed from: a */
    public final w5f f56284a;

    /* renamed from: b */
    public final ib3 f56285b;

    /* renamed from: c */
    public final ib3 f56286c;

    /* renamed from: d */
    public final ok6 f56287d;

    /* renamed from: e */
    public final Provider f56288e;

    /* renamed from: o.yye$b */
    public interface InterfaceC18526b {
        Object apply(Object obj);
    }

    /* renamed from: o.yye$c */
    public static class C18527c {

        /* renamed from: a */
        public final String f56289a;

        /* renamed from: b */
        public final String f56290b;

        public C18527c(String str, String str2) {
            this.f56289a = str;
            this.f56290b = str2;
        }
    }

    /* renamed from: o.yye$d */
    public interface InterfaceC18528d {
        /* renamed from: a */
        Object mo45983a();
    }

    public yye(ib3 ib3Var, ib3 ib3Var2, ok6 ok6Var, w5f w5fVar, Provider provider) {
        this.f56284a = w5fVar;
        this.f56285b = ib3Var;
        this.f56286c = ib3Var2;
        this.f56287d = ok6Var;
        this.f56288e = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long B1(ak6 ak6Var, qwh qwhVar, SQLiteDatabase sQLiteDatabase) {
        if (I0()) {
            mo58527d(1L, xia.EnumC18167b.CACHE_FULL, ak6Var.mo17315j());
            return -1L;
        }
        long jV0 = v0(sQLiteDatabase, qwhVar);
        int iMo41503e = this.f56287d.mo41503e();
        byte[] bArrM22405a = ak6Var.mo17310e().m22405a();
        boolean z = bArrM22405a.length <= iMo41503e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jV0));
        contentValues.put("transport_name", ak6Var.mo17315j());
        contentValues.put("timestamp_ms", Long.valueOf(ak6Var.mo17311f()));
        contentValues.put("uptime_ms", Long.valueOf(ak6Var.mo17316k()));
        contentValues.put("payload_encoding", ak6Var.mo17310e().m22406b().m40203a());
        contentValues.put("code", ak6Var.mo17309d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrM22405a : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(bArrM22405a.length / iMo41503e);
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM22405a, (i - 1) * iMo41503e, Math.min(i * iMo41503e, bArrM22405a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : ak6Var.m17314i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ byte[] D1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object F1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo58527d(cursor.getInt(0), xia.EnumC18167b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object G1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        d2(sQLiteDatabase.rawQuery(str2, null), new InterfaceC18526b() { // from class: o.dye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f20650a.F1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean H1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object I1(String str, xia.EnumC18167b enumC18167b, long j, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) d2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC18167b.getNumber())}), new InterfaceC18526b() { // from class: o.cye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.H1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC18167b.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC18167b.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object J1(long j, qwh qwhVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qwhVar.mo45892b(), String.valueOf(iid.m32179a(qwhVar.mo45894d()))}) < 1) {
            contentValues.put("backend_name", qwhVar.mo45892b());
            contentValues.put("priority", Integer.valueOf(iid.m32179a(qwhVar.mo45894d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo58527d(cursor.getInt(0), xia.EnumC18167b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f56285b.getTime()).execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer O0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        d2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC18526b() { // from class: o.oye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f39059a.L0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object P0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object R0(Throwable th) {
        throw new rgg("Timed out while trying to acquire the lock.", th);
    }

    public static byte[] R1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ SQLiteDatabase S0(Throwable th) {
        throw new rgg("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long V0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ imh W0(long j, Cursor cursor) {
        cursor.moveToNext();
        return imh.m32418c().m32423c(cursor.getLong(0)).m32422b(j).m32421a();
    }

    public static /* synthetic */ imh b1(final long j, SQLiteDatabase sQLiteDatabase) {
        return (imh) d2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC18526b() { // from class: o.pye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.W0(j, (Cursor) obj);
            }
        });
    }

    public static n76 b2(String str) {
        return str == null ? f56283f : n76.m40202b(str);
    }

    public static String c2(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((l4d) it.next()).mo24314c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Long d1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static Object d2(Cursor cursor, InterfaceC18526b interfaceC18526b) {
        try {
            return interfaceC18526b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j1(qwh qwhVar, SQLiteDatabase sQLiteDatabase) {
        Long lG0 = G0(sQLiteDatabase, qwhVar);
        return lG0 == null ? Boolean.FALSE : (Boolean) d2(z0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG0.toString()}), new InterfaceC18526b() { // from class: o.fye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List n1(SQLiteDatabase sQLiteDatabase) {
        return (List) d2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC18526b() { // from class: o.lye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.p1((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List p1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(qwh.m45891a().mo45898b(cursor.getString(1)).mo45900d(iid.m32180b(cursor.getInt(2))).mo45899c(R1(cursor.getString(3))).mo45897a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q1(qwh qwhVar, SQLiteDatabase sQLiteDatabase) {
        List listO1 = O1(sQLiteDatabase, qwhVar, this.f56287d.mo41502d());
        for (fid fidVar : fid.values()) {
            if (fidVar != qwhVar.mo45894d()) {
                int iMo41502d = this.f56287d.mo41502d() - listO1.size();
                if (iMo41502d <= 0) {
                    break;
                }
                listO1.addAll(O1(sQLiteDatabase, qwhVar.m45896f(fidVar), iMo41502d));
            }
        }
        return K0(listO1, P1(sQLiteDatabase, listO1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bb3 v1(Map map, bb3.C12336a c12336a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            xia.EnumC18167b enumC18167bR0 = r0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(xia.m56358c().m56363c(enumC18167bR0).m56362b(j).m56361a());
        }
        S1(c12336a, map);
        c12336a.m18531e(F0());
        c12336a.m18530d(A0());
        c12336a.m18529c((String) this.f56288e.get());
        return c12336a.m18528b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bb3 w1(String str, final Map map, final bb3.C12336a c12336a, SQLiteDatabase sQLiteDatabase) {
        return (bb3) d2(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC18526b() { // from class: o.hye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f27794a.v1(map, c12336a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x1(List list, qwh qwhVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            ak6.AbstractC12211a abstractC12211aMo17328k = ak6.m17306a().mo17327j(cursor.getString(1)).mo17326i(cursor.getLong(2)).mo17328k(cursor.getLong(3));
            if (z) {
                abstractC12211aMo17328k.mo17325h(new d76(b2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                abstractC12211aMo17328k.mo17325h(new d76(b2(cursor.getString(4)), Y1(j)));
            }
            if (!cursor.isNull(6)) {
                abstractC12211aMo17328k.mo17324g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(l4d.m36556a(j, qwhVar, abstractC12211aMo17328k.mo17321d()));
        }
        return null;
    }

    public static /* synthetic */ Object z1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new C18527c(cursor.getString(1), cursor.getString(2)));
        }
    }

    @Override // p001o.nk6
    /* renamed from: A */
    public void mo40724A(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            z0().compileStatement("DELETE FROM events WHERE _id in " + c2(iterable)).execute();
        }
    }

    public final ht7 A0() {
        return ht7.m31113b().m31116b(j6g.m33297c().m33301b(y0()).m33302c(ok6.f38509a.mo41504f()).m33300a()).m31115a();
    }

    public final long E0() {
        return z0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final imh F0() {
        final long time = this.f56285b.getTime();
        return (imh) H0(new InterfaceC18526b() { // from class: o.nye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.b1(time, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long G0(SQLiteDatabase sQLiteDatabase, qwh qwhVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qwhVar.mo45892b(), String.valueOf(iid.m32179a(qwhVar.mo45894d()))));
        if (qwhVar.mo45893c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qwhVar.mo45893c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) d2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC18526b() { // from class: o.mye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.d1((Cursor) obj);
            }
        });
    }

    public Object H0(InterfaceC18526b interfaceC18526b) {
        SQLiteDatabase sQLiteDatabaseZ0 = z0();
        sQLiteDatabaseZ0.beginTransaction();
        try {
            Object objApply = interfaceC18526b.apply(sQLiteDatabaseZ0);
            sQLiteDatabaseZ0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseZ0.endTransaction();
        }
    }

    public final boolean I0() {
        return E0() * getPageSize() >= this.f56287d.mo41504f();
    }

    public final List K0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            l4d l4dVar = (l4d) listIterator.next();
            if (map.containsKey(Long.valueOf(l4dVar.mo24314c()))) {
                ak6.AbstractC12211a abstractC12211aM17317l = l4dVar.mo24313b().m17317l();
                for (C18527c c18527c : (Set) map.get(Long.valueOf(l4dVar.mo24314c()))) {
                    abstractC12211aM17317l.m17320c(c18527c.f56289a, c18527c.f56290b);
                }
                listIterator.set(l4d.m36556a(l4dVar.mo24314c(), l4dVar.mo24315d(), abstractC12211aM17317l.mo17321d()));
            }
        }
        return list;
    }

    public final List O1(SQLiteDatabase sQLiteDatabase, final qwh qwhVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lG0 = G0(sQLiteDatabase, qwhVar);
        if (lG0 == null) {
            return arrayList;
        }
        d2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lG0.toString()}, null, null, null, String.valueOf(i)), new InterfaceC18526b() { // from class: o.eye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f22401a.x1(arrayList, qwhVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map P1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((l4d) list.get(i)).mo24314c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        d2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC18526b() { // from class: o.zxe
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.z1(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void S1(bb3.C12336a c12336a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c12336a.m18527a(kja.m35779c().m35784c((String) entry.getKey()).m35783b((List) entry.getValue()).m35782a());
        }
    }

    @Override // p001o.nk6
    /* renamed from: U */
    public Iterable mo40725U() {
        return (Iterable) H0(new InterfaceC18526b() { // from class: o.bye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.n1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p001o.nk6
    public Iterable W2(final qwh qwhVar) {
        return (Iterable) H0(new InterfaceC18526b() { // from class: o.xye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f54481a.q1(qwhVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final byte[] Y1(long j) {
        return (byte[]) d2(z0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC18526b() { // from class: o.gye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.D1((Cursor) obj);
            }
        });
    }

    public final Object Z1(InterfaceC18528d interfaceC18528d, InterfaceC18526b interfaceC18526b) {
        long time = this.f56286c.getTime();
        while (true) {
            try {
                return interfaceC18528d.mo45983a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f56286c.getTime() >= this.f56287d.mo41500b() + time) {
                    return interfaceC18526b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p001o.sgg
    /* renamed from: a */
    public Object mo48328a(sgg.InterfaceC16841a interfaceC16841a) {
        SQLiteDatabase sQLiteDatabaseZ0 = z0();
        u0(sQLiteDatabaseZ0);
        try {
            Object objExecute = interfaceC16841a.execute();
            sQLiteDatabaseZ0.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseZ0.endTransaction();
        }
    }

    @Override // p001o.nk6
    public boolean b3(final qwh qwhVar) {
        return ((Boolean) H0(new InterfaceC18526b() { // from class: o.xxe
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f54462a.j1(qwhVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p001o.za3
    /* renamed from: c */
    public void mo58526c() {
        H0(new InterfaceC18526b() { // from class: o.uye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f49668a.M1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56284a.close();
    }

    @Override // p001o.za3
    /* renamed from: d */
    public void mo58527d(final long j, final xia.EnumC18167b enumC18167b, final String str) {
        H0(new InterfaceC18526b() { // from class: o.iye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.I1(str, enumC18167b, j, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p001o.za3
    /* renamed from: f */
    public bb3 mo58528f() {
        final bb3.C12336a c12336aM18521e = bb3.m18521e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (bb3) H0(new InterfaceC18526b() { // from class: o.aye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f15375a.w1(str, map, c12336aM18521e, (SQLiteDatabase) obj);
            }
        });
    }

    public final long getPageSize() {
        return z0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // p001o.nk6
    public void i1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            H0(new InterfaceC18526b() { // from class: o.yxe
                @Override // p001o.yye.InterfaceC18526b
                public final Object apply(Object obj) {
                    return this.f56233a.G1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p001o.nk6
    public l4d m1(final qwh qwhVar, final ak6 ak6Var) {
        aka.m17334c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", qwhVar.mo45894d(), ak6Var.mo17315j(), qwhVar.mo45892b());
        long jLongValue = ((Long) H0(new InterfaceC18526b() { // from class: o.jye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f31257a.B1(ak6Var, qwhVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return l4d.m36556a(jLongValue, qwhVar, ak6Var);
    }

    @Override // p001o.nk6
    public void o1(final qwh qwhVar, final long j) {
        H0(new InterfaceC18526b() { // from class: o.tye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.J1(j, qwhVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final xia.EnumC18167b r0(int i) {
        xia.EnumC18167b enumC18167b = xia.EnumC18167b.REASON_UNKNOWN;
        if (i == enumC18167b.getNumber()) {
            return enumC18167b;
        }
        xia.EnumC18167b enumC18167b2 = xia.EnumC18167b.MESSAGE_TOO_OLD;
        if (i == enumC18167b2.getNumber()) {
            return enumC18167b2;
        }
        xia.EnumC18167b enumC18167b3 = xia.EnumC18167b.CACHE_FULL;
        if (i == enumC18167b3.getNumber()) {
            return enumC18167b3;
        }
        xia.EnumC18167b enumC18167b4 = xia.EnumC18167b.PAYLOAD_TOO_BIG;
        if (i == enumC18167b4.getNumber()) {
            return enumC18167b4;
        }
        xia.EnumC18167b enumC18167b5 = xia.EnumC18167b.MAX_RETRIES_REACHED;
        if (i == enumC18167b5.getNumber()) {
            return enumC18167b5;
        }
        xia.EnumC18167b enumC18167b6 = xia.EnumC18167b.INVALID_PAYLOD;
        if (i == enumC18167b6.getNumber()) {
            return enumC18167b6;
        }
        xia.EnumC18167b enumC18167b7 = xia.EnumC18167b.SERVER_ERROR;
        if (i == enumC18167b7.getNumber()) {
            return enumC18167b7;
        }
        aka.m17333b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC18167b;
    }

    public final void u0(final SQLiteDatabase sQLiteDatabase) {
        Z1(new InterfaceC18528d() { // from class: o.vye
            @Override // p001o.yye.InterfaceC18528d
            /* renamed from: a */
            public final Object mo45983a() {
                return yye.P0(sQLiteDatabase);
            }
        }, new InterfaceC18526b() { // from class: o.wye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.R0((Throwable) obj);
            }
        });
    }

    public final long v0(SQLiteDatabase sQLiteDatabase, qwh qwhVar) {
        Long lG0 = G0(sQLiteDatabase, qwhVar);
        if (lG0 != null) {
            return lG0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", qwhVar.mo45892b());
        contentValues.put("priority", Integer.valueOf(iid.m32179a(qwhVar.mo45894d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (qwhVar.mo45893c() != null) {
            contentValues.put("extras", Base64.encodeToString(qwhVar.mo45893c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // p001o.nk6
    /* renamed from: x */
    public int mo40726x() {
        final long time = this.f56285b.getTime() - this.f56287d.mo41501c();
        return ((Integer) H0(new InterfaceC18526b() { // from class: o.kye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return this.f32815a.O0(time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p001o.nk6
    /* renamed from: y */
    public long mo40727y(qwh qwhVar) {
        return ((Long) d2(z0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qwhVar.mo45892b(), String.valueOf(iid.m32179a(qwhVar.mo45894d()))}), new InterfaceC18526b() { // from class: o.sye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.V0((Cursor) obj);
            }
        })).longValue();
    }

    public long y0() {
        return E0() * getPageSize();
    }

    public SQLiteDatabase z0() {
        final w5f w5fVar = this.f56284a;
        Objects.requireNonNull(w5fVar);
        return (SQLiteDatabase) Z1(new InterfaceC18528d() { // from class: o.qye
            @Override // p001o.yye.InterfaceC18528d
            /* renamed from: a */
            public final Object mo45983a() {
                return w5fVar.getWritableDatabase();
            }
        }, new InterfaceC18526b() { // from class: o.rye
            @Override // p001o.yye.InterfaceC18526b
            public final Object apply(Object obj) {
                return yye.S0((Throwable) obj);
            }
        });
    }
}
