package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
import p001o.fgd;
import p001o.gcc;
import p001o.gqi;
import p001o.gua;
import p001o.iwc;
import p001o.n8e;
import p001o.n9e;
import p001o.ota;
import p001o.v9e;
import p001o.wz4;
import p001o.x5e;
import p001o.x6e;

/* loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<iwc> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C11034c();

    /* renamed from: a */
    public CharSequence f12489a;

    /* renamed from: b */
    public String f12490b;

    /* renamed from: c */
    public final String f12491c = " ";

    /* renamed from: d */
    public Long f12492d = null;

    /* renamed from: e */
    public Long f12493e = null;

    /* renamed from: f */
    public Long f12494f = null;

    /* renamed from: g */
    public Long f12495g = null;

    /* renamed from: h */
    public SimpleDateFormat f12496h;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    public class C11032a extends AbstractC11037a {

        /* renamed from: q */
        public final /* synthetic */ TextInputLayout f12497q;

        /* renamed from: s */
        public final /* synthetic */ TextInputLayout f12498s;

        /* renamed from: x */
        public final /* synthetic */ gcc f12499x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11032a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, gcc gccVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f12497q = textInputLayout2;
            this.f12498s = textInputLayout3;
            this.f12499x = gccVar;
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: f */
        public void mo14529f() {
            RangeDateSelector.this.f12494f = null;
            RangeDateSelector.this.m14528l(this.f12497q, this.f12498s, this.f12499x);
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: g */
        public void mo14530g(Long l) {
            RangeDateSelector.this.f12494f = l;
            RangeDateSelector.this.m14528l(this.f12497q, this.f12498s, this.f12499x);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    public class C11033b extends AbstractC11037a {

        /* renamed from: q */
        public final /* synthetic */ TextInputLayout f12501q;

        /* renamed from: s */
        public final /* synthetic */ TextInputLayout f12502s;

        /* renamed from: x */
        public final /* synthetic */ gcc f12503x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11033b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, gcc gccVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f12501q = textInputLayout2;
            this.f12502s = textInputLayout3;
            this.f12503x = gccVar;
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: f */
        public void mo14529f() {
            RangeDateSelector.this.f12495g = null;
            RangeDateSelector.this.m14528l(this.f12501q, this.f12502s, this.f12503x);
        }

        @Override // com.google.android.material.datepicker.AbstractC11037a
        /* renamed from: g */
        public void mo14530g(Long l) {
            RangeDateSelector.this.f12495g = l;
            RangeDateSelector.this.m14528l(this.f12501q, this.f12502s, this.f12503x);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    public class C11034c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f12492d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f12493e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String B1(Context context) {
        Resources resources = context.getResources();
        Long l = this.f12492d;
        if (l == null && this.f12493e == null) {
            return resources.getString(v9e.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f12493e;
        if (l2 == null) {
            return resources.getString(v9e.mtrl_picker_range_header_only_start_selected, wz4.m55432c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(v9e.mtrl_picker_range_header_only_end_selected, wz4.m55432c(l2.longValue()));
        }
        iwc iwcVarM55430a = wz4.m55430a(l, l2);
        return resources.getString(v9e.mtrl_picker_range_header_selected, iwcVarM55430a.f29291a, iwcVarM55430a.f29292b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String E0(Context context) {
        Resources resources = context.getResources();
        iwc iwcVarM55430a = wz4.m55430a(this.f12492d, this.f12493e);
        Object obj = iwcVarM55430a.f29291a;
        String string = obj == null ? resources.getString(v9e.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = iwcVarM55430a.f29292b;
        return resources.getString(v9e.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(v9e.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection G1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new iwc(this.f12492d, this.f12493e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int I0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return ota.m42660d(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(x6e.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? x5e.materialCalendarTheme : x5e.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection K2() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f12492d;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f12493e;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void m14522f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f12490b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, gcc gccVar) {
        View viewInflate = layoutInflater.inflate(n9e.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(n8e.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(n8e.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numM29507f = gua.m29507f(viewInflate.getContext(), x5e.colorOnSurfaceVariant);
        if (numM29507f != null) {
            editText.setHintTextColor(numM29507f.intValue());
            editText2.setHintTextColor(numM29507f.intValue());
        }
        if (aqa.m17657b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f12490b = viewInflate.getResources().getString(v9e.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatM29320f = this.f12496h;
        boolean z = simpleDateFormatM29320f != null;
        if (!z) {
            simpleDateFormatM29320f = gqi.m29320f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatM29320f;
        Long l = this.f12492d;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
            this.f12494f = this.f12492d;
        }
        Long l2 = this.f12493e;
        if (l2 != null) {
            editText2.setText(simpleDateFormat.format(l2));
            this.f12495g = this.f12493e;
        }
        String pattern = z ? simpleDateFormat.toPattern() : gqi.m29321g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new C11032a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, gccVar));
        editText2.addTextChangedListener(new C11033b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, gccVar));
        if (!DateSelector.j1(viewInflate.getContext())) {
            DateSelector.k2(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public iwc Q2() {
        return new iwc(this.f12492d, this.f12493e);
    }

    /* renamed from: h */
    public final boolean m14524h(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: i */
    public final void m14525i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f12490b);
        textInputLayout2.setError(" ");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void i3(long j) {
        Long l = this.f12492d;
        if (l == null) {
            this.f12492d = Long.valueOf(j);
        } else if (this.f12493e == null && m14524h(l.longValue(), j)) {
            this.f12493e = Long.valueOf(j);
        } else {
            this.f12493e = null;
            this.f12492d = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void M1(iwc iwcVar) {
        Object obj = iwcVar.f29291a;
        if (obj != null && iwcVar.f29292b != null) {
            fgd.m26657a(m14524h(((Long) obj).longValue(), ((Long) iwcVar.f29292b).longValue()));
        }
        Object obj2 = iwcVar.f29291a;
        this.f12492d = obj2 == null ? null : Long.valueOf(gqi.m29315a(((Long) obj2).longValue()));
        Object obj3 = iwcVar.f29292b;
        this.f12493e = obj3 != null ? Long.valueOf(gqi.m29315a(((Long) obj3).longValue())) : null;
    }

    /* renamed from: k */
    public final void m14527k(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f12489a = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f12489a = null;
        } else {
            this.f12489a = textInputLayout2.getError();
        }
    }

    /* renamed from: l */
    public final void m14528l(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, gcc gccVar) {
        Long l = this.f12494f;
        if (l == null || this.f12495g == null) {
            m14522f(textInputLayout, textInputLayout2);
            gccVar.mo14494a();
        } else if (m14524h(l.longValue(), this.f12495g.longValue())) {
            this.f12492d = this.f12494f;
            this.f12493e = this.f12495g;
            gccVar.mo14495b(Q2());
        } else {
            m14525i(textInputLayout, textInputLayout2);
            gccVar.mo14494a();
        }
        m14527k(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int o0() {
        return v9e.mtrl_picker_range_header_title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f12492d);
        parcel.writeValue(this.f12493e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean z2() {
        Long l = this.f12492d;
        return (l == null || this.f12493e == null || !m14524h(l.longValue(), this.f12493e.longValue())) ? false : true;
    }
}
