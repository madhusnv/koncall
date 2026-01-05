package p001o;

/* loaded from: classes2.dex */
public abstract class vne {

    /* renamed from: o.vne$a */
    public static final class C17626a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f50599a;

        /* renamed from: b */
        public int f50600b;

        public C17626a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f50599a = obj;
            this.f50600b |= Integer.MIN_VALUE;
            return vne.m53073a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m53073a(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C17626a c17626a;
        if (n64Var instanceof C17626a) {
            c17626a = (C17626a) n64Var;
            int i = c17626a.f50600b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17626a.f50600b = i - Integer.MIN_VALUE;
            } else {
                c17626a = new C17626a(n64Var);
            }
        }
        Object objMo32174a = c17626a.f50599a;
        Object objM51918f = uq8.m51918f();
        int i2 = c17626a.f50600b;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            String str = (String) bj6.m19237f(o81.f37890a.m41730c(), r9dVar);
            if (str != null) {
                return str;
            }
            c17626a.f50600b = 1;
            objMo32174a = ii9Var.mo32174a(c17626a);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        return j81.m33407m((vq3) objMo32174a);
    }
}
