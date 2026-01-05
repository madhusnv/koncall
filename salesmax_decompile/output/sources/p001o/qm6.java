package p001o;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C2181a;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class qm6 extends iad {

    /* renamed from: X */
    public static final String f42139X = sqi.B0(1001);

    /* renamed from: Y */
    public static final String f42140Y = sqi.B0(1002);

    /* renamed from: Z */
    public static final String f42141Z = sqi.B0(1003);
    public static final String h0 = sqi.B0(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
    public static final String i0 = sqi.B0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
    public static final String j0 = sqi.B0(1006);

    /* renamed from: H */
    public final C2181a f42142H;

    /* renamed from: L */
    public final int f42143L;

    /* renamed from: M */
    public final x8b.C18076b f42144M;

    /* renamed from: Q */
    public final boolean f42145Q;

    /* renamed from: s */
    public final int f42146s;

    /* renamed from: x */
    public final String f42147x;

    /* renamed from: y */
    public final int f42148y;

    public qm6(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static qm6 m45648b(Throwable th, String str, int i, C2181a c2181a, int i2, boolean z, int i3) {
        return new qm6(1, th, null, i3, str, i, c2181a, c2181a == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static qm6 m45649c(IOException iOException, int i) {
        return new qm6(0, iOException, i);
    }

    /* renamed from: d */
    public static qm6 m45650d(RuntimeException runtimeException, int i) {
        return new qm6(2, runtimeException, i);
    }

    /* renamed from: e */
    public static String m45651e(int i, String str, String str2, int i2, C2181a c2181a, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c2181a + ", format_supported=" + sqi.a0(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* renamed from: a */
    public qm6 m45652a(x8b.C18076b c18076b) {
        return new qm6((String) sqi.m48729h(getMessage()), getCause(), this.f28346a, this.f42146s, this.f42147x, this.f42148y, this.f42142H, this.f42143L, c18076b, this.f28347b, this.f42145Q);
    }

    public qm6(int i, Throwable th, String str, int i2, String str2, int i3, C2181a c2181a, int i4, boolean z) {
        this(m45651e(i, str, str2, i3, c2181a, i4), th, i2, i, str2, i3, c2181a, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public qm6(String str, Throwable th, int i, int i2, String str2, int i3, C2181a c2181a, int i4, x8b.C18076b c18076b, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        op0.m42511a(!z || i2 == 1);
        op0.m42511a(th != null || i2 == 3);
        this.f42146s = i2;
        this.f42147x = str2;
        this.f42148y = i3;
        this.f42142H = c2181a;
        this.f42143L = i4;
        this.f42144M = c18076b;
        this.f42145Q = z;
    }
}
