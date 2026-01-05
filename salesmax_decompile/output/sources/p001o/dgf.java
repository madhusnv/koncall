package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class dgf {

    /* renamed from: a */
    public static final C12908d f19804a = new C12908d(null);

    /* renamed from: b */
    public static final List f19805b = ch3.m21249n(C12905a.f19806c, C12906b.f19808c, C12907c.f19810c);

    /* renamed from: o.dgf$a */
    public static final class C12905a extends dgf {

        /* renamed from: c */
        public static final C12905a f19806c = new C12905a();

        /* renamed from: d */
        public static final String f19807d = "AES256";

        public C12905a() {
            super(null);
        }

        @Override // p001o.dgf
        /* renamed from: a */
        public String mo23074a() {
            return f19807d;
        }

        public String toString() {
            return "Aes256";
        }
    }

    /* renamed from: o.dgf$b */
    public static final class C12906b extends dgf {

        /* renamed from: c */
        public static final C12906b f19808c = new C12906b();

        /* renamed from: d */
        public static final String f19809d = "aws:kms";

        public C12906b() {
            super(null);
        }

        @Override // p001o.dgf
        /* renamed from: a */
        public String mo23074a() {
            return f19809d;
        }

        public String toString() {
            return "AwsKms";
        }
    }

    /* renamed from: o.dgf$c */
    public static final class C12907c extends dgf {

        /* renamed from: c */
        public static final C12907c f19810c = new C12907c();

        /* renamed from: d */
        public static final String f19811d = "aws:kms:dsse";

        public C12907c() {
            super(null);
        }

        @Override // p001o.dgf
        /* renamed from: a */
        public String mo23074a() {
            return f19811d;
        }

        public String toString() {
            return "AwsKmsDsse";
        }
    }

    /* renamed from: o.dgf$d */
    public static final class C12908d {
        public C12908d() {
        }

        public /* synthetic */ C12908d(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final dgf m23075a(String str) {
            sq8.m48649h(str, "value");
            int iHashCode = str.hashCode();
            if (iHashCode != -591548076) {
                if (iHashCode != 769689991) {
                    if (iHashCode == 1927140164 && str.equals("AES256")) {
                        return C12905a.f19806c;
                    }
                } else if (str.equals("aws:kms:dsse")) {
                    return C12907c.f19810c;
                }
            } else if (str.equals("aws:kms")) {
                return C12906b.f19808c;
            }
            return new C12909e(str);
        }
    }

    /* renamed from: o.dgf$e */
    public static final class C12909e extends dgf {

        /* renamed from: c */
        public final String f19812c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12909e(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f19812c = str;
        }

        @Override // p001o.dgf
        /* renamed from: a */
        public String mo23074a() {
            return this.f19812c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12909e) && sq8.m48644c(this.f19812c, ((C12909e) obj).f19812c);
        }

        public int hashCode() {
            return this.f19812c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo23074a() + ')';
        }
    }

    public dgf() {
    }

    public /* synthetic */ dgf(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo23074a();
}
