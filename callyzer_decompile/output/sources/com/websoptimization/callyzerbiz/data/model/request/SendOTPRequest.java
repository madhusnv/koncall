package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;
import ym.InterfaceC8691b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SendOTPRequest {

    /* renamed from: a */
    public final String f7362a;

    @InterfaceC4485b("sim1EmpCode")
    private final String sim1EmployeeCode;

    @InterfaceC4485b("sim1Mobile")
    private final String sim1Mobile;

    @InterfaceC4485b("sim1EmpName")
    private final String sim1UserName;

    @InterfaceC4485b("sim2EmpCode")
    private final String sim2EmployeeCode;

    @InterfaceC4485b("sim2Mobile")
    @InterfaceC8691b
    private final String sim2Mobile;

    @InterfaceC4485b("sim2EmpName")
    private final String sim2UserName;

    public SendOTPRequest(String sim1Mobile, String sim1UserName, String sim1EmployeeCode, String str, String str2, String str3, String dcc) {
        AbstractC4154l.m8923f(sim1Mobile, "sim1Mobile");
        AbstractC4154l.m8923f(sim1UserName, "sim1UserName");
        AbstractC4154l.m8923f(sim1EmployeeCode, "sim1EmployeeCode");
        AbstractC4154l.m8923f(dcc, "dcc");
        this.sim1Mobile = sim1Mobile;
        this.sim1UserName = sim1UserName;
        this.sim1EmployeeCode = sim1EmployeeCode;
        this.sim2Mobile = str;
        this.sim2UserName = str2;
        this.sim2EmployeeCode = str3;
        this.f7362a = dcc;
    }

    /* renamed from: a */
    public final String m4683a() {
        return this.sim1EmployeeCode;
    }

    /* renamed from: b */
    public final String m4684b() {
        return this.sim1Mobile;
    }

    /* renamed from: c */
    public final String m4685c() {
        return this.sim1UserName;
    }

    /* renamed from: d */
    public final String m4686d() {
        return this.sim2EmployeeCode;
    }

    /* renamed from: e */
    public final String m4687e() {
        return this.sim2Mobile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendOTPRequest)) {
            return false;
        }
        SendOTPRequest sendOTPRequest = (SendOTPRequest) obj;
        return AbstractC4154l.m8918a(this.sim1Mobile, sendOTPRequest.sim1Mobile) && AbstractC4154l.m8918a(this.sim1UserName, sendOTPRequest.sim1UserName) && AbstractC4154l.m8918a(this.sim1EmployeeCode, sendOTPRequest.sim1EmployeeCode) && AbstractC4154l.m8918a(this.sim2Mobile, sendOTPRequest.sim2Mobile) && AbstractC4154l.m8918a(this.sim2UserName, sendOTPRequest.sim2UserName) && AbstractC4154l.m8918a(this.sim2EmployeeCode, sendOTPRequest.sim2EmployeeCode) && AbstractC4154l.m8918a(this.f7362a, sendOTPRequest.f7362a);
    }

    /* renamed from: f */
    public final String m4688f() {
        return this.sim2UserName;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(this.sim1Mobile.hashCode() * 31, 31, this.sim1UserName), 31, this.sim1EmployeeCode);
        String str = this.sim2Mobile;
        int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sim2UserName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sim2EmployeeCode;
        return this.f7362a.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.sim1Mobile;
        String str2 = this.sim1UserName;
        String str3 = this.sim1EmployeeCode;
        String str4 = this.sim2Mobile;
        String str5 = this.sim2UserName;
        String str6 = this.sim2EmployeeCode;
        StringBuilder sbM127r = AbstractC0030c.m127r("SendOTPRequest(sim1Mobile=", str, ", sim1UserName=", str2, ", sim1EmployeeCode=");
        a1.m14319B(sbM127r, str3, ", sim2Mobile=", str4, ", sim2UserName=");
        a1.m14319B(sbM127r, str5, ", sim2EmployeeCode=", str6, ", dcc=");
        return AbstractC1452a.m4564k(sbM127r, this.f7362a, ")");
    }
}
