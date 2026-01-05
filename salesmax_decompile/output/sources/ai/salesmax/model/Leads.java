package ai.salesmax.model;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.custom.PropertyDefinitionRepository;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.f9g;
import p001o.id5;
import p001o.lpi;
import p001o.sq8;
import p001o.ss9;
import p001o.yfe;
import type.CallDirection;
import type.LeadLifecycleStage;

/* loaded from: classes.dex */
public final class Leads extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Leads> CREATOR = new Creator();
    private final String activeDealStage;
    private final Date activeDealStageUpdatedAt;
    private BusinessInfo addedBusiness;
    private String attentionText;
    private final Date becameCustomerOn;
    private String bulkUploadReference;
    private final List<String> businessIds;
    private ArrayList<CallLogs> callHistory;
    private String company;
    private String contactAddedByID;
    private String contactID;
    private double contactLat;
    private double contactLng;
    private String contactLocation;
    private String contactOwner;
    private String contactOwnerID;
    private String contactOwnerProfile;
    private String contactPriority;
    private String contactSource;
    private String contactSourceOne;
    private String contactSourceThree;
    private String contactSourceTwo;
    private String contactType;
    private Long createdAt;
    private String customAttributes;
    private CustomFormDataObservable customAttributesObservable;
    private String customDataAddedFromAddContactForm;
    private final String dealDescription;
    private String designation;
    private ArrayList<String> emails;
    private String firstName;
    private final Date firstProspectingDoneOn;
    private final String freshLeadTag;
    private final String isCustomer;
    private boolean isSelected;
    private final String lastCallDirection;
    private final int lastCallDuration;
    private final String lastCallEngagementId;
    private final String lastCallOutcome;
    private final String lastCallUserId;
    private final Date lastCalledTime;
    private final String lastDealStageType;
    private final String lastEmailEngagementId;
    private final Date lastEmailTime;
    private final String lastEmailUserId;
    private final Date lastEngagementTimeFromAccount;
    private final Date lastEngagementTimeFromContact;
    private final String lastKnownDisposition;
    private final Date lastKnownDispositionTime;
    private final long lastLeadAssignmentDateTimeInMillis;
    private String lastName;
    private final Date lastNoteAddedTime;
    private final String lastNoteEngagementId;
    private final String lastNoteUserId;
    private final Date lastProspectingDoneOn;
    private final String lastTaskDoneEngagementId;
    private final Date lastTaskDoneTime;
    private final String lastTaskDoneUserId;
    private final String lastVisitEngagementId;
    private final String lastVisitOutcome;
    private final Date lastVisitTime;
    private final String lastVisitUserId;
    private final String lastWhatsappEngagementId;
    private final Date lastWhatsappTime;
    private final String lastWhatsappUserId;
    private final String latestRemark;
    private final String leadLifecycleStage;
    private final String leadLifecycleStageSubCategory;
    private String lookupKey;
    private String manuallyClosedReason;
    private String name;
    private final String needFollowUpTag;
    private final Date needFollowUpTagUpdatedAt;
    private Date nextProspectingDueOn;
    private String nextProspectingNote;
    private String nextProspectingSetBy;
    private final Integer openTaskCount;
    private OpenTaskDetail openTaskDetail;
    private VideoMeeting openVideoCallDetail;
    private PaymentDetail paymentRequestDetail;
    private ArrayList<String> phoneNumbers;
    private ArrayList<PhoneDetail> phoneNumbersWithWhatsapp;
    private String primaryTeamId;
    private String profilePic;
    private final Integer prospectingAttempts;
    private final List<RecentAction> recentEngagements;
    private String salutation;
    private boolean saveToCRM;
    private String secondaryDisplayTitle;
    private boolean showBottom;
    private boolean showSelection;
    private SubmittedFormValues submittedFormValues;
    private final Integer unsuccessfulCallAttempts;
    private Long updatedAt;
    private List<String> userDefinedTags;
    private String waChannelId;

    public static final class Creator implements Parcelable.Creator<Leads> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Leads createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            BusinessInfo businessInfoCreateFromParcel = parcel.readInt() == 0 ? null : BusinessInfo.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            String string18 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string19 = parcel.readString();
            int i = parcel.readInt();
            boolean z2 = z;
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(CallLogs.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(PhoneDetail.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            SubmittedFormValues submittedFormValuesCreateFromParcel = parcel.readInt() == 0 ? null : SubmittedFormValues.CREATOR.createFromParcel(parcel);
            Date date = (Date) parcel.readSerializable();
            int i5 = parcel.readInt();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            Date date2 = (Date) parcel.readSerializable();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            Date date3 = (Date) parcel.readSerializable();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            Date date4 = (Date) parcel.readSerializable();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            Date date5 = (Date) parcel.readSerializable();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            Date date6 = (Date) parcel.readSerializable();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string42 = parcel.readString();
            Date date7 = (Date) parcel.readSerializable();
            Date date8 = (Date) parcel.readSerializable();
            Date date9 = (Date) parcel.readSerializable();
            long j = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            Date date10 = (Date) parcel.readSerializable();
            String string45 = parcel.readString();
            Date date11 = (Date) parcel.readSerializable();
            String string46 = parcel.readString();
            String string47 = parcel.readString();
            Date date12 = (Date) parcel.readSerializable();
            String string48 = parcel.readString();
            String string49 = parcel.readString();
            CustomFormDataObservable customFormDataObservable = (CustomFormDataObservable) parcel.readParcelable(Leads.class.getClassLoader());
            String string50 = parcel.readString();
            String string51 = parcel.readString();
            String string52 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Date date13 = (Date) parcel.readSerializable();
            Date date14 = (Date) parcel.readSerializable();
            Date date15 = (Date) parcel.readSerializable();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            String string55 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList3.add(RecentAction.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new Leads(string, string2, string3, string4, string5, string6, businessInfoCreateFromParcel, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, d, d2, string18, z2, string19, arrayList, arrayListCreateStringArrayList, arrayList2, arrayListCreateStringArrayList2, string20, string21, string22, string23, z3, z4, z5, string24, string25, string26, submittedFormValuesCreateFromParcel, date, i5, string27, string28, string29, string30, date2, string31, string32, string33, date3, string34, string35, date4, string36, string37, date5, string38, string39, date6, string40, string41, numValueOf, numValueOf2, string42, date7, date8, date9, j, arrayListCreateStringArrayList3, string43, string44, date10, string45, date11, string46, string47, date12, string48, string49, customFormDataObservable, string50, string51, string52, numValueOf3, date13, date14, date15, string53, string54, string55, arrayList3, parcel.readInt() == 0 ? null : VideoMeeting.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OpenTaskDetail.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentDetail.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Leads[] newArray(int i) {
            return new Leads[i];
        }
    }

    public Leads() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, null);
    }

    public static /* synthetic */ Leads copy$default(Leads leads, String str, String str2, String str3, String str4, String str5, String str6, BusinessInfo businessInfo, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, double d, double d2, String str18, boolean z, String str19, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str20, String str21, String str22, String str23, boolean z2, boolean z3, boolean z4, String str24, String str25, String str26, SubmittedFormValues submittedFormValues, Date date, int i, String str27, String str28, String str29, String str30, Date date2, String str31, String str32, String str33, Date date3, String str34, String str35, Date date4, String str36, String str37, Date date5, String str38, String str39, Date date6, String str40, String str41, Integer num, Integer num2, String str42, Date date7, Date date8, Date date9, long j, List list, String str43, String str44, Date date10, String str45, Date date11, String str46, String str47, Date date12, String str48, String str49, CustomFormDataObservable customFormDataObservable, String str50, String str51, String str52, Integer num3, Date date13, Date date14, Date date15, String str53, String str54, String str55, List list2, VideoMeeting videoMeeting, OpenTaskDetail openTaskDetail, PaymentDetail paymentDetail, List list3, Long l, Long l2, int i2, int i3, int i4, Object obj) {
        String str56 = (i2 & 1) != 0 ? leads.salutation : str;
        String str57 = (i2 & 2) != 0 ? leads.firstName : str2;
        String str58 = (i2 & 4) != 0 ? leads.lastName : str3;
        String str59 = (i2 & 8) != 0 ? leads.name : str4;
        String str60 = (i2 & 16) != 0 ? leads.designation : str5;
        String str61 = (i2 & 32) != 0 ? leads.company : str6;
        BusinessInfo businessInfo2 = (i2 & 64) != 0 ? leads.addedBusiness : businessInfo;
        String str62 = (i2 & 128) != 0 ? leads.contactType : str7;
        String str63 = (i2 & 256) != 0 ? leads.contactOwner : str8;
        String str64 = (i2 & 512) != 0 ? leads.contactOwnerID : str9;
        String str65 = (i2 & 1024) != 0 ? leads.contactAddedByID : str10;
        return leads.copy(str56, str57, str58, str59, str60, str61, businessInfo2, str62, str63, str64, str65, (i2 & 2048) != 0 ? leads.contactSource : str11, (i2 & 4096) != 0 ? leads.contactSourceOne : str12, (i2 & 8192) != 0 ? leads.contactSourceTwo : str13, (i2 & Opcodes.ACC_ENUM) != 0 ? leads.contactSourceThree : str14, (i2 & 32768) != 0 ? leads.contactOwnerProfile : str15, (i2 & 65536) != 0 ? leads.contactPriority : str16, (i2 & Opcodes.ACC_DEPRECATED) != 0 ? leads.contactLocation : str17, (i2 & 262144) != 0 ? leads.contactLat : d, (i2 & Opcodes.ASM8) != 0 ? leads.contactLng : d2, (i2 & 1048576) != 0 ? leads.bulkUploadReference : str18, (i2 & 2097152) != 0 ? leads.saveToCRM : z, (i2 & 4194304) != 0 ? leads.waChannelId : str19, (i2 & 8388608) != 0 ? leads.callHistory : arrayList, (i2 & 16777216) != 0 ? leads.phoneNumbers : arrayList2, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? leads.phoneNumbersWithWhatsapp : arrayList3, (i2 & 67108864) != 0 ? leads.emails : arrayList4, (i2 & 134217728) != 0 ? leads.contactID : str20, (i2 & 268435456) != 0 ? leads.primaryTeamId : str21, (i2 & 536870912) != 0 ? leads.lookupKey : str22, (i2 & 1073741824) != 0 ? leads.profilePic : str23, (i2 & Integer.MIN_VALUE) != 0 ? leads.showSelection : z2, (i3 & 1) != 0 ? leads.isSelected : z3, (i3 & 2) != 0 ? leads.showBottom : z4, (i3 & 4) != 0 ? leads.attentionText : str24, (i3 & 8) != 0 ? leads.secondaryDisplayTitle : str25, (i3 & 16) != 0 ? leads.customDataAddedFromAddContactForm : str26, (i3 & 32) != 0 ? leads.submittedFormValues : submittedFormValues, (i3 & 64) != 0 ? leads.lastCalledTime : date, (i3 & 128) != 0 ? leads.lastCallDuration : i, (i3 & 256) != 0 ? leads.lastCallDirection : str27, (i3 & 512) != 0 ? leads.lastCallUserId : str28, (i3 & 1024) != 0 ? leads.lastCallOutcome : str29, (i3 & 2048) != 0 ? leads.lastCallEngagementId : str30, (i3 & 4096) != 0 ? leads.lastVisitTime : date2, (i3 & 8192) != 0 ? leads.lastVisitUserId : str31, (i3 & Opcodes.ACC_ENUM) != 0 ? leads.lastVisitOutcome : str32, (i3 & 32768) != 0 ? leads.lastVisitEngagementId : str33, (i3 & 65536) != 0 ? leads.lastEmailTime : date3, (i3 & Opcodes.ACC_DEPRECATED) != 0 ? leads.lastEmailUserId : str34, (i3 & 262144) != 0 ? leads.lastEmailEngagementId : str35, (i3 & Opcodes.ASM8) != 0 ? leads.lastWhatsappTime : date4, (i3 & 1048576) != 0 ? leads.lastWhatsappUserId : str36, (i3 & 2097152) != 0 ? leads.lastWhatsappEngagementId : str37, (i3 & 4194304) != 0 ? leads.lastNoteAddedTime : date5, (i3 & 8388608) != 0 ? leads.lastNoteUserId : str38, (i3 & 16777216) != 0 ? leads.lastNoteEngagementId : str39, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? leads.lastTaskDoneTime : date6, (i3 & 67108864) != 0 ? leads.lastTaskDoneUserId : str40, (i3 & 134217728) != 0 ? leads.lastTaskDoneEngagementId : str41, (i3 & 268435456) != 0 ? leads.openTaskCount : num, (i3 & 536870912) != 0 ? leads.unsuccessfulCallAttempts : num2, (i3 & 1073741824) != 0 ? leads.lastKnownDisposition : str42, (i3 & Integer.MIN_VALUE) != 0 ? leads.lastKnownDispositionTime : date7, (i4 & 1) != 0 ? leads.lastEngagementTimeFromAccount : date8, (i4 & 2) != 0 ? leads.lastEngagementTimeFromContact : date9, (i4 & 4) != 0 ? leads.lastLeadAssignmentDateTimeInMillis : j, (i4 & 8) != 0 ? leads.userDefinedTags : list, (i4 & 16) != 0 ? leads.freshLeadTag : str43, (i4 & 32) != 0 ? leads.needFollowUpTag : str44, (i4 & 64) != 0 ? leads.needFollowUpTagUpdatedAt : date10, (i4 & 128) != 0 ? leads.activeDealStage : str45, (i4 & 256) != 0 ? leads.activeDealStageUpdatedAt : date11, (i4 & 512) != 0 ? leads.dealDescription : str46, (i4 & 1024) != 0 ? leads.isCustomer : str47, (i4 & 2048) != 0 ? leads.becameCustomerOn : date12, (i4 & 4096) != 0 ? leads.latestRemark : str48, (i4 & 8192) != 0 ? leads.customAttributes : str49, (i4 & Opcodes.ACC_ENUM) != 0 ? leads.customAttributesObservable : customFormDataObservable, (i4 & 32768) != 0 ? leads.leadLifecycleStage : str50, (i4 & 65536) != 0 ? leads.leadLifecycleStageSubCategory : str51, (i4 & Opcodes.ACC_DEPRECATED) != 0 ? leads.lastDealStageType : str52, (i4 & 262144) != 0 ? leads.prospectingAttempts : num3, (i4 & Opcodes.ASM8) != 0 ? leads.firstProspectingDoneOn : date13, (i4 & 1048576) != 0 ? leads.lastProspectingDoneOn : date14, (i4 & 2097152) != 0 ? leads.nextProspectingDueOn : date15, (i4 & 4194304) != 0 ? leads.nextProspectingSetBy : str53, (i4 & 8388608) != 0 ? leads.nextProspectingNote : str54, (i4 & 16777216) != 0 ? leads.manuallyClosedReason : str55, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? leads.recentEngagements : list2, (i4 & 67108864) != 0 ? leads.openVideoCallDetail : videoMeeting, (i4 & 134217728) != 0 ? leads.openTaskDetail : openTaskDetail, (i4 & 268435456) != 0 ? leads.paymentRequestDetail : paymentDetail, (i4 & 536870912) != 0 ? leads.businessIds : list3, (i4 & 1073741824) != 0 ? leads.updatedAt : l, (i4 & Integer.MIN_VALUE) != 0 ? leads.createdAt : l2);
    }

    public final Date calculateProspectExpiringOn() {
        try {
            sq8.m48644c(this.leadLifecycleStage, LeadLifecycleStage.PROSPECTING.name());
        } catch (Exception unused) {
        }
        return null;
    }

    public final String component1() {
        return this.salutation;
    }

    public final String component10() {
        return this.contactOwnerID;
    }

    public final String component11() {
        return this.contactAddedByID;
    }

    public final String component12() {
        return this.contactSource;
    }

    public final String component13() {
        return this.contactSourceOne;
    }

    public final String component14() {
        return this.contactSourceTwo;
    }

    public final String component15() {
        return this.contactSourceThree;
    }

    public final String component16() {
        return this.contactOwnerProfile;
    }

    public final String component17() {
        return this.contactPriority;
    }

    public final String component18() {
        return this.contactLocation;
    }

    public final double component19() {
        return this.contactLat;
    }

    public final String component2() {
        return this.firstName;
    }

    public final double component20() {
        return this.contactLng;
    }

    public final String component21() {
        return this.bulkUploadReference;
    }

    public final boolean component22() {
        return this.saveToCRM;
    }

    public final String component23() {
        return this.waChannelId;
    }

    public final ArrayList<CallLogs> component24() {
        return this.callHistory;
    }

    public final ArrayList<String> component25() {
        return this.phoneNumbers;
    }

    public final ArrayList<PhoneDetail> component26() {
        return this.phoneNumbersWithWhatsapp;
    }

    public final ArrayList<String> component27() {
        return this.emails;
    }

    public final String component28() {
        return this.contactID;
    }

    public final String component29() {
        return this.primaryTeamId;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component30() {
        return this.lookupKey;
    }

    public final String component31() {
        return this.profilePic;
    }

    public final boolean component32() {
        return this.showSelection;
    }

    public final boolean component33() {
        return this.isSelected;
    }

    public final boolean component34() {
        return this.showBottom;
    }

    public final String component35() {
        return this.attentionText;
    }

    public final String component36() {
        return this.secondaryDisplayTitle;
    }

    public final String component37() {
        return this.customDataAddedFromAddContactForm;
    }

    public final SubmittedFormValues component38() {
        return this.submittedFormValues;
    }

    public final Date component39() {
        return this.lastCalledTime;
    }

    public final String component4() {
        return this.name;
    }

    public final int component40() {
        return this.lastCallDuration;
    }

    public final String component41() {
        return this.lastCallDirection;
    }

    public final String component42() {
        return this.lastCallUserId;
    }

    public final String component43() {
        return this.lastCallOutcome;
    }

    public final String component44() {
        return this.lastCallEngagementId;
    }

    public final Date component45() {
        return this.lastVisitTime;
    }

    public final String component46() {
        return this.lastVisitUserId;
    }

    public final String component47() {
        return this.lastVisitOutcome;
    }

    public final String component48() {
        return this.lastVisitEngagementId;
    }

    public final Date component49() {
        return this.lastEmailTime;
    }

    public final String component5() {
        return this.designation;
    }

    public final String component50() {
        return this.lastEmailUserId;
    }

    public final String component51() {
        return this.lastEmailEngagementId;
    }

    public final Date component52() {
        return this.lastWhatsappTime;
    }

    public final String component53() {
        return this.lastWhatsappUserId;
    }

    public final String component54() {
        return this.lastWhatsappEngagementId;
    }

    public final Date component55() {
        return this.lastNoteAddedTime;
    }

    public final String component56() {
        return this.lastNoteUserId;
    }

    public final String component57() {
        return this.lastNoteEngagementId;
    }

    public final Date component58() {
        return this.lastTaskDoneTime;
    }

    public final String component59() {
        return this.lastTaskDoneUserId;
    }

    public final String component6() {
        return this.company;
    }

    public final String component60() {
        return this.lastTaskDoneEngagementId;
    }

    public final Integer component61() {
        return this.openTaskCount;
    }

    public final Integer component62() {
        return this.unsuccessfulCallAttempts;
    }

    public final String component63() {
        return this.lastKnownDisposition;
    }

    public final Date component64() {
        return this.lastKnownDispositionTime;
    }

    public final Date component65() {
        return this.lastEngagementTimeFromAccount;
    }

    public final Date component66() {
        return this.lastEngagementTimeFromContact;
    }

    public final long component67() {
        return this.lastLeadAssignmentDateTimeInMillis;
    }

    public final List<String> component68() {
        return this.userDefinedTags;
    }

    public final String component69() {
        return this.freshLeadTag;
    }

    public final BusinessInfo component7() {
        return this.addedBusiness;
    }

    public final String component70() {
        return this.needFollowUpTag;
    }

    public final Date component71() {
        return this.needFollowUpTagUpdatedAt;
    }

    public final String component72() {
        return this.activeDealStage;
    }

    public final Date component73() {
        return this.activeDealStageUpdatedAt;
    }

    public final String component74() {
        return this.dealDescription;
    }

    public final String component75() {
        return this.isCustomer;
    }

    public final Date component76() {
        return this.becameCustomerOn;
    }

    public final String component77() {
        return this.latestRemark;
    }

    public final String component78() {
        return this.customAttributes;
    }

    public final CustomFormDataObservable component79() {
        return this.customAttributesObservable;
    }

    public final String component8() {
        return this.contactType;
    }

    public final String component80() {
        return this.leadLifecycleStage;
    }

    public final String component81() {
        return this.leadLifecycleStageSubCategory;
    }

    public final String component82() {
        return this.lastDealStageType;
    }

    public final Integer component83() {
        return this.prospectingAttempts;
    }

    public final Date component84() {
        return this.firstProspectingDoneOn;
    }

    public final Date component85() {
        return this.lastProspectingDoneOn;
    }

    public final Date component86() {
        return this.nextProspectingDueOn;
    }

    public final String component87() {
        return this.nextProspectingSetBy;
    }

    public final String component88() {
        return this.nextProspectingNote;
    }

    public final String component89() {
        return this.manuallyClosedReason;
    }

    public final String component9() {
        return this.contactOwner;
    }

    public final List<RecentAction> component90() {
        return this.recentEngagements;
    }

    public final VideoMeeting component91() {
        return this.openVideoCallDetail;
    }

    public final OpenTaskDetail component92() {
        return this.openTaskDetail;
    }

    public final PaymentDetail component93() {
        return this.paymentRequestDetail;
    }

    public final List<String> component94() {
        return this.businessIds;
    }

    public final Long component95() {
        return this.updatedAt;
    }

    public final Long component96() {
        return this.createdAt;
    }

    public final Leads copy(String str, String str2, String str3, String str4, String str5, String str6, BusinessInfo businessInfo, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, double d, double d2, String str18, boolean z, String str19, ArrayList<CallLogs> arrayList, ArrayList<String> arrayList2, ArrayList<PhoneDetail> arrayList3, ArrayList<String> arrayList4, String str20, String str21, String str22, String str23, boolean z2, boolean z3, boolean z4, String str24, String str25, String str26, SubmittedFormValues submittedFormValues, Date date, int i, String str27, String str28, String str29, String str30, Date date2, String str31, String str32, String str33, Date date3, String str34, String str35, Date date4, String str36, String str37, Date date5, String str38, String str39, Date date6, String str40, String str41, Integer num, Integer num2, String str42, Date date7, Date date8, Date date9, long j, List<String> list, String str43, String str44, Date date10, String str45, Date date11, String str46, String str47, Date date12, String str48, String str49, CustomFormDataObservable customFormDataObservable, String str50, String str51, String str52, Integer num3, Date date13, Date date14, Date date15, String str53, String str54, String str55, List<RecentAction> list2, VideoMeeting videoMeeting, OpenTaskDetail openTaskDetail, PaymentDetail paymentDetail, List<String> list3, Long l, Long l2) {
        sq8.m48649h(str4, "name");
        sq8.m48649h(str5, "designation");
        sq8.m48649h(str6, "company");
        sq8.m48649h(str7, "contactType");
        sq8.m48649h(str8, "contactOwner");
        sq8.m48649h(str9, "contactOwnerID");
        sq8.m48649h(str10, "contactAddedByID");
        sq8.m48649h(str11, "contactSource");
        sq8.m48649h(str12, "contactSourceOne");
        sq8.m48649h(str13, "contactSourceTwo");
        sq8.m48649h(str14, "contactSourceThree");
        sq8.m48649h(str15, "contactOwnerProfile");
        sq8.m48649h(str16, "contactPriority");
        sq8.m48649h(str17, "contactLocation");
        sq8.m48649h(str18, "bulkUploadReference");
        sq8.m48649h(str19, "waChannelId");
        sq8.m48649h(arrayList, "callHistory");
        sq8.m48649h(arrayList2, "phoneNumbers");
        sq8.m48649h(arrayList3, "phoneNumbersWithWhatsapp");
        sq8.m48649h(arrayList4, "emails");
        sq8.m48649h(str20, "contactID");
        sq8.m48649h(str22, "lookupKey");
        sq8.m48649h(str23, "profilePic");
        sq8.m48649h(str24, "attentionText");
        sq8.m48649h(str25, "secondaryDisplayTitle");
        sq8.m48649h(list2, "recentEngagements");
        sq8.m48649h(list3, "businessIds");
        return new Leads(str, str2, str3, str4, str5, str6, businessInfo, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, d, d2, str18, z, str19, arrayList, arrayList2, arrayList3, arrayList4, str20, str21, str22, str23, z2, z3, z4, str24, str25, str26, submittedFormValues, date, i, str27, str28, str29, str30, date2, str31, str32, str33, date3, str34, str35, date4, str36, str37, date5, str38, str39, date6, str40, str41, num, num2, str42, date7, date8, date9, j, list, str43, str44, date10, str45, date11, str46, str47, date12, str48, str49, customFormDataObservable, str50, str51, str52, num3, date13, date14, date15, str53, str54, str55, list2, videoMeeting, openTaskDetail, paymentDetail, list3, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Leads)) {
            return false;
        }
        Leads leads = (Leads) obj;
        return sq8.m48644c(this.salutation, leads.salutation) && sq8.m48644c(this.firstName, leads.firstName) && sq8.m48644c(this.lastName, leads.lastName) && sq8.m48644c(this.name, leads.name) && sq8.m48644c(this.designation, leads.designation) && sq8.m48644c(this.company, leads.company) && sq8.m48644c(this.addedBusiness, leads.addedBusiness) && sq8.m48644c(this.contactType, leads.contactType) && sq8.m48644c(this.contactOwner, leads.contactOwner) && sq8.m48644c(this.contactOwnerID, leads.contactOwnerID) && sq8.m48644c(this.contactAddedByID, leads.contactAddedByID) && sq8.m48644c(this.contactSource, leads.contactSource) && sq8.m48644c(this.contactSourceOne, leads.contactSourceOne) && sq8.m48644c(this.contactSourceTwo, leads.contactSourceTwo) && sq8.m48644c(this.contactSourceThree, leads.contactSourceThree) && sq8.m48644c(this.contactOwnerProfile, leads.contactOwnerProfile) && sq8.m48644c(this.contactPriority, leads.contactPriority) && sq8.m48644c(this.contactLocation, leads.contactLocation) && Double.compare(this.contactLat, leads.contactLat) == 0 && Double.compare(this.contactLng, leads.contactLng) == 0 && sq8.m48644c(this.bulkUploadReference, leads.bulkUploadReference) && this.saveToCRM == leads.saveToCRM && sq8.m48644c(this.waChannelId, leads.waChannelId) && sq8.m48644c(this.callHistory, leads.callHistory) && sq8.m48644c(this.phoneNumbers, leads.phoneNumbers) && sq8.m48644c(this.phoneNumbersWithWhatsapp, leads.phoneNumbersWithWhatsapp) && sq8.m48644c(this.emails, leads.emails) && sq8.m48644c(this.contactID, leads.contactID) && sq8.m48644c(this.primaryTeamId, leads.primaryTeamId) && sq8.m48644c(this.lookupKey, leads.lookupKey) && sq8.m48644c(this.profilePic, leads.profilePic) && this.showSelection == leads.showSelection && this.isSelected == leads.isSelected && this.showBottom == leads.showBottom && sq8.m48644c(this.attentionText, leads.attentionText) && sq8.m48644c(this.secondaryDisplayTitle, leads.secondaryDisplayTitle) && sq8.m48644c(this.customDataAddedFromAddContactForm, leads.customDataAddedFromAddContactForm) && sq8.m48644c(this.submittedFormValues, leads.submittedFormValues) && sq8.m48644c(this.lastCalledTime, leads.lastCalledTime) && this.lastCallDuration == leads.lastCallDuration && sq8.m48644c(this.lastCallDirection, leads.lastCallDirection) && sq8.m48644c(this.lastCallUserId, leads.lastCallUserId) && sq8.m48644c(this.lastCallOutcome, leads.lastCallOutcome) && sq8.m48644c(this.lastCallEngagementId, leads.lastCallEngagementId) && sq8.m48644c(this.lastVisitTime, leads.lastVisitTime) && sq8.m48644c(this.lastVisitUserId, leads.lastVisitUserId) && sq8.m48644c(this.lastVisitOutcome, leads.lastVisitOutcome) && sq8.m48644c(this.lastVisitEngagementId, leads.lastVisitEngagementId) && sq8.m48644c(this.lastEmailTime, leads.lastEmailTime) && sq8.m48644c(this.lastEmailUserId, leads.lastEmailUserId) && sq8.m48644c(this.lastEmailEngagementId, leads.lastEmailEngagementId) && sq8.m48644c(this.lastWhatsappTime, leads.lastWhatsappTime) && sq8.m48644c(this.lastWhatsappUserId, leads.lastWhatsappUserId) && sq8.m48644c(this.lastWhatsappEngagementId, leads.lastWhatsappEngagementId) && sq8.m48644c(this.lastNoteAddedTime, leads.lastNoteAddedTime) && sq8.m48644c(this.lastNoteUserId, leads.lastNoteUserId) && sq8.m48644c(this.lastNoteEngagementId, leads.lastNoteEngagementId) && sq8.m48644c(this.lastTaskDoneTime, leads.lastTaskDoneTime) && sq8.m48644c(this.lastTaskDoneUserId, leads.lastTaskDoneUserId) && sq8.m48644c(this.lastTaskDoneEngagementId, leads.lastTaskDoneEngagementId) && sq8.m48644c(this.openTaskCount, leads.openTaskCount) && sq8.m48644c(this.unsuccessfulCallAttempts, leads.unsuccessfulCallAttempts) && sq8.m48644c(this.lastKnownDisposition, leads.lastKnownDisposition) && sq8.m48644c(this.lastKnownDispositionTime, leads.lastKnownDispositionTime) && sq8.m48644c(this.lastEngagementTimeFromAccount, leads.lastEngagementTimeFromAccount) && sq8.m48644c(this.lastEngagementTimeFromContact, leads.lastEngagementTimeFromContact) && this.lastLeadAssignmentDateTimeInMillis == leads.lastLeadAssignmentDateTimeInMillis && sq8.m48644c(this.userDefinedTags, leads.userDefinedTags) && sq8.m48644c(this.freshLeadTag, leads.freshLeadTag) && sq8.m48644c(this.needFollowUpTag, leads.needFollowUpTag) && sq8.m48644c(this.needFollowUpTagUpdatedAt, leads.needFollowUpTagUpdatedAt) && sq8.m48644c(this.activeDealStage, leads.activeDealStage) && sq8.m48644c(this.activeDealStageUpdatedAt, leads.activeDealStageUpdatedAt) && sq8.m48644c(this.dealDescription, leads.dealDescription) && sq8.m48644c(this.isCustomer, leads.isCustomer) && sq8.m48644c(this.becameCustomerOn, leads.becameCustomerOn) && sq8.m48644c(this.latestRemark, leads.latestRemark) && sq8.m48644c(this.customAttributes, leads.customAttributes) && sq8.m48644c(this.customAttributesObservable, leads.customAttributesObservable) && sq8.m48644c(this.leadLifecycleStage, leads.leadLifecycleStage) && sq8.m48644c(this.leadLifecycleStageSubCategory, leads.leadLifecycleStageSubCategory) && sq8.m48644c(this.lastDealStageType, leads.lastDealStageType) && sq8.m48644c(this.prospectingAttempts, leads.prospectingAttempts) && sq8.m48644c(this.firstProspectingDoneOn, leads.firstProspectingDoneOn) && sq8.m48644c(this.lastProspectingDoneOn, leads.lastProspectingDoneOn) && sq8.m48644c(this.nextProspectingDueOn, leads.nextProspectingDueOn) && sq8.m48644c(this.nextProspectingSetBy, leads.nextProspectingSetBy) && sq8.m48644c(this.nextProspectingNote, leads.nextProspectingNote) && sq8.m48644c(this.manuallyClosedReason, leads.manuallyClosedReason) && sq8.m48644c(this.recentEngagements, leads.recentEngagements) && sq8.m48644c(this.openVideoCallDetail, leads.openVideoCallDetail) && sq8.m48644c(this.openTaskDetail, leads.openTaskDetail) && sq8.m48644c(this.paymentRequestDetail, leads.paymentRequestDetail) && sq8.m48644c(this.businessIds, leads.businessIds) && sq8.m48644c(this.updatedAt, leads.updatedAt) && sq8.m48644c(this.createdAt, leads.createdAt);
    }

    public final String getActiveDealStage() {
        return this.activeDealStage;
    }

    public final Date getActiveDealStageUpdatedAt() {
        return this.activeDealStageUpdatedAt;
    }

    public final BusinessInfo getAddedBusiness() {
        return this.addedBusiness;
    }

    public final String getAttentionText() {
        return this.attentionText;
    }

    public final Date getBecameCustomerOn() {
        return this.becameCustomerOn;
    }

    public final String getBulkUploadReference() {
        return this.bulkUploadReference;
    }

    public final List<String> getBusinessIds() {
        return this.businessIds;
    }

    public final ArrayList<CallLogs> getCallHistory() {
        return this.callHistory;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getContactAddedByID() {
        return this.contactAddedByID;
    }

    public final String getContactID() {
        return this.contactID;
    }

    public final double getContactLat() {
        return this.contactLat;
    }

    public final double getContactLng() {
        return this.contactLng;
    }

    public final String getContactLocation() {
        return this.contactLocation;
    }

    public final String getContactOwner() {
        return this.contactOwner;
    }

    public final String getContactOwnerID() {
        return this.contactOwnerID;
    }

    public final String getContactOwnerProfile() {
        return this.contactOwnerProfile;
    }

    public final String getContactPriority() {
        return this.contactPriority;
    }

    public final String getContactSource() {
        return this.contactSource;
    }

    public final String getContactSourceOne() {
        return this.contactSourceOne;
    }

    public final String getContactSourceThree() {
        return this.contactSourceThree;
    }

    public final String getContactSourceTwo() {
        return this.contactSourceTwo;
    }

    public final String getContactType() {
        return this.contactType;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCustomAttributes() {
        return this.customAttributes;
    }

    public final CustomFormDataObservable getCustomAttributesObservable() {
        return this.customAttributesObservable;
    }

    public final String getCustomDataAddedFromAddContactForm() {
        return this.customDataAddedFromAddContactForm;
    }

    public final String getDealDescription() {
        return this.dealDescription;
    }

    public final String getDesignation() {
        return this.designation;
    }

    public final ArrayList<String> getEmails() {
        return this.emails;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Date getFirstProspectingDoneOn() {
        return this.firstProspectingDoneOn;
    }

    public final String getFreshLeadTag() {
        return this.freshLeadTag;
    }

    public final String getLastCallDirection() {
        return this.lastCallDirection;
    }

    public final int getLastCallDuration() {
        return this.lastCallDuration;
    }

    public final String getLastCallEngagementId() {
        return this.lastCallEngagementId;
    }

    public final String getLastCallOutcome() {
        return this.lastCallOutcome;
    }

    public final String getLastCallUserId() {
        return this.lastCallUserId;
    }

    public final Date getLastCalledTime() {
        return this.lastCalledTime;
    }

    public final String getLastDealStageType() {
        return this.lastDealStageType;
    }

    public final String getLastEmailEngagementId() {
        return this.lastEmailEngagementId;
    }

    public final Date getLastEmailTime() {
        return this.lastEmailTime;
    }

    public final String getLastEmailUserId() {
        return this.lastEmailUserId;
    }

    public final Date getLastEngagementTimeFromAccount() {
        return this.lastEngagementTimeFromAccount;
    }

    public final Date getLastEngagementTimeFromContact() {
        return this.lastEngagementTimeFromContact;
    }

    public final String getLastKnownDisposition() {
        return this.lastKnownDisposition;
    }

    public final Date getLastKnownDispositionTime() {
        return this.lastKnownDispositionTime;
    }

    public final long getLastLeadAssignmentDateTimeInMillis() {
        return this.lastLeadAssignmentDateTimeInMillis;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Date getLastNoteAddedTime() {
        return this.lastNoteAddedTime;
    }

    public final String getLastNoteEngagementId() {
        return this.lastNoteEngagementId;
    }

    public final String getLastNoteUserId() {
        return this.lastNoteUserId;
    }

    public final Date getLastProspectingDoneOn() {
        return this.lastProspectingDoneOn;
    }

    public final String getLastTaskDoneEngagementId() {
        return this.lastTaskDoneEngagementId;
    }

    public final Date getLastTaskDoneTime() {
        return this.lastTaskDoneTime;
    }

    public final String getLastTaskDoneUserId() {
        return this.lastTaskDoneUserId;
    }

    public final String getLastVisitEngagementId() {
        return this.lastVisitEngagementId;
    }

    public final String getLastVisitOutcome() {
        return this.lastVisitOutcome;
    }

    public final Date getLastVisitTime() {
        return this.lastVisitTime;
    }

    public final String getLastVisitUserId() {
        return this.lastVisitUserId;
    }

    public final String getLastWhatsappEngagementId() {
        return this.lastWhatsappEngagementId;
    }

    public final Date getLastWhatsappTime() {
        return this.lastWhatsappTime;
    }

    public final String getLastWhatsappUserId() {
        return this.lastWhatsappUserId;
    }

    public final String getLatestRemark() {
        return this.latestRemark;
    }

    public final String getLeadLifecycleStage() {
        return this.leadLifecycleStage;
    }

    public final String getLeadLifecycleStageSubCategory() {
        return this.leadLifecycleStageSubCategory;
    }

    public final String getLeadLifecycleStageViewValue() {
        ss9 ss9VarJ0;
        String str = this.leadLifecycleStage;
        if (str == null || (ss9VarJ0 = PropertyDefinitionRepository.o0().j0()) == null) {
            return null;
        }
        return ss9VarJ0.m48863f(str);
    }

    public final String getLookupKey() {
        return this.lookupKey;
    }

    public final String getManuallyClosedReason() {
        return this.manuallyClosedReason;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNeedFollowUpTag() {
        return this.needFollowUpTag;
    }

    public final Date getNeedFollowUpTagUpdatedAt() {
        return this.needFollowUpTagUpdatedAt;
    }

    public final Date getNextProspectingDueOn() {
        return this.nextProspectingDueOn;
    }

    public final String getNextProspectingNote() {
        return this.nextProspectingNote;
    }

    public final String getNextProspectingSetBy() {
        return this.nextProspectingSetBy;
    }

    public final Integer getOpenTaskCount() {
        return this.openTaskCount;
    }

    public final OpenTaskDetail getOpenTaskDetail() {
        return this.openTaskDetail;
    }

    public final VideoMeeting getOpenVideoCallDetail() {
        return this.openVideoCallDetail;
    }

    public final PaymentDetail getPaymentRequestDetail() {
        return this.paymentRequestDetail;
    }

    public final ArrayList<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final ArrayList<PhoneDetail> getPhoneNumbersWithWhatsapp() {
        return this.phoneNumbersWithWhatsapp;
    }

    public final String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final Integer getProspectingAttempts() {
        return this.prospectingAttempts;
    }

    public final List<RecentAction> getRecentEngagements() {
        return this.recentEngagements;
    }

    public final String getSalutation() {
        return this.salutation;
    }

    public final boolean getSaveToCRM() {
        return this.saveToCRM;
    }

    public final String getSecondaryDisplayTitle() {
        return this.secondaryDisplayTitle;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final SubmittedFormValues getSubmittedFormValues() {
        return this.submittedFormValues;
    }

    public final Integer getUnsuccessfulCallAttempts() {
        return this.unsuccessfulCallAttempts;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final List<String> getUserDefinedTags() {
        return this.userDefinedTags;
    }

    public final String getWaChannelId() {
        return this.waChannelId;
    }

    public final boolean hasContactOwner() {
        String str = this.contactOwner;
        return !(str == null || f9g.d0(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.salutation;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.name.hashCode()) * 31) + this.designation.hashCode()) * 31) + this.company.hashCode()) * 31;
        BusinessInfo businessInfo = this.addedBusiness;
        int iHashCode4 = (((((((((((((((((((((((((((((iHashCode3 + (businessInfo == null ? 0 : businessInfo.hashCode())) * 31) + this.contactType.hashCode()) * 31) + this.contactOwner.hashCode()) * 31) + this.contactOwnerID.hashCode()) * 31) + this.contactAddedByID.hashCode()) * 31) + this.contactSource.hashCode()) * 31) + this.contactSourceOne.hashCode()) * 31) + this.contactSourceTwo.hashCode()) * 31) + this.contactSourceThree.hashCode()) * 31) + this.contactOwnerProfile.hashCode()) * 31) + this.contactPriority.hashCode()) * 31) + this.contactLocation.hashCode()) * 31) + Double.hashCode(this.contactLat)) * 31) + Double.hashCode(this.contactLng)) * 31) + this.bulkUploadReference.hashCode()) * 31;
        boolean z = this.saveToCRM;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode5 = (((((((((((((iHashCode4 + i) * 31) + this.waChannelId.hashCode()) * 31) + this.callHistory.hashCode()) * 31) + this.phoneNumbers.hashCode()) * 31) + this.phoneNumbersWithWhatsapp.hashCode()) * 31) + this.emails.hashCode()) * 31) + this.contactID.hashCode()) * 31;
        String str4 = this.primaryTeamId;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.lookupKey.hashCode()) * 31) + this.profilePic.hashCode()) * 31;
        boolean z2 = this.showSelection;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode6 + i2) * 31;
        boolean z3 = this.isSelected;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z4 = this.showBottom;
        int iHashCode7 = (((((i5 + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.attentionText.hashCode()) * 31) + this.secondaryDisplayTitle.hashCode()) * 31;
        String str5 = this.customDataAddedFromAddContactForm;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SubmittedFormValues submittedFormValues = this.submittedFormValues;
        int iHashCode9 = (iHashCode8 + (submittedFormValues == null ? 0 : submittedFormValues.hashCode())) * 31;
        Date date = this.lastCalledTime;
        int iHashCode10 = (((iHashCode9 + (date == null ? 0 : date.hashCode())) * 31) + Integer.hashCode(this.lastCallDuration)) * 31;
        String str6 = this.lastCallDirection;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastCallUserId;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastCallOutcome;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastCallEngagementId;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Date date2 = this.lastVisitTime;
        int iHashCode15 = (iHashCode14 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str10 = this.lastVisitUserId;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastVisitOutcome;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastVisitEngagementId;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Date date3 = this.lastEmailTime;
        int iHashCode19 = (iHashCode18 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str13 = this.lastEmailUserId;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastEmailEngagementId;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Date date4 = this.lastWhatsappTime;
        int iHashCode22 = (iHashCode21 + (date4 == null ? 0 : date4.hashCode())) * 31;
        String str15 = this.lastWhatsappUserId;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.lastWhatsappEngagementId;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Date date5 = this.lastNoteAddedTime;
        int iHashCode25 = (iHashCode24 + (date5 == null ? 0 : date5.hashCode())) * 31;
        String str17 = this.lastNoteUserId;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.lastNoteEngagementId;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Date date6 = this.lastTaskDoneTime;
        int iHashCode28 = (iHashCode27 + (date6 == null ? 0 : date6.hashCode())) * 31;
        String str19 = this.lastTaskDoneUserId;
        int iHashCode29 = (iHashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lastTaskDoneEngagementId;
        int iHashCode30 = (iHashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num = this.openTaskCount;
        int iHashCode31 = (iHashCode30 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unsuccessfulCallAttempts;
        int iHashCode32 = (iHashCode31 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str21 = this.lastKnownDisposition;
        int iHashCode33 = (iHashCode32 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Date date7 = this.lastKnownDispositionTime;
        int iHashCode34 = (iHashCode33 + (date7 == null ? 0 : date7.hashCode())) * 31;
        Date date8 = this.lastEngagementTimeFromAccount;
        int iHashCode35 = (iHashCode34 + (date8 == null ? 0 : date8.hashCode())) * 31;
        Date date9 = this.lastEngagementTimeFromContact;
        int iHashCode36 = (((iHashCode35 + (date9 == null ? 0 : date9.hashCode())) * 31) + Long.hashCode(this.lastLeadAssignmentDateTimeInMillis)) * 31;
        List<String> list = this.userDefinedTags;
        int iHashCode37 = (iHashCode36 + (list == null ? 0 : list.hashCode())) * 31;
        String str22 = this.freshLeadTag;
        int iHashCode38 = (iHashCode37 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.needFollowUpTag;
        int iHashCode39 = (iHashCode38 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Date date10 = this.needFollowUpTagUpdatedAt;
        int iHashCode40 = (iHashCode39 + (date10 == null ? 0 : date10.hashCode())) * 31;
        String str24 = this.activeDealStage;
        int iHashCode41 = (iHashCode40 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Date date11 = this.activeDealStageUpdatedAt;
        int iHashCode42 = (iHashCode41 + (date11 == null ? 0 : date11.hashCode())) * 31;
        String str25 = this.dealDescription;
        int iHashCode43 = (iHashCode42 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.isCustomer;
        int iHashCode44 = (iHashCode43 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Date date12 = this.becameCustomerOn;
        int iHashCode45 = (iHashCode44 + (date12 == null ? 0 : date12.hashCode())) * 31;
        String str27 = this.latestRemark;
        int iHashCode46 = (iHashCode45 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.customAttributes;
        int iHashCode47 = (iHashCode46 + (str28 == null ? 0 : str28.hashCode())) * 31;
        CustomFormDataObservable customFormDataObservable = this.customAttributesObservable;
        int iHashCode48 = (iHashCode47 + (customFormDataObservable == null ? 0 : customFormDataObservable.hashCode())) * 31;
        String str29 = this.leadLifecycleStage;
        int iHashCode49 = (iHashCode48 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.leadLifecycleStageSubCategory;
        int iHashCode50 = (iHashCode49 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.lastDealStageType;
        int iHashCode51 = (iHashCode50 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Integer num3 = this.prospectingAttempts;
        int iHashCode52 = (iHashCode51 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Date date13 = this.firstProspectingDoneOn;
        int iHashCode53 = (iHashCode52 + (date13 == null ? 0 : date13.hashCode())) * 31;
        Date date14 = this.lastProspectingDoneOn;
        int iHashCode54 = (iHashCode53 + (date14 == null ? 0 : date14.hashCode())) * 31;
        Date date15 = this.nextProspectingDueOn;
        int iHashCode55 = (iHashCode54 + (date15 == null ? 0 : date15.hashCode())) * 31;
        String str32 = this.nextProspectingSetBy;
        int iHashCode56 = (iHashCode55 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.nextProspectingNote;
        int iHashCode57 = (iHashCode56 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.manuallyClosedReason;
        int iHashCode58 = (((iHashCode57 + (str34 == null ? 0 : str34.hashCode())) * 31) + this.recentEngagements.hashCode()) * 31;
        VideoMeeting videoMeeting = this.openVideoCallDetail;
        int iHashCode59 = (iHashCode58 + (videoMeeting == null ? 0 : videoMeeting.hashCode())) * 31;
        OpenTaskDetail openTaskDetail = this.openTaskDetail;
        int iHashCode60 = (iHashCode59 + (openTaskDetail == null ? 0 : openTaskDetail.hashCode())) * 31;
        PaymentDetail paymentDetail = this.paymentRequestDetail;
        int iHashCode61 = (((iHashCode60 + (paymentDetail == null ? 0 : paymentDetail.hashCode())) * 31) + this.businessIds.hashCode()) * 31;
        Long l = this.updatedAt;
        int iHashCode62 = (iHashCode61 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode62 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String isCustomer() {
        return this.isCustomer;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final List<LeadsUser> lastIteractedUsers() {
        List<LeadsUser> listB0 = lpi.b0(this.lastCallUserId, this.lastVisitUserId, this.lastEmailUserId, this.lastNoteUserId, this.lastTaskDoneUserId, this.lastWhatsappUserId);
        sq8.m48648g(listB0, "getUserByIds(...)");
        return listB0;
    }

    public final void setAddedBusiness(BusinessInfo businessInfo) {
        this.addedBusiness = businessInfo;
    }

    public final void setAttentionText(String str) {
        sq8.m48649h(str, "<set-?>");
        this.attentionText = str;
    }

    public final void setBulkUploadReference(String str) {
        sq8.m48649h(str, "<set-?>");
        this.bulkUploadReference = str;
    }

    public final void setCallHistory(ArrayList<CallLogs> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.callHistory = arrayList;
    }

    public final void setCompany(String str) {
        sq8.m48649h(str, "<set-?>");
        this.company = str;
    }

    public final void setContactAddedByID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactAddedByID = str;
    }

    public final void setContactID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactID = str;
    }

    public final void setContactLat(double d) {
        this.contactLat = d;
    }

    public final void setContactLng(double d) {
        this.contactLng = d;
    }

    public final void setContactLocation(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactLocation = str;
    }

    public final void setContactOwner(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactOwner = str;
    }

    public final void setContactOwnerID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactOwnerID = str;
    }

    public final void setContactOwnerProfile(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactOwnerProfile = str;
    }

    public final void setContactPriority(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactPriority = str;
    }

    public final void setContactSource(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactSource = str;
    }

    public final void setContactSourceOne(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactSourceOne = str;
    }

    public final void setContactSourceThree(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactSourceThree = str;
    }

    public final void setContactSourceTwo(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactSourceTwo = str;
    }

    public final void setContactType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.contactType = str;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setCustomAttributes(String str) {
        this.customAttributes = str;
    }

    public final void setCustomAttributesObservable(CustomFormDataObservable customFormDataObservable) {
        this.customAttributesObservable = customFormDataObservable;
    }

    public final void setCustomDataAddedFromAddContactForm(String str) {
        this.customDataAddedFromAddContactForm = str;
    }

    public final void setDesignation(String str) {
        sq8.m48649h(str, "<set-?>");
        this.designation = str;
    }

    public final void setEmails(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.emails = arrayList;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setLookupKey(String str) {
        sq8.m48649h(str, "<set-?>");
        this.lookupKey = str;
    }

    public final void setManuallyClosedReason(String str) {
        this.manuallyClosedReason = str;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setNextProspectingDueOn(Date date) {
        this.nextProspectingDueOn = date;
    }

    public final void setNextProspectingNote(String str) {
        this.nextProspectingNote = str;
    }

    public final void setNextProspectingSetBy(String str) {
        this.nextProspectingSetBy = str;
    }

    public final void setOpenTaskDetail(OpenTaskDetail openTaskDetail) {
        this.openTaskDetail = openTaskDetail;
    }

    public final void setOpenVideoCallDetail(VideoMeeting videoMeeting) {
        this.openVideoCallDetail = videoMeeting;
    }

    public final void setPaymentRequestDetail(PaymentDetail paymentDetail) {
        this.paymentRequestDetail = paymentDetail;
    }

    public final void setPhoneNumbers(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.phoneNumbers = arrayList;
    }

    public final void setPhoneNumbersWithWhatsapp(ArrayList<PhoneDetail> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.phoneNumbersWithWhatsapp = arrayList;
    }

    public final void setPrimaryTeamId(String str) {
        this.primaryTeamId = str;
    }

    public final void setProfilePic(String str) {
        sq8.m48649h(str, "<set-?>");
        this.profilePic = str;
    }

    public final void setSalutation(String str) {
        this.salutation = str;
    }

    public final void setSaveToCRM(boolean z) {
        this.saveToCRM = z;
    }

    public final void setSecondaryDisplayTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.secondaryDisplayTitle = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setSubmittedFormValues(SubmittedFormValues submittedFormValues) {
        this.submittedFormValues = submittedFormValues;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUserDefinedTags(List<String> list) {
        this.userDefinedTags = list;
    }

    public final void setWaChannelId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.waChannelId = str;
    }

    public final ArrayList<LeadInteractionsSummary> toInteractionSummaries() {
        return ch3.m21242g(new LeadInteractionsSummary(null, "DISPOSITION", "Last Known Disposition", null, this.lastKnownDisposition, this.lastKnownDispositionTime, null, null), new LeadInteractionsSummary(this.lastCallEngagementId, "CALL", CallDirection.OUTGOING.name().equals(this.lastCallDirection) ? "Last Call Placed" : "Last Call Received", this.lastCallUserId, this.lastCallOutcome, this.lastCalledTime, this.lastCallDirection, Integer.valueOf(this.lastCallDuration)), new LeadInteractionsSummary(this.lastVisitEngagementId, "VISIT", "Last Visit Done", this.lastVisitUserId, this.lastVisitOutcome, this.lastVisitTime, null, null), new LeadInteractionsSummary(this.lastEmailEngagementId, "EMAIL", "Last Email Exchanged", this.lastEmailUserId, null, this.lastEmailTime, null, null), new LeadInteractionsSummary(this.lastNoteEngagementId, "NOTE", "Last Note Added", this.lastNoteUserId, null, this.lastNoteAddedTime, null, null), new LeadInteractionsSummary(this.lastTaskDoneEngagementId, "TASK", "Last Task Completed", this.lastTaskDoneUserId, null, this.lastTaskDoneTime, null, null), new LeadInteractionsSummary(this.lastWhatsappEngagementId, "WHATSAPP", "Last Whatsapp Message Sent", this.lastWhatsappUserId, null, this.lastWhatsappTime, null, null));
    }

    public String toString() {
        return "Leads(salutation=" + this.salutation + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", name=" + this.name + ", designation=" + this.designation + ", company=" + this.company + ", addedBusiness=" + this.addedBusiness + ", contactType=" + this.contactType + ", contactOwner=" + this.contactOwner + ", contactOwnerID=" + this.contactOwnerID + ", contactAddedByID=" + this.contactAddedByID + ", contactSource=" + this.contactSource + ", contactSourceOne=" + this.contactSourceOne + ", contactSourceTwo=" + this.contactSourceTwo + ", contactSourceThree=" + this.contactSourceThree + ", contactOwnerProfile=" + this.contactOwnerProfile + ", contactPriority=" + this.contactPriority + ", contactLocation=" + this.contactLocation + ", contactLat=" + this.contactLat + ", contactLng=" + this.contactLng + ", bulkUploadReference=" + this.bulkUploadReference + ", saveToCRM=" + this.saveToCRM + ", waChannelId=" + this.waChannelId + ", callHistory=" + this.callHistory + ", phoneNumbers=" + this.phoneNumbers + ", phoneNumbersWithWhatsapp=" + this.phoneNumbersWithWhatsapp + ", emails=" + this.emails + ", contactID=" + this.contactID + ", primaryTeamId=" + this.primaryTeamId + ", lookupKey=" + this.lookupKey + ", profilePic=" + this.profilePic + ", showSelection=" + this.showSelection + ", isSelected=" + this.isSelected + ", showBottom=" + this.showBottom + ", attentionText=" + this.attentionText + ", secondaryDisplayTitle=" + this.secondaryDisplayTitle + ", customDataAddedFromAddContactForm=" + this.customDataAddedFromAddContactForm + ", submittedFormValues=" + this.submittedFormValues + ", lastCalledTime=" + this.lastCalledTime + ", lastCallDuration=" + this.lastCallDuration + ", lastCallDirection=" + this.lastCallDirection + ", lastCallUserId=" + this.lastCallUserId + ", lastCallOutcome=" + this.lastCallOutcome + ", lastCallEngagementId=" + this.lastCallEngagementId + ", lastVisitTime=" + this.lastVisitTime + ", lastVisitUserId=" + this.lastVisitUserId + ", lastVisitOutcome=" + this.lastVisitOutcome + ", lastVisitEngagementId=" + this.lastVisitEngagementId + ", lastEmailTime=" + this.lastEmailTime + ", lastEmailUserId=" + this.lastEmailUserId + ", lastEmailEngagementId=" + this.lastEmailEngagementId + ", lastWhatsappTime=" + this.lastWhatsappTime + ", lastWhatsappUserId=" + this.lastWhatsappUserId + ", lastWhatsappEngagementId=" + this.lastWhatsappEngagementId + ", lastNoteAddedTime=" + this.lastNoteAddedTime + ", lastNoteUserId=" + this.lastNoteUserId + ", lastNoteEngagementId=" + this.lastNoteEngagementId + ", lastTaskDoneTime=" + this.lastTaskDoneTime + ", lastTaskDoneUserId=" + this.lastTaskDoneUserId + ", lastTaskDoneEngagementId=" + this.lastTaskDoneEngagementId + ", openTaskCount=" + this.openTaskCount + ", unsuccessfulCallAttempts=" + this.unsuccessfulCallAttempts + ", lastKnownDisposition=" + this.lastKnownDisposition + ", lastKnownDispositionTime=" + this.lastKnownDispositionTime + ", lastEngagementTimeFromAccount=" + this.lastEngagementTimeFromAccount + ", lastEngagementTimeFromContact=" + this.lastEngagementTimeFromContact + ", lastLeadAssignmentDateTimeInMillis=" + this.lastLeadAssignmentDateTimeInMillis + ", userDefinedTags=" + this.userDefinedTags + ", freshLeadTag=" + this.freshLeadTag + ", needFollowUpTag=" + this.needFollowUpTag + ", needFollowUpTagUpdatedAt=" + this.needFollowUpTagUpdatedAt + ", activeDealStage=" + this.activeDealStage + ", activeDealStageUpdatedAt=" + this.activeDealStageUpdatedAt + ", dealDescription=" + this.dealDescription + ", isCustomer=" + this.isCustomer + ", becameCustomerOn=" + this.becameCustomerOn + ", latestRemark=" + this.latestRemark + ", customAttributes=" + this.customAttributes + ", customAttributesObservable=" + this.customAttributesObservable + ", leadLifecycleStage=" + this.leadLifecycleStage + ", leadLifecycleStageSubCategory=" + this.leadLifecycleStageSubCategory + ", lastDealStageType=" + this.lastDealStageType + ", prospectingAttempts=" + this.prospectingAttempts + ", firstProspectingDoneOn=" + this.firstProspectingDoneOn + ", lastProspectingDoneOn=" + this.lastProspectingDoneOn + ", nextProspectingDueOn=" + this.nextProspectingDueOn + ", nextProspectingSetBy=" + this.nextProspectingSetBy + ", nextProspectingNote=" + this.nextProspectingNote + ", manuallyClosedReason=" + this.manuallyClosedReason + ", recentEngagements=" + this.recentEngagements + ", openVideoCallDetail=" + this.openVideoCallDetail + ", openTaskDetail=" + this.openTaskDetail + ", paymentRequestDetail=" + this.paymentRequestDetail + ", businessIds=" + this.businessIds + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.salutation);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        parcel.writeString(this.designation);
        parcel.writeString(this.company);
        BusinessInfo businessInfo = this.addedBusiness;
        if (businessInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            businessInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.contactType);
        parcel.writeString(this.contactOwner);
        parcel.writeString(this.contactOwnerID);
        parcel.writeString(this.contactAddedByID);
        parcel.writeString(this.contactSource);
        parcel.writeString(this.contactSourceOne);
        parcel.writeString(this.contactSourceTwo);
        parcel.writeString(this.contactSourceThree);
        parcel.writeString(this.contactOwnerProfile);
        parcel.writeString(this.contactPriority);
        parcel.writeString(this.contactLocation);
        parcel.writeDouble(this.contactLat);
        parcel.writeDouble(this.contactLng);
        parcel.writeString(this.bulkUploadReference);
        parcel.writeInt(this.saveToCRM ? 1 : 0);
        parcel.writeString(this.waChannelId);
        ArrayList<CallLogs> arrayList = this.callHistory;
        parcel.writeInt(arrayList.size());
        Iterator<CallLogs> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.phoneNumbers);
        ArrayList<PhoneDetail> arrayList2 = this.phoneNumbersWithWhatsapp;
        parcel.writeInt(arrayList2.size());
        Iterator<PhoneDetail> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.emails);
        parcel.writeString(this.contactID);
        parcel.writeString(this.primaryTeamId);
        parcel.writeString(this.lookupKey);
        parcel.writeString(this.profilePic);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeString(this.attentionText);
        parcel.writeString(this.secondaryDisplayTitle);
        parcel.writeString(this.customDataAddedFromAddContactForm);
        SubmittedFormValues submittedFormValues = this.submittedFormValues;
        if (submittedFormValues == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            submittedFormValues.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.lastCalledTime);
        parcel.writeInt(this.lastCallDuration);
        parcel.writeString(this.lastCallDirection);
        parcel.writeString(this.lastCallUserId);
        parcel.writeString(this.lastCallOutcome);
        parcel.writeString(this.lastCallEngagementId);
        parcel.writeSerializable(this.lastVisitTime);
        parcel.writeString(this.lastVisitUserId);
        parcel.writeString(this.lastVisitOutcome);
        parcel.writeString(this.lastVisitEngagementId);
        parcel.writeSerializable(this.lastEmailTime);
        parcel.writeString(this.lastEmailUserId);
        parcel.writeString(this.lastEmailEngagementId);
        parcel.writeSerializable(this.lastWhatsappTime);
        parcel.writeString(this.lastWhatsappUserId);
        parcel.writeString(this.lastWhatsappEngagementId);
        parcel.writeSerializable(this.lastNoteAddedTime);
        parcel.writeString(this.lastNoteUserId);
        parcel.writeString(this.lastNoteEngagementId);
        parcel.writeSerializable(this.lastTaskDoneTime);
        parcel.writeString(this.lastTaskDoneUserId);
        parcel.writeString(this.lastTaskDoneEngagementId);
        Integer num = this.openTaskCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.unsuccessfulCallAttempts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.lastKnownDisposition);
        parcel.writeSerializable(this.lastKnownDispositionTime);
        parcel.writeSerializable(this.lastEngagementTimeFromAccount);
        parcel.writeSerializable(this.lastEngagementTimeFromContact);
        parcel.writeLong(this.lastLeadAssignmentDateTimeInMillis);
        parcel.writeStringList(this.userDefinedTags);
        parcel.writeString(this.freshLeadTag);
        parcel.writeString(this.needFollowUpTag);
        parcel.writeSerializable(this.needFollowUpTagUpdatedAt);
        parcel.writeString(this.activeDealStage);
        parcel.writeSerializable(this.activeDealStageUpdatedAt);
        parcel.writeString(this.dealDescription);
        parcel.writeString(this.isCustomer);
        parcel.writeSerializable(this.becameCustomerOn);
        parcel.writeString(this.latestRemark);
        parcel.writeString(this.customAttributes);
        parcel.writeParcelable(this.customAttributesObservable, i);
        parcel.writeString(this.leadLifecycleStage);
        parcel.writeString(this.leadLifecycleStageSubCategory);
        parcel.writeString(this.lastDealStageType);
        Integer num3 = this.prospectingAttempts;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeSerializable(this.firstProspectingDoneOn);
        parcel.writeSerializable(this.lastProspectingDoneOn);
        parcel.writeSerializable(this.nextProspectingDueOn);
        parcel.writeString(this.nextProspectingSetBy);
        parcel.writeString(this.nextProspectingNote);
        parcel.writeString(this.manuallyClosedReason);
        List<RecentAction> list = this.recentEngagements;
        parcel.writeInt(list.size());
        Iterator<RecentAction> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        VideoMeeting videoMeeting = this.openVideoCallDetail;
        if (videoMeeting == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoMeeting.writeToParcel(parcel, i);
        }
        OpenTaskDetail openTaskDetail = this.openTaskDetail;
        if (openTaskDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openTaskDetail.writeToParcel(parcel, i);
        }
        PaymentDetail paymentDetail = this.paymentRequestDetail;
        if (paymentDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentDetail.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.businessIds);
        Long l = this.updatedAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.createdAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Leads(String str, String str2, String str3, String str4, String str5, String str6, BusinessInfo businessInfo, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, double d, double d2, String str18, boolean z, String str19, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str20, String str21, String str22, String str23, boolean z2, boolean z3, boolean z4, String str24, String str25, String str26, SubmittedFormValues submittedFormValues, Date date, int i, String str27, String str28, String str29, String str30, Date date2, String str31, String str32, String str33, Date date3, String str34, String str35, Date date4, String str36, String str37, Date date5, String str38, String str39, Date date6, String str40, String str41, Integer num, Integer num2, String str42, Date date7, Date date8, Date date9, long j, List list, String str43, String str44, Date date10, String str45, Date date11, String str46, String str47, Date date12, String str48, String str49, CustomFormDataObservable customFormDataObservable, String str50, String str51, String str52, Integer num3, Date date13, Date date14, Date date15, String str53, String str54, String str55, List list2, VideoMeeting videoMeeting, OpenTaskDetail openTaskDetail, PaymentDetail paymentDetail, List list3, Long l, Long l2, int i2, int i3, int i4, id5 id5Var) {
        String str56 = (i2 & 1) != 0 ? null : str;
        String str57 = (i2 & 2) != 0 ? null : str2;
        String str58 = (i2 & 4) != 0 ? null : str3;
        String str59 = (i2 & 8) != 0 ? "" : str4;
        String str60 = (i2 & 16) != 0 ? "" : str5;
        String str61 = (i2 & 32) != 0 ? "" : str6;
        BusinessInfo businessInfo2 = (i2 & 64) != 0 ? null : businessInfo;
        String str62 = (i2 & 128) != 0 ? "" : str7;
        String str63 = (i2 & 256) != 0 ? "" : str8;
        String str64 = (i2 & 512) != 0 ? "" : str9;
        String str65 = (i2 & 1024) != 0 ? "" : str10;
        String str66 = (i2 & 2048) != 0 ? "" : str11;
        String str67 = (i2 & 4096) != 0 ? "" : str12;
        String str68 = (i2 & 8192) != 0 ? "" : str13;
        String str69 = (i2 & Opcodes.ACC_ENUM) != 0 ? "" : str14;
        String str70 = (i2 & 32768) != 0 ? "" : str15;
        String str71 = (i2 & 65536) != 0 ? "" : str16;
        String str72 = (i2 & Opcodes.ACC_DEPRECATED) != 0 ? "" : str17;
        double d3 = (i2 & 262144) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d;
        double d4 = (i2 & Opcodes.ASM8) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d2;
        String str73 = (i2 & 1048576) != 0 ? "" : str18;
        boolean z5 = (i2 & 2097152) != 0 ? true : z;
        String str74 = (i2 & 4194304) != 0 ? "" : str19;
        ArrayList arrayList5 = (i2 & 8388608) != 0 ? new ArrayList() : arrayList;
        ArrayList arrayList6 = (i2 & 16777216) != 0 ? new ArrayList() : arrayList2;
        ArrayList arrayList7 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new ArrayList() : arrayList3;
        ArrayList arrayList8 = (i2 & 67108864) != 0 ? new ArrayList() : arrayList4;
        String str75 = (i2 & 134217728) != 0 ? "" : str20;
        String str76 = (i2 & 268435456) != 0 ? null : str21;
        String str77 = (i2 & 536870912) != 0 ? "" : str22;
        String str78 = (i2 & 1073741824) != 0 ? "" : str23;
        boolean z6 = (i2 & Integer.MIN_VALUE) != 0 ? false : z2;
        this(str56, str57, str58, str59, str60, str61, businessInfo2, str62, str63, str64, str65, str66, str67, str68, str69, str70, str71, str72, d3, d4, str73, z5, str74, arrayList5, arrayList6, arrayList7, arrayList8, str75, str76, str77, str78, z6, (i3 & 1) != 0 ? false : z3, (i3 & 2) != 0 ? false : z4, (i3 & 4) != 0 ? "" : str24, (i3 & 8) != 0 ? "" : str25, (i3 & 16) != 0 ? null : str26, (i3 & 32) != 0 ? null : submittedFormValues, (i3 & 64) != 0 ? null : date, (i3 & 128) == 0 ? i : 0, (i3 & 256) != 0 ? null : str27, (i3 & 512) != 0 ? null : str28, (i3 & 1024) != 0 ? null : str29, (i3 & 2048) != 0 ? null : str30, (i3 & 4096) != 0 ? null : date2, (i3 & 8192) != 0 ? null : str31, (i3 & Opcodes.ACC_ENUM) != 0 ? null : str32, (i3 & 32768) != 0 ? null : str33, (i3 & 65536) != 0 ? null : date3, (i3 & Opcodes.ACC_DEPRECATED) != 0 ? null : str34, (i3 & 262144) != 0 ? null : str35, (i3 & Opcodes.ASM8) != 0 ? null : date4, (i3 & 1048576) != 0 ? null : str36, (i3 & 2097152) != 0 ? null : str37, (i3 & 4194304) != 0 ? null : date5, (i3 & 8388608) != 0 ? null : str38, (i3 & 16777216) != 0 ? null : str39, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : date6, (i3 & 67108864) != 0 ? null : str40, (i3 & 134217728) != 0 ? null : str41, (i3 & 268435456) != 0 ? null : num, (i3 & 536870912) != 0 ? null : num2, (i3 & 1073741824) != 0 ? null : str42, (i3 & Integer.MIN_VALUE) != 0 ? null : date7, (i4 & 1) != 0 ? null : date8, (i4 & 2) != 0 ? null : date9, (i4 & 4) != 0 ? -1L : j, (i4 & 8) != 0 ? null : list, (i4 & 16) != 0 ? null : str43, (i4 & 32) != 0 ? null : str44, (i4 & 64) != 0 ? null : date10, (i4 & 128) != 0 ? null : str45, (i4 & 256) != 0 ? null : date11, (i4 & 512) != 0 ? null : str46, (i4 & 1024) != 0 ? null : str47, (i4 & 2048) != 0 ? null : date12, (i4 & 4096) != 0 ? null : str48, (i4 & 8192) != 0 ? null : str49, (i4 & Opcodes.ACC_ENUM) != 0 ? null : customFormDataObservable, (i4 & 32768) != 0 ? null : str50, (i4 & 65536) != 0 ? null : str51, (i4 & Opcodes.ACC_DEPRECATED) != 0 ? null : str52, (i4 & 262144) != 0 ? null : num3, (i4 & Opcodes.ASM8) != 0 ? null : date13, (i4 & 1048576) != 0 ? null : date14, (i4 & 2097152) != 0 ? null : date15, (i4 & 4194304) != 0 ? null : str53, (i4 & 8388608) != 0 ? null : str54, (i4 & 16777216) != 0 ? null : str55, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new ArrayList() : list2, (i4 & 67108864) != 0 ? null : videoMeeting, (i4 & 134217728) != 0 ? null : openTaskDetail, (i4 & 268435456) != 0 ? null : paymentDetail, (i4 & 536870912) != 0 ? new ArrayList() : list3, (i4 & 1073741824) != 0 ? null : l, (i4 & Integer.MIN_VALUE) != 0 ? null : l2);
    }

    public Leads(String str, String str2, String str3, String str4, String str5, String str6, BusinessInfo businessInfo, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, double d, double d2, String str18, boolean z, String str19, ArrayList<CallLogs> arrayList, ArrayList<String> arrayList2, ArrayList<PhoneDetail> arrayList3, ArrayList<String> arrayList4, String str20, String str21, String str22, String str23, boolean z2, boolean z3, boolean z4, String str24, String str25, String str26, SubmittedFormValues submittedFormValues, Date date, int i, String str27, String str28, String str29, String str30, Date date2, String str31, String str32, String str33, Date date3, String str34, String str35, Date date4, String str36, String str37, Date date5, String str38, String str39, Date date6, String str40, String str41, Integer num, Integer num2, String str42, Date date7, Date date8, Date date9, long j, List<String> list, String str43, String str44, Date date10, String str45, Date date11, String str46, String str47, Date date12, String str48, String str49, CustomFormDataObservable customFormDataObservable, String str50, String str51, String str52, Integer num3, Date date13, Date date14, Date date15, String str53, String str54, String str55, List<RecentAction> list2, VideoMeeting videoMeeting, OpenTaskDetail openTaskDetail, PaymentDetail paymentDetail, List<String> list3, Long l, Long l2) {
        sq8.m48649h(str4, "name");
        sq8.m48649h(str5, "designation");
        sq8.m48649h(str6, "company");
        sq8.m48649h(str7, "contactType");
        sq8.m48649h(str8, "contactOwner");
        sq8.m48649h(str9, "contactOwnerID");
        sq8.m48649h(str10, "contactAddedByID");
        sq8.m48649h(str11, "contactSource");
        sq8.m48649h(str12, "contactSourceOne");
        sq8.m48649h(str13, "contactSourceTwo");
        sq8.m48649h(str14, "contactSourceThree");
        sq8.m48649h(str15, "contactOwnerProfile");
        sq8.m48649h(str16, "contactPriority");
        sq8.m48649h(str17, "contactLocation");
        sq8.m48649h(str18, "bulkUploadReference");
        sq8.m48649h(str19, "waChannelId");
        sq8.m48649h(arrayList, "callHistory");
        sq8.m48649h(arrayList2, "phoneNumbers");
        sq8.m48649h(arrayList3, "phoneNumbersWithWhatsapp");
        sq8.m48649h(arrayList4, "emails");
        sq8.m48649h(str20, "contactID");
        sq8.m48649h(str22, "lookupKey");
        sq8.m48649h(str23, "profilePic");
        sq8.m48649h(str24, "attentionText");
        sq8.m48649h(str25, "secondaryDisplayTitle");
        sq8.m48649h(list2, "recentEngagements");
        sq8.m48649h(list3, "businessIds");
        this.salutation = str;
        this.firstName = str2;
        this.lastName = str3;
        this.name = str4;
        this.designation = str5;
        this.company = str6;
        this.addedBusiness = businessInfo;
        this.contactType = str7;
        this.contactOwner = str8;
        this.contactOwnerID = str9;
        this.contactAddedByID = str10;
        this.contactSource = str11;
        this.contactSourceOne = str12;
        this.contactSourceTwo = str13;
        this.contactSourceThree = str14;
        this.contactOwnerProfile = str15;
        this.contactPriority = str16;
        this.contactLocation = str17;
        this.contactLat = d;
        this.contactLng = d2;
        this.bulkUploadReference = str18;
        this.saveToCRM = z;
        this.waChannelId = str19;
        this.callHistory = arrayList;
        this.phoneNumbers = arrayList2;
        this.phoneNumbersWithWhatsapp = arrayList3;
        this.emails = arrayList4;
        this.contactID = str20;
        this.primaryTeamId = str21;
        this.lookupKey = str22;
        this.profilePic = str23;
        this.showSelection = z2;
        this.isSelected = z3;
        this.showBottom = z4;
        this.attentionText = str24;
        this.secondaryDisplayTitle = str25;
        this.customDataAddedFromAddContactForm = str26;
        this.submittedFormValues = submittedFormValues;
        this.lastCalledTime = date;
        this.lastCallDuration = i;
        this.lastCallDirection = str27;
        this.lastCallUserId = str28;
        this.lastCallOutcome = str29;
        this.lastCallEngagementId = str30;
        this.lastVisitTime = date2;
        this.lastVisitUserId = str31;
        this.lastVisitOutcome = str32;
        this.lastVisitEngagementId = str33;
        this.lastEmailTime = date3;
        this.lastEmailUserId = str34;
        this.lastEmailEngagementId = str35;
        this.lastWhatsappTime = date4;
        this.lastWhatsappUserId = str36;
        this.lastWhatsappEngagementId = str37;
        this.lastNoteAddedTime = date5;
        this.lastNoteUserId = str38;
        this.lastNoteEngagementId = str39;
        this.lastTaskDoneTime = date6;
        this.lastTaskDoneUserId = str40;
        this.lastTaskDoneEngagementId = str41;
        this.openTaskCount = num;
        this.unsuccessfulCallAttempts = num2;
        this.lastKnownDisposition = str42;
        this.lastKnownDispositionTime = date7;
        this.lastEngagementTimeFromAccount = date8;
        this.lastEngagementTimeFromContact = date9;
        this.lastLeadAssignmentDateTimeInMillis = j;
        this.userDefinedTags = list;
        this.freshLeadTag = str43;
        this.needFollowUpTag = str44;
        this.needFollowUpTagUpdatedAt = date10;
        this.activeDealStage = str45;
        this.activeDealStageUpdatedAt = date11;
        this.dealDescription = str46;
        this.isCustomer = str47;
        this.becameCustomerOn = date12;
        this.latestRemark = str48;
        this.customAttributes = str49;
        this.customAttributesObservable = customFormDataObservable;
        this.leadLifecycleStage = str50;
        this.leadLifecycleStageSubCategory = str51;
        this.lastDealStageType = str52;
        this.prospectingAttempts = num3;
        this.firstProspectingDoneOn = date13;
        this.lastProspectingDoneOn = date14;
        this.nextProspectingDueOn = date15;
        this.nextProspectingSetBy = str53;
        this.nextProspectingNote = str54;
        this.manuallyClosedReason = str55;
        this.recentEngagements = list2;
        this.openVideoCallDetail = videoMeeting;
        this.openTaskDetail = openTaskDetail;
        this.paymentRequestDetail = paymentDetail;
        this.businessIds = list3;
        this.updatedAt = l;
        this.createdAt = l2;
    }
}
