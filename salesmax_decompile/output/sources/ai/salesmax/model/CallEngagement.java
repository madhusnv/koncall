package ai.salesmax.model;

import ai.salesmax.services.model.CloudTelephonyCall;
import android.net.Uri;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.objectweb.asm.Opcodes;
import p001o.h96;
import p001o.id5;
import p001o.rz1;
import p001o.sq8;
import p001o.ta6;
import type.CallDirection;

/* loaded from: classes.dex */
public final class CallEngagement {
    private String androidDeviceId;
    private Long callConnectTime;
    private String callConnectionStatus;
    private String callDirection;
    private Long callDuration;
    private Long callEndTime;
    private rz1 callRecording;
    private Long callStartTime;
    private String callStatus;
    private Long callTimeInMillis;
    private String callType;
    private String clientCompany;
    private String clientContactNumber;
    private String clientDesignation;
    private String clientID;
    private String clientName;
    private String clientProfilePic;
    private String cloudProvider;
    private String cloudProviderNumber;
    private boolean duplicate;
    private ta6 engagementOutcome;
    private String engagementSource;
    private String engagementSourceLevelTwo;
    private String engagementSourceType;
    private String engagementType;
    private String hangupReason;
    private String id;
    private boolean inFlightCall;
    private boolean mapping;
    private boolean persisted;
    private String phoneCallLogId;
    private String phoneHandleId;
    private String primaryTeamId;
    private boolean recording;
    private String status;
    private Long totalCallDuration;
    private String uploadedFile;
    private String userNumber;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final CallEngagement from(Tasks tasks) {
            sq8.m48649h(tasks, "task");
            String id = tasks.getId();
            if (id == null) {
                id = "";
            }
            String clientID = tasks.getClientID();
            String clientName = tasks.getClientName();
            String clientCompany = tasks.getClientCompany();
            String clientProfilePic = tasks.getClientProfilePic();
            String clientDesignation = tasks.getClientDesignation();
            String primaryTeamId = tasks.getPrimaryTeamId();
            String clientContactNumber = tasks.getClientContactNumber();
            long callTimeInMillis = tasks.getCallTimeInMillis();
            long callStartTime = tasks.getCallStartTime();
            long callEndTime = tasks.getCallEndTime();
            long callDurationInMillis = tasks.getCallDurationInMillis();
            String callDirection = tasks.getCallDirection();
            String callConnectionStatus = tasks.getCallConnectionStatus();
            String taskEngagementType = tasks.getTaskEngagementType();
            String taskStatus = tasks.getTaskStatus();
            String engagementSourceType = tasks.getEngagementSourceType();
            String engagementSource = tasks.getEngagementSource();
            String engagementSourceLevelTwo = tasks.getEngagementSourceLevelTwo();
            boolean inFlightCall = tasks.getInFlightCall();
            return new CallEngagement(id, clientID, clientName, clientCompany, clientProfilePic, clientDesignation, primaryTeamId, clientContactNumber, tasks.getUserNumber(), Long.valueOf(callTimeInMillis), Long.valueOf(callStartTime), Long.valueOf(callEndTime), Long.valueOf(callDurationInMillis), callDirection, callConnectionStatus, taskEngagementType, taskStatus, engagementSourceType, engagementSource, engagementSourceLevelTwo, 0L, null, inFlightCall, tasks.getDeviceId(), null, false, false, null, false, tasks.getCloudProvider(), tasks.getCloudProviderNumber(), tasks.getTotalCallDuration(), tasks.getCallType(), tasks.getHangupReason(), tasks.getPhoneCallLogId(), null, null, false, 522190848, 56, null);
        }
    }

    public CallEngagement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l5, rz1 rz1Var, boolean z, String str17, String str18, boolean z2, boolean z3, String str19, boolean z4, String str20, String str21, Long l6, String str22, String str23, String str24, ta6 ta6Var, String str25, boolean z5) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.id = str;
        this.clientID = str2;
        this.clientName = str3;
        this.clientCompany = str4;
        this.clientProfilePic = str5;
        this.clientDesignation = str6;
        this.primaryTeamId = str7;
        this.clientContactNumber = str8;
        this.userNumber = str9;
        this.callTimeInMillis = l;
        this.callStartTime = l2;
        this.callEndTime = l3;
        this.callDuration = l4;
        this.callDirection = str10;
        this.callConnectionStatus = str11;
        this.engagementType = str12;
        this.status = str13;
        this.engagementSourceType = str14;
        this.engagementSource = str15;
        this.engagementSourceLevelTwo = str16;
        this.callConnectTime = l5;
        this.callRecording = rz1Var;
        this.inFlightCall = z;
        this.androidDeviceId = str17;
        this.callStatus = str18;
        this.persisted = z2;
        this.recording = z3;
        this.uploadedFile = str19;
        this.mapping = z4;
        this.cloudProvider = str20;
        this.cloudProviderNumber = str21;
        this.totalCallDuration = l6;
        this.callType = str22;
        this.hangupReason = str23;
        this.phoneCallLogId = str24;
        this.engagementOutcome = ta6Var;
        this.phoneHandleId = str25;
        this.duplicate = z5;
    }

    public final String component1() {
        return this.id;
    }

    public final Long component10() {
        return this.callTimeInMillis;
    }

    public final Long component11() {
        return this.callStartTime;
    }

    public final Long component12() {
        return this.callEndTime;
    }

    public final Long component13() {
        return this.callDuration;
    }

    public final String component14() {
        return this.callDirection;
    }

    public final String component15() {
        return this.callConnectionStatus;
    }

    public final String component16() {
        return this.engagementType;
    }

    public final String component17() {
        return this.status;
    }

    public final String component18() {
        return this.engagementSourceType;
    }

    public final String component19() {
        return this.engagementSource;
    }

    public final String component2() {
        return this.clientID;
    }

    public final String component20() {
        return this.engagementSourceLevelTwo;
    }

    public final Long component21() {
        return this.callConnectTime;
    }

    public final rz1 component22() {
        return this.callRecording;
    }

    public final boolean component23() {
        return this.inFlightCall;
    }

    public final String component24() {
        return this.androidDeviceId;
    }

    public final String component25() {
        return this.callStatus;
    }

    public final boolean component26() {
        return this.persisted;
    }

    public final boolean component27() {
        return this.recording;
    }

    public final String component28() {
        return this.uploadedFile;
    }

    public final boolean component29() {
        return this.mapping;
    }

    public final String component3() {
        return this.clientName;
    }

    public final String component30() {
        return this.cloudProvider;
    }

    public final String component31() {
        return this.cloudProviderNumber;
    }

    public final Long component32() {
        return this.totalCallDuration;
    }

    public final String component33() {
        return this.callType;
    }

    public final String component34() {
        return this.hangupReason;
    }

    public final String component35() {
        return this.phoneCallLogId;
    }

    public final ta6 component36() {
        return this.engagementOutcome;
    }

    public final String component37() {
        return this.phoneHandleId;
    }

    public final boolean component38() {
        return this.duplicate;
    }

    public final String component4() {
        return this.clientCompany;
    }

    public final String component5() {
        return this.clientProfilePic;
    }

    public final String component6() {
        return this.clientDesignation;
    }

    public final String component7() {
        return this.primaryTeamId;
    }

    public final String component8() {
        return this.clientContactNumber;
    }

    public final String component9() {
        return this.userNumber;
    }

    public final CallEngagement copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l5, rz1 rz1Var, boolean z, String str17, String str18, boolean z2, boolean z3, String str19, boolean z4, String str20, String str21, Long l6, String str22, String str23, String str24, ta6 ta6Var, String str25, boolean z5) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return new CallEngagement(str, str2, str3, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, str10, str11, str12, str13, str14, str15, str16, l5, rz1Var, z, str17, str18, z2, z3, str19, z4, str20, str21, l6, str22, str23, str24, ta6Var, str25, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallEngagement)) {
            return false;
        }
        CallEngagement callEngagement = (CallEngagement) obj;
        return sq8.m48644c(this.id, callEngagement.id) && sq8.m48644c(this.clientID, callEngagement.clientID) && sq8.m48644c(this.clientName, callEngagement.clientName) && sq8.m48644c(this.clientCompany, callEngagement.clientCompany) && sq8.m48644c(this.clientProfilePic, callEngagement.clientProfilePic) && sq8.m48644c(this.clientDesignation, callEngagement.clientDesignation) && sq8.m48644c(this.primaryTeamId, callEngagement.primaryTeamId) && sq8.m48644c(this.clientContactNumber, callEngagement.clientContactNumber) && sq8.m48644c(this.userNumber, callEngagement.userNumber) && sq8.m48644c(this.callTimeInMillis, callEngagement.callTimeInMillis) && sq8.m48644c(this.callStartTime, callEngagement.callStartTime) && sq8.m48644c(this.callEndTime, callEngagement.callEndTime) && sq8.m48644c(this.callDuration, callEngagement.callDuration) && sq8.m48644c(this.callDirection, callEngagement.callDirection) && sq8.m48644c(this.callConnectionStatus, callEngagement.callConnectionStatus) && sq8.m48644c(this.engagementType, callEngagement.engagementType) && sq8.m48644c(this.status, callEngagement.status) && sq8.m48644c(this.engagementSourceType, callEngagement.engagementSourceType) && sq8.m48644c(this.engagementSource, callEngagement.engagementSource) && sq8.m48644c(this.engagementSourceLevelTwo, callEngagement.engagementSourceLevelTwo) && sq8.m48644c(this.callConnectTime, callEngagement.callConnectTime) && sq8.m48644c(this.callRecording, callEngagement.callRecording) && this.inFlightCall == callEngagement.inFlightCall && sq8.m48644c(this.androidDeviceId, callEngagement.androidDeviceId) && sq8.m48644c(this.callStatus, callEngagement.callStatus) && this.persisted == callEngagement.persisted && this.recording == callEngagement.recording && sq8.m48644c(this.uploadedFile, callEngagement.uploadedFile) && this.mapping == callEngagement.mapping && sq8.m48644c(this.cloudProvider, callEngagement.cloudProvider) && sq8.m48644c(this.cloudProviderNumber, callEngagement.cloudProviderNumber) && sq8.m48644c(this.totalCallDuration, callEngagement.totalCallDuration) && sq8.m48644c(this.callType, callEngagement.callType) && sq8.m48644c(this.hangupReason, callEngagement.hangupReason) && sq8.m48644c(this.phoneCallLogId, callEngagement.phoneCallLogId) && sq8.m48644c(this.engagementOutcome, callEngagement.engagementOutcome) && sq8.m48644c(this.phoneHandleId, callEngagement.phoneHandleId) && this.duplicate == callEngagement.duplicate;
    }

    public final String getAndroidDeviceId() {
        return this.androidDeviceId;
    }

    public final Long getCallConnectTime() {
        return this.callConnectTime;
    }

    public final String getCallConnectionStatus() {
        return this.callConnectionStatus;
    }

    public final String getCallDirection() {
        return this.callDirection;
    }

    public final Long getCallDuration() {
        return this.callDuration;
    }

    public final Long getCallEndTime() {
        return this.callEndTime;
    }

    public final rz1 getCallRecording() {
        return this.callRecording;
    }

    public final Long getCallStartTime() {
        return this.callStartTime;
    }

    public final String getCallStatus() {
        return this.callStatus;
    }

    public final Long getCallTimeInMillis() {
        return this.callTimeInMillis;
    }

    public final String getCallType() {
        return this.callType;
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

    public final String getCloudProvider() {
        return this.cloudProvider;
    }

    public final String getCloudProviderNumber() {
        return this.cloudProviderNumber;
    }

    public final boolean getDuplicate() {
        return this.duplicate;
    }

    public final ta6 getEngagementOutcome() {
        return this.engagementOutcome;
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

    public final String getEngagementType() {
        return this.engagementType;
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

    public final boolean getMapping() {
        return this.mapping;
    }

    public final boolean getPersisted() {
        return this.persisted;
    }

    public final String getPhoneCallLogId() {
        return this.phoneCallLogId;
    }

    public final String getPhoneHandleId() {
        return this.phoneHandleId;
    }

    public final String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public final boolean getRecording() {
        return this.recording;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Long getTotalCallDuration() {
        return this.totalCallDuration;
    }

    public final String getUploadedFile() {
        return this.uploadedFile;
    }

    public final String getUserNumber() {
        return this.userNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.clientID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientCompany;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientProfilePic;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clientDesignation;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.primaryTeamId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.clientContactNumber;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userNumber;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.callTimeInMillis;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.callStartTime;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.callEndTime;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.callDuration;
        int iHashCode13 = (iHashCode12 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.callDirection;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.callConnectionStatus;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.engagementType;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.status;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.engagementSourceType;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.engagementSource;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.engagementSourceLevelTwo;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l5 = this.callConnectTime;
        int iHashCode21 = (iHashCode20 + (l5 == null ? 0 : l5.hashCode())) * 31;
        rz1 rz1Var = this.callRecording;
        int iHashCode22 = (iHashCode21 + (rz1Var == null ? 0 : rz1Var.hashCode())) * 31;
        boolean z = this.inFlightCall;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode22 + i) * 31;
        String str16 = this.androidDeviceId;
        int iHashCode23 = (i2 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.callStatus;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        boolean z2 = this.persisted;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode24 + i3) * 31;
        boolean z3 = this.recording;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        String str18 = this.uploadedFile;
        int iHashCode25 = (i6 + (str18 == null ? 0 : str18.hashCode())) * 31;
        boolean z4 = this.mapping;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (iHashCode25 + i7) * 31;
        String str19 = this.cloudProvider;
        int iHashCode26 = (i8 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.cloudProviderNumber;
        int iHashCode27 = (iHashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Long l6 = this.totalCallDuration;
        int iHashCode28 = (iHashCode27 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str21 = this.callType;
        int iHashCode29 = (iHashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.hangupReason;
        int iHashCode30 = (iHashCode29 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.phoneCallLogId;
        int iHashCode31 = (iHashCode30 + (str23 == null ? 0 : str23.hashCode())) * 31;
        ta6 ta6Var = this.engagementOutcome;
        int iHashCode32 = (iHashCode31 + (ta6Var == null ? 0 : ta6Var.hashCode())) * 31;
        String str24 = this.phoneHandleId;
        int iHashCode33 = (iHashCode32 + (str24 != null ? str24.hashCode() : 0)) * 31;
        boolean z5 = this.duplicate;
        return iHashCode33 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final void setAndroidDeviceId(String str) {
        this.androidDeviceId = str;
    }

    public final void setCallConnectTime(Long l) {
        this.callConnectTime = l;
    }

    public final void setCallConnectionStatus(String str) {
        this.callConnectionStatus = str;
    }

    public final void setCallDirection(String str) {
        this.callDirection = str;
    }

    public final void setCallDuration(Long l) {
        this.callDuration = l;
    }

    public final void setCallEndTime(Long l) {
        this.callEndTime = l;
    }

    public final void setCallRecording(rz1 rz1Var) {
        this.callRecording = rz1Var;
    }

    public final void setCallStartTime(Long l) {
        this.callStartTime = l;
    }

    public final void setCallStatus(String str) {
        this.callStatus = str;
    }

    public final void setCallTimeInMillis(Long l) {
        this.callTimeInMillis = l;
    }

    public final void setCallType(String str) {
        this.callType = str;
    }

    public final void setClientCompany(String str) {
        this.clientCompany = str;
    }

    public final void setClientContactNumber(String str) {
        this.clientContactNumber = str;
    }

    public final void setClientDesignation(String str) {
        this.clientDesignation = str;
    }

    public final void setClientID(String str) {
        this.clientID = str;
    }

    public final void setClientName(String str) {
        this.clientName = str;
    }

    public final void setClientProfilePic(String str) {
        this.clientProfilePic = str;
    }

    public final void setCloudProvider(String str) {
        this.cloudProvider = str;
    }

    public final void setCloudProviderNumber(String str) {
        this.cloudProviderNumber = str;
    }

    public final void setDuplicate(boolean z) {
        this.duplicate = z;
    }

    public final void setEngagementOutcome(ta6 ta6Var) {
        this.engagementOutcome = ta6Var;
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

    public final void setEngagementType(String str) {
        this.engagementType = str;
    }

    public final void setHangupReason(String str) {
        this.hangupReason = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setInFlightCall(boolean z) {
        this.inFlightCall = z;
    }

    public final void setMapping(boolean z) {
        this.mapping = z;
    }

    public final void setPersisted(boolean z) {
        this.persisted = z;
    }

    public final void setPhoneCallLogId(String str) {
        this.phoneCallLogId = str;
    }

    public final void setPhoneHandleId(String str) {
        this.phoneHandleId = str;
    }

    public final void setPrimaryTeamId(String str) {
        this.primaryTeamId = str;
    }

    public final void setRecording(boolean z) {
        this.recording = z;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTotalCallDuration(Long l) {
        this.totalCallDuration = l;
    }

    public final void setUploadedFile(String str) {
        this.uploadedFile = str;
    }

    public final void setUserNumber(String str) {
        this.userNumber = str;
    }

    public final CloudTelephonyCall toCloudTelephonyCall() {
        CloudTelephonyCall cloudTelephonyCall = new CloudTelephonyCall();
        cloudTelephonyCall.setCallId(this.engagementSourceLevelTwo);
        String str = this.callDirection;
        CallDirection callDirectionValueOf = null;
        if (str != null) {
            if (!(sq8.m48644c(str, CallDirection.INCOMING.name()) || sq8.m48644c(str, CallDirection.OUTGOING.name()))) {
                str = null;
            }
            if (str != null) {
                callDirectionValueOf = CallDirection.valueOf(str);
            }
        }
        cloudTelephonyCall.setCallDirection(callDirectionValueOf);
        cloudTelephonyCall.setCustomerPhoneNumber(this.clientContactNumber);
        cloudTelephonyCall.setAgentPhoneNuber(this.userNumber);
        cloudTelephonyCall.setProvider(this.cloudProvider);
        cloudTelephonyCall.setDeskphone(this.cloudProviderNumber);
        return cloudTelephonyCall;
    }

    public final h96 toEngagement() {
        Uri uriM47311i;
        String str = this.id;
        String str2 = this.clientID;
        String str3 = this.clientName;
        String str4 = this.clientCompany;
        String str5 = this.clientProfilePic;
        String str6 = this.clientDesignation;
        String str7 = this.primaryTeamId;
        String str8 = this.clientContactNumber;
        String str9 = this.userNumber;
        Long l = this.callTimeInMillis;
        Long l2 = this.callStartTime;
        Long l3 = this.callEndTime;
        Long l4 = this.callDuration;
        String str10 = this.callDirection;
        String str11 = this.callConnectionStatus;
        String str12 = this.engagementType;
        String str13 = this.status;
        String str14 = this.engagementSourceType;
        String str15 = this.engagementSource;
        String str16 = this.engagementSourceLevelTwo;
        Long l5 = this.callConnectTime;
        boolean z = this.inFlightCall;
        String str17 = this.androidDeviceId;
        Boolean boolValueOf = Boolean.valueOf(this.persisted);
        Boolean boolValueOf2 = Boolean.valueOf(this.recording);
        Boolean boolValueOf3 = Boolean.valueOf(this.mapping);
        String str18 = this.uploadedFile;
        rz1 rz1Var = this.callRecording;
        String strM47308f = rz1Var != null ? rz1Var.m47308f() : null;
        rz1 rz1Var2 = this.callRecording;
        String string = (rz1Var2 == null || (uriM47311i = rz1Var2.m47311i()) == null) ? null : uriM47311i.toString();
        rz1 rz1Var3 = this.callRecording;
        String strM47306d = rz1Var3 != null ? rz1Var3.m47306d() : null;
        rz1 rz1Var4 = this.callRecording;
        String strM47307e = rz1Var4 != null ? rz1Var4.m47307e() : null;
        rz1 rz1Var5 = this.callRecording;
        String strM47309g = rz1Var5 != null ? rz1Var5.m47309g() : null;
        rz1 rz1Var6 = this.callRecording;
        return new h96(str, str2, str3, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, str10, str11, str12, str13, str14, str15, str16, l5, z, str17, boolValueOf, boolValueOf2, boolValueOf3, str18, strM47308f, string, strM47306d, strM47307e, strM47309g, rz1Var6 != null ? rz1Var6.m47304b() : null, null, this.cloudProvider, this.cloudProviderNumber, this.totalCallDuration, this.callType, this.hangupReason, this.phoneCallLogId, 0, 2, null);
    }

    public String toString() {
        return "CallEngagement(id=" + this.id + ", clientID=" + this.clientID + ", clientName=" + this.clientName + ", clientCompany=" + this.clientCompany + ", clientProfilePic=" + this.clientProfilePic + ", clientDesignation=" + this.clientDesignation + ", primaryTeamId=" + this.primaryTeamId + ", clientContactNumber=" + this.clientContactNumber + ", userNumber=" + this.userNumber + ", callTimeInMillis=" + this.callTimeInMillis + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", callDuration=" + this.callDuration + ", callDirection=" + this.callDirection + ", callConnectionStatus=" + this.callConnectionStatus + ", engagementType=" + this.engagementType + ", status=" + this.status + ", engagementSourceType=" + this.engagementSourceType + ", engagementSource=" + this.engagementSource + ", engagementSourceLevelTwo=" + this.engagementSourceLevelTwo + ", callConnectTime=" + this.callConnectTime + ", callRecording=" + this.callRecording + ", inFlightCall=" + this.inFlightCall + ", androidDeviceId=" + this.androidDeviceId + ", callStatus=" + this.callStatus + ", persisted=" + this.persisted + ", recording=" + this.recording + ", uploadedFile=" + this.uploadedFile + ", mapping=" + this.mapping + ", cloudProvider=" + this.cloudProvider + ", cloudProviderNumber=" + this.cloudProviderNumber + ", totalCallDuration=" + this.totalCallDuration + ", callType=" + this.callType + ", hangupReason=" + this.hangupReason + ", phoneCallLogId=" + this.phoneCallLogId + ", engagementOutcome=" + this.engagementOutcome + ", phoneHandleId=" + this.phoneHandleId + ", duplicate=" + this.duplicate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tasks toTasks() {
        AssignmentOutcome assignmentOutcome;
        String strM49634i;
        String strM49635j;
        String strM49637l;
        String strM49636k;
        String str = this.id;
        String str2 = this.clientID;
        String str3 = str2 == null ? "" : str2;
        String str4 = this.clientName;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.clientCompany;
        String str7 = str6 == null ? "" : str6;
        String str8 = this.clientProfilePic;
        String str9 = str8 == null ? "" : str8;
        String str10 = this.clientDesignation;
        String str11 = str10 == null ? "" : str10;
        String str12 = this.primaryTeamId;
        String str13 = str12 == null ? "" : str12;
        String str14 = this.clientContactNumber;
        String str15 = str14 == null ? "" : str14;
        Long l = this.callTimeInMillis;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = this.callStartTime;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = this.callEndTime;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        Long l4 = this.callDuration;
        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
        String str16 = this.callDirection;
        String str17 = str16 == null ? "" : str16;
        String str18 = this.callConnectionStatus;
        String str19 = str18 == null ? "" : str18;
        String str20 = this.engagementType;
        String str21 = str20 == null ? "" : str20;
        String str22 = this.status;
        String str23 = str22 == null ? "" : str22;
        String str24 = this.engagementSourceType;
        String str25 = str24 == null ? "" : str24;
        String str26 = this.engagementSource;
        String str27 = str26 == null ? "" : str26;
        String str28 = this.engagementSourceLevelTwo;
        String str29 = str28 == null ? "" : str28;
        boolean z = this.inFlightCall;
        String str30 = this.userNumber;
        String str31 = this.androidDeviceId;
        ta6 ta6Var = this.engagementOutcome;
        String str32 = (ta6Var == null || (strM49636k = ta6Var.m49636k()) == null) ? "" : strM49636k;
        ta6 ta6Var2 = this.engagementOutcome;
        String str33 = (ta6Var2 == null || (strM49637l = ta6Var2.m49637l()) == null) ? "" : strM49637l;
        ta6 ta6Var3 = this.engagementOutcome;
        String str34 = (ta6Var3 == null || (strM49635j = ta6Var3.m49635j()) == null) ? "" : strM49635j;
        ta6 ta6Var4 = this.engagementOutcome;
        String str35 = (ta6Var4 == null || (strM49634i = ta6Var4.m49634i()) == null) ? "" : strM49634i;
        ta6 ta6Var5 = this.engagementOutcome;
        String strM49638m = ta6Var5 != null ? ta6Var5.m49638m() : null;
        ta6 ta6Var6 = this.engagementOutcome;
        Long lM49641p = ta6Var6 != null ? ta6Var6.m49641p() : null;
        ta6 ta6Var7 = this.engagementOutcome;
        String strM49642q = ta6Var7 != null ? ta6Var7.m49642q() : null;
        ta6 ta6Var8 = this.engagementOutcome;
        long jM49643r = ta6Var8 != null ? ta6Var8.m49643r() : 0L;
        ta6 ta6Var9 = this.engagementOutcome;
        boolean zM49646u = ta6Var9 != null ? ta6Var9.m49646u() : false;
        String str36 = this.cloudProvider;
        String str37 = this.cloudProviderNumber;
        Long l5 = this.totalCallDuration;
        String str38 = this.callType;
        String str39 = this.hangupReason;
        String str40 = this.phoneCallLogId;
        ta6 ta6Var10 = this.engagementOutcome;
        if (ta6Var10 == null) {
            assignmentOutcome = null;
        } else {
            if (!ta6Var10.m49632g()) {
                ta6Var10 = null;
            }
            if (ta6Var10 != null) {
                assignmentOutcome = new AssignmentOutcome(ta6Var10.m49633h(), ta6Var10.m49631f(), ta6Var10.m49630e(), ta6Var10.m49629d(), ta6Var10.m49628c(), ta6Var10.m49627b(), ta6Var10.m49626a(), ta6Var10.m49646u());
            }
        }
        return new Tasks(str, null, null, str5, str3, str11, str15, str9, str7, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0L, 0L, 0L, jM49643r, null, null, null, str21, null, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, 0L, 0L, null, null, 0L, 0L, null, null, null, null, null, 0L, null, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, jLongValue, jLongValue4, str17, str19, jLongValue2, jLongValue3, str32, str33, str34, null, str35, null, false, false, null, null, false, false, str23, null, null, null, null, null, str13, str27, str25, null, null, null, strM49638m, null, null, null, null, null, null, null, null, null, lM49641p, strM49642q, null, null, null, null, null, null, null, false, null, null, null, zM49646u, assignmentOutcome, str29, false, false, null, null, null, z, str30, str31, str36, str37, l5, str38, str39, str40, -17826298, -50298881, -25174915, 3983, null);
    }

    public /* synthetic */ CallEngagement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l5, rz1 rz1Var, boolean z, String str17, String str18, boolean z2, boolean z3, String str19, boolean z4, String str20, String str21, Long l6, String str22, String str23, String str24, ta6 ta6Var, String str25, boolean z5, int i, int i2, id5 id5Var) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, str10, str11, str12, str13, (i & Opcodes.ACC_DEPRECATED) != 0 ? null : str14, str15, str16, l5, (i & 2097152) != 0 ? null : rz1Var, (i & 4194304) != 0 ? false : z, (i & 8388608) != 0 ? null : str17, (i & 16777216) != 0 ? null : str18, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z2, (i & 67108864) != 0 ? false : z3, (i & 134217728) != 0 ? null : str19, (i & 268435456) != 0 ? false : z4, (i & 536870912) != 0 ? null : str20, (i & 1073741824) != 0 ? null : str21, (i & Integer.MIN_VALUE) != 0 ? null : l6, (i2 & 1) != 0 ? null : str22, (i2 & 2) != 0 ? null : str23, (i2 & 4) != 0 ? null : str24, (i2 & 8) != 0 ? null : ta6Var, (i2 & 16) != 0 ? null : str25, (i2 & 32) != 0 ? false : z5);
    }
}
