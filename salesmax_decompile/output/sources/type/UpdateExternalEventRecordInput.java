package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateExternalEventRecordInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> contactId;
    private final Input<String> contactName;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final Input<String> eventDescription;
    private final Input<String> eventEndTime;
    private final Input<String> eventStartTime;
    private final Input<String> eventSummary;
    private final Input<String> eventUrl;
    private final Input<String> externalSourceId;
    private final Input<String> externalSourceType;
    private final String id;
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
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> externalSourceId = Input.absent();
        private Input<String> externalSourceType = Input.absent();
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
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateExternalEventRecordInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateExternalEventRecordInput(this.id, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt);
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
            this.externalSourceId = Input.fromNullable(str);
            return this;
        }

        public Builder externalSourceType(String str) {
            this.externalSourceType = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
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

    public UpdateExternalEventRecordInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20, Input<String> input21) {
        this.id = str;
        this.accountId = input;
        this.externalSourceId = input2;
        this.externalSourceType = input3;
        this.engagementId = input4;
        this.userId = input5;
        this.contactId = input6;
        this.contactName = input7;
        this.primaryParticipantEmailId = input8;
        this.primaryParticipantName = input9;
        this.recordingUrl = input10;
        this.transcriptUrl = input11;
        this.rawEvent = input12;
        this.message = input13;
        this.status = input14;
        this.eventSummary = input15;
        this.eventDescription = input16;
        this.eventUrl = input17;
        this.eventStartTime = input18;
        this.eventEndTime = input19;
        this.createdAt = input20;
        this.updatedAt = input21;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
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
        return this.externalSourceId.value;
    }

    public String externalSourceType() {
        return this.externalSourceType.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateExternalEventRecordInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateExternalEventRecordInput.this.id);
                if (UpdateExternalEventRecordInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateExternalEventRecordInput.this.accountId.value);
                }
                if (UpdateExternalEventRecordInput.this.externalSourceId.defined) {
                    inputFieldWriter.writeString("externalSourceId", (String) UpdateExternalEventRecordInput.this.externalSourceId.value);
                }
                if (UpdateExternalEventRecordInput.this.externalSourceType.defined) {
                    inputFieldWriter.writeString("externalSourceType", (String) UpdateExternalEventRecordInput.this.externalSourceType.value);
                }
                if (UpdateExternalEventRecordInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateExternalEventRecordInput.this.engagementId.value);
                }
                if (UpdateExternalEventRecordInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateExternalEventRecordInput.this.userId.value);
                }
                if (UpdateExternalEventRecordInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateExternalEventRecordInput.this.contactId.value);
                }
                if (UpdateExternalEventRecordInput.this.contactName.defined) {
                    inputFieldWriter.writeString("contactName", (String) UpdateExternalEventRecordInput.this.contactName.value);
                }
                if (UpdateExternalEventRecordInput.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeString("primaryParticipantEmailId", (String) UpdateExternalEventRecordInput.this.primaryParticipantEmailId.value);
                }
                if (UpdateExternalEventRecordInput.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeString("primaryParticipantName", (String) UpdateExternalEventRecordInput.this.primaryParticipantName.value);
                }
                if (UpdateExternalEventRecordInput.this.recordingUrl.defined) {
                    inputFieldWriter.writeString("recordingUrl", (String) UpdateExternalEventRecordInput.this.recordingUrl.value);
                }
                if (UpdateExternalEventRecordInput.this.transcriptUrl.defined) {
                    inputFieldWriter.writeString("transcriptUrl", (String) UpdateExternalEventRecordInput.this.transcriptUrl.value);
                }
                if (UpdateExternalEventRecordInput.this.rawEvent.defined) {
                    inputFieldWriter.writeString("rawEvent", (String) UpdateExternalEventRecordInput.this.rawEvent.value);
                }
                if (UpdateExternalEventRecordInput.this.message.defined) {
                    inputFieldWriter.writeString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, (String) UpdateExternalEventRecordInput.this.message.value);
                }
                if (UpdateExternalEventRecordInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateExternalEventRecordInput.this.status.value);
                }
                if (UpdateExternalEventRecordInput.this.eventSummary.defined) {
                    inputFieldWriter.writeString("eventSummary", (String) UpdateExternalEventRecordInput.this.eventSummary.value);
                }
                if (UpdateExternalEventRecordInput.this.eventDescription.defined) {
                    inputFieldWriter.writeString("eventDescription", (String) UpdateExternalEventRecordInput.this.eventDescription.value);
                }
                if (UpdateExternalEventRecordInput.this.eventUrl.defined) {
                    inputFieldWriter.writeString("eventUrl", (String) UpdateExternalEventRecordInput.this.eventUrl.value);
                }
                if (UpdateExternalEventRecordInput.this.eventStartTime.defined) {
                    inputFieldWriter.writeString("eventStartTime", (String) UpdateExternalEventRecordInput.this.eventStartTime.value);
                }
                if (UpdateExternalEventRecordInput.this.eventEndTime.defined) {
                    inputFieldWriter.writeString("eventEndTime", (String) UpdateExternalEventRecordInput.this.eventEndTime.value);
                }
                if (UpdateExternalEventRecordInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateExternalEventRecordInput.this.createdAt.value);
                }
                if (UpdateExternalEventRecordInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateExternalEventRecordInput.this.updatedAt.value);
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
