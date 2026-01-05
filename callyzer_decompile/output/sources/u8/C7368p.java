package u8;

import a1.C0011j;
import a1.d0;
import a3.C0043b;
import a9.C0073l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import c9.C0925t;
import c9.CallableC0924s;
import d4.C1587o;
import d9.AbstractC1667l;
import d9.C1658c;
import d9.C1662g;
import d9.ExecutorC1668m;
import d9.RunnableC1660e;
import e9.InterfaceC1970a;
import h2.f0;
import java.util.List;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import mq.C4833a;
import nq.C5131c;
import og.ng;
import og.oa;
import og.rg;
import og.z0;
import qc.C6158d;
import t8.C7056b;
import t8.C7077w;
import t8.g0;
import tx.AbstractC7262v;
import tx.c0;
import uw.InterfaceC7559c;
import wx.C8219t;
import wx.c1;
import x4.C8302l;
import yx.C8810d;
import z1.C8849i;
import z7.AbstractC8894w;
import z7.C8881j;
import z7.C8889r;
import z7.C8896y;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.p */
/* loaded from: classes.dex */
public final class C7368p extends g0 {

    /* renamed from: k */
    public static C7368p f35040k;

    /* renamed from: l */
    public static C7368p f35041l;

    /* renamed from: m */
    public static final Object f35042m;

    /* renamed from: a */
    public final Context f35043a;

    /* renamed from: b */
    public final C7056b f35044b;

    /* renamed from: c */
    public final WorkDatabase f35045c;

    /* renamed from: d */
    public final InterfaceC1970a f35046d;

    /* renamed from: e */
    public final List f35047e;

    /* renamed from: f */
    public final C7356d f35048f;

    /* renamed from: g */
    public final C8986c f35049g;

    /* renamed from: h */
    public boolean f35050h = false;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f35051i;

    /* renamed from: j */
    public final C0073l f35052j;

    static {
        C7077w.m13372b("WorkManagerImpl");
        f35040k = null;
        f35041l = null;
        f35042m = new Object();
    }

    public C7368p(Context context, final C7056b c7056b, InterfaceC1970a interfaceC1970a, final WorkDatabase workDatabase, final List list, C7356d c7356d, C0073l c0073l) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        C7077w c7077w = new C7077w();
        synchronized (C7077w.f34172a) {
            try {
                if (C7077w.f34173b == null) {
                    C7077w.f34173b = c7077w;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35043a = applicationContext;
        this.f35046d = interfaceC1970a;
        this.f35045c = workDatabase;
        this.f35048f = c7356d;
        this.f35052j = c0073l;
        this.f35044b = c7056b;
        this.f35047e = list;
        C0914i c0914i = (C0914i) interfaceC1970a;
        AbstractC7262v abstractC7262v = (AbstractC7262v) c0914i.f5586b;
        AbstractC4154l.m8922e(abstractC7262v, "taskExecutor.taskCoroutineDispatcher");
        C8810d c8810dM13479b = c0.m13479b(abstractC7262v);
        this.f35049g = new C8986c(7, workDatabase);
        final ExecutorC1668m executorC1668m = (ExecutorC1668m) c0914i.f5585a;
        int i10 = AbstractC7360h.f35020a;
        c7356d.m13769a(new InterfaceC7354b() { // from class: u8.g
            @Override // u8.InterfaceC7354b
            /* renamed from: a */
            public final void mo1381a(C0915j c0915j, boolean z6) {
                executorC1668m.execute(new d0(list, c0915j, c7056b, workDatabase, 3));
            }
        });
        interfaceC1970a.m5712a(new RunnableC1660e(applicationContext, this));
        int i11 = AbstractC7364l.f35028b;
        if (AbstractC1667l.m5379a(applicationContext, c7056b)) {
            C0925t c0925tMo1368C = workDatabase.mo1368C();
            c0925tMo1368C.getClass();
            InterfaceC7559c interfaceC7559c = null;
            c0.m13502y(c8810dM13479b, null, null, new C4032f(new C8219t(c1.m15382m(c1.m15376g(new f0(z0.m11078a((WorkDatabase_Impl) c0925tMo1368C.f5651a, new String[]{"workspec"}, new C4833a(27, new CallableC0924s(c0925tMo1368C, C8896y.m16401j(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"), 2))), new C7363k(4, null), 1), -1)), new C5131c(applicationContext, interfaceC7559c, 1), 4), interfaceC7559c, 17), 3);
        }
    }

    /* renamed from: g */
    public static C7368p m13783g(Context context) {
        C7368p c7368p;
        Object obj = f35042m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    c7368p = f35040k;
                    if (c7368p == null) {
                        c7368p = f35041l;
                    }
                }
                return c7368p;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (c7368p != null) {
            return c7368p;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    @Override // t8.g0
    /* renamed from: a */
    public final C7077w mo13353a(String name) {
        AbstractC4154l.m8923f(name, "name");
        C7077w c7077w = this.f35044b.f34116l;
        String strConcat = "CancelWorkByName_".concat(name);
        ExecutorC1668m executorC1668m = (ExecutorC1668m) ((C0914i) this.f35046d).f5585a;
        AbstractC4154l.m8922e(executorC1668m, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return rg.m10883a(c7077w, strConcat, executorC1668m, new C1658c(name, this));
    }

    @Override // t8.g0
    /* renamed from: d */
    public final d7.f0 mo13356d(String str) {
        C0925t c0925tMo1368C = this.f35045c.mo1368C();
        c0925tMo1368C.getClass();
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c8896yM16401j.mo9278q(1, str);
        C8881j c8881jM16391j = ((WorkDatabase_Impl) c0925tMo1368C.f5651a).m16391j();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec", "worktag"};
        CallableC0924s callableC0924s = new CallableC0924s(c0925tMo1368C, c8896yM16401j, 0);
        c8881jM16391j.f42748b.m16383g(strArr);
        C8849i c8849i = c8881jM16391j.f42753g;
        c8849i.getClass();
        C8889r c8889r = new C8889r((AbstractC8894w) c8849i.f42583b, c8849i, strArr, callableC0924s);
        C0011j c0011j = C0922q.f5621y;
        Object obj = new Object();
        d7.f0 f0Var = new d7.f0();
        f0Var.mo5322l(c8889r, new C1662g(this.f35046d, obj, c0011j, f0Var));
        return f0Var;
    }

    @Override // t8.g0
    /* renamed from: e */
    public final d7.f0 mo13357e(String str) {
        C0925t c0925tMo1368C = this.f35045c.mo1368C();
        c0925tMo1368C.getClass();
        C8896y c8896yM16401j = C8896y.m16401j(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c8896yM16401j.mo9278q(1, str);
        C8881j c8881jM16391j = ((WorkDatabase_Impl) c0925tMo1368C.f5651a).m16391j();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec", "workname"};
        CallableC0924s callableC0924s = new CallableC0924s(c0925tMo1368C, c8896yM16401j, 1);
        c8881jM16391j.f42748b.m16383g(strArr);
        C8849i c8849i = c8881jM16391j.f42753g;
        c8849i.getClass();
        C8889r c8889r = new C8889r((AbstractC8894w) c8849i.f42583b, c8849i, strArr, callableC0924s);
        C0011j c0011j = C0922q.f5621y;
        Object obj = new Object();
        d7.f0 f0Var = new d7.f0();
        f0Var.mo5322l(c8889r, new C1662g(this.f35046d, obj, c0011j, f0Var));
        return f0Var;
    }

    /* renamed from: f */
    public final C7077w m13784f(String str) {
        C7077w c7077w = this.f35044b.f34116l;
        String strConcat = "CancelWorkByTag_".concat(str);
        ExecutorC1668m executorC1668m = (ExecutorC1668m) ((C0914i) this.f35046d).f5585a;
        AbstractC4154l.m8922e(executorC1668m, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return rg.m10883a(c7077w, strConcat, executorC1668m, new C1658c(this, str));
    }

    /* renamed from: h */
    public final C8302l m13785h(String str) {
        WorkDatabase workDatabase = this.f35045c;
        AbstractC4154l.m8923f(workDatabase, "<this>");
        InterfaceC1970a executor = this.f35046d;
        AbstractC4154l.m8923f(executor, "executor");
        C1587o c1587o = new C1587o(str, 1);
        ExecutorC1668m executorC1668m = (ExecutorC1668m) ((C0914i) executor).f5585a;
        AbstractC4154l.m8922e(executorC1668m, "executor.serialTaskExecutor");
        return ng.m10785a(executorC1668m, "loadStatusFuture", new C0043b(5, c1587o, workDatabase));
    }

    /* renamed from: i */
    public final void m13786i() {
        synchronized (f35042m) {
            try {
                this.f35050h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f35051i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f35051i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m13787j() {
        C7077w c7077w = this.f35044b.f34116l;
        C6158d c6158d = new C6158d(8, this);
        AbstractC4154l.m8923f(c7077w, "<this>");
        boolean zM10793c = oa.m10793c();
        if (zM10793c) {
            try {
                Trace.beginSection(oa.m10795e("ReschedulingWork"));
            } finally {
                if (zM10793c) {
                    Trace.endSection();
                }
            }
        }
        c6158d.invoke();
    }
}
