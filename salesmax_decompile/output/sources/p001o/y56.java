package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class y56 {

    /* renamed from: a */
    public static final C18327c f54913a = new C18327c(null);

    /* renamed from: b */
    public static final List f54914b = ch3.m21249n(C18325a.f54915c, C18326b.f54917c, C18328d.f54919c, C18329e.f54921c, C18330f.f54923c, C18331g.f54925c, C18332h.f54927c, C18334j.f54930c, C18335k.f54932c);

    /* renamed from: o.y56$a */
    public static final class C18325a extends y56 {

        /* renamed from: c */
        public static final C18325a f54915c = new C18325a();

        /* renamed from: d */
        public static final String f54916d = "ANGRY";

        public C18325a() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54916d;
        }

        public String toString() {
            return "Angry";
        }
    }

    /* renamed from: o.y56$b */
    public static final class C18326b extends y56 {

        /* renamed from: c */
        public static final C18326b f54917c = new C18326b();

        /* renamed from: d */
        public static final String f54918d = "CALM";

        public C18326b() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54918d;
        }

        public String toString() {
            return "Calm";
        }
    }

    /* renamed from: o.y56$c */
    public static final class C18327c {
        public C18327c() {
        }

        public /* synthetic */ C18327c(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final y56 m57228a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1509597540:
                    if (str.equals("DISGUSTED")) {
                        return C18329e.f54921c;
                    }
                    break;
                case 81846:
                    if (str.equals("SAD")) {
                        return C18332h.f54927c;
                    }
                    break;
                case 2060895:
                    if (str.equals("CALM")) {
                        return C18326b.f54917c;
                    }
                    break;
                case 2153776:
                    if (str.equals("FEAR")) {
                        return C18330f.f54923c;
                    }
                    break;
                case 62423425:
                    if (str.equals("ANGRY")) {
                        return C18325a.f54915c;
                    }
                    break;
                case 68509376:
                    if (str.equals("HAPPY")) {
                        return C18331g.f54925c;
                    }
                    break;
                case 202856673:
                    if (str.equals("CONFUSED")) {
                        return C18328d.f54919c;
                    }
                    break;
                case 249333371:
                    if (str.equals("SURPRISED")) {
                        return C18334j.f54930c;
                    }
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        return C18335k.f54932c;
                    }
                    break;
            }
            return new C18333i(str);
        }
    }

    /* renamed from: o.y56$d */
    public static final class C18328d extends y56 {

        /* renamed from: c */
        public static final C18328d f54919c = new C18328d();

        /* renamed from: d */
        public static final String f54920d = "CONFUSED";

        public C18328d() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54920d;
        }

        public String toString() {
            return "Confused";
        }
    }

    /* renamed from: o.y56$e */
    public static final class C18329e extends y56 {

        /* renamed from: c */
        public static final C18329e f54921c = new C18329e();

        /* renamed from: d */
        public static final String f54922d = "DISGUSTED";

        public C18329e() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54922d;
        }

        public String toString() {
            return "Disgusted";
        }
    }

    /* renamed from: o.y56$f */
    public static final class C18330f extends y56 {

        /* renamed from: c */
        public static final C18330f f54923c = new C18330f();

        /* renamed from: d */
        public static final String f54924d = "FEAR";

        public C18330f() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54924d;
        }

        public String toString() {
            return "Fear";
        }
    }

    /* renamed from: o.y56$g */
    public static final class C18331g extends y56 {

        /* renamed from: c */
        public static final C18331g f54925c = new C18331g();

        /* renamed from: d */
        public static final String f54926d = "HAPPY";

        public C18331g() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54926d;
        }

        public String toString() {
            return "Happy";
        }
    }

    /* renamed from: o.y56$h */
    public static final class C18332h extends y56 {

        /* renamed from: c */
        public static final C18332h f54927c = new C18332h();

        /* renamed from: d */
        public static final String f54928d = "SAD";

        public C18332h() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54928d;
        }

        public String toString() {
            return "Sad";
        }
    }

    /* renamed from: o.y56$i */
    public static final class C18333i extends y56 {

        /* renamed from: c */
        public final String f54929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18333i(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f54929c = str;
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return this.f54929c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18333i) && sq8.m48644c(this.f54929c, ((C18333i) obj).f54929c);
        }

        public int hashCode() {
            return this.f54929c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo57227a() + ')';
        }
    }

    /* renamed from: o.y56$j */
    public static final class C18334j extends y56 {

        /* renamed from: c */
        public static final C18334j f54930c = new C18334j();

        /* renamed from: d */
        public static final String f54931d = "SURPRISED";

        public C18334j() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54931d;
        }

        public String toString() {
            return "Surprised";
        }
    }

    /* renamed from: o.y56$k */
    public static final class C18335k extends y56 {

        /* renamed from: c */
        public static final C18335k f54932c = new C18335k();

        /* renamed from: d */
        public static final String f54933d = "UNKNOWN";

        public C18335k() {
            super(null);
        }

        @Override // p001o.y56
        /* renamed from: a */
        public String mo57227a() {
            return f54933d;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public y56() {
    }

    public /* synthetic */ y56(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo57227a();
}
