package p001o;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes3.dex */
public class yj8 extends ApiException {
    public yj8(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i), mhj.m39086a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
