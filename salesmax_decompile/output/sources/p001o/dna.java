package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public abstract class dna {

    /* renamed from: a */
    public static ena f20317a;

    static {
        vxe vxeVarM57898m = yja.m57898m();
        if (vxeVarM57898m != null) {
            f20317a = vxeVarM57898m.mo26392d();
            return;
        }
        sle.m48481b("Failed to find provider.");
        sle.m48481b("Defaulting to no-operation MDCAdapter implementation.");
        f20317a = new frb();
    }

    /* renamed from: a */
    public static void m23620a() {
        ena enaVar = f20317a;
        if (enaVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        enaVar.clear();
    }

    /* renamed from: b */
    public static Map m23621b() {
        ena enaVar = f20317a;
        if (enaVar != null) {
            return enaVar.mo25350a();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: c */
    public static void m23622c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        ena enaVar = f20317a;
        if (enaVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        enaVar.put(str, str2);
    }

    /* renamed from: d */
    public static void m23623d(Map map) {
        ena enaVar = f20317a;
        if (enaVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        enaVar.mo25351b(map);
    }
}
