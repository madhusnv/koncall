package com.google.android.material.datepicker;

import a1.C0005d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.websoptimization.callyzerbiz.R;
import java.util.Locale;
import y7.AbstractC8590y;
import y7.t0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC8590y {

    /* renamed from: c */
    public final C1350n f6838c;

    public a0(C1350n c1350n) {
        this.f6838c = c1350n;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: a */
    public final int mo4090a() {
        return this.f6838c.f6873c.f6843e;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: c */
    public final void mo4091c(t0 t0Var, int i10) {
        C1350n c1350n = this.f6838c;
        int i11 = c1350n.f6873c.f6839a.f6898c + i10;
        TextView textView = ((C1362z) t0Var).f6917t;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i11)));
        C0005d c0005d = c1350n.f6876f;
        if (AbstractC1361y.m4112b().get(1) == i11) {
            Object obj = c0005d.f25c;
        } else {
            Object obj2 = c0005d.f24b;
        }
        throw null;
    }

    @Override // y7.AbstractC8590y
    /* renamed from: d */
    public final t0 mo4092d(ViewGroup viewGroup) {
        return new C1362z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
