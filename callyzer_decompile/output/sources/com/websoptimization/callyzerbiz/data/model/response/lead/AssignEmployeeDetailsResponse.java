package com.websoptimization.callyzerbiz.data.model.response.lead;

import a2.AbstractC0030c;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AssignEmployeeDetailsResponse {

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final String f44168id;

    @InterfaceC4485b("isActive")
    private final boolean isActive;

    @InterfaceC4485b("mobile")
    private final String mobile;

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private final String name;

    public AssignEmployeeDetailsResponse(String id2, String name, int i10, String mobile, boolean z6) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(mobile, "mobile");
        this.f44168id = id2;
        this.name = name;
        this.countryCode = i10;
        this.mobile = mobile;
        this.isActive = z6;
    }

    /* renamed from: a */
    public final int m4899a() {
        return this.countryCode;
    }

    /* renamed from: b */
    public final String m4900b() {
        return this.f44168id;
    }

    /* renamed from: c */
    public final String m4901c() {
        return this.mobile;
    }

    /* renamed from: d */
    public final String m4902d() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssignEmployeeDetailsResponse)) {
            return false;
        }
        AssignEmployeeDetailsResponse assignEmployeeDetailsResponse = (AssignEmployeeDetailsResponse) obj;
        return AbstractC4154l.m8918a(this.f44168id, assignEmployeeDetailsResponse.f44168id) && AbstractC4154l.m8918a(this.name, assignEmployeeDetailsResponse.name) && this.countryCode == assignEmployeeDetailsResponse.countryCode && AbstractC4154l.m8918a(this.mobile, assignEmployeeDetailsResponse.mobile) && this.isActive == assignEmployeeDetailsResponse.isActive;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isActive) + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.f44168id.hashCode() * 31, 31, this.name), 31), 31, this.mobile);
    }

    public final String toString() {
        String str = this.f44168id;
        String str2 = this.name;
        int i10 = this.countryCode;
        String str3 = this.mobile;
        boolean z6 = this.isActive;
        StringBuilder sbM127r = AbstractC0030c.m127r("AssignEmployeeDetailsResponse(id=", str, ", name=", str2, ", countryCode=");
        AbstractC1452a.m4550A(sbM127r, i10, ", mobile=", str3, ", isActive=");
        return AbstractC5601a.m11242m(sbM127r, z6, ")");
    }
}
