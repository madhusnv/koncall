package p001o;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class st7 {

    /* renamed from: a */
    public static final st7 f45909a = new st7();

    /* renamed from: b */
    public static final AtomicBoolean f45910b = new AtomicBoolean(false);

    /* renamed from: o.st7$a */
    public static final class C16914a extends jgg implements nl7 {

        /* renamed from: a */
        public Object f45911a;

        /* renamed from: b */
        public Object f45912b;

        /* renamed from: c */
        public int f45913c;

        /* renamed from: d */
        public final /* synthetic */ jg2 f45914d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16914a(jg2 jg2Var, n64 n64Var) {
            super(2, n64Var);
            this.f45914d = jg2Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16914a(this.f45914d, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x0041, B:18:0x0049), top: B:29:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:29:0x0041). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            eee eeeVar;
            sg2 it;
            C16914a c16914a;
            Object objMo23482a;
            Object objM51918f = uq8.m51918f();
            int i = this.f45913c;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    eeeVar = this.f45914d;
                    it = eeeVar.iterator();
                    c16914a = this;
                    c16914a.f45911a = eeeVar;
                    c16914a.f45912b = it;
                    c16914a.f45913c = 1;
                    objMo23482a = it.mo23482a(c16914a);
                    if (objMo23482a != objM51918f) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sg2 sg2Var = (sg2) this.f45912b;
                    eee eeeVar2 = (eee) this.f45911a;
                    wre.m54934b(obj);
                    eee eeeVar3 = eeeVar2;
                    sg2 sg2Var2 = sg2Var;
                    Object obj2 = objM51918f;
                    C16914a c16914a2 = this;
                    try {
                        if (!((Boolean) obj).booleanValue()) {
                            xwf.f54441e.m56933g();
                            c16914a = c16914a2;
                            objM51918f = obj2;
                            it = sg2Var2;
                            eeeVar = eeeVar3;
                            c16914a.f45911a = eeeVar;
                            c16914a.f45912b = it;
                            c16914a.f45913c = 1;
                            objMo23482a = it.mo23482a(c16914a);
                            if (objMo23482a != objM51918f) {
                                return objM51918f;
                            }
                            Object obj3 = objM51918f;
                            c16914a2 = c16914a;
                            obj = objMo23482a;
                            eeeVar3 = eeeVar;
                            sg2Var2 = it;
                            obj2 = obj3;
                            if (!((Boolean) obj).booleanValue()) {
                                yg2.m57772a(eeeVar3, null);
                                return y3i.f54824a;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        eeeVar = eeeVar3;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            yg2.m57772a(eeeVar, th);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16914a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.st7$b */
    public static final class C16915b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ jg2 f45915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16915b(jg2 jg2Var) {
            super(1);
            this.f45915a = jg2Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69033invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69033invoke(Object obj) {
            sq8.m48649h(obj, "it");
            this.f45915a.mo23472g(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public final void m48908a() {
        if (f45910b.compareAndSet(false, true)) {
            jg2 jg2VarM49824b = tg2.m49824b(-1, null, null, 6, null);
            rm1.m46952d(i84.m31707a(tf0.f46973H.m49801b()), null, null, new C16914a(jg2VarM49824b, null), 3, null);
            xwf.f54441e.m56932f(new C16915b(jg2VarM49824b));
        }
    }
}
