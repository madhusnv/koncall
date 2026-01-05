package p001o;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;

/* loaded from: classes2.dex */
public abstract class fjh {

    /* renamed from: o.fjh$a */
    public class C13465a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ nv8 f23538a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC13466b f23539b;

        public C13465a(InterfaceC13467c interfaceC13467c, InterfaceC13468d interfaceC13468d, nv8 nv8Var, InterfaceC13466b interfaceC13466b) {
            this.f23538a = nv8Var;
            this.f23539b = interfaceC13466b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            InterfaceC13466b interfaceC13466b = this.f23539b;
            if (interfaceC13466b != null) {
                interfaceC13466b.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            nv8 nv8Var = this.f23538a;
            if (nv8Var != null) {
                nv8Var.mo41180a();
            }
        }
    }

    /* renamed from: o.fjh$b */
    public interface InterfaceC13466b {
        void afterTextChanged(Editable editable);
    }

    /* renamed from: o.fjh$c */
    public interface InterfaceC13467c {
    }

    /* renamed from: o.fjh$d */
    public interface InterfaceC13468d {
    }

    /* renamed from: a */
    public static String m26936a(TextView textView) {
        return textView.getText().toString();
    }

    /* renamed from: b */
    public static boolean m26937b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m26938c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m26937b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    /* renamed from: d */
    public static void m26939d(TextView textView, InterfaceC13467c interfaceC13467c, InterfaceC13468d interfaceC13468d, InterfaceC13466b interfaceC13466b, nv8 nv8Var) {
        C13465a c13465a = (interfaceC13467c == null && interfaceC13466b == null && interfaceC13468d == null && nv8Var == null) ? null : new C13465a(interfaceC13467c, interfaceC13468d, nv8Var, interfaceC13466b);
        TextWatcher textWatcher = (TextWatcher) ega.m24969a(textView, c13465a, x8e.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (c13465a != null) {
            textView.addTextChangedListener(c13465a);
        }
    }
}
