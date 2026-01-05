package p001o;

/* loaded from: classes6.dex */
public interface h76 {

    /* renamed from: o.h76$a */
    public static final class C13887a {
        /* renamed from: a */
        public static lo3 m29885a(h76 h76Var, uef uefVar, int i) {
            sq8.m48649h(uefVar, "descriptor");
            return h76Var.mo29876b(uefVar);
        }

        /* renamed from: b */
        public static void m29886b(h76 h76Var) {
        }

        /* renamed from: c */
        public static void m29887c(h76 h76Var, iff iffVar, Object obj) {
            sq8.m48649h(iffVar, "serializer");
            if (iffVar.getDescriptor().mo16760b()) {
                h76Var.mo25649n(iffVar, obj);
            } else if (obj == null) {
                h76Var.mo25650s();
            } else {
                h76Var.mo29872A();
                h76Var.mo25649n(iffVar, obj);
            }
        }

        /* renamed from: d */
        public static void m29888d(h76 h76Var, iff iffVar, Object obj) {
            sq8.m48649h(iffVar, "serializer");
            iffVar.serialize(h76Var, obj);
        }
    }

    /* renamed from: A */
    void mo29872A();

    /* renamed from: B */
    void mo29873B(int i);

    /* renamed from: D */
    lo3 mo29874D(uef uefVar, int i);

    /* renamed from: F */
    void mo29875F(String str);

    /* renamed from: a */
    wff mo25648a();

    /* renamed from: b */
    lo3 mo29876b(uef uefVar);

    /* renamed from: g */
    void mo29877g(double d);

    /* renamed from: h */
    void mo29878h(byte b);

    /* renamed from: m */
    void mo29879m(uef uefVar, int i);

    /* renamed from: n */
    void mo25649n(iff iffVar, Object obj);

    /* renamed from: q */
    void mo29880q(long j);

    /* renamed from: s */
    void mo25650s();

    /* renamed from: t */
    h76 mo25651t(uef uefVar);

    /* renamed from: u */
    void mo29881u(short s);

    /* renamed from: w */
    void mo29882w(boolean z);

    /* renamed from: x */
    void mo29883x(float f);

    /* renamed from: y */
    void mo29884y(char c);
}
