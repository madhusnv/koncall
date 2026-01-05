package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateNotificationStagingInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> activityDoneByUserId;
    private final Input<String> contactId;
    private final Input<String> content;
    private final Input<String> createdAt;
    private final Input<Long> expirationUnixTime;
    private final String id;
    private final Input<String> notificationChannel;
    private final Input<String> notificationId;
    private final Input<String> notificationRelatedObjectId;
    private final Input<ActivityRelatedObjectType> notificationRelatedObjectType;
    private final Input<String> notificationStatus;
    private final Input<String> notificationType;
    private final Input<String> ownerId;
    private final Input<String> primaryTeamId;
    private final Input<String> scheduledAt;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> notificationId = Input.absent();
        private Input<String> notificationChannel = Input.absent();
        private Input<String> notificationStatus = Input.absent();
        private Input<String> notificationType = Input.absent();
        private Input<ActivityRelatedObjectType> notificationRelatedObjectType = Input.absent();
        private Input<String> notificationRelatedObjectId = Input.absent();
        private Input<String> ownerId = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> activityDoneByUserId = Input.absent();
        private Input<String> content = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> scheduledAt = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder activityDoneByUserId(String str) {
            this.activityDoneByUserId = Input.fromNullable(str);
            return this;
        }

        public UpdateNotificationStagingInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateNotificationStagingInput(this.id, this.accountId, this.notificationId, this.notificationChannel, this.notificationStatus, this.notificationType, this.notificationRelatedObjectType, this.notificationRelatedObjectId, this.ownerId, this.primaryTeamId, this.contactId, this.activityDoneByUserId, this.content, this.createdAt, this.updatedAt, this.scheduledAt, this.expirationUnixTime);
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
            this.id = str;
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
            this.notificationRelatedObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder notificationRelatedObjectType(ActivityRelatedObjectType activityRelatedObjectType) {
            this.notificationRelatedObjectType = Input.fromNullable(activityRelatedObjectType);
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
            this.ownerId = Input.fromNullable(str);
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

    public UpdateNotificationStagingInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<ActivityRelatedObjectType> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<Long> input16) {
        this.id = str;
        this.accountId = input;
        this.notificationId = input2;
        this.notificationChannel = input3;
        this.notificationStatus = input4;
        this.notificationType = input5;
        this.notificationRelatedObjectType = input6;
        this.notificationRelatedObjectId = input7;
        this.ownerId = input8;
        this.primaryTeamId = input9;
        this.contactId = input10;
        this.activityDoneByUserId = input11;
        this.content = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.scheduledAt = input15;
        this.expirationUnixTime = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateNotificationStagingInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateNotificationStagingInput.this.id);
                if (UpdateNotificationStagingInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateNotificationStagingInput.this.accountId.value);
                }
                if (UpdateNotificationStagingInput.this.notificationId.defined) {
                    inputFieldWriter.writeString("notificationId", (String) UpdateNotificationStagingInput.this.notificationId.value);
                }
                if (UpdateNotificationStagingInput.this.notificationChannel.defined) {
                    inputFieldWriter.writeString("notificationChannel", (String) UpdateNotificationStagingInput.this.notificationChannel.value);
                }
                if (UpdateNotificationStagingInput.this.notificationStatus.defined) {
                    inputFieldWriter.writeString("notificationStatus", (String) UpdateNotificationStagingInput.this.notificationStatus.value);
                }
                if (UpdateNotificationStagingInput.this.notificationType.defined) {
                    inputFieldWriter.writeString("notificationType", (String) UpdateNotificationStagingInput.this.notificationType.value);
                }
                if (UpdateNotificationStagingInput.this.notificationRelatedObjectType.defined) {
                    inputFieldWriter.writeString("notificationRelatedObjectType", UpdateNotificationStagingInput.this.notificationRelatedObjectType.value != 0 ? ((ActivityRelatedObjectType) UpdateNotificationStagingInput.this.notificationRelatedObjectType.value).name() : null);
                }
                if (UpdateNotificationStagingInput.this.notificationRelatedObjectId.defined) {
                    inputFieldWriter.writeString("notificationRelatedObjectId", (String) UpdateNotificationStagingInput.this.notificationRelatedObjectId.value);
                }
                if (UpdateNotificationStagingInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) UpdateNotificationStagingInput.this.ownerId.value);
                }
                if (UpdateNotificationStagingInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateNotificationStagingInput.this.primaryTeamId.value);
                }
                if (UpdateNotificationStagingInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateNotificationStagingInput.this.contactId.value);
                }
                if (UpdateNotificationStagingInput.this.activityDoneByUserId.defined) {
                    inputFieldWriter.writeString("activityDoneByUserId", (String) UpdateNotificationStagingInput.this.activityDoneByUserId.value);
                }
                if (UpdateNotificationStagingInput.this.content.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CONTENT, (String) UpdateNotificationStagingInput.this.content.value);
                }
                if (UpdateNotificationStagingInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateNotificationStagingInput.this.createdAt.value);
                }
                if (UpdateNotificationStagingInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateNotificationStagingInput.this.updatedAt.value);
                }
                if (UpdateNotificationStagingInput.this.scheduledAt.defined) {
                    inputFieldWriter.writeString("scheduledAt", (String) UpdateNotificationStagingInput.this.scheduledAt.value);
                }
                if (UpdateNotificationStagingInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) UpdateNotificationStagingInput.this.expirationUnixTime.value);
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
        return this.notificationRelatedObjectId.value;
    }

    public ActivityRelatedObjectType notificationRelatedObjectType() {
        return this.notificationRelatedObjectType.value;
    }

    public String notificationStatus() {
        return this.notificationStatus.value;
    }

    public String notificationType() {
        return this.notificationType.value;
    }

    public String ownerId() {
        return this.ownerId.value;
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
