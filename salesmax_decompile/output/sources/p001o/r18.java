package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class r18 implements ueb {

    /* renamed from: a */
    public final List f42738a = new ArrayList();

    /* renamed from: o.r18$a */
    public static final class C16506a extends o64 {

        /* renamed from: a */
        public Object f42739a;

        /* renamed from: b */
        public Object f42740b;

        /* renamed from: c */
        public Object f42741c;

        /* renamed from: d */
        public /* synthetic */ Object f42742d;

        /* renamed from: f */
        public int f42744f;

        public C16506a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f42742d = obj;
            this.f42744f |= Integer.MIN_VALUE;
            return r18.this.mo36732b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.ueb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo36732b(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
        C16506a c16506a;
        r18 r18Var;
        r18 r18Var2;
        if (n64Var instanceof C16506a) {
            c16506a = (C16506a) n64Var;
            int i = c16506a.f42744f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16506a.f42744f = i - Integer.MIN_VALUE;
            } else {
                c16506a = new C16506a(n64Var);
            }
        }
        Object objMo21441a = c16506a.f42742d;
        Object objM51918f = uq8.m51918f();
        int i2 = c16506a.f42744f;
        if (i2 == 0) {
            wre.m54934b(objMo21441a);
            if (!this.f42738a.isEmpty()) {
                o18 o18Var = (o18) kh3.r0(this.f42738a);
                c16506a.f42739a = this;
                c16506a.f42740b = zdcVar;
                c16506a.f42741c = jw7Var;
                c16506a.f42744f = 1;
                if (q18.m44672b(o18Var, c16506a) == objM51918f) {
                    return objM51918f;
                }
            }
            r18Var = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdcVar = (zdc) c16506a.f42740b;
                r18Var2 = (r18) c16506a.f42739a;
                wre.m54934b(objMo21441a);
                o18 o18Var2 = (o18) objMo21441a;
                r18Var2.f42738a.add(o18Var2);
                zdcVar.m59254c().mo34002p(s38.f44646a.m47569e(), r18Var2.f42738a);
                return o18Var2;
            }
            jw7 jw7Var2 = (jw7) c16506a.f42741c;
            zdc zdcVar2 = (zdc) c16506a.f42740b;
            r18Var = (r18) c16506a.f42739a;
            wre.m54934b(objMo21441a);
            jw7Var = jw7Var2;
            zdcVar = zdcVar2;
        }
        c16506a.f42739a = r18Var;
        c16506a.f42740b = zdcVar;
        c16506a.f42741c = null;
        c16506a.f42744f = 2;
        objMo21441a = jw7Var.mo21441a(zdcVar, c16506a);
        if (objMo21441a == objM51918f) {
            return objM51918f;
        }
        r18Var2 = r18Var;
        o18 o18Var22 = (o18) objMo21441a;
        r18Var2.f42738a.add(o18Var22);
        zdcVar.m59254c().mo34002p(s38.f44646a.m47569e(), r18Var2.f42738a);
        return o18Var22;
    }
}
