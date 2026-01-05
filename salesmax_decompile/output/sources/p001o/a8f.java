package p001o;

import p001o.q74;

/* loaded from: classes3.dex */
public final class a8f implements q74.InterfaceC16311b {

    /* renamed from: b */
    public static final C12114a f14296b = new C12114a(null);

    /* renamed from: a */
    public final q74 f14297a;

    /* renamed from: o.a8f$a */
    public static final class C12114a implements q74.InterfaceC16312c {
        public C12114a() {
        }

        public /* synthetic */ C12114a(id5 id5Var) {
            this();
        }
    }

    public a8f(q74 q74Var) {
        sq8.m48649h(q74Var, "callContext");
        this.f14297a = q74Var;
    }

    /* renamed from: b */
    public final q74 m16682b() {
        return this.f14297a;
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return q74.InterfaceC16311b.a.m44920a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return q74.InterfaceC16311b.a.m44921b(this, interfaceC16312c);
    }

    @Override // p001o.q74.InterfaceC16311b
    public q74.InterfaceC16312c getKey() {
        return f14296b;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return q74.InterfaceC16311b.a.m44922c(this, interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return q74.InterfaceC16311b.a.m44923d(this, q74Var);
    }
}
