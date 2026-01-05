package p001o;

import android.content.Context;
import android.os.Build;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ci3 {
    static ci3 getInstance() {
        int i = Build.VERSION.SDK_INT;
        if (30 <= i && i <= 33) {
            return oqe.getInstance();
        }
        if (i >= 34) {
            return oqe.getInstance();
        }
        return null;
    }

    /* renamed from: a */
    boolean mo21295a(Context context, Map map);
}
