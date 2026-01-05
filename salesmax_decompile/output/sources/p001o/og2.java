package p001o;

/* loaded from: classes6.dex */
public abstract class og2 {
    /* renamed from: b */
    public static final Object m42204b(q74 q74Var, Object obj, Object obj2, nl7 nl7Var, n64 n64Var) {
        Object objM35820i = kkh.m35820i(q74Var, obj2);
        try {
            s2g s2gVar = new s2g(n64Var, q74Var);
            Object objM50337d = !(nl7Var instanceof vb1) ? tq8.m50337d(nl7Var, obj, s2gVar) : ((nl7) azh.m18052e(nl7Var, 2)).invoke(obj, s2gVar);
            kkh.m35817f(q74Var, objM35820i);
            if (objM50337d == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM50337d;
        } catch (Throwable th) {
            kkh.m35817f(q74Var, objM35820i);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m42205c(q74 q74Var, Object obj, Object obj2, nl7 nl7Var, n64 n64Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = kkh.m35818g(q74Var);
        }
        return m42204b(q74Var, obj, obj2, nl7Var, n64Var);
    }

    /* renamed from: d */
    public static final z37 m42206d(z37 z37Var, q74 q74Var) {
        return ((z37Var instanceof aef) || (z37Var instanceof i0c)) ? z37Var : new g3i(z37Var, q74Var);
    }
}
