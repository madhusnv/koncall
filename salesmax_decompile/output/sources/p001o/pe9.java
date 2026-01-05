package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import p001o.vre;
import retrofit2.Call;
import retrofit2.Callback;

/* loaded from: classes6.dex */
public abstract class pe9 {

    /* renamed from: o.pe9$a */
    public static final class C16080a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Call f39947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16080a(Call call) {
            super(1);
            this.f39947a = call;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f39947a.cancel();
        }
    }

    /* renamed from: o.pe9$b */
    public static final class C16081b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Call f39948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16081b(Call call) {
            super(1);
            this.f39948a = call;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f39948a.cancel();
        }
    }

    /* renamed from: o.pe9$c */
    public static final class C16082c implements Callback {

        /* renamed from: a */
        public final /* synthetic */ xb2 f39949a;

        public C16082c(xb2 xb2Var) {
            this.f39949a = xb2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            sq8.m48650i(call, "call");
            sq8.m48650i(th, "t");
            xb2 xb2Var = this.f39949a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, bre breVar) {
            sq8.m48650i(call, "call");
            sq8.m48650i(breVar, "response");
            if (!breVar.m19665d()) {
                xb2 xb2Var = this.f39949a;
                b38 b38Var = new b38(breVar);
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(wre.m54933a(b38Var)));
                return;
            }
            Object objM19663a = breVar.m19663a();
            if (objM19663a != null) {
                this.f39949a.resumeWith(vre.m53351b(objM19663a));
                return;
            }
            Object objM51739j = call.request().m51739j(pv8.class);
            if (objM51739j == null) {
                sq8.m48661t();
            }
            sq8.m48645d(objM51739j, "call.request().tag(Invocation::class.java)!!");
            Method methodM44239a = ((pv8) objM51739j).m44239a();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            sq8.m48645d(methodM44239a, FirebaseAnalytics.Param.METHOD);
            Class<?> declaringClass = methodM44239a.getDeclaringClass();
            sq8.m48645d(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(methodM44239a.getName());
            sb.append(" was null but response body type was declared as non-null");
            re9 re9Var = new re9(sb.toString());
            xb2 xb2Var2 = this.f39949a;
            vre.C17665a c17665a2 = vre.f50797b;
            xb2Var2.resumeWith(vre.m53351b(wre.m54933a(re9Var)));
        }
    }

    /* renamed from: o.pe9$d */
    public static final class C16083d implements Callback {

        /* renamed from: a */
        public final /* synthetic */ xb2 f39950a;

        public C16083d(xb2 xb2Var) {
            this.f39950a = xb2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            sq8.m48650i(call, "call");
            sq8.m48650i(th, "t");
            xb2 xb2Var = this.f39950a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, bre breVar) {
            sq8.m48650i(call, "call");
            sq8.m48650i(breVar, "response");
            if (breVar.m19665d()) {
                this.f39950a.resumeWith(vre.m53351b(breVar.m19663a()));
                return;
            }
            xb2 xb2Var = this.f39950a;
            b38 b38Var = new b38(breVar);
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(b38Var)));
        }
    }

    /* renamed from: o.pe9$e */
    public static final class C16084e extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Call f39951a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16084e(Call call) {
            super(1);
            this.f39951a = call;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f39951a.cancel();
        }
    }

    /* renamed from: o.pe9$f */
    public static final class C16085f implements Callback {

        /* renamed from: a */
        public final /* synthetic */ xb2 f39952a;

        public C16085f(xb2 xb2Var) {
            this.f39952a = xb2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            sq8.m48650i(call, "call");
            sq8.m48650i(th, "t");
            xb2 xb2Var = this.f39952a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, bre breVar) {
            sq8.m48650i(call, "call");
            sq8.m48650i(breVar, "response");
            this.f39952a.resumeWith(vre.m53351b(breVar));
        }
    }

    /* renamed from: o.pe9$g */
    public static final class RunnableC16086g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ n64 f39953a;

        /* renamed from: b */
        public final /* synthetic */ Exception f39954b;

        public RunnableC16086g(n64 n64Var, Exception exc) {
            this.f39953a = n64Var;
            this.f39954b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n64 n64VarM50336c = tq8.m50336c(this.f39953a);
            Exception exc = this.f39954b;
            vre.C17665a c17665a = vre.f50797b;
            n64VarM50336c.resumeWith(vre.m53351b(wre.m54933a(exc)));
        }
    }

    /* renamed from: o.pe9$h */
    public static final class C16087h extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f39955a;

        /* renamed from: b */
        public int f39956b;

        /* renamed from: c */
        public Object f39957c;

        public C16087h(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39955a = obj;
            this.f39956b |= Integer.MIN_VALUE;
            return pe9.m43518d(null, this);
        }
    }

    /* renamed from: a */
    public static final Object m43515a(Call call, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.mo48694y(new C16080a(call));
        call.enqueue(new C16082c(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: b */
    public static final Object m43516b(Call call, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.mo48694y(new C16081b(call));
        call.enqueue(new C16083d(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: c */
    public static final Object m43517c(Call call, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.mo48694y(new C16084e(call));
        call.enqueue(new C16085f(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m43518d(Exception exc, n64 n64Var) {
        C16087h c16087h;
        if (n64Var instanceof C16087h) {
            c16087h = (C16087h) n64Var;
            int i = c16087h.f39956b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16087h.f39956b = i - Integer.MIN_VALUE;
            } else {
                c16087h = new C16087h(n64Var);
            }
        }
        Object obj = c16087h.f39955a;
        Object objM51918f = uq8.m51918f();
        int i2 = c16087h.f39956b;
        if (i2 == 0) {
            wre.m54934b(obj);
            c16087h.f39957c = exc;
            c16087h.f39956b = 1;
            eu5.m25610a().mo22314K(c16087h.getContext(), new RunnableC16086g(c16087h, exc));
            Object objM51918f2 = uq8.m51918f();
            if (objM51918f2 == uq8.m51918f()) {
                n75.m40201c(c16087h);
            }
            if (objM51918f2 == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return y3i.f54824a;
    }
}
