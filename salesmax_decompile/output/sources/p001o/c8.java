package p001o;

import p001o.bff;
import p001o.p9g;

/* loaded from: classes6.dex */
public abstract class c8 extends mrb implements b89 {

    /* renamed from: c */
    public final p79 f17488c;

    /* renamed from: d */
    public final k89 f17489d;

    /* renamed from: e */
    public final u79 f17490e;

    public /* synthetic */ c8(p79 p79Var, k89 k89Var, id5 id5Var) {
        this(p79Var, k89Var);
    }

    @Override // p001o.ajg, p001o.w75
    /* renamed from: C */
    public Object mo17216C(bn5 bn5Var) {
        sq8.m48649h(bn5Var, "deserializer");
        return vdd.m52592d(this, bn5Var);
    }

    @Override // p001o.w75
    /* renamed from: D */
    public boolean mo20417D() {
        return !(f0() instanceof w99);
    }

    @Override // p001o.mrb
    /* renamed from: Z */
    public String mo20418Z(String str, String str2) {
        sq8.m48649h(str, "parentName");
        sq8.m48649h(str2, "childName");
        return str2;
    }

    @Override // p001o.jo3
    /* renamed from: a */
    public wff mo20419a() {
        return mo18278d().mo43085a();
    }

    @Override // p001o.w75
    /* renamed from: b */
    public jo3 mo20420b(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        k89 k89VarF0 = f0();
        bff kind = uefVar.getKind();
        if (sq8.m48644c(kind, p9g.C16038b.f39682a) ? true : kind instanceof udd) {
            p79 p79VarMo18278d = mo18278d();
            if (k89VarF0 instanceof q79) {
                return new ab9(p79VarMo18278d, (q79) k89VarF0);
            }
            throw w89.m54056d(-1, "Expected " + kge.m35689b(q79.class) + " as the serialized body of " + uefVar.mo16766h() + ", but had " + kge.m35689b(k89VarF0.getClass()));
        }
        if (!sq8.m48644c(kind, p9g.C16039c.f39683a)) {
            p79 p79VarMo18278d2 = mo18278d();
            if (k89VarF0 instanceof z99) {
                return new za9(p79VarMo18278d2, (z99) k89VarF0, null, null, 12, null);
            }
            throw w89.m54056d(-1, "Expected " + kge.m35689b(z99.class) + " as the serialized body of " + uefVar.mo16766h() + ", but had " + kge.m35689b(k89VarF0.getClass()));
        }
        p79 p79VarMo18278d3 = mo18278d();
        uef uefVarM16935a = adj.m16935a(uefVar.mo16765g(0), p79VarMo18278d3.mo43085a());
        bff kind2 = uefVarM16935a.getKind();
        if ((kind2 instanceof vhd) || sq8.m48644c(kind2, bff.C12373b.f16099a)) {
            p79 p79VarMo18278d4 = mo18278d();
            if (k89VarF0 instanceof z99) {
                return new bb9(p79VarMo18278d4, (z99) k89VarF0);
            }
            throw w89.m54056d(-1, "Expected " + kge.m35689b(z99.class) + " as the serialized body of " + uefVar.mo16766h() + ", but had " + kge.m35689b(k89VarF0.getClass()));
        }
        if (!p79VarMo18278d3.m43087d().m51125b()) {
            throw w89.m54055c(uefVarM16935a);
        }
        p79 p79VarMo18278d5 = mo18278d();
        if (k89VarF0 instanceof q79) {
            return new ab9(p79VarMo18278d5, (q79) k89VarF0);
        }
        throw w89.m54056d(-1, "Expected " + kge.m35689b(q79.class) + " as the serialized body of " + uefVar.mo16766h() + ", but had " + kge.m35689b(k89VarF0.getClass()));
    }

    /* renamed from: c */
    public void mo18548c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
    }

    @Override // p001o.b89
    /* renamed from: d */
    public p79 mo18278d() {
        return this.f17488c;
    }

    public final q99 d0(ea9 ea9Var, String str) {
        q99 q99Var = ea9Var instanceof q99 ? (q99) ea9Var : null;
        if (q99Var != null) {
            return q99Var;
        }
        throw w89.m54056d(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    public abstract k89 e0(String str);

    @Override // p001o.b89
    /* renamed from: f */
    public k89 mo18279f() {
        return f0();
    }

    public final k89 f0() {
        k89 k89VarE0;
        String str = (String) m17233U();
        return (str == null || (k89VarE0 = e0(str)) == null) ? s0() : k89VarE0;
    }

    @Override // p001o.ajg
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean mo17222J(String str) {
        sq8.m48649h(str, "tag");
        try {
            Boolean boolM36738c = l89.m36738c(r0(str));
            if (boolM36738c != null) {
                return boolM36738c.booleanValue();
            }
            t0("boolean");
            throw new qe9();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte mo17223K(String str) {
        sq8.m48649h(str, "tag");
        try {
            int iM36742g = l89.m36742g(r0(str));
            boolean z = false;
            if (-128 <= iM36742g && iM36742g <= 127) {
                z = true;
            }
            Byte bValueOf = z ? Byte.valueOf((byte) iM36742g) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            t0("byte");
            throw new qe9();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char mo17224L(String str) {
        sq8.m48649h(str, "tag");
        try {
            return h9g.k1(r0(str).mo24656d());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double mo17225M(String str) {
        sq8.m48649h(str, "tag");
        try {
            double dM36740e = l89.m36740e(r0(str));
            if (!mo18278d().m43087d().m51124a()) {
                if (!((Double.isInfinite(dM36740e) || Double.isNaN(dM36740e)) ? false : true)) {
                    throw w89.m54053a(Double.valueOf(dM36740e), str, f0().toString());
                }
            }
            return dM36740e;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int mo17226N(String str, uef uefVar) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(uefVar, "enumDescriptor");
        return u99.m51248j(uefVar, mo18278d(), r0(str).mo24656d(), null, 4, null);
    }

    @Override // p001o.ajg
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float mo17227O(String str) {
        sq8.m48649h(str, "tag");
        try {
            float fM36741f = l89.m36741f(r0(str));
            if (!mo18278d().m43087d().m51124a()) {
                if (!((Float.isInfinite(fM36741f) || Float.isNaN(fM36741f)) ? false : true)) {
                    throw w89.m54053a(Float.valueOf(fM36741f), str, f0().toString());
                }
            }
            return fM36741f;
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public w75 mo17228P(String str, uef uefVar) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(uefVar, "inlineDescriptor");
        return r7g.m46312b(uefVar) ? new c89(new j8g(r0(str).mo24656d()), mo18278d()) : super.mo17228P(str, uefVar);
    }

    @Override // p001o.ajg
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int mo17229Q(String str) {
        sq8.m48649h(str, "tag");
        try {
            return l89.m36742g(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long mo17230R(String str) {
        sq8.m48649h(str, "tag");
        try {
            return l89.m36745j(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short mo17231S(String str) {
        sq8.m48649h(str, "tag");
        try {
            int iM36742g = l89.m36742g(r0(str));
            boolean z = false;
            if (-32768 <= iM36742g && iM36742g <= 32767) {
                z = true;
            }
            Short shValueOf = z ? Short.valueOf((short) iM36742g) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            t0("short");
            throw new qe9();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new qe9();
        }
    }

    @Override // p001o.ajg
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String mo17232T(String str) {
        sq8.m48649h(str, "tag");
        ea9 ea9VarR0 = r0(str);
        if (mo18278d().m43087d().m51139p() || d0(ea9VarR0, "string").m45033n()) {
            if (ea9VarR0 instanceof w99) {
                throw w89.m54057e(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return ea9VarR0.mo24656d();
        }
        throw w89.m54057e(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
    }

    public final ea9 r0(String str) {
        sq8.m48649h(str, "tag");
        k89 k89VarE0 = e0(str);
        ea9 ea9Var = k89VarE0 instanceof ea9 ? (ea9) k89VarE0 : null;
        if (ea9Var != null) {
            return ea9Var;
        }
        throw w89.m54057e(-1, "Expected JsonPrimitive at " + str + ", found " + k89VarE0, f0().toString());
    }

    public abstract k89 s0();

    public final Void t0(String str) {
        throw w89.m54057e(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    @Override // p001o.ajg, p001o.w75
    /* renamed from: z */
    public w75 mo17257z(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return m17233U() != null ? super.mo17257z(uefVar) : new fa9(mo18278d(), s0()).mo17257z(uefVar);
    }

    public c8(p79 p79Var, k89 k89Var) {
        this.f17488c = p79Var;
        this.f17489d = k89Var;
        this.f17490e = mo18278d().m43087d();
    }
}
