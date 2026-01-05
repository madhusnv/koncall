package w8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c9.C0912g;
import c9.C0913h;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import fh.RunnableC2286a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import k0.ExecutorC3896f;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import og.ja;
import t8.C7059e;
import t8.C7077w;
import t8.EnumC7078x;
import tb.C7105p;
import u8.C7361i;
import u8.InterfaceC7354b;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w8.b */
/* loaded from: classes.dex */
public final class C7951b implements InterfaceC7354b {

    /* renamed from: f */
    public static final /* synthetic */ int f38238f = 0;

    /* renamed from: a */
    public final Context f38239a;

    /* renamed from: b */
    public final HashMap f38240b = new HashMap();

    /* renamed from: c */
    public final Object f38241c = new Object();

    /* renamed from: d */
    public final C7077w f38242d;

    /* renamed from: e */
    public final C7105p f38243e;

    static {
        C7077w.m13372b("CommandHandler");
    }

    public C7951b(Context context, C7077w c7077w, C7105p c7105p) {
        this.f38239a = context;
        this.f38242d = c7077w;
        this.f38243e = c7105p;
    }

    /* renamed from: c */
    public static C0915j m15127c(Intent intent) {
        return new C0915j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: d */
    public static void m15128d(Intent intent, C0915j c0915j) {
        intent.putExtra("KEY_WORKSPEC_ID", c0915j.f5589a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c0915j.f5590b);
    }

    @Override // u8.InterfaceC7354b
    /* renamed from: a */
    public final void mo1381a(C0915j c0915j, boolean z6) {
        synchronized (this.f38241c) {
            try {
                C7955f c7955f = (C7955f) this.f38240b.remove(c0915j);
                this.f38243e.m13391q(c0915j);
                if (c7955f != null) {
                    c7955f.m15134f(z6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m15129b(Intent intent, int i10, C7957h c7957h) {
        List<C7361i> listM13390p;
        String action = intent.getAction();
        int i11 = 3;
        int i12 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C7077w c7077wM13371a = C7077w.m13371a();
            Objects.toString(intent);
            c7077wM13371a.getClass();
            Context context = this.f38239a;
            C7953d c7953d = new C7953d(context, this.f38242d, i10, c7957h);
            ArrayList arrayListM2683l = c7957h.f38271e.f35045c.mo1368C().m2683l();
            int i13 = AbstractC7952c.f38244a;
            int size = arrayListM2683l.size();
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayListM2683l.get(i14);
                i14++;
                C7059e c7059e = ((C0922q) obj).f5631j;
                z6 |= c7059e.f34133e;
                z10 |= c7059e.f34131c;
                z11 |= c7059e.f34134f;
                z12 |= c7059e.f34129a != EnumC7078x.NOT_REQUIRED;
                if (z6 && z10 && z11 && z12) {
                    break;
                }
            }
            int i15 = ConstraintProxyUpdateReceiver.f2882a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListM2683l.size());
            c7953d.f38245a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListM2683l.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayListM2683l.get(i16);
                i16++;
                C0922q c0922q = (C0922q) obj2;
                if (jCurrentTimeMillis >= c0922q.m2669a() && (!c0922q.m2670c() || c7953d.f38247c.m8093a(c0922q))) {
                    arrayList.add(c0922q);
                }
            }
            int size3 = arrayList.size();
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                C0922q c0922q2 = (C0922q) obj3;
                String str = c0922q2.f5622a;
                C0915j c0915jM10706a = ja.m10706a(c0922q2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m15128d(intent3, c0915jM10706a);
                C7077w.m13371a().getClass();
                ((ExecutorC3896f) ((C0914i) c7957h.f38268b).f5588d).execute(new RunnableC2286a(c7957h, intent3, c7953d.f38246b, i11));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C7077w c7077wM13371a2 = C7077w.m13371a();
            Objects.toString(intent);
            c7077wM13371a2.getClass();
            c7957h.f38271e.m13787j();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C7077w.m13371a().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f38239a;
            C0915j c0915jM15127c = m15127c(intent);
            C7077w c7077wM13371a3 = C7077w.m13371a();
            c0915jM15127c.toString();
            c7077wM13371a3.getClass();
            WorkDatabase workDatabase = c7957h.f38271e.f35045c;
            workDatabase.m16389c();
            try {
                C0922q c0922qM2685n = workDatabase.mo1368C().m2685n(c0915jM15127c.f5589a);
                if (c0922qM2685n == null) {
                    C7077w c7077wM13371a4 = C7077w.m13371a();
                    c0915jM15127c.toString();
                    c7077wM13371a4.getClass();
                    return;
                }
                if (c0922qM2685n.f5623b.isFinished()) {
                    C7077w c7077wM13371a5 = C7077w.m13371a();
                    c0915jM15127c.toString();
                    c7077wM13371a5.getClass();
                    return;
                }
                long jM2669a = c0922qM2685n.m2669a();
                if (c0922qM2685n.m2670c()) {
                    C7077w c7077wM13371a6 = C7077w.m13371a();
                    c0915jM15127c.toString();
                    c7077wM13371a6.getClass();
                    AbstractC7950a.m15126b(context2, workDatabase, c0915jM15127c, jM2669a);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((ExecutorC3896f) ((C0914i) c7957h.f38268b).f5588d).execute(new RunnableC2286a(c7957h, intent4, i10, i11));
                } else {
                    C7077w c7077wM13371a7 = C7077w.m13371a();
                    c0915jM15127c.toString();
                    c7077wM13371a7.getClass();
                    AbstractC7950a.m15126b(context2, workDatabase, c0915jM15127c, jM2669a);
                }
                workDatabase.m16399v();
                return;
            } finally {
                workDatabase.m16395r();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f38241c) {
                try {
                    C0915j c0915jM15127c2 = m15127c(intent);
                    C7077w c7077wM13371a8 = C7077w.m13371a();
                    c0915jM15127c2.toString();
                    c7077wM13371a8.getClass();
                    if (this.f38240b.containsKey(c0915jM15127c2)) {
                        C7077w c7077wM13371a9 = C7077w.m13371a();
                        c0915jM15127c2.toString();
                        c7077wM13371a9.getClass();
                    } else {
                        C7955f c7955f = new C7955f(this.f38239a, i10, c7957h, this.f38243e.m13394u(c0915jM15127c2));
                        this.f38240b.put(c0915jM15127c2, c7955f);
                        c7955f.m15133e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                C7077w c7077wM13371a10 = C7077w.m13371a();
                intent.toString();
                c7077wM13371a10.getClass();
                return;
            } else {
                C0915j c0915jM15127c3 = m15127c(intent);
                boolean z13 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                C7077w c7077wM13371a11 = C7077w.m13371a();
                intent.toString();
                c7077wM13371a11.getClass();
                mo1381a(c0915jM15127c3, z13);
                return;
            }
        }
        C7105p c7105p = this.f38243e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i17 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C7361i c7361iM13391q = c7105p.m13391q(new C0915j(string, i17));
            listM13390p = arrayList2;
            if (c7361iM13391q != null) {
                arrayList2.add(c7361iM13391q);
                listM13390p = arrayList2;
            }
        } else {
            listM13390p = c7105p.m13390p(string);
        }
        for (C7361i workSpecId : listM13390p) {
            C7077w.m13371a().getClass();
            C8849i c8849i = c7957h.f38276k;
            c8849i.getClass();
            AbstractC4154l.m8923f(workSpecId, "workSpecId");
            c8849i.m16318K(workSpecId, -512);
            C0915j c0915j = workSpecId.f35021a;
            Context context3 = this.f38239a;
            WorkDatabase workDatabase2 = c7957h.f38271e.f35045c;
            int i18 = AbstractC7950a.f38237a;
            C0914i c0914iMo1372z = workDatabase2.mo1372z();
            C0912g c0912gM2629i = c0914iMo1372z.m2629i(c0915j);
            if (c0912gM2629i != null) {
                AbstractC7950a.m15125a(context3, c0915j, c0912gM2629i.f5583c);
                C7077w c7077wM13371a12 = C7077w.m13371a();
                c0915j.toString();
                c7077wM13371a12.getClass();
                String str2 = c0915j.f5589a;
                int i19 = c0915j.f5590b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0914iMo1372z.f5585a;
                workDatabase_Impl.m16388b();
                C0913h c0913h = (C0913h) c0914iMo1372z.f5587c;
                C4680j c4680jM347a = c0913h.m347a();
                c4680jM347a.mo9278q(1, str2);
                c4680jM347a.mo9276g(2, i19);
                try {
                    workDatabase_Impl.m16389c();
                    try {
                        c4680jM347a.m9573h();
                        workDatabase_Impl.m16399v();
                        workDatabase_Impl.m16395r();
                    } catch (Throwable th2) {
                        workDatabase_Impl.m16395r();
                        throw th2;
                    }
                } finally {
                    c0913h.m355i(c4680jM347a);
                }
            }
            c7957h.mo1381a(c0915j, false);
        }
    }
}
