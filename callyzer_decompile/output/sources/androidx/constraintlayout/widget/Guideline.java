package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import m5.C4653g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        C4653g c4653g = (C4653g) getLayoutParams();
        c4653g.f22931a = i10;
        setLayoutParams(c4653g);
    }

    public void setGuidelineEnd(int i10) {
        C4653g c4653g = (C4653g) getLayoutParams();
        c4653g.f22932b = i10;
        setLayoutParams(c4653g);
    }

    public void setGuidelinePercent(float f6) {
        C4653g c4653g = (C4653g) getLayoutParams();
        c4653g.f22933c = f6;
        setLayoutParams(c4653g);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
