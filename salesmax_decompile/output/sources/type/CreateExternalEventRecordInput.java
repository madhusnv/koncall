package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateExternalEventRecordInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> contactName;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final Input<String> eventDescription;
    private final Input<String> eventEndTime;
    private final Input<String> eventStartTime;
    private final Input<String> eventSummary;
    private final Input<String> eventUrl;
    private final String externalSourceId;
    private final String externalSourceType;
    private final Input<String> id;
    private final Input<String> message;
    private final Input<String> primaryParticipantEmailId;
    private final Input<String> primaryParticipantName;
    private final Input<String> rawEvent;
    private final Input<String> recordingUrl;
    private final Input<String> status;
    private final Input<String> transcriptUrl;
    private final Input<String> updatedAt;
    private final Input<String> userId;

    public static final class Builder {
        private String accountId;
        private String externalSourceId;
        private String externalSourceType;
        private Input<String> id = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> contactName = Input.absent();
        private Input<String> primaryParticipantEmailId = Input.absent();
        private Input<String> primaryParticipantName = Input.absent();
        private Input<String> recordingUrl = Input.absent();
        private Input<String> transcriptUrl = Input.absent();
        private Input<String> rawEvent = Input.absent();
        private Input<String> message = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> eventSummary = Input.absent();
        private Input<String> eventDescription = Input.absent();
        private Input<String> eventUrl = Input.absent();
        private Input<String> eventStartTime = Input.absent();
        private Input<String> eventEndTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateExternalEventRecordInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.externalSourceId, "externalSourceId == null");
            Utils.checkNotNull(this.externalSourceType, "externalSourceType == null");
            return new CreateExternalEventRecordInput(this.id, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactName(String str) {
            this.contactName = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder eventDescription(String str) {
            this.eventDescription = Input.fromNullable(str);
            return this;
        }

        public Builder eventEndTime(String str) {
            this.eventEndTime = Input.fromNullable(str);
            return this;
        }

        public Builder eventStartTime(String str) {
            this.eventStartTime = Input.fromNullable(str);
            return this;
        }

        public Builder eventSummary(String str) {
            this.eventSummary = Input.fromNullable(str);
            return this;
        }

        public Builder eventUrl(String str) {
            this.eventUrl = Input.fromNullable(str);
            return this;
        }

        public Builder externalSourceId(String str) {
            this.externalSourceId = str;
            return this;
        }

        public Builder externalSourceType(String str) {
            this.externalSourceType = str;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder message(String str) {
            this.message = Input.fromNullable(str);
            return this;
        }

        public Builder primaryParticipantEmailId(String str) {
            this.primaryParticipantEmailId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryParticipantName(String str) {
            this.primaryParticipantName = Input.fromNullable(str);
            return this;
        }

        public Builder rawEvent(String str) {
            this.rawEvent = Input.fromNullable(str);
            return this;
        }

        public Builder recordingUrl(String str) {
            this.recordingUrl = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder transcriptUrl(String str) {
            this.transcriptUrl = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateExternalEventRecordInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19) {
        this.id = input;
        this.accountId = str;
        this.externalSourceId = str2;
        this.externalSourceType = str3;
        this.engagementId = input2;
        this.userId = input3;
        this.contactId = input4;
        this.contactName = input5;
        this.primaryParticipantEmailId = input6;
        this.primaryParticipantName = input7;
        this.recordingUrl = input8;
        this.transcriptUrl = input9;
        this.rawEvent = input10;
        this.message = input11;
        this.status = input12;
        this.eventSummary = input13;
        this.eventDescription = input14;
        this.eventUrl = input15;
        this.eventStartTime = input16;
        this.eventEndTime = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String contactName() {
        return this.contactName.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String eventDescription() {
        return this.eventDescription.value;
    }

    public String eventEndTime() {
        return this.eventEndTime.value;
    }

    public String eventStartTime() {
        return this.eventStartTime.value;
    }

    public String eventSummary() {
        return this.eventSummary.value;
    }

    public String eventUrl() {
        return this.eventUrl.value;
    }

    public String externalSourceId() {
        return this.externalSourceId;
    }

    public String externalSourceType() {
        return this.externalSourceType;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateExternalEventRecordInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateExternalEventRecordInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateExternalEventRecordInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateExternalEventRecordInput.this.accountId);
                inputFieldWriter.writeString("externalSourceId", CreateExternalEventRecordInput.this.externalSourceId);
                inputFieldWriter.writeString("externalSourceType", CreateExternalEventRecordInput.this.externalSourceType);
                if (CreateExternalEventRecordInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) CreateExternalEventRecordInput.this.engagementId.value);
                }
                if (CreateExternalEventRecordInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) CreateExternalEventRecordInput.this.userId.value);
                }
                if (CreateExternalEventRecordInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateExternalEventRecordInput.this.contactId.value);
                }
                if (CreateExternalEventRecordInput.this.contactName.defined) {
                    inputFieldWriter.writeString("contactName", (String) CreateExternalEventRecordInput.this.contactName.value);
                }
                if (CreateExternalEventRecordInput.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeString("primaryParticipantEmailId", (String) CreateExternalEventRecordInput.this.primaryParticipantEmailId.value);
                }
                if (CreateExternalEventRecordInput.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeString("primaryParticipantName", (String) CreateExternalEventRecordInput.this.primaryParticipantName.value);
                }
                if (CreateExternalEventRecordInput.this.recordingUrl.defined) {
                    inputFieldWriter.writeString("recordingUrl", (String) CreateExternalEventRecordInput.this.recordingUrl.value);
                }
                if (CreateExternalEventRecordInput.this.transcriptUrl.defined) {
                    inputFieldWriter.writeString("transcriptUrl", (String) CreateExternalEventRecordInput.this.transcriptUrl.value);
                }
                if (CreateExternalEventRecordInput.this.rawEvent.defined) {
                    inputFieldWriter.writeString("rawEvent", (String) CreateExternalEventRecordInput.this.rawEvent.value);
                }
                if (CreateExternalEventRecordInput.this.message.defined) {
                    inputFieldWriter.writeString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, (String) CreateExternalEventRecordInput.this.message.value);
                }
                if (CreateExternalEventRecordInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateExternalEventRecordInput.this.status.value);
                }
                if (CreateExternalEventRecordInput.this.eventSummary.defined) {
                    inputFieldWriter.writeString("eventSummary", (String) CreateExternalEventRecordInput.this.eventSummary.value);
                }
                if (CreateExternalEventRecordInput.this.eventDescription.defined) {
                    inputFieldWriter.writeString("eventDescription", (String) CreateExternalEventRecordInput.this.eventDescription.value);
                }
                if (CreateExternalEventRecordInput.this.eventUrl.defined) {
                    inputFieldWriter.writeString("eventUrl", (String) CreateExternalEventRecordInput.this.eventUrl.value);
                }
                if (CreateExternalEventRecordInput.this.eventStartTime.defined) {
                    inputFieldWriter.writeString("eventStartTime", (String) CreateExternalEventRecordInput.this.eventStartTime.value);
                }
                if (CreateExternalEventRecordInput.this.eventEndTime.defined) {
                    inputFieldWriter.writeString("eventEndTime", (String) CreateExternalEventRecordInput.this.eventEndTime.value);
                }
                if (CreateExternalEventRecordInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateExternalEventRecordInput.this.createdAt.value);
                }
                if (CreateExternalEventRecordInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateExternalEventRecordInput.this.updatedAt.value);
                }
            }
        };
    }

    public String message() {
        return this.message.value;
    }

    public String primaryParticipantEmailId() {
        return this.primaryParticipantEmailId.value;
    }

    public String primaryParticipantName() {
        return this.primaryParticipantName.value;
    }

    public String rawEvent() {
        return this.rawEvent.value;
    }

    public String recordingUrl() {
        return this.recordingUrl.value;
    }

    public String status() {
        return this.status.value;
    }

    public String transcriptUrl() {
        return this.transcriptUrl.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
