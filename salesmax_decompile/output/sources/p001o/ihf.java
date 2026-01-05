package p001o;

import android.content.Context;
import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import java.util.Arrays;
import java.util.Locale;
import p001o.ao8;
import p001o.nl0;
import p001o.sja;

/* loaded from: classes5.dex */
public final class ihf {

    /* renamed from: a */
    public static final ihf f28687a = new ihf();

    /* renamed from: b */
    public static final String f28688b = ihf.class.getCanonicalName();

    /* renamed from: c */
    public static final long[] f28689c = {PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: a */
    public static final int m32153a(long j) {
        if (a94.m16694d(ihf.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f28689c;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                a94.m16692b(th, ihf.class);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final void m32154b(String str, mzf mzfVar, String str2, Context context) {
        String string;
        if (a94.m16694d(ihf.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "activityName");
            sq8.m48649h(context, "context");
            if (mzfVar == null || (string = mzfVar.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            ao8.C12228a c12228a = ao8.f15070b;
            ao8 ao8VarM17569b = c12228a.m17569b(str, str2, null);
            ao8VarM17569b.m17561d("fb_mobile_activate_app", bundle);
            if (c12228a.m17571d() != nl0.EnumC15599b.EXPLICIT_ONLY) {
                ao8VarM17569b.m17558a();
            }
        } catch (Throwable th) {
            a94.m16692b(th, ihf.class);
        }
    }

    /* renamed from: d */
    public static final void m32155d(String str, hhf hhfVar, String str2) {
        long jLongValue;
        String string;
        if (a94.m16694d(ihf.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "activityName");
            if (hhfVar == null) {
                return;
            }
            Long lM30590b = hhfVar.m30590b();
            if (lM30590b != null) {
                jLongValue = lM30590b.longValue();
            } else {
                Long lM30593e = hhfVar.m30593e();
                jLongValue = 0 - (lM30593e != null ? lM30593e.longValue() : 0L);
            }
            if (jLongValue < 0) {
                f28687a.m32156c();
                jLongValue = 0;
            }
            long jM30594f = hhfVar.m30594f();
            if (jM30594f < 0) {
                f28687a.m32156c();
                jM30594f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", hhfVar.m30591c());
            h8g h8gVar = h8g.f26398a;
            String str3 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m32153a(jLongValue))}, 1));
            sq8.m48648g(str3, "format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str3);
            mzf mzfVarM30595g = hhfVar.m30595g();
            if (mzfVarM30595g == null || (string = mzfVarM30595g.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lM30593e2 = hhfVar.m30593e();
            bundle.putLong("_logTime", (lM30593e2 != null ? lM30593e2.longValue() : 0L) / 1000);
            ao8.f15070b.m17569b(str, str2, null).m17560c("fb_mobile_deactivate_app", jM30594f / 1000, bundle);
        } catch (Throwable th) {
            a94.m16692b(th, ihf.class);
        }
    }

    /* renamed from: c */
    public final void m32156c() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String str = f28688b;
            sq8.m48646e(str);
            c16851a.m48387b(bkaVar, str, "Clock skew detected");
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
