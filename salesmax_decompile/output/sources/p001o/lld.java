package p001o;

import com.onesignal.user.internal.backend.IdentityConstants;
import p001o.iba;
import p001o.jba;
import p001o.uyb;

/* loaded from: classes2.dex */
public abstract class lld {
    /* renamed from: e */
    public static final uyb m37437e(vq3 vq3Var) {
        String strM53203d = vq3.m53203d(vq3Var, "source_profile", null, 2, null);
        String strM53203d2 = vq3.m53203d(vq3Var, "credential_source", null, 2, null);
        if (strM53203d != null && strM53203d2 != null) {
            throw new n2e("profile (" + vq3Var.m53205b() + ") contained both `source_profile` and `credential_source`. Only one or the other can be defined.", null, 2, null);
        }
        if (strM53203d != null || strM53203d2 != null) {
            return (strM53203d == null || strM53203d2 != null) ? uyb.C17486b.f49655a : sq8.m48644c(strM53203d, vq3Var.m53205b()) ? uyb.C17486b.f49655a : new uyb.C17485a(strM53203d);
        }
        throw new n2e("profile (" + vq3Var.m53205b() + ") must contain `source_profile` or `credential_source` but neither were defined", null, 2, null);
    }

    /* renamed from: f */
    public static final iba m37438f(vq3 vq3Var, r81 r81Var) {
        String strM53203d = vq3.m53203d(vq3Var, "credential_source", null, 2, null);
        if (strM53203d != null) {
            return new iba.C14234c(strM53203d);
        }
        jba jbaVarM37446n = m37446n(vq3Var);
        if (jbaVarM37446n == null) {
            jbaVarM37446n = m37442j(vq3Var, r81Var);
        }
        if (jbaVarM37446n == null) {
            jbaVarM37446n = m37439g(vq3Var);
        }
        if (jbaVarM37446n == null) {
            jbaVarM37446n = m37440h(vq3Var);
        }
        if (jbaVarM37446n == null) {
            jbaVarM37446n = m37443k(vq3Var);
        }
        return m37445m(jbaVarM37446n);
    }

    /* renamed from: g */
    public static final jba m37439g(vq3 vq3Var) {
        if (!vq3Var.m53204a("sso_account_id") && !vq3Var.m53204a("sso_role_name")) {
            return null;
        }
        String strM53203d = vq3.m53203d(vq3Var, "sso_start_url", null, 2, null);
        if (strM53203d == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_start_url`");
        }
        String strM53203d2 = vq3.m53203d(vq3Var, "sso_region", null, 2, null);
        if (strM53203d2 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_region`");
        }
        String strM53203d3 = vq3.m53203d(vq3Var, "sso_account_id", null, 2, null);
        if (strM53203d3 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_account_id`");
        }
        String strM53203d4 = vq3.m53203d(vq3Var, "sso_role_name", null, 2, null);
        if (strM53203d4 != null) {
            return new jba.C14484b(new iba.C14233b(strM53203d, strM53203d2, strM53203d3, strM53203d4));
        }
        return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_role_name`");
    }

    /* renamed from: h */
    public static final jba m37440h(vq3 vq3Var) {
        if (!vq3Var.m53204a("credential_process")) {
            return null;
        }
        String strM53203d = vq3.m53203d(vq3Var, "credential_process", null, 2, null);
        if (strM53203d != null) {
            return new jba.C14484b(new iba.C14235d(strM53203d));
        }
        return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `credential_process`");
    }

    /* renamed from: i */
    public static final iue m37441i(vq3 vq3Var) {
        String strM53203d;
        if (vq3Var.m53204a("web_identity_token_file") || (strM53203d = vq3.m53203d(vq3Var, "role_arn", null, 2, null)) == null) {
            return null;
        }
        return new iue(strM53203d, vq3.m53203d(vq3Var, "role_session_name", null, 2, null), vq3.m53203d(vq3Var, IdentityConstants.EXTERNAL_ID, null, 2, null));
    }

    /* renamed from: j */
    public static final jba m37442j(vq3 vq3Var, r81 r81Var) {
        String strM53203d = vq3.m53203d(vq3Var, "sso_session", null, 2, null);
        if (strM53203d == null) {
            return null;
        }
        vq3 vq3Var2 = (vq3) r81Var.m46335d().get(strM53203d);
        if (vq3Var2 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") references non-existing sso_session = `" + strM53203d + '`');
        }
        String strM53203d2 = vq3.m53203d(vq3Var2, "sso_start_url", null, 2, null);
        if (strM53203d2 == null) {
            return new jba.C14483a("sso-session (" + strM53203d + ") missing `sso_start_url`");
        }
        String strM53203d3 = vq3.m53203d(vq3Var2, "sso_region", null, 2, null);
        if (strM53203d3 == null) {
            return new jba.C14483a("sso-session (" + strM53203d + ") missing `sso_region`");
        }
        String strM53203d4 = vq3.m53203d(vq3Var, "sso_account_id", null, 2, null);
        if (strM53203d4 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_account_id`");
        }
        String strM53203d5 = vq3.m53203d(vq3Var, "sso_role_name", null, 2, null);
        if (strM53203d5 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `sso_role_name`");
        }
        String strM53203d6 = vq3.m53203d(vq3Var2, "sso_region", null, 2, null);
        String strM53203d7 = vq3.m53203d(vq3Var, "sso_region", null, 2, null);
        if (strM53203d6 != null && strM53203d7 != null && !sq8.m48644c(strM53203d6, strM53203d7)) {
            return new jba.C14483a("sso-session (" + strM53203d + ") sso_region = `" + strM53203d6 + "` does not match profile (" + vq3Var.m53205b() + ") sso_region = `" + strM53203d7 + '`');
        }
        String strM53203d8 = vq3.m53203d(vq3Var2, "sso_start_url", null, 2, null);
        String strM53203d9 = vq3.m53203d(vq3Var, "sso_start_url", null, 2, null);
        if (strM53203d8 == null || strM53203d9 == null || sq8.m48644c(strM53203d8, strM53203d9)) {
            return new jba.C14484b(new iba.C14236e(strM53203d, strM53203d2, strM53203d3, strM53203d4, strM53203d5));
        }
        return new jba.C14483a("sso-session (" + strM53203d + ") sso_start_url = `" + strM53203d8 + "` does not match profile (" + vq3Var.m53205b() + ") sso_start_url = `" + strM53203d9 + '`');
    }

    /* renamed from: k */
    public static final jba m37443k(vq3 vq3Var) {
        String strM53203d = vq3.m53203d(vq3Var, "aws_access_key_id", null, 2, null);
        String strM53203d2 = vq3.m53203d(vq3Var, "aws_secret_access_key", null, 2, null);
        String strM53203d3 = vq3.m53203d(vq3Var, "aws_account_id", null, 2, null);
        if (strM53203d == null && strM53203d2 == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") did not contain credential information");
        }
        if (strM53203d == null) {
            return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `aws_access_key_id`");
        }
        if (strM53203d2 != null) {
            return new jba.C14484b(new iba.C14232a(mc4.m38705a(strM53203d, strM53203d2, (24 & 4) != 0 ? null : vq3.m53203d(vq3Var, "aws_session_token", null, 2, null), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0 ? null : strM53203d3)));
        }
        return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `aws_secret_access_key`");
    }

    /* renamed from: l */
    public static final iba m37444l(vq3 vq3Var) {
        jba jbaVarM37443k = m37443k(vq3Var);
        if (jbaVarM37443k instanceof jba.C14484b) {
            return ((jba.C14484b) jbaVarM37443k).m33474a();
        }
        return null;
    }

    /* renamed from: m */
    public static final iba m37445m(jba jbaVar) {
        if (jbaVar instanceof jba.C14484b) {
            return ((jba.C14484b) jbaVar).m33474a();
        }
        if (jbaVar instanceof jba.C14483a) {
            throw new n2e(((jba.C14483a) jbaVar).m33473a(), null, 2, null);
        }
        throw new szb();
    }

    /* renamed from: n */
    public static final jba m37446n(vq3 vq3Var) {
        String strM53203d = vq3.m53203d(vq3Var, "role_arn", null, 2, null);
        String strM53203d2 = vq3.m53203d(vq3Var, "web_identity_token_file", null, 2, null);
        String strM53203d3 = vq3.m53203d(vq3Var, "role_session_name", null, 2, null);
        if (strM53203d2 == null) {
            return null;
        }
        if (strM53203d != null) {
            return new jba.C14484b(new iba.C14237f(strM53203d, strM53203d2, strM53203d3));
        }
        return new jba.C14483a("profile (" + vq3Var.m53205b() + ") missing `role_arn`");
    }
}
