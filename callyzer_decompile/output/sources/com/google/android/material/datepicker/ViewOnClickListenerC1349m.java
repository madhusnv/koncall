package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import y7.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1349m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f6869a;

    /* renamed from: b */
    public final /* synthetic */ C1357u f6870b;

    /* renamed from: c */
    public final /* synthetic */ C1350n f6871c;

    public /* synthetic */ ViewOnClickListenerC1349m(C1350n c1350n, C1357u c1357u, int i10) {
        this.f6869a = i10;
        this.f6871c = c1350n;
        this.f6870b = c1357u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6869a) {
            case 0:
                C1350n c1350n = this.f6871c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1350n.f6878h.getLayoutManager();
                View viewH0 = linearLayoutManager.H0(0, linearLayoutManager.m15858v(), false);
                int iM15843D = (viewH0 == null ? -1 : f0.m15843D(viewH0)) + 1;
                if (iM15843D < c1350n.f6878h.getAdapter().mo4090a()) {
                    Calendar calendarM4111a = AbstractC1361y.m4111a(this.f6870b.f6912d.f6839a.f6896a);
                    calendarM4111a.add(2, iM15843D);
                    c1350n.m4097i(new C1353q(calendarM4111a));
                    break;
                }
                break;
            default:
                C1350n c1350n2 = this.f6871c;
                int iF0 = ((LinearLayoutManager) c1350n2.f6878h.getLayoutManager()).F0() - 1;
                if (iF0 >= 0) {
                    Calendar calendarM4111a2 = AbstractC1361y.m4111a(this.f6870b.f6912d.f6839a.f6896a);
                    calendarM4111a2.add(2, iF0);
                    c1350n2.m4097i(new C1353q(calendarM4111a2));
                    break;
                }
                break;
        }
    }
}
