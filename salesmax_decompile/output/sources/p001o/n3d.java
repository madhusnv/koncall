package p001o;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes.dex */
public final class n3d {

    /* renamed from: a */
    public static final n3d f36317a = new n3d();

    /* renamed from: a */
    public final boolean m40043a(Context context) {
        sq8.m48649h(context, "context");
        return m40045c(context) && m40046d(context);
    }

    /* renamed from: b */
    public final boolean m40044b(Context context) {
        return Build.VERSION.SDK_INT >= 33 ? c64.checkSelfPermission(context, "android.permission.READ_MEDIA_AUDIO") == 0 : c64.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: c */
    public final boolean m40045c(Context context) {
        sq8.m48649h(context, "context");
        return c64.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0;
    }

    /* renamed from: d */
    public final boolean m40046d(Context context) {
        return c64.checkSelfPermission(context, "android.permission.READ_CALL_LOG") == 0;
    }

    /* renamed from: e */
    public final boolean m40047e(Context context) {
        sq8.m48649h(context, "context");
        return m40044b(context);
    }

    /* renamed from: f */
    public final boolean m40048f(Context context) {
        sq8.m48649h(context, "context");
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        sq8.m48648g(googleApiAvailability, "getInstance(...)");
        return googleApiAvailability.isGooglePlayServicesAvailable(context) == 0;
    }
}
