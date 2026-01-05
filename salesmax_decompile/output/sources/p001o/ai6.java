package p001o;

import com.google.android.gms.stats.CodePackage;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ai6 {

    /* renamed from: a */
    public static final C12182b f14774a = new C12182b(null);

    /* renamed from: b */
    public static final List f14775b = ch3.m21249n(C12181a.f14776c, C12183c.f14778c, C12184d.f14780c, C12185e.f14782c, C12186f.f14784c, C12187g.f14786c, C12188h.f14788c, C12189i.f14790c, C12191k.f14793c);

    /* renamed from: o.ai6$a */
    public static final class C12181a extends ai6 {

        /* renamed from: c */
        public static final C12181a f14776c = new C12181a();

        /* renamed from: d */
        public static final String f14777d = "COMMERCIAL_ITEM";

        public C12181a() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14777d;
        }

        public String toString() {
            return "CommercialItem";
        }
    }

    /* renamed from: o.ai6$b */
    public static final class C12182b {
        public C12182b() {
        }

        public /* synthetic */ C12182b(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final ai6 m17143a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1938387115:
                    if (str.equals("PERSON")) {
                        return C12188h.f14788c;
                    }
                    break;
                case -1611296843:
                    if (str.equals(CodePackage.LOCATION)) {
                        return C12185e.f14782c;
                    }
                    break;
                case -798763725:
                    if (str.equals("ORGANIZATION")) {
                        return C12186f.f14784c;
                    }
                    break;
                case -502377333:
                    if (str.equals("QUANTITY")) {
                        return C12189i.f14790c;
                    }
                    break;
                case 2090926:
                    if (str.equals("DATE")) {
                        return C12183c.f14778c;
                    }
                    break;
                case 66353786:
                    if (str.equals("EVENT")) {
                        return C12184d.f14780c;
                    }
                    break;
                case 75532016:
                    if (str.equals("OTHER")) {
                        return C12187g.f14786c;
                    }
                    break;
                case 79833656:
                    if (str.equals("TITLE")) {
                        return C12191k.f14793c;
                    }
                    break;
                case 159482600:
                    if (str.equals("COMMERCIAL_ITEM")) {
                        return C12181a.f14776c;
                    }
                    break;
            }
            return new C12190j(str);
        }
    }

    /* renamed from: o.ai6$c */
    public static final class C12183c extends ai6 {

        /* renamed from: c */
        public static final C12183c f14778c = new C12183c();

        /* renamed from: d */
        public static final String f14779d = "DATE";

        public C12183c() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14779d;
        }

        public String toString() {
            return "Date";
        }
    }

    /* renamed from: o.ai6$d */
    public static final class C12184d extends ai6 {

        /* renamed from: c */
        public static final C12184d f14780c = new C12184d();

        /* renamed from: d */
        public static final String f14781d = "EVENT";

        public C12184d() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14781d;
        }

        public String toString() {
            return "Event";
        }
    }

    /* renamed from: o.ai6$e */
    public static final class C12185e extends ai6 {

        /* renamed from: c */
        public static final C12185e f14782c = new C12185e();

        /* renamed from: d */
        public static final String f14783d = CodePackage.LOCATION;

        public C12185e() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14783d;
        }

        public String toString() {
            return "Location";
        }
    }

    /* renamed from: o.ai6$f */
    public static final class C12186f extends ai6 {

        /* renamed from: c */
        public static final C12186f f14784c = new C12186f();

        /* renamed from: d */
        public static final String f14785d = "ORGANIZATION";

        public C12186f() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14785d;
        }

        public String toString() {
            return "Organization";
        }
    }

    /* renamed from: o.ai6$g */
    public static final class C12187g extends ai6 {

        /* renamed from: c */
        public static final C12187g f14786c = new C12187g();

        /* renamed from: d */
        public static final String f14787d = "OTHER";

        public C12187g() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14787d;
        }

        public String toString() {
            return "Other";
        }
    }

    /* renamed from: o.ai6$h */
    public static final class C12188h extends ai6 {

        /* renamed from: c */
        public static final C12188h f14788c = new C12188h();

        /* renamed from: d */
        public static final String f14789d = "PERSON";

        public C12188h() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14789d;
        }

        public String toString() {
            return "Person";
        }
    }

    /* renamed from: o.ai6$i */
    public static final class C12189i extends ai6 {

        /* renamed from: c */
        public static final C12189i f14790c = new C12189i();

        /* renamed from: d */
        public static final String f14791d = "QUANTITY";

        public C12189i() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14791d;
        }

        public String toString() {
            return "Quantity";
        }
    }

    /* renamed from: o.ai6$j */
    public static final class C12190j extends ai6 {

        /* renamed from: c */
        public final String f14792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12190j(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f14792c = str;
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return this.f14792c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12190j) && sq8.m48644c(this.f14792c, ((C12190j) obj).f14792c);
        }

        public int hashCode() {
            return this.f14792c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo17142a() + ')';
        }
    }

    /* renamed from: o.ai6$k */
    public static final class C12191k extends ai6 {

        /* renamed from: c */
        public static final C12191k f14793c = new C12191k();

        /* renamed from: d */
        public static final String f14794d = "TITLE";

        public C12191k() {
            super(null);
        }

        @Override // p001o.ai6
        /* renamed from: a */
        public String mo17142a() {
            return f14794d;
        }

        public String toString() {
            return "Title";
        }
    }

    public ai6() {
    }

    public /* synthetic */ ai6(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo17142a();
}
