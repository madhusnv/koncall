package p001o;

/* loaded from: classes4.dex */
public final class ypa implements q5f {

    /* renamed from: b */
    public static final qcb f55791b = new C18450a();

    /* renamed from: a */
    public final qcb f55792a;

    /* renamed from: o.ypa$a */
    public class C18450a implements qcb {
        @Override // p001o.qcb
        /* renamed from: a */
        public ocb mo45094a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p001o.qcb
        /* renamed from: b */
        public boolean mo45095b(Class cls) {
            return false;
        }
    }

    /* renamed from: o.ypa$b */
    public static class C18451b implements qcb {

        /* renamed from: a */
        public qcb[] f55793a;

        public C18451b(qcb... qcbVarArr) {
            this.f55793a = qcbVarArr;
        }

        @Override // p001o.qcb
        /* renamed from: a */
        public ocb mo45094a(Class cls) {
            for (qcb qcbVar : this.f55793a) {
                if (qcbVar.mo45095b(cls)) {
                    return qcbVar.mo45094a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p001o.qcb
        /* renamed from: b */
        public boolean mo45095b(Class cls) {
            for (qcb qcbVar : this.f55793a) {
                if (qcbVar.mo45095b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ypa() {
        this(m58065b());
    }

    /* renamed from: b */
    public static qcb m58065b() {
        return new C18451b(un7.m51804c(), m58066c());
    }

    /* renamed from: c */
    public static qcb m58066c() {
        try {
            return (qcb) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f55791b;
        }
    }

    /* renamed from: d */
    public static boolean m58067d(ocb ocbVar) {
        return ocbVar.mo30237c() == u1e.PROTO2;
    }

    /* renamed from: e */
    public static o5f m58068e(Class cls, ocb ocbVar) {
        return vn7.class.isAssignableFrom(cls) ? m58067d(ocbVar) ? ycb.m57527Q(cls, ocbVar, qub.m45858b(), oea.m42123b(), z5f.m58792L(), wp6.m54788b(), vra.m53343b()) : ycb.m57527Q(cls, ocbVar, qub.m45858b(), oea.m42123b(), z5f.m58792L(), null, vra.m53343b()) : m58067d(ocbVar) ? ycb.m57527Q(cls, ocbVar, qub.m45857a(), oea.m42122a(), z5f.m58787G(), wp6.m54787a(), vra.m53342a()) : ycb.m57527Q(cls, ocbVar, qub.m45857a(), oea.m42122a(), z5f.m58788H(), null, vra.m53342a());
    }

    @Override // p001o.q5f
    /* renamed from: a */
    public o5f mo44828a(Class cls) {
        z5f.m58789I(cls);
        ocb ocbVarMo45094a = this.f55792a.mo45094a(cls);
        return ocbVarMo45094a.mo30235a() ? vn7.class.isAssignableFrom(cls) ? adb.m16903m(z5f.m58792L(), wp6.m54788b(), ocbVarMo45094a.mo30236b()) : adb.m16903m(z5f.m58787G(), wp6.m54787a(), ocbVarMo45094a.mo30236b()) : m58068e(cls, ocbVarMo45094a);
    }

    public ypa(qcb qcbVar) {
        this.f55792a = (qcb) xn8.m56500b(qcbVar, "messageInfoFactory");
    }
}
