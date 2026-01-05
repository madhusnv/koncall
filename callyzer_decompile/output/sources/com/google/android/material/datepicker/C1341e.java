package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.websoptimization.callyzerbiz.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C1341e extends BaseAdapter {

    /* renamed from: d */
    public static final int f6852d;

    /* renamed from: a */
    public final Calendar f6853a;

    /* renamed from: b */
    public final int f6854b;

    /* renamed from: c */
    public final int f6855c;

    static {
        f6852d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C1341e() {
        Calendar calendarM4113c = AbstractC1361y.m4113c(null);
        this.f6853a = calendarM4113c;
        this.f6854b = calendarM4113c.getMaximum(7);
        this.f6855c = calendarM4113c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6854b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f6854b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f6855c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f6855c;
        int i12 = this.f6854b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f6853a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f6852d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
