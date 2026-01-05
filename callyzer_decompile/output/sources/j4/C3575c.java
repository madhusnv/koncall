package j4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.skydoves.balloon.internals.DefinitionKt;
import h4.AbstractC2842s;
import h4.C2840q;
import kotlin.jvm.internal.AbstractC4154l;
import pg.t7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.c */
/* loaded from: classes.dex */
public final class C3575c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        C2840q c2840q = AbstractC2842s.f15844a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM11870b = t7.m11870b(layout, lineForOffset, paint) + t7.m11869a(layout, lineForOffset, paint);
            if (fM11870b == DefinitionKt.NO_Float_VALUE) {
                return;
            }
            AbstractC4154l.m8920c(canvas);
            canvas.translate(fM11870b, DefinitionKt.NO_Float_VALUE);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return 0;
    }
}
