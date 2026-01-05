package rh;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.k */
/* loaded from: classes.dex */
public final class C6532k extends C6541t {

    /* renamed from: e */
    public final /* synthetic */ C6535n f31319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6532k(C6535n c6535n, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f31319e = c6535n;
    }

    @Override // rh.C6541t, c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        super.mo2338d(view, c1617g);
        if (!C6535n.m12556f(this.f31319e.f31336a.getEditText())) {
            c1617g.m5292k("android.widget.Spinner");
        }
        if (c1617g.m5289h()) {
            c1617g.m5296o(null);
        }
    }

    @Override // c6.C0872b
    /* renamed from: e */
    public final void mo2339e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2339e(view, accessibilityEvent);
        C6535n c6535n = this.f31319e;
        TextInputLayout textInputLayout = c6535n.f31336a;
        EditText editText = textInputLayout.getEditText();
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (accessibilityEvent.getEventType() == 1 && c6535n.f31333n.isTouchExplorationEnabled() && !C6535n.m12556f(textInputLayout.getEditText())) {
            C6535n.m12555d(c6535n, autoCompleteTextView);
        }
    }
}
