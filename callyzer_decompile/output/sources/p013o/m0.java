package p013o;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends l0 {
    @Override // p013o.l0, p013o.n0
    /* renamed from: a */
    public void mo10250a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p013o.n0
    /* renamed from: b */
    public boolean mo10253b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
