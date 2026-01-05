package og;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import kotlin.jvm.internal.AbstractC4154l;
import t8.EnumC7055a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ia {
    /* renamed from: a */
    public static long m10697a(boolean z6, int i10, EnumC7055a backoffPolicy, long j6, long j10, int i11, boolean z10, long j11, long j12, long j13, long j14) {
        AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
        if (j14 != Long.MAX_VALUE && z10) {
            if (i11 != 0) {
                long j15 = j10 + 900000;
                if (j14 < j15) {
                    return j15;
                }
            }
            return j14;
        }
        if (z6) {
            long jScalb = backoffPolicy == EnumC7055a.LINEAR ? j6 * i10 : (long) Math.scalb(j6, i10 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        if (z10) {
            long j16 = i11 == 0 ? j10 + j11 : j10 + j13;
            return (j12 == j13 || i11 != 0) ? j16 : (j13 - j12) + j16;
        }
        if (j10 == -1) {
            return Long.MAX_VALUE;
        }
        return j10 + j11;
    }

    /* renamed from: b */
    public static void m10698b(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p013o.f2.m10237a(view, charSequence);
            return;
        }
        p013o.h2 h2Var = p013o.h2.f25502l;
        if (h2Var != null && h2Var.f25504a == view) {
            p013o.h2.m10238b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p013o.h2(view, charSequence);
            return;
        }
        p013o.h2 h2Var2 = p013o.h2.f25503m;
        if (h2Var2 != null && h2Var2.f25504a == view) {
            h2Var2.m10239a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
