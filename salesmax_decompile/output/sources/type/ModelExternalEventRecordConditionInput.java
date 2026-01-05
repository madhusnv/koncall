package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelExternalEventRecordConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelExternalEventRecordConditionInput>> and;
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
    private final Input<ModelStringInput> message;
    private final Input<ModelExternalEventRecordConditionInput> not;
    private final Input<List<ModelExternalEventRecordConditionInput>> or;
    private final Input<ModelStringInput> primaryParticipantEmailId;
    private final Input<ModelStringInput> primaryParticipantName;
    private final Input<ModelStringInput> rawEvent;
    private final Input<ModelStringInput> recordingUrl;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> transcriptUrl;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> userId;

    public static final class Builder {
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
        private Input<List<ModelExternalEventRecordConditionInput>> and = Input.absent();
        private Input<List<ModelExternalEventRecordConditionInput>> or = Input.absent();
        private Input<ModelExternalEventRecordConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelExternalEventRecordConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelExternalEventRecordConditionInput build() {
            return new ModelExternalEventRecordConditionInput(this.accountId, this.externalSourceId, this.externalSourceType, this.engagementId, this.userId, this.contactId, this.contactName, this.primaryParticipantEmailId, this.primaryParticipantName, this.recordingUrl, this.transcriptUrl, this.rawEvent, this.message, this.status, this.eventSummary, this.eventDescription, this.eventUrl, this.eventStartTime, this.eventEndTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder message(ModelStringInput modelStringInput) {
            this.message = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelExternalEventRecordConditionInput modelExternalEventRecordConditionInput) {
            this.not = Input.fromNullable(modelExternalEventRecordConditionInput);
            return this;
        }

        public Builder or(List<ModelExternalEventRecordConditionInput> list) {
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

    public ModelExternalEventRecordConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<List<ModelExternalEventRecordConditionInput>> input22, Input<List<ModelExternalEventRecordConditionInput>> input23, Input<ModelExternalEventRecordConditionInput> input24) {
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
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelExternalEventRecordConditionInput> and() {
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelExternalEventRecordConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelExternalEventRecordConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelExternalEventRecordConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.externalSourceId.defined) {
                    inputFieldWriter.writeObject("externalSourceId", ModelExternalEventRecordConditionInput.this.externalSourceId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordConditionInput.this.externalSourceId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.externalSourceType.defined) {
                    inputFieldWriter.writeObject("externalSourceType", ModelExternalEventRecordConditionInput.this.externalSourceType.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.externalSourceType.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelExternalEventRecordConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.userId.defined) {
                    inputFieldWriter.writeObject("userId", ModelExternalEventRecordConditionInput.this.userId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordConditionInput.this.userId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelExternalEventRecordConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelExternalEventRecordConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.contactName.defined) {
                    inputFieldWriter.writeObject("contactName", ModelExternalEventRecordConditionInput.this.contactName.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.contactName.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.primaryParticipantEmailId.defined) {
                    inputFieldWriter.writeObject("primaryParticipantEmailId", ModelExternalEventRecordConditionInput.this.primaryParticipantEmailId.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.primaryParticipantEmailId.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.primaryParticipantName.defined) {
                    inputFieldWriter.writeObject("primaryParticipantName", ModelExternalEventRecordConditionInput.this.primaryParticipantName.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.primaryParticipantName.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.recordingUrl.defined) {
                    inputFieldWriter.writeObject("recordingUrl", ModelExternalEventRecordConditionInput.this.recordingUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.recordingUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.transcriptUrl.defined) {
                    inputFieldWriter.writeObject("transcriptUrl", ModelExternalEventRecordConditionInput.this.transcriptUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.transcriptUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.rawEvent.defined) {
                    inputFieldWriter.writeObject("rawEvent", ModelExternalEventRecordConditionInput.this.rawEvent.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.rawEvent.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.message.defined) {
                    inputFieldWriter.writeObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, ModelExternalEventRecordConditionInput.this.message.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.message.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelExternalEventRecordConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.eventSummary.defined) {
                    inputFieldWriter.writeObject("eventSummary", ModelExternalEventRecordConditionInput.this.eventSummary.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.eventSummary.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.eventDescription.defined) {
                    inputFieldWriter.writeObject("eventDescription", ModelExternalEventRecordConditionInput.this.eventDescription.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.eventDescription.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.eventUrl.defined) {
                    inputFieldWriter.writeObject("eventUrl", ModelExternalEventRecordConditionInput.this.eventUrl.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.eventUrl.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.eventStartTime.defined) {
                    inputFieldWriter.writeObject("eventStartTime", ModelExternalEventRecordConditionInput.this.eventStartTime.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.eventStartTime.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.eventEndTime.defined) {
                    inputFieldWriter.writeObject("eventEndTime", ModelExternalEventRecordConditionInput.this.eventEndTime.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.eventEndTime.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelExternalEventRecordConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelExternalEventRecordConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelExternalEventRecordConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelExternalEventRecordConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelExternalEventRecordConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelExternalEventRecordConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelExternalEventRecordConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelExternalEventRecordConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelExternalEventRecordConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelExternalEventRecordConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelExternalEventRecordConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelExternalEventRecordConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelExternalEventRecordConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelExternalEventRecordConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelExternalEventRecordConditionInput.this.not.value != 0 ? ((ModelExternalEventRecordConditionInput) ModelExternalEventRecordConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput message() {
        return this.message.value;
    }

    public ModelExternalEventRecordConditionInput not() {
        return this.not.value;
    }

    public List<ModelExternalEventRecordConditionInput> or() {
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
