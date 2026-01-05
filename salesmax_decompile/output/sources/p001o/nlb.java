package p001o;

/* loaded from: classes3.dex */
public interface nlb {

    /* renamed from: a */
    public static final C15605a f36997a = C15605a.f36998a;

    /* renamed from: o.nlb$a */
    public static final class C15605a {

        /* renamed from: a */
        public static final /* synthetic */ C15605a f36998a = new C15605a();

        /* renamed from: b */
        public static final nlb f36999b = new a();

        /* renamed from: o.nlb$a$a */
        public static final class a extends u8 {
        }

        /* renamed from: a */
        public final nlb m40754a() {
            return f36999b;
        }
    }

    /* renamed from: o.nlb$b */
    public static final class C15606b {
        /* renamed from: a */
        public static /* synthetic */ void m40755a(nlb nlbVar, long j, qx0 qx0Var, x54 x54Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 2) != 0) {
                qx0Var = tx0.m50736a();
            }
            if ((i & 4) != 0) {
                x54Var = null;
            }
            nlbVar.mo40753a(j, qx0Var, x54Var);
        }
    }

    /* renamed from: a */
    void mo40753a(long j, qx0 qx0Var, x54 x54Var);
}
