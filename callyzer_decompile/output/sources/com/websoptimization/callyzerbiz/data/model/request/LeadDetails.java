package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadDetails {

    @InterfaceC4485b("assignToAll")
    private final boolean assignToAll;

    @InterfaceC4485b("assignedTo")
    private final List<String> assignedTo;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("firstName")
    private final String firstName;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final String f44164id;

    @InterfaceC4485b("isMapOldCallsForLead")
    private final boolean isMapOldCallsForLead;

    @InterfaceC4485b("isUpdateLastCallStatus")
    private final boolean isUpdateLastCallStatus;

    @InterfaceC4485b("lastName")
    private final String lastName;

    @InterfaceC4485b("leadTags")
    private final List<String> leadTags;

    @InterfaceC4485b("number")
    private final String number;

    @InterfaceC4485b("dynamicProperties")
    private final Map<String, Object> properties;

    @InterfaceC4485b("callBackTime")
    private final LocalDateTime reminderDate;

    @InterfaceC4485b("secondaryCountryCode")
    private final Integer secondaryCountryCode;

    @InterfaceC4485b("secondaryNumber")
    private final String secondaryNumber;

    @InterfaceC4485b("status")
    private final String status;

    public LeadDetails(String str, boolean z6, List<String> assignedTo, int i10, String firstName, boolean z10, boolean z11, String lastName, List<String> leadTags, String number, Map<String, ? extends Object> properties, Integer num, String secondaryNumber, String str2, LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(assignedTo, "assignedTo");
        AbstractC4154l.m8923f(firstName, "firstName");
        AbstractC4154l.m8923f(lastName, "lastName");
        AbstractC4154l.m8923f(leadTags, "leadTags");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(properties, "properties");
        AbstractC4154l.m8923f(secondaryNumber, "secondaryNumber");
        this.f44164id = str;
        this.assignToAll = z6;
        this.assignedTo = assignedTo;
        this.countryCode = i10;
        this.firstName = firstName;
        this.isMapOldCallsForLead = z10;
        this.isUpdateLastCallStatus = z11;
        this.lastName = lastName;
        this.leadTags = leadTags;
        this.number = number;
        this.properties = properties;
        this.secondaryCountryCode = num;
        this.secondaryNumber = secondaryNumber;
        this.status = str2;
        this.reminderDate = localDateTime;
    }

    /* renamed from: a */
    public final boolean m4667a() {
        return this.assignToAll;
    }

    /* renamed from: b */
    public final int m4668b() {
        return this.countryCode;
    }

    /* renamed from: c */
    public final String m4669c() {
        return this.firstName;
    }

    /* renamed from: d */
    public final String m4670d() {
        return this.f44164id;
    }

    /* renamed from: e */
    public final String m4671e() {
        return this.lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadDetails)) {
            return false;
        }
        LeadDetails leadDetails = (LeadDetails) obj;
        return AbstractC4154l.m8918a(this.f44164id, leadDetails.f44164id) && this.assignToAll == leadDetails.assignToAll && AbstractC4154l.m8918a(this.assignedTo, leadDetails.assignedTo) && this.countryCode == leadDetails.countryCode && AbstractC4154l.m8918a(this.firstName, leadDetails.firstName) && this.isMapOldCallsForLead == leadDetails.isMapOldCallsForLead && this.isUpdateLastCallStatus == leadDetails.isUpdateLastCallStatus && AbstractC4154l.m8918a(this.lastName, leadDetails.lastName) && AbstractC4154l.m8918a(this.leadTags, leadDetails.leadTags) && AbstractC4154l.m8918a(this.number, leadDetails.number) && AbstractC4154l.m8918a(this.properties, leadDetails.properties) && AbstractC4154l.m8918a(this.secondaryCountryCode, leadDetails.secondaryCountryCode) && AbstractC4154l.m8918a(this.secondaryNumber, leadDetails.secondaryNumber) && AbstractC4154l.m8918a(this.status, leadDetails.status) && AbstractC4154l.m8918a(this.reminderDate, leadDetails.reminderDate);
    }

    /* renamed from: f */
    public final List m4672f() {
        return this.leadTags;
    }

    /* renamed from: g */
    public final String m4673g() {
        return this.number;
    }

    /* renamed from: h */
    public final LocalDateTime m4674h() {
        return this.reminderDate;
    }

    public final int hashCode() {
        String str = this.f44164id;
        int iM7369b = m0.m7369b(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.leadTags, AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC1452a.m4559f(this.assignedTo, AbstractC1452a.m4558e((str == null ? 0 : str.hashCode()) * 31, 31, this.assignToAll), 31), 31), 31, this.firstName), 31, this.isMapOldCallsForLead), 31, this.isUpdateLastCallStatus), 31, this.lastName), 31), 31, this.number), 31, this.properties);
        Integer num = this.secondaryCountryCode;
        int iM113d = AbstractC0030c.m113d((iM7369b + (num == null ? 0 : num.hashCode())) * 31, 31, this.secondaryNumber);
        String str2 = this.status;
        int iHashCode = (iM113d + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDateTime localDateTime = this.reminderDate;
        return iHashCode + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    /* renamed from: i */
    public final Integer m4675i() {
        return this.secondaryCountryCode;
    }

    /* renamed from: j */
    public final String m4676j() {
        return this.secondaryNumber;
    }

    /* renamed from: k */
    public final String m4677k() {
        return this.status;
    }

    /* renamed from: l */
    public final boolean m4678l() {
        return this.isMapOldCallsForLead;
    }

    public final String toString() {
        String str = this.f44164id;
        boolean z6 = this.assignToAll;
        List<String> list = this.assignedTo;
        int i10 = this.countryCode;
        String str2 = this.firstName;
        boolean z10 = this.isMapOldCallsForLead;
        boolean z11 = this.isUpdateLastCallStatus;
        String str3 = this.lastName;
        List<String> list2 = this.leadTags;
        String str4 = this.number;
        Map<String, Object> map = this.properties;
        Integer num = this.secondaryCountryCode;
        String str5 = this.secondaryNumber;
        String str6 = this.status;
        LocalDateTime localDateTime = this.reminderDate;
        StringBuilder sb2 = new StringBuilder("LeadDetails(id=");
        sb2.append(str);
        sb2.append(", assignToAll=");
        sb2.append(z6);
        sb2.append(", assignedTo=");
        sb2.append(list);
        sb2.append(", countryCode=");
        sb2.append(i10);
        sb2.append(", firstName=");
        AbstractC4801l.m9749w(sb2, str2, ", isMapOldCallsForLead=", z10, ", isUpdateLastCallStatus=");
        AbstractC4801l.m9751y(sb2, z11, ", lastName=", str3, ", leadTags=");
        sb2.append(list2);
        sb2.append(", number=");
        sb2.append(str4);
        sb2.append(", properties=");
        sb2.append(map);
        sb2.append(", secondaryCountryCode=");
        sb2.append(num);
        sb2.append(", secondaryNumber=");
        a1.m14319B(sb2, str5, ", status=", str6, ", reminderDate=");
        sb2.append(localDateTime);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ LeadDetails(String str, boolean z6, List list, int i10, String str2, boolean z10, boolean z11, String str3, List list2, String str4, Map map, Integer num, String str5, String str6, LocalDateTime localDateTime, int i11, AbstractC4148f abstractC4148f) {
        this((i11 & 1) != 0 ? null : str, z6, list, i10, str2, z10, z11, str3, list2, str4, map, num, str5, str6, localDateTime);
    }
}
