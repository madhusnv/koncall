package p001o;

/* loaded from: classes6.dex */
public final class zpa implements p5f {

    /* renamed from: b */
    public static final pcb f57486b = new C18690a();

    /* renamed from: a */
    public final pcb f57487a;

    /* renamed from: o.zpa$a */
    public static class C18690a implements pcb {
        @Override // p001o.pcb
        /* renamed from: a */
        public ncb mo43342a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p001o.pcb
        /* renamed from: b */
        public boolean mo43343b(Class cls) {
            return false;
        }
    }

    /* renamed from: o.zpa$b */
    public static class C18691b implements pcb {

        /* renamed from: a */
        public pcb[] f57488a;

        public C18691b(pcb... pcbVarArr) {
            this.f57488a = pcbVarArr;
        }

        @Override // p001o.pcb
        /* renamed from: a */
        public ncb mo43342a(Class cls) {
            for (pcb pcbVar : this.f57488a) {
                if (pcbVar.mo43343b(cls)) {
                    return pcbVar.mo43342a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p001o.pcb
        /* renamed from: b */
        public boolean mo43343b(Class cls) {
            for (pcb pcbVar : this.f57488a) {
                if (pcbVar.mo43343b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public zpa() {
        this(m59677b());
    }

    /* renamed from: b */
    public static pcb m59677b() {
        return new C18691b(tn7.m50235c(), m59678c());
    }

    /* renamed from: c */
    public static pcb m59678c() {
        try {
            return (pcb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f57486b;
        }
    }

    /* renamed from: d */
    public static boolean m59679d(ncb ncbVar) {
        return ncbVar.mo28445c() == t1e.PROTO2;
    }

    /* renamed from: e */
    public static n5f m59680e(Class cls, ncb ncbVar) {
        return wn7.class.isAssignableFrom(cls) ? m59679d(ncbVar) ? xcb.m55985R(cls, ncbVar, pub.m44211b(), pea.m43520b(), y5f.m57254M(), vp6.m53174b(), ura.m51963b()) : xcb.m55985R(cls, ncbVar, pub.m44211b(), pea.m43520b(), y5f.m57254M(), null, ura.m51963b()) : m59679d(ncbVar) ? xcb.m55985R(cls, ncbVar, pub.m44210a(), pea.m43519a(), y5f.m57249H(), vp6.m53173a(), ura.m51962a()) : xcb.m55985R(cls, ncbVar, pub.m44210a(), pea.m43519a(), y5f.m57250I(), null, ura.m51962a());
    }

    @Override // p001o.p5f
    /* renamed from: a */
    public n5f mo42979a(Class cls) {
        y5f.m57251J(cls);
        ncb ncbVarMo43342a = this.f57487a.mo43342a(cls);
        return ncbVarMo43342a.mo28443a() ? wn7.class.isAssignableFrom(cls) ? zcb.m59184m(y5f.m57254M(), vp6.m53174b(), ncbVarMo43342a.mo28444b()) : zcb.m59184m(y5f.m57249H(), vp6.m53173a(), ncbVarMo43342a.mo28444b()) : m59680e(cls, ncbVarMo43342a);
    }

    public zpa(pcb pcbVar) {
        this.f57487a = (pcb) yn8.m58013b(pcbVar, "messageInfoFactory");
    }
}
