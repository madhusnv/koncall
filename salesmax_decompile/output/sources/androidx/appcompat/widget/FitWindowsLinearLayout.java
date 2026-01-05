package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p001o.v17;

/* loaded from: classes2.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a */
    public v17 f5875a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        v17 v17Var = this.f5875a;
        if (v17Var != null) {
            v17Var.m52226a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(v17 v17Var) {
        this.f5875a = v17Var;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
