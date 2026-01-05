package ai.salesmax.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class AllAutoCompleteTextView extends MaterialAutoCompleteTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48646e(context);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        performFiltering("", 0);
    }
}
