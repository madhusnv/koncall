package x2;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import bg.C0657b;
import p020v.a1;
import pg.q9;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x2.a */
/* loaded from: classes.dex */
public final class C8277a implements InterfaceC8282f {

    /* renamed from: a */
    public final C7904v f39797a;

    /* renamed from: b */
    public final C8287k f39798b;

    /* renamed from: c */
    public final AutofillManager f39799c;

    /* renamed from: d */
    public final AutofillId f39800d;

    public C8277a(C7904v c7904v, C8287k c8287k) {
        this.f39797a = c7904v;
        this.f39798b = c8287k;
        AutofillManager autofillManager = (AutofillManager) c7904v.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f39799c = autofillManager;
        c7904v.setImportantForAutofill(1);
        C0657b c0657bM11835a = q9.m11835a(c7904v);
        AutofillId autofillId = c0657bM11835a != null ? (AutofillId) c0657bM11835a.f4200a : null;
        if (autofillId == null) {
            throw a1.m14342v("Required value was null.");
        }
        this.f39800d = autofillId;
    }
}
