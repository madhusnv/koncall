package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class i3i {
    /* renamed from: a */
    public static final void m31473a(nl7 nl7Var, Object obj, n64 n64Var) {
        n64 n64VarM40199a = n75.m40199a(n64Var);
        try {
            q74 context = n64VarM40199a.getContext();
            Object objM35820i = kkh.m35820i(context, null);
            try {
                n75.m40200b(n64VarM40199a);
                Object objM50337d = !(nl7Var instanceof vb1) ? tq8.m50337d(nl7Var, obj, n64VarM40199a) : ((nl7) azh.m18052e(nl7Var, 2)).invoke(obj, n64VarM40199a);
                if (objM50337d != uq8.m51918f()) {
                    n64VarM40199a.resumeWith(vre.m53351b(objM50337d));
                }
            } finally {
                kkh.m35817f(context, objM35820i);
            }
        } catch (Throwable th) {
            vre.C17665a c17665a = vre.f50797b;
            n64VarM40199a.resumeWith(vre.m53351b(wre.m54933a(th)));
        }
    }

    /* renamed from: b */
    public static final Object m31474b(f6f f6fVar, Object obj, nl7 nl7Var) {
        Object lm3Var;
        try {
            lm3Var = !(nl7Var instanceof vb1) ? tq8.m50337d(nl7Var, obj, f6fVar) : ((nl7) azh.m18052e(nl7Var, 2)).invoke(obj, f6fVar);
        } catch (Throwable th) {
            lm3Var = new lm3(th, false, 2, null);
        }
        if (lm3Var == uq8.m51918f()) {
            return uq8.m51918f();
        }
        Object objW0 = f6fVar.w0(lm3Var);
        if (objW0 == e79.f21109b) {
            return uq8.m51918f();
        }
        if (objW0 instanceof lm3) {
            throw ((lm3) objW0).f34036a;
        }
        return e79.m24481h(objW0);
    }

    /* renamed from: c */
    public static final Object m31475c(f6f f6fVar, Object obj, nl7 nl7Var) throws Throwable {
        Object lm3Var;
        try {
            lm3Var = !(nl7Var instanceof vb1) ? tq8.m50337d(nl7Var, obj, f6fVar) : ((nl7) azh.m18052e(nl7Var, 2)).invoke(obj, f6fVar);
        } catch (Throwable th) {
            lm3Var = new lm3(th, false, 2, null);
        }
        if (lm3Var == uq8.m51918f()) {
            return uq8.m51918f();
        }
        Object objW0 = f6fVar.w0(lm3Var);
        if (objW0 == e79.f21109b) {
            return uq8.m51918f();
        }
        if (objW0 instanceof lm3) {
            Throwable th2 = ((lm3) objW0).f34036a;
            if (((th2 instanceof omh) && ((omh) th2).f38602a == f6fVar) ? false : true) {
                throw th2;
            }
            if (lm3Var instanceof lm3) {
                throw ((lm3) lm3Var).f34036a;
            }
        } else {
            lm3Var = e79.m24481h(objW0);
        }
        return lm3Var;
    }
}
