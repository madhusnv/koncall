package p001o;

import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class tyc {

    /* renamed from: a */
    public static final C17257f f48050a = new C17257f(null);

    /* renamed from: b */
    public static final List f48051b = ch3.m21249n(C17252a.f48052c, C17253b.f48054c, C17254c.f48056c, C17255d.f48058c, C17256e.f48060c, C17258g.f48062c, C17259h.f48064c, C17260i.f48066c, C17261j.f48068c, C17262k.f48070c, C17263l.f48072c, C17264m.f48074c, C17265n.f48076c, C17266o.f48078c, C17267p.f48080c, C17268q.f48082c, C17270s.f48085c, C17271t.f48087c);

    /* renamed from: o.tyc$a */
    public static final class C17252a extends tyc {

        /* renamed from: c */
        public static final C17252a f48052c = new C17252a();

        /* renamed from: d */
        public static final String f48053d = "ADJ";

        public C17252a() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48053d;
        }

        public String toString() {
            return "Adj";
        }
    }

    /* renamed from: o.tyc$b */
    public static final class C17253b extends tyc {

        /* renamed from: c */
        public static final C17253b f48054c = new C17253b();

        /* renamed from: d */
        public static final String f48055d = "ADP";

        public C17253b() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48055d;
        }

        public String toString() {
            return "Adp";
        }
    }

    /* renamed from: o.tyc$c */
    public static final class C17254c extends tyc {

        /* renamed from: c */
        public static final C17254c f48056c = new C17254c();

        /* renamed from: d */
        public static final String f48057d = "ADV";

        public C17254c() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48057d;
        }

        public String toString() {
            return "Adv";
        }
    }

    /* renamed from: o.tyc$d */
    public static final class C17255d extends tyc {

        /* renamed from: c */
        public static final C17255d f48058c = new C17255d();

        /* renamed from: d */
        public static final String f48059d = "AUX";

        public C17255d() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48059d;
        }

        public String toString() {
            return "Aux";
        }
    }

    /* renamed from: o.tyc$e */
    public static final class C17256e extends tyc {

        /* renamed from: c */
        public static final C17256e f48060c = new C17256e();

        /* renamed from: d */
        public static final String f48061d = "CCONJ";

        public C17256e() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48061d;
        }

        public String toString() {
            return "Cconj";
        }
    }

    /* renamed from: o.tyc$f */
    public static final class C17257f {
        public C17257f() {
        }

        public /* synthetic */ C17257f(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final tyc m50787a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case Opcodes.IASTORE /* 79 */:
                    if (str.equals("O")) {
                        return C17263l.f48072c;
                    }
                    break;
                case 64647:
                    if (str.equals("ADJ")) {
                        return C17252a.f48052c;
                    }
                    break;
                case 64653:
                    if (str.equals("ADP")) {
                        return C17253b.f48054c;
                    }
                    break;
                case 64659:
                    if (str.equals("ADV")) {
                        return C17254c.f48056c;
                    }
                    break;
                case 65188:
                    if (str.equals("AUX")) {
                        return C17255d.f48058c;
                    }
                    break;
                case 67571:
                    if (str.equals("DET")) {
                        return C17259h.f48064c;
                    }
                    break;
                case 77670:
                    if (str.equals("NUM")) {
                        return C17262k.f48070c;
                    }
                    break;
                case 82599:
                    if (str.equals("SYM")) {
                        return C17270s.f48085c;
                    }
                    break;
                case 2074408:
                    if (str.equals("CONJ")) {
                        return C17258g.f48062c;
                    }
                    break;
                case 2252379:
                    if (str.equals("INTJ")) {
                        return C17260i.f48066c;
                    }
                    break;
                case 2402330:
                    if (str.equals("NOUN")) {
                        return C17261j.f48068c;
                    }
                    break;
                case 2448371:
                    if (str.equals("PART")) {
                        return C17264m.f48074c;
                    }
                    break;
                case 2464609:
                    if (str.equals("PRON")) {
                        return C17265n.f48076c;
                    }
                    break;
                case 2630943:
                    if (str.equals("VERB")) {
                        return C17271t.f48087c;
                    }
                    break;
                case 63950315:
                    if (str.equals("CCONJ")) {
                        return C17256e.f48060c;
                    }
                    break;
                case 76403019:
                    if (str.equals("PROPN")) {
                        return C17266o.f48078c;
                    }
                    break;
                case 76491034:
                    if (str.equals("PUNCT")) {
                        return C17267p.f48080c;
                    }
                    break;
                case 78726651:
                    if (str.equals("SCONJ")) {
                        return C17268q.f48082c;
                    }
                    break;
            }
            return new C17269r(str);
        }
    }

    /* renamed from: o.tyc$g */
    public static final class C17258g extends tyc {

        /* renamed from: c */
        public static final C17258g f48062c = new C17258g();

        /* renamed from: d */
        public static final String f48063d = "CONJ";

        public C17258g() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48063d;
        }

        public String toString() {
            return "Conj";
        }
    }

    /* renamed from: o.tyc$h */
    public static final class C17259h extends tyc {

        /* renamed from: c */
        public static final C17259h f48064c = new C17259h();

        /* renamed from: d */
        public static final String f48065d = "DET";

        public C17259h() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48065d;
        }

        public String toString() {
            return "Det";
        }
    }

    /* renamed from: o.tyc$i */
    public static final class C17260i extends tyc {

        /* renamed from: c */
        public static final C17260i f48066c = new C17260i();

        /* renamed from: d */
        public static final String f48067d = "INTJ";

        public C17260i() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48067d;
        }

        public String toString() {
            return "Intj";
        }
    }

    /* renamed from: o.tyc$j */
    public static final class C17261j extends tyc {

        /* renamed from: c */
        public static final C17261j f48068c = new C17261j();

        /* renamed from: d */
        public static final String f48069d = "NOUN";

        public C17261j() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48069d;
        }

        public String toString() {
            return "Noun";
        }
    }

    /* renamed from: o.tyc$k */
    public static final class C17262k extends tyc {

        /* renamed from: c */
        public static final C17262k f48070c = new C17262k();

        /* renamed from: d */
        public static final String f48071d = "NUM";

        public C17262k() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48071d;
        }

        public String toString() {
            return "Num";
        }
    }

    /* renamed from: o.tyc$l */
    public static final class C17263l extends tyc {

        /* renamed from: c */
        public static final C17263l f48072c = new C17263l();

        /* renamed from: d */
        public static final String f48073d = "O";

        public C17263l() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48073d;
        }

        public String toString() {
            return "O";
        }
    }

    /* renamed from: o.tyc$m */
    public static final class C17264m extends tyc {

        /* renamed from: c */
        public static final C17264m f48074c = new C17264m();

        /* renamed from: d */
        public static final String f48075d = "PART";

        public C17264m() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48075d;
        }

        public String toString() {
            return "Part";
        }
    }

    /* renamed from: o.tyc$n */
    public static final class C17265n extends tyc {

        /* renamed from: c */
        public static final C17265n f48076c = new C17265n();

        /* renamed from: d */
        public static final String f48077d = "PRON";

        public C17265n() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48077d;
        }

        public String toString() {
            return "Pron";
        }
    }

    /* renamed from: o.tyc$o */
    public static final class C17266o extends tyc {

        /* renamed from: c */
        public static final C17266o f48078c = new C17266o();

        /* renamed from: d */
        public static final String f48079d = "PROPN";

        public C17266o() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48079d;
        }

        public String toString() {
            return "Propn";
        }
    }

    /* renamed from: o.tyc$p */
    public static final class C17267p extends tyc {

        /* renamed from: c */
        public static final C17267p f48080c = new C17267p();

        /* renamed from: d */
        public static final String f48081d = "PUNCT";

        public C17267p() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48081d;
        }

        public String toString() {
            return "Punct";
        }
    }

    /* renamed from: o.tyc$q */
    public static final class C17268q extends tyc {

        /* renamed from: c */
        public static final C17268q f48082c = new C17268q();

        /* renamed from: d */
        public static final String f48083d = "SCONJ";

        public C17268q() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48083d;
        }

        public String toString() {
            return "Sconj";
        }
    }

    /* renamed from: o.tyc$r */
    public static final class C17269r extends tyc {

        /* renamed from: c */
        public final String f48084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17269r(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f48084c = str;
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return this.f48084c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17269r) && sq8.m48644c(this.f48084c, ((C17269r) obj).f48084c);
        }

        public int hashCode() {
            return this.f48084c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo50786a() + ')';
        }
    }

    /* renamed from: o.tyc$s */
    public static final class C17270s extends tyc {

        /* renamed from: c */
        public static final C17270s f48085c = new C17270s();

        /* renamed from: d */
        public static final String f48086d = "SYM";

        public C17270s() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48086d;
        }

        public String toString() {
            return "Sym";
        }
    }

    /* renamed from: o.tyc$t */
    public static final class C17271t extends tyc {

        /* renamed from: c */
        public static final C17271t f48087c = new C17271t();

        /* renamed from: d */
        public static final String f48088d = "VERB";

        public C17271t() {
            super(null);
        }

        @Override // p001o.tyc
        /* renamed from: a */
        public String mo50786a() {
            return f48088d;
        }

        public String toString() {
            return "Verb";
        }
    }

    public tyc() {
    }

    public /* synthetic */ tyc(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo50786a();
}
