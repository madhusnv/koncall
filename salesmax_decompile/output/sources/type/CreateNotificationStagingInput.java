package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateNotificationStagingInput implements InputType {
    private final String accountId;
    private final Input<String> activityDoneByUserId;
    private final Input<String> contactId;
    private final Input<String> content;
    private final Input<String> createdAt;
    private final Input<Long> expirationUnixTime;
    private final Input<String> id;
    private final Input<String> notificationChannel;
    private final Input<String> notificationId;
    private final String notificationRelatedObjectId;
    private final ActivityRelatedObjectType notificationRelatedObjectType;
    private final Input<String> notificationStatus;
    private final Input<String> notificationType;
    private final String ownerId;
    private final Input<String> primaryTeamId;
    private final Input<String> scheduledAt;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String notificationRelatedObjectId;
        private ActivityRelatedObjectType notificationRelatedObjectType;
        private String ownerId;
        private Input<String> id = Input.absent();
        private Input<String> notificationId = Input.absent();
        private Input<String> notificationChannel = Input.absent();
        private Input<String> notificationStatus = Input.absent();
        private Input<String> notificationType = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> activityDoneByUserId = Input.absent();
        private Input<String> content = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> scheduledAt = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder activityDoneByUserId(String str) {
            this.activityDoneByUserId = Input.fromNullable(str);
            return this;
        }

        public CreateNotificationStagingInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.notificationRelatedObjectType, "notificationRelatedObjectType == null");
            Utils.checkNotNull(this.notificationRelatedObjectId, "notificationRelatedObjectId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            return new CreateNotificationStagingInput(this.id, this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder content(String str) {
            this.content = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder expirationUnixTime(Long l) {
            this.expirationUnixTime = Input.fromNullable(l);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder notificationChannel(String str) {
            this.notificationChannel = Input.fromNullable(str);
            return this;
        }

        public Builder notificationId(String str) {
            this.notificationId = Input.fromNullable(str);
            return this;
        }

        public Builder notificationRelatedObjectId(String str) {
            this.notificationRelatedObjectId = str;
            return this;
        }

        public Builder notificationRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            this.notificationRelatedObjectType = activityRelatedObjectType;
            return this;
        }

        public Builder notificationStatus(String str) {
            this.notificationStatus = Input.fromNullable(str);
            return this;
        }

        public Builder notificationType(String str) {
            this.notificationType = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder scheduledAt(String str) {
            this.scheduledAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateNotificationStagingInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, ActivityRelatedObjectType activityRelatedObjectType, String str2, String str3, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<Long> input13) {
        this.id = input;
        this.accountId = str;
        this.notificationId = input2;
        this.notificationChannel = input3;
        this.notificationStatus = input4;
        this.notificationType = input5;
        this.notificationRelatedObjectType = activityRelatedObjectType;
        this.notificationRelatedObjectId = str2;
        this.ownerId = str3;
        this.primaryTeamId = input6;
        this.contactId = input7;
        this.activityDoneByUserId = input8;
        this.content = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.scheduledAt = input12;
        this.expirationUnixTime = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String activityDoneByUserId() {
        return this.activityDoneByUserId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String content() {
        return this.content.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public Long expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateNotificationStagingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateNotificationStagingInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateNotificationStagingInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateNotificationStagingInput.this.accountId);
                if (CreateNotificationStagingInput.this.notificationId.defined) {
                    inputFieldWriter.writeString("notificationId", (String) CreateNotificationStagingInput.this.notificationId.value);
                }
                if (CreateNotificationStagingInput.this.notificationChannel.defined) {
                    inputFieldWriter.writeString("notificationChannel", (String) CreateNotificationStagingInput.this.notificationChannel.value);
                }
                if (CreateNotificationStagingInput.this.notificationStatus.defined) {
                    inputFieldWriter.writeString("notificationStatus", (String) CreateNotificationStagingInput.this.notificationStatus.value);
                }
                if (CreateNotificationStagingInput.this.notificationType.defined) {
                    inputFieldWriter.writeString("notificationType", (String) CreateNotificationStagingInput.this.notificationType.value);
                }
                inputFieldWriter.writeString("notificationRelatedObjectType", CreateNotificationStagingInput.this.notificationRelatedObjectType.name());
                inputFieldWriter.writeString("notificationRelatedObjectId", CreateNotificationStagingInput.this.notificationRelatedObjectId);
                inputFieldWriter.writeString("ownerId", CreateNotificationStagingInput.this.ownerId);
                if (CreateNotificationStagingInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateNotificationStagingInput.this.primaryTeamId.value);
                }
                if (CreateNotificationStagingInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateNotificationStagingInput.this.contactId.value);
                }
                if (CreateNotificationStagingInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeString("activityDoneByUserId", (String) CreateNotificationStagingInput.this.activityDoneByUserId.value);
                }
                if (CreateNotificationStagingInput.this.content.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CONTENT, (String) CreateNotificationStagingInput.this.content.value);
                }
                if (CreateNotificationStagingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateNotificationStagingInput.this.createdAt.value);
                }
                if (CreateNotificationStagingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateNotificationStagingInput.this.updatedAt.value);
                }
                if (CreateNotificationStagingInput.this.scheduledAt.defined) {
                    inputFieldWriter.writeString("scheduledAt", (String) CreateNotificationStagingInput.this.scheduledAt.value);
                }
                if (CreateNotificationStagingInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) CreateNotificationStagingInput.this.expirationUnixTime.value);
                }
            }
        };
    }

    public String notificationChannel() {
        return this.notificationChannel.value;
    }

    public String notificationId() {
        return this.notificationId.value;
    }

    public String notificationRelatedObjectId() {
        return this.notificationRelatedObjectId;
    }

    public ActivityRelatedObjectType notificationRelatedObjectType() {
        return this.notificationRelatedObjectType;
    }

    public String notificationStatus() {
        return this.notificationStatus.value;
    }

    public String notificationType() {
        return this.notificationType.value;
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String scheduledAt() {
        return this.scheduledAt.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
