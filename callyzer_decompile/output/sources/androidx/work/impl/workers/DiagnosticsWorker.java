package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0914i;
import c9.C0917l;
import c9.C0922q;
import c9.C0925t;
import c9.C0927v;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import d9.C1664i;
import f9.AbstractC2225h;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import og.ka;
import og.pe;
import rw.AbstractC6662l;
import t8.AbstractC7075u;
import t8.C7059e;
import t8.C7064j;
import t8.C7077w;
import t8.EnumC7055a;
import t8.EnumC7078x;
import t8.c0;
import t8.e0;
import u8.C7368p;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final AbstractC7075u doWork() throws Throwable {
        C8896y c8896y;
        int iM12732v;
        int iM12732v2;
        int iM12732v3;
        int iM12732v4;
        int iM12732v5;
        int iM12732v6;
        int iM12732v7;
        int iM12732v8;
        int iM12732v9;
        int iM12732v10;
        int iM12732v11;
        C0914i c0914i;
        C0917l c0917l;
        C0927v c0927v;
        C7368p c7368pM13783g = C7368p.m13783g(getApplicationContext());
        WorkDatabase workDatabase = c7368pM13783g.f35045c;
        AbstractC4154l.m8922e(workDatabase, "workManager.workDatabase");
        C0925t c0925tMo1368C = workDatabase.mo1368C();
        C0917l c0917lMo1366A = workDatabase.mo1366A();
        C0927v c0927vMo1369D = workDatabase.mo1369D();
        C0914i c0914iMo1372z = workDatabase.mo1372z();
        c7368pM13783g.f35044b.f34108d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c0925tMo1368C.getClass();
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c8896yM16401j.mo9276g(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            iM12732v = AbstractC6662l.m12732v(cursorM10840o, "id");
            iM12732v2 = AbstractC6662l.m12732v(cursorM10840o, TransferTable.COLUMN_STATE);
            iM12732v3 = AbstractC6662l.m12732v(cursorM10840o, "worker_class_name");
            iM12732v4 = AbstractC6662l.m12732v(cursorM10840o, "input_merger_class_name");
            iM12732v5 = AbstractC6662l.m12732v(cursorM10840o, "input");
            iM12732v6 = AbstractC6662l.m12732v(cursorM10840o, "output");
            iM12732v7 = AbstractC6662l.m12732v(cursorM10840o, "initial_delay");
            iM12732v8 = AbstractC6662l.m12732v(cursorM10840o, "interval_duration");
            iM12732v9 = AbstractC6662l.m12732v(cursorM10840o, "flex_duration");
            iM12732v10 = AbstractC6662l.m12732v(cursorM10840o, "run_attempt_count");
            iM12732v11 = AbstractC6662l.m12732v(cursorM10840o, "backoff_policy");
            c8896y = c8896yM16401j;
        } catch (Throwable th2) {
            th = th2;
            c8896y = c8896yM16401j;
        }
        try {
            int iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            int iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            int iM12732v14 = AbstractC6662l.m12732v(cursorM10840o, "minimum_retention_duration");
            int iM12732v15 = AbstractC6662l.m12732v(cursorM10840o, "schedule_requested_at");
            int iM12732v16 = AbstractC6662l.m12732v(cursorM10840o, "run_in_foreground");
            int iM12732v17 = AbstractC6662l.m12732v(cursorM10840o, "out_of_quota_policy");
            int iM12732v18 = AbstractC6662l.m12732v(cursorM10840o, "period_count");
            int iM12732v19 = AbstractC6662l.m12732v(cursorM10840o, "generation");
            int iM12732v20 = AbstractC6662l.m12732v(cursorM10840o, "next_schedule_time_override");
            int iM12732v21 = AbstractC6662l.m12732v(cursorM10840o, "next_schedule_time_override_generation");
            int iM12732v22 = AbstractC6662l.m12732v(cursorM10840o, "stop_reason");
            int iM12732v23 = AbstractC6662l.m12732v(cursorM10840o, "trace_tag");
            int iM12732v24 = AbstractC6662l.m12732v(cursorM10840o, "required_network_type");
            int iM12732v25 = AbstractC6662l.m12732v(cursorM10840o, "required_network_request");
            int iM12732v26 = AbstractC6662l.m12732v(cursorM10840o, "requires_charging");
            int iM12732v27 = AbstractC6662l.m12732v(cursorM10840o, "requires_device_idle");
            int iM12732v28 = AbstractC6662l.m12732v(cursorM10840o, "requires_battery_not_low");
            int iM12732v29 = AbstractC6662l.m12732v(cursorM10840o, "requires_storage_not_low");
            int iM12732v30 = AbstractC6662l.m12732v(cursorM10840o, "trigger_content_update_delay");
            int iM12732v31 = AbstractC6662l.m12732v(cursorM10840o, "trigger_max_content_delay");
            int iM12732v32 = AbstractC6662l.m12732v(cursorM10840o, "content_uri_triggers");
            int i10 = iM12732v14;
            ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
            while (cursorM10840o.moveToNext()) {
                String string = cursorM10840o.getString(iM12732v);
                e0 e0VarM10732f = ka.m10732f(cursorM10840o.getInt(iM12732v2));
                String string2 = cursorM10840o.getString(iM12732v3);
                String string3 = cursorM10840o.getString(iM12732v4);
                C7064j c7064jM13364a = C7064j.m13364a(cursorM10840o.getBlob(iM12732v5));
                C7064j c7064jM13364a2 = C7064j.m13364a(cursorM10840o.getBlob(iM12732v6));
                long j6 = cursorM10840o.getLong(iM12732v7);
                long j10 = cursorM10840o.getLong(iM12732v8);
                long j11 = cursorM10840o.getLong(iM12732v9);
                int i11 = cursorM10840o.getInt(iM12732v10);
                EnumC7055a enumC7055aM10729c = ka.m10729c(cursorM10840o.getInt(iM12732v11));
                long j12 = cursorM10840o.getLong(iM12732v12);
                long j13 = cursorM10840o.getLong(iM12732v13);
                int i12 = i10;
                long j14 = cursorM10840o.getLong(i12);
                int i13 = iM12732v9;
                int i14 = iM12732v15;
                long j15 = cursorM10840o.getLong(i14);
                iM12732v15 = i14;
                int i15 = iM12732v16;
                boolean z6 = cursorM10840o.getInt(i15) != 0;
                iM12732v16 = i15;
                int i16 = iM12732v17;
                c0 c0VarM10731e = ka.m10731e(cursorM10840o.getInt(i16));
                iM12732v17 = i16;
                int i17 = iM12732v18;
                int i18 = cursorM10840o.getInt(i17);
                iM12732v18 = i17;
                int i19 = iM12732v19;
                int i20 = cursorM10840o.getInt(i19);
                iM12732v19 = i19;
                int i21 = iM12732v20;
                long j16 = cursorM10840o.getLong(i21);
                iM12732v20 = i21;
                int i22 = iM12732v21;
                int i23 = cursorM10840o.getInt(i22);
                iM12732v21 = i22;
                int i24 = iM12732v22;
                int i25 = cursorM10840o.getInt(i24);
                iM12732v22 = i24;
                int i26 = iM12732v23;
                String string4 = cursorM10840o.isNull(i26) ? null : cursorM10840o.getString(i26);
                iM12732v23 = i26;
                int i27 = iM12732v24;
                EnumC7078x enumC7078xM10730d = ka.m10730d(cursorM10840o.getInt(i27));
                iM12732v24 = i27;
                int i28 = iM12732v25;
                C1664i c1664iM10734h = ka.m10734h(cursorM10840o.getBlob(i28));
                iM12732v25 = i28;
                int i29 = iM12732v26;
                boolean z10 = cursorM10840o.getInt(i29) != 0;
                iM12732v26 = i29;
                int i30 = iM12732v27;
                boolean z11 = cursorM10840o.getInt(i30) != 0;
                iM12732v27 = i30;
                int i31 = iM12732v28;
                boolean z12 = cursorM10840o.getInt(i31) != 0;
                iM12732v28 = i31;
                int i32 = iM12732v29;
                boolean z13 = cursorM10840o.getInt(i32) != 0;
                iM12732v29 = i32;
                int i33 = iM12732v30;
                long j17 = cursorM10840o.getLong(i33);
                iM12732v30 = i33;
                int i34 = iM12732v31;
                long j18 = cursorM10840o.getLong(i34);
                iM12732v31 = i34;
                int i35 = iM12732v32;
                iM12732v32 = i35;
                arrayList.add(new C0922q(string, e0VarM10732f, string2, string3, c7064jM13364a, c7064jM13364a2, j6, j10, j11, new C7059e(c1664iM10734h, enumC7078xM10730d, z10, z11, z12, z13, j17, j18, ka.m10727a(cursorM10840o.getBlob(i35))), i11, enumC7055aM10729c, j12, j13, j14, j15, z6, c0VarM10731e, i18, i20, j16, i23, i25, string4));
                iM12732v9 = i13;
                i10 = i12;
            }
            cursorM10840o.close();
            c8896y.m16402u();
            ArrayList arrayListM2682k = c0925tMo1368C.m2682k();
            ArrayList arrayListM2678g = c0925tMo1368C.m2678g();
            if (arrayList.isEmpty()) {
                c0914i = c0914iMo1372z;
                c0917l = c0917lMo1366A;
                c0927v = c0927vMo1369D;
            } else {
                C7077w c7077wM13371a = C7077w.m13371a();
                int i36 = AbstractC2225h.f10211a;
                c7077wM13371a.getClass();
                C7077w c7077wM13371a2 = C7077w.m13371a();
                c0914i = c0914iMo1372z;
                c0917l = c0917lMo1366A;
                c0927v = c0927vMo1369D;
                AbstractC2225h.m5929a(c0917l, c0927v, c0914i, arrayList);
                c7077wM13371a2.getClass();
            }
            if (!arrayListM2682k.isEmpty()) {
                C7077w c7077wM13371a3 = C7077w.m13371a();
                int i37 = AbstractC2225h.f10211a;
                c7077wM13371a3.getClass();
                C7077w c7077wM13371a4 = C7077w.m13371a();
                AbstractC2225h.m5929a(c0917l, c0927v, c0914i, arrayListM2682k);
                c7077wM13371a4.getClass();
            }
            if (!arrayListM2678g.isEmpty()) {
                C7077w c7077wM13371a5 = C7077w.m13371a();
                int i38 = AbstractC2225h.f10211a;
                c7077wM13371a5.getClass();
                C7077w c7077wM13371a6 = C7077w.m13371a();
                AbstractC2225h.m5929a(c0917l, c0927v, c0914i, arrayListM2678g);
                c7077wM13371a6.getClass();
            }
            return AbstractC7075u.m13370b();
        } catch (Throwable th3) {
            th = th3;
            cursorM10840o.close();
            c8896y.m16402u();
            throw th;
        }
    }
}
