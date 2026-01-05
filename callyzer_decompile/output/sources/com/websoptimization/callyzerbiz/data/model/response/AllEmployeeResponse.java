package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AllEmployeeResponse {

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final String f44166id;

    @InterfaceC4485b("mobile")
    private final String mobile;

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private final String name;

    public AllEmployeeResponse(String id2, String name, int i10, String mobile) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(mobile, "mobile");
        this.f44166id = id2;
        this.name = name;
        this.countryCode = i10;
        this.mobile = mobile;
    }

    /* renamed from: a */
    public final int m4715a() {
        return this.countryCode;
    }

    /* renamed from: b */
    public final String m4716b() {
        return this.f44166id;
    }

    /* renamed from: c */
    public final String m4717c() {
        return this.mobile;
    }

    /* renamed from: d */
    public final String m4718d() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllEmployeeResponse)) {
            return false;
        }
        AllEmployeeResponse allEmployeeResponse = (AllEmployeeResponse) obj;
        return AbstractC4154l.m8918a(this.f44166id, allEmployeeResponse.f44166id) && AbstractC4154l.m8918a(this.name, allEmployeeResponse.name) && this.countryCode == allEmployeeResponse.countryCode && AbstractC4154l.m8918a(this.mobile, allEmployeeResponse.mobile);
    }

    public final int hashCode() {
        return this.mobile.hashCode() + AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.f44166id.hashCode() * 31, 31, this.name), 31);
    }

    public final String toString() {
        String str = this.f44166id;
        String str2 = this.name;
        int i10 = this.countryCode;
        String str3 = this.mobile;
        StringBuilder sbM127r = AbstractC0030c.m127r("AllEmployeeResponse(id=", str, ", name=", str2, ", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", mobile=");
        sbM127r.append(str3);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
