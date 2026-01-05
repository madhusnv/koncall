package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.iba;
import p001o.qja;
import p001o.te8;

/* loaded from: classes2.dex */
public final class sld implements rb3 {

    /* renamed from: a */
    public final String f45583a;

    /* renamed from: b */
    public final String f45584b;

    /* renamed from: c */
    public final r9d f45585c;

    /* renamed from: d */
    public final t18 f45586d;

    /* renamed from: e */
    public final r71 f45587e;

    /* renamed from: f */
    public final Map f45588f;

    /* renamed from: o.sld$a */
    public /* synthetic */ class C16863a extends dm7 implements xk7 {
        public C16863a(Object obj) {
            super(1, obj, r9d.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            sq8.m48649h(str, "p0");
            return ((r9d) this.receiver).mo26798i(str);
        }
    }

    /* renamed from: o.sld$b */
    public static final class C16864b extends o64 {

        /* renamed from: a */
        public Object f45589a;

        /* renamed from: b */
        public Object f45590b;

        /* renamed from: c */
        public Object f45591c;

        /* renamed from: d */
        public Object f45592d;

        /* renamed from: e */
        public Object f45593e;

        /* renamed from: f */
        public Object f45594f;

        /* renamed from: g */
        public Object f45595g;

        /* renamed from: h */
        public /* synthetic */ Object f45596h;

        /* renamed from: s */
        public int f45598s;

        public C16864b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45596h = obj;
            this.f45598s |= Integer.MIN_VALUE;
            return sld.this.resolve(null, this);
        }
    }

    /* renamed from: o.sld$c */
    public static final class C16865c extends jgg implements xk7 {

        /* renamed from: a */
        public int f45599a;

        /* renamed from: c */
        public final /* synthetic */ vq3 f45601c;

        /* renamed from: d */
        public final /* synthetic */ qx0 f45602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16865c(vq3 vq3Var, qx0 qx0Var, n64 n64Var) {
            super(1, n64Var);
            this.f45601c = vq3Var;
            this.f45602d = qx0Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return sld.this.new C16865c(this.f45601c, this.f45602d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f45599a;
            if (i == 0) {
                wre.m54934b(obj);
                String strM48478t = sld.this.m48478t();
                if (strM48478t != null) {
                    return strM48478t;
                }
                vq3 vq3Var = this.f45601c;
                String strM53203d = vq3Var != null ? vq3.m53203d(vq3Var, TransferTable.COLUMN_REGION, null, 2, null) : null;
                if (strM53203d != null) {
                    return strM53203d;
                }
                String str = (String) this.f45602d.mo18191b(m71.f34915a.m38472b());
                if (str != null) {
                    return str;
                }
                r9d r9dVarM48477s = sld.this.m48477s();
                this.f45599a = 1;
                obj = sne.m48584b(r9dVarM48477s, null, this, 2, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return (String) obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C16865c) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.sld$d */
    public static final class C16866d extends o64 {

        /* renamed from: a */
        public Object f45603a;

        /* renamed from: b */
        public Object f45604b;

        /* renamed from: c */
        public Object f45605c;

        /* renamed from: d */
        public Object f45606d;

        /* renamed from: e */
        public /* synthetic */ Object f45607e;

        /* renamed from: g */
        public int f45609g;

        public C16866d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45607e = obj;
            this.f45609g |= Integer.MIN_VALUE;
            return sld.this.m48474O(null, null, this);
        }
    }

    /* renamed from: o.sld$e */
    public static final class C16867e extends o64 {

        /* renamed from: a */
        public Object f45610a;

        /* renamed from: b */
        public Object f45611b;

        /* renamed from: c */
        public Object f45612c;

        /* renamed from: d */
        public Object f45613d;

        /* renamed from: e */
        public /* synthetic */ Object f45614e;

        /* renamed from: g */
        public int f45616g;

        public C16867e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45614e = obj;
            this.f45616g |= Integer.MIN_VALUE;
            return sld.this.m48475Q(null, null, null, this);
        }
    }

    public sld(String str, String str2, r9d r9dVar, t18 t18Var, r71 r71Var) {
        sq8.m48649h(r9dVar, "platformProvider");
        this.f45583a = str;
        this.f45584b = str2;
        this.f45585c = r9dVar;
        this.f45586d = t18Var;
        this.f45587e = r71Var;
        this.f45588f = isa.m32684k(vyh.m53620a("Environment", new pi6(new C16863a(r9dVar))), vyh.m53620a("Ec2InstanceMetadata", new xe8(str, si9.m48360a(new uk7() { // from class: o.mld
            @Override // p001o.uk7
            public final Object invoke() {
                return sld.m48473u(this.f35656a);
            }
        }), r9dVar, null, 8, null)), vyh.m53620a("EcsContainer", new x26(r9dVar, t18Var)));
    }

    /* renamed from: C */
    public static final y3i m48460C(sld sldVar, te8.C17065a c17065a) {
        sq8.m48649h(c17065a, "$this$ImdsClient");
        c17065a.m49780i(sldVar.f45585c);
        c17065a.m49779h(sldVar.f45586d);
        return y3i.f54824a;
    }

    /* renamed from: D */
    public static final String m48461D(r81 r81Var) {
        return "Loading credentials from profile `" + r81Var.m46332a().m53205b() + '`';
    }

    /* renamed from: H */
    public static final String m48462H(sld sldVar, kld kldVar) {
        return "Resolving credentials from " + sldVar.m48476r(kldVar.m35838a());
    }

    /* renamed from: J */
    public static final String m48463J(iue iueVar) {
        return "Assuming role `" + iueVar.m32851b() + '`';
    }

    /* renamed from: K */
    public static final String m48464K(gge ggeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Obtained credentials from profile; expiration=");
        gk8 gk8VarMo29762c = ((ic4) ggeVar.f25106a).mo29762c();
        sb.append(gk8VarMo29762c != null ? gk8VarMo29762c.m28951d(vmh.ISO_8601) : null);
        return sb.toString();
    }

    /* renamed from: u */
    public static final te8 m48473u(final sld sldVar) {
        return te8.f46926H.m49781a(new xk7() { // from class: o.rld
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return sld.m48460C(this.f43783a, (te8.C17065a) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m48474O(iba ibaVar, ii9 ii9Var, n64 n64Var) {
        C16866d c16866d;
        String str;
        String str2;
        sld sldVar;
        iba ibaVar2 = ibaVar;
        if (n64Var instanceof C16866d) {
            c16866d = (C16866d) n64Var;
            int i = c16866d.f45609g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16866d.f45609g = i - Integer.MIN_VALUE;
            } else {
                c16866d = new C16866d(n64Var);
            }
        }
        Object obj = c16866d.f45607e;
        Object objM51918f = uq8.m51918f();
        int i2 = c16866d.f45609g;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (ibaVar2 instanceof iba.C14234c) {
                iba.C14234c c14234c = (iba.C14234c) ibaVar2;
                qc4 qc4Var = (qc4) this.f45588f.get(c14234c.m31825a());
                if (qc4Var != null) {
                    return qc4Var;
                }
                throw new n2e("unknown credentials source: " + c14234c.m31825a(), null, 2, null);
            }
            if (ibaVar2 instanceof iba.C14232a) {
                return new j5g(((iba.C14232a) ibaVar2).m31820a());
            }
            if (!(ibaVar2 instanceof iba.C14237f)) {
                if (ibaVar2 instanceof iba.C14236e) {
                    iba.C14236e c14236e = (iba.C14236e) ibaVar2;
                    return new u1g(c14236e.m31827a(), c14236e.m31829c(), c14236e.m31831e(), c14236e.m31828b(), c14236e.m31830d(), this.f45586d, this.f45585c, null, 128, null);
                }
                if (ibaVar2 instanceof iba.C14233b) {
                    iba.C14233b c14233b = (iba.C14233b) ibaVar2;
                    return new u1g(c14233b.m31821a(), c14233b.m31823c(), c14233b.m31824d(), c14233b.m31822b(), null, this.f45586d, this.f45585c, null, Opcodes.D2F, null);
                }
                if (ibaVar2 instanceof iba.C14235d) {
                    return new pid(((iba.C14235d) ibaVar2).m31826a(), null, 0L, 0L, 14, null);
                }
                throw new szb();
            }
            iba.C14237f c14237f = (iba.C14237f) ibaVar2;
            String strM31832a = c14237f.m31832a();
            String strM31834c = c14237f.m31834c();
            c16866d.f45603a = this;
            c16866d.f45604b = ibaVar2;
            c16866d.f45605c = strM31832a;
            c16866d.f45606d = strM31834c;
            c16866d.f45609g = 1;
            Object objMo32174a = ii9Var.mo32174a(c16866d);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
            str = strM31834c;
            obj = objMo32174a;
            str2 = strM31832a;
            sldVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) c16866d.f45606d;
            String str4 = (String) c16866d.f45605c;
            iba ibaVar3 = (iba) c16866d.f45604b;
            sld sldVar2 = (sld) c16866d.f45603a;
            wre.m54934b(obj);
            str = str3;
            ibaVar2 = ibaVar3;
            sldVar = sldVar2;
            str2 = str4;
        }
        return new iag(str2, str, (String) obj, ((iba.C14237f) ibaVar2).m31833b(), 0L, sldVar.f45585c, sldVar.f45586d, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r20v0, types: [o.ii9] */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.qc4] */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m48475Q(iue iueVar, ic4 ic4Var, ii9 ii9Var, n64 n64Var) {
        C16867e c16867e;
        String str;
        j5g j5gVar;
        iue iueVar2;
        sld sldVar;
        if (n64Var instanceof C16867e) {
            c16867e = (C16867e) n64Var;
            int i = c16867e.f45616g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16867e.f45616g = i - Integer.MIN_VALUE;
            } else {
                c16867e = new C16867e(n64Var);
            }
        }
        Object obj = c16867e.f45614e;
        Object objM51918f = uq8.m51918f();
        int i2 = c16867e.f45616g;
        if (i2 == 0) {
            wre.m54934b(obj);
            j5g j5gVar2 = new j5g(ic4Var);
            String strM32851b = iueVar.m32851b();
            c16867e.f45610a = this;
            c16867e.f45611b = iueVar;
            c16867e.f45612c = j5gVar2;
            c16867e.f45613d = strM32851b;
            c16867e.f45616g = 1;
            Object objMo32174a = ii9Var.mo32174a(c16867e);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
            str = strM32851b;
            obj = objMo32174a;
            j5gVar = j5gVar2;
            iueVar2 = iueVar;
            sldVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) c16867e.f45613d;
            ?? r4 = (qc4) c16867e.f45612c;
            iueVar2 = (iue) c16867e.f45611b;
            sldVar = (sld) c16867e.f45610a;
            wre.m54934b(obj);
            str = str2;
            j5gVar = r4;
        }
        return new u9g(j5gVar, str, (String) obj, iueVar2.m32852c(), iueVar2.m32850a(), 0L, sldVar.f45586d, 32, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator it = this.f45588f.entrySet().iterator();
        while (it.hasNext()) {
            ub3.m51325a(((Map.Entry) it.next()).getValue());
        }
    }

    /* renamed from: r */
    public final String m48476r(iba ibaVar) {
        if (ibaVar instanceof iba.C14234c) {
            return "named source " + ((iba.C14234c) ibaVar).m31825a();
        }
        if (ibaVar instanceof iba.C14232a) {
            return "static credentials";
        }
        if (ibaVar instanceof iba.C14237f) {
            return "web identity token";
        }
        if (ibaVar instanceof iba.C14236e) {
            return "single sign-on (session)";
        }
        if (ibaVar instanceof iba.C14233b) {
            return "single sign-on (legacy)";
        }
        if (ibaVar instanceof iba.C14235d) {
            return "process";
        }
        throw new szb();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01be -> B:51:0x01bf). Please report as a decompilation issue!!! */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) throws Throwable {
        C16864b c16864b;
        sld sldVar;
        qx0 qx0Var2;
        qja qjaVar;
        final sld sldVar2;
        qja qjaVar2;
        ii9 ii9Var;
        final kld kldVar;
        qx0 qx0Var3;
        final gge ggeVar;
        ii9 ii9Var2;
        gge ggeVar2;
        Iterator it;
        ii9 ii9Var3;
        Iterator it2;
        gge ggeVar3;
        if (n64Var instanceof C16864b) {
            c16864b = (C16864b) n64Var;
            int i = c16864b.f45598s;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16864b.f45598s = i - Integer.MIN_VALUE;
            } else {
                c16864b = new C16864b(n64Var);
            }
        }
        Object objResolve = c16864b.f45596h;
        Object objM51918f = uq8.m51918f();
        int i2 = c16864b.f45598s;
        if (i2 == 0) {
            wre.m54934b(objResolve);
            q74 context = c16864b.getContext();
            String strMo26336c = kge.m35689b(sld.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
            r9d r9dVar = this.f45585c;
            String str = this.f45583a;
            r71 r71Var = this.f45587e;
            c16864b.f45589a = this;
            c16864b.f45590b = qx0Var;
            c16864b.f45591c = qjaVarM52400e;
            c16864b.f45598s = 1;
            Object objM40192b = n71.m40192b(r9dVar, str, r71Var, c16864b);
            if (objM40192b == objM51918f) {
                return objM51918f;
            }
            sldVar = this;
            qx0Var2 = qx0Var;
            qjaVar = qjaVarM52400e;
            objResolve = objM40192b;
        } else if (i2 == 1) {
            qjaVar = (qja) c16864b.f45591c;
            qx0Var2 = (qx0) c16864b.f45590b;
            sldVar = (sld) c16864b.f45589a;
            wre.m54934b(objResolve);
        } else if (i2 == 2) {
            ii9Var = (ii9) c16864b.f45593e;
            kld kldVar2 = (kld) c16864b.f45592d;
            qja qjaVar3 = (qja) c16864b.f45591c;
            qx0 qx0Var4 = (qx0) c16864b.f45590b;
            sld sldVar3 = (sld) c16864b.f45589a;
            wre.m54934b(objResolve);
            sldVar2 = sldVar3;
            qx0Var3 = qx0Var4;
            qjaVar2 = qjaVar3;
            kldVar = kldVar2;
            qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.old
                @Override // p001o.uk7
                public final Object invoke() {
                    return sld.m48462H(this.f38548a, kldVar);
                }
            }, 1, null);
            ggeVar = new gge();
            c16864b.f45589a = sldVar2;
            c16864b.f45590b = qx0Var3;
            c16864b.f45591c = qjaVar2;
            c16864b.f45592d = kldVar;
            c16864b.f45593e = ii9Var;
            c16864b.f45594f = ggeVar;
            c16864b.f45595g = ggeVar;
            c16864b.f45598s = 3;
            objResolve = ((qc4) objResolve).resolve(qx0Var3, c16864b);
            if (objResolve != objM51918f) {
                return objM51918f;
            }
            ii9Var2 = ii9Var;
            ggeVar2 = ggeVar;
            ggeVar2.f25106a = objResolve;
            it = kldVar.m35839b().iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 3) {
            ggeVar2 = (gge) c16864b.f45595g;
            ggeVar = (gge) c16864b.f45594f;
            ii9Var2 = (ii9) c16864b.f45593e;
            kldVar = (kld) c16864b.f45592d;
            qjaVar2 = (qja) c16864b.f45591c;
            qx0Var3 = (qx0) c16864b.f45590b;
            sldVar2 = (sld) c16864b.f45589a;
            wre.m54934b(objResolve);
            ggeVar2.f25106a = objResolve;
            it = kldVar.m35839b().iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 4) {
            it = (Iterator) c16864b.f45594f;
            ggeVar = (gge) c16864b.f45593e;
            ii9Var2 = (ii9) c16864b.f45592d;
            qja qjaVar4 = (qja) c16864b.f45591c;
            qx0 qx0Var5 = (qx0) c16864b.f45590b;
            sld sldVar4 = (sld) c16864b.f45589a;
            wre.m54934b(objResolve);
            sldVar2 = sldVar4;
            qx0Var3 = qx0Var5;
            qjaVar2 = qjaVar4;
            ii9Var3 = ii9Var2;
            gge ggeVar4 = ggeVar;
            it2 = it;
            ggeVar3 = ggeVar4;
            c16864b.f45589a = sldVar2;
            c16864b.f45590b = qx0Var3;
            c16864b.f45591c = qjaVar2;
            c16864b.f45592d = ii9Var3;
            c16864b.f45593e = ggeVar3;
            c16864b.f45594f = it2;
            c16864b.f45595g = ggeVar3;
            c16864b.f45598s = 5;
            objResolve = ((qc4) objResolve).resolve(qx0Var3, c16864b);
            if (objResolve != objM51918f) {
            }
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar3 = (gge) c16864b.f45595g;
            it2 = (Iterator) c16864b.f45594f;
            gge ggeVar5 = (gge) c16864b.f45593e;
            ii9Var3 = (ii9) c16864b.f45592d;
            qjaVar2 = (qja) c16864b.f45591c;
            qx0Var3 = (qx0) c16864b.f45590b;
            sldVar2 = (sld) c16864b.f45589a;
            wre.m54934b(objResolve);
            ggeVar3.f25106a = objResolve;
            it = it2;
            ggeVar = ggeVar5;
            ii9Var2 = ii9Var3;
            if (!it.hasNext()) {
                final iue iueVar = (iue) it.next();
                qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.pld
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return sld.m48463J(iueVar);
                    }
                }, 1, null);
                ic4 ic4Var = (ic4) ggeVar.f25106a;
                c16864b.f45589a = sldVar2;
                c16864b.f45590b = qx0Var3;
                c16864b.f45591c = qjaVar2;
                c16864b.f45592d = ii9Var2;
                c16864b.f45593e = ggeVar;
                c16864b.f45594f = it;
                c16864b.f45595g = null;
                c16864b.f45598s = 4;
                objResolve = sldVar2.m48475Q(iueVar, ic4Var, ii9Var2, c16864b);
                if (objResolve == objM51918f) {
                    return objM51918f;
                }
                ii9Var3 = ii9Var2;
                gge ggeVar42 = ggeVar;
                it2 = it;
                ggeVar3 = ggeVar42;
                c16864b.f45589a = sldVar2;
                c16864b.f45590b = qx0Var3;
                c16864b.f45591c = qjaVar2;
                c16864b.f45592d = ii9Var3;
                c16864b.f45593e = ggeVar3;
                c16864b.f45594f = it2;
                c16864b.f45595g = ggeVar3;
                c16864b.f45598s = 5;
                objResolve = ((qc4) objResolve).resolve(qx0Var3, c16864b);
                if (objResolve != objM51918f) {
                    return objM51918f;
                }
                ggeVar5 = ggeVar3;
                ggeVar3.f25106a = objResolve;
                it = it2;
                ggeVar = ggeVar5;
                ii9Var2 = ii9Var3;
                if (!it.hasNext()) {
                    qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.qld
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return sld.m48464K(ggeVar);
                        }
                    }, 1, null);
                    return ggeVar.f25106a;
                }
            }
        }
        final r81 r81Var = (r81) objResolve;
        qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.nld
            @Override // p001o.uk7
            public final Object invoke() {
                return sld.m48461D(r81Var);
            }
        }, 1, null);
        kld kldVarM35840a = kld.f32379c.m35840a(r81Var);
        String str2 = sldVar.f45583a;
        ii9 ii9VarM35729a = ki9.m35729a(sldVar.new C16865c(str2 != null ? (vq3) r81Var.m46333b().get(str2) : null, qx0Var2, null));
        iba ibaVarM35838a = kldVarM35840a.m35838a();
        c16864b.f45589a = sldVar;
        c16864b.f45590b = qx0Var2;
        c16864b.f45591c = qjaVar;
        c16864b.f45592d = kldVarM35840a;
        c16864b.f45593e = ii9VarM35729a;
        c16864b.f45598s = 2;
        Object objM48474O = sldVar.m48474O(ibaVarM35838a, ii9VarM35729a, c16864b);
        if (objM48474O == objM51918f) {
            return objM51918f;
        }
        sldVar2 = sldVar;
        qjaVar2 = qjaVar;
        ii9Var = ii9VarM35729a;
        objResolve = objM48474O;
        kldVar = kldVarM35840a;
        qx0Var3 = qx0Var2;
        qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.old
            @Override // p001o.uk7
            public final Object invoke() {
                return sld.m48462H(this.f38548a, kldVar);
            }
        }, 1, null);
        ggeVar = new gge();
        c16864b.f45589a = sldVar2;
        c16864b.f45590b = qx0Var3;
        c16864b.f45591c = qjaVar2;
        c16864b.f45592d = kldVar;
        c16864b.f45593e = ii9Var;
        c16864b.f45594f = ggeVar;
        c16864b.f45595g = ggeVar;
        c16864b.f45598s = 3;
        objResolve = ((qc4) objResolve).resolve(qx0Var3, c16864b);
        if (objResolve != objM51918f) {
        }
    }

    /* renamed from: s */
    public final r9d m48477s() {
        return this.f45585c;
    }

    /* renamed from: t */
    public final String m48478t() {
        return this.f45584b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sld(String str, String str2, r9d r9dVar, t18 t18Var) {
        this(str, str2, r9dVar, t18Var, null);
        sq8.m48649h(r9dVar, "platformProvider");
    }
}
