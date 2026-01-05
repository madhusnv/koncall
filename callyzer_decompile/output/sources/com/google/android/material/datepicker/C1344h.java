package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import y7.q0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C1344h extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f6860E;

    /* renamed from: F */
    public final /* synthetic */ C1350n f6861F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344h(C1350n c1350n, int i10, int i11) {
        super(i10);
        this.f6861F = c1350n;
        this.f6860E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    public final void s0(RecyclerView recyclerView, int i10) {
        C1359w c1359w = new C1359w(recyclerView.getContext());
        c1359w.f41768a = i10;
        t0(c1359w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v0(q0 q0Var, int[] iArr) {
        int i10 = this.f6860E;
        C1350n c1350n = this.f6861F;
        if (i10 == 0) {
            iArr[0] = c1350n.f6878h.getWidth();
            iArr[1] = c1350n.f6878h.getWidth();
        } else {
            iArr[0] = c1350n.f6878h.getHeight();
            iArr[1] = c1350n.f6878h.getHeight();
        }
    }
}
