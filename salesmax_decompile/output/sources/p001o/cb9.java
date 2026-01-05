package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class cb9 {

    /* renamed from: a */
    public final a8 f17679a;

    /* renamed from: b */
    public final boolean f17680b;

    /* renamed from: c */
    public final boolean f17681c;

    /* renamed from: d */
    public int f17682d;

    /* renamed from: o.cb9$a */
    public static final class C12604a extends qre implements ql7 {

        /* renamed from: b */
        public int f17683b;

        /* renamed from: c */
        public /* synthetic */ Object f17684c;

        public C12604a(n64 n64Var) {
            super(3, n64Var);
        }

        @Override // p001o.ql7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i85 i85Var, y3i y3iVar, n64 n64Var) {
            C12604a c12604a = cb9.this.new C12604a(n64Var);
            c12604a.f17684c = i85Var;
            return c12604a.invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f17683b;
            if (i == 0) {
                wre.m54934b(obj);
                i85 i85Var = (i85) this.f17684c;
                byte bM16589F = cb9.this.f17679a.m16589F();
                if (bM16589F == 1) {
                    return cb9.this.m20655j(true);
                }
                if (bM16589F == 0) {
                    return cb9.this.m20655j(false);
                }
                if (bM16589F != 6) {
                    if (bM16589F == 8) {
                        return cb9.this.m20651f();
                    }
                    a8.m16582x(cb9.this.f17679a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new qe9();
                }
                cb9 cb9Var = cb9.this;
                this.f17683b = 1;
                obj = cb9Var.m20653h(i85Var, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return (k89) obj;
        }
    }

    /* renamed from: o.cb9$b */
    public static final class C12605b extends o64 {

        /* renamed from: a */
        public Object f17686a;

        /* renamed from: b */
        public Object f17687b;

        /* renamed from: c */
        public Object f17688c;

        /* renamed from: d */
        public Object f17689d;

        /* renamed from: e */
        public /* synthetic */ Object f17690e;

        /* renamed from: g */
        public int f17692g;

        public C12605b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f17690e = obj;
            this.f17692g |= Integer.MIN_VALUE;
            return cb9.this.m20653h(null, this);
        }
    }

    public cb9(u79 u79Var, a8 a8Var) {
        sq8.m48649h(u79Var, "configuration");
        sq8.m48649h(a8Var, "lexer");
        this.f17679a = a8Var;
        this.f17680b = u79Var.m51139p();
        this.f17681c = u79Var.m51126c();
    }

    /* renamed from: e */
    public final k89 m20650e() {
        byte bM16589F = this.f17679a.m16589F();
        if (bM16589F == 1) {
            return m20655j(true);
        }
        if (bM16589F == 0) {
            return m20655j(false);
        }
        if (bM16589F == 6) {
            int i = this.f17682d + 1;
            this.f17682d = i;
            this.f17682d--;
            return i == 200 ? m20652g() : m20654i();
        }
        if (bM16589F == 8) {
            return m20651f();
        }
        a8.m16582x(this.f17679a, "Cannot read Json element because of unexpected " + b8.m18265c(bM16589F), 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: f */
    public final k89 m20651f() {
        byte bMo16609j = this.f17679a.mo16609j();
        if (this.f17679a.m16589F() == 4) {
            a8.m16582x(this.f17679a, "Unexpected leading comma", 0, null, 6, null);
            throw new qe9();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f17679a.mo16604e()) {
            arrayList.add(m20650e());
            bMo16609j = this.f17679a.mo16609j();
            if (bMo16609j != 4) {
                a8 a8Var = this.f17679a;
                boolean z = bMo16609j == 9;
                int i = a8Var.f14266a;
                if (!z) {
                    a8.m16582x(a8Var, "Expected end of the array or comma", i, null, 4, null);
                    throw new qe9();
                }
            }
        }
        if (bMo16609j == 8) {
            this.f17679a.m16610k((byte) 9);
        } else if (bMo16609j == 4) {
            if (!this.f17681c) {
                w89.m54059g(this.f17679a, "array");
                throw new qe9();
            }
            this.f17679a.m16610k((byte) 9);
        }
        return new q79(arrayList);
    }

    /* renamed from: g */
    public final k89 m20652g() {
        return (k89) h85.m29971b(new g85(new C12604a(null)), y3i.f54824a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20653h(i85 i85Var, n64 n64Var) {
        C12605b c12605b;
        cb9 cb9Var;
        LinkedHashMap linkedHashMap;
        Object obj;
        C12605b c12605b2;
        byte b;
        i85 i85Var2;
        if (n64Var instanceof C12605b) {
            c12605b = (C12605b) n64Var;
            int i = c12605b.f17692g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12605b.f17692g = i - Integer.MIN_VALUE;
            } else {
                c12605b = new C12605b(n64Var);
            }
        }
        Object obj2 = c12605b.f17690e;
        Object objM51918f = uq8.m51918f();
        int i2 = c12605b.f17692g;
        if (i2 == 0) {
            wre.m54934b(obj2);
            byte bM16610k = this.f17679a.m16610k((byte) 6);
            if (this.f17679a.m16589F() == 4) {
                a8.m16582x(this.f17679a, "Unexpected leading comma", 0, null, 6, null);
                throw new qe9();
            }
            cb9Var = this;
            linkedHashMap = new LinkedHashMap();
            obj = objM51918f;
            c12605b2 = c12605b;
            b = bM16610k;
            i85Var2 = i85Var;
            if (cb9Var.f17679a.mo16604e()) {
            }
            if (b == 6) {
            }
            return new z99(linkedHashMap);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) c12605b.f17689d;
        linkedHashMap = (LinkedHashMap) c12605b.f17688c;
        cb9Var = (cb9) c12605b.f17687b;
        i85 i85Var3 = (i85) c12605b.f17686a;
        wre.m54934b(obj2);
        c12605b2 = c12605b;
        Object obj3 = objM51918f;
        linkedHashMap.put(str, (k89) obj2);
        byte bMo16609j = cb9Var.f17679a.mo16609j();
        if (bMo16609j == 4) {
            if (bMo16609j != 7) {
                a8.m16582x(cb9Var.f17679a, "Expected end of the object or comma", 0, null, 6, null);
                throw new qe9();
            }
            b = bMo16609j;
            if (b == 6) {
                cb9Var.f17679a.m16610k((byte) 7);
            } else if (b == 4) {
                if (!cb9Var.f17681c) {
                    w89.m54060h(cb9Var.f17679a, null, 1, null);
                    throw new qe9();
                }
                cb9Var.f17679a.m16610k((byte) 7);
            }
            return new z99(linkedHashMap);
        }
        obj = obj3;
        b = bMo16609j;
        i85Var2 = i85Var3;
        if (cb9Var.f17679a.mo16604e()) {
            String strM16615q = cb9Var.f17680b ? cb9Var.f17679a.m16615q() : cb9Var.f17679a.m16613o();
            cb9Var.f17679a.m16610k((byte) 5);
            y3i y3iVar = y3i.f54824a;
            c12605b2.f17686a = i85Var2;
            c12605b2.f17687b = cb9Var;
            c12605b2.f17688c = linkedHashMap;
            c12605b2.f17689d = strM16615q;
            c12605b2.f17692g = 1;
            Object objMo31714b = i85Var2.mo31714b(y3iVar, c12605b2);
            if (objMo31714b == obj) {
                return obj;
            }
            i85Var3 = i85Var2;
            obj2 = objMo31714b;
            Object obj4 = obj;
            str = strM16615q;
            obj3 = obj4;
            linkedHashMap.put(str, (k89) obj2);
            byte bMo16609j2 = cb9Var.f17679a.mo16609j();
            if (bMo16609j2 == 4) {
            }
        }
        if (b == 6) {
        }
        return new z99(linkedHashMap);
    }

    /* renamed from: i */
    public final k89 m20654i() {
        byte bM16610k = this.f17679a.m16610k((byte) 6);
        if (this.f17679a.m16589F() == 4) {
            a8.m16582x(this.f17679a, "Unexpected leading comma", 0, null, 6, null);
            throw new qe9();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f17679a.mo16604e()) {
                break;
            }
            String strM16615q = this.f17680b ? this.f17679a.m16615q() : this.f17679a.m16613o();
            this.f17679a.m16610k((byte) 5);
            linkedHashMap.put(strM16615q, m20650e());
            bM16610k = this.f17679a.mo16609j();
            if (bM16610k != 4) {
                if (bM16610k != 7) {
                    a8.m16582x(this.f17679a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new qe9();
                }
            }
        }
        if (bM16610k == 6) {
            this.f17679a.m16610k((byte) 7);
        } else if (bM16610k == 4) {
            if (!this.f17681c) {
                w89.m54060h(this.f17679a, null, 1, null);
                throw new qe9();
            }
            this.f17679a.m16610k((byte) 7);
        }
        return new z99(linkedHashMap);
    }

    /* renamed from: j */
    public final ea9 m20655j(boolean z) {
        String strM16615q = (this.f17680b || !z) ? this.f17679a.m16615q() : this.f17679a.m16613o();
        return (z || !sq8.m48644c(strM16615q, "null")) ? new q99(strM16615q, z, null, 4, null) : w99.INSTANCE;
    }
}
