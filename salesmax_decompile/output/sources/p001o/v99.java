package p001o;

/* loaded from: classes6.dex */
public interface v99 {

    /* renamed from: a */
    public static final C17534a f50035a = C17534a.f50036a;

    /* renamed from: o.v99$a */
    public static final class C17534a {

        /* renamed from: a */
        public static final /* synthetic */ C17534a f50036a = new C17534a();

        /* renamed from: b */
        public static final v99 f50037b = new b();

        /* renamed from: c */
        public static final v99 f50038c = new a();

        /* renamed from: o.v99$a$a */
        public static final class a implements v99 {
            @Override // p001o.v99
            /* renamed from: a */
            public String mo52468a(uef uefVar, int i, String str) {
                sq8.m48649h(uefVar, "descriptor");
                sq8.m48649h(str, "serialName");
                return C17534a.f50036a.m52470b(str, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* renamed from: o.v99$a$b */
        public static final class b implements v99 {
            @Override // p001o.v99
            /* renamed from: a */
            public String mo52468a(uef uefVar, int i, String str) {
                sq8.m48649h(uefVar, "descriptor");
                sq8.m48649h(str, "serialName");
                return C17534a.f50036a.m52470b(str, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        /* renamed from: b */
        public final String m52470b(String str, char c) {
            StringBuilder sb = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    if (i == 0) {
                        if ((sb.length() > 0) && h9g.i1(sb) != c) {
                            sb.append(c);
                        }
                    }
                    if (chValueOf != null) {
                        sb.append(chValueOf.charValue());
                    }
                    i++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i > 1 && Character.isLetter(cCharAt)) {
                            sb.append(c);
                        }
                        sb.append(chValueOf);
                        chValueOf = null;
                        i = 0;
                    }
                    sb.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb.append(chValueOf);
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }

        /* renamed from: c */
        public final v99 m52471c() {
            return f50037b;
        }
    }

    /* renamed from: a */
    String mo52468a(uef uefVar, int i, String str);
}
