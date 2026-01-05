package p013o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class l0 extends n0 {
    @Override // p013o.n0
    /* renamed from: a */
    public void mo10250a(StaticLayout.Builder builder, TextView textView) {
        Object objInvoke = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            objInvoke = o0.m10265d("getTextDirectionHeuristic").invoke(textView, null);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) objInvoke);
    }
}
