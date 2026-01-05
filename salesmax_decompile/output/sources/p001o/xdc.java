package p001o;

import java.lang.reflect.InvocationTargetException;
import p001o.vre;

/* loaded from: classes3.dex */
public final class xdc implements jw7 {

    /* renamed from: a */
    public final jw7 f53555a;

    /* renamed from: b */
    public final un8 f53556b;

    /* renamed from: o.xdc$a */
    public static final class C18120a extends o64 {

        /* renamed from: a */
        public Object f53557a;

        /* renamed from: b */
        public /* synthetic */ Object f53558b;

        /* renamed from: d */
        public int f53560d;

        public C18120a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53558b = obj;
            this.f53560d |= Integer.MIN_VALUE;
            return xdc.this.mo21441a(null, this);
        }
    }

    public xdc(jw7 jw7Var, un8 un8Var) {
        sq8.m48649h(jw7Var, "inner");
        sq8.m48649h(un8Var, "interceptors");
        this.f53555a = jw7Var;
        this.f53556b = un8Var;
    }

    /* renamed from: f */
    public static final String m56092f() {
        return "operation started";
    }

    /* renamed from: g */
    public static final String m56093g() {
        return "operation completed successfully";
    }

    /* renamed from: h */
    public static final String m56094h() {
        return "operation failed";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.jw7
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21441a(zdc zdcVar, n64 n64Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C18120a c18120a;
        xdc xdcVar;
        Object objM53351b;
        Object objM51808d;
        Object objM51816l;
        if (n64Var instanceof C18120a) {
            c18120a = (C18120a) n64Var;
            int i = c18120a.f53560d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18120a.f53560d = i - Integer.MIN_VALUE;
            } else {
                c18120a = new C18120a(n64Var);
            }
        }
        Object objMo21441a = c18120a.f53558b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18120a.f53560d;
        if (i2 == 0) {
            wre.m54934b(objMo21441a);
            q74 context = c18120a.getContext();
            uk7 uk7Var = new uk7() { // from class: o.udc
                @Override // p001o.uk7
                public final Object invoke() {
                    return xdc.m56092f();
                }
            };
            fja fjaVar = fja.Trace;
            String strMo26336c = kge.m35689b(xdc.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
            Object objM51822r = this.f53556b.m51822r(zdcVar.m59255d());
            if (!vre.m53357h(objM51822r)) {
                objM53351b = vre.m53351b(objM51822r);
                xdcVar = this;
                un8 un8Var = xdcVar.f53556b;
                c18120a.f53557a = xdcVar;
                c18120a.f53560d = 2;
                objM51808d = un8Var.m51808d(objM53351b, c18120a);
                if (objM51808d == objM51918f) {
                    return objM51918f;
                }
                objM51816l = xdcVar.f53556b.m51816l(objM51808d);
                if (vre.m53357h(objM51816l)) {
                }
                wre.m54934b(objM51816l);
                return objM51816l;
            }
            try {
                jw7 jw7Var = this.f53555a;
                c18120a.f53557a = this;
                c18120a.f53560d = 1;
                objMo21441a = jw7Var.mo21441a(zdcVar, c18120a);
                if (objMo21441a == objM51918f) {
                    return objM51918f;
                }
                xdcVar = this;
            } catch (Throwable th) {
                th = th;
                xdcVar = this;
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                un8 un8Var2 = xdcVar.f53556b;
                c18120a.f53557a = xdcVar;
                c18120a.f53560d = 2;
                objM51808d = un8Var2.m51808d(objM53351b, c18120a);
                if (objM51808d == objM51918f) {
                }
                objM51816l = xdcVar.f53556b.m51816l(objM51808d);
                if (vre.m53357h(objM51816l)) {
                }
                wre.m54934b(objM51816l);
                return objM51816l;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xdcVar = (xdc) c18120a.f53557a;
                wre.m54934b(objMo21441a);
                objM51808d = ((vre) objMo21441a).m53359j();
                objM51816l = xdcVar.f53556b.m51816l(objM51808d);
                if (vre.m53357h(objM51816l)) {
                    q74 context2 = c18120a.getContext();
                    uk7 uk7Var2 = new uk7() { // from class: o.vdc
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return xdc.m56093g();
                        }
                    };
                    fja fjaVar2 = fja.Trace;
                    String strMo26336c2 = kge.m35689b(xdc.class).mo26336c();
                    if (strMo26336c2 == null) {
                        throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    v74.m52399d(context2, fjaVar2, strMo26336c2, null, uk7Var2);
                } else if (vre.m53356g(objM51816l)) {
                    q74 context3 = c18120a.getContext();
                    Throwable thM53354e = vre.m53354e(objM51816l);
                    uk7 uk7Var3 = new uk7() { // from class: o.wdc
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return xdc.m56094h();
                        }
                    };
                    fja fjaVar3 = fja.Trace;
                    String strMo26336c3 = kge.m35689b(xdc.class).mo26336c();
                    if (strMo26336c3 == null) {
                        throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    v74.m52399d(context3, fjaVar3, strMo26336c3, thM53354e, uk7Var3);
                }
                wre.m54934b(objM51816l);
                return objM51816l;
            }
            xdcVar = (xdc) c18120a.f53557a;
            try {
                wre.m54934b(objMo21441a);
            } catch (Throwable th2) {
                th = th2;
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                un8 un8Var22 = xdcVar.f53556b;
                c18120a.f53557a = xdcVar;
                c18120a.f53560d = 2;
                objM51808d = un8Var22.m51808d(objM53351b, c18120a);
                if (objM51808d == objM51918f) {
                }
                objM51816l = xdcVar.f53556b.m51816l(objM51808d);
                if (vre.m53357h(objM51816l)) {
                }
                wre.m54934b(objM51816l);
                return objM51816l;
            }
        }
        objM53351b = vre.m53351b(objMo21441a);
        un8 un8Var222 = xdcVar.f53556b;
        c18120a.f53557a = xdcVar;
        c18120a.f53560d = 2;
        objM51808d = un8Var222.m51808d(objM53351b, c18120a);
        if (objM51808d == objM51918f) {
        }
        objM51816l = xdcVar.f53556b.m51816l(objM51808d);
        if (vre.m53357h(objM51816l)) {
        }
        wre.m54934b(objM51816l);
        return objM51816l;
    }
}
