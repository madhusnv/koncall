package p001o;

import java.util.Optional;

/* loaded from: classes.dex */
public interface i96 {

    /* renamed from: o.i96$a */
    public static final class C14225a {

        /* renamed from: o.i96$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f28270a;

            /* renamed from: b */
            public Object f28271b;

            /* renamed from: c */
            public /* synthetic */ Object f28272c;

            /* renamed from: d */
            public int f28273d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f28272c = obj;
                this.f28273d |= Integer.MIN_VALUE;
                return C14225a.m31773a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m31773a(i96 i96Var, h96 h96Var, n64 n64Var) throws NumberFormatException {
            a aVar;
            Optional optionalEmpty;
            i96 i96Var2;
            h96 h96Var2;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f28273d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f28273d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object objMo31764a = aVar.f28272c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f28273d;
            if (i2 == 0) {
                wre.m54934b(objMo31764a);
                String strM30016t = h96Var.m30016t();
                if (strM30016t != null) {
                    long j = Long.parseLong(strM30016t);
                    aVar.f28270a = i96Var;
                    aVar.f28271b = h96Var;
                    aVar.f28273d = 1;
                    objMo31764a = i96Var.mo31764a(j, aVar);
                    if (objMo31764a == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    optionalEmpty = null;
                    if (optionalEmpty != null) {
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(objMo31764a);
                        long jLongValue = ((Number) objMo31764a).longValue();
                        Optional optionalOf = jLongValue <= 0 ? Optional.of(ml1.m39305e(jLongValue)) : Optional.empty();
                        sq8.m48646e(optionalOf);
                        return optionalOf;
                    }
                    h96Var2 = (h96) aVar.f28271b;
                    i96Var2 = (i96) aVar.f28270a;
                    wre.m54934b(objMo31764a);
                    long jLongValue2 = ((Number) objMo31764a).longValue();
                    optionalEmpty = jLongValue2 <= 0 ? Optional.of(ml1.m39305e(jLongValue2)) : Optional.empty();
                    i96 i96Var3 = i96Var2;
                    h96Var = h96Var2;
                    i96Var = i96Var3;
                    if (optionalEmpty != null) {
                        return optionalEmpty;
                    }
                    aVar.f28270a = null;
                    aVar.f28271b = null;
                    aVar.f28273d = 3;
                    objMo31764a = i96Var.mo31768e(h96Var, aVar);
                    if (objMo31764a == objM51918f) {
                        return objM51918f;
                    }
                    long jLongValue3 = ((Number) objMo31764a).longValue();
                    if (jLongValue3 <= 0) {
                    }
                    sq8.m48646e(optionalOf);
                    return optionalOf;
                }
                h96Var = (h96) aVar.f28271b;
                i96Var = (i96) aVar.f28270a;
                wre.m54934b(objMo31764a);
            }
            if (((h96) objMo31764a) == null || (optionalEmpty = Optional.empty()) == null) {
                aVar.f28270a = i96Var;
                aVar.f28271b = h96Var;
                aVar.f28273d = 2;
                objMo31764a = i96Var.mo31768e(h96Var, aVar);
                if (objMo31764a == objM51918f) {
                    return objM51918f;
                }
                h96 h96Var3 = h96Var;
                i96Var2 = i96Var;
                h96Var2 = h96Var3;
                long jLongValue22 = ((Number) objMo31764a).longValue();
                if (jLongValue22 <= 0) {
                }
                i96 i96Var32 = i96Var2;
                h96Var = h96Var2;
                i96Var = i96Var32;
            }
            if (optionalEmpty != null) {
            }
        }
    }

    /* renamed from: a */
    Object mo31764a(long j, n64 n64Var);

    /* renamed from: b */
    Object mo31765b(long j, n64 n64Var);

    /* renamed from: c */
    Object mo31766c(h96 h96Var, n64 n64Var);

    /* renamed from: d */
    Object mo31767d(long j, n64 n64Var);

    /* renamed from: e */
    Object mo31768e(h96 h96Var, n64 n64Var);

    /* renamed from: f */
    Object mo31769f(String str, n64 n64Var);

    /* renamed from: g */
    Object mo31770g(h96 h96Var, n64 n64Var);

    /* renamed from: h */
    Object mo31771h(String str, String str2, n64 n64Var);

    /* renamed from: i */
    Object mo31772i(h96 h96Var, n64 n64Var);
}
