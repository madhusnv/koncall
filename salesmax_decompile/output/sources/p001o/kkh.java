package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public abstract class kkh {

    /* renamed from: a */
    public static final lgg f32357a = new lgg("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final nl7 f32358b = new nl7() { // from class: o.hkh
        @Override // p001o.nl7
        public final Object invoke(Object obj, Object obj2) {
            return kkh.m35815d(obj, (q74.InterfaceC16311b) obj2);
        }
    };

    /* renamed from: c */
    public static final nl7 f32359c = new nl7() { // from class: o.ikh
        @Override // p001o.nl7
        public final Object invoke(Object obj, Object obj2) {
            return kkh.m35816e((fkh) obj, (q74.InterfaceC16311b) obj2);
        }
    };

    /* renamed from: d */
    public static final nl7 f32360d = new nl7() { // from class: o.jkh
        @Override // p001o.nl7
        public final Object invoke(Object obj, Object obj2) {
            return kkh.m35819h((clh) obj, (q74.InterfaceC16311b) obj2);
        }
    };

    /* renamed from: d */
    public static final Object m35815d(Object obj, q74.InterfaceC16311b interfaceC16311b) {
        if (!(interfaceC16311b instanceof fkh)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC16311b : Integer.valueOf(iIntValue + 1);
    }

    /* renamed from: e */
    public static final fkh m35816e(fkh fkhVar, q74.InterfaceC16311b interfaceC16311b) {
        if (fkhVar != null) {
            return fkhVar;
        }
        if (interfaceC16311b instanceof fkh) {
            return (fkh) interfaceC16311b;
        }
        return null;
    }

    /* renamed from: f */
    public static final void m35817f(q74 q74Var, Object obj) {
        if (obj == f32357a) {
            return;
        }
        if (obj instanceof clh) {
            ((clh) obj).m21388b(q74Var);
            return;
        }
        Object objFold = q74Var.fold(null, f32359c);
        sq8.m48647f(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((fkh) objFold).mo26969H(q74Var, obj);
    }

    /* renamed from: g */
    public static final Object m35818g(q74 q74Var) {
        Object objFold = q74Var.fold(0, f32358b);
        sq8.m48646e(objFold);
        return objFold;
    }

    /* renamed from: h */
    public static final clh m35819h(clh clhVar, q74.InterfaceC16311b interfaceC16311b) {
        if (interfaceC16311b instanceof fkh) {
            fkh fkhVar = (fkh) interfaceC16311b;
            clhVar.m21387a(fkhVar, fkhVar.f0(clhVar.f18306a));
        }
        return clhVar;
    }

    /* renamed from: i */
    public static final Object m35820i(q74 q74Var, Object obj) {
        if (obj == null) {
            obj = m35818g(q74Var);
        }
        if (obj == 0) {
            return f32357a;
        }
        if (obj instanceof Integer) {
            return q74Var.fold(new clh(q74Var, ((Number) obj).intValue()), f32360d);
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((fkh) obj).f0(q74Var);
    }
}
