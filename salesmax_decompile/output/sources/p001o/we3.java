package p001o;

import com.google.android.gms.cast.MediaError;
import org.apache.http.HttpStatus;
import org.apache.http.impl.client.DefaultRedirectStrategy;

/* loaded from: classes6.dex */
public abstract class we3 extends ncc {

    /* renamed from: a */
    public static final char[] f51841a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: b */
    public static final int[] f51842b;

    /* renamed from: c */
    public static final int f51843c;

    static {
        int[] iArr = {276, 328, 324, MediaError.DetailedErrorCode.DASH_NO_INIT, 296, 292, 290, 336, 274, 266, HttpStatus.SC_FAILED_DEPENDENCY, 420, 418, 404, 402, 394, 360, 356, 354, DefaultRedirectStrategy.SC_PERMANENT_REDIRECT, 282, 344, MediaError.DetailedErrorCode.SMOOTH_NO_MEDIA_DATA, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, MediaError.DetailedErrorCode.HLS_NETWORK_KEY_LOAD, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f51842b = iArr;
        f51843c = iArr[47];
    }
}
