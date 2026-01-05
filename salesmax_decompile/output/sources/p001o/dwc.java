package p001o;

import p001o.efa;

/* loaded from: classes3.dex */
public abstract class dwc {

    /* renamed from: o.dwc$a */
    public static final class C13049a extends jgg implements nl7 {

        /* renamed from: a */
        public Object f20594a;

        /* renamed from: b */
        public int f20595b;

        /* renamed from: c */
        public int f20596c;

        /* renamed from: d */
        public /* synthetic */ Object f20597d;

        /* renamed from: e */
        public final /* synthetic */ efa f20598e;

        /* renamed from: f */
        public final /* synthetic */ cxe f20599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13049a(efa efaVar, cxe cxeVar, n64 n64Var) {
            super(2, n64Var);
            this.f20598e = efaVar;
            this.f20599f = cxeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C13049a c13049a = new C13049a(this.f20598e, this.f20599f, n64Var);
            c13049a.f20597d = obj;
            return c13049a;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009c -> B:11:0x004f). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z37 z37Var;
            gge ggeVar;
            C13049a c13049a;
            int i;
            gge ggeVar2;
            z37 z37Var2;
            ffa ffaVar;
            String strM26553c;
            Object objM51918f = uq8.m51918f();
            int i2 = this.f20596c;
            if (i2 == 0) {
                wre.m54934b(obj);
                z37Var = (z37) this.f20597d;
                ggeVar = new gge();
                ggeVar.f25106a = this.f20598e.m24927b();
                c13049a = this;
                i = 1;
            } else if (i2 == 1) {
                gge ggeVar3 = (gge) this.f20594a;
                z37 z37Var3 = (z37) this.f20597d;
                wre.m54934b(obj);
                c13049a = this;
                ggeVar2 = ggeVar3;
                z37Var2 = z37Var3;
                ffaVar = (ffa) obj;
                strM26553c = ffaVar.m26553c();
                ggeVar2.f25106a = strM26553c;
                int i3 = 0;
                if (strM26553c != null) {
                    if (strM26553c.length() > 0) {
                        i3 = 1;
                    }
                }
                c13049a.f20597d = z37Var2;
                c13049a.f20594a = ggeVar2;
                c13049a.f20595b = i3;
                c13049a.f20596c = 2;
                if (z37Var2.emit(ffaVar, c13049a) != objM51918f) {
                    return objM51918f;
                }
                z37Var = z37Var2;
                ggeVar = ggeVar2;
                i = i3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.f20595b;
                gge ggeVar4 = (gge) this.f20594a;
                z37 z37Var4 = (z37) this.f20597d;
                wre.m54934b(obj);
                z37Var = z37Var4;
                c13049a = this;
                i = i4;
                ggeVar = ggeVar4;
            }
            if (i == 0) {
                return y3i.f54824a;
            }
            efa.C13180a c13180a = new efa.C13180a(c13049a.f20598e);
            c13180a.m24950n((String) ggeVar.f25106a);
            efa efaVarM24937a = c13180a.m24937a();
            cxe cxeVar = c13049a.f20599f;
            c13049a.f20597d = z37Var;
            c13049a.f20594a = ggeVar;
            c13049a.f20596c = 1;
            Object objI2 = cxeVar.i2(efaVarM24937a, c13049a);
            if (objI2 == objM51918f) {
                return objM51918f;
            }
            gge ggeVar5 = ggeVar;
            z37Var2 = z37Var;
            obj = objI2;
            ggeVar2 = ggeVar5;
            ffaVar = (ffa) obj;
            strM26553c = ffaVar.m26553c();
            ggeVar2.f25106a = strM26553c;
            int i32 = 0;
            if (strM26553c != null) {
            }
            c13049a.f20597d = z37Var2;
            c13049a.f20594a = ggeVar2;
            c13049a.f20595b = i32;
            c13049a.f20596c = 2;
            if (z37Var2.emit(ffaVar, c13049a) != objM51918f) {
            }
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C13049a) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final v37 m23897a(cxe cxeVar, xk7 xk7Var) {
        sq8.m48649h(cxeVar, "<this>");
        sq8.m48649h(xk7Var, "block");
        efa.C13180a c13180a = new efa.C13180a();
        xk7Var.invoke(c13180a);
        return m23898b(cxeVar, c13180a.m24937a());
    }

    /* renamed from: b */
    public static final v37 m23898b(cxe cxeVar, efa efaVar) {
        sq8.m48649h(cxeVar, "<this>");
        sq8.m48649h(efaVar, "initialRequest");
        return e47.m24281o(new C13049a(efaVar, cxeVar, null));
    }
}
