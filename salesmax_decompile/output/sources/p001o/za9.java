package p001o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.bff;

/* loaded from: classes6.dex */
public class za9 extends c8 {

    /* renamed from: f */
    public final z99 f56839f;

    /* renamed from: g */
    public final String f56840g;

    /* renamed from: h */
    public final uef f56841h;

    /* renamed from: i */
    public int f56842i;

    /* renamed from: j */
    public boolean f56843j;

    public /* synthetic */ za9(p79 p79Var, z99 z99Var, String str, uef uefVar, int i, id5 id5Var) {
        this(p79Var, z99Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uefVar);
    }

    @Override // p001o.c8, p001o.w75
    /* renamed from: D */
    public boolean mo20417D() {
        return !this.f56843j && super.mo20417D();
    }

    @Override // p001o.mrb
    public String a0(uef uefVar, int i) {
        Object next;
        sq8.m48649h(uefVar, "descriptor");
        v99 v99VarM51250l = u99.m51250l(uefVar, mo18278d());
        String strMo16763e = uefVar.mo16763e(i);
        if (v99VarM51250l == null && (!this.f17490e.m51137n() || s0().keySet().contains(strMo16763e))) {
            return strMo16763e;
        }
        Map mapM51243e = u99.m51243e(mo18278d(), uefVar);
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapM51243e.get((String) next);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strMo52468a = v99VarM51250l != null ? v99VarM51250l.mo52468a(uefVar, i, strMo16763e) : null;
        return strMo52468a == null ? strMo16763e : strMo52468a;
    }

    @Override // p001o.c8, p001o.w75
    /* renamed from: b */
    public jo3 mo20420b(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        if (uefVar != this.f56841h) {
            return super.mo20420b(uefVar);
        }
        p79 p79VarMo18278d = mo18278d();
        k89 k89VarF0 = f0();
        uef uefVar2 = this.f56841h;
        if (k89VarF0 instanceof z99) {
            return new za9(p79VarMo18278d, (z99) k89VarF0, this.f56840g, uefVar2);
        }
        throw w89.m54056d(-1, "Expected " + kge.m35689b(z99.class) + " as the serialized body of " + uefVar2.mo16766h() + ", but had " + kge.m35689b(k89VarF0.getClass()));
    }

    @Override // p001o.c8, p001o.jo3
    /* renamed from: c */
    public void mo18548c(uef uefVar) {
        Set setM42272l;
        sq8.m48649h(uefVar, "descriptor");
        if (this.f17490e.m51133j() || (uefVar.getKind() instanceof udd)) {
            return;
        }
        v99 v99VarM51250l = u99.m51250l(uefVar, mo18278d());
        if (v99VarM51250l == null && !this.f17490e.m51137n()) {
            setM42272l = e99.m24533a(uefVar);
        } else if (v99VarM51250l != null) {
            setM42272l = u99.m51243e(mo18278d(), uefVar).keySet();
        } else {
            Set setM24533a = e99.m24533a(uefVar);
            Map map = (Map) la9.m36836a(mo18278d()).m59608a(uefVar, u99.m51244f());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = nif.m40664e();
            }
            setM42272l = oif.m42272l(setM24533a, setKeySet);
        }
        for (String str : s0().keySet()) {
            if (!setM42272l.contains(str) && !sq8.m48644c(str, this.f56840g)) {
                throw w89.m54058f(str, s0().toString());
            }
        }
    }

    @Override // p001o.c8
    public k89 e0(String str) {
        sq8.m48649h(str, "tag");
        return (k89) isa.m32682i(s0(), str);
    }

    /* renamed from: k */
    public int mo16814k(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        while (this.f56842i < uefVar.mo16762d()) {
            int i = this.f56842i;
            this.f56842i = i + 1;
            String strMo17234V = mo17234V(uefVar, i);
            int i2 = this.f56842i - 1;
            this.f56843j = false;
            if (s0().containsKey(strMo17234V) || u0(uefVar, i2)) {
                if (!this.f17490e.m51129f() || !v0(uefVar, i2, strMo17234V)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final boolean u0(uef uefVar, int i) {
        boolean z = (mo18278d().m43087d().m51132i() || uefVar.mo16767i(i) || !uefVar.mo16765g(i).mo16760b()) ? false : true;
        this.f56843j = z;
        return z;
    }

    public final boolean v0(uef uefVar, int i, String str) {
        p79 p79VarMo18278d = mo18278d();
        if (!uefVar.mo16767i(i)) {
            return false;
        }
        uef uefVarMo16765g = uefVar.mo16765g(i);
        if (uefVarMo16765g.mo16760b() || !(e0(str) instanceof w99)) {
            if (!sq8.m48644c(uefVarMo16765g.getKind(), bff.C12373b.f16099a)) {
                return false;
            }
            if (uefVarMo16765g.mo16760b() && (e0(str) instanceof w99)) {
                return false;
            }
            k89 k89VarE0 = e0(str);
            ea9 ea9Var = k89VarE0 instanceof ea9 ? (ea9) k89VarE0 : null;
            String strM36739d = ea9Var != null ? l89.m36739d(ea9Var) : null;
            if (strM36739d == null || u99.m51246h(uefVarMo16765g, p79VarMo18278d, strM36739d) != -3) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.c8
    /* renamed from: w0 */
    public z99 s0() {
        return this.f56839f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za9(p79 p79Var, z99 z99Var, String str, uef uefVar) {
        super(p79Var, z99Var, null);
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(z99Var, "value");
        this.f56839f = z99Var;
        this.f56840g = str;
        this.f56841h = uefVar;
    }
}
