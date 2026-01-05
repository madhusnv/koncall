package p001o;

import android.view.ViewStructure;

/* loaded from: classes2.dex */
public class jzi {

    /* renamed from: a */
    public final Object f31310a;

    /* renamed from: o.jzi$a */
    public static class C14683a {
        /* renamed from: a */
        public static void m34805a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        /* renamed from: b */
        public static void m34806b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        /* renamed from: c */
        public static void m34807c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: d */
        public static void m34808d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public jzi(ViewStructure viewStructure) {
        this.f31310a = viewStructure;
    }

    /* renamed from: f */
    public static jzi m34799f(ViewStructure viewStructure) {
        return new jzi(viewStructure);
    }

    /* renamed from: a */
    public void m34800a(String str) {
        C14683a.m34805a((ViewStructure) this.f31310a, str);
    }

    /* renamed from: b */
    public void m34801b(CharSequence charSequence) {
        C14683a.m34806b((ViewStructure) this.f31310a, charSequence);
    }

    /* renamed from: c */
    public void m34802c(int i, int i2, int i3, int i4, int i5, int i6) {
        C14683a.m34807c((ViewStructure) this.f31310a, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public void m34803d(CharSequence charSequence) {
        C14683a.m34808d((ViewStructure) this.f31310a, charSequence);
    }

    /* renamed from: e */
    public ViewStructure m34804e() {
        return (ViewStructure) this.f31310a;
    }
}
