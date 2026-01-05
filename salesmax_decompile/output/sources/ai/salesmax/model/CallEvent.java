package ai.salesmax.model;

import android.content.Context;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import java.util.UUID;
import p001o.cv1;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class CallEvent {
    public static final int $stable = 8;
    private final CallConnectStatus callConnectStatus;
    private final Long callConnectTime;
    private final Long callEndTime;
    private final String callId;
    private final Long callStartTime;
    private final String callStatus;
    private String callType;
    private String cloudProvider;
    private String cloudProviderNumber;
    private final Context context;
    private final String direction;
    private final Long duration;
    private String hangupReason;
    private CallEngagement inFlightCall;
    private final Boolean isConnectedCall;
    private final String name;
    private final String number;
    private String phone;
    private String phoneCallLogId;
    private final PhoneHandle phoneHandle;
    private final String source;
    private final Integer subscriptionId;
    private Long totalCallDuration;

    public static final class Builder {
        public static final int $stable = 8;
        private CallConnectStatus callConnectStatus;
        private Long callConnectTime;
        private Long callEndTime;
        private String callId;
        private Long callStartTime;
        private String callStatus;
        private String callType;
        private String cloudProvider;
        private String cloudProviderNumber;
        private Context context;
        private String direction;
        private Long duration;
        private String hangupReason;
        private CallEngagement inFlightCall;
        private Boolean isConnectedCall;
        private String name;
        private String number;
        private String phone;
        private String phoneCallLogId;
        private PhoneHandle phoneHandle;
        private String source;
        private Integer subscriptionId;
        private Long totalCallDuration;

        public final CallEvent build() {
            return new CallEvent(this.number, this.phone, this.direction, this.callStartTime, this.name, this.callId, this.source, this.duration, this.callEndTime, this.callConnectTime, this.callConnectStatus, this.subscriptionId, this.isConnectedCall, this.context, this.inFlightCall, this.phoneHandle, this.callStatus, this.cloudProvider, this.cloudProviderNumber, this.totalCallDuration, this.callType, this.hangupReason, this.phoneCallLogId, null);
        }

        public final Builder callConnectStatus(CallConnectStatus callConnectStatus) {
            this.callConnectStatus = callConnectStatus;
            return this;
        }

        public final Builder callConnectTime(Long l) {
            this.callConnectTime = l;
            return this;
        }

        public final Builder callEndTime(Long l) {
            this.callEndTime = l;
            return this;
        }

        public final Builder callId(String str) {
            this.callId = str;
            return this;
        }

        public final Builder callStartTime(Long l) {
            this.callStartTime = l;
            return this;
        }

        public final Builder callStatus(String str) {
            this.callStatus = str;
            return this;
        }

        public final Builder callType(String str) {
            this.callType = str;
            return this;
        }

        public final Builder cloudProvider(String str) {
            this.cloudProvider = str;
            return this;
        }

        public final Builder cloudProviderNumber(String str) {
            this.cloudProviderNumber = str;
            return this;
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder direction(String str) {
            this.direction = str;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder hangupReason(String str) {
            this.hangupReason = str;
            return this;
        }

        public final Builder inFlightCall(CallEngagement callEngagement) {
            this.inFlightCall = callEngagement;
            return this;
        }

        public final Builder isConnectedCall(Boolean bool) {
            this.isConnectedCall = bool;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder number(String str) {
            this.number = str;
            return this;
        }

        public final Builder phone(String str) {
            this.phone = str;
            return this;
        }

        public final Builder phoneCallLogId(String str) {
            this.phoneCallLogId = str;
            return this;
        }

        public final Builder phoneHandle(PhoneHandle phoneHandle) {
            this.phoneHandle = phoneHandle;
            return this;
        }

        public final Builder source(String str) {
            this.source = str;
            return this;
        }

        public final Builder subscriptionId(Integer num) {
            this.subscriptionId = num;
            return this;
        }

        public final Builder totalCallDuration(Long l) {
            this.totalCallDuration = l;
            return this;
        }
    }

    public static final class PhoneHandle {
        public static final int $stable = 8;
        private String id;

        public PhoneHandle(String str) {
            this.id = str;
        }

        public static /* synthetic */ PhoneHandle copy$default(PhoneHandle phoneHandle, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phoneHandle.id;
            }
            return phoneHandle.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final PhoneHandle copy(String str) {
            return new PhoneHandle(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneHandle) && sq8.m48644c(this.id, ((PhoneHandle) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setId(String str) {
            this.id = str;
        }

        public String toString() {
            return "PhoneHandle(id=" + this.id + ")";
        }
    }

    public /* synthetic */ CallEvent(String str, String str2, String str3, Long l, String str4, String str5, String str6, Long l2, Long l3, Long l4, CallConnectStatus callConnectStatus, Integer num, Boolean bool, Context context, CallEngagement callEngagement, PhoneHandle phoneHandle, String str7, String str8, String str9, Long l5, String str10, String str11, String str12, id5 id5Var) {
        this(str, str2, str3, l, str4, str5, str6, l2, l3, l4, callConnectStatus, num, bool, context, callEngagement, phoneHandle, str7, str8, str9, l5, str10, str11, str12);
    }

    public final Builder clone() {
        return new Builder().number(this.number).phone(this.phone).direction(this.direction).callStartTime(this.callStartTime).name(this.name).callId(this.callId).source(this.source).duration(this.duration).callEndTime(this.callEndTime).callConnectTime(this.callConnectTime).callConnectStatus(this.callConnectStatus).subscriptionId(this.subscriptionId).isConnectedCall(this.isConnectedCall).context(this.context).inFlightCall(this.inFlightCall).phoneHandle(this.phoneHandle).callStatus(this.callStatus).cloudProvider(this.cloudProvider).cloudProviderNumber(this.cloudProviderNumber).totalCallDuration(this.totalCallDuration).callType(this.callType).hangupReason(this.hangupReason).phoneCallLogId(this.phoneCallLogId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(CallEvent.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.model.CallEvent");
        CallEvent callEvent = (CallEvent) obj;
        return sq8.m48644c(this.number, callEvent.number) && sq8.m48644c(this.phone, callEvent.phone) && sq8.m48644c(this.direction, callEvent.direction) && sq8.m48644c(this.callStartTime, callEvent.callStartTime) && sq8.m48644c(this.name, callEvent.name) && sq8.m48644c(this.callId, callEvent.callId) && sq8.m48644c(this.source, callEvent.source) && sq8.m48644c(this.duration, callEvent.duration) && sq8.m48644c(this.callEndTime, callEvent.callEndTime) && sq8.m48644c(this.callConnectTime, callEvent.callConnectTime) && this.callConnectStatus == callEvent.callConnectStatus && sq8.m48644c(this.subscriptionId, callEvent.subscriptionId) && sq8.m48644c(this.isConnectedCall, callEvent.isConnectedCall) && sq8.m48644c(this.context, callEvent.context) && sq8.m48644c(this.inFlightCall, callEvent.inFlightCall) && sq8.m48644c(this.phoneHandle, callEvent.phoneHandle) && sq8.m48644c(this.callStatus, callEvent.callStatus) && sq8.m48644c(this.cloudProvider, callEvent.cloudProvider) && sq8.m48644c(this.cloudProviderNumber, callEvent.cloudProviderNumber) && sq8.m48644c(this.totalCallDuration, callEvent.totalCallDuration) && sq8.m48644c(this.callType, callEvent.callType) && sq8.m48644c(this.hangupReason, callEvent.hangupReason) && sq8.m48644c(this.phoneCallLogId, callEvent.phoneCallLogId);
    }

    public final CallConnectStatus getCallConnectStatus() {
        return this.callConnectStatus;
    }

    public final Long getCallConnectTime() {
        return this.callConnectTime;
    }

    public final Long getCallEndTime() {
        return this.callEndTime;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final Long getCallStartTime() {
        return this.callStartTime;
    }

    public final String getCallStatus() {
        return this.callStatus;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final String getCloudProvider() {
        return this.cloudProvider;
    }

    public final String getCloudProviderNumber() {
        return this.cloudProviderNumber;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getHangupReason() {
        return this.hangupReason;
    }

    public final CallEngagement getInFlightCall() {
        return this.inFlightCall;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCallLogId() {
        return this.phoneCallLogId;
    }

    public final PhoneHandle getPhoneHandle() {
        return this.phoneHandle;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getSubscriptionId() {
        return this.subscriptionId;
    }

    public final Long getTotalCallDuration() {
        return this.totalCallDuration;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.direction;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.callStartTime;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.callId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.source;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l2 = this.duration;
        int iHashCode8 = (iHashCode7 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.callEndTime;
        int iHashCode9 = (iHashCode8 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.callConnectTime;
        int iHashCode10 = (iHashCode9 + (l4 != null ? l4.hashCode() : 0)) * 31;
        CallConnectStatus callConnectStatus = this.callConnectStatus;
        int iHashCode11 = (iHashCode10 + (callConnectStatus != null ? callConnectStatus.hashCode() : 0)) * 31;
        Integer num = this.subscriptionId;
        int iIntValue = (iHashCode11 + (num != null ? num.intValue() : 0)) * 31;
        Boolean bool = this.isConnectedCall;
        int iHashCode12 = (iIntValue + (bool != null ? bool.hashCode() : 0)) * 31;
        Context context = this.context;
        int iHashCode13 = (iHashCode12 + (context != null ? context.hashCode() : 0)) * 31;
        CallEngagement callEngagement = this.inFlightCall;
        int iHashCode14 = (iHashCode13 + (callEngagement != null ? callEngagement.hashCode() : 0)) * 31;
        PhoneHandle phoneHandle = this.phoneHandle;
        int iHashCode15 = (iHashCode14 + (phoneHandle != null ? phoneHandle.hashCode() : 0)) * 31;
        String str7 = this.callStatus;
        int iHashCode16 = (iHashCode15 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.cloudProvider;
        int iHashCode17 = (iHashCode16 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.cloudProviderNumber;
        int iHashCode18 = (iHashCode17 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Long l5 = this.totalCallDuration;
        int iHashCode19 = (iHashCode18 + (l5 != null ? l5.hashCode() : 0)) * 31;
        String str10 = this.callType;
        int iHashCode20 = (iHashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.hangupReason;
        int iHashCode21 = (iHashCode20 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.phoneCallLogId;
        return iHashCode21 + (str12 != null ? str12.hashCode() : 0);
    }

    public final Boolean isConnectedCall() {
        return this.isConnectedCall;
    }

    public final void setCallType(String str) {
        this.callType = str;
    }

    public final void setCloudProvider(String str) {
        this.cloudProvider = str;
    }

    public final void setCloudProviderNumber(String str) {
        this.cloudProviderNumber = str;
    }

    public final void setHangupReason(String str) {
        this.hangupReason = str;
    }

    public final void setInFlightCall(CallEngagement callEngagement) {
        this.inFlightCall = callEngagement;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneCallLogId(String str) {
        this.phoneCallLogId = str;
    }

    public final void setTotalCallDuration(Long l) {
        this.totalCallDuration = l;
    }

    public final cv1 toCallLog() {
        String string = this.callId;
        if (string == null) {
            string = UUID.randomUUID().toString();
            sq8.m48648g(string, "toString(...)");
        }
        String str = string;
        String str2 = this.number;
        String str3 = this.phone;
        String str4 = this.direction;
        Long l = this.callStartTime;
        String str5 = this.name;
        String str6 = this.source;
        Long l2 = this.duration;
        Long l3 = this.callEndTime;
        Long l4 = this.callConnectTime;
        CallConnectStatus callConnectStatus = this.callConnectStatus;
        Integer num = this.subscriptionId;
        Boolean bool = this.isConnectedCall;
        PhoneHandle phoneHandle = this.phoneHandle;
        return new cv1(str, str2, str3, str4, l, str5, str6, l2, l3, l4, callConnectStatus, num, bool, this.callStatus, this.cloudProvider, this.cloudProviderNumber, this.totalCallDuration, this.callType, this.hangupReason, this.phoneCallLogId, phoneHandle != null ? phoneHandle.getId() : null, 0L, false, 6291456, null);
    }

    public String toString() {
        return "CallEvent(number=" + this.number + ", phone=" + this.phone + ", direction=" + this.direction + ", callStartTime=" + this.callStartTime + ", name=" + this.name + ", callId=" + this.callId + ", source=" + this.source + ", duration=" + this.duration + ", callEndTime=" + this.callEndTime + ", callConnectTime=" + this.callConnectTime + ", callConnectStatus=" + this.callConnectStatus + ", subscriptionId=" + this.subscriptionId + ", isConnectedCall=" + this.isConnectedCall + ", context=" + this.context + ", inFlightCall=" + this.inFlightCall + ", phoneHandle=" + this.phoneHandle + ", callStatus=" + this.callStatus + ", cloudProvider=" + this.cloudProvider + ", cloudProviderNumber=" + this.cloudProviderNumber + ", totalCallDuration=" + this.totalCallDuration + ", callType=" + this.callType + ", hangupReason=" + this.hangupReason + ", phoneCallLogId=" + this.phoneCallLogId + ")";
    }

    private CallEvent(String str, String str2, String str3, Long l, String str4, String str5, String str6, Long l2, Long l3, Long l4, CallConnectStatus callConnectStatus, Integer num, Boolean bool, Context context, CallEngagement callEngagement, PhoneHandle phoneHandle, String str7, String str8, String str9, Long l5, String str10, String str11, String str12) {
        this.number = str;
        this.phone = str2;
        this.direction = str3;
        this.callStartTime = l;
        this.name = str4;
        this.callId = str5;
        this.source = str6;
        this.duration = l2;
        this.callEndTime = l3;
        this.callConnectTime = l4;
        this.callConnectStatus = callConnectStatus;
        this.subscriptionId = num;
        this.isConnectedCall = bool;
        this.context = context;
        this.inFlightCall = callEngagement;
        this.phoneHandle = phoneHandle;
        this.callStatus = str7;
        this.cloudProvider = str8;
        this.cloudProviderNumber = str9;
        this.totalCallDuration = l5;
        this.callType = str10;
        this.hangupReason = str11;
        this.phoneCallLogId = str12;
    }
}
