package p001o;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public interface mq3 {

    /* renamed from: o.mq3$a */
    public static abstract class AbstractC15402a {
        /* renamed from: a */
        public static AbstractC15402a m39507a(String str, Class cls) {
            return m39508b(str, cls, null);
        }

        /* renamed from: b */
        public static AbstractC15402a m39508b(String str, Class cls, Object obj) {
            return new g41(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo28031c();

        /* renamed from: d */
        public abstract Object mo28032d();

        /* renamed from: e */
        public abstract Class mo28033e();
    }

    /* renamed from: o.mq3$b */
    public interface InterfaceC15403b {
        /* renamed from: a */
        boolean mo39509a(AbstractC15402a abstractC15402a);
    }

    /* renamed from: o.mq3$c */
    public enum EnumC15404c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: P */
    static void m39504P(qpb qpbVar, mq3 mq3Var, mq3 mq3Var2, AbstractC15402a abstractC15402a) {
        if (!Objects.equals(abstractC15402a, qd8.f41692r)) {
            qpbVar.mo45759C(abstractC15402a, mq3Var2.mo36959e(abstractC15402a), mq3Var2.mo36960f(abstractC15402a));
            return;
        }
        mne mneVar = (mne) mq3Var2.mo36958d(abstractC15402a, null);
        qpbVar.mo45759C(abstractC15402a, mq3Var2.mo36959e(abstractC15402a), nne.m40811a((mne) mq3Var.mo36958d(abstractC15402a, null), mneVar));
    }

    /* renamed from: S */
    static boolean m39505S(EnumC15404c enumC15404c, EnumC15404c enumC15404c2) {
        EnumC15404c enumC15404c3 = EnumC15404c.REQUIRED;
        return enumC15404c == enumC15404c3 && enumC15404c2 == enumC15404c3;
    }

    /* renamed from: z */
    static mq3 m39506z(mq3 mq3Var, mq3 mq3Var2) {
        if (mq3Var == null && mq3Var2 == null) {
            return tec.m49791X();
        }
        qpb qpbVarB0 = mq3Var2 != null ? qpb.b0(mq3Var2) : qpb.a0();
        if (mq3Var != null) {
            Iterator it = mq3Var.mo36956b().iterator();
            while (it.hasNext()) {
                m39504P(qpbVarB0, mq3Var2, mq3Var, (AbstractC15402a) it.next());
            }
        }
        return tec.m49792Y(qpbVarB0);
    }

    /* renamed from: a */
    Set mo36955a(AbstractC15402a abstractC15402a);

    /* renamed from: b */
    Set mo36956b();

    /* renamed from: c */
    boolean mo36957c(AbstractC15402a abstractC15402a);

    /* renamed from: d */
    Object mo36958d(AbstractC15402a abstractC15402a, Object obj);

    /* renamed from: e */
    EnumC15404c mo36959e(AbstractC15402a abstractC15402a);

    /* renamed from: f */
    Object mo36960f(AbstractC15402a abstractC15402a);

    /* renamed from: g */
    void mo36961g(String str, InterfaceC15403b interfaceC15403b);

    /* renamed from: h */
    Object mo36962h(AbstractC15402a abstractC15402a, EnumC15404c enumC15404c);
}
