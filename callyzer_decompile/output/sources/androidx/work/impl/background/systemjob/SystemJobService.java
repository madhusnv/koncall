package androidx.work.impl.background.systemjob;

import a1.RunnableC0025x;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import c6.AbstractC0879i;
import c9.C0915j;
import e9.InterfaceC1970a;
import i1.AbstractC3131j;
import java.util.Arrays;
import java.util.HashMap;
import l4.C4367l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import t8.C7062h;
import t8.C7077w;
import u8.C7356d;
import u8.C7361i;
import u8.C7368p;
import u8.InterfaceC7354b;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC7354b {

    /* renamed from: e */
    public static final /* synthetic */ int f2885e = 0;

    /* renamed from: a */
    public C7368p f2886a;

    /* renamed from: b */
    public final HashMap f2887b = new HashMap();

    /* renamed from: c */
    public final C7062h f2888c = new C7062h(1);

    /* renamed from: d */
    public C8849i f2889d;

    static {
        C7077w.m13372b("SystemJobService");
    }

    /* renamed from: b */
    public static void m1379b(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC5601a.m11238i("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: c */
    public static C0915j m1380c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0915j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u8.InterfaceC7354b
    /* renamed from: a */
    public final void mo1381a(C0915j c0915j, boolean z6) {
        m1379b("onExecuted");
        C7077w c7077wM13371a = C7077w.m13371a();
        String str = c0915j.f5589a;
        c7077wM13371a.getClass();
        JobParameters jobParameters = (JobParameters) this.f2887b.remove(c0915j);
        this.f2888c.m13362e(c0915j);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C7368p c7368pM13783g = C7368p.m13783g(getApplicationContext());
            this.f2886a = c7368pM13783g;
            C7356d c7356d = c7368pM13783g.f35048f;
            this.f2889d = new C8849i(c7356d, c7368pM13783g.f35046d);
            c7356d.m13769a(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            C7077w.m13371a().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C7368p c7368p = this.f2886a;
        if (c7368p != null) {
            c7368p.f35048f.m13772e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m1379b("onStartJob");
        if (this.f2886a == null) {
            C7077w.m13371a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C0915j c0915jM1380c = m1380c(jobParameters);
        if (c0915jM1380c == null) {
            C7077w.m13371a().getClass();
            return false;
        }
        HashMap map = this.f2887b;
        if (map.containsKey(c0915jM1380c)) {
            C7077w c7077wM13371a = C7077w.m13371a();
            c0915jM1380c.toString();
            c7077wM13371a.getClass();
            return false;
        }
        C7077w c7077wM13371a2 = C7077w.m13371a();
        c0915jM1380c.toString();
        c7077wM13371a2.getClass();
        map.put(c0915jM1380c, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        C4367l c4367l = new C4367l(27);
        if (jobParameters.getTriggeredContentUris() != null) {
            c4367l.f21922c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            c4367l.f21921b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i10 >= 28) {
            c4367l.f21923d = AbstractC0879i.m2394f(jobParameters);
        }
        C8849i c8849i = this.f2889d;
        C7361i c7361iM13363f = this.f2888c.m13363f(c0915jM1380c);
        c8849i.getClass();
        ((InterfaceC1970a) c8849i.f42584c).m5712a(new RunnableC0025x(22, c8849i, c7361iM13363f, c4367l));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m1379b("onStopJob");
        if (this.f2886a == null) {
            C7077w.m13371a().getClass();
            return true;
        }
        C0915j c0915jM1380c = m1380c(jobParameters);
        if (c0915jM1380c == null) {
            C7077w.m13371a().getClass();
            return false;
        }
        C7077w c7077wM13371a = C7077w.m13371a();
        c0915jM1380c.toString();
        c7077wM13371a.getClass();
        this.f2887b.remove(c0915jM1380c);
        C7361i c7361iM13362e = this.f2888c.m13362e(c0915jM1380c);
        if (c7361iM13362e != null) {
            int iM7514d = Build.VERSION.SDK_INT >= 31 ? AbstractC3131j.m7514d(jobParameters) : -512;
            C8849i c8849i = this.f2889d;
            c8849i.getClass();
            c8849i.m16318K(c7361iM13362e, iM7514d);
        }
        C7356d c7356d = this.f2886a.f35048f;
        String str = c0915jM1380c.f5589a;
        synchronized (c7356d.f35013k) {
            zContains = c7356d.f35011i.contains(str);
        }
        return !zContains;
    }
}
