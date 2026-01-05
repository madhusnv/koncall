package p001o;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class kd0 {
    /* renamed from: a */
    public static final void m35423a(id0 id0Var, SparseArray sparseArray) {
        sq8.m48649h(id0Var, "<this>");
        sq8.m48649h(sparseArray, "values");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueM33554a = jd0.m33554a(sparseArray.get(iKeyAt));
            l61 l61Var = l61.f33296a;
            sq8.m48648g(autofillValueM33554a, "value");
            if (l61Var.m36603d(autofillValueM33554a)) {
                id0Var.m31912b().m49425b(iKeyAt, l61Var.m36608i(autofillValueM33554a).toString());
            } else {
                if (l61Var.m36601b(autofillValueM33554a)) {
                    throw new v0c("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (l61Var.m36602c(autofillValueM33554a)) {
                    throw new v0c("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (l61Var.m36604e(autofillValueM33554a)) {
                    throw new v0c("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m35424b(id0 id0Var, ViewStructure viewStructure) {
        sq8.m48649h(id0Var, "<this>");
        sq8.m48649h(viewStructure, "root");
        int iM18180a = b61.f15573a.m18180a(viewStructure, id0Var.m31912b().m49424a().size());
        for (Map.Entry entry : id0Var.m31912b().m49424a().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            tq.m50332a(entry.getValue());
            b61 b61Var = b61.f15573a;
            ViewStructure viewStructureM18181b = b61Var.m18181b(viewStructure, iM18180a);
            if (viewStructureM18181b != null) {
                l61 l61Var = l61.f33296a;
                AutofillId autofillIdM36600a = l61Var.m36600a(viewStructure);
                sq8.m48646e(autofillIdM36600a);
                l61Var.m36606g(viewStructureM18181b, autofillIdM36600a, iIntValue);
                b61Var.m18183d(viewStructureM18181b, iIntValue, id0Var.m31913c().getContext().getPackageName(), null, null);
                l61Var.m36607h(viewStructureM18181b, 1);
                throw null;
            }
            iM18180a++;
        }
    }
}
