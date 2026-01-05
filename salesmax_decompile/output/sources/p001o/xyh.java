package p001o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.onesignal.location.internal.common.LocationConstants;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class xyh {

    /* renamed from: d */
    public static xyh f54485d;

    /* renamed from: a */
    public final Context f54486a;

    /* renamed from: b */
    public final LocationManager f54487b;

    /* renamed from: c */
    public final C18265a f54488c = new C18265a();

    /* renamed from: o.xyh$a */
    public static class C18265a {

        /* renamed from: a */
        public boolean f54489a;

        /* renamed from: b */
        public long f54490b;
    }

    public xyh(Context context, LocationManager locationManager) {
        this.f54486a = context;
        this.f54487b = locationManager;
    }

    /* renamed from: a */
    public static xyh m56965a(Context context) {
        if (f54485d == null) {
            Context applicationContext = context.getApplicationContext();
            f54485d = new xyh(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f54485d;
    }

    /* renamed from: b */
    public final Location m56966b() {
        Location locationM56967c = h3d.m29777b(this.f54486a, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING) == 0 ? m56967c("network") : null;
        Location locationM56967c2 = h3d.m29777b(this.f54486a, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING) == 0 ? m56967c("gps") : null;
        return (locationM56967c2 == null || locationM56967c == null) ? locationM56967c2 != null ? locationM56967c2 : locationM56967c : locationM56967c2.getTime() > locationM56967c.getTime() ? locationM56967c2 : locationM56967c;
    }

    /* renamed from: c */
    public final Location m56967c(String str) {
        try {
            if (this.f54487b.isProviderEnabled(str)) {
                return this.f54487b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean m56968d() {
        C18265a c18265a = this.f54488c;
        if (m56969e()) {
            return c18265a.f54489a;
        }
        Location locationM56966b = m56966b();
        if (locationM56966b != null) {
            m56970f(locationM56966b);
            return c18265a.f54489a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: e */
    public final boolean m56969e() {
        return this.f54488c.f54490b > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void m56970f(Location location) {
        long j;
        C18265a c18265a = this.f54488c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        wyh wyhVarM55428b = wyh.m55428b();
        wyhVarM55428b.m55429a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        wyhVarM55428b.m55429a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = wyhVarM55428b.f52903c == 1;
        long j2 = wyhVarM55428b.f52902b;
        long j3 = wyhVarM55428b.f52901a;
        wyhVarM55428b.m55429a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = wyhVarM55428b.f52902b;
        if (j2 == -1 || j3 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            j = (jCurrentTimeMillis > j3 ? j4 + 0 : jCurrentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
        }
        c18265a.f54489a = z;
        c18265a.f54490b = j;
    }
}
