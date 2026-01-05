package p001o;

/* loaded from: classes3.dex */
public interface tej {

    /* renamed from: o.tej$a */
    public static final class C17073a {
        /* renamed from: a */
        public static /* synthetic */ tej m49796a(tej tejVar, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endTag");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return tejVar.mo35896d(str, str2);
        }

        /* renamed from: b */
        public static /* synthetic */ tej m49797b(tej tejVar, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTag");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return tejVar.mo35894b(str, str2);
        }
    }

    /* renamed from: a */
    byte[] mo35893a();

    /* renamed from: b */
    tej mo35894b(String str, String str2);

    /* renamed from: c */
    void mo35895c(String str, String str2);

    /* renamed from: d */
    tej mo35896d(String str, String str2);

    tej text(String str);
}
