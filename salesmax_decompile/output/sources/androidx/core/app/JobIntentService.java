package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: h */
    public static final Object f7114h = new Object();

    /* renamed from: q */
    public static final HashMap f7115q = new HashMap();

    /* renamed from: a */
    public InterfaceC2017b f7116a;

    /* renamed from: b */
    public AbstractC2023h f7117b;

    /* renamed from: c */
    public AsyncTaskC2016a f7118c;

    /* renamed from: d */
    public boolean f7119d = false;

    /* renamed from: e */
    public boolean f7120e = false;

    /* renamed from: f */
    public boolean f7121f = false;

    /* renamed from: g */
    public final ArrayList f7122g;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class AsyncTaskC2016a extends AsyncTask {
        public AsyncTaskC2016a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC2020e interfaceC2020eM5817a = JobIntentService.this.m5817a();
                if (interfaceC2020eM5817a == null) {
                    return null;
                }
                JobIntentService.this.m5820e(interfaceC2020eM5817a.getIntent());
                interfaceC2020eM5817a.mo5831c();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            JobIntentService.this.m5822g();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            JobIntentService.this.m5822g();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface InterfaceC2017b {
        /* renamed from: a */
        IBinder mo5826a();

        /* renamed from: b */
        InterfaceC2020e mo5827b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public static final class C2018c extends AbstractC2023h {

        /* renamed from: d */
        public final Context f7124d;

        /* renamed from: e */
        public final PowerManager.WakeLock f7125e;

        /* renamed from: f */
        public final PowerManager.WakeLock f7126f;

        /* renamed from: g */
        public boolean f7127g;

        /* renamed from: h */
        public boolean f7128h;

        public C2018c(Context context, ComponentName componentName) {
            super(componentName);
            this.f7124d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f7125e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f7126f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC2023h
        /* renamed from: b */
        public void mo5828b() {
            synchronized (this) {
                if (this.f7128h) {
                    if (this.f7127g) {
                        this.f7125e.acquire(60000L);
                    }
                    this.f7128h = false;
                    this.f7126f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC2023h
        /* renamed from: c */
        public void mo5829c() {
            synchronized (this) {
                if (!this.f7128h) {
                    this.f7128h = true;
                    this.f7126f.acquire(600000L);
                    this.f7125e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC2023h
        /* renamed from: d */
        public void mo5830d() {
            synchronized (this) {
                this.f7127g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public final class C2019d implements InterfaceC2020e {

        /* renamed from: a */
        public final Intent f7129a;

        /* renamed from: b */
        public final int f7130b;

        public C2019d(Intent intent, int i) {
            this.f7129a = intent;
            this.f7130b = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC2020e
        /* renamed from: c */
        public void mo5831c() {
            JobIntentService.this.stopSelf(this.f7130b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC2020e
        public Intent getIntent() {
            return this.f7129a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public interface InterfaceC2020e {
        /* renamed from: c */
        void mo5831c();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class JobServiceEngineC2021f extends JobServiceEngine implements InterfaceC2017b {

        /* renamed from: a */
        public final JobIntentService f7132a;

        /* renamed from: b */
        public final Object f7133b;

        /* renamed from: c */
        public JobParameters f7134c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        public final class a implements InterfaceC2020e {

            /* renamed from: a */
            public final JobWorkItem f7135a;

            public a(JobWorkItem jobWorkItem) {
                this.f7135a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC2020e
            /* renamed from: c */
            public void mo5831c() {
                synchronized (JobServiceEngineC2021f.this.f7133b) {
                    JobParameters jobParameters = JobServiceEngineC2021f.this.f7134c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f7135a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC2020e
            public Intent getIntent() {
                return this.f7135a.getIntent();
            }
        }

        public JobServiceEngineC2021f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f7133b = new Object();
            this.f7132a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC2017b
        /* renamed from: a */
        public IBinder mo5826a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC2017b
        /* renamed from: b */
        public InterfaceC2020e mo5827b() {
            synchronized (this.f7133b) {
                JobParameters jobParameters = this.f7134c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f7132a.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f7134c = jobParameters;
            this.f7132a.m5819c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zM5818b = this.f7132a.m5818b();
            synchronized (this.f7133b) {
                this.f7134c = null;
            }
            return zM5818b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    public static final class C2022g extends AbstractC2023h {

        /* renamed from: d */
        public final JobInfo f7137d;

        /* renamed from: e */
        public final JobScheduler f7138e;

        public C2022g(Context context, ComponentName componentName, int i) {
            super(componentName);
            m5832a(i);
            this.f7137d = new JobInfo.Builder(i, this.f7139a).setOverrideDeadline(0L).build();
            this.f7138e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    public static abstract class AbstractC2023h {

        /* renamed from: a */
        public final ComponentName f7139a;

        /* renamed from: b */
        public boolean f7140b;

        /* renamed from: c */
        public int f7141c;

        public AbstractC2023h(ComponentName componentName) {
            this.f7139a = componentName;
        }

        /* renamed from: a */
        public void m5832a(int i) {
            if (!this.f7140b) {
                this.f7140b = true;
                this.f7141c = i;
            } else {
                if (this.f7141c == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f7141c);
            }
        }

        /* renamed from: b */
        public void mo5828b() {
        }

        /* renamed from: c */
        public void mo5829c() {
        }

        /* renamed from: d */
        public void mo5830d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7122g = null;
        } else {
            this.f7122g = new ArrayList();
        }
    }

    /* renamed from: d */
    public static AbstractC2023h m5816d(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC2023h c2018c;
        HashMap map = f7115q;
        AbstractC2023h abstractC2023h = (AbstractC2023h) map.get(componentName);
        if (abstractC2023h != null) {
            return abstractC2023h;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c2018c = new C2018c(context, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c2018c = new C2022g(context, componentName, i);
        }
        AbstractC2023h abstractC2023h2 = c2018c;
        map.put(componentName, abstractC2023h2);
        return abstractC2023h2;
    }

    /* renamed from: a */
    public InterfaceC2020e m5817a() {
        InterfaceC2017b interfaceC2017b = this.f7116a;
        if (interfaceC2017b != null) {
            return interfaceC2017b.mo5827b();
        }
        synchronized (this.f7122g) {
            if (this.f7122g.size() <= 0) {
                return null;
            }
            return (InterfaceC2020e) this.f7122g.remove(0);
        }
    }

    /* renamed from: b */
    public boolean m5818b() {
        AsyncTaskC2016a asyncTaskC2016a = this.f7118c;
        if (asyncTaskC2016a != null) {
            asyncTaskC2016a.cancel(this.f7119d);
        }
        this.f7120e = true;
        return m5821f();
    }

    /* renamed from: c */
    public void m5819c(boolean z) {
        if (this.f7118c == null) {
            this.f7118c = new AsyncTaskC2016a();
            AbstractC2023h abstractC2023h = this.f7117b;
            if (abstractC2023h != null && z) {
                abstractC2023h.mo5829c();
            }
            this.f7118c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    public abstract void m5820e(Intent intent);

    /* renamed from: f */
    public boolean m5821f() {
        return true;
    }

    /* renamed from: g */
    public void m5822g() {
        ArrayList arrayList = this.f7122g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7118c = null;
                ArrayList arrayList2 = this.f7122g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m5819c(false);
                } else if (!this.f7121f) {
                    this.f7117b.mo5828b();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC2017b interfaceC2017b = this.f7116a;
        if (interfaceC2017b != null) {
            return interfaceC2017b.mo5826a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7116a = new JobServiceEngineC2021f(this);
            this.f7117b = null;
        } else {
            this.f7116a = null;
            this.f7117b = m5816d(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f7122g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7121f = true;
                this.f7117b.mo5828b();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f7122g == null) {
            return 2;
        }
        this.f7117b.mo5830d();
        synchronized (this.f7122g) {
            ArrayList arrayList = this.f7122g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C2019d(intent, i2));
            m5819c(true);
        }
        return 3;
    }
}
