package p001o;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p001o.j51;

/* loaded from: classes5.dex */
public abstract class e5f {

    /* renamed from: o.e5f$a */
    public static class C13102a {

        /* renamed from: a */
        public ib3 f20992a;

        /* renamed from: b */
        public Map f20993b = new HashMap();

        /* renamed from: a */
        public C13102a m24327a(fid fidVar, AbstractC13103b abstractC13103b) {
            this.f20993b.put(fidVar, abstractC13103b);
            return this;
        }

        /* renamed from: b */
        public e5f m24328b() {
            if (this.f20992a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f20993b.keySet().size() < fid.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f20993b;
            this.f20993b = new HashMap();
            return e5f.m24318d(this.f20992a, map);
        }

        /* renamed from: c */
        public C13102a m24329c(ib3 ib3Var) {
            this.f20992a = ib3Var;
            return this;
        }
    }

    /* renamed from: o.e5f$b */
    public static abstract class AbstractC13103b {

        /* renamed from: o.e5f$b$a */
        public static abstract class a {
            /* renamed from: a */
            public abstract AbstractC13103b mo24334a();

            /* renamed from: b */
            public abstract a mo24335b(long j);

            /* renamed from: c */
            public abstract a mo24336c(Set set);

            /* renamed from: d */
            public abstract a mo24337d(long j);
        }

        /* renamed from: a */
        public static a m24330a() {
            return new j51.C14450b().mo24336c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo24331b();

        /* renamed from: c */
        public abstract Set mo24332c();

        /* renamed from: d */
        public abstract long mo24333d();
    }

    /* renamed from: o.e5f$c */
    public enum EnumC13104c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static C13102a m24317b() {
        return new C13102a();
    }

    /* renamed from: d */
    public static e5f m24318d(ib3 ib3Var, Map map) {
        return new i51(ib3Var, map);
    }

    /* renamed from: f */
    public static e5f m24319f(ib3 ib3Var) {
        return m24317b().m24327a(fid.DEFAULT, AbstractC13103b.m24330a().mo24335b(30000L).mo24337d(86400000L).mo24334a()).m24327a(fid.HIGHEST, AbstractC13103b.m24330a().mo24335b(1000L).mo24337d(86400000L).mo24334a()).m24327a(fid.VERY_LOW, AbstractC13103b.m24330a().mo24335b(86400000L).mo24337d(86400000L).mo24336c(m24320i(EnumC13104c.DEVICE_IDLE)).mo24334a()).m24329c(ib3Var).m24328b();
    }

    /* renamed from: i */
    public static Set m24320i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* renamed from: a */
    public final long m24321a(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * r7)));
    }

    /* renamed from: c */
    public JobInfo.Builder m24322c(JobInfo.Builder builder, fid fidVar, long j, int i) {
        builder.setMinimumLatency(m24324g(fidVar, j, i));
        m24326j(builder, ((AbstractC13103b) mo24325h().get(fidVar)).mo24332c());
        return builder;
    }

    /* renamed from: e */
    public abstract ib3 mo24323e();

    /* renamed from: g */
    public long m24324g(fid fidVar, long j, int i) {
        long time = j - mo24323e().getTime();
        AbstractC13103b abstractC13103b = (AbstractC13103b) mo24325h().get(fidVar);
        return Math.min(Math.max(m24321a(i, abstractC13103b.mo24331b()), time), abstractC13103b.mo24333d());
    }

    /* renamed from: h */
    public abstract Map mo24325h();

    /* renamed from: j */
    public final void m24326j(JobInfo.Builder builder, Set set) {
        if (set.contains(EnumC13104c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC13104c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC13104c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
