package p001o;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes2.dex */
public final class l61 {

    /* renamed from: a */
    public static final l61 f33296a = new l61();

    /* renamed from: a */
    public final AutofillId m36600a(ViewStructure viewStructure) {
        sq8.m48649h(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* renamed from: b */
    public final boolean m36601b(AutofillValue autofillValue) {
        sq8.m48649h(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* renamed from: c */
    public final boolean m36602c(AutofillValue autofillValue) {
        sq8.m48649h(autofillValue, "value");
        return autofillValue.isList();
    }

    /* renamed from: d */
    public final boolean m36603d(AutofillValue autofillValue) {
        sq8.m48649h(autofillValue, "value");
        return autofillValue.isText();
    }

    /* renamed from: e */
    public final boolean m36604e(AutofillValue autofillValue) {
        sq8.m48649h(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* renamed from: f */
    public final void m36605f(ViewStructure viewStructure, String[] strArr) {
        sq8.m48649h(viewStructure, "structure");
        sq8.m48649h(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: g */
    public final void m36606g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        sq8.m48649h(viewStructure, "structure");
        sq8.m48649h(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    /* renamed from: h */
    public final void m36607h(ViewStructure viewStructure, int i) {
        sq8.m48649h(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence m36608i(AutofillValue autofillValue) {
        sq8.m48649h(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        sq8.m48648g(textValue, "value.textValue");
        return textValue;
    }
}
