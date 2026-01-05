package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ExcludeNumber {

    @InterfaceC4485b("contactName")
    private final String contactName;

    @InterfaceC4485b("contactNumber")
    private final String contactNumber;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    public ExcludeNumber(String contactName, String contactNumber, int i10) {
        AbstractC4154l.m8923f(contactName, "contactName");
        AbstractC4154l.m8923f(contactNumber, "contactNumber");
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.countryCode = i10;
    }

    /* renamed from: a */
    public final String m4778a() {
        return this.contactName;
    }

    /* renamed from: b */
    public final String m4779b() {
        return this.contactNumber;
    }

    /* renamed from: c */
    public final int m4780c() {
        return this.countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeNumber)) {
            return false;
        }
        ExcludeNumber excludeNumber = (ExcludeNumber) obj;
        return AbstractC4154l.m8918a(this.contactName, excludeNumber.contactName) && AbstractC4154l.m8918a(this.contactNumber, excludeNumber.contactNumber) && this.countryCode == excludeNumber.countryCode;
    }

    public final int hashCode() {
        return Integer.hashCode(this.countryCode) + AbstractC0030c.m113d(this.contactName.hashCode() * 31, 31, this.contactNumber);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.countryCode, ")", AbstractC0030c.m127r("ExcludeNumber(contactName=", this.contactName, ", contactNumber=", this.contactNumber, ", countryCode="));
    }
}
