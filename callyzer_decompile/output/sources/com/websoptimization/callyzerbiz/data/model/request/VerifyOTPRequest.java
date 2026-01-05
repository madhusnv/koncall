package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class VerifyOTPRequest {

    /* renamed from: a */
    public final String f7366a;

    @InterfaceC4485b("otp")
    private final String otp;

    @InterfaceC4485b("sim1Mobile")
    private final String sim1Mobile;

    @InterfaceC4485b("sim2Mobile")
    private final String sim2Mobile;

    public VerifyOTPRequest(String otp, String sim1Mobile, String str, String dcc) {
        AbstractC4154l.m8923f(otp, "otp");
        AbstractC4154l.m8923f(sim1Mobile, "sim1Mobile");
        AbstractC4154l.m8923f(dcc, "dcc");
        this.otp = otp;
        this.sim1Mobile = sim1Mobile;
        this.sim2Mobile = str;
        this.f7366a = dcc;
    }

    /* renamed from: a */
    public final String m4692a() {
        return this.otp;
    }

    /* renamed from: b */
    public final String m4693b() {
        return this.sim1Mobile;
    }

    /* renamed from: c */
    public final String m4694c() {
        return this.sim2Mobile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyOTPRequest)) {
            return false;
        }
        VerifyOTPRequest verifyOTPRequest = (VerifyOTPRequest) obj;
        return AbstractC4154l.m8918a(this.otp, verifyOTPRequest.otp) && AbstractC4154l.m8918a(this.sim1Mobile, verifyOTPRequest.sim1Mobile) && AbstractC4154l.m8918a(this.sim2Mobile, verifyOTPRequest.sim2Mobile) && AbstractC4154l.m8918a(this.f7366a, verifyOTPRequest.f7366a);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.otp.hashCode() * 31, 31, this.sim1Mobile);
        String str = this.sim2Mobile;
        return this.f7366a.hashCode() + ((iM113d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.otp;
        String str2 = this.sim1Mobile;
        return AbstractC0030c.m124o(AbstractC0030c.m127r("VerifyOTPRequest(otp=", str, ", sim1Mobile=", str2, ", sim2Mobile="), this.sim2Mobile, ", dcc=", this.f7366a, ")");
    }
}
