package p001o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class nh0 implements CharSequence {

    /* renamed from: a */
    public final String f36836a;

    /* renamed from: b */
    public final List f36837b;

    /* renamed from: c */
    public final List f36838c;

    /* renamed from: d */
    public final List f36839d;

    /* renamed from: o.nh0$a */
    public static final class C15582a {

        /* renamed from: a */
        public final Object f36840a;

        /* renamed from: b */
        public final int f36841b;

        /* renamed from: c */
        public final int f36842c;

        /* renamed from: d */
        public final String f36843d;

        public C15582a(Object obj, int i, int i2, String str) {
            sq8.m48649h(str, "tag");
            this.f36840a = obj;
            this.f36841b = i;
            this.f36842c = i2;
            this.f36843d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* renamed from: a */
        public final Object m40561a() {
            return this.f36840a;
        }

        /* renamed from: b */
        public final int m40562b() {
            return this.f36841b;
        }

        /* renamed from: c */
        public final int m40563c() {
            return this.f36842c;
        }

        /* renamed from: d */
        public final int m40564d() {
            return this.f36842c;
        }

        /* renamed from: e */
        public final Object m40565e() {
            return this.f36840a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15582a)) {
                return false;
            }
            C15582a c15582a = (C15582a) obj;
            return sq8.m48644c(this.f36840a, c15582a.f36840a) && this.f36841b == c15582a.f36841b && this.f36842c == c15582a.f36842c && sq8.m48644c(this.f36843d, c15582a.f36843d);
        }

        /* renamed from: f */
        public final int m40566f() {
            return this.f36841b;
        }

        /* renamed from: g */
        public final String m40567g() {
            return this.f36843d;
        }

        public int hashCode() {
            Object obj = this.f36840a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f36841b)) * 31) + Integer.hashCode(this.f36842c)) * 31) + this.f36843d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f36840a + ", start=" + this.f36841b + ", end=" + this.f36842c + ", tag=" + this.f36843d + ')';
        }
    }

    /* renamed from: o.nh0$b */
    public static final class C15583b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(Integer.valueOf(((C15582a) obj).m40566f()), Integer.valueOf(((C15582a) obj2).m40566f()));
        }
    }

    public nh0(String str, List list, List list2, List list3) {
        List listI0;
        sq8.m48649h(str, "text");
        this.f36836a = str;
        this.f36837b = list;
        this.f36838c = list2;
        this.f36839d = list3;
        if (list2 == null || (listI0 = kh3.I0(list2, new C15583b())) == null) {
            return;
        }
        int size = listI0.size();
        int iM40564d = -1;
        for (int i = 0; i < size; i++) {
            C15582a c15582a = (C15582a) listI0.get(i);
            if (!(c15582a.m40566f() >= iM40564d)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (!(c15582a.m40564d() <= this.f36836a.length())) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + c15582a.m40566f() + ", " + c15582a.m40564d() + ") is out of boundary").toString());
            }
            iM40564d = c15582a.m40564d();
        }
    }

    /* renamed from: a */
    public char m40550a(int i) {
        return this.f36836a.charAt(i);
    }

    /* renamed from: b */
    public final List m40551b() {
        return this.f36839d;
    }

    /* renamed from: c */
    public int m40552c() {
        return this.f36836a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return m40550a(i);
    }

    /* renamed from: d */
    public final List m40553d() {
        List list = this.f36838c;
        return list == null ? ch3.m21246k() : list;
    }

    /* renamed from: e */
    public final List m40554e() {
        List list = this.f36837b;
        return list == null ? ch3.m21246k() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        return sq8.m48644c(this.f36836a, nh0Var.f36836a) && sq8.m48644c(this.f36837b, nh0Var.f36837b) && sq8.m48644c(this.f36838c, nh0Var.f36838c) && sq8.m48644c(this.f36839d, nh0Var.f36839d);
    }

    /* renamed from: f */
    public final List m40555f() {
        return this.f36837b;
    }

    /* renamed from: g */
    public final String m40556g() {
        return this.f36836a;
    }

    /* renamed from: h */
    public final List m40557h(int i, int i2) {
        List listM21246k;
        List list = this.f36839d;
        if (list != null) {
            listM21246k = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C15582a c15582a = (C15582a) obj;
                if ((c15582a.m40565e() instanceof pyh) && oh0.m42234d(i, i2, c15582a.m40566f(), c15582a.m40564d())) {
                    listM21246k.add(obj);
                }
            }
        } else {
            listM21246k = ch3.m21246k();
        }
        sq8.m48647f(listM21246k, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM21246k;
    }

    public int hashCode() {
        int iHashCode = this.f36836a.hashCode() * 31;
        List list = this.f36837b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f36838c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f36839d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m40558i(int i, int i2) {
        List listM21246k;
        List list = this.f36839d;
        if (list != null) {
            listM21246k = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C15582a c15582a = (C15582a) obj;
                if ((c15582a.m40565e() instanceof n8i) && oh0.m42234d(i, i2, c15582a.m40566f(), c15582a.m40564d())) {
                    listM21246k.add(obj);
                }
            }
        } else {
            listM21246k = ch3.m21246k();
        }
        sq8.m48647f(listM21246k, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM21246k;
    }

    @Override // java.lang.CharSequence
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public nh0 subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.f36836a.length()) {
                return this;
            }
            String strSubstring = this.f36836a.substring(i, i2);
            sq8.m48648g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new nh0(strSubstring, oh0.m42233c(this.f36837b, i, i2), oh0.m42233c(this.f36838c, i, i2), oh0.m42233c(this.f36839d, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    /* renamed from: k */
    public final nh0 m40560k(long j) {
        return subSequence(kih.m35762i(j), kih.m35761h(j));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m40552c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f36836a;
    }

    public /* synthetic */ nh0(String str, List list, List list2, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? ch3.m21246k() : list, (i & 4) != 0 ? ch3.m21246k() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nh0(String str, List list, List list2) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
        sq8.m48649h(str, "text");
        sq8.m48649h(list, "spanStyles");
        sq8.m48649h(list2, "paragraphStyles");
    }
}
