package com.websoptimization.callyzerbiz.data.model.request.lead_request;

import j$.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class StaticProperties {

    @InterfaceC4485b("createdDate")
    private final CreatedDate createdDate;

    @InterfaceC4485b("firstName")
    private final String firstName;

    @InterfaceC4485b("fromDate")
    private final LocalDate fromDate;

    @InterfaceC4485b("lastName")
    private final String lastName;

    @InterfaceC4485b("mobileNo")
    private final String mobileNo;

    @InterfaceC4485b("reminderDate")
    private final ReminderDate reminderDate;

    @InterfaceC4485b("serialNo")
    private final String serialNo;

    @InterfaceC4485b("status")
    private final List<String> status;

    @InterfaceC4485b("tags")
    private final List<String> tags;

    public StaticProperties() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: a */
    public static StaticProperties m4702a(StaticProperties staticProperties, ReminderDate reminderDate) {
        return new StaticProperties(staticProperties.createdDate, staticProperties.status, reminderDate, staticProperties.serialNo, staticProperties.tags, staticProperties.firstName, staticProperties.lastName, staticProperties.mobileNo, staticProperties.fromDate);
    }

    /* renamed from: b */
    public final CreatedDate m4703b() {
        return this.createdDate;
    }

    /* renamed from: c */
    public final String m4704c() {
        return this.firstName;
    }

    /* renamed from: d */
    public final LocalDate m4705d() {
        return this.fromDate;
    }

    /* renamed from: e */
    public final String m4706e() {
        return this.lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticProperties)) {
            return false;
        }
        StaticProperties staticProperties = (StaticProperties) obj;
        return AbstractC4154l.m8918a(this.createdDate, staticProperties.createdDate) && AbstractC4154l.m8918a(this.status, staticProperties.status) && AbstractC4154l.m8918a(this.reminderDate, staticProperties.reminderDate) && AbstractC4154l.m8918a(this.serialNo, staticProperties.serialNo) && AbstractC4154l.m8918a(this.tags, staticProperties.tags) && AbstractC4154l.m8918a(this.firstName, staticProperties.firstName) && AbstractC4154l.m8918a(this.lastName, staticProperties.lastName) && AbstractC4154l.m8918a(this.mobileNo, staticProperties.mobileNo) && AbstractC4154l.m8918a(this.fromDate, staticProperties.fromDate);
    }

    /* renamed from: f */
    public final String m4707f() {
        return this.mobileNo;
    }

    /* renamed from: g */
    public final ReminderDate m4708g() {
        return this.reminderDate;
    }

    /* renamed from: h */
    public final String m4709h() {
        return this.serialNo;
    }

    public final int hashCode() {
        CreatedDate createdDate = this.createdDate;
        int iHashCode = (createdDate == null ? 0 : createdDate.hashCode()) * 31;
        List<String> list = this.status;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ReminderDate reminderDate = this.reminderDate;
        int iHashCode3 = (iHashCode2 + (reminderDate == null ? 0 : reminderDate.hashCode())) * 31;
        String str = this.serialNo;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.tags;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mobileNo;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate = this.fromDate;
        return iHashCode8 + (localDate != null ? localDate.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m4710i() {
        return this.status;
    }

    /* renamed from: j */
    public final List m4711j() {
        return this.tags;
    }

    public final String toString() {
        CreatedDate createdDate = this.createdDate;
        List<String> list = this.status;
        ReminderDate reminderDate = this.reminderDate;
        String str = this.serialNo;
        List<String> list2 = this.tags;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.mobileNo;
        LocalDate localDate = this.fromDate;
        StringBuilder sb2 = new StringBuilder("StaticProperties(createdDate=");
        sb2.append(createdDate);
        sb2.append(", status=");
        sb2.append(list);
        sb2.append(", reminderDate=");
        sb2.append(reminderDate);
        sb2.append(", serialNo=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list2);
        sb2.append(", firstName=");
        sb2.append(str2);
        sb2.append(", lastName=");
        a1.m14319B(sb2, str3, ", mobileNo=", str4, ", fromDate=");
        sb2.append(localDate);
        sb2.append(")");
        return sb2.toString();
    }

    public StaticProperties(CreatedDate createdDate, List<String> list, ReminderDate reminderDate, String str, List<String> list2, String str2, String str3, String str4, LocalDate localDate) {
        this.createdDate = createdDate;
        this.status = list;
        this.reminderDate = reminderDate;
        this.serialNo = str;
        this.tags = list2;
        this.firstName = str2;
        this.lastName = str3;
        this.mobileNo = str4;
        this.fromDate = localDate;
    }

    public /* synthetic */ StaticProperties(CreatedDate createdDate, List list, ReminderDate reminderDate, String str, List list2, String str2, String str3, String str4, LocalDate localDate, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : createdDate, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : reminderDate, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : list2, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : localDate);
    }
}
