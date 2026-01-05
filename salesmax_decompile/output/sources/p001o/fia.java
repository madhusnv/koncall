package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Optional;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class fia implements PreferenceChangeEventListener {

    /* renamed from: f */
    public static final C13439a f23398f = new C13439a(null);

    /* renamed from: g */
    public static final int f23399g = 8;

    /* renamed from: h */
    public static final fia f23400h = new fia();

    /* renamed from: b */
    public volatile LocationManager f23402b;

    /* renamed from: c */
    public volatile FusedLocationProviderClient f23403c;

    /* renamed from: a */
    public volatile C13440b f23401a = new C13440b(false, false, 0, false, false, false, 63, null);

    /* renamed from: d */
    public final bia f23404d = new bia();

    /* renamed from: e */
    public final dkf f23405e = dkf.f20145a.m23376a();

    /* renamed from: o.fia$a */
    public static final class C13439a {
        public C13439a() {
        }

        public /* synthetic */ C13439a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fia m26768a() {
            return fia.f23400h;
        }
    }

    /* renamed from: o.fia$b */
    public static final class C13440b {

        /* renamed from: a */
        public boolean f23406a;

        /* renamed from: b */
        public boolean f23407b;

        /* renamed from: c */
        public long f23408c;

        /* renamed from: d */
        public boolean f23409d;

        /* renamed from: e */
        public boolean f23410e;

        /* renamed from: f */
        public boolean f23411f;

        public C13440b(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
            this.f23406a = z;
            this.f23407b = z2;
            this.f23408c = j;
            this.f23409d = z3;
            this.f23410e = z4;
            this.f23411f = z5;
        }

        /* renamed from: b */
        public static /* synthetic */ C13440b m26769b(C13440b c13440b, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c13440b.f23406a;
            }
            if ((i & 2) != 0) {
                z2 = c13440b.f23407b;
            }
            boolean z6 = z2;
            if ((i & 4) != 0) {
                j = c13440b.f23408c;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                z3 = c13440b.f23409d;
            }
            boolean z7 = z3;
            if ((i & 16) != 0) {
                z4 = c13440b.f23410e;
            }
            boolean z8 = z4;
            if ((i & 32) != 0) {
                z5 = c13440b.f23411f;
            }
            return c13440b.m26770a(z, z6, j2, z7, z8, z5);
        }

        /* renamed from: a */
        public final C13440b m26770a(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
            return new C13440b(z, z2, j, z3, z4, z5);
        }

        /* renamed from: c */
        public final boolean m26771c() {
            return this.f23409d;
        }

        /* renamed from: d */
        public final boolean m26772d() {
            return this.f23410e;
        }

        /* renamed from: e */
        public final boolean m26773e() {
            return this.f23407b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13440b)) {
                return false;
            }
            C13440b c13440b = (C13440b) obj;
            return this.f23406a == c13440b.f23406a && this.f23407b == c13440b.f23407b && this.f23408c == c13440b.f23408c && this.f23409d == c13440b.f23409d && this.f23410e == c13440b.f23410e && this.f23411f == c13440b.f23411f;
        }

        /* renamed from: f */
        public final boolean m26774f() {
            return this.f23406a;
        }

        /* renamed from: g */
        public final long m26775g() {
            return this.f23408c;
        }

        /* renamed from: h */
        public final boolean m26776h() {
            return this.f23411f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
        public int hashCode() {
            boolean z = this.f23406a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.f23407b;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int iHashCode = (((i + i2) * 31) + Long.hashCode(this.f23408c)) * 31;
            ?? r22 = this.f23409d;
            int i3 = r22;
            if (r22 != 0) {
                i3 = 1;
            }
            int i4 = (iHashCode + i3) * 31;
            ?? r23 = this.f23410e;
            int i5 = r23;
            if (r23 != 0) {
                i5 = 1;
            }
            int i6 = (i4 + i5) * 31;
            boolean z2 = this.f23411f;
            return i6 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            return "LocationTracking(enabled=" + this.f23406a + ", enablePeriodic=" + this.f23407b + ", periodicFrequency=" + this.f23408c + ", activityLocation=" + this.f23409d + ", autoTrackLocation=" + this.f23410e + ", permission=" + this.f23411f + ")";
        }

        public /* synthetic */ C13440b(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, int i, id5 id5Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS : j, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5);
        }
    }

    /* renamed from: o.fia$c */
    public /* synthetic */ class C13441c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23412a;

        static {
            int[] iArr = new int[PreferenceChangeEvent.EventType.values().length];
            try {
                iArr[PreferenceChangeEvent.EventType.PREF_TRACK_LOCATION_ON_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferenceChangeEvent.EventType.PREF_AUTO_TRACK_LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23412a = iArr;
        }
    }

    /* renamed from: o.fia$d */
    public static final class C13442d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ q7c f23413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13442d(q7c q7cVar) {
            super(1);
            this.f23413a = q7cVar;
        }

        /* renamed from: a */
        public final void m26777a(Location location) {
            uia.m51627b(uia.f48971a, "location-manager", "Location received: " + location, null, null, 12, null);
            this.f23413a.mo16430e(Optional.ofNullable(location));
            this.f23413a.onComplete();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m26777a((Location) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ x6c m26755g(fia fiaVar, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fiaVar.m26760f(context, z);
    }

    /* renamed from: h */
    public static final void m26756h(Context context, fia fiaVar, final q7c q7cVar) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(fiaVar, "this$0");
        sq8.m48649h(q7cVar, "emitter");
        if (n3d.f36317a.m40048f(context) && j4d.m33203J(context)) {
            CurrentLocationRequest currentLocationRequestBuild = new CurrentLocationRequest.Builder().setPriority(100).setDurationMillis(10000L).build();
            sq8.m48648g(currentLocationRequestBuild, "build(...)");
            FusedLocationProviderClient fusedLocationProviderClient = fiaVar.f23403c;
            Task<Location> currentLocation = fusedLocationProviderClient != null ? fusedLocationProviderClient.getCurrentLocation(currentLocationRequestBuild, (CancellationToken) null) : null;
            if (currentLocation != null) {
                final C13442d c13442d = new C13442d(q7cVar);
                currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: o.dia
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        fia.m26757i(c13442d, obj);
                    }
                });
                currentLocation.addOnFailureListener(new OnFailureListener() { // from class: o.eia
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        fia.m26758j(q7cVar, exc);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    public static final void m26757i(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: j */
    public static final void m26758j(q7c q7cVar, Exception exc) {
        sq8.m48649h(q7cVar, "$emitter");
        sq8.m48649h(exc, "it");
        uia.m51627b(uia.f48971a, "location-manager", "Error received: " + exc, null, null, 12, null);
        q7cVar.onError(exc);
    }

    /* renamed from: e */
    public final void m26759e(Context context) {
        sbj.f45162a.m48142a(context, mbj.LOCATION_RECONCILIATION);
    }

    /* renamed from: f */
    public final x6c m26760f(final Context context, boolean z) {
        sq8.m48649h(context, "context");
        if (!this.f23401a.m26774f() && !z) {
            x6c x6cVarC0 = x6c.c0(Optional.empty());
            sq8.m48648g(x6cVarC0, "just(...)");
            return x6cVarC0;
        }
        FusedLocationProviderClient fusedLocationProviderClient = this.f23403c;
        if (fusedLocationProviderClient == null) {
            fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        }
        this.f23403c = fusedLocationProviderClient;
        x6c x6cVarM55706q = x6c.m55706q(new m8c() { // from class: o.cia
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                fia.m26756h(context, this, q7cVar);
            }
        });
        sq8.m48648g(x6cVarM55706q, "create(...)");
        return x6cVarM55706q;
    }

    /* renamed from: k */
    public final void m26761k(Context context, Prefs prefs) {
        sq8.m48649h(context, "context");
        uia.m51627b(uia.f48971a, "location-manager", "Loading location tracking manager.", null, null, 12, null);
        boolean zM3243e = prefs != null ? prefs.m3243e() : false;
        boolean zM3247i = prefs != null ? prefs.m3247i() : false;
        boolean zM33203J = j4d.m33203J(context);
        this.f23401a = new C13440b(zM3243e && zM33203J, zM3247i && zM33203J, this.f23405e.m23373e(sif.PERIODIC_LOCATION_TRACKING_INTERVAL), zM3243e, zM3247i, zM33203J);
        m26763m("location tracking set at initialize.");
        m26762l(context);
    }

    /* renamed from: l */
    public final void m26762l(Context context) {
        if (!this.f23401a.m26774f() && !this.f23401a.m26773e()) {
            uia.m51627b(uia.f48971a, "location-manager", "Location tracker is not enabled: " + this.f23401a, null, null, 12, null);
            m26767q(context);
            return;
        }
        uia.m51627b(uia.f48971a, "location-manager", "Location tracker is enabled: " + this.f23401a, null, null, 12, null);
        if (n3d.f36317a.m40048f(context)) {
            FusedLocationProviderClient fusedLocationProviderClient = this.f23403c;
            if (fusedLocationProviderClient == null) {
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            }
            this.f23403c = fusedLocationProviderClient;
        } else {
            Object systemService = context.getApplicationContext().getSystemService("location");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            this.f23402b = (LocationManager) systemService;
        }
        if (this.f23401a.m26773e()) {
            m26764n(context);
        } else {
            m26767q(context);
        }
    }

    /* renamed from: m */
    public final void m26763m(String str) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setCustomKey("LocationTracking_Enabled", this.f23401a.m26774f());
        firebaseCrashlytics.setCustomKey("LocationTracking_EnablePeriodic", this.f23401a.m26773e());
        firebaseCrashlytics.setCustomKey("LocationTracking_PeriodicFrequency", this.f23401a.m26775g());
        firebaseCrashlytics.setCustomKey("LocationTracking_ActivityLocation", this.f23401a.m26771c());
        firebaseCrashlytics.setCustomKey("LocationTracking_AutoTrackLocation", this.f23401a.m26772d());
        firebaseCrashlytics.setCustomKey("LocationTracking_Permission", this.f23401a.m26776h());
        if (str == null) {
            str = "Change in location tracking observed.";
        }
        firebaseCrashlytics.recordException(new RuntimeException("LocationTracking: " + str));
    }

    /* renamed from: n */
    public final void m26764n(Context context) {
        FusedLocationProviderClient fusedLocationProviderClient;
        if (!j4d.m33203J(context) || (fusedLocationProviderClient = this.f23403c) == null) {
            return;
        }
        LocationRequest.Builder builder = new LocationRequest.Builder(this.f23401a.m26775g());
        builder.setPriority(100);
        builder.setMinUpdateDistanceMeters(0.0f);
        LocationRequest locationRequestBuild = builder.build();
        sq8.m48648g(locationRequestBuild, "build(...)");
        fusedLocationProviderClient.requestLocationUpdates(locationRequestBuild, Executors.newSingleThreadExecutor(), this.f23404d);
        m26765o(context);
    }

    /* renamed from: o */
    public final void m26765o(Context context) {
        Operation operationM24369b = e60.f21028a.m24371a().m24369b(context);
        uia.m51627b(uia.f48971a, "location-manager", "submitted work status: " + operationM24369b, null, null, 12, null);
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent) {
    }

    /* renamed from: p */
    public final void m26766p(Context context) {
        sq8.m48649h(context, "context");
        this.f23401a = C13440b.m26769b(this.f23401a, false, false, 0L, false, false, false, 60, null);
        m26762l(context);
        m26763m("location tracking on stop call may be due to logout or foreground service destroy.");
    }

    /* renamed from: q */
    public final void m26767q(Context context) {
        if (n3d.f36317a.m40048f(context)) {
            FusedLocationProviderClient fusedLocationProviderClient = this.f23403c;
            if (fusedLocationProviderClient != null) {
                fusedLocationProviderClient.removeLocationUpdates(this.f23404d);
            }
            m26759e(context);
        }
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(Context context, PreferenceChangeEvent preferenceChangeEvent) {
        sq8.m48649h(context, "context");
        boolean zM33203J = j4d.m33203J(context);
        SuperfoneApplication.C0044a c0044a = SuperfoneApplication.f225c;
        Prefs prefsM127c = c0044a.m127c();
        boolean zM3243e = prefsM127c != null ? prefsM127c.m3243e() : false;
        Prefs prefsM127c2 = c0044a.m127c();
        boolean zM3247i = prefsM127c2 != null ? prefsM127c2.m3247i() : false;
        long jM23373e = this.f23405e.m23373e(sif.PERIODIC_LOCATION_TRACKING_INTERVAL);
        if (preferenceChangeEvent != null) {
            PreferenceChangeEvent.EventType eventType = preferenceChangeEvent.getEventType();
            int i = eventType == null ? -1 : C13441c.f23412a[eventType.ordinal()];
            if (i == 1) {
                boolean zM39583a = mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue());
                this.f23401a = new C13440b(zM39583a && zM33203J, zM3247i && zM33203J, jM23373e, zM39583a, zM3247i, zM33203J);
                m26762l(context);
                m26763m("location tracking set on preference change.");
                return;
            }
            if (i == 2) {
                boolean zM39583a2 = mri.f35877a.m39583a(preferenceChangeEvent.getPrefValue());
                this.f23401a = new C13440b(zM3243e && zM33203J, zM39583a2 && zM33203J, jM23373e, zM3243e, zM39583a2, zM33203J);
                m26762l(context);
                m26763m("location tracking set on preference change.");
                return;
            }
            uia.m51627b(uia.f48971a, "location-manager", "Unknown preference event type: " + preferenceChangeEvent.getEventType(), null, null, 12, null);
        }
    }
}
