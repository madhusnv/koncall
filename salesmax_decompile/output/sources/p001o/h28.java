package p001o;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class h28 extends fz4 {

    /* renamed from: b */
    public final iz4 f26124b;

    /* renamed from: c */
    public final int f26125c;

    public h28(iz4 iz4Var, int i, int i2) {
        super(m29758b(i, i2));
        this.f26124b = iz4Var;
        this.f26125c = i2;
    }

    /* renamed from: b */
    public static int m29758b(int i, int i2) {
        return (i == 2000 && i2 == 1) ? CastStatusCodes.INVALID_REQUEST : i;
    }

    /* renamed from: c */
    public static h28 m29759c(IOException iOException, iz4 iz4Var, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? CastStatusCodes.CANCELED : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !kp0.m35995e(message).matches("cleartext.*not permitted.*")) ? CastStatusCodes.INVALID_REQUEST : 2007;
        return i2 == 2007 ? new g28(iOException, iz4Var) : new h28(iOException, iz4Var, i2, i);
    }

    public h28(String str, iz4 iz4Var, int i, int i2) {
        super(str, m29758b(i, i2));
        this.f26124b = iz4Var;
        this.f26125c = i2;
    }

    public h28(IOException iOException, iz4 iz4Var, int i, int i2) {
        super(iOException, m29758b(i, i2));
        this.f26124b = iz4Var;
        this.f26125c = i2;
    }

    public h28(String str, IOException iOException, iz4 iz4Var, int i, int i2) {
        super(str, iOException, m29758b(i, i2));
        this.f26124b = iz4Var;
        this.f26125c = i2;
    }
}
