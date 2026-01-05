package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class tw6 {
    /* renamed from: a */
    public static final boolean m50718a(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        String string = f9g.Z0(sw6Var.m48958a()).toString();
        return e9g.m24597K(string, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false, 2, null) || e9g.m24597K(string, ";", false, 2, null);
    }

    /* renamed from: b */
    public static final boolean m50719b(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        if (ph2.m43653c(h9g.g1(sw6Var.m48958a()))) {
            sq8.m48648g(sw6Var.m48958a().substring(1), "substring(...)");
            if (!f9g.d0(r2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m50720c(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        return m50723f(sw6Var) && !m50724g(sw6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m50721d(String str) {
        boolean z;
        if (!f9g.m26305O(str, '=', false, 2, null)) {
            return false;
        }
        List listC0 = f9g.C0(str, new char[]{'='}, false, 2, 2, null);
        if (listC0.size() != 2) {
            z = false;
        } else {
            if (f9g.Z0((String) listC0.get(0)).toString().length() > 0) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public static final boolean m50722e(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        return !ph2.m43653c(h9g.g1(sw6Var.m48958a())) && m50721d(sw6Var.m48958a());
    }

    /* renamed from: f */
    public static final boolean m50723f(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        String string = f9g.Z0(cih.m21311e(sw6Var.m48958a())).toString();
        return f9g.I0(string, '[', false, 2, null) && f9g.m26309S(string, ']', false, 2, null);
    }

    /* renamed from: g */
    public static final boolean m50724g(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        return m50723f(sw6Var) && f9g.m26306P(sw6Var.m48958a(), "sso-session", false, 2, null);
    }

    /* renamed from: h */
    public static final boolean m50725h(sw6 sw6Var) {
        sq8.m48649h(sw6Var, "<this>");
        return ph2.m43653c(h9g.g1(sw6Var.m48958a())) && m50721d(f9g.b1(sw6Var.m48958a()).toString());
    }
}
