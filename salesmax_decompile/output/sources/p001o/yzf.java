package p001o;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class yzf extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f56333a;

    /* renamed from: b */
    public final List f56334b;

    /* renamed from: o.yzf$a */
    public static class C18535a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f56335a;

        /* renamed from: b */
        public final AtomicInteger f56336b = new AtomicInteger(0);

        public C18535a(Object obj) {
            this.f56335a = obj;
        }

        /* renamed from: a */
        public final void m58579a() {
            this.f56336b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f56335a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m58580b(Object obj) {
            return obj instanceof r56;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f56335a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void m58581c() {
            this.f56336b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f56336b.get() <= 0 || !m58580b(obj)) {
                ((SpanWatcher) this.f56335a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f56336b.get() <= 0 || !m58580b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    }
                }
                ((SpanWatcher) this.f56335a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f56336b.get() <= 0 || !m58580b(obj)) {
                ((SpanWatcher) this.f56335a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f56335a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public yzf(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f56334b = new ArrayList();
        fgd.m26664h(cls, "watcherClass cannot be null");
        this.f56333a = cls;
    }

    /* renamed from: c */
    public static yzf m58570c(Class cls, CharSequence charSequence) {
        return new yzf(cls, charSequence);
    }

    /* renamed from: a */
    public void m58571a() {
        m58572b();
    }

    /* renamed from: b */
    public final void m58572b() {
        for (int i = 0; i < this.f56334b.size(); i++) {
            ((C18535a) this.f56334b.get(i)).m58579a();
        }
    }

    /* renamed from: d */
    public void m58573d() {
        m58578i();
        m58574e();
    }

    /* renamed from: e */
    public final void m58574e() {
        for (int i = 0; i < this.f56334b.size(); i++) {
            ((C18535a) this.f56334b.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C18535a m58575f(Object obj) {
        for (int i = 0; i < this.f56334b.size(); i++) {
            C18535a c18535a = (C18535a) this.f56334b.get(i);
            if (c18535a.f56335a == obj) {
                return c18535a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m58576g(Class cls) {
        return this.f56333a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C18535a c18535aM58575f;
        if (m58577h(obj) && (c18535aM58575f = m58575f(obj)) != null) {
            obj = c18535aM58575f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C18535a c18535aM58575f;
        if (m58577h(obj) && (c18535aM58575f = m58575f(obj)) != null) {
            obj = c18535aM58575f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C18535a c18535aM58575f;
        if (m58577h(obj) && (c18535aM58575f = m58575f(obj)) != null) {
            obj = c18535aM58575f;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        if (!m58576g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C18535a[] c18535aArr = (C18535a[]) super.getSpans(i, i2, C18535a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c18535aArr.length);
        for (int i3 = 0; i3 < c18535aArr.length; i3++) {
            objArr[i3] = c18535aArr[i3].f56335a;
        }
        return objArr;
    }

    /* renamed from: h */
    public final boolean m58577h(Object obj) {
        return obj != null && m58576g(obj.getClass());
    }

    /* renamed from: i */
    public final void m58578i() {
        for (int i = 0; i < this.f56334b.size(); i++) {
            ((C18535a) this.f56334b.get(i)).m58581c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || m58576g(cls)) {
            cls = C18535a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C18535a c18535aM58575f;
        if (m58577h(obj)) {
            c18535aM58575f = m58575f(obj);
            if (c18535aM58575f != null) {
                obj = c18535aM58575f;
            }
        } else {
            c18535aM58575f = null;
        }
        super.removeSpan(obj);
        if (c18535aM58575f != null) {
            this.f56334b.remove(c18535aM58575f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m58577h(obj)) {
            C18535a c18535a = new C18535a(obj);
            this.f56334b.add(c18535a);
            obj = c18535a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new yzf(this.f56333a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m58572b();
        super.replace(i, i2, charSequence);
        m58578i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public yzf(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f56334b = new ArrayList();
        fgd.m26664h(cls, "watcherClass cannot be null");
        this.f56333a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m58572b();
        super.replace(i, i2, charSequence, i3, i4);
        m58578i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
