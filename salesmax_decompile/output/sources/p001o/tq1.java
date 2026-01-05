package p001o;

import p001o.oq1;

/* loaded from: classes3.dex */
public abstract class tq1 {

    /* renamed from: o.tq1$a */
    public static final class C17185a extends o64 {

        /* renamed from: a */
        public Object f47597a;

        /* renamed from: b */
        public /* synthetic */ Object f47598b;

        /* renamed from: c */
        public int f47599c;

        public C17185a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f47598b = obj;
            this.f47599c |= Integer.MIN_VALUE;
            return tq1.m50333a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m50333a(oq1 oq1Var, n64 n64Var) {
        C17185a c17185a;
        y6f y6fVarMo39992c;
        if (n64Var instanceof C17185a) {
            c17185a = (C17185a) n64Var;
            int i = c17185a.f47599c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17185a.f47599c = i - Integer.MIN_VALUE;
            } else {
                c17185a = new C17185a(n64Var);
            }
        }
        Object objM31738a = c17185a.f47598b;
        Object objM51918f = uq8.m51918f();
        int i2 = c17185a.f47599c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objM31738a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y6fVarMo39992c = (y6f) c17185a.f47597a;
            wre.m54934b(objM31738a);
            byte[] bArrMo49492m = ((t6f) objM31738a).mo49492m();
            if (y6fVarMo39992c.isClosedForRead()) {
                throw new IllegalStateException("failed to read all bytes from ByteStream, more data still expected".toString());
            }
            return bArrMo49492m;
        }
        wre.m54934b(objM31738a);
        if (oq1Var instanceof oq1.AbstractC15863a) {
            return ((oq1.AbstractC15863a) oq1Var).mo39990c();
        }
        if (!(oq1Var instanceof oq1.AbstractC15864b)) {
            if (!(oq1Var instanceof oq1.AbstractC15866d)) {
                throw new szb();
            }
            h8f h8fVarMo39993c = ((oq1.AbstractC15866d) oq1Var).mo39993c();
            c17185a.f47599c = 2;
            objM31738a = i8f.m31738a(h8fVarMo39993c, c17185a);
            return objM31738a == objM51918f ? objM51918f : objM31738a;
        }
        y6fVarMo39992c = ((oq1.AbstractC15864b) oq1Var).mo39992c();
        c17185a.f47597a = y6fVarMo39992c;
        c17185a.f47599c = 1;
        objM31738a = z6f.m58853c(y6fVarMo39992c, c17185a);
        if (objM31738a == objM51918f) {
            return objM51918f;
        }
        byte[] bArrMo49492m2 = ((t6f) objM31738a).mo49492m();
        if (y6fVarMo39992c.isClosedForRead()) {
        }
    }
}
