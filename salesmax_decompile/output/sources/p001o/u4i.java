package p001o;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes2.dex */
public class u4i implements Spannable {

    /* renamed from: a */
    public boolean f48339a = false;

    /* renamed from: b */
    public Spannable f48340b;

    /* renamed from: o.u4i$a */
    public static class C17297a {
        /* renamed from: a */
        public static IntStream m50950a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m50951b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: o.u4i$b */
    public static class C17298b {
        /* renamed from: a */
        public boolean mo50952a(CharSequence charSequence) {
            return charSequence instanceof agd;
        }
    }

    /* renamed from: o.u4i$c */
    public static class C17299c extends C17298b {
        @Override // p001o.u4i.C17298b
        /* renamed from: a */
        public boolean mo50952a(CharSequence charSequence) {
            return v4i.m52328a(charSequence) || (charSequence instanceof agd);
        }
    }

    public u4i(Spannable spannable) {
        this.f48340b = spannable;
    }

    /* renamed from: c */
    public static C17298b m50947c() {
        return Build.VERSION.SDK_INT < 28 ? new C17298b() : new C17299c();
    }

    /* renamed from: a */
    public final void m50948a() {
        Spannable spannable = this.f48340b;
        if (!this.f48339a && m50947c().mo50952a(spannable)) {
            this.f48340b = new SpannableString(spannable);
        }
        this.f48339a = true;
    }

    /* renamed from: b */
    public Spannable m50949b() {
        return this.f48340b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f48340b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return C17297a.m50950a(this.f48340b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return C17297a.m50951b(this.f48340b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f48340b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f48340b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f48340b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.f48340b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f48340b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f48340b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m50948a();
        this.f48340b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m50948a();
        this.f48340b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f48340b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f48340b.toString();
    }

    public u4i(CharSequence charSequence) {
        this.f48340b = new SpannableString(charSequence);
    }
}
