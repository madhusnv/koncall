package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelExternalEventRecordFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelExternalEventRecordFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactName;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> eventDescription;
    private final Input<ModelStringInput> eventEndTime;
    private final Input<ModelStringInput> eventStartTime;
    private final Input<ModelStringInput> eventSummary;
    private final Input<ModelStringInput> eventUrl;
    private final Input<ModelIDInput> externalSourceId;
    private final Input<ModelStringInput> externalSourceType;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> message;
    private final Input<ModelExternalEventRecordFilterInput> not;
    private final Input<List<ModelExternalEventRecordFilterInput>> or;
    private final Input<ModelStringInput> primaryParticipantEmailId;
    private final Input<ModelStringInput> primaryParticipantName;
    private final Input<ModelStringInput> rawEvent;
    private final Input<ModelStringInput> recordingUrl;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> transcriptUrl;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> externalSourceId = Input.absent();
        private Input<ModelStringInput> externalSourceType = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelIDInput> userId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> contactName = Input.absent();
        private Input<ModelStringInput> primaryParticipantEmailId = Input.absent();
        private Input<ModelStringInput> primaryParticipantName = Input.absent();
        private Input<ModelStringInput> recordingUrl = Input.absent();
        private Input<ModelStringInput> transcriptUrl = Input.absent();
        private Input<ModelStringInput> rawEvent = Input.absent();
        private Input<ModelStringInput> message = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelStringInput> eventSummary = Input.absent();
        private Input<ModelStringInput> eventDescription = Input.absent();
        private Input<ModelStringInput> eventUrl = Input.absent();
        private Input<ModelStringInput> eventStartTime = Input.absent();
        private Input<ModelStringInput> eventEndTime = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelExternalEventRecordFilterInput>> and = Input.absent();
        private Input<List<ModelExternalEventRecordFilterInput>> or = Input.absent();
        private Input<ModelExternalEventRecordFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelExternalEventRecordFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelExternalEventRecordFilterInput build() {
            return new ModelExternalEventRecordFilterInput(this.id, this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactName(ModelStringInput modelStringInput) {
            this.contactName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder eventDescription(ModelStringInput modelStringInput) {
            this.eventDescription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eventEndTime(ModelStringInput modelStringInput) {
            this.eventEndTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eventStartTime(ModelStringInput modelStringInput) {
            this.eventStartTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eventSummary(ModelStringInput modelStringInput) {
            this.eventSummary = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eventUrl(ModelStringInput modelStringInput) {
            this.eventUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder externalSourceId(ModelIDInput modelIDInput) {
            this.externalSourceId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder externalSourceType(ModelStringInput modelStringInput) {
            this.externalSourceType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder message(ModelStringInput modelStringInput) {
            this.message = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelExternalEventRecordFilterInput modelExternalEventRecordFilterInput) {
            this.not = Input.fromNullable(modelExternalEventRecordFilterInput);
            return this;
        }

        public Builder or(List<ModelExternalEventRecordFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder primaryParticipantEmailId(ModelStringInput modelStringInput) {
            this.primaryParticipantEmailId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder primaryParticipantName(ModelStringInput modelStringInput) {
            this.primaryParticipantName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder rawEvent(ModelStringInput modelStringInput) {
            this.rawEvent = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder recordingUrl(ModelStringInput modelStringInput) {
            this.recordingUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder transcriptUrl(ModelStringInput modelStringInput) {
            this.transcriptUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder userId(ModelIDInput modelIDInput) {
            this.userId = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelExternalEventRecordFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<List<ModelExternalEventRecordFilterInput>> input23, Input<List<ModelExternalEventRecordFilterInput>> input24, Input<ModelExternalEventRecordFilterInput> input25) {
        this.id = input;
        this.accountId = input2;
        this.externalSourceId = input3;
        this.externalSourceType = input4;
        this.engagementId = input5;
        this.userId = input6;
        this.contactId = input7;
        this.contactName = input8;
        this.primaryParticipantEmailId = input9;
        this.primaryParticipantName = input10;
        this.recordingUrl = input11;
        this.transcriptUrl = input12;
        this.rawEvent = input13;
        this.message = input14;
        this.status = input15;
        this.eventSummary = input16;
        this.eventDescription = input17;
        this.eventUrl = input18;
        this.eventStartTime = input19;
        this.eventEndTime = input20;
        this.createdAt = input21;
        this.updatedAt = input22;
        this.and = input23;
        this.or = input24;
        this.not = input25;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelExternalEventRecordFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput contactName() {
        return this.contactName.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput eventDescription() {
        return this.eventDescription.value;
    }

    public ModelStringInput eventEndTime() {
        return this.eventEndTime.value;
    }

    public ModelStringInput eventStartTime() {
        return this.eventStartTime.value;
    }

    public ModelStringInput eventSummary() {
        return this.eventSummary.value;
    }

    public ModelStringInput eventUrl() {
        return this.eventUrl.value;
    }

    public ModelIDInput externalSourceId() {
        return this.externalSourceId.value;
    }

    public ModelStringInput externalSourceType() {
        return this.externalSourceType.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelExternalEventRecordFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelExternalEventRecordFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelExternalEventRecordFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelExternalEventRecordFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.externalSourceId.defined) {
                    inputFieldWriter.writeObject("externalSourceId", ModelExternalEventRecordFilterInput.this.externalSourceId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.externalSourceId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.externalSourceType.defined) {
                    inputFieldWriter.writeObject("externalSourceType", ModelExternalEventRecordFilterInput.this.externalSourceType.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.externalSourceType.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelExternalEventRecordFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelExternalEventRecordFilterInput.this.userId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.userId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelExternalEventRecordFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.contactName.defined) {
                    inputFieldWriter.writeObject("contactName", ModelExternalEventRecordFilterInput.this.contactName.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.contactName.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeObject("primaryParticipantEmailId", ModelExternalEventRecordFilterInput.this.primaryParticipantEmailId.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.primaryParticipantEmailId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeObject("primaryParticipantName", ModelExternalEventRecordFilterInput.this.primaryParticipantName.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.primaryParticipantName.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.recordingUrl.defined) {
                    inputFieldWriter.writeObject("recordingUrl", ModelExternalEventRecordFilterInput.this.recordingUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.recordingUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.transcriptUrl.defined) {
                    inputFieldWriter.writeObject("transcriptUrl", ModelExternalEventRecordFilterInput.this.transcriptUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.transcriptUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.rawEvent.defined) {
                    inputFieldWriter.writeObject("rawEvent", ModelExternalEventRecordFilterInput.this.rawEvent.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.rawEvent.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.message.defined) {
                    inputFieldWriter.writeObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, ModelExternalEventRecordFilterInput.this.message.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.message.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelExternalEventRecordFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.eventSummary.defined) {
                    inputFieldWriter.writeObject("eventSummary", ModelExternalEventRecordFilterInput.this.eventSummary.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.eventSummary.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.eventDescription.defined) {
                    inputFieldWriter.writeObject("eventDescription", ModelExternalEventRecordFilterInput.this.eventDescription.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.eventDescription.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.eventUrl.defined) {
                    inputFieldWriter.writeObject("eventUrl", ModelExternalEventRecordFilterInput.this.eventUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.eventUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.eventStartTime.defined) {
                    inputFieldWriter.writeObject("eventStartTime", ModelExternalEventRecordFilterInput.this.eventStartTime.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.eventStartTime.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.eventEndTime.defined) {
                    inputFieldWriter.writeObject("eventEndTime", ModelExternalEventRecordFilterInput.this.eventEndTime.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.eventEndTime.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelExternalEventRecordFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelExternalEventRecordFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelExternalEventRecordFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelExternalEventRecordFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelExternalEventRecordFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelExternalEventRecordFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelExternalEventRecordFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelExternalEventRecordFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelExternalEventRecordFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelExternalEventRecordFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelExternalEventRecordFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelExternalEventRecordFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelExternalEventRecordFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelExternalEventRecordFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelExternalEventRecordFilterInput.this.not.value != 0 ? ((ModelExternalEventRecordFilterInput) ModelExternalEventRecordFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput message() {
        return this.message.value;
    }

    public ModelExternalEventRecordFilterInput not() {
        return this.not.value;
    }

    public List<ModelExternalEventRecordFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput primaryParticipantEmailId() {
        return this.primaryParticipantEmailId.value;
    }

    public ModelStringInput primaryParticipantName() {
        return this.primaryParticipantName.value;
    }

    public ModelStringInput rawEvent() {
        return this.rawEvent.value;
    }

    public ModelStringInput recordingUrl() {
        return this.recordingUrl.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput transcriptUrl() {
        return this.transcriptUrl.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput userId() {
        return this.userId.value;
    }
}
