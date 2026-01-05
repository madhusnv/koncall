package p001o;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* loaded from: classes2.dex */
public final class p61 extends AutofillManager$AutofillCallback {

    /* renamed from: a */
    public static final p61 f39386a = new p61();

    /* renamed from: a */
    public final void m42992a(id0 id0Var) {
        sq8.m48649h(id0Var, "autofill");
        id0Var.m31911a().registerCallback(m61.m38408a(this));
    }

    /* renamed from: b */
    public final void m42993b(id0 id0Var) {
        sq8.m48649h(id0Var, "autofill");
        id0Var.m31911a().unregisterCallback(m61.m38408a(this));
    }

    public void onAutofillEvent(View view, int i, int i2) {
        sq8.m48649h(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
