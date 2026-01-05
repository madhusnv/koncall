package com.onesignal.core.internal.background.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.core.services.SyncJobService;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Iterator;
import java.util.List;
import p001o.c64;
import p001o.eu5;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.p69;
import p001o.rm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class BackgroundManager implements IApplicationLifecycleHandler, IBackgroundManager, IStartableService {
    public static final Companion Companion = new Companion(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final IApplicationService _applicationService;
    private final List<IBackgroundService> _backgroundServices;
    private final ITime _time;
    private p69 backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2", m36648f = "BackgroundManager.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2 */
    public static final class C116082 extends jgg implements nl7 {
        private /* synthetic */ Object L$0;
        int label;

        @l75(m36647c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2$1", m36648f = "BackgroundManager.kt", m36649l = {116}, m36650m = "invokeSuspend")
        /* renamed from: com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            Object L$0;
            int label;
            final /* synthetic */ BackgroundManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BackgroundManager backgroundManager, n64 n64Var) {
                super(2, n64Var);
                this.this$0 = backgroundManager;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.this$0, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Object objM51918f = uq8.m51918f();
                int i = this.label;
                if (i == 0) {
                    wre.m54934b(obj);
                    Object obj2 = this.this$0.lock;
                    BackgroundManager backgroundManager = this.this$0;
                    synchronized (obj2) {
                        backgroundManager.nextScheduledSyncTimeMs = 0L;
                        y3i y3iVar = y3i.f54824a;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    wre.m54934b(obj);
                }
                while (it.hasNext()) {
                    IBackgroundService iBackgroundService = (IBackgroundService) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (iBackgroundService.backgroundRun(this) == objM51918f) {
                        return objM51918f;
                    }
                }
                this.this$0.scheduleBackground();
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C116082(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C116082 c116082 = BackgroundManager.this.new C116082(n64Var);
            c116082.L$0 = obj;
            return c116082;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            h84 h84Var = (h84) this.L$0;
            Logging.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            BackgroundManager.this.backgroundSyncJob = rm1.m46952d(h84Var, eu5.m25613d(), null, new AnonymousClass1(BackgroundManager.this, null), 2, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116082) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundManager(IApplicationService iApplicationService, ITime iTime, List<? extends IBackgroundService> list) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(list, "_backgroundServices");
        this._applicationService = iApplicationService;
        this._time = iTime;
        this._backgroundServices = list;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        Logging.debug$default(BackgroundManager.class.getSimpleName() + " cancel background sync", null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            y3i y3iVar = y3i.f54824a;
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
            y3i y3iVar = y3i.f54824a;
        }
    }

    private final boolean hasBootPermission() {
        return c64.checkSelfPermission(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        p69 p69Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (p69Var = this.backgroundSyncJob) != null) {
                sq8.m48646e(p69Var);
                if (p69Var.mo22428a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<IBackgroundService> it = this._backgroundServices.iterator();
        Long l = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l == null || scheduleBackgroundRunIn.longValue() < l.longValue())) {
                l = scheduleBackgroundRunIn;
            }
        }
        if (l != null) {
            scheduleSyncTask(l.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j);
            y3i y3iVar = y3i.f54824a;
        }
    }

    private final void scheduleSyncServiceAsJob(long j) {
        Logging.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j, null, 2, null);
        if (isJobIdRunning()) {
            Logging.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        sq8.m48646e(appContext);
        Class<?> cls = this.syncServiceJobClass;
        sq8.m48646e(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        sq8.m48646e(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            Logging.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e) {
            Logging.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private final void scheduleSyncTask(long j) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j > this.nextScheduledSyncTimeMs) {
                Logging.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
                return;
            }
            if (j < DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                j = 5000;
            }
            scheduleBackgroundSyncTask(j);
            this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j;
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean cancelRunBackgroundServices() {
        p69 p69Var = this.backgroundSyncJob;
        if (p69Var == null) {
            return false;
        }
        sq8.m48646e(p69Var);
        if (!p69Var.mo22428a()) {
            return false;
        }
        p69 p69Var2 = this.backgroundSyncJob;
        sq8.m48646e(p69Var2);
        p69.C15966a.m42999a(p69Var2, null, 1, null);
        return true;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        cancelSyncTask();
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public Object runBackgroundServices(n64 n64Var) {
        Object objM31711e = i84.m31711e(new C116082(null), n64Var);
        return objM31711e == uq8.m51918f() ? objM31711e : y3i.f54824a;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public void setNeedsJobReschedule(boolean z) {
        this.needsJobReschedule = z;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
