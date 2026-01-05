package p001o;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface dv1 {

    /* renamed from: o.dv1$a */
    public static final class C13048a {

        /* renamed from: o.dv1$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f20572a;

            /* renamed from: b */
            public Object f20573b;

            /* renamed from: c */
            public /* synthetic */ Object f20574c;

            /* renamed from: d */
            public int f20575d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f20574c = obj;
                this.f20575d |= Integer.MIN_VALUE;
                return C13048a.m23885b(null, null, this);
            }
        }

        /* renamed from: a */
        public static Object m23884a(dv1 dv1Var, String str, String str2, n64 n64Var) {
            return y3i.f54824a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m23885b(dv1 dv1Var, List list, n64 n64Var) {
            a aVar;
            dv1 dv1Var2;
            Iterator it;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f20575d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f20575d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj = aVar.f20574c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f20575d;
            if (i2 == 0) {
                wre.m54934b(obj);
                Iterator it2 = list.iterator();
                dv1Var2 = dv1Var;
                it = it2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f20573b;
                dv1Var2 = (dv1) aVar.f20572a;
                wre.m54934b(obj);
            }
            while (it.hasNext()) {
                hwc hwcVar = (hwc) it.next();
                String str = (String) hwcVar.m31227a();
                String str2 = (String) hwcVar.m31228b();
                aVar.f20572a = dv1Var2;
                aVar.f20573b = it;
                aVar.f20575d = 1;
                if (dv1Var2.mo23875b(str, str2, aVar) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    Object mo23874a(long j, n64 n64Var);

    /* renamed from: b */
    Object mo23875b(String str, String str2, n64 n64Var);

    /* renamed from: c */
    Object mo23876c(n64 n64Var);

    /* renamed from: d */
    Object mo23877d(long j, n64 n64Var);

    /* renamed from: e */
    Object mo23878e(cv1 cv1Var, n64 n64Var);

    /* renamed from: f */
    Object mo23879f(List list, n64 n64Var);

    /* renamed from: g */
    Object mo23880g(String str, n64 n64Var);

    /* renamed from: h */
    Object mo23881h(String str, boolean z, n64 n64Var);

    /* renamed from: i */
    Object mo23882i(long j, n64 n64Var);

    /* renamed from: j */
    Object mo23883j(List list, n64 n64Var);
}
