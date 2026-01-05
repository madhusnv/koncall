package p001o;

import androidx.work.PeriodicWorkRequest;

/* loaded from: classes.dex */
public final class dkf {

    /* renamed from: a */
    public static final C12981a f20145a = new C12981a(null);

    /* renamed from: b */
    public static final dkf f20146b = new dkf();

    /* renamed from: c */
    public static final nc f20147c = nc.f36666b.m40300a();

    /* renamed from: o.dkf$a */
    public static final class C12981a {
        public C12981a() {
        }

        public /* synthetic */ C12981a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final dkf m23376a() {
            return dkf.f20146b;
        }
    }

    /* renamed from: o.dkf$b */
    public /* synthetic */ class C12982b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20148a;

        static {
            int[] iArr = new int[sif.values().length];
            try {
                iArr[sif.CALL_RECON_LOOK_BACK_THRESHOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sif.PERIODIC_LOCATION_TRACKING_INTERVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sif.CALL_FLOW_MAX_WAIT_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sif.CONTACT_CACHE_REFRESH_DELAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20148a = iArr;
        }
    }

    /* renamed from: b */
    public final long m23370b() {
        return 60000L;
    }

    /* renamed from: c */
    public final int m23371c() {
        return 259200000;
    }

    /* renamed from: d */
    public final long m23372d() {
        return 10000L;
    }

    /* renamed from: e */
    public final long m23373e(sif sifVar) {
        sq8.m48649h(sifVar, "settingName");
        Long lM39584b = mri.f35877a.m39584b(m23374f(sifVar));
        sq8.m48646e(lM39584b);
        return lM39584b.longValue();
    }

    /* renamed from: f */
    public final Object m23374f(sif sifVar) {
        sq8.m48649h(sifVar, "settingName");
        int i = C12982b.f20148a[sifVar.ordinal()];
        if (i == 1) {
            return Integer.valueOf(m23371c());
        }
        if (i == 2) {
            return Long.valueOf(m23375g());
        }
        if (i == 3) {
            return Long.valueOf(m23370b());
        }
        if (i == 4) {
            return Long.valueOf(m23372d());
        }
        throw new szb();
    }

    /* renamed from: g */
    public final long m23375g() {
        return PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    }
}
