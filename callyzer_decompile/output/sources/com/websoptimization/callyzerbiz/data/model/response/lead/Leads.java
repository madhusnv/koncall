package com.websoptimization.callyzerbiz.data.model.response.lead;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.DynamicFieldResponse;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class Leads {

    @InterfaceC4485b("assignedTo")
    private final List<AssignEmployeeDetailsResponse> assignEmployeeDetailsResponse;

    @InterfaceC4485b("assignToall")
    private final boolean assignToall;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("createdDate")
    private final LocalDateTime createdDate;

    @InterfaceC4485b("firstName")
    private final String firstName;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final String f44169id;

    @InterfaceC4485b("lastCallDetails")
    private final LastCallDetails lastCallDetails;

    @InterfaceC4485b("lastName")
    private final String lastName;

    @InterfaceC4485b("leadTags")
    private final List<String> leadTags;

    @InterfaceC4485b("modifiedDate")
    private final LocalDateTime modifiedDate;

    @InterfaceC4485b("noOfAttempts")
    private final int noOfAttempts;

    @InterfaceC4485b("number")
    private final String number;

    @InterfaceC4485b("leadDynamicField")
    private final Map<String, DynamicFieldResponse> properties;

    @InterfaceC4485b("reminderDate")
    private final LocalDateTime reminderDate;

    @InterfaceC4485b("secondaryCountryCode")
    private final Integer secondaryCountryCode;

    @InterfaceC4485b("secondaryNumber")
    private final String secondaryNumber;

    @InterfaceC4485b("serialNumber")
    private final String serialNumber;

    @InterfaceC4485b("simNumber")
    private final List<String> simNumbers;

    @InterfaceC4485b("status")
    private final String status;

    public Leads(String id2, String firstName, String str, String number, String str2, int i10, Integer num, String str3, boolean z6, List<String> list, String serialNumber, List<String> simNumbers, List<AssignEmployeeDetailsResponse> list2, Map<String, DynamicFieldResponse> properties, int i11, LocalDateTime createdDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, LastCallDetails lastCallDetails) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(firstName, "firstName");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(serialNumber, "serialNumber");
        AbstractC4154l.m8923f(simNumbers, "simNumbers");
        AbstractC4154l.m8923f(properties, "properties");
        AbstractC4154l.m8923f(createdDate, "createdDate");
        this.f44169id = id2;
        this.firstName = firstName;
        this.lastName = str;
        this.number = number;
        this.secondaryNumber = str2;
        this.countryCode = i10;
        this.secondaryCountryCode = num;
        this.status = str3;
        this.assignToall = z6;
        this.leadTags = list;
        this.serialNumber = serialNumber;
        this.simNumbers = simNumbers;
        this.assignEmployeeDetailsResponse = list2;
        this.properties = properties;
        this.noOfAttempts = i11;
        this.createdDate = createdDate;
        this.modifiedDate = localDateTime;
        this.reminderDate = localDateTime2;
        this.lastCallDetails = lastCallDetails;
    }

    /* renamed from: a */
    public final List m4914a() {
        return this.assignEmployeeDetailsResponse;
    }

    /* renamed from: b */
    public final boolean m4915b() {
        return this.assignToall;
    }

    /* renamed from: c */
    public final int m4916c() {
        return this.countryCode;
    }

    /* renamed from: d */
    public final LocalDateTime m4917d() {
        return this.createdDate;
    }

    /* renamed from: e */
    public final String m4918e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Leads)) {
            return false;
        }
        Leads leads = (Leads) obj;
        return AbstractC4154l.m8918a(this.f44169id, leads.f44169id) && AbstractC4154l.m8918a(this.firstName, leads.firstName) && AbstractC4154l.m8918a(this.lastName, leads.lastName) && AbstractC4154l.m8918a(this.number, leads.number) && AbstractC4154l.m8918a(this.secondaryNumber, leads.secondaryNumber) && this.countryCode == leads.countryCode && AbstractC4154l.m8918a(this.secondaryCountryCode, leads.secondaryCountryCode) && AbstractC4154l.m8918a(this.status, leads.status) && this.assignToall == leads.assignToall && AbstractC4154l.m8918a(this.leadTags, leads.leadTags) && AbstractC4154l.m8918a(this.serialNumber, leads.serialNumber) && AbstractC4154l.m8918a(this.simNumbers, leads.simNumbers) && AbstractC4154l.m8918a(this.assignEmployeeDetailsResponse, leads.assignEmployeeDetailsResponse) && AbstractC4154l.m8918a(this.properties, leads.properties) && this.noOfAttempts == leads.noOfAttempts && AbstractC4154l.m8918a(this.createdDate, leads.createdDate) && AbstractC4154l.m8918a(this.modifiedDate, leads.modifiedDate) && AbstractC4154l.m8918a(this.reminderDate, leads.reminderDate) && AbstractC4154l.m8918a(this.lastCallDetails, leads.lastCallDetails);
    }

    /* renamed from: f */
    public final String m4919f() {
        return this.f44169id;
    }

    /* renamed from: g */
    public final LastCallDetails m4920g() {
        return this.lastCallDetails;
    }

    /* renamed from: h */
    public final String m4921h() {
        return this.lastName;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.f44169id.hashCode() * 31, 31, this.firstName);
        String str = this.lastName;
        int iM113d2 = AbstractC0030c.m113d((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.number);
        String str2 = this.secondaryNumber;
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, (iM113d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.secondaryCountryCode;
        int iHashCode = (iM4556c + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.status;
        int iM4558e = AbstractC1452a.m4558e((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.assignToall);
        List<String> list = this.leadTags;
        int iM4559f = AbstractC1452a.m4559f(this.simNumbers, AbstractC0030c.m113d((iM4558e + (list == null ? 0 : list.hashCode())) * 31, 31, this.serialNumber), 31);
        List<AssignEmployeeDetailsResponse> list2 = this.assignEmployeeDetailsResponse;
        int iM7370c = m0.m7370c(this.createdDate, AbstractC1452a.m4556c(this.noOfAttempts, m0.m7369b((iM4559f + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.properties), 31), 31);
        LocalDateTime localDateTime = this.modifiedDate;
        int iHashCode2 = (iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.reminderDate;
        int iHashCode3 = (iHashCode2 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        LastCallDetails lastCallDetails = this.lastCallDetails;
        return iHashCode3 + (lastCallDetails != null ? lastCallDetails.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m4922i() {
        return this.leadTags;
    }

    /* renamed from: j */
    public final LocalDateTime m4923j() {
        return this.modifiedDate;
    }

    /* renamed from: k */
    public final int m4924k() {
        return this.noOfAttempts;
    }

    /* renamed from: l */
    public final String m4925l() {
        return this.number;
    }

    /* renamed from: m */
    public final Map m4926m() {
        return this.properties;
    }

    /* renamed from: n */
    public final LocalDateTime m4927n() {
        return this.reminderDate;
    }

    /* renamed from: o */
    public final Integer m4928o() {
        return this.secondaryCountryCode;
    }

    /* renamed from: p */
    public final String m4929p() {
        return this.secondaryNumber;
    }

    /* renamed from: q */
    public final String m4930q() {
        return this.serialNumber;
    }

    /* renamed from: r */
    public final List m4931r() {
        return this.simNumbers;
    }

    /* renamed from: s */
    public final String m4932s() {
        return this.status;
    }

    public final String toString() {
        String str = this.f44169id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.number;
        String str5 = this.secondaryNumber;
        int i10 = this.countryCode;
        Integer num = this.secondaryCountryCode;
        String str6 = this.status;
        boolean z6 = this.assignToall;
        List<String> list = this.leadTags;
        String str7 = this.serialNumber;
        List<String> list2 = this.simNumbers;
        List<AssignEmployeeDetailsResponse> list3 = this.assignEmployeeDetailsResponse;
        Map<String, DynamicFieldResponse> map = this.properties;
        int i11 = this.noOfAttempts;
        LocalDateTime localDateTime = this.createdDate;
        LocalDateTime localDateTime2 = this.modifiedDate;
        LocalDateTime localDateTime3 = this.reminderDate;
        LastCallDetails lastCallDetails = this.lastCallDetails;
        StringBuilder sbM127r = AbstractC0030c.m127r("Leads(id=", str, ", firstName=", str2, ", lastName=");
        a1.m14319B(sbM127r, str3, ", number=", str4, ", secondaryNumber=");
        AbstractC1452a.m4551B(sbM127r, str5, ", countryCode=", i10, ", secondaryCountryCode=");
        sbM127r.append(num);
        sbM127r.append(", status=");
        sbM127r.append(str6);
        sbM127r.append(", assignToall=");
        sbM127r.append(z6);
        sbM127r.append(", leadTags=");
        sbM127r.append(list);
        sbM127r.append(", serialNumber=");
        sbM127r.append(str7);
        sbM127r.append(", simNumbers=");
        sbM127r.append(list2);
        sbM127r.append(", assignEmployeeDetailsResponse=");
        sbM127r.append(list3);
        sbM127r.append(", properties=");
        sbM127r.append(map);
        sbM127r.append(", noOfAttempts=");
        sbM127r.append(i11);
        sbM127r.append(", createdDate=");
        sbM127r.append(localDateTime);
        sbM127r.append(", modifiedDate=");
        sbM127r.append(localDateTime2);
        sbM127r.append(", reminderDate=");
        sbM127r.append(localDateTime3);
        sbM127r.append(", lastCallDetails=");
        sbM127r.append(lastCallDetails);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
