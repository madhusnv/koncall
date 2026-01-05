package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "updatedAt"}, name = "requestByAccount"), @Index(fields = {"userId", "updatedAt"}, name = "requestByUser")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "DeviceRegistrationRequests")
/* loaded from: classes5.dex */
public final class DeviceRegistrationRequest implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime approvedAt;

    @ModelField(targetType = "ID")
    private final String approvedBy;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String deviceModel;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String ipAddress;

    @ModelField(targetType = "String")
    private final String osVersion;

    @ModelField(targetType = "String")
    private final String reason;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime requestedAt;

    @ModelField(isRequired = true, targetType = "String")
    private final String requestedDeviceId;

    @ModelField(isRequired = true, targetType = "DeviceRequestStatus")
    private final DeviceRequestStatus status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("DeviceRegistrationRequest", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DeviceRegistrationRequest", "accountId");
    public static final QueryField USER_ID = QueryField.field("DeviceRegistrationRequest", "userId");
    public static final QueryField REQUESTED_DEVICE_ID = QueryField.field("DeviceRegistrationRequest", "requestedDeviceId");
    public static final QueryField DEVICE_MODEL = QueryField.field("DeviceRegistrationRequest", "deviceModel");
    public static final QueryField OS_VERSION = QueryField.field("DeviceRegistrationRequest", "osVersion");
    public static final QueryField IP_ADDRESS = QueryField.field("DeviceRegistrationRequest", "ipAddress");
    public static final QueryField REASON = QueryField.field("DeviceRegistrationRequest", "reason");
    public static final QueryField STATUS = QueryField.field("DeviceRegistrationRequest", "status");
    public static final QueryField REQUESTED_AT = QueryField.field("DeviceRegistrationRequest", "requestedAt");
    public static final QueryField APPROVED_BY = QueryField.field("DeviceRegistrationRequest", "approvedBy");
    public static final QueryField APPROVED_AT = QueryField.field("DeviceRegistrationRequest", "approvedAt");
    public static final QueryField CREATED_AT = QueryField.field("DeviceRegistrationRequest", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("DeviceRegistrationRequest", "updatedAt");

    public interface AccountIdStep {
        UserIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep approvedAt(Temporal.DateTime dateTime);

        BuildStep approvedBy(String str);

        DeviceRegistrationRequest build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deviceModel(String str);

        BuildStep id(String str);

        BuildStep ipAddress(String str);

        BuildStep osVersion(String str);

        BuildStep reason(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, UserIdStep, RequestedDeviceIdStep, StatusStep, RequestedAtStep, BuildStep {
        private String accountId;
        private Temporal.DateTime approvedAt;
        private String approvedBy;
        private Temporal.DateTime createdAt;
        private String deviceModel;
        private String id;
        private String ipAddress;
        private String osVersion;
        private String reason;
        private Temporal.DateTime requestedAt;
        private String requestedDeviceId;
        private DeviceRequestStatus status;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.AccountIdStep
        public UserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep approvedAt(Temporal.DateTime dateTime) {
            this.approvedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep approvedBy(String str) {
            this.approvedBy = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public DeviceRegistrationRequest build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DeviceRegistrationRequest(string, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep deviceModel(String str) {
            this.deviceModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep ipAddress(String str) {
            this.ipAddress = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep reason(String str) {
            this.reason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.RequestedAtStep
        public BuildStep requestedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.requestedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.RequestedDeviceIdStep
        public StatusStep requestedDeviceId(String str) {
            Objects.requireNonNull(str);
            this.requestedDeviceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.StatusStep
        public RequestedAtStep status(DeviceRequestStatus deviceRequestStatus) {
            Objects.requireNonNull(deviceRequestStatus);
            this.status = deviceRequestStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.UserIdStep
        public RequestedDeviceIdStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DeviceRequestStatus deviceRequestStatus, Temporal.DateTime dateTime, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.requestedDeviceId = str4;
            this.deviceModel = str5;
            this.osVersion = str6;
            this.ipAddress = str7;
            this.reason = str8;
            this.status = deviceRequestStatus;
            this.requestedAt = dateTime;
            this.approvedBy = str9;
            this.approvedAt = dateTime2;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DeviceRequestStatus deviceRequestStatus, Temporal.DateTime dateTime, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, str5, str6, str7, str8, deviceRequestStatus, dateTime, str9, dateTime2, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(deviceRequestStatus);
            Objects.requireNonNull(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder approvedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.approvedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder approvedBy(String str) {
            return (CopyOfBuilder) super.approvedBy(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder deviceModel(String str) {
            return (CopyOfBuilder) super.deviceModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder ipAddress(String str) {
            return (CopyOfBuilder) super.ipAddress(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder osVersion(String str) {
            return (CopyOfBuilder) super.osVersion(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder reason(String str) {
            return (CopyOfBuilder) super.reason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.RequestedAtStep
        public CopyOfBuilder requestedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.requestedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.RequestedDeviceIdStep
        public CopyOfBuilder requestedDeviceId(String str) {
            return (CopyOfBuilder) super.requestedDeviceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.StatusStep
        public CopyOfBuilder status(DeviceRequestStatus deviceRequestStatus) {
            return (CopyOfBuilder) super.status(deviceRequestStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.Builder, com.amplifyframework.datastore.generated.model.DeviceRegistrationRequest.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface RequestedAtStep {
        BuildStep requestedAt(Temporal.DateTime dateTime);
    }

    public interface RequestedDeviceIdStep {
        StatusStep requestedDeviceId(String str);
    }

    public interface StatusStep {
        RequestedAtStep status(DeviceRequestStatus deviceRequestStatus);
    }

    public interface UserIdStep {
        RequestedDeviceIdStep userId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DeviceRegistrationRequest justId(String str) {
        return new DeviceRegistrationRequest(str, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.requestedDeviceId, this.deviceModel, this.osVersion, this.ipAddress, this.reason, this.status, this.requestedAt, this.approvedBy, this.approvedAt, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeviceRegistrationRequest.class != obj.getClass()) {
            return false;
        }
        DeviceRegistrationRequest deviceRegistrationRequest = (DeviceRegistrationRequest) obj;
        return s6c.m47909a(getId(), deviceRegistrationRequest.getId()) && s6c.m47909a(getAccountId(), deviceRegistrationRequest.getAccountId()) && s6c.m47909a(getUserId(), deviceRegistrationRequest.getUserId()) && s6c.m47909a(getRequestedDeviceId(), deviceRegistrationRequest.getRequestedDeviceId()) && s6c.m47909a(getDeviceModel(), deviceRegistrationRequest.getDeviceModel()) && s6c.m47909a(getOsVersion(), deviceRegistrationRequest.getOsVersion()) && s6c.m47909a(getIpAddress(), deviceRegistrationRequest.getIpAddress()) && s6c.m47909a(getReason(), deviceRegistrationRequest.getReason()) && s6c.m47909a(getStatus(), deviceRegistrationRequest.getStatus()) && s6c.m47909a(getRequestedAt(), deviceRegistrationRequest.getRequestedAt()) && s6c.m47909a(getApprovedBy(), deviceRegistrationRequest.getApprovedBy()) && s6c.m47909a(getApprovedAt(), deviceRegistrationRequest.getApprovedAt()) && s6c.m47909a(getCreatedAt(), deviceRegistrationRequest.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), deviceRegistrationRequest.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getApprovedAt() {
        return this.approvedAt;
    }

    public String getApprovedBy() {
        return this.approvedBy;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getId() {
        return this.id;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getReason() {
        return this.reason;
    }

    public Temporal.DateTime getRequestedAt() {
        return this.requestedAt;
    }

    public String getRequestedDeviceId() {
        return this.requestedDeviceId;
    }

    public DeviceRequestStatus getStatus() {
        return this.status;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getRequestedDeviceId() + getDeviceModel() + getOsVersion() + getIpAddress() + getReason() + getStatus() + getRequestedAt() + getApprovedBy() + getApprovedAt() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceRegistrationRequest {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("requestedDeviceId=" + String.valueOf(getRequestedDeviceId()) + ", ");
        sb.append("deviceModel=" + String.valueOf(getDeviceModel()) + ", ");
        sb.append("osVersion=" + String.valueOf(getOsVersion()) + ", ");
        sb.append("ipAddress=" + String.valueOf(getIpAddress()) + ", ");
        sb.append("reason=" + String.valueOf(getReason()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("requestedAt=" + String.valueOf(getRequestedAt()) + ", ");
        sb.append("approvedBy=" + String.valueOf(getApprovedBy()) + ", ");
        sb.append("approvedAt=" + String.valueOf(getApprovedAt()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DeviceRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DeviceRequestStatus deviceRequestStatus, Temporal.DateTime dateTime, String str9, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.requestedDeviceId = str4;
        this.deviceModel = str5;
        this.osVersion = str6;
        this.ipAddress = str7;
        this.reason = str8;
        this.status = deviceRequestStatus;
        this.requestedAt = dateTime;
        this.approvedBy = str9;
        this.approvedAt = dateTime2;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
