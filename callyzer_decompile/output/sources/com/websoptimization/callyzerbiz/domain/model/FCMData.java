package com.websoptimization.callyzerbiz.domain.model;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FCMData {
    public static final int $stable = 0;

    @InterfaceC4485b("body")
    private final String body;

    @InterfaceC4485b("dateTime")
    private final String callTime;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("code")
    private final String code;

    @InterfaceC4485b("countryCode")
    private final String countryCode;

    @InterfaceC4485b("deletedNoteTemplateIdList")
    private final String deletedNoteTemplateIdList;

    @InterfaceC4485b("duration")
    private final Integer duration;

    @InterfaceC4485b("existingUserName")
    private final String existingUserName;

    @InterfaceC4485b("extensionCode")
    private final String extensionCode;

    @InterfaceC4485b("image")
    private final String image;

    @InterfaceC4485b("isShowNotification")
    private final boolean isShowNotification;

    @InterfaceC4485b("isSyncLeadOnly")
    private final Boolean isSyncLeadOnly;

    @InterfaceC4485b("lastActiveTime")
    private final String lastActiveTime;

    @InterfaceC4485b("lastSyncCallTime")
    private final String lastSyncCallTime;

    @InterfaceC4485b("messageTemplateId")
    private final String messageTemplateId;

    @InterfaceC4485b("messageTemplateIdList")
    private final String messageTemplateIdList;

    @InterfaceC4485b("mobileNo")
    private final String mobileNo;

    @InterfaceC4485b("noteTemplateCreatedDateTime")
    private final String noteTemplateCreatedDateTime;

    @InterfaceC4485b("noteTemplateDescription")
    private final String noteTemplateDescription;

    @InterfaceC4485b("noteTemplateId")
    private final String noteTemplateId;

    @InterfaceC4485b("noteTemplateModifyDateTime")
    private final String noteTemplateModifyDateTime;

    @InterfaceC4485b("noteTemplateTitle")
    private final String noteTemplateTitle;

    @InterfaceC4485b("noteTemplateType")
    private final String noteTemplateType;

    @InterfaceC4485b("notificationBeforeDays")
    private final Integer notificationBeforeDays;

    @InterfaceC4485b("notificationType")
    private final String notificationType;

    @InterfaceC4485b("number")
    private final String number;

    @InterfaceC4485b("subscriptionEndDateTime")
    private final String subscriptionEndDateTime;

    @InterfaceC4485b("subscriptionStartDateTime")
    private final String subscriptionStartDateTime;

    @InterfaceC4485b("subscriptionType")
    private final String subscriptionType;

    @InterfaceC4485b(MessageBundle.TITLE_ENTRY)
    private final String title;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    @InterfaceC4485b("updatedEmployeeCode")
    private final String updatedEmployeeCode;

    @InterfaceC4485b("updatedMobileNo")
    private final String updatedMobileNo;

    @InterfaceC4485b("updatedUserName")
    private final String updatedUserName;

    public FCMData(String mobileNo, String str, String str2, String body, String code, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z6, String str25, String str26, Integer num2, String str27) {
        AbstractC4154l.m8923f(mobileNo, "mobileNo");
        AbstractC4154l.m8923f(body, "body");
        AbstractC4154l.m8923f(code, "code");
        this.mobileNo = mobileNo;
        this.subscriptionType = str;
        this.lastSyncCallTime = str2;
        this.body = body;
        this.code = code;
        this.title = str3;
        this.subscriptionEndDateTime = str4;
        this.notificationBeforeDays = num;
        this.notificationType = str5;
        this.subscriptionStartDateTime = str6;
        this.updatedMobileNo = str7;
        this.image = str8;
        this.existingUserName = str9;
        this.updatedUserName = str10;
        this.updatedEmployeeCode = str11;
        this.isSyncLeadOnly = bool;
        this.noteTemplateType = str12;
        this.noteTemplateId = str13;
        this.deletedNoteTemplateIdList = str14;
        this.noteTemplateDescription = str15;
        this.noteTemplateTitle = str16;
        this.noteTemplateModifyDateTime = str17;
        this.noteTemplateCreatedDateTime = str18;
        this.messageTemplateId = str19;
        this.messageTemplateIdList = str20;
        this.number = str21;
        this.countryCode = str22;
        this.extensionCode = str23;
        this.lastActiveTime = str24;
        this.isShowNotification = z6;
        this.callType = str25;
        this.callTime = str26;
        this.duration = num2;
        this.toNumber = str27;
    }

    public static /* synthetic */ FCMData copy$default(FCMData fCMData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z6, String str28, String str29, Integer num2, String str30, int i10, int i11, Object obj) {
        String str31;
        Integer num3;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        boolean z10;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        Integer num4;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        Boolean bool2;
        String str58;
        String str59;
        String str60 = (i10 & 1) != 0 ? fCMData.mobileNo : str;
        String str61 = (i10 & 2) != 0 ? fCMData.subscriptionType : str2;
        String str62 = (i10 & 4) != 0 ? fCMData.lastSyncCallTime : str3;
        String str63 = (i10 & 8) != 0 ? fCMData.body : str4;
        String str64 = (i10 & 16) != 0 ? fCMData.code : str5;
        String str65 = (i10 & 32) != 0 ? fCMData.title : str6;
        String str66 = (i10 & 64) != 0 ? fCMData.subscriptionEndDateTime : str7;
        Integer num5 = (i10 & 128) != 0 ? fCMData.notificationBeforeDays : num;
        String str67 = (i10 & 256) != 0 ? fCMData.notificationType : str8;
        String str68 = (i10 & 512) != 0 ? fCMData.subscriptionStartDateTime : str9;
        String str69 = (i10 & 1024) != 0 ? fCMData.updatedMobileNo : str10;
        String str70 = (i10 & NewHope.SENDB_BYTES) != 0 ? fCMData.image : str11;
        String str71 = (i10 & 4096) != 0 ? fCMData.existingUserName : str12;
        String str72 = (i10 & 8192) != 0 ? fCMData.updatedUserName : str13;
        String str73 = str60;
        String str74 = (i10 & 16384) != 0 ? fCMData.updatedEmployeeCode : str14;
        Boolean bool3 = (i10 & 32768) != 0 ? fCMData.isSyncLeadOnly : bool;
        String str75 = (i10 & 65536) != 0 ? fCMData.noteTemplateType : str15;
        String str76 = (i10 & 131072) != 0 ? fCMData.noteTemplateId : str16;
        String str77 = (i10 & 262144) != 0 ? fCMData.deletedNoteTemplateIdList : str17;
        String str78 = (i10 & 524288) != 0 ? fCMData.noteTemplateDescription : str18;
        String str79 = (i10 & 1048576) != 0 ? fCMData.noteTemplateTitle : str19;
        String str80 = (i10 & 2097152) != 0 ? fCMData.noteTemplateModifyDateTime : str20;
        String str81 = (i10 & 4194304) != 0 ? fCMData.noteTemplateCreatedDateTime : str21;
        String str82 = (i10 & 8388608) != 0 ? fCMData.messageTemplateId : str22;
        String str83 = (i10 & 16777216) != 0 ? fCMData.messageTemplateIdList : str23;
        String str84 = (i10 & 33554432) != 0 ? fCMData.number : str24;
        String str85 = (i10 & 67108864) != 0 ? fCMData.countryCode : str25;
        String str86 = (i10 & 134217728) != 0 ? fCMData.extensionCode : str26;
        String str87 = (i10 & 268435456) != 0 ? fCMData.lastActiveTime : str27;
        boolean z11 = (i10 & 536870912) != 0 ? fCMData.isShowNotification : z6;
        String str88 = (i10 & 1073741824) != 0 ? fCMData.callType : str28;
        String str89 = (i10 & Integer.MIN_VALUE) != 0 ? fCMData.callTime : str29;
        Integer num6 = (i11 & 1) != 0 ? fCMData.duration : num2;
        if ((i11 & 2) != 0) {
            num3 = num6;
            str31 = fCMData.toNumber;
            str33 = str77;
            str34 = str78;
            str35 = str79;
            str36 = str80;
            str37 = str81;
            str38 = str82;
            str39 = str83;
            str40 = str84;
            str41 = str85;
            str42 = str86;
            str43 = str87;
            z10 = z11;
            str44 = str88;
            str45 = str89;
            str46 = str74;
            str48 = str63;
            str49 = str64;
            str50 = str65;
            str51 = str66;
            num4 = num5;
            str52 = str67;
            str53 = str68;
            str54 = str69;
            str55 = str70;
            str56 = str71;
            str57 = str72;
            bool2 = bool3;
            str58 = str75;
            str32 = str76;
            str59 = str61;
            str47 = str62;
        } else {
            str31 = str30;
            num3 = num6;
            str32 = str76;
            str33 = str77;
            str34 = str78;
            str35 = str79;
            str36 = str80;
            str37 = str81;
            str38 = str82;
            str39 = str83;
            str40 = str84;
            str41 = str85;
            str42 = str86;
            str43 = str87;
            z10 = z11;
            str44 = str88;
            str45 = str89;
            str46 = str74;
            str47 = str62;
            str48 = str63;
            str49 = str64;
            str50 = str65;
            str51 = str66;
            num4 = num5;
            str52 = str67;
            str53 = str68;
            str54 = str69;
            str55 = str70;
            str56 = str71;
            str57 = str72;
            bool2 = bool3;
            str58 = str75;
            str59 = str61;
        }
        return fCMData.copy(str73, str59, str47, str48, str49, str50, str51, num4, str52, str53, str54, str55, str56, str57, str46, bool2, str58, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, z10, str44, str45, num3, str31);
    }

    public final String component1() {
        return this.mobileNo;
    }

    public final String component10() {
        return this.subscriptionStartDateTime;
    }

    public final String component11() {
        return this.updatedMobileNo;
    }

    public final String component12() {
        return this.image;
    }

    public final String component13() {
        return this.existingUserName;
    }

    public final String component14() {
        return this.updatedUserName;
    }

    public final String component15() {
        return this.updatedEmployeeCode;
    }

    public final Boolean component16() {
        return this.isSyncLeadOnly;
    }

    public final String component17() {
        return this.noteTemplateType;
    }

    public final String component18() {
        return this.noteTemplateId;
    }

    public final String component19() {
        return this.deletedNoteTemplateIdList;
    }

    public final String component2() {
        return this.subscriptionType;
    }

    public final String component20() {
        return this.noteTemplateDescription;
    }

    public final String component21() {
        return this.noteTemplateTitle;
    }

    public final String component22() {
        return this.noteTemplateModifyDateTime;
    }

    public final String component23() {
        return this.noteTemplateCreatedDateTime;
    }

    public final String component24() {
        return this.messageTemplateId;
    }

    public final String component25() {
        return this.messageTemplateIdList;
    }

    public final String component26() {
        return this.number;
    }

    public final String component27() {
        return this.countryCode;
    }

    public final String component28() {
        return this.extensionCode;
    }

    public final String component29() {
        return this.lastActiveTime;
    }

    public final String component3() {
        return this.lastSyncCallTime;
    }

    public final boolean component30() {
        return this.isShowNotification;
    }

    public final String component31() {
        return this.callType;
    }

    public final String component32() {
        return this.callTime;
    }

    public final Integer component33() {
        return this.duration;
    }

    public final String component34() {
        return this.toNumber;
    }

    public final String component4() {
        return this.body;
    }

    public final String component5() {
        return this.code;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.subscriptionEndDateTime;
    }

    public final Integer component8() {
        return this.notificationBeforeDays;
    }

    public final String component9() {
        return this.notificationType;
    }

    public final FCMData copy(String mobileNo, String str, String str2, String body, String code, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z6, String str25, String str26, Integer num2, String str27) {
        AbstractC4154l.m8923f(mobileNo, "mobileNo");
        AbstractC4154l.m8923f(body, "body");
        AbstractC4154l.m8923f(code, "code");
        return new FCMData(mobileNo, str, str2, body, code, str3, str4, num, str5, str6, str7, str8, str9, str10, str11, bool, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, z6, str25, str26, num2, str27);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FCMData)) {
            return false;
        }
        FCMData fCMData = (FCMData) obj;
        return AbstractC4154l.m8918a(this.mobileNo, fCMData.mobileNo) && AbstractC4154l.m8918a(this.subscriptionType, fCMData.subscriptionType) && AbstractC4154l.m8918a(this.lastSyncCallTime, fCMData.lastSyncCallTime) && AbstractC4154l.m8918a(this.body, fCMData.body) && AbstractC4154l.m8918a(this.code, fCMData.code) && AbstractC4154l.m8918a(this.title, fCMData.title) && AbstractC4154l.m8918a(this.subscriptionEndDateTime, fCMData.subscriptionEndDateTime) && AbstractC4154l.m8918a(this.notificationBeforeDays, fCMData.notificationBeforeDays) && AbstractC4154l.m8918a(this.notificationType, fCMData.notificationType) && AbstractC4154l.m8918a(this.subscriptionStartDateTime, fCMData.subscriptionStartDateTime) && AbstractC4154l.m8918a(this.updatedMobileNo, fCMData.updatedMobileNo) && AbstractC4154l.m8918a(this.image, fCMData.image) && AbstractC4154l.m8918a(this.existingUserName, fCMData.existingUserName) && AbstractC4154l.m8918a(this.updatedUserName, fCMData.updatedUserName) && AbstractC4154l.m8918a(this.updatedEmployeeCode, fCMData.updatedEmployeeCode) && AbstractC4154l.m8918a(this.isSyncLeadOnly, fCMData.isSyncLeadOnly) && AbstractC4154l.m8918a(this.noteTemplateType, fCMData.noteTemplateType) && AbstractC4154l.m8918a(this.noteTemplateId, fCMData.noteTemplateId) && AbstractC4154l.m8918a(this.deletedNoteTemplateIdList, fCMData.deletedNoteTemplateIdList) && AbstractC4154l.m8918a(this.noteTemplateDescription, fCMData.noteTemplateDescription) && AbstractC4154l.m8918a(this.noteTemplateTitle, fCMData.noteTemplateTitle) && AbstractC4154l.m8918a(this.noteTemplateModifyDateTime, fCMData.noteTemplateModifyDateTime) && AbstractC4154l.m8918a(this.noteTemplateCreatedDateTime, fCMData.noteTemplateCreatedDateTime) && AbstractC4154l.m8918a(this.messageTemplateId, fCMData.messageTemplateId) && AbstractC4154l.m8918a(this.messageTemplateIdList, fCMData.messageTemplateIdList) && AbstractC4154l.m8918a(this.number, fCMData.number) && AbstractC4154l.m8918a(this.countryCode, fCMData.countryCode) && AbstractC4154l.m8918a(this.extensionCode, fCMData.extensionCode) && AbstractC4154l.m8918a(this.lastActiveTime, fCMData.lastActiveTime) && this.isShowNotification == fCMData.isShowNotification && AbstractC4154l.m8918a(this.callType, fCMData.callType) && AbstractC4154l.m8918a(this.callTime, fCMData.callTime) && AbstractC4154l.m8918a(this.duration, fCMData.duration) && AbstractC4154l.m8918a(this.toNumber, fCMData.toNumber);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallTime() {
        return this.callTime;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDeletedNoteTemplateIdList() {
        return this.deletedNoteTemplateIdList;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getExistingUserName() {
        return this.existingUserName;
    }

    public final String getExtensionCode() {
        return this.extensionCode;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLastActiveTime() {
        return this.lastActiveTime;
    }

    public final String getLastSyncCallTime() {
        return this.lastSyncCallTime;
    }

    public final String getMessageTemplateId() {
        return this.messageTemplateId;
    }

    public final String getMessageTemplateIdList() {
        return this.messageTemplateIdList;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getNoteTemplateCreatedDateTime() {
        return this.noteTemplateCreatedDateTime;
    }

    public final String getNoteTemplateDescription() {
        return this.noteTemplateDescription;
    }

    public final String getNoteTemplateId() {
        return this.noteTemplateId;
    }

    public final String getNoteTemplateModifyDateTime() {
        return this.noteTemplateModifyDateTime;
    }

    public final String getNoteTemplateTitle() {
        return this.noteTemplateTitle;
    }

    public final String getNoteTemplateType() {
        return this.noteTemplateType;
    }

    public final Integer getNotificationBeforeDays() {
        return this.notificationBeforeDays;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSubscriptionEndDateTime() {
        return this.subscriptionEndDateTime;
    }

    public final String getSubscriptionStartDateTime() {
        return this.subscriptionStartDateTime;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToNumber() {
        return this.toNumber;
    }

    public final String getUpdatedEmployeeCode() {
        return this.updatedEmployeeCode;
    }

    public final String getUpdatedMobileNo() {
        return this.updatedMobileNo;
    }

    public final String getUpdatedUserName() {
        return this.updatedUserName;
    }

    public int hashCode() {
        int iHashCode = this.mobileNo.hashCode() * 31;
        String str = this.subscriptionType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastSyncCallTime;
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.body), 31, this.code);
        String str3 = this.title;
        int iHashCode3 = (iM113d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriptionEndDateTime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.notificationBeforeDays;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.notificationType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriptionStartDateTime;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.updatedMobileNo;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.image;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.existingUserName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updatedUserName;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedEmployeeCode;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.isSyncLeadOnly;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.noteTemplateType;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.noteTemplateId;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.deletedNoteTemplateIdList;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.noteTemplateDescription;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.noteTemplateTitle;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.noteTemplateModifyDateTime;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.noteTemplateCreatedDateTime;
        int iHashCode20 = (iHashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.messageTemplateId;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.messageTemplateIdList;
        int iHashCode22 = (iHashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.number;
        int iHashCode23 = (iHashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.countryCode;
        int iHashCode24 = (iHashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.extensionCode;
        int iHashCode25 = (iHashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.lastActiveTime;
        int iM4558e = AbstractC1452a.m4558e((iHashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31, 31, this.isShowNotification);
        String str25 = this.callType;
        int iHashCode26 = (iM4558e + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.callTime;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num2 = this.duration;
        int iHashCode28 = (iHashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str27 = this.toNumber;
        return iHashCode28 + (str27 != null ? str27.hashCode() : 0);
    }

    public final boolean isShowNotification() {
        return this.isShowNotification;
    }

    public final Boolean isSyncLeadOnly() {
        return this.isSyncLeadOnly;
    }

    public String toString() {
        String str = this.mobileNo;
        String str2 = this.subscriptionType;
        String str3 = this.lastSyncCallTime;
        String str4 = this.body;
        String str5 = this.code;
        String str6 = this.title;
        String str7 = this.subscriptionEndDateTime;
        Integer num = this.notificationBeforeDays;
        String str8 = this.notificationType;
        String str9 = this.subscriptionStartDateTime;
        String str10 = this.updatedMobileNo;
        String str11 = this.image;
        String str12 = this.existingUserName;
        String str13 = this.updatedUserName;
        String str14 = this.updatedEmployeeCode;
        Boolean bool = this.isSyncLeadOnly;
        String str15 = this.noteTemplateType;
        String str16 = this.noteTemplateId;
        String str17 = this.deletedNoteTemplateIdList;
        String str18 = this.noteTemplateDescription;
        String str19 = this.noteTemplateTitle;
        String str20 = this.noteTemplateModifyDateTime;
        String str21 = this.noteTemplateCreatedDateTime;
        String str22 = this.messageTemplateId;
        String str23 = this.messageTemplateIdList;
        String str24 = this.number;
        String str25 = this.countryCode;
        String str26 = this.extensionCode;
        String str27 = this.lastActiveTime;
        boolean z6 = this.isShowNotification;
        String str28 = this.callType;
        String str29 = this.callTime;
        Integer num2 = this.duration;
        String str30 = this.toNumber;
        StringBuilder sbM127r = AbstractC0030c.m127r("FCMData(mobileNo=", str, ", subscriptionType=", str2, ", lastSyncCallTime=");
        a1.m14319B(sbM127r, str3, ", body=", str4, ", code=");
        a1.m14319B(sbM127r, str5, ", title=", str6, ", subscriptionEndDateTime=");
        sbM127r.append(str7);
        sbM127r.append(", notificationBeforeDays=");
        sbM127r.append(num);
        sbM127r.append(", notificationType=");
        a1.m14319B(sbM127r, str8, ", subscriptionStartDateTime=", str9, ", updatedMobileNo=");
        a1.m14319B(sbM127r, str10, ", image=", str11, ", existingUserName=");
        a1.m14319B(sbM127r, str12, ", updatedUserName=", str13, ", updatedEmployeeCode=");
        sbM127r.append(str14);
        sbM127r.append(", isSyncLeadOnly=");
        sbM127r.append(bool);
        sbM127r.append(", noteTemplateType=");
        a1.m14319B(sbM127r, str15, ", noteTemplateId=", str16, ", deletedNoteTemplateIdList=");
        a1.m14319B(sbM127r, str17, ", noteTemplateDescription=", str18, ", noteTemplateTitle=");
        a1.m14319B(sbM127r, str19, ", noteTemplateModifyDateTime=", str20, ", noteTemplateCreatedDateTime=");
        a1.m14319B(sbM127r, str21, ", messageTemplateId=", str22, ", messageTemplateIdList=");
        a1.m14319B(sbM127r, str23, ", number=", str24, ", countryCode=");
        a1.m14319B(sbM127r, str25, ", extensionCode=", str26, ", lastActiveTime=");
        AbstractC4801l.m9749w(sbM127r, str27, ", isShowNotification=", z6, ", callType=");
        a1.m14319B(sbM127r, str28, ", callTime=", str29, ", duration=");
        sbM127r.append(num2);
        sbM127r.append(", toNumber=");
        sbM127r.append(str30);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ FCMData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z6, String str28, String str29, Integer num2, String str30, int i10, int i11, AbstractC4148f abstractC4148f) {
        this(str, str2, str3, str4, str5, str6, str7, num, str8, str9, str10, str11, str12, str13, str14, bool, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, (i10 & 536870912) != 0 ? false : z6, str28, str29, num2, str30);
    }
}
