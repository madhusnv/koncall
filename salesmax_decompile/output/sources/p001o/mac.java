package p001o;

import p001o.x18;
import p001o.z18;

/* loaded from: classes3.dex */
public final class mac extends z18 {

    /* renamed from: m */
    public static final C15262b f35055m = new C15262b(null);

    /* renamed from: n */
    public static final mac f35056n = new mac(new C15261a());

    /* renamed from: k */
    public final k16 f35057k;

    /* renamed from: l */
    public final int f35058l;

    /* renamed from: o.mac$a */
    public static final class C15261a extends z18.C18543a {

        /* renamed from: k */
        public k16 f35059k;

        /* renamed from: l */
        public j0i f35060l;

        /* renamed from: m */
        public vdh f35061m = vt7.m53402a(vdh.f50220a);

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: a */
        public vdh mo38635a() {
            return this.f35061m;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: g */
        public void mo38636g(vdh vdhVar) {
            sq8.m48649h(vdhVar, "<set-?>");
            this.f35061m = vdhVar;
        }

        /* renamed from: u */
        public final k16 m38637u() {
            return this.f35059k;
        }

        /* renamed from: v */
        public final j0i m38638v() {
            return this.f35060l;
        }

        /* renamed from: w */
        public final void m38639w(k16 k16Var) {
            this.f35059k = k16Var;
        }

        /* renamed from: x */
        public final void m38640x(j0i j0iVar) {
            this.f35060l = j0iVar;
        }
    }

    /* renamed from: o.mac$b */
    public static final class C15262b {
        public C15262b() {
        }

        public /* synthetic */ C15262b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mac m38641a() {
            return mac.f35056n;
        }

        /* renamed from: b */
        public final mac m38642b(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15261a c15261a = new C15261a();
            xk7Var.invoke(c15261a);
            return new mac(c15261a, null);
        }
    }

    public /* synthetic */ mac(C15261a c15261a, id5 id5Var) {
        this(c15261a);
    }

    /* renamed from: r */
    public static final y3i m38631r(mac macVar, x18.InterfaceC18030a interfaceC18030a) {
        sq8.m48649h(interfaceC18030a, "<this>");
        super.mo38632a().invoke(interfaceC18030a);
        if (interfaceC18030a instanceof C15261a) {
            C15261a c15261a = (C15261a) interfaceC18030a;
            c15261a.m38639w(macVar.f35057k);
            c15261a.m38640x(j0i.m33017a(macVar.f35058l));
        }
        return y3i.f54824a;
    }

    @Override // p001o.z18, p001o.x18
    /* renamed from: a */
    public xk7 mo38632a() {
        return new xk7() { // from class: o.lac
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return mac.m38631r(this.f33534a, (x18.InterfaceC18030a) obj);
            }
        };
    }

    /* renamed from: p */
    public final k16 m38633p() {
        return this.f35057k;
    }

    /* renamed from: q */
    public final int m38634q() {
        return this.f35058l;
    }

    public mac(C15261a c15261a) {
        super(c15261a);
        this.f35057k = c15261a.m38637u();
        j0i j0iVarM38638v = c15261a.m38638v();
        this.f35058l = j0iVarM38638v != null ? j0iVarM38638v.m33022h() : c15261a.mo55557i();
    }
}
