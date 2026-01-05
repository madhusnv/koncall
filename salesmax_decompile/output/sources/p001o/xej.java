package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class xej {

    /* renamed from: o.xej$a */
    public static final class C18134a extends xej {

        /* renamed from: a */
        public final int f53663a;

        /* renamed from: b */
        public final C18137d f53664b;

        /* renamed from: c */
        public final Map f53665c;

        /* renamed from: d */
        public final List f53666d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18134a(int i, C18137d c18137d, Map map, List list) {
            super(null);
            sq8.m48649h(c18137d, "name");
            sq8.m48649h(map, "attributes");
            sq8.m48649h(list, "nsDeclarations");
            this.f53663a = i;
            this.f53664b = c18137d;
            this.f53665c = map;
            this.f53666d = list;
        }

        /* renamed from: a */
        public int m56196a() {
            return this.f53663a;
        }

        /* renamed from: b */
        public final C18137d m56197b() {
            return this.f53664b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18134a)) {
                return false;
            }
            C18134a c18134a = (C18134a) obj;
            return this.f53663a == c18134a.f53663a && sq8.m48644c(this.f53664b, c18134a.f53664b) && sq8.m48644c(this.f53665c, c18134a.f53665c) && sq8.m48644c(this.f53666d, c18134a.f53666d);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f53663a) * 31) + this.f53664b.hashCode()) * 31) + this.f53665c.hashCode()) * 31) + this.f53666d.hashCode();
        }

        public String toString() {
            return '<' + this.f53664b + " (" + m56196a() + ")>";
        }
    }

    /* renamed from: o.xej$b */
    public static final class C18135b extends xej {

        /* renamed from: a */
        public final int f53667a;

        /* renamed from: b */
        public final C18137d f53668b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18135b(int i, C18137d c18137d) {
            super(null);
            sq8.m48649h(c18137d, "name");
            this.f53667a = i;
            this.f53668b = c18137d;
        }

        /* renamed from: a */
        public int m56198a() {
            return this.f53667a;
        }

        /* renamed from: b */
        public final C18137d m56199b() {
            return this.f53668b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18135b)) {
                return false;
            }
            C18135b c18135b = (C18135b) obj;
            return this.f53667a == c18135b.f53667a && sq8.m48644c(this.f53668b, c18135b.f53668b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f53667a) * 31) + this.f53668b.hashCode();
        }

        public String toString() {
            return "</" + this.f53668b + "> (" + m56198a() + ')';
        }
    }

    /* renamed from: o.xej$c */
    public static final class C18136c {

        /* renamed from: a */
        public final String f53669a;

        /* renamed from: b */
        public final String f53670b;

        public C18136c(String str, String str2) {
            sq8.m48649h(str, "uri");
            this.f53669a = str;
            this.f53670b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18136c)) {
                return false;
            }
            C18136c c18136c = (C18136c) obj;
            return sq8.m48644c(this.f53669a, c18136c.f53669a) && sq8.m48644c(this.f53670b, c18136c.f53670b);
        }

        public int hashCode() {
            int iHashCode = this.f53669a.hashCode() * 31;
            String str = this.f53670b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Namespace(uri=" + this.f53669a + ", prefix=" + this.f53670b + ')';
        }
    }

    /* renamed from: o.xej$d */
    public static final class C18137d {

        /* renamed from: c */
        public static final a f53671c = new a(null);

        /* renamed from: a */
        public final String f53672a;

        /* renamed from: b */
        public final String f53673b;

        /* renamed from: o.xej$d$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C18137d(String str, String str2) {
            sq8.m48649h(str, ImagesContract.LOCAL);
            this.f53672a = str;
            this.f53673b = str2;
        }

        /* renamed from: a */
        public final String m56200a() {
            return this.f53672a;
        }

        /* renamed from: b */
        public final String m56201b() {
            return this.f53673b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18137d)) {
                return false;
            }
            C18137d c18137d = (C18137d) obj;
            return sq8.m48644c(this.f53672a, c18137d.f53672a) && sq8.m48644c(this.f53673b, c18137d.f53673b);
        }

        public int hashCode() {
            int iHashCode = this.f53672a.hashCode() * 31;
            String str = this.f53673b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            if (this.f53673b == null) {
                return this.f53672a;
            }
            return this.f53673b + ':' + this.f53672a;
        }

        public /* synthetic */ C18137d(String str, String str2, int i, id5 id5Var) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* renamed from: o.xej$e */
    public static final class C18138e extends xej {

        /* renamed from: a */
        public final int f53674a;

        /* renamed from: b */
        public final String f53675b;

        public C18138e(int i, String str) {
            super(null);
            this.f53674a = i;
            this.f53675b = str;
        }

        /* renamed from: a */
        public int m56202a() {
            return this.f53674a;
        }

        /* renamed from: b */
        public final String m56203b() {
            return this.f53675b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18138e)) {
                return false;
            }
            C18138e c18138e = (C18138e) obj;
            return this.f53674a == c18138e.f53674a && sq8.m48644c(this.f53675b, c18138e.f53675b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f53674a) * 31;
            String str = this.f53675b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f53675b + " (" + m56202a() + ')';
        }
    }

    public xej() {
    }

    public /* synthetic */ xej(id5 id5Var) {
        this();
    }
}
