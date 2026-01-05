package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p001o.gcc;

/* loaded from: classes3.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: b */
    public int f12477b;

    /* renamed from: c */
    public DateSelector f12478c;

    /* renamed from: d */
    public CalendarConstraints f12479d;

    /* renamed from: com.google.android.material.datepicker.MaterialTextInputPicker$a */
    public class C11030a extends gcc {
        public C11030a() {
        }

        @Override // p001o.gcc
        /* renamed from: a */
        public void mo14494a() {
            Iterator it = MaterialTextInputPicker.this.f12488a.iterator();
            while (it.hasNext()) {
                ((gcc) it.next()).mo14494a();
            }
        }

        @Override // p001o.gcc
        /* renamed from: b */
        public void mo14495b(Object obj) {
            Iterator it = MaterialTextInputPicker.this.f12488a.iterator();
            while (it.hasNext()) {
                ((gcc) it.next()).mo14495b(obj);
            }
        }
    }

    public static MaterialTextInputPicker H0(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f12477b = bundle.getInt("THEME_RES_ID_KEY");
        this.f12478c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12479d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f12478c.f0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f12477b)), viewGroup, bundle, this.f12479d, new C11030a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f12477b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12478c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12479d);
    }
}
