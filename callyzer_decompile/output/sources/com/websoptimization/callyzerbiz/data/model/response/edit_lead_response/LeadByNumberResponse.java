package com.websoptimization.callyzerbiz.data.model.response.edit_lead_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadByNumberResponse {

    @InterfaceC4485b("assignToall")
    private final boolean assignToall;

    @InterfaceC4485b("assignedTo")
    private final List<AllEmployeeResponse> assignedTo;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("createdDate")
    private final LocalDateTime createdDate;

    @InterfaceC4485b("firstName")
    private final String firstName;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final String f44167id;

    @InterfaceC4485b("lastCallDetails")
    private final LastCallDetails lastCallDetails;

    @InterfaceC4485b("lastName")
    private final String lastName;

    @InterfaceC4485b("leadDynamicField")
    private final Map<String, DynamicFieldResponse> leadDynamicField;

    @InterfaceC4485b("leadTags")
    private final List<String> leadTags;

    @InterfaceC4485b("modifiedDate")
    private final LocalDateTime modifiedDate;

    @InterfaceC4485b("number")
    private final String number;

    @InterfaceC4485b("reminderDate")
    private final LocalDateTime reminderDate;

    @InterfaceC4485b("secondaryCountryCode")
    private final Integer secondaryCountryCode;

    @InterfaceC4485b("secondaryNumber")
    private final String secondaryNumber;

    @InterfaceC4485b("serialNumber")
    private final String serialNumber;

    @InterfaceC4485b("simNumber")
    private final String simNumber;

    @InterfaceC4485b("status")
    private final String status;

    public LeadByNumberResponse(String id2, String firstName, String str, String number, String str2, int i10, Integer num, String str3, boolean z6, List<String> leadTags, String serialNumber, Map<String, DynamicFieldResponse> leadDynamicField, List<AllEmployeeResponse> list, LocalDateTime createdDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, LastCallDetails lastCallDetails, String simNumber) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(firstName, "firstName");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(leadTags, "leadTags");
        AbstractC4154l.m8923f(serialNumber, "serialNumber");
        AbstractC4154l.m8923f(leadDynamicField, "leadDynamicField");
        AbstractC4154l.m8923f(createdDate, "createdDate");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f44167id = id2;
        this.firstName = firstName;
        this.lastName = str;
        this.number = number;
        this.secondaryNumber = str2;
        this.countryCode = i10;
        this.secondaryCountryCode = num;
        this.status = str3;
        this.assignToall = z6;
        this.leadTags = leadTags;
        this.serialNumber = serialNumber;
        this.leadDynamicField = leadDynamicField;
        this.assignedTo = list;
        this.createdDate = createdDate;
        this.modifiedDate = localDateTime;
        this.reminderDate = localDateTime2;
        this.lastCallDetails = lastCallDetails;
        this.simNumber = simNumber;
    }

    /* renamed from: a */
    public final boolean m4861a() {
        return this.assignToall;
    }

    /* renamed from: b */
    public final List m4862b() {
        return this.assignedTo;
    }

    /* renamed from: c */
    public final int m4863c() {
        return this.countryCode;
    }

    /* renamed from: d */
    public final LocalDateTime m4864d() {
        return this.createdDate;
    }

    /* renamed from: e */
    public final String m4865e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadByNumberResponse)) {
            return false;
        }
        LeadByNumberResponse leadByNumberResponse = (LeadByNumberResponse) obj;
        return AbstractC4154l.m8918a(this.f44167id, leadByNumberResponse.f44167id) && AbstractC4154l.m8918a(this.firstName, leadByNumberResponse.firstName) && AbstractC4154l.m8918a(this.lastName, leadByNumberResponse.lastName) && AbstractC4154l.m8918a(this.number, leadByNumberResponse.number) && AbstractC4154l.m8918a(this.secondaryNumber, leadByNumberResponse.secondaryNumber) && this.countryCode == leadByNumberResponse.countryCode && AbstractC4154l.m8918a(this.secondaryCountryCode, leadByNumberResponse.secondaryCountryCode) && AbstractC4154l.m8918a(this.status, leadByNumberResponse.status) && this.assignToall == leadByNumberResponse.assignToall && AbstractC4154l.m8918a(this.leadTags, leadByNumberResponse.leadTags) && AbstractC4154l.m8918a(this.serialNumber, leadByNumberResponse.serialNumber) && AbstractC4154l.m8918a(this.leadDynamicField, leadByNumberResponse.leadDynamicField) && AbstractC4154l.m8918a(this.assignedTo, leadByNumberResponse.assignedTo) && AbstractC4154l.m8918a(this.createdDate, leadByNumberResponse.createdDate) && AbstractC4154l.m8918a(this.modifiedDate, leadByNumberResponse.modifiedDate) && AbstractC4154l.m8918a(this.reminderDate, leadByNumberResponse.reminderDate) && AbstractC4154l.m8918a(this.lastCallDetails, leadByNumberResponse.lastCallDetails) && AbstractC4154l.m8918a(this.simNumber, leadByNumberResponse.simNumber);
    }

    /* renamed from: f */
    public final String m4866f() {
        return this.f44167id;
    }

    /* renamed from: g */
    public final LastCallDetails m4867g() {
        return this.lastCallDetails;
    }

    /* renamed from: h */
    public final String m4868h() {
        return this.lastName;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.f44167id.hashCode() * 31, 31, this.firstName);
        String str = this.lastName;
        int iM113d2 = AbstractC0030c.m113d((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.number);
        String str2 = this.secondaryNumber;
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, (iM113d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.secondaryCountryCode;
        int iHashCode = (iM4556c + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.status;
        int iM7369b = m0.m7369b(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.leadTags, AbstractC1452a.m4558e((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.assignToall), 31), 31, this.serialNumber), 31, this.leadDynamicField);
        List<AllEmployeeResponse> list = this.assignedTo;
        int iM7370c = m0.m7370c(this.createdDate, (iM7369b + (list == null ? 0 : list.hashCode())) * 31, 31);
        LocalDateTime localDateTime = this.modifiedDate;
        int iHashCode2 = (iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.reminderDate;
        int iHashCode3 = (iHashCode2 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        LastCallDetails lastCallDetails = this.lastCallDetails;
        return this.simNumber.hashCode() + ((iHashCode3 + (lastCallDetails != null ? lastCallDetails.hashCode() : 0)) * 31);
    }

    /* renamed from: i */
    public final Map m4869i() {
        return this.leadDynamicField;
    }

    /* renamed from: j */
    public final List m4870j() {
        return this.leadTags;
    }

    /* renamed from: k */
    public final LocalDateTime m4871k() {
        return this.modifiedDate;
    }

    /* renamed from: l */
    public final String m4872l() {
        return this.number;
    }

    /* renamed from: m */
    public final LocalDateTime m4873m() {
        return this.reminderDate;
    }

    /* renamed from: n */
    public final Integer m4874n() {
        return this.secondaryCountryCode;
    }

    /* renamed from: o */
    public final String m4875o() {
        return this.secondaryNumber;
    }

    /* renamed from: p */
    public final String m4876p() {
        return this.serialNumber;
    }

    /* renamed from: q */
    public final String m4877q() {
        return this.simNumber;
    }

    /* renamed from: r */
    public final String m4878r() {
        return this.status;
    }

    public final String toString() {
        String str = this.f44167id;
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
        Map<String, DynamicFieldResponse> map = this.leadDynamicField;
        List<AllEmployeeResponse> list2 = this.assignedTo;
        LocalDateTime localDateTime = this.createdDate;
        LocalDateTime localDateTime2 = this.modifiedDate;
        LocalDateTime localDateTime3 = this.reminderDate;
        LastCallDetails lastCallDetails = this.lastCallDetails;
        String str8 = this.simNumber;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadByNumberResponse(id=", str, ", firstName=", str2, ", lastName=");
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
        sbM127r.append(", leadDynamicField=");
        sbM127r.append(map);
        sbM127r.append(", assignedTo=");
        sbM127r.append(list2);
        sbM127r.append(", createdDate=");
        sbM127r.append(localDateTime);
        sbM127r.append(", modifiedDate=");
        sbM127r.append(localDateTime2);
        sbM127r.append(", reminderDate=");
        sbM127r.append(localDateTime3);
        sbM127r.append(", lastCallDetails=");
        sbM127r.append(lastCallDetails);
        sbM127r.append(", simNumber=");
        sbM127r.append(str8);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ LeadByNumberResponse(String str, String str2, String str3, String str4, String str5, int i10, Integer num, String str6, boolean z6, List list, String str7, Map map, List list2, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LastCallDetails lastCallDetails, String str8, int i11, AbstractC4148f abstractC4148f) {
        this(str, str2, str3, str4, str5, i10, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str6, z6, (i11 & 512) != 0 ? C6668r.f31943a : list, str7, map, (i11 & 4096) != 0 ? null : list2, localDateTime, (i11 & 16384) != 0 ? null : localDateTime2, (32768 & i11) != 0 ? null : localDateTime3, (i11 & 65536) != 0 ? null : lastCallDetails, str8);
    }
}
