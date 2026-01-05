package p001o;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p001o.aid;
import p001o.xd9;

/* loaded from: classes4.dex */
public abstract class che {

    /* renamed from: a */
    public static final Logger f18189a = Logger.getLogger(che.class.getName());

    /* renamed from: b */
    public static final ConcurrentMap f18190b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentMap f18191c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap f18192d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap f18193e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap f18194f = new ConcurrentHashMap();

    /* renamed from: o.che$a */
    public class C12683a implements InterfaceC12686d {

        /* renamed from: a */
        public final /* synthetic */ md9 f18195a;

        public C12683a(md9 md9Var) {
            this.f18195a = md9Var;
        }

        @Override // p001o.che.InterfaceC12686d
        /* renamed from: a */
        public Class mo21283a() {
            return this.f18195a.getClass();
        }

        @Override // p001o.che.InterfaceC12686d
        /* renamed from: b */
        public Set mo21284b() {
            return this.f18195a.m38757h();
        }

        @Override // p001o.che.InterfaceC12686d
        /* renamed from: c */
        public wc9 mo21285c(Class cls) throws GeneralSecurityException {
            try {
                return new xc9(this.f18195a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        @Override // p001o.che.InterfaceC12686d
        /* renamed from: d */
        public wc9 mo21286d() {
            md9 md9Var = this.f18195a;
            return new xc9(md9Var, md9Var.m38754a());
        }
    }

    /* renamed from: o.che$b */
    public class C12684b implements InterfaceC12685c {

        /* renamed from: a */
        public final /* synthetic */ md9 f18196a;

        public C12684b(md9 md9Var) {
            this.f18196a = md9Var;
        }
    }

    /* renamed from: o.che$c */
    public interface InterfaceC12685c {
    }

    /* renamed from: o.che$d */
    public interface InterfaceC12686d {
        /* renamed from: a */
        Class mo21283a();

        /* renamed from: b */
        Set mo21284b();

        /* renamed from: c */
        wc9 mo21285c(Class cls);

        /* renamed from: d */
        wc9 mo21286d();
    }

    /* renamed from: a */
    public static Object m21263a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static InterfaceC12686d m21264b(md9 md9Var) {
        return new C12683a(md9Var);
    }

    /* renamed from: c */
    public static InterfaceC12685c m21265c(md9 md9Var) {
        return new C12684b(md9Var);
    }

    /* renamed from: d */
    public static synchronized void m21266d(String str, Class cls, boolean z) {
        ConcurrentMap concurrentMap = f18190b;
        if (concurrentMap.containsKey(str)) {
            InterfaceC12686d interfaceC12686d = (InterfaceC12686d) concurrentMap.get(str);
            if (!interfaceC12686d.mo21283a().equals(cls)) {
                f18189a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, interfaceC12686d.mo21283a().getName(), cls.getName()));
            }
            if (z && !((Boolean) f18192d.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
        }
    }

    /* renamed from: e */
    public static Class m21267e(Class cls) {
        did didVar = (did) f18194f.get(cls);
        if (didVar == null) {
            return null;
        }
        return didVar.mo17646a();
    }

    /* renamed from: f */
    public static synchronized InterfaceC12686d m21268f(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = f18190b;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (InterfaceC12686d) concurrentMap.get(str);
    }

    /* renamed from: g */
    public static wc9 m21269g(String str, Class cls) throws GeneralSecurityException {
        InterfaceC12686d interfaceC12686dM21268f = m21268f(str);
        if (cls == null) {
            return interfaceC12686dM21268f.mo21286d();
        }
        if (interfaceC12686dM21268f.mo21284b().contains(cls)) {
            return interfaceC12686dM21268f.mo21285c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + interfaceC12686dM21268f.mo21283a() + ", supported primitives: " + m21281s(interfaceC12686dM21268f.mo21284b()));
    }

    /* renamed from: h */
    public static Object m21270h(String str, yq1 yq1Var, Class cls) {
        return m21272j(str, yq1Var, (Class) m21263a(cls));
    }

    /* renamed from: i */
    public static Object m21271i(String str, byte[] bArr, Class cls) {
        return m21270h(str, yq1.m58080j(bArr), cls);
    }

    /* renamed from: j */
    public static Object m21272j(String str, yq1 yq1Var, Class cls) {
        return m21269g(str, cls).mo54212b(yq1Var);
    }

    /* renamed from: k */
    public static aid m21273k(yd9 yd9Var, Class cls) {
        return m21274l(yd9Var, null, cls);
    }

    /* renamed from: l */
    public static aid m21274l(yd9 yd9Var, wc9 wc9Var, Class cls) {
        return m21275m(yd9Var, wc9Var, (Class) m21263a(cls));
    }

    /* renamed from: m */
    public static aid m21275m(yd9 yd9Var, wc9 wc9Var, Class cls) throws GeneralSecurityException {
        wqi.m54887d(yd9Var.m57635f());
        aid aidVarM17153f = aid.m17153f(cls);
        for (xd9.C18118c c18118c : yd9Var.m57635f().m56054M()) {
            if (c18118c.m56071N() == gd9.ENABLED) {
                aid.C12193b c12193bM17154a = aidVarM17153f.m17154a((wc9Var == null || !wc9Var.mo54211a(c18118c.m56068K().m40322L())) ? m21272j(c18118c.m56068K().m40322L(), c18118c.m56068K().m40323M(), cls) : wc9Var.mo54212b(c18118c.m56068K().m40323M()), c18118c);
                if (c18118c.m56069L() == yd9Var.m57635f().m56055N()) {
                    aidVarM17153f.m17159g(c12193bM17154a);
                }
            }
        }
        return aidVarM17153f;
    }

    /* renamed from: n */
    public static wc9 m21276n(String str) {
        return m21268f(str).mo21286d();
    }

    /* renamed from: o */
    public static synchronized rcb m21277o(id9 id9Var) {
        wc9 wc9VarM21276n;
        wc9VarM21276n = m21276n(id9Var.m31928L());
        if (!((Boolean) f18192d.get(id9Var.m31928L())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + id9Var.m31928L());
        }
        return wc9VarM21276n.mo54213c(id9Var.m31929M());
    }

    /* renamed from: p */
    public static synchronized nc9 m21278p(id9 id9Var) {
        wc9 wc9VarM21276n;
        wc9VarM21276n = m21276n(id9Var.m31928L());
        if (!((Boolean) f18192d.get(id9Var.m31928L())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + id9Var.m31928L());
        }
        return wc9VarM21276n.mo54214d(id9Var.m31929M());
    }

    /* renamed from: q */
    public static synchronized void m21279q(md9 md9Var, boolean z) {
        if (md9Var == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strMo20422c = md9Var.mo20422c();
        m21266d(strMo20422c, md9Var.getClass(), z);
        ConcurrentMap concurrentMap = f18190b;
        if (!concurrentMap.containsKey(strMo20422c)) {
            concurrentMap.put(strMo20422c, m21264b(md9Var));
            f18191c.put(strMo20422c, m21265c(md9Var));
        }
        f18192d.put(strMo20422c, Boolean.valueOf(z));
    }

    /* renamed from: r */
    public static synchronized void m21280r(did didVar) {
        if (didVar == null) {
            throw new IllegalArgumentException("wrapper must be non-null");
        }
        Class clsMo17648c = didVar.mo17648c();
        ConcurrentMap concurrentMap = f18194f;
        if (concurrentMap.containsKey(clsMo17648c)) {
            did didVar2 = (did) concurrentMap.get(clsMo17648c);
            if (!didVar.getClass().equals(didVar2.getClass())) {
                f18189a.warning("Attempted overwrite of a registered SetWrapper for type " + clsMo17648c);
                throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsMo17648c.getName(), didVar2.getClass().getName(), didVar.getClass().getName()));
            }
        }
        concurrentMap.put(clsMo17648c, didVar);
    }

    /* renamed from: s */
    public static String m21281s(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static Object m21282t(aid aidVar, Class cls) throws GeneralSecurityException {
        did didVar = (did) f18194f.get(cls);
        if (didVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + aidVar.m17157d().getName());
        }
        if (didVar.mo17646a().equals(aidVar.m17157d())) {
            return didVar.mo17647b(aidVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + didVar.mo17646a() + ", got " + aidVar.m17157d());
    }
}
