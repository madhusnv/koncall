package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p001o.aqa;
import p001o.gcc;
import p001o.gqi;
import p001o.gua;
import p001o.n8e;
import p001o.n9e;
import p001o.ota;
import p001o.v9e;
import p001o.wz4;
import p001o.x5e;

/* loaded from: classes3.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C11036b();

    /* renamed from: a */
    public CharSequence f12505a;

    /* renamed from: b */
    public Long f12506b;

    /* renamed from: c */
    public SimpleDateFormat f12507c;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    public class C11035a extends AbstractC11037a {

        /* renamed from: q */
        public final /* synthetic */ gcc f12508q;

        /* renamed from: s */
        public final /* synthetic */ TextInputLayout f12509s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11035a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, gcc gccVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f12508q = gccVar;
            this.f12509s = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: f */
        public void mo14529f() {
            SingleDateSelector.this.f12505a = this.f12509s.getError();
            this.f12508q.mo14494a();
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: g */
        public void mo14530g(Long l) {
            if (l == null) {
                SingleDateSelector.this.m14536d();
            } else {
                SingleDateSelector.this.i3(l.longValue());
            }
            SingleDateSelector.this.f12505a = null;
            this.f12508q.mo14495b(SingleDateSelector.this.Q2());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    public class C11036b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f12506b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String B1(Context context) {
        Resources resources = context.getResources();
        Long l = this.f12506b;
        if (l == null) {
            return resources.getString(v9e.mtrl_picker_date_header_unselected);
        }
        return resources.getString(v9e.mtrl_picker_date_header_selected, wz4.m55442m(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String E0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f12506b;
        return resources.getString(v9e.mtrl_picker_announce_current_selection, l == null ? resources.getString(v9e.mtrl_picker_announce_current_selection_none) : wz4.m55442m(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection G1() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int I0(Context context) {
        return ota.m42660d(context, x5e.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection K2() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f12506b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m14536d() {
        this.f12506b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long Q2() {
        return this.f12506b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void M1(Long l) {
        this.f12506b = l == null ? null : Long.valueOf(gqi.m29315a(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, gcc gccVar) {
        View viewInflate = layoutInflater.inflate(n9e.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(n8e.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer numM29507f = gua.m29507f(viewInflate.getContext(), x5e.colorOnSurfaceVariant);
        if (numM29507f != null) {
            editText.setHintTextColor(numM29507f.intValue());
        }
        if (aqa.m17657b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatM29320f = this.f12507c;
        boolean z = simpleDateFormatM29320f != null;
        if (!z) {
            simpleDateFormatM29320f = gqi.m29320f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatM29320f;
        String pattern = z ? simpleDateFormat.toPattern() : gqi.m29321g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l = this.f12506b;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new C11035a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, gccVar, textInputLayout));
        if (!DateSelector.j1(viewInflate.getContext())) {
            DateSelector.k2(editText);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void i3(long j) {
        this.f12506b = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int o0() {
        return v9e.mtrl_picker_date_header_title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f12506b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean z2() {
        return this.f12506b != null;
    }
}
