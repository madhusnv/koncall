package p001o;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.location.FusedLocationProviderClient;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class wha {

    /* renamed from: a */
    public static Field f52001a;

    /* renamed from: b */
    public static Integer f52002b;

    /* renamed from: c */
    public static Integer f52003c;

    /* renamed from: d */
    public static Integer f52004d;

    /* renamed from: o.wha$a */
    public static class C17868a {
        /* renamed from: a */
        public static float m54416a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        /* renamed from: b */
        public static float m54417b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        /* renamed from: c */
        public static float m54418c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        /* renamed from: d */
        public static boolean m54419d(Location location) {
            return location.hasBearingAccuracy();
        }

        /* renamed from: e */
        public static boolean m54420e(Location location) {
            return location.hasSpeedAccuracy();
        }

        /* renamed from: f */
        public static boolean m54421f(Location location) {
            return location.hasVerticalAccuracy();
        }

        /* renamed from: g */
        public static void m54422g(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                wha.m54406d().setByte(location, (byte) (wha.m54406d().getByte(location) & (~wha.m54407e())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        /* renamed from: h */
        public static void m54423h(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                wha.m54406d().setByte(location, (byte) (wha.m54406d().getByte(location) & (~wha.m54408f())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        /* renamed from: i */
        public static void m54424i(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                wha.m54406d().setByte(location, (byte) (wha.m54406d().getByte(location) & (~wha.m54409g())));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        /* renamed from: j */
        public static void m54425j(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        /* renamed from: k */
        public static void m54426k(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        /* renamed from: l */
        public static void m54427l(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* renamed from: a */
    public static boolean m54403a(Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    /* renamed from: b */
    public static float m54404b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17868a.m54416a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("bearingAccuracy", 0.0f);
    }

    /* renamed from: c */
    public static long m54405c(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    /* renamed from: d */
    public static Field m54406d() throws NoSuchFieldException, SecurityException {
        if (f52001a == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f52001a = declaredField;
            declaredField.setAccessible(true);
        }
        return f52001a;
    }

    /* renamed from: e */
    public static int m54407e() throws NoSuchFieldException, SecurityException {
        if (f52003c == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f52003c = Integer.valueOf(declaredField.getInt(null));
        }
        return f52003c.intValue();
    }

    /* renamed from: f */
    public static int m54408f() throws NoSuchFieldException, SecurityException {
        if (f52002b == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f52002b = Integer.valueOf(declaredField.getInt(null));
        }
        return f52002b.intValue();
    }

    /* renamed from: g */
    public static int m54409g() throws NoSuchFieldException, SecurityException {
        if (f52004d == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f52004d = Integer.valueOf(declaredField.getInt(null));
        }
        return f52004d.intValue();
    }

    /* renamed from: h */
    public static float m54410h(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17868a.m54417b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("speedAccuracy", 0.0f);
    }

    /* renamed from: i */
    public static float m54411i(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17868a.m54418c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0.0f);
    }

    /* renamed from: j */
    public static boolean m54412j(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C17868a.m54419d(location) : m54403a(location, "bearingAccuracy");
    }

    /* renamed from: k */
    public static boolean m54413k(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C17868a.m54420e(location) : m54403a(location, "speedAccuracy");
    }

    /* renamed from: l */
    public static boolean m54414l(Location location) {
        return Build.VERSION.SDK_INT >= 26 ? C17868a.m54421f(location) : m54403a(location, FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
    }

    /* renamed from: m */
    public static boolean m54415m(Location location) {
        return location.isFromMockProvider();
    }
}
