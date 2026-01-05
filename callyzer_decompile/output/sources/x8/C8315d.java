package x8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import c9.C0909d;
import c9.C0912g;
import c9.C0913h;
import c9.C0914i;
import c9.C0915j;
import c9.C0922q;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC4154l;
import m8.C4680j;
import nf.C5047i;
import og.ja;
import p020v.a1;
import qc.C6158d;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import t8.C7056b;
import t8.C7077w;
import t8.c0;
import t8.e0;
import u8.InterfaceC7358f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x8.d */
/* loaded from: classes.dex */
public final class C8315d implements InterfaceC7358f {

    /* renamed from: f */
    public static final /* synthetic */ int f39866f = 0;

    /* renamed from: a */
    public final Context f39867a;

    /* renamed from: b */
    public final JobScheduler f39868b;

    /* renamed from: c */
    public final C8314c f39869c;

    /* renamed from: d */
    public final WorkDatabase f39870d;

    /* renamed from: e */
    public final C7056b f39871e;

    static {
        C7077w.m13372b("SystemJobScheduler");
    }

    public C8315d(Context context, WorkDatabase workDatabase, C7056b c7056b) {
        JobScheduler jobSchedulerM15510a = AbstractC8312a.m15510a(context);
        C8314c c8314c = new C8314c(context, c7056b.f34108d, c7056b.f34115k);
        this.f39867a = context;
        this.f39868b = jobSchedulerM15510a;
        this.f39869c = c8314c;
        this.f39870d = workDatabase;
        this.f39871e = c7056b;
    }

    /* renamed from: a */
    public static void m15512a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable unused) {
            C7077w c7077wM13371a = C7077w.m13371a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10));
            c7077wM13371a.getClass();
        }
    }

    /* renamed from: b */
    public static ArrayList m15513b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        int i10 = AbstractC8312a.f39861a;
        AbstractC4154l.m8923f(jobScheduler, "<this>");
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            AbstractC4154l.m8922e(allPendingJobs, "jobScheduler.allPendingJobs");
        } catch (Throwable unused) {
            C7077w.m13371a().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static C0915j m15514f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0915j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u8.InterfaceC7358f
    /* renamed from: c */
    public final boolean mo13775c() {
        return true;
    }

    @Override // u8.InterfaceC7358f
    /* renamed from: d */
    public final void mo13776d(String str) {
        ArrayList arrayList;
        Context context = this.f39867a;
        JobScheduler jobScheduler = this.f39868b;
        ArrayList arrayListM15513b = m15513b(context, jobScheduler);
        int i10 = 0;
        if (arrayListM15513b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListM15513b.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListM15513b.get(i11);
                i11++;
                JobInfo jobInfo = (JobInfo) obj;
                C0915j c0915jM15514f = m15514f(jobInfo);
                if (c0915jM15514f != null && str.equals(c0915jM15514f.f5589a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            m15512a(jobScheduler, ((Integer) obj2).intValue());
        }
        C0914i c0914iMo1372z = this.f39870d.mo1372z();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0914iMo1372z.f5585a;
        workDatabase_Impl.m16388b();
        C0913h c0913h = (C0913h) c0914iMo1372z.f5588d;
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

    @Override // u8.InterfaceC7358f
    /* renamed from: e */
    public final void mo13777e(C0922q... c0922qArr) {
        int iIntValue;
        C7056b c7056b = this.f39871e;
        WorkDatabase workDatabase = this.f39870d;
        final C5047i c5047i = new C5047i(workDatabase);
        for (C0922q c0922q : c0922qArr) {
            workDatabase.m16389c();
            try {
                C0922q c0922qM2685n = workDatabase.mo1368C().m2685n(c0922q.f5622a);
                if (c0922qM2685n != null && c0922qM2685n.f5623b == e0.ENQUEUED) {
                    C0915j c0915jM10706a = ja.m10706a(c0922q);
                    C0912g c0912gM2629i = workDatabase.mo1372z().m2629i(c0915jM10706a);
                    if (c0912gM2629i != null) {
                        iIntValue = c0912gM2629i.f5583c;
                    } else {
                        c7056b.getClass();
                        final int i10 = c7056b.f34112h;
                        WorkDatabase workDatabase2 = (WorkDatabase) c5047i.f24823b;
                        Callable callable = new Callable() { // from class: d9.f
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = (WorkDatabase) c5047i.f24823b;
                                Long lM2611u = workDatabase3.mo1371y().m2611u("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lM2611u != null ? (int) lM2611u.longValue() : 0;
                                workDatabase3.mo1371y().m2615y(new C0909d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase3.mo1371y().m2615y(new C0909d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        };
                        workDatabase2.getClass();
                        Object objM16398u = workDatabase2.m16398u(new C6158d(20, callable));
                        AbstractC4154l.m8922e(objM16398u, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objM16398u).intValue();
                    }
                    if (c0912gM2629i == null) {
                        workDatabase.mo1372z().m2631k(new C0912g(c0915jM10706a.f5589a, c0915jM10706a.f5590b, iIntValue));
                    }
                    m15515g(c0922q, iIntValue);
                    workDatabase.m16399v();
                } else {
                    C7077w.m13371a().getClass();
                    workDatabase.m16399v();
                }
            } finally {
                workDatabase.m16395r();
            }
        }
    }

    /* renamed from: g */
    public final void m15515g(C0922q c0922q, int i10) {
        List<JobInfo> allPendingJobs;
        String str;
        JobInfo jobInfoM15511a = this.f39869c.m15511a(c0922q, i10);
        C7077w.m13371a().getClass();
        try {
            if (this.f39868b.schedule(jobInfoM15511a) == 0) {
                C7077w.m13371a().getClass();
                if (c0922q.f5638q && c0922q.f5639r == c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c0922q.f5638q = false;
                    C7077w.m13371a().getClass();
                    m15515g(c0922q, i10);
                }
            }
        } catch (IllegalStateException e2) {
            int i11 = AbstractC8312a.f39861a;
            Context context = this.f39867a;
            AbstractC4154l.m8923f(context, "context");
            WorkDatabase workDatabase = this.f39870d;
            AbstractC4154l.m8923f(workDatabase, "workDatabase");
            C7056b configuration = this.f39871e;
            AbstractC4154l.m8923f(configuration, "configuration");
            int i12 = Build.VERSION.SDK_INT;
            int i13 = i12 >= 31 ? 150 : 100;
            int size = workDatabase.mo1368C().m2683l().size();
            String strM12748L = "<faulty JobScheduler failed to getPendingJobs>";
            if (i12 >= 34) {
                JobScheduler jobSchedulerM15510a = AbstractC8312a.m15510a(context);
                String str2 = null;
                try {
                    allPendingJobs = jobSchedulerM15510a.getAllPendingJobs();
                    AbstractC4154l.m8922e(allPendingJobs, "jobScheduler.allPendingJobs");
                } catch (Throwable unused) {
                    C7077w.m13371a().getClass();
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListM15513b = m15513b(context, jobSchedulerM15510a);
                    int size2 = arrayListM15513b != null ? allPendingJobs.size() - arrayListM15513b.size() : 0;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListM15513b2 = m15513b(context, (JobScheduler) systemService);
                    int size3 = arrayListM15513b2 != null ? arrayListM15513b2.size() : 0;
                    if (size3 != 0) {
                        str2 = size3 + " from WorkManager in the default namespace";
                    }
                    strM12748L = AbstractC6663m.m12748L(AbstractC6662l.m12729s(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListM15513b3 = m15513b(context, AbstractC8312a.m15510a(context));
                if (arrayListM15513b3 != null) {
                    strM12748L = arrayListM15513b3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sbM14337q = a1.m14337q(i13, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strM12748L, ".\nThere are ");
            sbM14337q.append(size);
            sbM14337q.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM4563j = AbstractC1452a.m4563j(sbM14337q, configuration.f34114j, '.');
            C7077w.m13371a().getClass();
            throw new IllegalStateException(strM4563j, e2);
        } catch (Throwable unused2) {
            C7077w c7077wM13371a = C7077w.m13371a();
            c0922q.toString();
            c7077wM13371a.getClass();
        }
    }
}
