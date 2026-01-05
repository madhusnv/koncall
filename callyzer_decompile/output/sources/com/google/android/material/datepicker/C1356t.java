package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import c6.i0;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import y7.t0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.t */
/* loaded from: classes.dex */
public final class C1356t extends t0 {

    /* renamed from: t */
    public final TextView f6909t;

    /* renamed from: u */
    public final MaterialCalendarGridView f6910u;

    public C1356t(LinearLayout linearLayout, boolean z6) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f6909t = textView;
        Field field = v0.f5527a;
        new i0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 1).m2435i(textView, Boolean.TRUE);
        this.f6910u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z6) {
            return;
        }
        textView.setVisibility(8);
    }
}
