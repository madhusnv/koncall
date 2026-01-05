package com.mynameismidori.currencypicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.DialogFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p001o.e9e;
import p001o.jp6;
import p001o.md4;
import p001o.nd4;
import p001o.p8e;
import p001o.z6e;

/* loaded from: classes6.dex */
public class CurrencyPicker extends DialogFragment {

    /* renamed from: a */
    public EditText f13503a;

    /* renamed from: b */
    public ListView f13504b;

    /* renamed from: c */
    public md4 f13505c;

    /* renamed from: d */
    public List f13506d = new ArrayList();

    /* renamed from: e */
    public List f13507e = new ArrayList();

    /* renamed from: f */
    public nd4 f13508f;

    /* renamed from: com.mynameismidori.currencypicker.CurrencyPicker$a */
    public class C11563a implements AdapterView.OnItemClickListener {
        public C11563a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (CurrencyPicker.this.f13508f != null) {
                jp6 jp6Var = (jp6) CurrencyPicker.this.f13507e.get(i);
                CurrencyPicker.this.f13508f.mo40367a(jp6Var.m34208e(), jp6Var.m34206b(), jp6Var.m34209f(), jp6Var.m34207d());
            }
        }
    }

    /* renamed from: com.mynameismidori.currencypicker.CurrencyPicker$b */
    public class C11564b implements TextWatcher {
        public C11564b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CurrencyPicker.this.L0(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public CurrencyPicker() {
        M0(jp6.m34204a());
    }

    public static CurrencyPicker K0(String str) {
        CurrencyPicker currencyPicker = new CurrencyPicker();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", str);
        currencyPicker.setArguments(bundle);
        return currencyPicker;
    }

    public final void L0(String str) {
        this.f13507e.clear();
        for (jp6 jp6Var : this.f13506d) {
            if (jp6Var.m34208e().toLowerCase(Locale.ENGLISH).contains(str.toLowerCase())) {
                this.f13507e.add(jp6Var);
            }
        }
        this.f13505c.notifyDataSetChanged();
    }

    public void M0(List list) {
        this.f13506d.clear();
        this.f13506d.addAll(list);
    }

    public void N0(nd4 nd4Var) {
        this.f13508f = nd4Var;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getDialog() != null) {
            super.dismiss();
        } else {
            getFragmentManager().k1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(e9e.currency_picker, (ViewGroup) null);
        Bundle arguments = getArguments();
        if (arguments != null && getDialog() != null) {
            getDialog().setTitle(arguments.getString("dialogTitle"));
            getDialog().getWindow().setLayout(getResources().getDimensionPixelSize(z6e.cp_dialog_width), getResources().getDimensionPixelSize(z6e.cp_dialog_height));
        }
        this.f13503a = (EditText) viewInflate.findViewById(p8e.currency_code_picker_search);
        this.f13504b = (ListView) viewInflate.findViewById(p8e.currency_code_picker_listview);
        ArrayList arrayList = new ArrayList(this.f13506d.size());
        this.f13507e = arrayList;
        arrayList.addAll(this.f13506d);
        md4 md4Var = new md4(getActivity(), this.f13507e);
        this.f13505c = md4Var;
        this.f13504b.setAdapter((ListAdapter) md4Var);
        this.f13504b.setOnItemClickListener(new C11563a());
        this.f13503a.addTextChangedListener(new C11564b());
        return viewInflate;
    }
}
