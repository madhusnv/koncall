package ai.salesmax.view;

import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.view.ViewAddLeadDropDown;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ck6;
import p001o.f9g;
import p001o.nr1;
import p001o.qvi;
import p001o.sbe;
import p001o.sq8;
import p001o.z8e;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewAddLeadDropDown extends FrameLayout {

    /* renamed from: a */
    public String f5047a;

    /* renamed from: b */
    public String f5048b;

    /* renamed from: c */
    public qvi f5049c;

    /* renamed from: d */
    public AutoCompleteListModel f5050d;

    /* renamed from: ai.salesmax.view.ViewAddLeadDropDown$a */
    public static final class C1676a implements ck6 {

        /* renamed from: b */
        public final /* synthetic */ AutoCompleteListModel f5052b;

        public C1676a(AutoCompleteListModel autoCompleteListModel) {
            this.f5052b = autoCompleteListModel;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            AutoCompleteListModel autoCompleteListModel = ViewAddLeadDropDown.this.f5050d;
            if (autoCompleteListModel == null) {
                return;
            }
            String str = this.f5052b.getTeamList().get(i);
            sq8.m48648g(str, "get(...)");
            autoCompleteListModel.setSelectedTeam(str);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAddLeadDropDown(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5047a = "";
        this.f5048b = "";
        m3376c();
    }

    /* renamed from: e */
    public static final void m3375e(ViewAddLeadDropDown viewAddLeadDropDown, AutoCompleteListModel autoCompleteListModel) {
        sq8.m48649h(viewAddLeadDropDown, "this$0");
        sq8.m48649h(autoCompleteListModel, "$dropDownList");
        qvi qviVar = viewAddLeadDropDown.f5049c;
        if (qviVar == null) {
            sq8.m48667z("binding");
            qviVar = null;
        }
        nr1.m40971p(qviVar.q0, viewAddLeadDropDown.f5050d, viewAddLeadDropDown.new C1676a(autoCompleteListModel));
    }

    /* renamed from: c */
    public final void m3376c() {
        qvi qviVarH0 = qvi.h0(LayoutInflater.from(getContext()), this, true);
        sq8.m48648g(qviVarH0, "inflate(...)");
        this.f5049c = qviVarH0;
    }

    /* renamed from: d */
    public final void m3377d(Context context, AttributeSet attributeSet) {
        m3376c();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProfileData, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5047a = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_title);
            this.f5048b = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_value);
            m3378f();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public final void m3378f() {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(z8e.viewAddLeadTitle);
        String str = this.f5047a;
        if (str == null || f9g.d0(str)) {
            materialTextView.setVisibility(8);
        } else {
            materialTextView.setText(this.f5047a);
        }
    }

    public final String getViewAddLeadValue() {
        AutoCompleteListModel autoCompleteListModel = this.f5050d;
        if (autoCompleteListModel == null) {
            return "MEDIUM";
        }
        sq8.m48646e(autoCompleteListModel);
        return autoCompleteListModel.getSelectedTeam();
    }

    public final AllAutoCompleteTextView getViewAllAutoCompleteTextView() {
        return (AllAutoCompleteTextView) findViewById(z8e.viewAddLeadValue);
    }

    public final void setItems(final AutoCompleteListModel autoCompleteListModel) {
        sq8.m48649h(autoCompleteListModel, "dropDownList");
        this.f5050d = autoCompleteListModel;
        postDelayed(new Runnable() { // from class: o.pvi
            @Override // java.lang.Runnable
            public final void run() {
                ViewAddLeadDropDown.m3375e(this.f40663a, autoCompleteListModel);
            }
        }, 600L);
    }

    public final void setViewAddLeadValue(String str) {
        if (str != null) {
            this.f5048b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAddLeadDropDown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5047a = "";
        this.f5048b = "";
        m3377d(context, attributeSet);
    }
}
