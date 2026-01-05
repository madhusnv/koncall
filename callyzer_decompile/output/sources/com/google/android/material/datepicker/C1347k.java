package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.TimeZone;
import y7.f0;
import y7.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C1347k extends i0 {

    /* renamed from: a */
    public final /* synthetic */ C1357u f6864a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f6865b;

    /* renamed from: c */
    public final /* synthetic */ C1350n f6866c;

    public C1347k(C1350n c1350n, C1357u c1357u, MaterialButton materialButton) {
        this.f6866c = c1350n;
        this.f6864a = c1357u;
        this.f6865b = materialButton;
    }

    @Override // y7.i0
    /* renamed from: a */
    public final void mo4095a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f6865b.getText());
        }
    }

    @Override // y7.i0
    /* renamed from: b */
    public final void mo4096b(RecyclerView recyclerView, int i10, int i11) {
        int iF0;
        C1357u c1357u = this.f6864a;
        C1338b c1338b = c1357u.f6912d;
        C1350n c1350n = this.f6866c;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1350n.f6878h.getLayoutManager();
            View viewH0 = linearLayoutManager.H0(0, linearLayoutManager.m15858v(), false);
            iF0 = viewH0 == null ? -1 : f0.m15843D(viewH0);
        } else {
            iF0 = ((LinearLayoutManager) c1350n.f6878h.getLayoutManager()).F0();
        }
        Calendar calendarM4111a = AbstractC1361y.m4111a(c1338b.f6839a.f6896a);
        calendarM4111a.add(2, iF0);
        c1350n.f6874d = new C1353q(calendarM4111a);
        Calendar calendarM4111a2 = AbstractC1361y.m4111a(c1338b.f6839a.f6896a);
        calendarM4111a2.add(2, iF0);
        calendarM4111a2.set(5, 1);
        Calendar calendarM4111a3 = AbstractC1361y.m4111a(calendarM4111a2);
        calendarM4111a3.get(2);
        calendarM4111a3.get(1);
        calendarM4111a3.getMaximum(7);
        calendarM4111a3.getActualMaximum(5);
        calendarM4111a3.getTimeInMillis();
        this.f6865b.setText(DateUtils.formatDateTime(c1357u.f6911c, calendarM4111a3.getTimeInMillis() - TimeZone.getDefault().getOffset(r6), 36));
    }
}
