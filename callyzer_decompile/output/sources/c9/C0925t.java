package c9;

import a2.C0036i;
import a3.C0045d;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d9.C1664i;
import h2.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import k2.a1;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.ka;
import og.mg;
import og.pe;
import og.qe;
import og.ue;
import org.bouncycastle.asn1.x509.DisplayText;
import pg.w9;
import rw.AbstractC6662l;
import t8.C7059e;
import t8.C7064j;
import t8.EnumC7055a;
import t8.EnumC7078x;
import t8.c0;
import t8.e0;
import z7.C8896y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.t */
/* loaded from: classes.dex */
public final class C0925t {

    /* renamed from: a */
    public Object f5651a;

    /* renamed from: b */
    public Object f5652b;

    /* renamed from: c */
    public Object f5653c;

    /* renamed from: d */
    public Object f5654d;

    /* renamed from: e */
    public Object f5655e;

    /* renamed from: f */
    public Object f5656f;

    /* renamed from: g */
    public Object f5657g;

    /* renamed from: h */
    public Object f5658h;

    /* renamed from: i */
    public Object f5659i;

    /* renamed from: j */
    public Object f5660j;

    /* renamed from: k */
    public Object f5661k;

    /* renamed from: l */
    public Object f5662l;

    /* renamed from: m */
    public Object f5663m;

    /* renamed from: n */
    public Object f5664n;

    public C0925t(WorkDatabase_Impl workDatabase_Impl) {
        this.f5651a = workDatabase_Impl;
        this.f5652b = new C0907b(workDatabase_Impl, 5);
        new C0913h(workDatabase_Impl, 12);
        this.f5653c = new C0913h(workDatabase_Impl, 13);
        this.f5654d = new C0913h(workDatabase_Impl, 14);
        this.f5655e = new C0913h(workDatabase_Impl, 15);
        this.f5656f = new C0913h(workDatabase_Impl, 16);
        this.f5657g = new C0913h(workDatabase_Impl, 17);
        this.f5658h = new C0913h(workDatabase_Impl, 18);
        this.f5659i = new C0913h(workDatabase_Impl, 19);
        this.f5660j = new C0913h(workDatabase_Impl, 4);
        new C0913h(workDatabase_Impl, 5);
        this.f5661k = new C0913h(workDatabase_Impl, 6);
        this.f5662l = new C0913h(workDatabase_Impl, 7);
        this.f5663m = new C0913h(workDatabase_Impl, 8);
        new C0913h(workDatabase_Impl, 9);
        new C0913h(workDatabase_Impl, 10);
        this.f5664n = new C0913h(workDatabase_Impl, 11);
    }

    /* renamed from: a */
    public void m2672a(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            qe.m10861g(map, new C0923r(this, 1));
            return;
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        ue.m10986b(size, sbM4568o);
        sbM4568o.append(")");
        C8896y c8896yM16401j = C8896y.m16401j(size, sbM4568o.toString());
        Iterator it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            c8896yM16401j.mo9278q(i10, (String) it.next());
            i10++;
        }
        Cursor cursorM10840o = pe.m10840o((WorkDatabase_Impl) this.f5651a, c8896yM16401j, false);
        try {
            int iM12731u = AbstractC6662l.m12731u(cursorM10840o, "work_spec_id");
            if (iM12731u == -1) {
                return;
            }
            while (cursorM10840o.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM10840o.getString(iM12731u));
                if (arrayList != null) {
                    arrayList.add(C7064j.m13364a(cursorM10840o.getBlob(0)));
                }
            }
        } finally {
            cursorM10840o.close();
        }
    }

    /* renamed from: b */
    public void m2673b(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            qe.m10861g(map, new C0923r(this, 0));
            return;
        }
        StringBuilder sbM4568o = AbstractC1452a.m4568o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        ue.m10986b(size, sbM4568o);
        sbM4568o.append(")");
        C8896y c8896yM16401j = C8896y.m16401j(size, sbM4568o.toString());
        Iterator it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            c8896yM16401j.mo9278q(i10, (String) it.next());
            i10++;
        }
        Cursor cursorM10840o = pe.m10840o((WorkDatabase_Impl) this.f5651a, c8896yM16401j, false);
        try {
            int iM12731u = AbstractC6662l.m12731u(cursorM10840o, "work_spec_id");
            if (iM12731u == -1) {
                return;
            }
            while (cursorM10840o.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM10840o.getString(iM12731u));
                if (arrayList != null) {
                    arrayList.add(cursorM10840o.getString(0));
                }
            }
        } finally {
            cursorM10840o.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2674c(i1.y0 r8, dr.C1769s r9, ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof h2.C2802g
            if (r0 == 0) goto L13
            r0 = r10
            h2.g r0 = (h2.C2802g) r0
            int r1 = r0.f15710d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15710d = r1
            goto L18
        L13:
            h2.g r0 = new h2.g
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f15708b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15710d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            c9.t r8 = r0.f15707a
            og.od.m10798c(r10)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r9 = move-exception
            goto L9f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            og.od.m10798c(r10)
            java.lang.Object r10 = r7.f5655e     // Catch: java.lang.Throwable -> L9d
            h2.x r10 = (h2.C2819x) r10     // Catch: java.lang.Throwable -> L9d
            an.b3 r2 = new an.b3     // Catch: java.lang.Throwable -> L9b
            r5 = 5
            r6 = 0
            r2.<init>(r7, r9, r6, r5)     // Catch: java.lang.Throwable -> L9b
            r0.f15707a = r7     // Catch: java.lang.Throwable -> L9b
            r0.f15710d = r4     // Catch: java.lang.Throwable -> L9b
            r10.getClass()     // Catch: java.lang.Throwable -> L97
            be.d r9 = new be.d     // Catch: java.lang.Throwable -> L97
            r9.<init>(r8, r10, r2, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = tx.c0.m13488k(r9, r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r1) goto L57
            return r1
        L57:
            r8 = r7
        L58:
            h2.d0 r9 = r8.m2679h()
            java.lang.Object r10 = r8.f5660j
            k2.a1 r10 = (k2.a1) r10
            float r0 = r10.m8490f()
            java.lang.Object r9 = r9.m6888a(r0)
            if (r9 == 0) goto L92
            float r10 = r10.m8490f()
            h2.d0 r0 = r8.m2679h()
            float r0 = r0.m6891d(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L92
            java.lang.Object r10 = r8.f5654d
            ex.c r10 = (ex.InterfaceC2139c) r10
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L92
            r8.m2691t(r9)
        L92:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        L95:
            r9 = r8
            goto L99
        L97:
            r8 = move-exception
            goto L95
        L99:
            r8 = r7
            goto L9f
        L9b:
            r9 = move-exception
            goto L99
        L9d:
            r8 = move-exception
            goto L95
        L9f:
            h2.d0 r10 = r8.m2679h()
            java.lang.Object r0 = r8.f5660j
            k2.a1 r0 = (k2.a1) r0
            float r1 = r0.m8490f()
            java.lang.Object r10 = r10.m6888a(r1)
            if (r10 == 0) goto Ld9
            float r0 = r0.m8490f()
            h2.d0 r1 = r8.m2679h()
            float r1 = r1.m6891d(r10)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Ld9
            java.lang.Object r0 = r8.f5654d
            ex.c r0 = (ex.InterfaceC2139c) r0
            java.lang.Object r0 = r0.invoke(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld9
            r8.m2691t(r10)
        Ld9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0925t.m2674c(i1.y0, dr.s, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2675d(java.lang.Object r12, i1.y0 r13, h2.C2799d r14, ww.AbstractC8193c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0925t.m2675d(java.lang.Object, i1.y0, h2.d, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public Object m2676e(float f6, float f10, Object obj) {
        C0045d c0045d = (C0045d) this.f5651a;
        d0 d0VarM2679h = m2679h();
        float fM6891d = d0VarM2679h.m6891d(obj);
        float fFloatValue = ((Number) ((C0036i) this.f5652b).invoke()).floatValue();
        if (fM6891d != f6 && !Float.isNaN(fM6891d)) {
            if (fM6891d < f6) {
                if (f10 >= fFloatValue) {
                    Object objM6889b = d0VarM2679h.m6889b(f6, true);
                    AbstractC4154l.m8920c(objM6889b);
                    return objM6889b;
                }
                Object objM6889b2 = d0VarM2679h.m6889b(f6, true);
                AbstractC4154l.m8920c(objM6889b2);
                if (f6 >= Math.abs(Math.abs(((Number) c0045d.invoke(Float.valueOf(Math.abs(d0VarM2679h.m6891d(objM6889b2) - fM6891d)))).floatValue()) + fM6891d)) {
                    return objM6889b2;
                }
            } else {
                if (f10 <= (-fFloatValue)) {
                    Object objM6889b3 = d0VarM2679h.m6889b(f6, false);
                    AbstractC4154l.m8920c(objM6889b3);
                    return objM6889b3;
                }
                Object objM6889b4 = d0VarM2679h.m6889b(f6, false);
                AbstractC4154l.m8920c(objM6889b4);
                float fAbs = Math.abs(fM6891d - Math.abs(((Number) c0045d.invoke(Float.valueOf(Math.abs(fM6891d - d0VarM2679h.m6891d(objM6889b4))))).floatValue()));
                if (f6 >= DefinitionKt.NO_Float_VALUE ? f6 <= fAbs : Math.abs(f6) >= fAbs) {
                    return objM6889b4;
                }
            }
        }
        return obj;
    }

    /* renamed from: f */
    public void m2677f(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5653c;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9278q(1, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: g */
    public ArrayList m2678g() throws Throwable {
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
        int iM12732v12;
        int iM12732v13;
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c8896yM16401j.mo9276g(1, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
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
            iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
        } catch (Throwable th2) {
            th = th2;
            c8896y = c8896yM16401j;
        }
        try {
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
                int i13 = iM12732v12;
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
                iM12732v12 = i13;
                i10 = i12;
            }
            cursorM10840o.close();
            c8896y.m16402u();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorM10840o.close();
            c8896y.m16402u();
            throw th;
        }
    }

    /* renamed from: h */
    public d0 m2679h() {
        return (d0) ((e1) this.f5663m).getValue();
    }

    /* renamed from: i */
    public ArrayList m2680i(int i10) throws Throwable {
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
        int iM12732v12;
        int iM12732v13;
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c8896yM16401j.mo9276g(1, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
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
            iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
        } catch (Throwable th2) {
            th = th2;
            c8896y = c8896yM16401j;
        }
        try {
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
            int i11 = iM12732v14;
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
                int i12 = cursorM10840o.getInt(iM12732v10);
                EnumC7055a enumC7055aM10729c = ka.m10729c(cursorM10840o.getInt(iM12732v11));
                long j12 = cursorM10840o.getLong(iM12732v12);
                long j13 = cursorM10840o.getLong(iM12732v13);
                int i13 = i11;
                long j14 = cursorM10840o.getLong(i13);
                int i14 = iM12732v12;
                int i15 = iM12732v15;
                long j15 = cursorM10840o.getLong(i15);
                iM12732v15 = i15;
                int i16 = iM12732v16;
                boolean z6 = cursorM10840o.getInt(i16) != 0;
                iM12732v16 = i16;
                int i17 = iM12732v17;
                c0 c0VarM10731e = ka.m10731e(cursorM10840o.getInt(i17));
                iM12732v17 = i17;
                int i18 = iM12732v18;
                int i19 = cursorM10840o.getInt(i18);
                iM12732v18 = i18;
                int i20 = iM12732v19;
                int i21 = cursorM10840o.getInt(i20);
                iM12732v19 = i20;
                int i22 = iM12732v20;
                long j16 = cursorM10840o.getLong(i22);
                iM12732v20 = i22;
                int i23 = iM12732v21;
                int i24 = cursorM10840o.getInt(i23);
                iM12732v21 = i23;
                int i25 = iM12732v22;
                int i26 = cursorM10840o.getInt(i25);
                iM12732v22 = i25;
                int i27 = iM12732v23;
                String string4 = cursorM10840o.isNull(i27) ? null : cursorM10840o.getString(i27);
                iM12732v23 = i27;
                int i28 = iM12732v24;
                EnumC7078x enumC7078xM10730d = ka.m10730d(cursorM10840o.getInt(i28));
                iM12732v24 = i28;
                int i29 = iM12732v25;
                C1664i c1664iM10734h = ka.m10734h(cursorM10840o.getBlob(i29));
                iM12732v25 = i29;
                int i30 = iM12732v26;
                boolean z10 = cursorM10840o.getInt(i30) != 0;
                iM12732v26 = i30;
                int i31 = iM12732v27;
                boolean z11 = cursorM10840o.getInt(i31) != 0;
                iM12732v27 = i31;
                int i32 = iM12732v28;
                boolean z12 = cursorM10840o.getInt(i32) != 0;
                iM12732v28 = i32;
                int i33 = iM12732v29;
                boolean z13 = cursorM10840o.getInt(i33) != 0;
                iM12732v29 = i33;
                int i34 = iM12732v30;
                long j17 = cursorM10840o.getLong(i34);
                iM12732v30 = i34;
                int i35 = iM12732v31;
                long j18 = cursorM10840o.getLong(i35);
                iM12732v31 = i35;
                int i36 = iM12732v32;
                iM12732v32 = i36;
                arrayList.add(new C0922q(string, e0VarM10732f, string2, string3, c7064jM13364a, c7064jM13364a2, j6, j10, j11, new C7059e(c1664iM10734h, enumC7078xM10730d, z10, z11, z12, z13, j17, j18, ka.m10727a(cursorM10840o.getBlob(i36))), i12, enumC7055aM10729c, j12, j13, j14, j15, z6, c0VarM10731e, i19, i21, j16, i24, i26, string4));
                iM12732v12 = i14;
                i11 = i13;
            }
            cursorM10840o.close();
            c8896y.m16402u();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorM10840o.close();
            c8896y.m16402u();
            throw th;
        }
    }

    /* renamed from: j */
    public ArrayList m2681j() throws Throwable {
        C8896y c8896y;
        C8896y c8896yM16401j = C8896y.m16401j(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            int iM12732v = AbstractC6662l.m12732v(cursorM10840o, "id");
            int iM12732v2 = AbstractC6662l.m12732v(cursorM10840o, TransferTable.COLUMN_STATE);
            int iM12732v3 = AbstractC6662l.m12732v(cursorM10840o, "worker_class_name");
            int iM12732v4 = AbstractC6662l.m12732v(cursorM10840o, "input_merger_class_name");
            int iM12732v5 = AbstractC6662l.m12732v(cursorM10840o, "input");
            int iM12732v6 = AbstractC6662l.m12732v(cursorM10840o, "output");
            int iM12732v7 = AbstractC6662l.m12732v(cursorM10840o, "initial_delay");
            int iM12732v8 = AbstractC6662l.m12732v(cursorM10840o, "interval_duration");
            int iM12732v9 = AbstractC6662l.m12732v(cursorM10840o, "flex_duration");
            int iM12732v10 = AbstractC6662l.m12732v(cursorM10840o, "run_attempt_count");
            int iM12732v11 = AbstractC6662l.m12732v(cursorM10840o, "backoff_policy");
            int iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            int iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
            try {
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
                    int i13 = iM12732v13;
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
                    iM12732v13 = i13;
                    i10 = i12;
                }
                cursorM10840o.close();
                c8896y.m16402u();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM10840o.close();
                c8896y.m16402u();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c8896y = c8896yM16401j;
        }
    }

    /* renamed from: k */
    public ArrayList m2682k() throws Throwable {
        C8896y c8896y;
        C8896y c8896yM16401j = C8896y.m16401j(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            int iM12732v = AbstractC6662l.m12732v(cursorM10840o, "id");
            int iM12732v2 = AbstractC6662l.m12732v(cursorM10840o, TransferTable.COLUMN_STATE);
            int iM12732v3 = AbstractC6662l.m12732v(cursorM10840o, "worker_class_name");
            int iM12732v4 = AbstractC6662l.m12732v(cursorM10840o, "input_merger_class_name");
            int iM12732v5 = AbstractC6662l.m12732v(cursorM10840o, "input");
            int iM12732v6 = AbstractC6662l.m12732v(cursorM10840o, "output");
            int iM12732v7 = AbstractC6662l.m12732v(cursorM10840o, "initial_delay");
            int iM12732v8 = AbstractC6662l.m12732v(cursorM10840o, "interval_duration");
            int iM12732v9 = AbstractC6662l.m12732v(cursorM10840o, "flex_duration");
            int iM12732v10 = AbstractC6662l.m12732v(cursorM10840o, "run_attempt_count");
            int iM12732v11 = AbstractC6662l.m12732v(cursorM10840o, "backoff_policy");
            int iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            int iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
            try {
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
                    int i13 = iM12732v13;
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
                    iM12732v13 = i13;
                    i10 = i12;
                }
                cursorM10840o.close();
                c8896y.m16402u();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM10840o.close();
                c8896y.m16402u();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c8896y = c8896yM16401j;
        }
    }

    /* renamed from: l */
    public ArrayList m2683l() {
        C8896y c8896y;
        C8896y c8896yM16401j = C8896y.m16401j(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            int iM12732v = AbstractC6662l.m12732v(cursorM10840o, "id");
            int iM12732v2 = AbstractC6662l.m12732v(cursorM10840o, TransferTable.COLUMN_STATE);
            int iM12732v3 = AbstractC6662l.m12732v(cursorM10840o, "worker_class_name");
            int iM12732v4 = AbstractC6662l.m12732v(cursorM10840o, "input_merger_class_name");
            int iM12732v5 = AbstractC6662l.m12732v(cursorM10840o, "input");
            int iM12732v6 = AbstractC6662l.m12732v(cursorM10840o, "output");
            int iM12732v7 = AbstractC6662l.m12732v(cursorM10840o, "initial_delay");
            int iM12732v8 = AbstractC6662l.m12732v(cursorM10840o, "interval_duration");
            int iM12732v9 = AbstractC6662l.m12732v(cursorM10840o, "flex_duration");
            int iM12732v10 = AbstractC6662l.m12732v(cursorM10840o, "run_attempt_count");
            int iM12732v11 = AbstractC6662l.m12732v(cursorM10840o, "backoff_policy");
            int iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            int iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
            try {
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
                    int i13 = iM12732v13;
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
                    iM12732v13 = i13;
                    i10 = i12;
                }
                cursorM10840o.close();
                c8896y.m16402u();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM10840o.close();
                c8896y.m16402u();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c8896y = c8896yM16401j;
        }
    }

    /* renamed from: m */
    public e0 m2684m(String str) {
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT state FROM workspec WHERE id=?");
        c8896yM16401j.mo9278q(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            e0 e0VarM10732f = null;
            if (cursorM10840o.moveToFirst()) {
                Integer numValueOf = cursorM10840o.isNull(0) ? null : Integer.valueOf(cursorM10840o.getInt(0));
                if (numValueOf != null) {
                    e0VarM10732f = ka.m10732f(numValueOf.intValue());
                }
            }
            return e0VarM10732f;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* renamed from: n */
    public C0922q m2685n(String str) throws Throwable {
        C8896y c8896y;
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT * FROM workspec WHERE id=?");
        c8896yM16401j.mo9278q(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            int iM12732v = AbstractC6662l.m12732v(cursorM10840o, "id");
            int iM12732v2 = AbstractC6662l.m12732v(cursorM10840o, TransferTable.COLUMN_STATE);
            int iM12732v3 = AbstractC6662l.m12732v(cursorM10840o, "worker_class_name");
            int iM12732v4 = AbstractC6662l.m12732v(cursorM10840o, "input_merger_class_name");
            int iM12732v5 = AbstractC6662l.m12732v(cursorM10840o, "input");
            int iM12732v6 = AbstractC6662l.m12732v(cursorM10840o, "output");
            int iM12732v7 = AbstractC6662l.m12732v(cursorM10840o, "initial_delay");
            int iM12732v8 = AbstractC6662l.m12732v(cursorM10840o, "interval_duration");
            int iM12732v9 = AbstractC6662l.m12732v(cursorM10840o, "flex_duration");
            int iM12732v10 = AbstractC6662l.m12732v(cursorM10840o, "run_attempt_count");
            int iM12732v11 = AbstractC6662l.m12732v(cursorM10840o, "backoff_policy");
            int iM12732v12 = AbstractC6662l.m12732v(cursorM10840o, "backoff_delay_duration");
            int iM12732v13 = AbstractC6662l.m12732v(cursorM10840o, "last_enqueue_time");
            c8896y = c8896yM16401j;
            try {
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
                C0922q c0922q = null;
                if (cursorM10840o.moveToFirst()) {
                    c0922q = new C0922q(cursorM10840o.getString(iM12732v), ka.m10732f(cursorM10840o.getInt(iM12732v2)), cursorM10840o.getString(iM12732v3), cursorM10840o.getString(iM12732v4), C7064j.m13364a(cursorM10840o.getBlob(iM12732v5)), C7064j.m13364a(cursorM10840o.getBlob(iM12732v6)), cursorM10840o.getLong(iM12732v7), cursorM10840o.getLong(iM12732v8), cursorM10840o.getLong(iM12732v9), new C7059e(ka.m10734h(cursorM10840o.getBlob(iM12732v25)), ka.m10730d(cursorM10840o.getInt(iM12732v24)), cursorM10840o.getInt(iM12732v26) != 0, cursorM10840o.getInt(iM12732v27) != 0, cursorM10840o.getInt(iM12732v28) != 0, cursorM10840o.getInt(iM12732v29) != 0, cursorM10840o.getLong(iM12732v30), cursorM10840o.getLong(iM12732v31), ka.m10727a(cursorM10840o.getBlob(iM12732v32))), cursorM10840o.getInt(iM12732v10), ka.m10729c(cursorM10840o.getInt(iM12732v11)), cursorM10840o.getLong(iM12732v12), cursorM10840o.getLong(iM12732v13), cursorM10840o.getLong(iM12732v14), cursorM10840o.getLong(iM12732v15), cursorM10840o.getInt(iM12732v16) != 0, ka.m10731e(cursorM10840o.getInt(iM12732v17)), cursorM10840o.getInt(iM12732v18), cursorM10840o.getInt(iM12732v19), cursorM10840o.getLong(iM12732v20), cursorM10840o.getInt(iM12732v21), cursorM10840o.getInt(iM12732v22), cursorM10840o.isNull(iM12732v23) ? null : cursorM10840o.getString(iM12732v23));
                }
                cursorM10840o.close();
                c8896y.m16402u();
                return c0922q;
            } catch (Throwable th2) {
                th = th2;
                cursorM10840o.close();
                c8896y.m16402u();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c8896y = c8896yM16401j;
        }
    }

    /* renamed from: o */
    public ArrayList m2686o(String str) {
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c8896yM16401j.mo9278q(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        Cursor cursorM10840o = pe.m10840o(workDatabase_Impl, c8896yM16401j, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM10840o.getCount());
            while (cursorM10840o.moveToNext()) {
                String id2 = cursorM10840o.getString(0);
                e0 state = ka.m10732f(cursorM10840o.getInt(1));
                AbstractC4154l.m8923f(id2, "id");
                AbstractC4154l.m8923f(state, "state");
                C0920o c0920o = new C0920o();
                c0920o.f5602a = id2;
                c0920o.f5603b = state;
                arrayList.add(c0920o);
            }
            return arrayList;
        } finally {
            cursorM10840o.close();
            c8896yM16401j.m16402u();
        }
    }

    /* renamed from: p */
    public void m2687p(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5662l;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9276g(1, j6);
        c4680jM347a.mo9278q(2, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: q */
    public float m2688q(float f6) {
        Float fValueOf;
        a1 a1Var = (a1) this.f5660j;
        float fM8490f = (Float.isNaN(a1Var.m8490f()) ? DefinitionKt.NO_Float_VALUE : a1Var.m8490f()) + f6;
        float fM6890c = m2679h().m6890c();
        Collection collectionValues = m2679h().f15693a.values();
        AbstractC4154l.m8923f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return w9.m11911b(fM8490f, fM6890c, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    /* renamed from: r */
    public float m2689r() {
        a1 a1Var = (a1) this.f5660j;
        if (Float.isNaN(a1Var.m8490f())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return a1Var.m8490f();
    }

    /* renamed from: s */
    public void m2690s(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5661k;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9278q(1, str);
        c4680jM347a.mo9276g(2, i10);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: t */
    public void m2691t(Object obj) {
        ((e1) this.f5657g).setValue(obj);
    }

    /* renamed from: u */
    public void m2692u(Object obj) {
        ((e1) this.f5662l).setValue(obj);
    }

    /* renamed from: v */
    public void m2693v(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5658h;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9276g(1, j6);
        c4680jM347a.mo9278q(2, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: w */
    public void m2694w(String str, C7064j c7064j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5657g;
        C4680j c4680jM347a = c0913h.m347a();
        C7064j c7064j2 = C7064j.f34159b;
        c4680jM347a.mo9274L(1, mg.m10769b(c7064j));
        c4680jM347a.mo9278q(2, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: x */
    public void m2695x(e0 e0Var, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5654d;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9276g(1, ka.m10733g(e0Var));
        c4680jM347a.mo9278q(2, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }

    /* renamed from: y */
    public void m2696y(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5651a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) this.f5664n;
        C4680j c4680jM347a = c0913h.m347a();
        c4680jM347a.mo9276g(1, i10);
        c4680jM347a.mo9278q(2, str);
        try {
            workDatabase_Impl.m16389c();
            try {
                c4680jM347a.m9573h();
                workDatabase_Impl.m16399v();
            } finally {
                workDatabase_Impl.m16395r();
            }
        } finally {
            c0913h.m355i(c4680jM347a);
        }
    }
}
