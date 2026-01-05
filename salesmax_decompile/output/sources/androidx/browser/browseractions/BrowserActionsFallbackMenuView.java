package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p001o.c7e;

@Deprecated
/* loaded from: classes2.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    public final int f6036a;

    /* renamed from: b */
    public final int f6037b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6036a = getResources().getDimensionPixelOffset(c7e.browser_actions_context_menu_min_padding);
        this.f6037b = getResources().getDimensionPixelOffset(c7e.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f6036a * 2), this.f6037b), 1073741824), i2);
    }
}
