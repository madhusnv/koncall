package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public interface yqh {

    /* renamed from: o.yqh$a */
    public static final class C18465a implements yqh {

        /* renamed from: a */
        public final String f55825a;

        public C18465a(String str) {
            sq8.m48649h(str, "value");
            this.f55825a = str;
        }

        /* renamed from: a */
        public final String m58119a() {
            return this.f55825a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18465a) && sq8.m48644c(this.f55825a, ((C18465a) obj).f55825a);
        }

        public int hashCode() {
            return this.f55825a.hashCode();
        }

        public String toString() {
            return "Continuation(value=" + this.f55825a + ')';
        }
    }

    /* renamed from: o.yqh$b */
    public static final class C18466b implements yqh {

        /* renamed from: a */
        public final String f55826a;

        /* renamed from: b */
        public final String f55827b;

        public C18466b(String str, String str2) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            this.f55826a = str;
            this.f55827b = str2;
        }

        /* renamed from: a */
        public final String m58120a() {
            return this.f55826a;
        }

        /* renamed from: b */
        public final String m58121b() {
            return this.f55827b;
        }

        /* renamed from: c */
        public boolean m58122c() {
            return cih.m21308b(this.f55826a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18466b)) {
                return false;
            }
            C18466b c18466b = (C18466b) obj;
            return sq8.m48644c(this.f55826a, c18466b.f55826a) && sq8.m48644c(this.f55827b, c18466b.f55827b);
        }

        public int hashCode() {
            return (this.f55826a.hashCode() * 31) + this.f55827b.hashCode();
        }

        public String toString() {
            return "Property(key=" + this.f55826a + ", value=" + this.f55827b + ')';
        }
    }

    /* renamed from: o.yqh$c */
    public static final class C18467c implements yqh {

        /* renamed from: a */
        public final String f55828a;

        /* renamed from: b */
        public final wq3 f55829b;

        /* renamed from: c */
        public final boolean f55830c;

        /* renamed from: d */
        public final boolean f55831d;

        public C18467c(String str, wq3 wq3Var, boolean z, boolean z2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(wq3Var, "type");
            this.f55828a = str;
            this.f55829b = wq3Var;
            this.f55830c = z;
            this.f55831d = z2;
        }

        /* renamed from: a */
        public final boolean m58123a() {
            return this.f55830c;
        }

        /* renamed from: b */
        public final String m58124b() {
            return this.f55828a;
        }

        /* renamed from: c */
        public final wq3 m58125c() {
            return this.f55829b;
        }

        /* renamed from: d */
        public boolean m58126d() {
            return this.f55831d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18467c)) {
                return false;
            }
            C18467c c18467c = (C18467c) obj;
            return sq8.m48644c(this.f55828a, c18467c.f55828a) && this.f55829b == c18467c.f55829b && this.f55830c == c18467c.f55830c && this.f55831d == c18467c.f55831d;
        }

        public int hashCode() {
            return (((((this.f55828a.hashCode() * 31) + this.f55829b.hashCode()) * 31) + Boolean.hashCode(this.f55830c)) * 31) + Boolean.hashCode(this.f55831d);
        }

        public String toString() {
            return "Section(name=" + this.f55828a + ", type=" + this.f55829b + ", hasSectionPrefix=" + this.f55830c + ", isValid=" + this.f55831d + ')';
        }
    }

    /* renamed from: o.yqh$d */
    public static final class C18468d implements yqh {

        /* renamed from: a */
        public final String f55832a;

        /* renamed from: b */
        public final String f55833b;

        public C18468d(String str, String str2) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            this.f55832a = str;
            this.f55833b = str2;
        }

        /* renamed from: a */
        public final String m58127a() {
            return this.f55832a;
        }

        /* renamed from: b */
        public final String m58128b() {
            return this.f55833b;
        }

        /* renamed from: c */
        public boolean m58129c() {
            return cih.m21308b(this.f55832a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18468d)) {
                return false;
            }
            C18468d c18468d = (C18468d) obj;
            return sq8.m48644c(this.f55832a, c18468d.f55832a) && sq8.m48644c(this.f55833b, c18468d.f55833b);
        }

        public int hashCode() {
            return (this.f55832a.hashCode() * 31) + this.f55833b.hashCode();
        }

        public String toString() {
            return "SubProperty(key=" + this.f55832a + ", value=" + this.f55833b + ')';
        }
    }
}
