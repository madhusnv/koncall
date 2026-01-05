package u6;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u6.d */
/* loaded from: classes.dex */
public final class C7350d extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f34982a;

    /* renamed from: b */
    public final ArrayList f34983b;

    public C7350d(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f34983b = new ArrayList();
        y0.m11055e(cls, "watcherClass cannot be null");
        this.f34982a = cls;
    }

    /* renamed from: a */
    public final C7349c m13755a(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34983b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C7349c c7349c = (C7349c) arrayList.get(i10);
            if (c7349c.f34980a == obj) {
                return c7349c;
            }
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final boolean m13756b(Object obj) {
        if (obj != null) {
            return this.f34982a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C7349c c7349cM13755a;
        if (m13756b(obj) && (c7349cM13755a = m13755a(obj)) != null) {
            obj = c7349cM13755a;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C7349c c7349cM13755a;
        if (m13756b(obj) && (c7349cM13755a = m13755a(obj)) != null) {
            obj = c7349cM13755a;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C7349c c7349cM13755a;
        if (m13756b(obj) && (c7349cM13755a = m13755a(obj)) != null) {
            obj = c7349cM13755a;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.f34982a != cls) {
            return super.getSpans(i10, i11, cls);
        }
        C7349c[] c7349cArr = (C7349c[]) super.getSpans(i10, i11, C7349c.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c7349cArr.length);
        for (int i12 = 0; i12 < c7349cArr.length; i12++) {
            objArr[i12] = c7349cArr[i12].f34980a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f34982a == cls) {
            cls = C7349c.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C7349c c7349cM13755a;
        if (m13756b(obj)) {
            c7349cM13755a = m13755a(obj);
            if (c7349cM13755a != null) {
                obj = c7349cM13755a;
            }
        } else {
            c7349cM13755a = null;
        }
        super.removeSpan(obj);
        if (c7349cM13755a != null) {
            this.f34983b.remove(c7349cM13755a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (m13756b(obj)) {
            C7349c c7349c = new C7349c(obj);
            this.f34983b.add(c7349c);
            obj = c7349c;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new C7350d(this.f34982a, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        ArrayList arrayList;
        int i12 = 0;
        while (true) {
            arrayList = this.f34983b;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((C7349c) arrayList.get(i12)).f34981b.incrementAndGet();
            i12++;
        }
        super.replace(i10, i11, charSequence);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            ((C7349c) arrayList.get(i13)).f34981b.decrementAndGet();
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public C7350d(Class cls, C7350d c7350d, int i10, int i11) {
        super(c7350d, i10, i11);
        this.f34983b = new ArrayList();
        y0.m11055e(cls, "watcherClass cannot be null");
        this.f34982a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        ArrayList arrayList;
        int i14 = 0;
        while (true) {
            arrayList = this.f34983b;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((C7349c) arrayList.get(i14)).f34981b.incrementAndGet();
            i14++;
        }
        super.replace(i10, i11, charSequence, i12, i13);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((C7349c) arrayList.get(i15)).f34981b.decrementAndGet();
        }
        return this;
    }
}
