package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
import p001o.gcc;

/* loaded from: classes3.dex */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: a */
    public final LinkedHashSet f12488a = new LinkedHashSet();

    public boolean F0(gcc gccVar) {
        return this.f12488a.add(gccVar);
    }

    public void G0() {
        this.f12488a.clear();
    }
}
