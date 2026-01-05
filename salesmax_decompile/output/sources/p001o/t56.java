package p001o;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C2066c;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class t56 implements TextWatcher {

    /* renamed from: a */
    public final EditText f46442a;

    /* renamed from: b */
    public final boolean f46443b;

    /* renamed from: c */
    public C2066c.f f46444c;

    /* renamed from: d */
    public int f46445d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: e */
    public int f46446e = 0;

    /* renamed from: f */
    public boolean f46447f = true;

    /* renamed from: o.t56$a */
    public static class RunnableC17000a extends C2066c.f implements Runnable {

        /* renamed from: a */
        public final Reference f46448a;

        public RunnableC17000a(EditText editText) {
            this.f46448a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C2066c.f
        /* renamed from: b */
        public void mo4396b() {
            Handler handler;
            super.mo4396b();
            EditText editText = (EditText) this.f46448a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            t56.m49408b((EditText) this.f46448a.get(), 1);
        }
    }

    public t56(EditText editText, boolean z) {
        this.f46442a = editText;
        this.f46443b = z;
    }

    /* renamed from: b */
    public static void m49408b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2066c.m6064c().m6077p(editableText);
            p56.m42975b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public C2066c.f m49409a() {
        if (this.f46444c == null) {
            this.f46444c = new RunnableC17000a(this.f46442a);
        }
        return this.f46444c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void m49410c(boolean z) {
        if (this.f46447f != z) {
            if (this.f46444c != null) {
                C2066c.m6064c().m6082u(this.f46444c);
            }
            this.f46447f = z;
            if (z) {
                m49408b(this.f46442a, C2066c.m6064c().m6070e());
            }
        }
    }

    /* renamed from: d */
    public final boolean m49411d() {
        return (this.f46447f && (this.f46443b || C2066c.m6068i())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f46442a.isInEditMode() || m49411d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM6070e = C2066c.m6064c().m6070e();
        if (iM6070e != 0) {
            if (iM6070e == 1) {
                C2066c.m6064c().m6080s((Spannable) charSequence, i, i + i3, this.f46445d, this.f46446e);
                return;
            } else if (iM6070e != 3) {
                return;
            }
        }
        C2066c.m6064c().m6081t(m49409a());
    }
}
