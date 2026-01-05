package com.mynameismidori.currencypicker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.MultiSelectListPreference;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p001o.e9e;
import p001o.jp6;
import p001o.p8e;
import p001o.tnb;

/* loaded from: classes6.dex */
public class MultiCurrencyPreference extends MultiSelectListPreference {

    /* renamed from: a */
    public EditText f13524a;

    /* renamed from: b */
    public ListView f13525b;

    /* renamed from: c */
    public CharSequence[] f13526c;

    /* renamed from: d */
    public CharSequence[] f13527d;

    /* renamed from: e */
    public tnb f13528e;

    /* renamed from: f */
    public int f13529f;

    /* renamed from: g */
    public List f13530g;

    /* renamed from: h */
    public List f13531h;

    /* renamed from: q */
    public SharedPreferences f13532q;

    /* renamed from: s */
    public SharedPreferences.Editor f13533s;

    /* renamed from: com.mynameismidori.currencypicker.MultiCurrencyPreference$a */
    public class C11567a implements TextWatcher {
        public C11567a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MultiCurrencyPreference.this.m15891c(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public MultiCurrencyPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13529f = 0;
        this.f13530g = new ArrayList();
        this.f13531h = new ArrayList();
        m15892d(jp6.m34204a());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f13532q = defaultSharedPreferences;
        this.f13533s = defaultSharedPreferences.edit();
    }

    /* renamed from: c */
    public final void m15891c(String str) {
        this.f13531h.clear();
        for (jp6 jp6Var : this.f13530g) {
            if (jp6Var.m34208e().toLowerCase(Locale.ENGLISH).contains(str.toLowerCase())) {
                this.f13531h.add(jp6Var);
            }
        }
        this.f13528e.notifyDataSetChanged();
    }

    /* renamed from: d */
    public void m15892d(List list) {
        this.f13530g.clear();
        this.f13530g.addAll(list);
    }

    @Override // android.preference.MultiSelectListPreference, android.preference.DialogPreference
    public void onDialogClosed(boolean z) {
        this.f13533s.putStringSet(getKey(), getValues());
        this.f13533s.commit();
        super.onDialogClosed(z);
    }

    @Override // android.preference.MultiSelectListPreference, android.preference.DialogPreference
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        CharSequence[] charSequenceArr;
        getValues().toString();
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(e9e.currency_picker, (ViewGroup) null);
        this.f13524a = (EditText) viewInflate.findViewById(p8e.currency_code_picker_search);
        this.f13525b = (ListView) viewInflate.findViewById(p8e.currency_code_picker_listview);
        this.f13524a.addTextChangedListener(new C11567a());
        ListView listView = (ListView) viewInflate.findViewById(p8e.currency_code_picker_listview);
        ArrayList arrayList = new ArrayList(this.f13530g.size());
        this.f13531h = arrayList;
        arrayList.addAll(this.f13530g);
        this.f13528e = new tnb(getContext(), this.f13531h, getValues());
        listView.setChoiceMode(2);
        listView.setAdapter((ListAdapter) this.f13528e);
        builder.setView(viewInflate);
        builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton("Ok", (DialogInterface.OnClickListener) null);
        this.f13527d = getEntries();
        CharSequence[] entryValues = getEntryValues();
        this.f13526c = entryValues;
        if (entryValues == null || (charSequenceArr = this.f13527d) == null || charSequenceArr.length != entryValues.length) {
            throw new IllegalStateException("Preference requires an entries array and an entryValues array which are both the same length");
        }
    }
}
