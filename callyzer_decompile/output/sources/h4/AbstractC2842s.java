package h4;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.s */
/* loaded from: classes.dex */
public abstract class AbstractC2842s {

    /* renamed from: a */
    public static final C2840q f15844a = new C2840q();

    /* renamed from: b */
    public static final long f15845b;

    static {
        long j6 = 0;
        f15845b = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: a */
    public static final TextDirectionHeuristic m6977a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
