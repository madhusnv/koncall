package bb;

import ec.C2011i;
import java.util.List;
import og.be;
import og.pe;
import pg.g9;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bb.b */
/* loaded from: classes.dex */
public final class C0641b {

    /* renamed from: a */
    public final List f4110a;

    /* renamed from: b */
    public final Object f4111b;

    /* renamed from: c */
    public final List f4112c;

    public C0641b(List list, int i10) {
        switch (i10) {
            case 1:
                this.f4110a = list;
                C2011i c2011i = C2011i.f9543a;
                this.f4111b = AbstractC6674x.m12778f(new C6361k("GetCredentialsForIdentity", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i))), new C6361k("GetId", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i))), new C6361k("GetOpenIdToken", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i))), new C6361k("UnlinkIdentity", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i))));
                this.f4112c = pe.m10833h(g9.m11667g(null, null, null, 31));
                break;
            default:
                this.f4110a = list;
                C2011i c2011i2 = C2011i.f9543a;
                this.f4111b = AbstractC6674x.m12778f(new C6361k("AssociateSoftwareToken", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ChangePassword", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("CompleteWebAuthnRegistration", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ConfirmDevice", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ConfirmForgotPassword", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ConfirmSignUp", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("DeleteUser", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("DeleteUserAttributes", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("DeleteWebAuthnCredential", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ForgetDevice", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ForgotPassword", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("GetDevice", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("GetUser", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("GetUserAttributeVerificationCode", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("GetUserAuthFactors", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("GlobalSignOut", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("InitiateAuth", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ListDevices", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ListWebAuthnCredentials", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("ResendConfirmationCode", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("RespondToAuthChallenge", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("RevokeToken", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("SetUserMFAPreference", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("SetUserSettings", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("SignUp", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("StartWebAuthnRegistration", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("UpdateAuthEventFeedback", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("UpdateDeviceStatus", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("UpdateUserAttributes", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("VerifySoftwareToken", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))), new C6361k("VerifyUserAttribute", pe.m10833h(be.m10556a("smithy.api#noAuth", c2011i2))));
                this.f4112c = pe.m10833h(g9.m11667g(null, null, null, 31));
                break;
        }
    }
}
