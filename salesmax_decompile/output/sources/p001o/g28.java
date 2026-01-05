package p001o;

import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class g28 extends h28 {
    public g28(IOException iOException, iz4 iz4Var) {
        super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, iz4Var, CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, 1);
    }
}
