package p001o;

/* loaded from: classes6.dex */
public interface nqb {

    /* renamed from: o.nqb$a */
    public static final class C15628a {
        /* renamed from: a */
        public static /* synthetic */ Object m40924a(nqb nqbVar, Object obj, n64 n64Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return nqbVar.mo40922b(obj, n64Var);
        }

        /* renamed from: b */
        public static /* synthetic */ void m40925b(nqb nqbVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            nqbVar.mo40923c(obj);
        }
    }

    /* renamed from: b */
    Object mo40922b(Object obj, n64 n64Var);

    /* renamed from: c */
    void mo40923c(Object obj);
}
