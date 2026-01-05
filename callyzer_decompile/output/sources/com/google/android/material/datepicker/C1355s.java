package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public final class C1355s implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f6907a;

    /* renamed from: b */
    public final /* synthetic */ C1357u f6908b;

    public C1355s(C1357u c1357u, MaterialCalendarGridView materialCalendarGridView) {
        this.f6908b = c1357u;
        this.f6907a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f6907a;
        C1354r c1354rM4089a = materialCalendarGridView.m4089a();
        if (i10 < c1354rM4089a.f6904a.m4104d() || i10 > c1354rM4089a.m4108b()) {
            return;
        }
        if (materialCalendarGridView.m4089a().getItem(i10).longValue() >= ((C1350n) this.f6908b.f6913e.f43339b).f6873c.f6841c.f6851a) {
            throw null;
        }
    }
}
