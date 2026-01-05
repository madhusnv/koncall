package p001o;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C2066c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class p56 implements InputFilter {

    /* renamed from: a */
    public final TextView f39341a;

    /* renamed from: b */
    public C2066c.f f39342b;

    /* renamed from: o.p56$a */
    public static class RunnableC15957a extends C2066c.f implements Runnable {

        /* renamed from: a */
        public final Reference f39343a;

        /* renamed from: b */
        public final Reference f39344b;

        public RunnableC15957a(TextView textView, p56 p56Var) {
            this.f39343a = new WeakReference(textView);
            this.f39344b = new WeakReference(p56Var);
        }

        @Override // androidx.emoji2.text.C2066c.f
        /* renamed from: b */
        public void mo4396b() {
            Handler handler;
            super.mo4396b();
            TextView textView = (TextView) this.f39343a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        /* renamed from: c */
        public final boolean m42977c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceM6077p;
            TextView textView = (TextView) this.f39343a.get();
            if (m42977c(textView, (InputFilter) this.f39344b.get()) && textView.isAttachedToWindow() && text != (charSequenceM6077p = C2066c.m6064c().m6077p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceM6077p);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM6077p);
                textView.setText(charSequenceM6077p);
                if (charSequenceM6077p instanceof Spannable) {
                    p56.m42975b((Spannable) charSequenceM6077p, selectionStart, selectionEnd);
                }
            }
        }
    }

    public p56(TextView textView) {
        this.f39341a = textView;
    }

    /* renamed from: b */
    public static void m42975b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public C2066c.f m42976a() {
        if (this.f39342b == null) {
            this.f39342b = new RunnableC15957a(this.f39341a, this);
        }
        return this.f39342b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f39341a.isInEditMode()) {
            return charSequence;
        }
        int iM6070e = C2066c.m6064c().m6070e();
        if (iM6070e != 0) {
            boolean z = true;
            if (iM6070e == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f39341a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2066c.m6064c().m6078q(charSequence, 0, charSequence.length());
            }
            if (iM6070e != 3) {
                return charSequence;
            }
        }
        C2066c.m6064c().m6081t(m42976a());
        return charSequence;
    }
}
