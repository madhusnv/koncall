package com.mynameismidori.currencypicker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.preference.ListPreference;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p001o.e9e;
import p001o.hbe;
import p001o.jp6;
import p001o.md4;
import p001o.p8e;

/* loaded from: classes6.dex */
public class CurrencyPreference extends ListPreference implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public EditText f13511a;

    /* renamed from: b */
    public ListView f13512b;

    /* renamed from: c */
    public CharSequence[] f13513c;

    /* renamed from: d */
    public CharSequence[] f13514d;

    /* renamed from: e */
    public md4 f13515e;

    /* renamed from: f */
    public int f13516f;

    /* renamed from: g */
    public List f13517g;

    /* renamed from: h */
    public List f13518h;

    /* renamed from: q */
    public String f13519q;

    /* renamed from: s */
    public SharedPreferences f13520s;

    /* renamed from: x */
    public SharedPreferences.Editor f13521x;

    /* renamed from: com.mynameismidori.currencypicker.CurrencyPreference$a */
    public class C11565a implements TextWatcher {
        public C11565a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CurrencyPreference.this.m15887d(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mynameismidori.currencypicker.CurrencyPreference$b */
    public class C11566b implements AdapterView.OnItemClickListener {
        public C11566b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            jp6 jp6Var = (jp6) CurrencyPreference.this.f13518h.get(i);
            CurrencyPreference.this.setValue(jp6Var.m34206b());
            CurrencyPreference.this.setSummary(jp6Var.m34206b());
            CurrencyPreference currencyPreference = CurrencyPreference.this;
            currencyPreference.f13521x.putString(currencyPreference.getKey(), jp6Var.m34206b());
            CurrencyPreference.this.f13521x.commit();
            CurrencyPreference.this.getDialog().dismiss();
        }
    }

    public CurrencyPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13516f = 0;
        this.f13517g = new ArrayList();
        this.f13518h = new ArrayList();
        this.f13520s = PreferenceManager.getDefaultSharedPreferences(context);
        m15888e(jp6.m34204a());
        this.f13521x = this.f13520s.edit();
        setSummary(this.f13520s.getString(getKey(), getValue()));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hbe.attrs_currency, 0, 0);
        try {
            this.f13519q = typedArrayObtainStyledAttributes.getString(hbe.attrs_currency_currencyCode);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public final void m15887d(String str) {
        this.f13518h.clear();
        for (jp6 jp6Var : this.f13517g) {
            if (jp6Var.m34208e().toLowerCase(Locale.ENGLISH).contains(str.toLowerCase())) {
                this.f13518h.add(jp6Var);
            }
        }
        this.f13515e.notifyDataSetChanged();
    }

    /* renamed from: e */
    public void m15888e(List list) {
        this.f13517g.clear();
        this.f13517g.addAll(list);
    }

    /* renamed from: g */
    public void m15889g(Set set) {
        this.f13517g.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f13517g.add(jp6.m34205c((String) it.next()));
        }
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        CharSequence[] charSequenceArr;
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(e9e.currency_picker, (ViewGroup) null);
        this.f13511a = (EditText) viewInflate.findViewById(p8e.currency_code_picker_search);
        this.f13512b = (ListView) viewInflate.findViewById(p8e.currency_code_picker_listview);
        this.f13511a.addTextChangedListener(new C11565a());
        ListView listView = (ListView) viewInflate.findViewById(p8e.currency_code_picker_listview);
        ArrayList arrayList = new ArrayList(this.f13517g.size());
        this.f13518h = arrayList;
        arrayList.addAll(this.f13517g);
        md4 md4Var = new md4(getContext(), this.f13518h);
        this.f13515e = md4Var;
        listView.setAdapter((ListAdapter) md4Var);
        listView.setOnItemClickListener(new C11566b());
        builder.setView(viewInflate);
        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        this.f13514d = getEntries();
        CharSequence[] entryValues = getEntryValues();
        this.f13513c = entryValues;
        if (entryValues == null || (charSequenceArr = this.f13514d) == null || charSequenceArr.length != entryValues.length) {
            throw new IllegalStateException("Preference requires an entries array and an entryValues array which are both the same length");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("selectedCurrency")) {
            setSummary(getValue());
        }
        if (str.equals("selectedCurrencies")) {
            m15889g(this.f13520s.getStringSet("selectedCurrencies", new HashSet()));
        }
    }
}
