package p001o;

import java.util.Set;
import p001o.kj6;
import p001o.s48;
import p001o.w79;

/* loaded from: classes2.dex */
public abstract class y26 {

    /* renamed from: a */
    public static final xv8 f54741a;

    /* renamed from: b */
    public static final xv8 f54742b;

    /* renamed from: c */
    public static final aw8 f54743c;

    /* renamed from: d */
    public static final Set f54744d;

    /* renamed from: o.y26$a */
    public static final class C18300a extends o64 {

        /* renamed from: a */
        public Object f54745a;

        /* renamed from: b */
        public /* synthetic */ Object f54746b;

        /* renamed from: c */
        public int f54747c;

        public C18300a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f54746b = obj;
            this.f54747c |= Integer.MIN_VALUE;
            return y26.m57132d(null, this);
        }
    }

    /* renamed from: o.y26$b */
    public static final class C18301b extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f54748a;

        /* renamed from: b */
        public int f54749b;

        public C18301b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f54748a = obj;
            this.f54749b |= Integer.MIN_VALUE;
            return y26.m57133e(null, this);
        }
    }

    static {
        xv8 xv8Var = new xv8((byte) -87, (byte) -2, (byte) -86, (byte) 2, null);
        f54741a = xv8Var;
        xv8 xv8Var2 = new xv8((byte) -87, (byte) -2, (byte) -86, (byte) 23, null);
        f54742b = xv8Var2;
        aw8 aw8Var = new aw8((short) -768, (short) 3778, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 35, null, 256, null);
        f54743c = aw8Var;
        f54744d = nif.m40668i(xv8.f54353c.m56863a(), aw8.f15299f.m17907a(), xv8Var, xv8Var2, aw8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m57132d(g48 g48Var, n64 n64Var) {
        C18300a c18300a;
        String str;
        if (n64Var instanceof C18300a) {
            c18300a = (C18300a) n64Var;
            int i = c18300a.f54747c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18300a.f54747c = i - Integer.MIN_VALUE;
            } else {
                c18300a = new C18300a(n64Var);
            }
        }
        Object objM57133e = c18300a.f54746b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18300a.f54747c;
        boolean z = true;
        if (i2 == 0) {
            wre.m54934b(objM57133e);
            c18300a.f54745a = g48Var;
            c18300a.f54747c = 1;
            objM57133e = m57133e(g48Var, c18300a);
            if (objM57133e == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g48Var = (g48) c18300a.f54745a;
            wre.m54934b(objM57133e);
        }
        w79.C17793a c17793a = (w79.C17793a) objM57133e;
        if (c17793a != null) {
            str = "code=" + c17793a.m54036a() + "; message=" + c17793a.m54037b();
            if (str == null) {
                str = "HTTP " + g48Var.getStatus();
            }
        }
        sc4 sc4Var = new sc4("Error retrieving credentials from container service: " + str, null, 2, null);
        tob tobVarM35772c = sc4Var.mo34658a().m35772c();
        kj6.C14845a c14845a = kj6.f32297b;
        tobVarM35772c.mo34002p(c14845a.m35776b(), ml1.m39301a(sq8.m48644c(g48Var.getStatus(), s48.f44774c.m47792X())));
        tob tobVarM35772c2 = sc4Var.mo34658a().m35772c();
        kx0 kx0VarM35775a = c14845a.m35775a();
        if (!sc4Var.mo34658a().m35774e() && t48.m49281b(g48Var.getStatus()) != s48.EnumC16739a.SERVER_ERROR) {
            z = false;
        }
        tobVarM35772c2.mo34002p(kx0VarM35775a, ml1.m39301a(z));
        throw sc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m57133e(g48 g48Var, n64 n64Var) {
        C18301b c18301b;
        if (n64Var instanceof C18301b) {
            c18301b = (C18301b) n64Var;
            int i = c18301b.f54749b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18301b.f54749b = i - Integer.MIN_VALUE;
            } else {
                c18301b = new C18301b(n64Var);
            }
        }
        Object objM39980a = c18301b.f54748a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18301b.f54749b;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            if (!sq8.m48644c(g48Var.getHeaders().get("Content-Type"), "application/json")) {
                return null;
            }
            m18 body = g48Var.getBody();
            c18301b.f54749b = 1;
            objM39980a = n18.m39980a(body, c18301b);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objM39980a);
                if (objM39980a instanceof w79.C17793a) {
                    return null;
                }
                return (w79.C17793a) objM39980a;
            }
            wre.m54934b(objM39980a);
        }
        byte[] bArr = (byte[]) objM39980a;
        if (bArr == null) {
            return null;
        }
        i89 i89Var = new i89(bArr);
        c18301b.f54749b = 2;
        objM39980a = v79.m52407a(i89Var, c18301b);
        if (objM39980a == objM51918f) {
            return objM51918f;
        }
        if (objM39980a instanceof w79.C17793a) {
        }
    }
}
