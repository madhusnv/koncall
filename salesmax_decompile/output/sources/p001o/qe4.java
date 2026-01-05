package p001o;

import ai.salesmax.model.FormField;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.PropertyOptions;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p001o.ck6;

/* loaded from: classes.dex */
public abstract class qe4 {

    /* renamed from: o.qe4$a */
    public static final class C16354a extends iuf {

        /* renamed from: g */
        public final /* synthetic */ List f41758g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16354a(List list, C16355b c16355b) {
            super(c16355b, null, false, null, 14, null);
            this.f41758g = list;
        }

        @Override // p001o.wqb
        /* renamed from: f */
        public int mo705f(int i) {
            return p9e.item_custom_form_selection_item;
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return this.f41758g.get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            return this.f41758g.size();
        }
    }

    /* renamed from: o.qe4$b */
    public static final class C16355b implements ck6 {

        /* renamed from: a */
        public final /* synthetic */ FormField f41759a;

        /* renamed from: b */
        public final /* synthetic */ List f41760b;

        /* renamed from: c */
        public final /* synthetic */ RecyclerView f41761c;

        public C16355b(FormField formField, List list, RecyclerView recyclerView) {
            this.f41759a = formField;
            this.f41760b = list;
            this.f41761c = recyclerView;
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            Object next;
            RecyclerView.AbstractC2371h adapter;
            PropertyDefinition propertyDefinition;
            sq8.m48649h(view, "view");
            if (sq8.m48644c(this.f41759a.isViewOnly(), Boolean.TRUE)) {
                ((CheckBox) view.findViewById(z8e.chipData)).setChecked(!((CheckBox) view.findViewById(z8e.chipData)).isChecked());
                return;
            }
            boolean z = obj instanceof PropertyOptions;
            if (z) {
                FormField formField = this.f41759a;
                if ((formField == null || (propertyDefinition = formField.getPropertyDefinition()) == null || !propertyDefinition.isMultiple()) ? false : true) {
                    ((PropertyOptions) obj).setSelected(!r8.isSelected());
                    List list = this.f41760b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((PropertyOptions) obj2).isSelected()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((PropertyOptions) it.next()).getValue());
                    }
                    List listQ0 = kh3.Q0(arrayList2);
                    if (listQ0 == null) {
                        listQ0 = ch3.m21246k();
                    }
                    FormField formField2 = this.f41759a;
                    if (formField2 == null) {
                        return;
                    }
                    formField2.setSubmittedPropertyValue(listQ0);
                    return;
                }
            }
            if (z) {
                Iterator it2 = this.f41760b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((PropertyOptions) next).isSelected()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PropertyOptions propertyOptions = (PropertyOptions) next;
                PropertyOptions propertyOptions2 = (PropertyOptions) this.f41760b.get(i);
                if (propertyOptions != null) {
                    propertyOptions.setSelected(false);
                    int iIndexOf = this.f41760b.indexOf(propertyOptions);
                    if (iIndexOf >= 0 && (adapter = this.f41761c.getAdapter()) != null) {
                        adapter.notifyItemChanged(iIndexOf);
                    }
                }
                if (propertyOptions == null || !sq8.m48644c(propertyOptions, propertyOptions2)) {
                    propertyOptions2.setSelected(true);
                    ((CheckBox) view.findViewById(z8e.chipData)).setChecked(true);
                } else {
                    ((CheckBox) view.findViewById(z8e.chipData)).setChecked(false);
                }
                List list2 = this.f41760b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((PropertyOptions) obj3).isSelected()) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(dh3.m23088v(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((PropertyOptions) it3.next()).getValue());
                }
                List listQ02 = kh3.Q0(arrayList4);
                if (listQ02 == null) {
                    listQ02 = ch3.m21246k();
                }
                FormField formField3 = this.f41759a;
                if (formField3 == null) {
                    return;
                }
                formField3.setSubmittedPropertyValue(listQ02);
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: o.qe4$c */
    public static final class C16356c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ List f41762a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f41763b;

        /* renamed from: c */
        public final /* synthetic */ Context f41764c;

        public C16356c(List list, ViewGroup viewGroup, Context context) {
            this.f41762a = list;
            this.f41763b = viewGroup;
            this.f41764c = context;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String lowerCase = String.valueOf(charSequence).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            List list = this.f41762a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String viewValue = ((PropertyOptions) obj).getViewValue();
                boolean z = false;
                if (viewValue != null) {
                    String lowerCase2 = viewValue.toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2 != null && f9g.m26306P(lowerCase2, lowerCase, false, 2, null)) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            qe4.m45242p(this.f41763b, this.f41764c, arrayList);
        }
    }

    /* renamed from: o.qe4$d */
    public static final class C16357d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ List f41765a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f41766b;

        /* renamed from: c */
        public final /* synthetic */ Context f41767c;

        /* renamed from: d */
        public final /* synthetic */ List f41768d;

        /* renamed from: e */
        public final /* synthetic */ ege f41769e;

        public C16357d(List list, ViewGroup viewGroup, Context context, List list2, ege egeVar) {
            this.f41765a = list;
            this.f41766b = viewGroup;
            this.f41767c = context;
            this.f41768d = list2;
            this.f41769e = egeVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String lowerCase = String.valueOf(charSequence).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            List list = this.f41765a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String viewValue = ((PropertyOptions) obj).getViewValue();
                boolean z = false;
                if (viewValue != null) {
                    String lowerCase2 = viewValue.toLowerCase(Locale.ROOT);
                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2 != null && f9g.m26306P(lowerCase2, lowerCase, false, 2, null)) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            qe4.m45248v(this.f41766b, this.f41767c, this.f41768d, this.f41769e, arrayList);
        }
    }

    /* renamed from: j */
    public static final List m45236j(Object obj) {
        new ArrayList();
        if (!(obj instanceof String)) {
            if (obj == null) {
                obj = new ArrayList();
            }
            return (List) obj;
        }
        String str = (String) obj;
        if (!e9g.m24597K(str, "[", false, 2, null) || !e9g.m24605w(str, "]", false, 2, null)) {
            ArrayList arrayListM21242g = ch3.m21242g(str);
            return arrayListM21242g != null ? arrayListM21242g : new ArrayList();
        }
        Object objFromJson = ja8.f30035c.fromJson(str, (Class<Object>) List.class);
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    /* renamed from: k */
    public static final void m45237k(RecyclerView recyclerView, final FormField formField) {
        PropertyDefinition propertyDefinition;
        final Context context = recyclerView != null ? recyclerView.getContext() : null;
        if (context == null) {
            return;
        }
        final List<PropertyOptions> possibleValues = (formField == null || (propertyDefinition = formField.getPropertyDefinition()) == null) ? null : propertyDefinition.getPossibleValues();
        List listM45236j = m45236j(formField != null ? formField.getSubmittedPropertyValue() : null);
        if (possibleValues != null) {
            Iterator<T> it = possibleValues.iterator();
            while (it.hasNext()) {
                ((PropertyOptions) it.next()).setSelected(false);
            }
        }
        boolean z = true;
        if (possibleValues != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : possibleValues) {
                if (kh3.m35708X(listM45236j, ((PropertyOptions) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((PropertyOptions) it2.next()).setSelected(true);
            }
        }
        if (possibleValues == null || possibleValues.size() <= 6) {
            if (possibleValues != null && !possibleValues.isEmpty()) {
                z = false;
            }
            if (z) {
                return;
            }
            recyclerView.setVisibility(0);
            ViewParent parent = recyclerView.getParent();
            sq8.m48647f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            View viewFindViewById = ((ViewGroup) parent).findViewById(z8e.dropdownTextView);
            sq8.m48648g(viewFindViewById, "findViewById(...)");
            ((TextView) viewFindViewById).setVisibility(8);
            recyclerView.setAdapter(new C16354a(possibleValues, new C16355b(formField, possibleValues, recyclerView)));
            return;
        }
        recyclerView.setVisibility(8);
        ViewParent parent2 = recyclerView.getParent();
        sq8.m48647f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent2;
        View viewFindViewById2 = viewGroup.findViewById(z8e.dropdownTextView);
        sq8.m48648g(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(z8e.layoutSelectionBlock);
        sq8.m48648g(viewFindViewById3, "findViewById(...)");
        textView.setVisibility(0);
        ((ViewGroup) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: o.je4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qe4.m45238l(formField, context, possibleValues, textView, view);
            }
        });
        m45250x(textView, possibleValues);
    }

    /* renamed from: l */
    public static final void m45238l(FormField formField, Context context, List list, TextView textView, View view) {
        sq8.m48649h(context, "$context");
        sq8.m48649h(textView, "$dropdownTextView");
        if (sq8.m48644c(formField.isViewOnly(), Boolean.TRUE)) {
            return;
        }
        m45244r(context, list, formField, textView);
    }

    /* renamed from: m */
    public static final void m45239m(Context context, final List list, final FormField formField, final TextView textView) {
        List listQ0 = kh3.Q0(list);
        View viewInflate = LayoutInflater.from(context).inflate(p9e.dialog_with_search, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(z8e.search_input);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(z8e.dialog_list_container);
        m45242p(viewGroup, context, list);
        editText.addTextChangedListener(new C16356c(listQ0, viewGroup, context));
        new nta(context).setView(viewInflate).mo3878k("OK", new DialogInterface.OnClickListener() { // from class: o.ke4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qe4.m45241o(list, formField, textView, dialogInterface, i);
            }
        }).mo3874g("Cancel", new DialogInterface.OnClickListener() { // from class: o.le4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                qe4.m45240n(dialogInterface, i);
            }
        }).m3880m();
    }

    /* renamed from: n */
    public static final void m45240n(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: o */
    public static final void m45241o(List list, FormField formField, TextView textView, DialogInterface dialogInterface, int i) {
        sq8.m48649h(list, "$options");
        sq8.m48649h(textView, "$dropdownTextView");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PropertyOptions) obj).isSelected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PropertyOptions) it.next()).getValue());
        }
        List listQ0 = kh3.Q0(arrayList2);
        if (listQ0 == null) {
            listQ0 = ch3.m21246k();
        }
        if (formField != null) {
            formField.setSubmittedPropertyValue(listQ0);
        }
        m45250x(textView, list);
        dialogInterface.dismiss();
    }

    /* renamed from: p */
    public static final void m45242p(ViewGroup viewGroup, Context context, List list) {
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final PropertyOptions propertyOptions = (PropertyOptions) it.next();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.simple_list_item_multiple_choice, viewGroup, false);
            sq8.m48647f(viewInflate, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatCheckedTextView");
            final AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) viewInflate;
            appCompatCheckedTextView.setText(propertyOptions.getViewValue());
            appCompatCheckedTextView.setChecked(propertyOptions.isSelected());
            appCompatCheckedTextView.setOnClickListener(new View.OnClickListener() { // from class: o.pe4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qe4.m45243q(propertyOptions, appCompatCheckedTextView, view);
                }
            });
            viewGroup.addView(appCompatCheckedTextView);
        }
    }

    /* renamed from: q */
    public static final void m45243q(PropertyOptions propertyOptions, AppCompatCheckedTextView appCompatCheckedTextView, View view) {
        sq8.m48649h(propertyOptions, "$option");
        sq8.m48649h(appCompatCheckedTextView, "$itemView");
        propertyOptions.setSelected(!propertyOptions.isSelected());
        appCompatCheckedTextView.setChecked(propertyOptions.isSelected());
    }

    /* renamed from: r */
    public static final void m45244r(Context context, List list, FormField formField, TextView textView) {
        PropertyDefinition propertyDefinition;
        boolean z = false;
        if (formField != null && (propertyDefinition = formField.getPropertyDefinition()) != null && propertyDefinition.isMultiple()) {
            z = true;
        }
        if (z) {
            m45239m(context, list, formField, textView);
        } else {
            m45245s(context, list, formField, textView);
        }
    }

    /* renamed from: s */
    public static final void m45245s(Context context, final List list, final FormField formField, final TextView textView) {
        List listQ0 = kh3.Q0(list);
        final ege egeVar = new ege();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((PropertyOptions) it.next()).isSelected()) {
                break;
            } else {
                i++;
            }
        }
        egeVar.f21602a = i;
        View viewInflate = LayoutInflater.from(context).inflate(p9e.dialog_with_search, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(z8e.search_input);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(z8e.dialog_list_container);
        m45248v(viewGroup, context, list, egeVar, list);
        editText.addTextChangedListener(new C16357d(listQ0, viewGroup, context, list, egeVar));
        new nta(context).setView(viewInflate).mo3878k("OK", new DialogInterface.OnClickListener() { // from class: o.me4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                qe4.m45246t(list, formField, textView, egeVar, dialogInterface, i2);
            }
        }).mo3874g("Cancel", new DialogInterface.OnClickListener() { // from class: o.ne4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                qe4.m45247u(dialogInterface, i2);
            }
        }).m3880m();
    }

    /* renamed from: t */
    public static final void m45246t(List list, FormField formField, TextView textView, ege egeVar, DialogInterface dialogInterface, int i) {
        sq8.m48649h(list, "$options");
        sq8.m48649h(textView, "$dropdownTextView");
        sq8.m48649h(egeVar, "$selectedIndex");
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ch3.m21256u();
            }
            ((PropertyOptions) obj).setSelected(i2 == egeVar.f21602a);
            i2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PropertyOptions) obj2).isSelected()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PropertyOptions) it.next()).getValue());
        }
        List listQ0 = kh3.Q0(arrayList2);
        if (listQ0 == null) {
            listQ0 = ch3.m21246k();
        }
        if (formField != null) {
            formField.setSubmittedPropertyValue(listQ0);
        }
        m45250x(textView, list);
        dialogInterface.dismiss();
    }

    /* renamed from: u */
    public static final void m45247u(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: v */
    public static final void m45248v(final ViewGroup viewGroup, final Context context, final List list, final ege egeVar, final List list2) {
        viewGroup.removeAllViews();
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            final PropertyOptions propertyOptions = (PropertyOptions) obj;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.simple_list_item_single_choice, viewGroup, false);
            sq8.m48647f(viewInflate, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatCheckedTextView");
            AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) viewInflate;
            appCompatCheckedTextView.setText(propertyOptions.getViewValue());
            appCompatCheckedTextView.setChecked(list.indexOf(propertyOptions) == egeVar.f21602a);
            appCompatCheckedTextView.setOnClickListener(new View.OnClickListener() { // from class: o.oe4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qe4.m45249w(egeVar, list, propertyOptions, list2, viewGroup, context, view);
                }
            });
            viewGroup.addView(appCompatCheckedTextView);
            i = i2;
        }
    }

    /* renamed from: w */
    public static final void m45249w(ege egeVar, List list, PropertyOptions propertyOptions, List list2, ViewGroup viewGroup, Context context, View view) {
        sq8.m48649h(egeVar, "$selectedIndex");
        sq8.m48649h(list, "$options");
        sq8.m48649h(propertyOptions, "$option");
        sq8.m48649h(list2, "$filteredOptions");
        sq8.m48649h(context, "$context");
        egeVar.f21602a = list.indexOf(propertyOptions);
        m45248v(viewGroup, context, list, egeVar, list2);
    }

    /* renamed from: x */
    public static final void m45250x(TextView textView, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PropertyOptions) obj).isSelected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PropertyOptions) it.next()).getViewValue());
        }
        textView.setText(arrayList2.isEmpty() ^ true ? kh3.p0(arrayList2, ", ", null, null, 0, null, null, 62, null) : "Tap here to Select options");
    }
}
