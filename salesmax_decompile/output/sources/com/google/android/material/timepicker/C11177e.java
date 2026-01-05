package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import p001o.cc;
import p001o.jjh;
import p001o.n8e;
import p001o.ta3;
import p001o.v9e;
import p001o.xzi;
import p001o.zlh;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes3.dex */
public class C11177e implements TimePickerView.InterfaceC11172f, zlh {

    /* renamed from: a */
    public final LinearLayout f13231a;

    /* renamed from: b */
    public final TimeModel f13232b;

    /* renamed from: c */
    public final TextWatcher f13233c = new a();

    /* renamed from: d */
    public final TextWatcher f13234d = new b();

    /* renamed from: e */
    public final ChipTextInputComboView f13235e;

    /* renamed from: f */
    public final ChipTextInputComboView f13236f;

    /* renamed from: g */
    public final ViewOnKeyListenerC11176d f13237g;

    /* renamed from: h */
    public final EditText f13238h;

    /* renamed from: q */
    public final EditText f13239q;

    /* renamed from: s */
    public MaterialButtonToggleGroup f13240s;

    /* renamed from: com.google.android.material.timepicker.e$a */
    public class a extends jjh {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NumberFormatException {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C11177e.this.f13232b.m15532j(0);
                } else {
                    C11177e.this.f13232b.m15532j(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$b */
    public class b extends jjh {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NumberFormatException {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C11177e.this.f13232b.m15530h(0);
                } else {
                    C11177e.this.f13232b.m15530h(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C11177e.this.mo15559c(((Integer) view.getTag(n8e.selection_type)).intValue());
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$d */
    public class d extends ta3 {

        /* renamed from: e */
        public final /* synthetic */ TimeModel f13244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f13244e = timeModel;
        }

        @Override // p001o.ta3, p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.s0(view.getResources().getString(this.f13244e.m15526c(), String.valueOf(this.f13244e.m15527d())));
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$e */
    public class e extends ta3 {

        /* renamed from: e */
        public final /* synthetic */ TimeModel f13246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f13246e = timeModel;
        }

        @Override // p001o.ta3, p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.s0(view.getResources().getString(v9e.material_minute_suffix, String.valueOf(this.f13246e.f13208e)));
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$f */
    public class f extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final /* synthetic */ Resources f13248a;

        /* renamed from: b */
        public final /* synthetic */ int f13249b;

        public f(Resources resources, int i) {
            this.f13248a = resources;
            this.f13249b = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.f13248a.getString(this.f13249b));
        }
    }

    public C11177e(LinearLayout linearLayout, TimeModel timeModel) {
        this.f13231a = linearLayout;
        this.f13232b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(n8e.material_minute_text_input);
        this.f13235e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(n8e.material_hour_text_input);
        this.f13236f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(n8e.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(n8e.material_label);
        textView.setText(resources.getString(v9e.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(v9e.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(n8e.selection_type, 12);
        chipTextInputComboView2.setTag(n8e.selection_type, 10);
        if (timeModel.f13206c == 0) {
            m15586m();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.m15458c(timeModel.m15528e());
        chipTextInputComboView.m15458c(timeModel.m15529f());
        EditText editText = chipTextInputComboView2.m15460e().getEditText();
        this.f13238h = editText;
        editText.setAccessibilityDelegate(m15585l(linearLayout.getResources(), v9e.material_timepicker_hour));
        EditText editText2 = chipTextInputComboView.m15460e().getEditText();
        this.f13239q = editText2;
        editText2.setAccessibilityDelegate(m15585l(linearLayout.getResources(), v9e.material_timepicker_minute));
        this.f13237g = new ViewOnKeyListenerC11176d(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.m15461f(new d(linearLayout.getContext(), v9e.material_hour_selection, timeModel));
        chipTextInputComboView.m15461f(new e(linearLayout.getContext(), v9e.material_minute_selection, timeModel));
        m15581g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m15578h(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (z) {
            this.f13232b.m15533k(i == n8e.material_clock_period_pm_button ? 1 : 0);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC11172f
    /* renamed from: c */
    public void mo15559c(int i) {
        this.f13232b.f13209f = i;
        this.f13235e.setChecked(i == 12);
        this.f13236f.setChecked(i == 10);
        m15587n();
    }

    /* renamed from: d */
    public final void m15579d() {
        this.f13238h.addTextChangedListener(this.f13234d);
        this.f13239q.addTextChangedListener(this.f13233c);
    }

    @Override // p001o.zlh
    /* renamed from: e */
    public void mo15561e() {
        View focusedChild = this.f13231a.getFocusedChild();
        if (focusedChild != null) {
            xzi.m57078n(focusedChild, false);
        }
        this.f13231a.setVisibility(8);
    }

    /* renamed from: f */
    public void m15580f() {
        this.f13235e.setChecked(false);
        this.f13236f.setChecked(false);
    }

    /* renamed from: g */
    public void m15581g() {
        m15579d();
        m15584k(this.f13232b);
        this.f13237g.m15571a();
    }

    /* renamed from: i */
    public final void m15582i() {
        this.f13238h.removeTextChangedListener(this.f13234d);
        this.f13239q.removeTextChangedListener(this.f13233c);
    }

    @Override // p001o.zlh
    public void invalidate() {
        m15584k(this.f13232b);
    }

    /* renamed from: j */
    public void m15583j() {
        this.f13235e.setChecked(this.f13232b.f13209f == 12);
        this.f13236f.setChecked(this.f13232b.f13209f == 10);
    }

    /* renamed from: k */
    public final void m15584k(TimeModel timeModel) {
        m15582i();
        Locale locale = this.f13231a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f13208e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.m15527d()));
        this.f13235e.m15462g(str);
        this.f13236f.m15462g(str2);
        m15579d();
        m15587n();
    }

    /* renamed from: l */
    public final View.AccessibilityDelegate m15585l(Resources resources, int i) {
        return new f(resources, i);
    }

    /* renamed from: m */
    public final void m15586m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f13231a.findViewById(n8e.material_clock_period_toggle);
        this.f13240s = materialButtonToggleGroup;
        materialButtonToggleGroup.m14256q(new MaterialButtonToggleGroup.InterfaceC10981b() { // from class: o.amh
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC10981b
            /* renamed from: a */
            public final void mo14266a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                this.f15023a.m15578h(materialButtonToggleGroup2, i, z);
            }
        });
        this.f13240s.setVisibility(0);
        m15587n();
    }

    /* renamed from: n */
    public final void m15587n() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f13240s;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.m14257r(this.f13232b.f13210g == 0 ? n8e.material_clock_period_am_button : n8e.material_clock_period_pm_button);
    }

    @Override // p001o.zlh
    public void show() {
        this.f13231a.setVisibility(0);
        mo15559c(this.f13232b.f13209f);
    }
}
