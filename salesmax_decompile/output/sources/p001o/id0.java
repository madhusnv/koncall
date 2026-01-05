package p001o;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes2.dex */
public final class id0 implements a61 {

    /* renamed from: a */
    public final View f28471a;

    /* renamed from: b */
    public final t61 f28472b;

    /* renamed from: c */
    public final AutofillManager f28473c;

    public id0(View view, t61 t61Var) {
        sq8.m48649h(view, "view");
        sq8.m48649h(t61Var, "autofillTree");
        this.f28471a = view;
        this.f28472b = t61Var;
        AutofillManager autofillManagerM28458a = gd0.m28458a(view.getContext().getSystemService(fd0.m26459a()));
        if (autofillManagerM28458a == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f28473c = autofillManagerM28458a;
        view.setImportantForAutofill(1);
    }

    /* renamed from: a */
    public final AutofillManager m31911a() {
        return this.f28473c;
    }

    /* renamed from: b */
    public final t61 m31912b() {
        return this.f28472b;
    }

    /* renamed from: c */
    public final View m31913c() {
        return this.f28471a;
    }
}
