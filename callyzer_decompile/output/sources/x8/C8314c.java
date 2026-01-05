package x8;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7058d;
import t8.C7059e;
import t8.C7077w;
import t8.EnumC7055a;
import t8.EnumC7078x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x8.c */
/* loaded from: classes.dex */
public final class C8314c {

    /* renamed from: a */
    public final ComponentName f39863a;

    /* renamed from: b */
    public final C7077w f39864b;

    /* renamed from: c */
    public final boolean f39865c;

    static {
        C7077w.m13372b("SystemJobInfoConverter");
    }

    public C8314c(Context context, C7077w c7077w, boolean z6) {
        this.f39864b = c7077w;
        this.f39863a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f39865c = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final JobInfo m15511a(C0922q c0922q, int i10) {
        int i11;
        String str;
        C7059e c7059e = c0922q.f5631j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c0922q.f5622a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c0922q.f5641t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c0922q.m2671d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, this.f39863a).setRequiresCharging(c7059e.f34131c);
        boolean z6 = c7059e.f34132d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z6).setExtras(persistableBundle);
        NetworkRequest networkRequestM13351a = c7059e.m13351a();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28 || networkRequestM13351a == null) {
            EnumC7078x enumC7078x = c7059e.f34129a;
            if (i12 < 30 || enumC7078x != EnumC7078x.TEMPORARILY_UNMETERED) {
                int i13 = AbstractC8313b.f39862a[enumC7078x.ordinal()];
                if (i13 != 1) {
                    i11 = 2;
                    if (i13 == 2) {
                        i11 = 1;
                    } else if (i13 != 3) {
                        i11 = 4;
                        if (i13 == 4) {
                            i11 = 3;
                        } else if (i13 != 5 || i12 < 26) {
                            C7077w c7077wM13371a = C7077w.m13371a();
                            enumC7078x.toString();
                            c7077wM13371a.getClass();
                            i11 = 1;
                        }
                    }
                } else {
                    i11 = 0;
                }
                builder.setRequiredNetworkType(i11);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            AbstractC4154l.m8923f(builder, "builder");
            builder.setRequiredNetwork(networkRequestM13351a);
        }
        if (!z6) {
            builder.setBackoffCriteria(c0922q.f5634m, c0922q.f5633l == EnumC7055a.LINEAR ? 0 : 1);
        }
        long jM2669a = c0922q.m2669a();
        this.f39864b.getClass();
        long jMax = Math.max(jM2669a - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            builder.setMinimumLatency(jMax);
        } else if (!c0922q.f5638q && this.f39865c) {
            builder.setImportantWhileForeground(true);
        }
        if (c7059e.m13352b()) {
            for (C7058d c7058d : c7059e.f34137i) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(c7058d.f34124a, c7058d.f34125b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(c7059e.f34135g);
            builder.setTriggerContentMaxDelay(c7059e.f34136h);
        }
        builder.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            builder.setRequiresBatteryNotLow(c7059e.f34133e);
            builder.setRequiresStorageNotLow(c7059e.f34134f);
        }
        Object[] objArr = c0922q.f5632k > 0;
        boolean z10 = jMax > 0;
        if (i14 >= 31 && c0922q.f5638q && objArr == false && !z10) {
            builder.setExpedited(true);
        }
        if (i14 >= 35 && (str = c0922q.f5645x) != null) {
            builder.setTraceTag(str);
        }
        return builder.build();
    }
}
