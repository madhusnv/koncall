package p001o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p001o.qja;

/* loaded from: classes3.dex */
public abstract class ob8 implements nb8, Closeable {

    /* renamed from: a */
    public final nb8[] f38032a;

    /* renamed from: o.ob8$a */
    public static final class C15751a extends o64 {

        /* renamed from: a */
        public Object f38033a;

        /* renamed from: b */
        public /* synthetic */ Object f38034b;

        /* renamed from: d */
        public int f38036d;

        public C15751a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f38034b = obj;
            this.f38036d |= Integer.MIN_VALUE;
            return ob8.m41910c(ob8.this, null, this);
        }
    }

    /* renamed from: o.ob8$b */
    public static final class C15752b implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ nb8 f38037a;

        public C15752b(nb8 nb8Var) {
            this.f38037a = nb8Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to resolve identity from " + this.f38037a;
        }
    }

    /* renamed from: o.ob8$c */
    public static final class C15753c implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ nb8 f38038a;

        /* renamed from: b */
        public final /* synthetic */ Exception f38039b;

        public C15753c(nb8 nb8Var, Exception exc) {
            this.f38038a = nb8Var;
            this.f38039b = exc;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "unable to resolve identity from " + this.f38038a + ": " + this.f38039b.getMessage();
        }
    }

    /* renamed from: o.ob8$d */
    public static final class C15754d implements uk7 {
        public C15754d() {
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rb8 invoke() {
            return new rb8("No identity could be resolved from the chain: " + ob8.this, null, 2, null);
        }
    }

    /* renamed from: o.ob8$e */
    public static final class C15755e extends jgg implements nl7 {

        /* renamed from: a */
        public int f38041a;

        /* renamed from: b */
        public /* synthetic */ Object f38042b;

        /* renamed from: c */
        public final /* synthetic */ dth f38043c;

        /* renamed from: d */
        public final /* synthetic */ ob8 f38044d;

        /* renamed from: e */
        public final /* synthetic */ qx0 f38045e;

        /* renamed from: f */
        public Object f38046f;

        /* renamed from: g */
        public Object f38047g;

        /* renamed from: h */
        public Object f38048h;

        /* renamed from: q */
        public int f38049q;

        /* renamed from: s */
        public int f38050s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15755e(dth dthVar, n64 n64Var, ob8 ob8Var, qx0 qx0Var) {
            super(2, n64Var);
            this.f38043c = dthVar;
            this.f38044d = ob8Var;
            this.f38045e = qx0Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15755e c15755e = new C15755e(this.f38043c, n64Var, this.f38044d, this.f38045e);
            c15755e.f38042b = obj;
            return c15755e;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:36:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ac -> B:27:0x00b6). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            gi9 gi9Var;
            nb8[] nb8VarArr;
            int length;
            int i;
            qja qjaVar;
            C15755e c15755e;
            C15755e c15755e2;
            Exception e;
            gi9 gi9Var2;
            nb8[] nb8VarArr2;
            qja qjaVar2;
            nb8 nb8Var;
            int i2;
            int i3;
            Object obj2;
            Object objM51918f = uq8.m51918f();
            int i4 = this.f38041a;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.f38050s;
                int i6 = this.f38049q;
                nb8 nb8Var2 = (nb8) this.f38048h;
                qja qjaVar3 = (qja) this.f38047g;
                nb8[] nb8VarArr3 = (nb8[]) this.f38046f;
                gi9 gi9Var3 = (gi9) this.f38042b;
                try {
                    wre.m54934b(obj);
                    gi9Var2 = gi9Var3;
                    nb8VarArr2 = nb8VarArr3;
                    qjaVar2 = qjaVar3;
                    nb8Var = nb8Var2;
                    i2 = i6;
                    i3 = i5;
                    obj2 = objM51918f;
                    c15755e2 = this;
                } catch (Exception e2) {
                    e = e2;
                    gi9Var2 = gi9Var3;
                    nb8VarArr2 = nb8VarArr3;
                    qjaVar2 = qjaVar3;
                    nb8Var = nb8Var2;
                    i2 = i6;
                    i3 = i5;
                    obj2 = objM51918f;
                    c15755e2 = this;
                    qja.C16414b.m45548a(qjaVar2, null, new C15753c(nb8Var, e), 1, null);
                    cl6.m21376a((Throwable) gi9Var2.getValue(), e);
                    qjaVar = qjaVar2;
                    nb8VarArr = nb8VarArr2;
                    gi9Var = gi9Var2;
                    int i7 = i3;
                    i = i2 + 1;
                    c15755e = c15755e2;
                    objM51918f = obj2;
                    length = i7;
                    if (i < length) {
                    }
                }
                try {
                } catch (Exception e3) {
                    e = e3;
                    qja.C16414b.m45548a(qjaVar2, null, new C15753c(nb8Var, e), 1, null);
                    cl6.m21376a((Throwable) gi9Var2.getValue(), e);
                    qjaVar = qjaVar2;
                    nb8VarArr = nb8VarArr2;
                    gi9Var = gi9Var2;
                    int i72 = i3;
                    i = i2 + 1;
                    c15755e = c15755e2;
                    objM51918f = obj2;
                    length = i72;
                    if (i < length) {
                    }
                }
                sq8.m48647f(obj, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain");
                return (ib8) obj;
            }
            wre.m54934b(obj);
            q74 q74VarMo6529D = ((h84) this.f38042b).mo6529D();
            String strMo26336c = kge.m35689b(ob8.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(q74VarMo6529D, strMo26336c);
            gi9 gi9VarM48360a = si9.m48360a(this.f38044d.new C15754d());
            nb8[] nb8VarArrM41911a = this.f38044d.m41911a();
            gi9Var = gi9VarM48360a;
            nb8VarArr = nb8VarArrM41911a;
            length = nb8VarArrM41911a.length;
            i = 0;
            qjaVar = qjaVarM52400e;
            c15755e = this;
            if (i < length) {
                throw ((Throwable) gi9Var.getValue());
            }
            nb8 nb8Var3 = nb8VarArr[i];
            qja.C16414b.m45550c(qjaVar, null, new C15752b(nb8Var3), 1, null);
            try {
            } catch (Exception e4) {
                Object obj3 = objM51918f;
                c15755e2 = c15755e;
                e = e4;
                gi9Var2 = gi9Var;
                nb8VarArr2 = nb8VarArr;
                qjaVar2 = qjaVar;
                nb8Var = nb8Var3;
                i2 = i;
                i3 = length;
                obj2 = obj3;
                qja.C16414b.m45548a(qjaVar2, null, new C15753c(nb8Var, e), 1, null);
                cl6.m21376a((Throwable) gi9Var2.getValue(), e);
                qjaVar = qjaVar2;
                nb8VarArr = nb8VarArr2;
                gi9Var = gi9Var2;
                int i722 = i3;
                i = i2 + 1;
                c15755e = c15755e2;
                objM51918f = obj2;
                length = i722;
                if (i < length) {
                }
            }
            qx0 qx0Var = c15755e.f38045e;
            c15755e.f38042b = gi9Var;
            c15755e.f38046f = nb8VarArr;
            c15755e.f38047g = qjaVar;
            c15755e.f38048h = nb8Var3;
            c15755e.f38049q = i;
            c15755e.f38050s = length;
            c15755e.f38041a = 1;
            Object objResolve = nb8Var3.resolve(qx0Var, c15755e);
            if (objResolve == objM51918f) {
                return objM51918f;
            }
            Object obj4 = objM51918f;
            c15755e2 = c15755e;
            obj = objResolve;
            gi9Var2 = gi9Var;
            nb8VarArr2 = nb8VarArr;
            qjaVar2 = qjaVar;
            nb8Var = nb8Var3;
            i2 = i;
            i3 = length;
            obj2 = obj4;
            sq8.m48647f(obj, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain");
            return (ib8) obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15755e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public ob8(nb8... nb8VarArr) {
        sq8.m48649h(nb8VarArr, "providers");
        this.f38032a = nb8VarArr;
        if (!(!(nb8VarArr.length == 0))) {
            throw new IllegalArgumentException("at least one provider must be in the chain".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:47:0x00d4, B:49:0x00d8, B:51:0x00ea, B:50:0x00e2), top: B:56:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:47:0x00d4, B:49:0x00d8, B:51:0x00ea, B:50:0x00e2), top: B:56:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m41910c(ob8 ob8Var, qx0 qx0Var, n64 n64Var) throws Throwable {
        C15751a c15751a;
        dth dthVar;
        q74 tdhVar;
        vdh vdhVarM54242K;
        g64 g64VarMo40626b;
        if (n64Var instanceof C15751a) {
            c15751a = (C15751a) n64Var;
            int i = c15751a.f38036d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15751a.f38036d = i - Integer.MIN_VALUE;
            } else {
                c15751a = ob8Var.new C15751a(n64Var);
            }
        }
        Object obj = c15751a.f38034b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15751a.f38036d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dthVar = (dth) c15751a.f38033a;
                try {
                    wre.m54934b(obj);
                    dthVar.close();
                    return obj;
                } catch (Exception e) {
                    e = e;
                    if (e instanceof CancellationException) {
                        dthVar.Z0(vzf.ERROR);
                        fth.m27471a(dthVar, e, true);
                    } else {
                        fth.m27472b(dthVar, "cancelled", ml1.m39301a(true));
                    }
                    throw e;
                }
            }
            wre.m54934b(obj);
            qx0 qx0VarM50736a = tx0.m50736a();
            uzf uzfVar = uzf.INTERNAL;
            e66 e66Var = e66.f21035a;
            String strMo26336c = kge.m35689b(ob8.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
            }
            dth dthVarMo31126a = xdh.m56098a(c15751a.getContext()).mo40628d().mo34509a(strMo26336c).mo31126a("ResolveIdentityChain", qx0VarM50736a, uzfVar, udh.m51389a(c15751a.getContext()));
            try {
                wdh wdhVar = (wdh) c15751a.getContext().get(wdh.f51822c);
                x54 x54VarMo28089a = (wdhVar == null || (vdhVarM54242K = wdhVar.m54242K()) == null || (g64VarMo40626b = vdhVarM54242K.mo40626b()) == null) ? null : g64VarMo40626b.mo28089a();
                if (x54VarMo28089a != null) {
                    tdhVar = new tdh(x54VarMo28089a);
                } else {
                    tdhVar = (tdh) c15751a.getContext().get(tdh.f46909c);
                    if (tdhVar == null) {
                        tdhVar = e66Var;
                    }
                }
                q74 q74VarPlus = e66Var.plus(new eth(dthVarMo31126a)).plus(tdhVar);
                C15755e c15755e = new C15755e(dthVarMo31126a, null, ob8Var, qx0Var);
                c15751a.f38033a = dthVarMo31126a;
                c15751a.f38036d = 1;
                Object objM43867g = pm1.m43867g(q74VarPlus, c15755e, c15751a);
                if (objM43867g == objM51918f) {
                    return objM51918f;
                }
                obj = objM43867g;
                dthVar = dthVarMo31126a;
                dthVar.close();
                return obj;
            } catch (Exception e2) {
                e = e2;
                dthVar = dthVarMo31126a;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                ob8Var = dthVarMo31126a;
                ob8Var.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final nb8[] m41911a() {
        return this.f38032a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        Exception exc;
        nb8[] nb8VarArr = this.f38032a;
        ArrayList arrayList = new ArrayList();
        for (nb8 nb8Var : nb8VarArr) {
            try {
                exc = null;
                Closeable closeable = nb8Var instanceof Closeable ? (Closeable) nb8Var : null;
                if (closeable != null) {
                    closeable.close();
                }
            } catch (Exception e) {
                exc = e;
            }
            if (exc != null) {
                arrayList.add(exc);
            }
        }
        if (!arrayList.isEmpty()) {
            Exception exc2 = (Exception) kh3.f0(arrayList);
            Iterator it = kh3.m35709Y(arrayList, 1).iterator();
            while (it.hasNext()) {
                exc2.addSuppressed((Throwable) it.next());
            }
            throw exc2;
        }
    }

    @Override // p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return m41910c(this, qx0Var, n64Var);
    }
}
