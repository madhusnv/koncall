package p013o;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n0 {
    /* renamed from: a */
    public abstract void mo10250a(StaticLayout.Builder builder, TextView textView);

    /* renamed from: b */
    public boolean mo10253b(TextView textView) {
        Object objInvoke = Boolean.FALSE;
        try {
            objInvoke = o0.m10265d("getHorizontallyScrolling").invoke(textView, null);
        } catch (Exception unused) {
        }
        return ((Boolean) objInvoke).booleanValue();
    }
}
