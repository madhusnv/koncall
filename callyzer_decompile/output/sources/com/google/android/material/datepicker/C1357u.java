package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.websoptimization.callyzerbiz.R;
import java.util.Calendar;
import y7.AbstractC8590y;
import y7.g0;
import y7.t0;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
public final class C1357u extends AbstractC8590y {

    /* renamed from: c */
    public final ContextThemeWrapper f6911c;

    /* renamed from: d */
    public final C1338b f6912d;

    /* renamed from: e */
    public final C8989c f6913e;

    /* renamed from: f */
    public final int f6914f;

    public C1357u(ContextThemeWrapper contextThemeWrapper, C1338b c1338b, C8989c c8989c) {
        C1353q c1353q = c1338b.f6839a;
        C1353q c1353q2 = c1338b.f6840b;
        C1353q c1353q3 = c1338b.f6842d;
        if (c1353q.compareTo(c1353q3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c1353q3.compareTo(c1353q2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C1354r.f6903d;
        int dimensionPixelSize2 = C1351o.m4100n(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.f6911c = contextThemeWrapper;
        this.f6914f = dimensionPixelSize + dimensionPixelSize2;
        this.f6912d = c1338b;
        this.f6913e = c8989c;
        if (this.f41832a.m15949a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f41833b = true;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: a */
    public final int mo4090a() {
        return this.f6912d.f6844f;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: b */
    public final long mo4109b(int i10) {
        Calendar calendarM4111a = AbstractC1361y.m4111a(this.f6912d.f6839a.f6896a);
        calendarM4111a.add(2, i10);
        calendarM4111a.set(5, 1);
        Calendar calendarM4111a2 = AbstractC1361y.m4111a(calendarM4111a);
        calendarM4111a2.get(2);
        calendarM4111a2.get(1);
        calendarM4111a2.getMaximum(7);
        calendarM4111a2.getActualMaximum(5);
        calendarM4111a2.getTimeInMillis();
        return calendarM4111a2.getTimeInMillis();
    }

    @Override // y7.AbstractC8590y
    /* renamed from: c */
    public final void mo4091c(t0 t0Var, int i10) {
        C1356t c1356t = (C1356t) t0Var;
        C1338b c1338b = this.f6912d;
        Calendar calendarM4111a = AbstractC1361y.m4111a(c1338b.f6839a.f6896a);
        calendarM4111a.add(2, i10);
        C1353q c1353q = new C1353q(calendarM4111a);
        c1356t.f6909t.setText(c1353q.m4105e(c1356t.f41792a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c1356t.f6910u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m4089a() == null || !c1353q.equals(materialCalendarGridView.m4089a().f6904a)) {
            new C1354r(c1353q, c1338b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m4089a().getClass();
        throw null;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: d */
    public final t0 mo4092d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C1351o.m4100n(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C1356t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new g0(-1, this.f6914f));
        return new C1356t(linearLayout, true);
    }
}
