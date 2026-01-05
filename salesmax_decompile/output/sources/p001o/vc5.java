package p001o;

import java.util.List;
import java.util.Map;
import p001o.d01;

/* loaded from: classes3.dex */
public final class vc5 implements ig3 {

    /* renamed from: a */
    public final mg3 f50105a;

    /* renamed from: b */
    public final Map f50106b;

    /* renamed from: c */
    public final List f50107c;

    public vc5(mg3 mg3Var) {
        this.f50105a = mg3Var;
        d01.C12776a c12776a = d01.f18915b;
        this.f50106b = isa.m32684k(vyh.m53620a("AssociateSoftwareToken", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ChangePassword", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("CompleteWebAuthnRegistration", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ConfirmDevice", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ConfirmForgotPassword", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ConfirmSignUp", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("DeleteUser", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("DeleteUserAttributes", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("DeleteWebAuthnCredential", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ForgetDevice", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ForgotPassword", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetDevice", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetUser", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetUserAttributeVerificationCode", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetUserAuthFactors", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GlobalSignOut", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("InitiateAuth", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ListDevices", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ListWebAuthnCredentials", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("ResendConfirmationCode", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("RespondToAuthChallenge", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("RevokeToken", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("SetUserMFAPreference", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("SetUserSettings", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("SignUp", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("StartWebAuthnRegistration", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("UpdateAuthEventFeedback", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("UpdateDeviceStatus", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("UpdateUserAttributes", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("VerifySoftwareToken", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("VerifyUserAttribute", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))));
        this.f50107c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(hg3 hg3Var, n64 n64Var) {
        Object obj = this.f50106b.get(hg3Var.m30415a());
        if (obj == null) {
            obj = this.f50107c;
        }
        return (List) obj;
    }

    public /* synthetic */ vc5(mg3 mg3Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : mg3Var);
    }
}
