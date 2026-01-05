package p001o;

import p001o.fbj;

/* loaded from: classes6.dex */
public class nra {

    /* renamed from: a */
    public final C15645a f37202a;

    /* renamed from: b */
    public final Object f37203b;

    /* renamed from: c */
    public final Object f37204c;

    /* renamed from: o.nra$a */
    public static class C15645a {

        /* renamed from: a */
        public final fbj.EnumC13396b f37205a;

        /* renamed from: b */
        public final Object f37206b;

        /* renamed from: c */
        public final fbj.EnumC13396b f37207c;

        /* renamed from: d */
        public final Object f37208d;

        public C15645a(fbj.EnumC13396b enumC13396b, Object obj, fbj.EnumC13396b enumC13396b2, Object obj2) {
            this.f37205a = enumC13396b;
            this.f37206b = obj;
            this.f37207c = enumC13396b2;
            this.f37208d = obj2;
        }
    }

    public nra(fbj.EnumC13396b enumC13396b, Object obj, fbj.EnumC13396b enumC13396b2, Object obj2) {
        this.f37202a = new C15645a(enumC13396b, obj, enumC13396b2, obj2);
        this.f37203b = obj;
        this.f37204c = obj2;
    }

    /* renamed from: b */
    public static int m41004b(C15645a c15645a, Object obj, Object obj2) {
        return fu6.m27490d(c15645a.f37205a, 1, obj) + fu6.m27490d(c15645a.f37207c, 2, obj2);
    }

    /* renamed from: d */
    public static nra m41005d(fbj.EnumC13396b enumC13396b, Object obj, fbj.EnumC13396b enumC13396b2, Object obj2) {
        return new nra(enumC13396b, obj, enumC13396b2, obj2);
    }

    /* renamed from: e */
    public static void m41006e(nf3 nf3Var, C15645a c15645a, Object obj, Object obj2) {
        fu6.m27498z(nf3Var, c15645a.f37205a, 1, obj);
        fu6.m27498z(nf3Var, c15645a.f37207c, 2, obj2);
    }

    /* renamed from: a */
    public int m41007a(int i, Object obj, Object obj2) {
        return nf3.m40457T(i) + nf3.m40438A(m41004b(this.f37202a, obj, obj2));
    }

    /* renamed from: c */
    public C15645a m41008c() {
        return this.f37202a;
    }
}
