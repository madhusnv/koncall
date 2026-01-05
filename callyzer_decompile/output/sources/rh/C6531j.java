package rh;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import l0.RunnableC4307g;
import lh.AbstractC4474j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.j */
/* loaded from: classes.dex */
public final class C6531j extends AbstractC4474j {

    /* renamed from: a */
    public final /* synthetic */ int f31317a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6536o f31318b;

    public /* synthetic */ C6531j(AbstractC6536o abstractC6536o, int i10) {
        this.f31317a = i10;
        this.f31318b = abstractC6536o;
    }

    @Override // lh.AbstractC4474j, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f31317a) {
            case 0:
                C6535n c6535n = (C6535n) this.f31318b;
                EditText editText = c6535n.f31336a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (c6535n.f31333n.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !c6535n.f31338c.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
                autoCompleteTextView.post(new RunnableC4307g(12, this, autoCompleteTextView, false));
                return;
            default:
                return;
        }
    }

    @Override // lh.AbstractC4474j, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f31317a) {
            case 1:
                ((C6539r) this.f31318b).f31338c.setChecked(!C6539r.m12570d(r1));
                break;
        }
    }
}
