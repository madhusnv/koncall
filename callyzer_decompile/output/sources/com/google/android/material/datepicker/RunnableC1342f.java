package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import l4.d0;
import rf.C6511p;
import t5.AbstractC7044b;
import y7.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class RunnableC1342f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6856a;

    /* renamed from: b */
    public final /* synthetic */ int f6857b;

    /* renamed from: c */
    public final /* synthetic */ Object f6858c;

    public /* synthetic */ RunnableC1342f(Object obj, int i10, int i11) {
        this.f6856a = i11;
        this.f6858c = obj;
        this.f6857b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        switch (this.f6856a) {
            case 0:
                RecyclerView recyclerView = ((C1350n) this.f6858c).f6878h;
                if (!recyclerView.f2833x && (f0Var = recyclerView.f2824m) != null) {
                    f0Var.s0(recyclerView, this.f6857b);
                    break;
                }
                break;
            case 1:
                ((C6511p) this.f6858c).m12534i(this.f6857b);
                break;
            default:
                AbstractC7044b abstractC7044b = (AbstractC7044b) ((d0) this.f6858c).f21881b;
                if (abstractC7044b != null) {
                    abstractC7044b.mo9653g(this.f6857b);
                    break;
                }
                break;
        }
    }
}
