package p001o;

import com.google.android.gms.cast.MediaStatus;
import p001o.hb3;
import p001o.qja;
import p001o.w79;

/* loaded from: classes2.dex */
public final class pid implements qc4 {

    /* renamed from: a */
    public final String f40150a;

    /* renamed from: b */
    public final r9d f40151b;

    /* renamed from: c */
    public final long f40152c;

    /* renamed from: d */
    public final long f40153d;

    /* renamed from: o.pid$a */
    public static final class C16123a extends o64 {

        /* renamed from: a */
        public Object f40154a;

        /* renamed from: b */
        public /* synthetic */ Object f40155b;

        /* renamed from: d */
        public int f40157d;

        public C16123a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f40155b = obj;
            this.f40157d |= Integer.MIN_VALUE;
            return pid.this.resolve(null, this);
        }
    }

    public pid(String str, r9d r9dVar, long j, long j2) {
        sq8.m48649h(str, "credentialProcess");
        sq8.m48649h(r9dVar, "platformProvider");
        this.f40150a = str;
        this.f40151b = r9dVar;
        this.f40152c = j;
        this.f40153d = j2;
    }

    /* renamed from: b */
    public static final String m43748b(int i, String str) {
        return "Command completed with nonzero exit code " + i + ": " + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        C16123a c16123a;
        qja qjaVar;
        if (n64Var instanceof C16123a) {
            c16123a = (C16123a) n64Var;
            int i = c16123a.f40157d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16123a.f40157d = i - Integer.MIN_VALUE;
            } else {
                c16123a = new C16123a(n64Var);
            }
        }
        C16123a c16123a2 = c16123a;
        Object obj = c16123a2.f40155b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16123a2.f40157d;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                q74 context = c16123a2.getContext();
                String strMo26336c = kge.m35689b(pid.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
                String str = this.f40150a;
                r9d r9dVar = this.f40151b;
                long j = this.f40152c;
                long j2 = this.f40153d;
                c16123a2.f40154a = qjaVarM52400e;
                c16123a2.f40157d = 1;
                Object objM32258a = il6.m32258a(str, r9dVar, j, j2, (16 & 16) != 0 ? hb3.C13904a.f26578a : null, c16123a2);
                if (objM32258a == objM51918f) {
                    return objM51918f;
                }
                qjaVar = qjaVarM52400e;
                obj = objM32258a;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qjaVar = (qja) c16123a2.f40154a;
                wre.m54934b(obj);
            }
            hwc hwcVar = (hwc) obj;
            final int iIntValue = ((Number) hwcVar.m31227a()).intValue();
            final String str2 = (String) hwcVar.m31228b();
            if (iIntValue != 0) {
                qja.C16414b.m45551d(qjaVar, null, new uk7() { // from class: o.oid
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return pid.m43748b(iIntValue, str2);
                    }
                }, 1, null);
                throw new sc4("Command completed with nonzero exit code " + iIntValue + ": " + str2, null, 2, null);
            }
            w79 w79VarM52408b = v79.m52408b(new i89(e9g.m24603u(str2)));
            if (!(w79VarM52408b instanceof w79.C17794b)) {
                throw new sc4("Credentials response was not of expected format", null, 2, null);
            }
            w79.C17794b c17794b = (w79.C17794b) w79VarM52408b;
            String strM54038a = c17794b.m54038a();
            String strM54041d = c17794b.m54041d();
            String strM54042e = c17794b.m54042e();
            gk8 gk8VarM54040c = c17794b.m54040c();
            if (gk8VarM54040c == null) {
                gk8VarM54040c = gk8.f25374b.m28962f();
            }
            return mc4.m38705a(strM54038a, strM54041d, strM54042e, gk8VarM54040c, "Process", c17794b.m54039b());
        } catch (Exception e) {
            throw new sc4("Failed to execute command", e);
        }
    }

    public /* synthetic */ pid(String str, r9d r9dVar, long j, long j2, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? r9d.f43250a.m46382a() : r9dVar, (i & 4) != 0 ? MediaStatus.COMMAND_FOLLOW : j, (i & 8) != 0 ? 60000L : j2);
    }
}
