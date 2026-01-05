package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.message.TokenParser;
import p001o.bff;
import p001o.p9g;
import p001o.zm5;

/* loaded from: classes6.dex */
public abstract class u99 {

    /* renamed from: a */
    public static final zm5.C18684a f48595a = new zm5.C18684a();

    /* renamed from: b */
    public static final zm5.C18684a f48596b = new zm5.C18684a();

    /* renamed from: o.u99$a */
    public static final class C17338a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ uef f48597a;

        /* renamed from: b */
        public final /* synthetic */ p79 f48598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17338a(uef uefVar, p79 p79Var) {
            super(0);
            this.f48597a = uefVar;
            this.f48598b = p79Var;
        }

        @Override // p001o.uk7
        public final Map invoke() {
            return u99.m51240b(this.f48597a, this.f48598b);
        }
    }

    /* renamed from: o.u99$b */
    public static final class C17339b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ uef f48599a;

        /* renamed from: b */
        public final /* synthetic */ v99 f48600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17339b(uef uefVar, v99 v99Var) {
            super(0);
            this.f48599a = uefVar;
            this.f48600b = v99Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            int iMo16762d = this.f48599a.mo16762d();
            String[] strArr = new String[iMo16762d];
            for (int i = 0; i < iMo16762d; i++) {
                strArr[i] = this.f48600b.mo52468a(this.f48599a, i, this.f48599a.mo16763e(i));
            }
            return strArr;
        }
    }

    /* renamed from: b */
    public static final Map m51240b(uef uefVar, p79 p79Var) {
        String strMo52468a;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zM51242d = m51242d(p79Var, uefVar);
        v99 v99VarM51250l = m51250l(uefVar, p79Var);
        int iMo16762d = uefVar.mo16762d();
        for (int i = 0; i < iMo16762d; i++) {
            List listMo16764f = uefVar.mo16764f(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo16764f) {
                if (obj instanceof t99) {
                    arrayList.add(obj);
                }
            }
            t99 t99Var = (t99) kh3.E0(arrayList);
            if (t99Var != null && (strArrNames = t99Var.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zM51242d) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        sq8.m48648g(lowerCase, "toLowerCase(...)");
                    }
                    m51241c(linkedHashMap, uefVar, lowerCase, i);
                }
            }
            if (zM51242d) {
                strMo52468a = uefVar.mo16763e(i).toLowerCase(Locale.ROOT);
                sq8.m48648g(strMo52468a, "toLowerCase(...)");
            } else {
                strMo52468a = v99VarM51250l != null ? v99VarM51250l.mo52468a(uefVar, i, uefVar.mo16763e(i)) : null;
            }
            if (strMo52468a != null) {
                m51241c(linkedHashMap, uefVar, strMo52468a, i);
            }
        }
        return linkedHashMap.isEmpty() ? isa.m32681h() : linkedHashMap;
    }

    /* renamed from: c */
    public static final void m51241c(Map map, uef uefVar, String str, int i) {
        String str2 = sq8.m48644c(uefVar.getKind(), bff.C12373b.f16099a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new v89("The suggested name '" + str + "' for " + str2 + TokenParser.SP + uefVar.mo16763e(i) + " is already one of the names for " + str2 + TokenParser.SP + uefVar.mo16763e(((Number) isa.m32682i(map, str)).intValue()) + " in " + uefVar);
    }

    /* renamed from: d */
    public static final boolean m51242d(p79 p79Var, uef uefVar) {
        return p79Var.m43087d().m51130g() && sq8.m48644c(uefVar.getKind(), bff.C12373b.f16099a);
    }

    /* renamed from: e */
    public static final Map m51243e(p79 p79Var, uef uefVar) {
        sq8.m48649h(p79Var, "<this>");
        sq8.m48649h(uefVar, "descriptor");
        return (Map) la9.m36836a(p79Var).m59609b(uefVar, f48595a, new C17338a(uefVar, p79Var));
    }

    /* renamed from: f */
    public static final zm5.C18684a m51244f() {
        return f48595a;
    }

    /* renamed from: g */
    public static final String m51245g(uef uefVar, p79 p79Var, int i) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        v99 v99VarM51250l = m51250l(uefVar, p79Var);
        return v99VarM51250l == null ? uefVar.mo16763e(i) : m51251m(uefVar, p79Var, v99VarM51250l)[i];
    }

    /* renamed from: h */
    public static final int m51246h(uef uefVar, p79 p79Var, String str) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(str, "name");
        if (m51242d(p79Var, uefVar)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            return m51249k(uefVar, p79Var, lowerCase);
        }
        if (m51250l(uefVar, p79Var) != null) {
            return m51249k(uefVar, p79Var, str);
        }
        int iMo16761c = uefVar.mo16761c(str);
        return (iMo16761c == -3 && p79Var.m43087d().m51137n()) ? m51249k(uefVar, p79Var, str) : iMo16761c;
    }

    /* renamed from: i */
    public static final int m51247i(uef uefVar, p79 p79Var, String str, String str2) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "suffix");
        int iM51246h = m51246h(uefVar, p79Var, str);
        if (iM51246h != -3) {
            return iM51246h;
        }
        throw new gff(uefVar.mo16766h() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* renamed from: j */
    public static /* synthetic */ int m51248j(uef uefVar, p79 p79Var, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return m51247i(uefVar, p79Var, str, str2);
    }

    /* renamed from: k */
    public static final int m51249k(uef uefVar, p79 p79Var, String str) {
        Integer num = (Integer) m51243e(p79Var, uefVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: l */
    public static final v99 m51250l(uef uefVar, p79 p79Var) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        if (sq8.m48644c(uefVar.getKind(), p9g.C16037a.f39681a)) {
            return p79Var.m43087d().m51134k();
        }
        return null;
    }

    /* renamed from: m */
    public static final String[] m51251m(uef uefVar, p79 p79Var, v99 v99Var) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(p79Var, "json");
        sq8.m48649h(v99Var, "strategy");
        return (String[]) la9.m36836a(p79Var).m59609b(uefVar, f48596b, new C17339b(uefVar, v99Var));
    }
}
