package p001o;

import android.content.Context;
import android.content.Intent;
import p001o.os;

/* loaded from: classes2.dex */
public final class ts extends os {
    @Override // p001o.os
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo6230a(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "input");
        return ss.f45852a.m48833a(new String[]{str});
    }

    @Override // p001o.os
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public os.C15882a mo42610b(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "input");
        if (c64.checkSelfPermission(context, str) == 0) {
            return new os.C15882a(Boolean.TRUE);
        }
        return null;
    }

    @Override // p001o.os
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean mo6231c(int i, Intent intent) {
        boolean z;
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z2 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
