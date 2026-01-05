package ai.salesmax.model;

import ai.salesmax.custom.CustomFormDataObservable;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.datastore.generated.model.ContactAssignmentStatus;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.ryh;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class Tasks extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Tasks> CREATOR = new Creator();
    private ryh activityLocation;
    private AssignmentOutcome assignmentOutcome;
    private String assignmentStatus;
    private String body;
    private String callConnectionStatus;
    private String callDirection;
    private long callDurationInMillis;
    private long callEndTime;
    private String callInputNotes;
    private String callNextStep;
    private String callOutcome;
    private String callOutcomeNature;
    private String callPlacementId;
    private String callRecordingUrl;
    private long callStartTime;
    private long callTimeInMillis;
    private String callType;
    private LeadsSummary client;
    private String clientCompany;
    private String clientContactNumber;
    private String clientDesignation;
    private String clientID;
    private String clientName;
    private String clientProfilePic;
    private String clientSecondaryTitle;
    private String cloudProvider;
    private String cloudProviderNumber;
    private List<CommentSummary> comments;
    private boolean createNewDeal;
    private Long createdAt;
    private String customCallOutcomeData;
    private CustomFormDataObservable customCallOutcomeDataObservable;
    private transient FormFields customFormFields;
    private String customNextStepTaskInputData;
    private String customTaskCompletionData;
    private CustomFormDataObservable customTaskCompletionDataObservable;
    private String customTaskInputData;
    private String customVideoCallInputData;
    private CustomFormDataObservable customVideoCallInputObservable;
    private String customVisitOutcomeData;
    private CustomFormDataObservable customVisitOutcomeDataObservable;
    private String deviceId;
    private String engagementSource;
    private String engagementSourceLevelTwo;
    private String engagementSourceType;
    private List<EngagementUpdateSummary> engagementUpdates;
    private ArrayList<FileData> fileList;
    private Long firstTaskEngagementActionOn;
    private String hangupReason;
    private String id;
    private boolean inFlightCall;
    private boolean isExpired;
    private boolean isSelected;
    private Long nextFollowUpOn;
    private String nextFollowUpSetBy;
    private String nextStepId;
    private long nextTaskDateInMillis;
    private long nextTaskDateTimeInMillis;
    private long nextTaskTimeInMillis;
    private String noteAdditionMethod;
    private String noteHeading;
    private String noteNextStep;
    private ArrayList<FileData> oldFileList;
    private String parentEngagementId;
    private String phoneCallLogId;
    private String phoneLocalCallRecordingFile;
    private String phoneLocalCallRecordingUri;
    private String phoneLocalContactName;
    private String primaryTeamId;
    private boolean showBottom;
    private boolean showBottomView;
    private boolean showSelection;
    private String systemAction;
    private String taskAssignedTo;
    private String taskAssignedToID;
    private String taskAssignedToProfilePic;
    private String taskCompletionNote;
    private long taskCompletionTime;
    private String taskCompletionType;
    private String taskContactMode;
    private String taskContent;
    private String taskDate;
    private long taskDateInMillis;
    private long taskDateTimeInMillis;
    private Integer taskEngagementActionCount;
    private List<RecentAction> taskEngagementActions;
    private Long taskEngagementActionsUpdatedAt;
    private String taskEngagementType;
    private double taskLat;
    private double taskLng;
    private String taskLocation;
    private String taskNextStep;
    private LeadsUser taskOwner;
    private String taskPriority;
    private String taskReminder;
    private long taskReminderTimeInMillis;
    private String taskStatus;
    private String taskTag;
    private long taskTimeInMillis;
    private String taskTitle;
    private boolean taskTypeInputSelector;
    private Long totalCallDuration;
    private boolean transferLead;
    private Long updatedAt;
    private String userNumber;
    private String videoCallLink;
    private String videoCallMetadata;
    private String videoCallOutcome;
    private String videoCallPlatform;
    private long visitDateInMillis;
    private double visitLat;
    private double visitLng;
    private String visitLocation;
    private String visitNextStep;
    private String visitNotes;
    private String visitOutcome;
    private String visitOutcomeNature;

    public static final class Creator implements Parcelable.Creator<Tasks> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tasks createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            String string23 = parcel.readString();
            long j5 = parcel.readLong();
            long j6 = parcel.readLong();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            long j7 = parcel.readLong();
            long j8 = parcel.readLong();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            long j9 = parcel.readLong();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            double d3 = parcel.readDouble();
            double d4 = parcel.readDouble();
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            List list = null;
            List list2 = null;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(FileData.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(FileData.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            String string46 = parcel.readString();
            String string47 = parcel.readString();
            ryh ryhVar = (ryh) parcel.readSerializable();
            String string48 = parcel.readString();
            String string49 = parcel.readString();
            String string50 = parcel.readString();
            String string51 = parcel.readString();
            String string52 = parcel.readString();
            String string53 = parcel.readString();
            String string54 = parcel.readString();
            CustomFormDataObservable customFormDataObservable = (CustomFormDataObservable) parcel.readParcelable(Tasks.class.getClassLoader());
            CustomFormDataObservable customFormDataObservable2 = (CustomFormDataObservable) parcel.readParcelable(Tasks.class.getClassLoader());
            CustomFormDataObservable customFormDataObservable3 = (CustomFormDataObservable) parcel.readParcelable(Tasks.class.getClassLoader());
            CustomFormDataObservable customFormDataObservable4 = (CustomFormDataObservable) parcel.readParcelable(Tasks.class.getClassLoader());
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            int i6 = 0;
            while (i6 != i5) {
                arrayList3.add(RecentAction.CREATOR.createFromParcel(parcel));
                i6++;
                i5 = i5;
            }
            return new Tasks(string, null, null, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, j, j2, j3, j4, string16, string17, string18, string19, string20, string21, string22, d, d2, string23, j5, j6, string24, string25, j7, j8, string26, string27, string28, string29, string30, j9, string31, string32, d3, d4, j10, j11, string33, string34, j12, j13, string35, string36, string37, string38, string39, string40, z, z2, list, list2, z3, z4, string41, string42, string43, arrayList, arrayList2, string44, string45, string46, string47, ryhVar, string48, string49, string50, string51, string52, string53, string54, customFormDataObservable, customFormDataObservable2, customFormDataObservable3, customFormDataObservable4, arrayList3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : AssignmentOutcome.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : FormFields.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), 6, 1610612736, 0, 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tasks[] newArray(int i) {
            return new Tasks[i];
        }
    }

    public Tasks() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, 0L, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, -1, -1, -1, 2097151, null);
    }

    public static /* synthetic */ Tasks copy$default(Tasks tasks, String str, LeadsSummary leadsSummary, LeadsUser leadsUser, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2, long j3, long j4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, double d, double d2, String str23, long j5, long j6, String str24, String str25, long j7, long j8, String str26, String str27, String str28, String str29, String str30, long j9, String str31, String str32, double d3, double d4, long j10, long j11, String str33, String str34, long j12, long j13, String str35, String str36, String str37, String str38, String str39, String str40, boolean z, boolean z2, List list, List list2, boolean z3, boolean z4, String str41, String str42, String str43, ArrayList arrayList, ArrayList arrayList2, String str44, String str45, String str46, String str47, ryh ryhVar, String str48, String str49, String str50, String str51, String str52, String str53, String str54, CustomFormDataObservable customFormDataObservable, CustomFormDataObservable customFormDataObservable2, CustomFormDataObservable customFormDataObservable3, CustomFormDataObservable customFormDataObservable4, List list3, Long l, String str55, Long l2, Long l3, Integer num, String str56, String str57, String str58, String str59, boolean z5, String str60, String str61, String str62, boolean z6, AssignmentOutcome assignmentOutcome, String str63, boolean z7, boolean z8, Long l4, Long l5, FormFields formFields, boolean z9, String str64, String str65, String str66, String str67, Long l6, String str68, String str69, String str70, int i, int i2, int i3, int i4, Object obj) {
        String str71 = (i & 1) != 0 ? tasks.id : str;
        LeadsSummary leadsSummary2 = (i & 2) != 0 ? tasks.client : leadsSummary;
        LeadsUser leadsUser2 = (i & 4) != 0 ? tasks.taskOwner : leadsUser;
        String str72 = (i & 8) != 0 ? tasks.clientName : str2;
        String str73 = (i & 16) != 0 ? tasks.clientID : str3;
        String str74 = (i & 32) != 0 ? tasks.clientDesignation : str4;
        String str75 = (i & 64) != 0 ? tasks.clientContactNumber : str5;
        String str76 = (i & 128) != 0 ? tasks.clientProfilePic : str6;
        String str77 = (i & 256) != 0 ? tasks.clientCompany : str7;
        String str78 = (i & 512) != 0 ? tasks.clientSecondaryTitle : str8;
        String str79 = (i & 1024) != 0 ? tasks.noteHeading : str9;
        String str80 = (i & 2048) != 0 ? tasks.noteNextStep : str10;
        String str81 = (i & 4096) != 0 ? tasks.noteAdditionMethod : str11;
        String str82 = (i & 8192) != 0 ? tasks.body : str12;
        String str83 = (i & Opcodes.ACC_ENUM) != 0 ? tasks.parentEngagementId : str13;
        String str84 = (i & 32768) != 0 ? tasks.taskTitle : str14;
        String str85 = str78;
        String str86 = (i & 65536) != 0 ? tasks.taskContent : str15;
        long j14 = (i & Opcodes.ACC_DEPRECATED) != 0 ? tasks.taskTimeInMillis : j;
        long j15 = (i & 262144) != 0 ? tasks.nextTaskTimeInMillis : j2;
        long j16 = (i & Opcodes.ASM8) != 0 ? tasks.taskDateTimeInMillis : j3;
        long j17 = (i & 1048576) != 0 ? tasks.nextTaskDateTimeInMillis : j4;
        String str87 = (i & 2097152) != 0 ? tasks.taskAssignedTo : str16;
        String str88 = (4194304 & i) != 0 ? tasks.taskAssignedToID : str17;
        String str89 = (i & 8388608) != 0 ? tasks.taskAssignedToProfilePic : str18;
        String str90 = (i & 16777216) != 0 ? tasks.taskEngagementType : str19;
        String str91 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tasks.taskPriority : str20;
        String str92 = (i & 67108864) != 0 ? tasks.taskReminder : str21;
        String str93 = str87;
        String str94 = (i & 134217728) != 0 ? tasks.taskLocation : str22;
        double d5 = (i & 268435456) != 0 ? tasks.taskLat : d;
        double d6 = (i & 536870912) != 0 ? tasks.taskLng : d2;
        String str95 = (i & 1073741824) != 0 ? tasks.taskDate : str23;
        long j18 = (i & Integer.MIN_VALUE) != 0 ? tasks.taskDateInMillis : j5;
        long j19 = (i2 & 1) != 0 ? tasks.nextTaskDateInMillis : j6;
        String str96 = (i2 & 2) != 0 ? tasks.taskTag : str24;
        String str97 = (i2 & 4) != 0 ? tasks.taskContactMode : str25;
        long j20 = j19;
        long j21 = (i2 & 8) != 0 ? tasks.taskReminderTimeInMillis : j7;
        long j22 = (i2 & 16) != 0 ? tasks.taskCompletionTime : j8;
        String str98 = (i2 & 32) != 0 ? tasks.taskNextStep : str26;
        String str99 = (i2 & 64) != 0 ? tasks.systemAction : str27;
        String str100 = (i2 & 128) != 0 ? tasks.visitNotes : str28;
        String str101 = (i2 & 256) != 0 ? tasks.visitOutcome : str29;
        String str102 = (i2 & 512) != 0 ? tasks.visitOutcomeNature : str30;
        String str103 = str98;
        long j23 = (i2 & 1024) != 0 ? tasks.visitDateInMillis : j9;
        String str104 = (i2 & 2048) != 0 ? tasks.visitNextStep : str31;
        return tasks.copy(str71, leadsSummary2, leadsUser2, str72, str73, str74, str75, str76, str77, str85, str79, str80, str81, str82, str83, str84, str86, j14, j15, j16, j17, str93, str88, str89, str90, str91, str92, str94, d5, d6, str95, j18, j20, str96, str97, j21, j22, str103, str99, str100, str101, str102, j23, str104, (i2 & 4096) != 0 ? tasks.visitLocation : str32, (i2 & 8192) != 0 ? tasks.visitLat : d3, (i2 & Opcodes.ACC_ENUM) != 0 ? tasks.visitLng : d4, (i2 & 32768) != 0 ? tasks.callTimeInMillis : j10, (i2 & 65536) != 0 ? tasks.callDurationInMillis : j11, (i2 & Opcodes.ACC_DEPRECATED) != 0 ? tasks.callDirection : str33, (i2 & 262144) != 0 ? tasks.callConnectionStatus : str34, (i2 & Opcodes.ASM8) != 0 ? tasks.callStartTime : j12, (i2 & 1048576) != 0 ? tasks.callEndTime : j13, (i2 & 2097152) != 0 ? tasks.callOutcome : str35, (4194304 & i2) != 0 ? tasks.callOutcomeNature : str36, (i2 & 8388608) != 0 ? tasks.callNextStep : str37, (i2 & 16777216) != 0 ? tasks.nextStepId : str38, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tasks.callInputNotes : str39, (i2 & 67108864) != 0 ? tasks.callRecordingUrl : str40, (i2 & 134217728) != 0 ? tasks.isSelected : z, (i2 & 268435456) != 0 ? tasks.showSelection : z2, (i2 & 536870912) != 0 ? tasks.comments : list, (i2 & 1073741824) != 0 ? tasks.engagementUpdates : list2, (i2 & Integer.MIN_VALUE) != 0 ? tasks.isExpired : z3, (i3 & 1) != 0 ? tasks.showBottomView : z4, (i3 & 2) != 0 ? tasks.taskStatus : str41, (i3 & 4) != 0 ? tasks.taskCompletionNote : str42, (i3 & 8) != 0 ? tasks.taskCompletionType : str43, (i3 & 16) != 0 ? tasks.fileList : arrayList, (i3 & 32) != 0 ? tasks.oldFileList : arrayList2, (i3 & 64) != 0 ? tasks.assignmentStatus : str44, (i3 & 128) != 0 ? tasks.primaryTeamId : str45, (i3 & 256) != 0 ? tasks.engagementSource : str46, (i3 & 512) != 0 ? tasks.engagementSourceType : str47, (i3 & 1024) != 0 ? tasks.activityLocation : ryhVar, (i3 & 2048) != 0 ? tasks.callPlacementId : str48, (i3 & 4096) != 0 ? tasks.customTaskCompletionData : str49, (i3 & 8192) != 0 ? tasks.customCallOutcomeData : str50, (i3 & Opcodes.ACC_ENUM) != 0 ? tasks.customVisitOutcomeData : str51, (i3 & 32768) != 0 ? tasks.customTaskInputData : str52, (i3 & 65536) != 0 ? tasks.customNextStepTaskInputData : str53, (i3 & Opcodes.ACC_DEPRECATED) != 0 ? tasks.customVideoCallInputData : str54, (i3 & 262144) != 0 ? tasks.customTaskCompletionDataObservable : customFormDataObservable, (i3 & Opcodes.ASM8) != 0 ? tasks.customCallOutcomeDataObservable : customFormDataObservable2, (i3 & 1048576) != 0 ? tasks.customVisitOutcomeDataObservable : customFormDataObservable3, (i3 & 2097152) != 0 ? tasks.customVideoCallInputObservable : customFormDataObservable4, (i3 & 4194304) != 0 ? tasks.taskEngagementActions : list3, (i3 & 8388608) != 0 ? tasks.nextFollowUpOn : l, (i3 & 16777216) != 0 ? tasks.nextFollowUpSetBy : str55, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tasks.taskEngagementActionsUpdatedAt : l2, (i3 & 67108864) != 0 ? tasks.firstTaskEngagementActionOn : l3, (i3 & 134217728) != 0 ? tasks.taskEngagementActionCount : num, (i3 & 268435456) != 0 ? tasks.videoCallPlatform : str56, (i3 & 536870912) != 0 ? tasks.videoCallLink : str57, (i3 & 1073741824) != 0 ? tasks.videoCallMetadata : str58, (i3 & Integer.MIN_VALUE) != 0 ? tasks.videoCallOutcome : str59, (i4 & 1) != 0 ? tasks.showBottom : z5, (i4 & 2) != 0 ? tasks.phoneLocalCallRecordingFile : str60, (i4 & 4) != 0 ? tasks.phoneLocalCallRecordingUri : str61, (i4 & 8) != 0 ? tasks.phoneLocalContactName : str62, (i4 & 16) != 0 ? tasks.transferLead : z6, (i4 & 32) != 0 ? tasks.assignmentOutcome : assignmentOutcome, (i4 & 64) != 0 ? tasks.engagementSourceLevelTwo : str63, (i4 & 128) != 0 ? tasks.createNewDeal : z7, (i4 & 256) != 0 ? tasks.taskTypeInputSelector : z8, (i4 & 512) != 0 ? tasks.updatedAt : l4, (i4 & 1024) != 0 ? tasks.createdAt : l5, (i4 & 2048) != 0 ? tasks.customFormFields : formFields, (i4 & 4096) != 0 ? tasks.inFlightCall : z9, (i4 & 8192) != 0 ? tasks.userNumber : str64, (i4 & Opcodes.ACC_ENUM) != 0 ? tasks.deviceId : str65, (i4 & 32768) != 0 ? tasks.cloudProvider : str66, (i4 & 65536) != 0 ? tasks.cloudProviderNumber : str67, (i4 & Opcodes.ACC_DEPRECATED) != 0 ? tasks.totalCallDuration : l6, (i4 & 262144) != 0 ? tasks.callType : str68, (i4 & Opcodes.ASM8) != 0 ? tasks.hangupReason : str69, (i4 & 1048576) != 0 ? tasks.phoneCallLogId : str70);
    }

    public static /* synthetic */ void getClient$annotations() {
    }

    public static /* synthetic */ void getComments$annotations() {
    }

    public static /* synthetic */ void getEngagementUpdates$annotations() {
    }

    public static /* synthetic */ void getTaskOwner$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.clientSecondaryTitle;
    }

    public final String component100() {
        return this.phoneLocalContactName;
    }

    public final boolean component101() {
        return this.transferLead;
    }

    public final AssignmentOutcome component102() {
        return this.assignmentOutcome;
    }

    public final String component103() {
        return this.engagementSourceLevelTwo;
    }

    public final boolean component104() {
        return this.createNewDeal;
    }

    public final boolean component105() {
        return this.taskTypeInputSelector;
    }

    public final Long component106() {
        return this.updatedAt;
    }

    public final Long component107() {
        return this.createdAt;
    }

    public final FormFields component108() {
        return this.customFormFields;
    }

    public final boolean component109() {
        return this.inFlightCall;
    }

    public final String component11() {
        return this.noteHeading;
    }

    public final String component110() {
        return this.userNumber;
    }

    public final String component111() {
        return this.deviceId;
    }

    public final String component112() {
        return this.cloudProvider;
    }

    public final String component113() {
        return this.cloudProviderNumber;
    }

    public final Long component114() {
        return this.totalCallDuration;
    }

    public final String component115() {
        return this.callType;
    }

    public final String component116() {
        return this.hangupReason;
    }

    public final String component117() {
        return this.phoneCallLogId;
    }

    public final String component12() {
        return this.noteNextStep;
    }

    public final String component13() {
        return this.noteAdditionMethod;
    }

    public final String component14() {
        return this.body;
    }

    public final String component15() {
        return this.parentEngagementId;
    }

    public final String component16() {
        return this.taskTitle;
    }

    public final String component17() {
        return this.taskContent;
    }

    public final long component18() {
        return this.taskTimeInMillis;
    }

    public final long component19() {
        return this.nextTaskTimeInMillis;
    }

    public final LeadsSummary component2() {
        return this.client;
    }

    public final long component20() {
        return this.taskDateTimeInMillis;
    }

    public final long component21() {
        return this.nextTaskDateTimeInMillis;
    }

    public final String component22() {
        return this.taskAssignedTo;
    }

    public final String component23() {
        return this.taskAssignedToID;
    }

    public final String component24() {
        return this.taskAssignedToProfilePic;
    }

    public final String component25() {
        return this.taskEngagementType;
    }

    public final String component26() {
        return this.taskPriority;
    }

    public final String component27() {
        return this.taskReminder;
    }

    public final String component28() {
        return this.taskLocation;
    }

    public final double component29() {
        return this.taskLat;
    }

    public final LeadsUser component3() {
        return this.taskOwner;
    }

    public final double component30() {
        return this.taskLng;
    }

    public final String component31() {
        return this.taskDate;
    }

    public final long component32() {
        return this.taskDateInMillis;
    }

    public final long component33() {
        return this.nextTaskDateInMillis;
    }

    public final String component34() {
        return this.taskTag;
    }

    public final String component35() {
        return this.taskContactMode;
    }

    public final long component36() {
        return this.taskReminderTimeInMillis;
    }

    public final long component37() {
        return this.taskCompletionTime;
    }

    public final String component38() {
        return this.taskNextStep;
    }

    public final String component39() {
        return this.systemAction;
    }

    public final String component4() {
        return this.clientName;
    }

    public final String component40() {
        return this.visitNotes;
    }

    public final String component41() {
        return this.visitOutcome;
    }

    public final String component42() {
        return this.visitOutcomeNature;
    }

    public final long component43() {
        return this.visitDateInMillis;
    }

    public final String component44() {
        return this.visitNextStep;
    }

    public final String component45() {
        return this.visitLocation;
    }

    public final double component46() {
        return this.visitLat;
    }

    public final double component47() {
        return this.visitLng;
    }

    public final long component48() {
        return this.callTimeInMillis;
    }

    public final long component49() {
        return this.callDurationInMillis;
    }

    public final String component5() {
        return this.clientID;
    }

    public final String component50() {
        return this.callDirection;
    }

    public final String component51() {
        return this.callConnectionStatus;
    }

    public final long component52() {
        return this.callStartTime;
    }

    public final long component53() {
        return this.callEndTime;
    }

    public final String component54() {
        return this.callOutcome;
    }

    public final String component55() {
        return this.callOutcomeNature;
    }

    public final String component56() {
        return this.callNextStep;
    }

    public final String component57() {
        return this.nextStepId;
    }

    public final String component58() {
        return this.callInputNotes;
    }

    public final String component59() {
        return this.callRecordingUrl;
    }

    public final String component6() {
        return this.clientDesignation;
    }

    public final boolean component60() {
        return this.isSelected;
    }

    public final boolean component61() {
        return this.showSelection;
    }

    public final List<CommentSummary> component62() {
        return this.comments;
    }

    public final List<EngagementUpdateSummary> component63() {
        return this.engagementUpdates;
    }

    public final boolean component64() {
        return this.isExpired;
    }

    public final boolean component65() {
        return this.showBottomView;
    }

    public final String component66() {
        return this.taskStatus;
    }

    public final String component67() {
        return this.taskCompletionNote;
    }

    public final String component68() {
        return this.taskCompletionType;
    }

    public final ArrayList<FileData> component69() {
        return this.fileList;
    }

    public final String component7() {
        return this.clientContactNumber;
    }

    public final ArrayList<FileData> component70() {
        return this.oldFileList;
    }

    public final String component71() {
        return this.assignmentStatus;
    }

    public final String component72() {
        return this.primaryTeamId;
    }

    public final String component73() {
        return this.engagementSource;
    }

    public final String component74() {
        return this.engagementSourceType;
    }

    public final ryh component75() {
        return this.activityLocation;
    }

    public final String component76() {
        return this.callPlacementId;
    }

    public final String component77() {
        return this.customTaskCompletionData;
    }

    public final String component78() {
        return this.customCallOutcomeData;
    }

    public final String component79() {
        return this.customVisitOutcomeData;
    }

    public final String component8() {
        return this.clientProfilePic;
    }

    public final String component80() {
        return this.customTaskInputData;
    }

    public final String component81() {
        return this.customNextStepTaskInputData;
    }

    public final String component82() {
        return this.customVideoCallInputData;
    }

    public final CustomFormDataObservable component83() {
        return this.customTaskCompletionDataObservable;
    }

    public final CustomFormDataObservable component84() {
        return this.customCallOutcomeDataObservable;
    }

    public final CustomFormDataObservable component85() {
        return this.customVisitOutcomeDataObservable;
    }

    public final CustomFormDataObservable component86() {
        return this.customVideoCallInputObservable;
    }

    public final List<RecentAction> component87() {
        return this.taskEngagementActions;
    }

    public final Long component88() {
        return this.nextFollowUpOn;
    }

    public final String component89() {
        return this.nextFollowUpSetBy;
    }

    public final String component9() {
        return this.clientCompany;
    }

    public final Long component90() {
        return this.taskEngagementActionsUpdatedAt;
    }

    public final Long component91() {
        return this.firstTaskEngagementActionOn;
    }

    public final Integer component92() {
        return this.taskEngagementActionCount;
    }

    public final String component93() {
        return this.videoCallPlatform;
    }

    public final String component94() {
        return this.videoCallLink;
    }

    public final String component95() {
        return this.videoCallMetadata;
    }

    public final String component96() {
        return this.videoCallOutcome;
    }

    public final boolean component97() {
        return this.showBottom;
    }

    public final String component98() {
        return this.phoneLocalCallRecordingFile;
    }

    public final String component99() {
        return this.phoneLocalCallRecordingUri;
    }

    public final Tasks copy(String str, LeadsSummary leadsSummary, LeadsUser leadsUser, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2, long j3, long j4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, double d, double d2, String str23, long j5, long j6, String str24, String str25, long j7, long j8, String str26, String str27, String str28, String str29, String str30, long j9, String str31, String str32, double d3, double d4, long j10, long j11, String str33, String str34, long j12, long j13, String str35, String str36, String str37, String str38, String str39, String str40, boolean z, boolean z2, List<CommentSummary> list, List<EngagementUpdateSummary> list2, boolean z3, boolean z4, String str41, String str42, String str43, ArrayList<FileData> arrayList, ArrayList<FileData> arrayList2, String str44, String str45, String str46, String str47, ryh ryhVar, String str48, String str49, String str50, String str51, String str52, String str53, String str54, CustomFormDataObservable customFormDataObservable, CustomFormDataObservable customFormDataObservable2, CustomFormDataObservable customFormDataObservable3, CustomFormDataObservable customFormDataObservable4, List<RecentAction> list3, Long l, String str55, Long l2, Long l3, Integer num, String str56, String str57, String str58, String str59, boolean z5, String str60, String str61, String str62, boolean z6, AssignmentOutcome assignmentOutcome, String str63, boolean z7, boolean z8, Long l4, Long l5, FormFields formFields, boolean z9, String str64, String str65, String str66, String str67, Long l6, String str68, String str69, String str70) {
        sq8.m48649h(str2, "clientName");
        sq8.m48649h(str3, "clientID");
        sq8.m48649h(str4, "clientDesignation");
        sq8.m48649h(str5, "clientContactNumber");
        sq8.m48649h(str6, "clientProfilePic");
        sq8.m48649h(str7, "clientCompany");
        sq8.m48649h(str8, "clientSecondaryTitle");
        sq8.m48649h(str9, "noteHeading");
        sq8.m48649h(str10, "noteNextStep");
        sq8.m48649h(str11, "noteAdditionMethod");
        sq8.m48649h(str12, "body");
        sq8.m48649h(str14, "taskTitle");
        sq8.m48649h(str15, "taskContent");
        sq8.m48649h(str16, "taskAssignedTo");
        sq8.m48649h(str17, "taskAssignedToID");
        sq8.m48649h(str18, "taskAssignedToProfilePic");
        sq8.m48649h(str19, "taskEngagementType");
        sq8.m48649h(str20, "taskPriority");
        sq8.m48649h(str21, "taskReminder");
        sq8.m48649h(str22, "taskLocation");
        sq8.m48649h(str23, "taskDate");
        sq8.m48649h(str24, "taskTag");
        sq8.m48649h(str25, "taskContactMode");
        sq8.m48649h(str26, "taskNextStep");
        sq8.m48649h(str27, "systemAction");
        sq8.m48649h(str28, "visitNotes");
        sq8.m48649h(str29, "visitOutcome");
        sq8.m48649h(str30, "visitOutcomeNature");
        sq8.m48649h(str31, "visitNextStep");
        sq8.m48649h(str32, "visitLocation");
        sq8.m48649h(str33, "callDirection");
        sq8.m48649h(str34, "callConnectionStatus");
        sq8.m48649h(str35, "callOutcome");
        sq8.m48649h(str36, "callOutcomeNature");
        sq8.m48649h(str37, "callNextStep");
        sq8.m48649h(str39, "callInputNotes");
        sq8.m48649h(list, "comments");
        sq8.m48649h(list2, "engagementUpdates");
        sq8.m48649h(str41, "taskStatus");
        sq8.m48649h(str42, "taskCompletionNote");
        sq8.m48649h(str43, "taskCompletionType");
        sq8.m48649h(arrayList, "fileList");
        sq8.m48649h(arrayList2, "oldFileList");
        sq8.m48649h(list3, "taskEngagementActions");
        sq8.m48649h(str58, "videoCallMetadata");
        return new Tasks(str, leadsSummary, leadsUser, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, j, j2, j3, j4, str16, str17, str18, str19, str20, str21, str22, d, d2, str23, j5, j6, str24, str25, j7, j8, str26, str27, str28, str29, str30, j9, str31, str32, d3, d4, j10, j11, str33, str34, j12, j13, str35, str36, str37, str38, str39, str40, z, z2, list, list2, z3, z4, str41, str42, str43, arrayList, arrayList2, str44, str45, str46, str47, ryhVar, str48, str49, str50, str51, str52, str53, str54, customFormDataObservable, customFormDataObservable2, customFormDataObservable3, customFormDataObservable4, list3, l, str55, l2, l3, num, str56, str57, str58, str59, z5, str60, str61, str62, z6, assignmentOutcome, str63, z7, z8, l4, l5, formFields, z9, str64, str65, str66, str67, l6, str68, str69, str70);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tasks)) {
            return false;
        }
        Tasks tasks = (Tasks) obj;
        return sq8.m48644c(this.id, tasks.id) && sq8.m48644c(this.client, tasks.client) && sq8.m48644c(this.taskOwner, tasks.taskOwner) && sq8.m48644c(this.clientName, tasks.clientName) && sq8.m48644c(this.clientID, tasks.clientID) && sq8.m48644c(this.clientDesignation, tasks.clientDesignation) && sq8.m48644c(this.clientContactNumber, tasks.clientContactNumber) && sq8.m48644c(this.clientProfilePic, tasks.clientProfilePic) && sq8.m48644c(this.clientCompany, tasks.clientCompany) && sq8.m48644c(this.clientSecondaryTitle, tasks.clientSecondaryTitle) && sq8.m48644c(this.noteHeading, tasks.noteHeading) && sq8.m48644c(this.noteNextStep, tasks.noteNextStep) && sq8.m48644c(this.noteAdditionMethod, tasks.noteAdditionMethod) && sq8.m48644c(this.body, tasks.body) && sq8.m48644c(this.parentEngagementId, tasks.parentEngagementId) && sq8.m48644c(this.taskTitle, tasks.taskTitle) && sq8.m48644c(this.taskContent, tasks.taskContent) && this.taskTimeInMillis == tasks.taskTimeInMillis && this.nextTaskTimeInMillis == tasks.nextTaskTimeInMillis && this.taskDateTimeInMillis == tasks.taskDateTimeInMillis && this.nextTaskDateTimeInMillis == tasks.nextTaskDateTimeInMillis && sq8.m48644c(this.taskAssignedTo, tasks.taskAssignedTo) && sq8.m48644c(this.taskAssignedToID, tasks.taskAssignedToID) && sq8.m48644c(this.taskAssignedToProfilePic, tasks.taskAssignedToProfilePic) && sq8.m48644c(this.taskEngagementType, tasks.taskEngagementType) && sq8.m48644c(this.taskPriority, tasks.taskPriority) && sq8.m48644c(this.taskReminder, tasks.taskReminder) && sq8.m48644c(this.taskLocation, tasks.taskLocation) && Double.compare(this.taskLat, tasks.taskLat) == 0 && Double.compare(this.taskLng, tasks.taskLng) == 0 && sq8.m48644c(this.taskDate, tasks.taskDate) && this.taskDateInMillis == tasks.taskDateInMillis && this.nextTaskDateInMillis == tasks.nextTaskDateInMillis && sq8.m48644c(this.taskTag, tasks.taskTag) && sq8.m48644c(this.taskContactMode, tasks.taskContactMode) && this.taskReminderTimeInMillis == tasks.taskReminderTimeInMillis && this.taskCompletionTime == tasks.taskCompletionTime && sq8.m48644c(this.taskNextStep, tasks.taskNextStep) && sq8.m48644c(this.systemAction, tasks.systemAction) && sq8.m48644c(this.visitNotes, tasks.visitNotes) && sq8.m48644c(this.visitOutcome, tasks.visitOutcome) && sq8.m48644c(this.visitOutcomeNature, tasks.visitOutcomeNature) && this.visitDateInMillis == tasks.visitDateInMillis && sq8.m48644c(this.visitNextStep, tasks.visitNextStep) && sq8.m48644c(this.visitLocation, tasks.visitLocation) && Double.compare(this.visitLat, tasks.visitLat) == 0 && Double.compare(this.visitLng, tasks.visitLng) == 0 && this.callTimeInMillis == tasks.callTimeInMillis && this.callDurationInMillis == tasks.callDurationInMillis && sq8.m48644c(this.callDirection, tasks.callDirection) && sq8.m48644c(this.callConnectionStatus, tasks.callConnectionStatus) && this.callStartTime == tasks.callStartTime && this.callEndTime == tasks.callEndTime && sq8.m48644c(this.callOutcome, tasks.callOutcome) && sq8.m48644c(this.callOutcomeNature, tasks.callOutcomeNature) && sq8.m48644c(this.callNextStep, tasks.callNextStep) && sq8.m48644c(this.nextStepId, tasks.nextStepId) && sq8.m48644c(this.callInputNotes, tasks.callInputNotes) && sq8.m48644c(this.callRecordingUrl, tasks.callRecordingUrl) && this.isSelected == tasks.isSelected && this.showSelection == tasks.showSelection && sq8.m48644c(this.comments, tasks.comments) && sq8.m48644c(this.engagementUpdates, tasks.engagementUpdates) && this.isExpired == tasks.isExpired && this.showBottomView == tasks.showBottomView && sq8.m48644c(this.taskStatus, tasks.taskStatus) && sq8.m48644c(this.taskCompletionNote, tasks.taskCompletionNote) && sq8.m48644c(this.taskCompletionType, tasks.taskCompletionType) && sq8.m48644c(this.fileList, tasks.fileList) && sq8.m48644c(this.oldFileList, tasks.oldFileList) && sq8.m48644c(this.assignmentStatus, tasks.assignmentStatus) && sq8.m48644c(this.primaryTeamId, tasks.primaryTeamId) && sq8.m48644c(this.engagementSource, tasks.engagementSource) && sq8.m48644c(this.engagementSourceType, tasks.engagementSourceType) && sq8.m48644c(this.activityLocation, tasks.activityLocation) && sq8.m48644c(this.callPlacementId, tasks.callPlacementId) && sq8.m48644c(this.customTaskCompletionData, tasks.customTaskCompletionData) && sq8.m48644c(this.customCallOutcomeData, tasks.customCallOutcomeData) && sq8.m48644c(this.customVisitOutcomeData, tasks.customVisitOutcomeData) && sq8.m48644c(this.customTaskInputData, tasks.customTaskInputData) && sq8.m48644c(this.customNextStepTaskInputData, tasks.customNextStepTaskInputData) && sq8.m48644c(this.customVideoCallInputData, tasks.customVideoCallInputData) && sq8.m48644c(this.customTaskCompletionDataObservable, tasks.customTaskCompletionDataObservable) && sq8.m48644c(this.customCallOutcomeDataObservable, tasks.customCallOutcomeDataObservable) && sq8.m48644c(this.customVisitOutcomeDataObservable, tasks.customVisitOutcomeDataObservable) && sq8.m48644c(this.customVideoCallInputObservable, tasks.customVideoCallInputObservable) && sq8.m48644c(this.taskEngagementActions, tasks.taskEngagementActions) && sq8.m48644c(this.nextFollowUpOn, tasks.nextFollowUpOn) && sq8.m48644c(this.nextFollowUpSetBy, tasks.nextFollowUpSetBy) && sq8.m48644c(this.taskEngagementActionsUpdatedAt, tasks.taskEngagementActionsUpdatedAt) && sq8.m48644c(this.firstTaskEngagementActionOn, tasks.firstTaskEngagementActionOn) && sq8.m48644c(this.taskEngagementActionCount, tasks.taskEngagementActionCount) && sq8.m48644c(this.videoCallPlatform, tasks.videoCallPlatform) && sq8.m48644c(this.videoCallLink, tasks.videoCallLink) && sq8.m48644c(this.videoCallMetadata, tasks.videoCallMetadata) && sq8.m48644c(this.videoCallOutcome, tasks.videoCallOutcome) && this.showBottom == tasks.showBottom && sq8.m48644c(this.phoneLocalCallRecordingFile, tasks.phoneLocalCallRecordingFile) && sq8.m48644c(this.phoneLocalCallRecordingUri, tasks.phoneLocalCallRecordingUri) && sq8.m48644c(this.phoneLocalContactName, tasks.phoneLocalContactName) && this.transferLead == tasks.transferLead && sq8.m48644c(this.assignmentOutcome, tasks.assignmentOutcome) && sq8.m48644c(this.engagementSourceLevelTwo, tasks.engagementSourceLevelTwo) && this.createNewDeal == tasks.createNewDeal && this.taskTypeInputSelector == tasks.taskTypeInputSelector && sq8.m48644c(this.updatedAt, tasks.updatedAt) && sq8.m48644c(this.createdAt, tasks.createdAt) && sq8.m48644c(this.customFormFields, tasks.customFormFields) && this.inFlightCall == tasks.inFlightCall && sq8.m48644c(this.userNumber, tasks.userNumber) && sq8.m48644c(this.deviceId, tasks.deviceId) && sq8.m48644c(this.cloudProvider, tasks.cloudProvider) && sq8.m48644c(this.cloudProviderNumber, tasks.cloudProviderNumber) && sq8.m48644c(this.totalCallDuration, tasks.totalCallDuration) && sq8.m48644c(this.callType, tasks.callType) && sq8.m48644c(this.hangupReason, tasks.hangupReason) && sq8.m48644c(this.phoneCallLogId, tasks.phoneCallLogId);
    }

    public final ryh getActivityLocation() {
        return this.activityLocation;
    }

    public final AssignmentOutcome getAssignmentOutcome() {
        return this.assignmentOutcome;
    }

    public final String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallConnectionStatus() {
        return this.callConnectionStatus;
    }

    public final String getCallDirection() {
        return this.callDirection;
    }

    public final long getCallDurationInMillis() {
        return this.callDurationInMillis;
    }

    public final long getCallEndTime() {
        return this.callEndTime;
    }

    public final String getCallInputNotes() {
        return this.callInputNotes;
    }

    public final String getCallNextStep() {
        return this.callNextStep;
    }

    public final String getCallOutcome() {
        return this.callOutcome;
    }

    public final String getCallOutcomeNature() {
        return this.callOutcomeNature;
    }

    public final String getCallPlacementId() {
        return this.callPlacementId;
    }

    public final String getCallRecordingUrl() {
        return this.callRecordingUrl;
    }

    public final long getCallStartTime() {
        return this.callStartTime;
    }

    public final long getCallTimeInMillis() {
        return this.callTimeInMillis;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final LeadsSummary getClient() {
        return this.client;
    }

    public final String getClientCompany() {
        return this.clientCompany;
    }

    public final String getClientContactNumber() {
        return this.clientContactNumber;
    }

    public final String getClientDesignation() {
        return this.clientDesignation;
    }

    public final String getClientID() {
        return this.clientID;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientProfilePic() {
        return this.clientProfilePic;
    }

    public final String getClientSecondaryTitle() {
        return this.clientSecondaryTitle;
    }

    public final String getCloudProvider() {
        return this.cloudProvider;
    }

    public final String getCloudProviderNumber() {
        return this.cloudProviderNumber;
    }

    public final List<CommentSummary> getComments() {
        return this.comments;
    }

    public final boolean getCreateNewDeal() {
        return this.createNewDeal;
    }

    @Override // p001o.yfe
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCustomCallOutcomeData() {
        return this.customCallOutcomeData;
    }

    public final CustomFormDataObservable getCustomCallOutcomeDataObservable() {
        return this.customCallOutcomeDataObservable;
    }

    public final FormFields getCustomFormFields() {
        return this.customFormFields;
    }

    public final String getCustomNextStepTaskInputData() {
        return this.customNextStepTaskInputData;
    }

    public final String getCustomTaskCompletionData() {
        return this.customTaskCompletionData;
    }

    public final CustomFormDataObservable getCustomTaskCompletionDataObservable() {
        return this.customTaskCompletionDataObservable;
    }

    public final String getCustomTaskInputData() {
        return this.customTaskInputData;
    }

    public final String getCustomVideoCallInputData() {
        return this.customVideoCallInputData;
    }

    public final CustomFormDataObservable getCustomVideoCallInputObservable() {
        return this.customVideoCallInputObservable;
    }

    public final String getCustomVisitOutcomeData() {
        return this.customVisitOutcomeData;
    }

    public final CustomFormDataObservable getCustomVisitOutcomeDataObservable() {
        return this.customVisitOutcomeDataObservable;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEngagementSource() {
        return this.engagementSource;
    }

    public final String getEngagementSourceLevelTwo() {
        return this.engagementSourceLevelTwo;
    }

    public final String getEngagementSourceType() {
        return this.engagementSourceType;
    }

    public final List<EngagementUpdateSummary> getEngagementUpdates() {
        return this.engagementUpdates;
    }

    public final ArrayList<FileData> getFileList() {
        return this.fileList;
    }

    public final Long getFirstTaskEngagementActionOn() {
        return this.firstTaskEngagementActionOn;
    }

    public final String getHangupReason() {
        return this.hangupReason;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInFlightCall() {
        return this.inFlightCall;
    }

    public final Long getNextFollowUpOn() {
        return this.nextFollowUpOn;
    }

    public final String getNextFollowUpSetBy() {
        return this.nextFollowUpSetBy;
    }

    public final String getNextStepId() {
        return this.nextStepId;
    }

    public final long getNextTaskDateInMillis() {
        return this.nextTaskDateInMillis;
    }

    public final long getNextTaskDateTimeInMillis() {
        return this.nextTaskDateTimeInMillis;
    }

    public final long getNextTaskTimeInMillis() {
        return this.nextTaskTimeInMillis;
    }

    public final String getNoteAdditionMethod() {
        return this.noteAdditionMethod;
    }

    public final String getNoteHeading() {
        return this.noteHeading;
    }

    public final String getNoteNextStep() {
        return this.noteNextStep;
    }

    public final ArrayList<FileData> getOldFileList() {
        return this.oldFileList;
    }

    public final String getParentEngagementId() {
        return this.parentEngagementId;
    }

    public final String getPhoneCallLogId() {
        return this.phoneCallLogId;
    }

    public final String getPhoneLocalCallRecordingFile() {
        return this.phoneLocalCallRecordingFile;
    }

    public final String getPhoneLocalCallRecordingUri() {
        return this.phoneLocalCallRecordingUri;
    }

    public final String getPhoneLocalContactName() {
        return this.phoneLocalContactName;
    }

    public final String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public final boolean getShowBottom() {
        return this.showBottom;
    }

    public final boolean getShowBottomView() {
        return this.showBottomView;
    }

    public final boolean getShowSelection() {
        return this.showSelection;
    }

    public final String getSystemAction() {
        return this.systemAction;
    }

    public final String getTaskAssignedTo() {
        return this.taskAssignedTo;
    }

    public final String getTaskAssignedToID() {
        return this.taskAssignedToID;
    }

    public final String getTaskAssignedToProfilePic() {
        return this.taskAssignedToProfilePic;
    }

    public final String getTaskCompletionNote() {
        return this.taskCompletionNote;
    }

    public final long getTaskCompletionTime() {
        return this.taskCompletionTime;
    }

    public final String getTaskCompletionType() {
        return this.taskCompletionType;
    }

    public final String getTaskContactMode() {
        return this.taskContactMode;
    }

    public final String getTaskContent() {
        return this.taskContent;
    }

    public final String getTaskDate() {
        return this.taskDate;
    }

    public final long getTaskDateInMillis() {
        return this.taskDateInMillis;
    }

    public final long getTaskDateTimeInMillis() {
        return this.taskDateTimeInMillis;
    }

    public final Integer getTaskEngagementActionCount() {
        return this.taskEngagementActionCount;
    }

    public final List<RecentAction> getTaskEngagementActions() {
        return this.taskEngagementActions;
    }

    public final Long getTaskEngagementActionsUpdatedAt() {
        return this.taskEngagementActionsUpdatedAt;
    }

    public final String getTaskEngagementType() {
        return this.taskEngagementType;
    }

    public final double getTaskLat() {
        return this.taskLat;
    }

    public final double getTaskLng() {
        return this.taskLng;
    }

    public final String getTaskLocation() {
        return this.taskLocation;
    }

    public final String getTaskNextStep() {
        return this.taskNextStep;
    }

    public final LeadsUser getTaskOwner() {
        return this.taskOwner;
    }

    public final String getTaskPriority() {
        return this.taskPriority;
    }

    public final String getTaskReminder() {
        return this.taskReminder;
    }

    public final long getTaskReminderTimeInMillis() {
        return this.taskReminderTimeInMillis;
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    public final String getTaskTag() {
        return this.taskTag;
    }

    public final long getTaskTimeInMillis() {
        return this.taskTimeInMillis;
    }

    public final String getTaskTitle() {
        return this.taskTitle;
    }

    public final boolean getTaskTypeInputSelector() {
        return this.taskTypeInputSelector;
    }

    public final Long getTotalCallDuration() {
        return this.totalCallDuration;
    }

    public final boolean getTransferLead() {
        return this.transferLead;
    }

    @Override // p001o.yfe
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserNumber() {
        return this.userNumber;
    }

    public final String getVideoCallLink() {
        return this.videoCallLink;
    }

    public final String getVideoCallMetadata() {
        return this.videoCallMetadata;
    }

    public final String getVideoCallOutcome() {
        return this.videoCallOutcome;
    }

    public final String getVideoCallPlatform() {
        return this.videoCallPlatform;
    }

    public final long getVisitDateInMillis() {
        return this.visitDateInMillis;
    }

    public final double getVisitLat() {
        return this.visitLat;
    }

    public final double getVisitLng() {
        return this.visitLng;
    }

    public final String getVisitLocation() {
        return this.visitLocation;
    }

    public final String getVisitNextStep() {
        return this.visitNextStep;
    }

    public final String getVisitNotes() {
        return this.visitNotes;
    }

    public final String getVisitOutcome() {
        return this.visitOutcome;
    }

    public final String getVisitOutcomeNature() {
        return this.visitOutcomeNature;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LeadsSummary leadsSummary = this.client;
        int iHashCode2 = (iHashCode + (leadsSummary == null ? 0 : leadsSummary.hashCode())) * 31;
        LeadsUser leadsUser = this.taskOwner;
        int iHashCode3 = (((((((((((((((((((((((iHashCode2 + (leadsUser == null ? 0 : leadsUser.hashCode())) * 31) + this.clientName.hashCode()) * 31) + this.clientID.hashCode()) * 31) + this.clientDesignation.hashCode()) * 31) + this.clientContactNumber.hashCode()) * 31) + this.clientProfilePic.hashCode()) * 31) + this.clientCompany.hashCode()) * 31) + this.clientSecondaryTitle.hashCode()) * 31) + this.noteHeading.hashCode()) * 31) + this.noteNextStep.hashCode()) * 31) + this.noteAdditionMethod.hashCode()) * 31) + this.body.hashCode()) * 31;
        String str2 = this.parentEngagementId;
        int iHashCode4 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.taskTitle.hashCode()) * 31) + this.taskContent.hashCode()) * 31) + Long.hashCode(this.taskTimeInMillis)) * 31) + Long.hashCode(this.nextTaskTimeInMillis)) * 31) + Long.hashCode(this.taskDateTimeInMillis)) * 31) + Long.hashCode(this.nextTaskDateTimeInMillis)) * 31) + this.taskAssignedTo.hashCode()) * 31) + this.taskAssignedToID.hashCode()) * 31) + this.taskAssignedToProfilePic.hashCode()) * 31) + this.taskEngagementType.hashCode()) * 31) + this.taskPriority.hashCode()) * 31) + this.taskReminder.hashCode()) * 31) + this.taskLocation.hashCode()) * 31) + Double.hashCode(this.taskLat)) * 31) + Double.hashCode(this.taskLng)) * 31) + this.taskDate.hashCode()) * 31) + Long.hashCode(this.taskDateInMillis)) * 31) + Long.hashCode(this.nextTaskDateInMillis)) * 31) + this.taskTag.hashCode()) * 31) + this.taskContactMode.hashCode()) * 31) + Long.hashCode(this.taskReminderTimeInMillis)) * 31) + Long.hashCode(this.taskCompletionTime)) * 31) + this.taskNextStep.hashCode()) * 31) + this.systemAction.hashCode()) * 31) + this.visitNotes.hashCode()) * 31) + this.visitOutcome.hashCode()) * 31) + this.visitOutcomeNature.hashCode()) * 31) + Long.hashCode(this.visitDateInMillis)) * 31) + this.visitNextStep.hashCode()) * 31) + this.visitLocation.hashCode()) * 31) + Double.hashCode(this.visitLat)) * 31) + Double.hashCode(this.visitLng)) * 31) + Long.hashCode(this.callTimeInMillis)) * 31) + Long.hashCode(this.callDurationInMillis)) * 31) + this.callDirection.hashCode()) * 31) + this.callConnectionStatus.hashCode()) * 31) + Long.hashCode(this.callStartTime)) * 31) + Long.hashCode(this.callEndTime)) * 31) + this.callOutcome.hashCode()) * 31) + this.callOutcomeNature.hashCode()) * 31) + this.callNextStep.hashCode()) * 31;
        String str3 = this.nextStepId;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.callInputNotes.hashCode()) * 31;
        String str4 = this.callRecordingUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode6 + i) * 31;
        boolean z2 = this.showSelection;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int iHashCode7 = (((((i2 + i3) * 31) + this.comments.hashCode()) * 31) + this.engagementUpdates.hashCode()) * 31;
        boolean z3 = this.isExpired;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (iHashCode7 + i4) * 31;
        boolean z4 = this.showBottomView;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int iHashCode8 = (((((((((((i5 + i6) * 31) + this.taskStatus.hashCode()) * 31) + this.taskCompletionNote.hashCode()) * 31) + this.taskCompletionType.hashCode()) * 31) + this.fileList.hashCode()) * 31) + this.oldFileList.hashCode()) * 31;
        String str5 = this.assignmentStatus;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.primaryTeamId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.engagementSource;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.engagementSourceType;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ryh ryhVar = this.activityLocation;
        int iHashCode13 = (iHashCode12 + (ryhVar == null ? 0 : ryhVar.hashCode())) * 31;
        String str9 = this.callPlacementId;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.customTaskCompletionData;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.customCallOutcomeData;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.customVisitOutcomeData;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.customTaskInputData;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customNextStepTaskInputData;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.customVideoCallInputData;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        CustomFormDataObservable customFormDataObservable = this.customTaskCompletionDataObservable;
        int iHashCode21 = (iHashCode20 + (customFormDataObservable == null ? 0 : customFormDataObservable.hashCode())) * 31;
        CustomFormDataObservable customFormDataObservable2 = this.customCallOutcomeDataObservable;
        int iHashCode22 = (iHashCode21 + (customFormDataObservable2 == null ? 0 : customFormDataObservable2.hashCode())) * 31;
        CustomFormDataObservable customFormDataObservable3 = this.customVisitOutcomeDataObservable;
        int iHashCode23 = (iHashCode22 + (customFormDataObservable3 == null ? 0 : customFormDataObservable3.hashCode())) * 31;
        CustomFormDataObservable customFormDataObservable4 = this.customVideoCallInputObservable;
        int iHashCode24 = (((iHashCode23 + (customFormDataObservable4 == null ? 0 : customFormDataObservable4.hashCode())) * 31) + this.taskEngagementActions.hashCode()) * 31;
        Long l = this.nextFollowUpOn;
        int iHashCode25 = (iHashCode24 + (l == null ? 0 : l.hashCode())) * 31;
        String str16 = this.nextFollowUpSetBy;
        int iHashCode26 = (iHashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l2 = this.taskEngagementActionsUpdatedAt;
        int iHashCode27 = (iHashCode26 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.firstTaskEngagementActionOn;
        int iHashCode28 = (iHashCode27 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.taskEngagementActionCount;
        int iHashCode29 = (iHashCode28 + (num == null ? 0 : num.hashCode())) * 31;
        String str17 = this.videoCallPlatform;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.videoCallLink;
        int iHashCode31 = (((iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31) + this.videoCallMetadata.hashCode()) * 31;
        String str19 = this.videoCallOutcome;
        int iHashCode32 = (iHashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        boolean z5 = this.showBottom;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (iHashCode32 + i7) * 31;
        String str20 = this.phoneLocalCallRecordingFile;
        int iHashCode33 = (i8 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.phoneLocalCallRecordingUri;
        int iHashCode34 = (iHashCode33 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.phoneLocalContactName;
        int iHashCode35 = (iHashCode34 + (str22 == null ? 0 : str22.hashCode())) * 31;
        boolean z6 = this.transferLead;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int i10 = (iHashCode35 + i9) * 31;
        AssignmentOutcome assignmentOutcome = this.assignmentOutcome;
        int iHashCode36 = (i10 + (assignmentOutcome == null ? 0 : assignmentOutcome.hashCode())) * 31;
        String str23 = this.engagementSourceLevelTwo;
        int iHashCode37 = (iHashCode36 + (str23 == null ? 0 : str23.hashCode())) * 31;
        boolean z7 = this.createNewDeal;
        int i11 = z7;
        if (z7 != 0) {
            i11 = 1;
        }
        int i12 = (iHashCode37 + i11) * 31;
        boolean z8 = this.taskTypeInputSelector;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        Long l4 = this.updatedAt;
        int iHashCode38 = (i14 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.createdAt;
        int iHashCode39 = (iHashCode38 + (l5 == null ? 0 : l5.hashCode())) * 31;
        FormFields formFields = this.customFormFields;
        int iHashCode40 = (iHashCode39 + (formFields == null ? 0 : formFields.hashCode())) * 31;
        boolean z9 = this.inFlightCall;
        int i15 = (iHashCode40 + (z9 ? 1 : z9 ? 1 : 0)) * 31;
        String str24 = this.userNumber;
        int iHashCode41 = (i15 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.deviceId;
        int iHashCode42 = (iHashCode41 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.cloudProvider;
        int iHashCode43 = (iHashCode42 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.cloudProviderNumber;
        int iHashCode44 = (iHashCode43 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Long l6 = this.totalCallDuration;
        int iHashCode45 = (iHashCode44 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str28 = this.callType;
        int iHashCode46 = (iHashCode45 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.hangupReason;
        int iHashCode47 = (iHashCode46 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.phoneCallLogId;
        return iHashCode47 + (str30 != null ? str30.hashCode() : 0);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setActivityLocation(ryh ryhVar) {
        this.activityLocation = ryhVar;
    }

    public final void setAssignmentOutcome(AssignmentOutcome assignmentOutcome) {
        this.assignmentOutcome = assignmentOutcome;
    }

    public final void setAssignmentStatus(String str) {
        this.assignmentStatus = str;
    }

    public final void setBody(String str) {
        sq8.m48649h(str, "<set-?>");
        this.body = str;
    }

    public final void setCallConnectionStatus(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callConnectionStatus = str;
    }

    public final void setCallDirection(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callDirection = str;
    }

    public final void setCallDurationInMillis(long j) {
        this.callDurationInMillis = j;
    }

    public final void setCallEndTime(long j) {
        this.callEndTime = j;
    }

    public final void setCallInputNotes(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callInputNotes = str;
    }

    public final void setCallNextStep(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callNextStep = str;
    }

    public final void setCallOutcome(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callOutcome = str;
    }

    public final void setCallOutcomeNature(String str) {
        sq8.m48649h(str, "<set-?>");
        this.callOutcomeNature = str;
    }

    public final void setCallPlacementId(String str) {
        this.callPlacementId = str;
    }

    public final void setCallRecordingUrl(String str) {
        this.callRecordingUrl = str;
    }

    public final void setCallStartTime(long j) {
        this.callStartTime = j;
    }

    public final void setCallTimeInMillis(long j) {
        this.callTimeInMillis = j;
    }

    public final void setCallType(String str) {
        this.callType = str;
    }

    public final void setClient(LeadsSummary leadsSummary) {
        this.client = leadsSummary;
    }

    public final void setClientCompany(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientCompany = str;
    }

    public final void setClientContactNumber(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientContactNumber = str;
    }

    public final void setClientDesignation(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientDesignation = str;
    }

    public final void setClientID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientID = str;
    }

    public final void setClientName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientName = str;
    }

    public final void setClientProfilePic(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientProfilePic = str;
    }

    public final void setClientSecondaryTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.clientSecondaryTitle = str;
    }

    public final void setCloudProvider(String str) {
        this.cloudProvider = str;
    }

    public final void setCloudProviderNumber(String str) {
        this.cloudProviderNumber = str;
    }

    public final void setComments(List<CommentSummary> list) {
        sq8.m48649h(list, "<set-?>");
        this.comments = list;
    }

    public final void setCreateNewDeal(boolean z) {
        this.createNewDeal = z;
    }

    @Override // p001o.yfe
    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setCustomCallOutcomeData(String str) {
        this.customCallOutcomeData = str;
    }

    public final void setCustomCallOutcomeDataObservable(CustomFormDataObservable customFormDataObservable) {
        this.customCallOutcomeDataObservable = customFormDataObservable;
    }

    public final void setCustomFormFields(FormFields formFields) {
        this.customFormFields = formFields;
    }

    public final void setCustomNextStepTaskInputData(String str) {
        this.customNextStepTaskInputData = str;
    }

    public final void setCustomTaskCompletionData(String str) {
        this.customTaskCompletionData = str;
    }

    public final void setCustomTaskCompletionDataObservable(CustomFormDataObservable customFormDataObservable) {
        this.customTaskCompletionDataObservable = customFormDataObservable;
    }

    public final void setCustomTaskInputData(String str) {
        this.customTaskInputData = str;
    }

    public final void setCustomVideoCallInputData(String str) {
        this.customVideoCallInputData = str;
    }

    public final void setCustomVideoCallInputObservable(CustomFormDataObservable customFormDataObservable) {
        this.customVideoCallInputObservable = customFormDataObservable;
    }

    public final void setCustomVisitOutcomeData(String str) {
        this.customVisitOutcomeData = str;
    }

    public final void setCustomVisitOutcomeDataObservable(CustomFormDataObservable customFormDataObservable) {
        this.customVisitOutcomeDataObservable = customFormDataObservable;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setEngagementSource(String str) {
        this.engagementSource = str;
    }

    public final void setEngagementSourceLevelTwo(String str) {
        this.engagementSourceLevelTwo = str;
    }

    public final void setEngagementSourceType(String str) {
        this.engagementSourceType = str;
    }

    public final void setEngagementUpdates(List<EngagementUpdateSummary> list) {
        sq8.m48649h(list, "<set-?>");
        this.engagementUpdates = list;
    }

    public final void setExpired(boolean z) {
        this.isExpired = z;
    }

    public final void setFileList(ArrayList<FileData> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.fileList = arrayList;
    }

    public final void setFirstTaskEngagementActionOn(Long l) {
        this.firstTaskEngagementActionOn = l;
    }

    public final void setHangupReason(String str) {
        this.hangupReason = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setInFlightCall(boolean z) {
        this.inFlightCall = z;
    }

    public final void setNextFollowUpOn(Long l) {
        this.nextFollowUpOn = l;
    }

    public final void setNextFollowUpSetBy(String str) {
        this.nextFollowUpSetBy = str;
    }

    public final void setNextStepId(String str) {
        this.nextStepId = str;
    }

    public final void setNextTaskDateInMillis(long j) {
        this.nextTaskDateInMillis = j;
    }

    public final void setNextTaskDateTimeInMillis(long j) {
        this.nextTaskDateTimeInMillis = j;
    }

    public final void setNextTaskTimeInMillis(long j) {
        this.nextTaskTimeInMillis = j;
    }

    public final void setNoteAdditionMethod(String str) {
        sq8.m48649h(str, "<set-?>");
        this.noteAdditionMethod = str;
    }

    public final void setNoteHeading(String str) {
        sq8.m48649h(str, "<set-?>");
        this.noteHeading = str;
    }

    public final void setNoteNextStep(String str) {
        sq8.m48649h(str, "<set-?>");
        this.noteNextStep = str;
    }

    public final void setOldFileList(ArrayList<FileData> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.oldFileList = arrayList;
    }

    public final void setParentEngagementId(String str) {
        this.parentEngagementId = str;
    }

    public final void setPhoneCallLogId(String str) {
        this.phoneCallLogId = str;
    }

    public final void setPhoneLocalCallRecordingFile(String str) {
        this.phoneLocalCallRecordingFile = str;
    }

    public final void setPhoneLocalCallRecordingUri(String str) {
        this.phoneLocalCallRecordingUri = str;
    }

    public final void setPhoneLocalContactName(String str) {
        this.phoneLocalContactName = str;
    }

    public final void setPrimaryTeamId(String str) {
        this.primaryTeamId = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShowBottom(boolean z) {
        this.showBottom = z;
    }

    public final void setShowBottomView(boolean z) {
        this.showBottomView = z;
    }

    public final void setShowSelection(boolean z) {
        this.showSelection = z;
    }

    public final void setSystemAction(String str) {
        sq8.m48649h(str, "<set-?>");
        this.systemAction = str;
    }

    public final void setTaskAssignedTo(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskAssignedTo = str;
    }

    public final void setTaskAssignedToID(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskAssignedToID = str;
    }

    public final void setTaskAssignedToProfilePic(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskAssignedToProfilePic = str;
    }

    public final void setTaskCompletionNote(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskCompletionNote = str;
    }

    public final void setTaskCompletionTime(long j) {
        this.taskCompletionTime = j;
    }

    public final void setTaskCompletionType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskCompletionType = str;
    }

    public final void setTaskContactMode(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskContactMode = str;
    }

    public final void setTaskContent(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskContent = str;
    }

    public final void setTaskDate(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskDate = str;
    }

    public final void setTaskDateInMillis(long j) {
        this.taskDateInMillis = j;
    }

    public final void setTaskDateTimeInMillis(long j) {
        this.taskDateTimeInMillis = j;
    }

    public final void setTaskEngagementActionCount(Integer num) {
        this.taskEngagementActionCount = num;
    }

    public final void setTaskEngagementActions(List<RecentAction> list) {
        sq8.m48649h(list, "<set-?>");
        this.taskEngagementActions = list;
    }

    public final void setTaskEngagementActionsUpdatedAt(Long l) {
        this.taskEngagementActionsUpdatedAt = l;
    }

    public final void setTaskEngagementType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskEngagementType = str;
    }

    public final void setTaskLat(double d) {
        this.taskLat = d;
    }

    public final void setTaskLng(double d) {
        this.taskLng = d;
    }

    public final void setTaskLocation(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskLocation = str;
    }

    public final void setTaskNextStep(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskNextStep = str;
    }

    public final void setTaskOwner(LeadsUser leadsUser) {
        this.taskOwner = leadsUser;
    }

    public final void setTaskPriority(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskPriority = str;
    }

    public final void setTaskReminder(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskReminder = str;
    }

    public final void setTaskReminderTimeInMillis(long j) {
        this.taskReminderTimeInMillis = j;
    }

    public final void setTaskStatus(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskStatus = str;
    }

    public final void setTaskTag(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskTag = str;
    }

    public final void setTaskTimeInMillis(long j) {
        this.taskTimeInMillis = j;
    }

    public final void setTaskTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskTitle = str;
    }

    public final void setTaskTypeInputSelector(boolean z) {
        this.taskTypeInputSelector = z;
    }

    public final void setTotalCallDuration(Long l) {
        this.totalCallDuration = l;
    }

    public final void setTransferLead(boolean z) {
        this.transferLead = z;
    }

    @Override // p001o.yfe
    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }

    public final void setUserNumber(String str) {
        this.userNumber = str;
    }

    public final void setVideoCallLink(String str) {
        this.videoCallLink = str;
    }

    public final void setVideoCallMetadata(String str) {
        sq8.m48649h(str, "<set-?>");
        this.videoCallMetadata = str;
    }

    public final void setVideoCallOutcome(String str) {
        this.videoCallOutcome = str;
    }

    public final void setVideoCallPlatform(String str) {
        this.videoCallPlatform = str;
    }

    public final void setVisitDateInMillis(long j) {
        this.visitDateInMillis = j;
    }

    public final void setVisitLat(double d) {
        this.visitLat = d;
    }

    public final void setVisitLng(double d) {
        this.visitLng = d;
    }

    public final void setVisitLocation(String str) {
        sq8.m48649h(str, "<set-?>");
        this.visitLocation = str;
    }

    public final void setVisitNextStep(String str) {
        sq8.m48649h(str, "<set-?>");
        this.visitNextStep = str;
    }

    public final void setVisitNotes(String str) {
        sq8.m48649h(str, "<set-?>");
        this.visitNotes = str;
    }

    public final void setVisitOutcome(String str) {
        sq8.m48649h(str, "<set-?>");
        this.visitOutcome = str;
    }

    public final void setVisitOutcomeNature(String str) {
        sq8.m48649h(str, "<set-?>");
        this.visitOutcomeNature = str;
    }

    public final Tasks toSearchableCallLogsForLocal() {
        return new Tasks(this.id, null, null, this.clientName, this.clientID, null, this.clientContactNumber, null, null, null, null, null, null, null, this.parentEngagementId, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, 0L, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.callTimeInMillis, this.callDurationInMillis, this.callDirection, this.callConnectionStatus, this.callStartTime, this.callEndTime, null, null, null, null, null, this.callRecordingUrl, false, false, null, null, false, false, null, null, null, null, null, null, null, this.engagementSource, this.engagementSourceType, null, this.callPlacementId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.phoneLocalCallRecordingFile, this.phoneLocalCallRecordingUri, this.phoneLocalContactName, false, null, null, false, false, getUpdatedAt(), getCreatedAt(), null, false, null, null, null, null, null, null, null, null, -16474, -69173249, -2817, 2095601, null);
    }

    public String toString() {
        return "Tasks(id=" + this.id + ", client=" + this.client + ", taskOwner=" + this.taskOwner + ", clientName=" + this.clientName + ", clientID=" + this.clientID + ", clientDesignation=" + this.clientDesignation + ", clientContactNumber=" + this.clientContactNumber + ", clientProfilePic=" + this.clientProfilePic + ", clientCompany=" + this.clientCompany + ", clientSecondaryTitle=" + this.clientSecondaryTitle + ", noteHeading=" + this.noteHeading + ", noteNextStep=" + this.noteNextStep + ", noteAdditionMethod=" + this.noteAdditionMethod + ", body=" + this.body + ", parentEngagementId=" + this.parentEngagementId + ", taskTitle=" + this.taskTitle + ", taskContent=" + this.taskContent + ", taskTimeInMillis=" + this.taskTimeInMillis + ", nextTaskTimeInMillis=" + this.nextTaskTimeInMillis + ", taskDateTimeInMillis=" + this.taskDateTimeInMillis + ", nextTaskDateTimeInMillis=" + this.nextTaskDateTimeInMillis + ", taskAssignedTo=" + this.taskAssignedTo + ", taskAssignedToID=" + this.taskAssignedToID + ", taskAssignedToProfilePic=" + this.taskAssignedToProfilePic + ", taskEngagementType=" + this.taskEngagementType + ", taskPriority=" + this.taskPriority + ", taskReminder=" + this.taskReminder + ", taskLocation=" + this.taskLocation + ", taskLat=" + this.taskLat + ", taskLng=" + this.taskLng + ", taskDate=" + this.taskDate + ", taskDateInMillis=" + this.taskDateInMillis + ", nextTaskDateInMillis=" + this.nextTaskDateInMillis + ", taskTag=" + this.taskTag + ", taskContactMode=" + this.taskContactMode + ", taskReminderTimeInMillis=" + this.taskReminderTimeInMillis + ", taskCompletionTime=" + this.taskCompletionTime + ", taskNextStep=" + this.taskNextStep + ", systemAction=" + this.systemAction + ", visitNotes=" + this.visitNotes + ", visitOutcome=" + this.visitOutcome + ", visitOutcomeNature=" + this.visitOutcomeNature + ", visitDateInMillis=" + this.visitDateInMillis + ", visitNextStep=" + this.visitNextStep + ", visitLocation=" + this.visitLocation + ", visitLat=" + this.visitLat + ", visitLng=" + this.visitLng + ", callTimeInMillis=" + this.callTimeInMillis + ", callDurationInMillis=" + this.callDurationInMillis + ", callDirection=" + this.callDirection + ", callConnectionStatus=" + this.callConnectionStatus + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", callOutcome=" + this.callOutcome + ", callOutcomeNature=" + this.callOutcomeNature + ", callNextStep=" + this.callNextStep + ", nextStepId=" + this.nextStepId + ", callInputNotes=" + this.callInputNotes + ", callRecordingUrl=" + this.callRecordingUrl + ", isSelected=" + this.isSelected + ", showSelection=" + this.showSelection + ", comments=" + this.comments + ", engagementUpdates=" + this.engagementUpdates + ", isExpired=" + this.isExpired + ", showBottomView=" + this.showBottomView + ", taskStatus=" + this.taskStatus + ", taskCompletionNote=" + this.taskCompletionNote + ", taskCompletionType=" + this.taskCompletionType + ", fileList=" + this.fileList + ", oldFileList=" + this.oldFileList + ", assignmentStatus=" + this.assignmentStatus + ", primaryTeamId=" + this.primaryTeamId + ", engagementSource=" + this.engagementSource + ", engagementSourceType=" + this.engagementSourceType + ", activityLocation=" + this.activityLocation + ", callPlacementId=" + this.callPlacementId + ", customTaskCompletionData=" + this.customTaskCompletionData + ", customCallOutcomeData=" + this.customCallOutcomeData + ", customVisitOutcomeData=" + this.customVisitOutcomeData + ", customTaskInputData=" + this.customTaskInputData + ", customNextStepTaskInputData=" + this.customNextStepTaskInputData + ", customVideoCallInputData=" + this.customVideoCallInputData + ", customTaskCompletionDataObservable=" + this.customTaskCompletionDataObservable + ", customCallOutcomeDataObservable=" + this.customCallOutcomeDataObservable + ", customVisitOutcomeDataObservable=" + this.customVisitOutcomeDataObservable + ", customVideoCallInputObservable=" + this.customVideoCallInputObservable + ", taskEngagementActions=" + this.taskEngagementActions + ", nextFollowUpOn=" + this.nextFollowUpOn + ", nextFollowUpSetBy=" + this.nextFollowUpSetBy + ", taskEngagementActionsUpdatedAt=" + this.taskEngagementActionsUpdatedAt + ", firstTaskEngagementActionOn=" + this.firstTaskEngagementActionOn + ", taskEngagementActionCount=" + this.taskEngagementActionCount + ", videoCallPlatform=" + this.videoCallPlatform + ", videoCallLink=" + this.videoCallLink + ", videoCallMetadata=" + this.videoCallMetadata + ", videoCallOutcome=" + this.videoCallOutcome + ", showBottom=" + this.showBottom + ", phoneLocalCallRecordingFile=" + this.phoneLocalCallRecordingFile + ", phoneLocalCallRecordingUri=" + this.phoneLocalCallRecordingUri + ", phoneLocalContactName=" + this.phoneLocalContactName + ", transferLead=" + this.transferLead + ", assignmentOutcome=" + this.assignmentOutcome + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", createNewDeal=" + this.createNewDeal + ", taskTypeInputSelector=" + this.taskTypeInputSelector + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", customFormFields=" + this.customFormFields + ", inFlightCall=" + this.inFlightCall + ", userNumber=" + this.userNumber + ", deviceId=" + this.deviceId + ", cloudProvider=" + this.cloudProvider + ", cloudProviderNumber=" + this.cloudProviderNumber + ", totalCallDuration=" + this.totalCallDuration + ", callType=" + this.callType + ", hangupReason=" + this.hangupReason + ", phoneCallLogId=" + this.phoneCallLogId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.clientName);
        parcel.writeString(this.clientID);
        parcel.writeString(this.clientDesignation);
        parcel.writeString(this.clientContactNumber);
        parcel.writeString(this.clientProfilePic);
        parcel.writeString(this.clientCompany);
        parcel.writeString(this.clientSecondaryTitle);
        parcel.writeString(this.noteHeading);
        parcel.writeString(this.noteNextStep);
        parcel.writeString(this.noteAdditionMethod);
        parcel.writeString(this.body);
        parcel.writeString(this.parentEngagementId);
        parcel.writeString(this.taskTitle);
        parcel.writeString(this.taskContent);
        parcel.writeLong(this.taskTimeInMillis);
        parcel.writeLong(this.nextTaskTimeInMillis);
        parcel.writeLong(this.taskDateTimeInMillis);
        parcel.writeLong(this.nextTaskDateTimeInMillis);
        parcel.writeString(this.taskAssignedTo);
        parcel.writeString(this.taskAssignedToID);
        parcel.writeString(this.taskAssignedToProfilePic);
        parcel.writeString(this.taskEngagementType);
        parcel.writeString(this.taskPriority);
        parcel.writeString(this.taskReminder);
        parcel.writeString(this.taskLocation);
        parcel.writeDouble(this.taskLat);
        parcel.writeDouble(this.taskLng);
        parcel.writeString(this.taskDate);
        parcel.writeLong(this.taskDateInMillis);
        parcel.writeLong(this.nextTaskDateInMillis);
        parcel.writeString(this.taskTag);
        parcel.writeString(this.taskContactMode);
        parcel.writeLong(this.taskReminderTimeInMillis);
        parcel.writeLong(this.taskCompletionTime);
        parcel.writeString(this.taskNextStep);
        parcel.writeString(this.systemAction);
        parcel.writeString(this.visitNotes);
        parcel.writeString(this.visitOutcome);
        parcel.writeString(this.visitOutcomeNature);
        parcel.writeLong(this.visitDateInMillis);
        parcel.writeString(this.visitNextStep);
        parcel.writeString(this.visitLocation);
        parcel.writeDouble(this.visitLat);
        parcel.writeDouble(this.visitLng);
        parcel.writeLong(this.callTimeInMillis);
        parcel.writeLong(this.callDurationInMillis);
        parcel.writeString(this.callDirection);
        parcel.writeString(this.callConnectionStatus);
        parcel.writeLong(this.callStartTime);
        parcel.writeLong(this.callEndTime);
        parcel.writeString(this.callOutcome);
        parcel.writeString(this.callOutcomeNature);
        parcel.writeString(this.callNextStep);
        parcel.writeString(this.nextStepId);
        parcel.writeString(this.callInputNotes);
        parcel.writeString(this.callRecordingUrl);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.showSelection ? 1 : 0);
        parcel.writeInt(this.isExpired ? 1 : 0);
        parcel.writeInt(this.showBottomView ? 1 : 0);
        parcel.writeString(this.taskStatus);
        parcel.writeString(this.taskCompletionNote);
        parcel.writeString(this.taskCompletionType);
        ArrayList<FileData> arrayList = this.fileList;
        parcel.writeInt(arrayList.size());
        Iterator<FileData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<FileData> arrayList2 = this.oldFileList;
        parcel.writeInt(arrayList2.size());
        Iterator<FileData> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.assignmentStatus);
        parcel.writeString(this.primaryTeamId);
        parcel.writeString(this.engagementSource);
        parcel.writeString(this.engagementSourceType);
        parcel.writeSerializable(this.activityLocation);
        parcel.writeString(this.callPlacementId);
        parcel.writeString(this.customTaskCompletionData);
        parcel.writeString(this.customCallOutcomeData);
        parcel.writeString(this.customVisitOutcomeData);
        parcel.writeString(this.customTaskInputData);
        parcel.writeString(this.customNextStepTaskInputData);
        parcel.writeString(this.customVideoCallInputData);
        parcel.writeParcelable(this.customTaskCompletionDataObservable, i);
        parcel.writeParcelable(this.customCallOutcomeDataObservable, i);
        parcel.writeParcelable(this.customVisitOutcomeDataObservable, i);
        parcel.writeParcelable(this.customVideoCallInputObservable, i);
        List<RecentAction> list = this.taskEngagementActions;
        parcel.writeInt(list.size());
        Iterator<RecentAction> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Long l = this.nextFollowUpOn;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nextFollowUpSetBy);
        Long l2 = this.taskEngagementActionsUpdatedAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.firstTaskEngagementActionOn;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Integer num = this.taskEngagementActionCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.videoCallPlatform);
        parcel.writeString(this.videoCallLink);
        parcel.writeString(this.videoCallMetadata);
        parcel.writeString(this.videoCallOutcome);
        parcel.writeInt(this.showBottom ? 1 : 0);
        parcel.writeString(this.phoneLocalCallRecordingFile);
        parcel.writeString(this.phoneLocalCallRecordingUri);
        parcel.writeString(this.phoneLocalContactName);
        parcel.writeInt(this.transferLead ? 1 : 0);
        AssignmentOutcome assignmentOutcome = this.assignmentOutcome;
        if (assignmentOutcome == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assignmentOutcome.writeToParcel(parcel, i);
        }
        parcel.writeString(this.engagementSourceLevelTwo);
        parcel.writeInt(this.createNewDeal ? 1 : 0);
        parcel.writeInt(this.taskTypeInputSelector ? 1 : 0);
        Long l4 = this.updatedAt;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Long l5 = this.createdAt;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        FormFields formFields = this.customFormFields;
        if (formFields == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formFields.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.inFlightCall ? 1 : 0);
        parcel.writeString(this.userNumber);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.cloudProvider);
        parcel.writeString(this.cloudProviderNumber);
        Long l6 = this.totalCallDuration;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        parcel.writeString(this.callType);
        parcel.writeString(this.hangupReason);
        parcel.writeString(this.phoneCallLogId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Tasks(String str, LeadsSummary leadsSummary, LeadsUser leadsUser, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2, long j3, long j4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, double d, double d2, String str23, long j5, long j6, String str24, String str25, long j7, long j8, String str26, String str27, String str28, String str29, String str30, long j9, String str31, String str32, double d3, double d4, long j10, long j11, String str33, String str34, long j12, long j13, String str35, String str36, String str37, String str38, String str39, String str40, boolean z, boolean z2, List list, List list2, boolean z3, boolean z4, String str41, String str42, String str43, ArrayList arrayList, ArrayList arrayList2, String str44, String str45, String str46, String str47, ryh ryhVar, String str48, String str49, String str50, String str51, String str52, String str53, String str54, CustomFormDataObservable customFormDataObservable, CustomFormDataObservable customFormDataObservable2, CustomFormDataObservable customFormDataObservable3, CustomFormDataObservable customFormDataObservable4, List list3, Long l, String str55, Long l2, Long l3, Integer num, String str56, String str57, String str58, String str59, boolean z5, String str60, String str61, String str62, boolean z6, AssignmentOutcome assignmentOutcome, String str63, boolean z7, boolean z8, Long l4, Long l5, FormFields formFields, boolean z9, String str64, String str65, String str66, String str67, Long l6, String str68, String str69, String str70, int i, int i2, int i3, int i4, id5 id5Var) {
        String str71 = (i & 1) != 0 ? "" : str;
        LeadsSummary leadsSummary2 = (i & 2) != 0 ? null : leadsSummary;
        LeadsUser leadsUser2 = (i & 4) != 0 ? null : leadsUser;
        String str72 = (i & 8) != 0 ? "" : str2;
        String str73 = (i & 16) != 0 ? "" : str3;
        String str74 = (i & 32) != 0 ? "" : str4;
        String str75 = (i & 64) != 0 ? "" : str5;
        String str76 = (i & 128) != 0 ? "" : str6;
        String str77 = (i & 256) != 0 ? "" : str7;
        String str78 = (i & 512) != 0 ? "" : str8;
        String str79 = (i & 1024) != 0 ? "" : str9;
        String str80 = (i & 2048) != 0 ? "" : str10;
        String str81 = (i & 4096) != 0 ? "" : str11;
        String str82 = (i & 8192) != 0 ? "" : str12;
        String str83 = (i & Opcodes.ACC_ENUM) != 0 ? null : str13;
        String str84 = (i & 32768) != 0 ? "" : str14;
        String str85 = (i & 65536) != 0 ? "" : str15;
        long j14 = (i & Opcodes.ACC_DEPRECATED) != 0 ? 0L : j;
        long j15 = (i & 262144) != 0 ? 0L : j2;
        long j16 = (i & Opcodes.ASM8) != 0 ? 0L : j3;
        long j17 = (i & 1048576) != 0 ? 0L : j4;
        String str86 = (i & 2097152) != 0 ? "" : str16;
        String str87 = (i & 4194304) != 0 ? "" : str17;
        String str88 = (i & 8388608) != 0 ? "" : str18;
        String str89 = (i & 16777216) != 0 ? "" : str19;
        String str90 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str20;
        String str91 = (i & 67108864) != 0 ? "" : str21;
        String str92 = (i & 134217728) != 0 ? "" : str22;
        double d5 = (i & 268435456) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d;
        double d6 = (i & 536870912) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d2;
        String str93 = (i & 1073741824) != 0 ? "" : str23;
        long j18 = (i & Integer.MIN_VALUE) != 0 ? -1L : j5;
        long j19 = (i2 & 1) != 0 ? -1L : j6;
        String str94 = (i2 & 2) != 0 ? "" : str24;
        String str95 = (i2 & 4) != 0 ? "" : str25;
        long j20 = (i2 & 8) != 0 ? -1L : j7;
        long j21 = (i2 & 16) != 0 ? -1L : j8;
        String str96 = (i2 & 32) != 0 ? "" : str26;
        String str97 = (i2 & 64) != 0 ? "" : str27;
        String str98 = str94;
        String str99 = (i2 & 128) != 0 ? "" : str28;
        String str100 = (i2 & 256) != 0 ? "" : str29;
        String str101 = (i2 & 512) != 0 ? "" : str30;
        long j22 = (i2 & 1024) != 0 ? -1L : j9;
        String str102 = (i2 & 2048) != 0 ? "" : str31;
        String str103 = (i2 & 4096) != 0 ? "" : str32;
        double d7 = (i2 & 8192) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d3;
        double d8 = (i2 & Opcodes.ACC_ENUM) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d4;
        long j23 = (i2 & 32768) != 0 ? -1L : j10;
        long j24 = (i2 & 65536) != 0 ? -1L : j11;
        String str104 = (i2 & Opcodes.ACC_DEPRECATED) != 0 ? "" : str33;
        String str105 = (i2 & 262144) != 0 ? "" : str34;
        long j25 = (i2 & Opcodes.ASM8) != 0 ? -1L : j12;
        long j26 = (i2 & 1048576) == 0 ? j13 : -1L;
        String str106 = (i2 & 2097152) != 0 ? "" : str35;
        String str107 = (i2 & 4194304) != 0 ? "" : str36;
        String str108 = (i2 & 8388608) != 0 ? "" : str37;
        String str109 = (i2 & 16777216) != 0 ? null : str38;
        String str110 = (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str39;
        String str111 = (i2 & 67108864) != 0 ? null : str40;
        boolean z10 = (i2 & 134217728) != 0 ? false : z;
        boolean z11 = (i2 & 268435456) != 0 ? false : z2;
        List arrayList3 = (i2 & 536870912) != 0 ? new ArrayList() : list;
        List arrayList4 = (i2 & 1073741824) != 0 ? new ArrayList() : list2;
        boolean z12 = (i2 & Integer.MIN_VALUE) != 0 ? false : z3;
        this(str71, leadsSummary2, leadsUser2, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, j14, j15, j16, j17, str86, str87, str88, str89, str90, str91, str92, d5, d6, str93, j18, j19, str98, str95, j20, j21, str96, str97, str99, str100, str101, j22, str102, str103, d7, d8, j23, j24, str104, str105, j25, j26, str106, str107, str108, str109, str110, str111, z10, z11, arrayList3, arrayList4, z12, (i3 & 1) != 0 ? false : z4, (i3 & 2) != 0 ? "" : str41, (i3 & 4) != 0 ? "" : str42, (i3 & 8) != 0 ? "" : str43, (i3 & 16) != 0 ? new ArrayList() : arrayList, (i3 & 32) != 0 ? new ArrayList() : arrayList2, (i3 & 64) != 0 ? ContactAssignmentStatus.ASSIGNED.name() : str44, (i3 & 128) != 0 ? null : str45, (i3 & 256) != 0 ? null : str46, (i3 & 512) != 0 ? null : str47, (i3 & 1024) != 0 ? null : ryhVar, (i3 & 2048) != 0 ? null : str48, (i3 & 4096) != 0 ? null : str49, (i3 & 8192) != 0 ? null : str50, (i3 & Opcodes.ACC_ENUM) != 0 ? null : str51, (i3 & 32768) != 0 ? null : str52, (i3 & 65536) != 0 ? null : str53, (i3 & Opcodes.ACC_DEPRECATED) != 0 ? null : str54, (i3 & 262144) != 0 ? null : customFormDataObservable, (i3 & Opcodes.ASM8) != 0 ? null : customFormDataObservable2, (i3 & 1048576) != 0 ? null : customFormDataObservable3, (i3 & 2097152) != 0 ? null : customFormDataObservable4, (i3 & 4194304) != 0 ? new ArrayList() : list3, (i3 & 8388608) != 0 ? null : l, (i3 & 16777216) != 0 ? null : str55, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : l2, (i3 & 67108864) != 0 ? null : l3, (i3 & 134217728) != 0 ? null : num, (i3 & 268435456) != 0 ? null : str56, (i3 & 536870912) != 0 ? null : str57, (i3 & 1073741824) != 0 ? "" : str58, (i3 & Integer.MIN_VALUE) != 0 ? null : str59, (i4 & 1) != 0 ? false : z5, (i4 & 2) != 0 ? null : str60, (i4 & 4) != 0 ? null : str61, (i4 & 8) != 0 ? null : str62, (i4 & 16) != 0 ? false : z6, (i4 & 32) != 0 ? null : assignmentOutcome, (i4 & 64) != 0 ? null : str63, (i4 & 128) != 0 ? false : z7, (i4 & 256) != 0 ? false : z8, (i4 & 512) != 0 ? null : l4, (i4 & 1024) != 0 ? null : l5, (i4 & 2048) != 0 ? null : formFields, (i4 & 4096) == 0 ? z9 : false, (i4 & 8192) != 0 ? null : str64, (i4 & Opcodes.ACC_ENUM) != 0 ? null : str65, (i4 & 32768) != 0 ? null : str66, (i4 & 65536) != 0 ? null : str67, (i4 & Opcodes.ACC_DEPRECATED) != 0 ? null : l6, (i4 & 262144) != 0 ? null : str68, (i4 & Opcodes.ASM8) != 0 ? null : str69, (i4 & 1048576) != 0 ? null : str70);
    }

    public Tasks(String str, LeadsSummary leadsSummary, LeadsUser leadsUser, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2, long j3, long j4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, double d, double d2, String str23, long j5, long j6, String str24, String str25, long j7, long j8, String str26, String str27, String str28, String str29, String str30, long j9, String str31, String str32, double d3, double d4, long j10, long j11, String str33, String str34, long j12, long j13, String str35, String str36, String str37, String str38, String str39, String str40, boolean z, boolean z2, List<CommentSummary> list, List<EngagementUpdateSummary> list2, boolean z3, boolean z4, String str41, String str42, String str43, ArrayList<FileData> arrayList, ArrayList<FileData> arrayList2, String str44, String str45, String str46, String str47, ryh ryhVar, String str48, String str49, String str50, String str51, String str52, String str53, String str54, CustomFormDataObservable customFormDataObservable, CustomFormDataObservable customFormDataObservable2, CustomFormDataObservable customFormDataObservable3, CustomFormDataObservable customFormDataObservable4, List<RecentAction> list3, Long l, String str55, Long l2, Long l3, Integer num, String str56, String str57, String str58, String str59, boolean z5, String str60, String str61, String str62, boolean z6, AssignmentOutcome assignmentOutcome, String str63, boolean z7, boolean z8, Long l4, Long l5, FormFields formFields, boolean z9, String str64, String str65, String str66, String str67, Long l6, String str68, String str69, String str70) {
        sq8.m48649h(str2, "clientName");
        sq8.m48649h(str3, "clientID");
        sq8.m48649h(str4, "clientDesignation");
        sq8.m48649h(str5, "clientContactNumber");
        sq8.m48649h(str6, "clientProfilePic");
        sq8.m48649h(str7, "clientCompany");
        sq8.m48649h(str8, "clientSecondaryTitle");
        sq8.m48649h(str9, "noteHeading");
        sq8.m48649h(str10, "noteNextStep");
        sq8.m48649h(str11, "noteAdditionMethod");
        sq8.m48649h(str12, "body");
        sq8.m48649h(str14, "taskTitle");
        sq8.m48649h(str15, "taskContent");
        sq8.m48649h(str16, "taskAssignedTo");
        sq8.m48649h(str17, "taskAssignedToID");
        sq8.m48649h(str18, "taskAssignedToProfilePic");
        sq8.m48649h(str19, "taskEngagementType");
        sq8.m48649h(str20, "taskPriority");
        sq8.m48649h(str21, "taskReminder");
        sq8.m48649h(str22, "taskLocation");
        sq8.m48649h(str23, "taskDate");
        sq8.m48649h(str24, "taskTag");
        sq8.m48649h(str25, "taskContactMode");
        sq8.m48649h(str26, "taskNextStep");
        sq8.m48649h(str27, "systemAction");
        sq8.m48649h(str28, "visitNotes");
        sq8.m48649h(str29, "visitOutcome");
        sq8.m48649h(str30, "visitOutcomeNature");
        sq8.m48649h(str31, "visitNextStep");
        sq8.m48649h(str32, "visitLocation");
        sq8.m48649h(str33, "callDirection");
        sq8.m48649h(str34, "callConnectionStatus");
        sq8.m48649h(str35, "callOutcome");
        sq8.m48649h(str36, "callOutcomeNature");
        sq8.m48649h(str37, "callNextStep");
        sq8.m48649h(str39, "callInputNotes");
        sq8.m48649h(list, "comments");
        sq8.m48649h(list2, "engagementUpdates");
        sq8.m48649h(str41, "taskStatus");
        sq8.m48649h(str42, "taskCompletionNote");
        sq8.m48649h(str43, "taskCompletionType");
        sq8.m48649h(arrayList, "fileList");
        sq8.m48649h(arrayList2, "oldFileList");
        sq8.m48649h(list3, "taskEngagementActions");
        sq8.m48649h(str58, "videoCallMetadata");
        this.id = str;
        this.client = leadsSummary;
        this.taskOwner = leadsUser;
        this.clientName = str2;
        this.clientID = str3;
        this.clientDesignation = str4;
        this.clientContactNumber = str5;
        this.clientProfilePic = str6;
        this.clientCompany = str7;
        this.clientSecondaryTitle = str8;
        this.noteHeading = str9;
        this.noteNextStep = str10;
        this.noteAdditionMethod = str11;
        this.body = str12;
        this.parentEngagementId = str13;
        this.taskTitle = str14;
        this.taskContent = str15;
        this.taskTimeInMillis = j;
        this.nextTaskTimeInMillis = j2;
        this.taskDateTimeInMillis = j3;
        this.nextTaskDateTimeInMillis = j4;
        this.taskAssignedTo = str16;
        this.taskAssignedToID = str17;
        this.taskAssignedToProfilePic = str18;
        this.taskEngagementType = str19;
        this.taskPriority = str20;
        this.taskReminder = str21;
        this.taskLocation = str22;
        this.taskLat = d;
        this.taskLng = d2;
        this.taskDate = str23;
        this.taskDateInMillis = j5;
        this.nextTaskDateInMillis = j6;
        this.taskTag = str24;
        this.taskContactMode = str25;
        this.taskReminderTimeInMillis = j7;
        this.taskCompletionTime = j8;
        this.taskNextStep = str26;
        this.systemAction = str27;
        this.visitNotes = str28;
        this.visitOutcome = str29;
        this.visitOutcomeNature = str30;
        this.visitDateInMillis = j9;
        this.visitNextStep = str31;
        this.visitLocation = str32;
        this.visitLat = d3;
        this.visitLng = d4;
        this.callTimeInMillis = j10;
        this.callDurationInMillis = j11;
        this.callDirection = str33;
        this.callConnectionStatus = str34;
        this.callStartTime = j12;
        this.callEndTime = j13;
        this.callOutcome = str35;
        this.callOutcomeNature = str36;
        this.callNextStep = str37;
        this.nextStepId = str38;
        this.callInputNotes = str39;
        this.callRecordingUrl = str40;
        this.isSelected = z;
        this.showSelection = z2;
        this.comments = list;
        this.engagementUpdates = list2;
        this.isExpired = z3;
        this.showBottomView = z4;
        this.taskStatus = str41;
        this.taskCompletionNote = str42;
        this.taskCompletionType = str43;
        this.fileList = arrayList;
        this.oldFileList = arrayList2;
        this.assignmentStatus = str44;
        this.primaryTeamId = str45;
        this.engagementSource = str46;
        this.engagementSourceType = str47;
        this.activityLocation = ryhVar;
        this.callPlacementId = str48;
        this.customTaskCompletionData = str49;
        this.customCallOutcomeData = str50;
        this.customVisitOutcomeData = str51;
        this.customTaskInputData = str52;
        this.customNextStepTaskInputData = str53;
        this.customVideoCallInputData = str54;
        this.customTaskCompletionDataObservable = customFormDataObservable;
        this.customCallOutcomeDataObservable = customFormDataObservable2;
        this.customVisitOutcomeDataObservable = customFormDataObservable3;
        this.customVideoCallInputObservable = customFormDataObservable4;
        this.taskEngagementActions = list3;
        this.nextFollowUpOn = l;
        this.nextFollowUpSetBy = str55;
        this.taskEngagementActionsUpdatedAt = l2;
        this.firstTaskEngagementActionOn = l3;
        this.taskEngagementActionCount = num;
        this.videoCallPlatform = str56;
        this.videoCallLink = str57;
        this.videoCallMetadata = str58;
        this.videoCallOutcome = str59;
        this.showBottom = z5;
        this.phoneLocalCallRecordingFile = str60;
        this.phoneLocalCallRecordingUri = str61;
        this.phoneLocalContactName = str62;
        this.transferLead = z6;
        this.assignmentOutcome = assignmentOutcome;
        this.engagementSourceLevelTwo = str63;
        this.createNewDeal = z7;
        this.taskTypeInputSelector = z8;
        this.updatedAt = l4;
        this.createdAt = l5;
        this.customFormFields = formFields;
        this.inFlightCall = z9;
        this.userNumber = str64;
        this.deviceId = str65;
        this.cloudProvider = str66;
        this.cloudProviderNumber = str67;
        this.totalCallDuration = l6;
        this.callType = str68;
        this.hangupReason = str69;
        this.phoneCallLogId = str70;
    }
}
