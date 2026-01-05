package x2;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x2.g */
/* loaded from: classes.dex */
public final class C8283g {
    /* renamed from: a */
    public static AutofillValue m15487a(String str) {
        return AutofillValue.forText(str);
    }

    /* renamed from: b */
    public static void m15488b(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: c */
    public static void m15489c(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    /* renamed from: d */
    public static void m15490d(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    /* renamed from: e */
    public static void m15491e(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    /* renamed from: f */
    public static void m15492f(ViewStructure viewStructure) {
        viewStructure.setDataIsSensitive(true);
    }

    /* renamed from: g */
    public static void m15493g(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}
