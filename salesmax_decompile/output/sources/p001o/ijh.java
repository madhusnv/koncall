package p001o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class ijh extends ii8 {

    /* renamed from: a */
    public final TextView f28752a;

    /* renamed from: o.ijh$a */
    public static final class C14306a extends opa implements TextWatcher {

        /* renamed from: b */
        public final TextView f28753b;

        /* renamed from: c */
        public final m9c f28754c;

        public C14306a(TextView textView, m9c m9cVar) {
            sq8.m48650i(textView, "view");
            sq8.m48650i(m9cVar, "observer");
            this.f28753b = textView;
            this.f28754c = m9cVar;
        }

        @Override // p001o.opa
        /* renamed from: a */
        public void mo32216a() {
            this.f28753b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            sq8.m48650i(editable, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48650i(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48650i(charSequence, "s");
            if (isDisposed()) {
                return;
            }
            this.f28754c.mo16560e(charSequence);
        }
    }

    public ijh(TextView textView) {
        sq8.m48650i(textView, "view");
        this.f28752a = textView;
    }

    @Override // p001o.ii8
    public void N0(m9c m9cVar) {
        sq8.m48650i(m9cVar, "observer");
        C14306a c14306a = new C14306a(this.f28752a, m9cVar);
        m9cVar.mo16559a(c14306a);
        this.f28752a.addTextChangedListener(c14306a);
    }

    @Override // p001o.ii8
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public CharSequence L0() {
        return this.f28752a.getText();
    }
}
