package p001o;

/* loaded from: classes3.dex */
public class kj6 {

    /* renamed from: b */
    public static final C14845a f32297b = new C14845a(null);

    /* renamed from: c */
    public static final kx0 f32298c = new kx0("aws.smithy.kotlin#Retryable");

    /* renamed from: d */
    public static final kx0 f32299d = new kx0("aws.smithy.kotlin#ThrottlingError");

    /* renamed from: a */
    public final tob f32300a = tx0.m50740e();

    /* renamed from: o.kj6$a */
    public static final class C14845a {
        public C14845a() {
        }

        public /* synthetic */ C14845a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kx0 m35775a() {
            return kj6.f32298c;
        }

        /* renamed from: b */
        public final kx0 m35776b() {
            return kj6.f32299d;
        }
    }

    /* renamed from: c */
    public final tob m35772c() {
        return this.f32300a;
    }

    /* renamed from: d */
    public final boolean m35773d() {
        Boolean bool = (Boolean) this.f32300a.mo18191b(f32298c);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m35774e() {
        Boolean bool = (Boolean) this.f32300a.mo18191b(f32299d);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
