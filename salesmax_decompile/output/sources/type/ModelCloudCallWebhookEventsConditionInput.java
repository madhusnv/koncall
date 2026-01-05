package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudCallWebhookEventsConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> actualCallDuration;
    private final Input<ModelStringInput> agentNumber;
    private final Input<List<ModelCloudCallWebhookEventsConditionInput>> and;
    private final Input<ModelStringInput> callDirection;
    private final Input<ModelIntInput> callDuration;
    private final Input<ModelStringInput> callEndTime;
    private final Input<ModelStringInput> callId;
    private final Input<ModelStringInput> callSessionId;
    private final Input<ModelStringInput> callStartTime;
    private final Input<ModelStringInput> callerSource;
    private final Input<ModelStringInput> connectionId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> customIdentifier;
    private final Input<ModelStringInput> customerNumber;
    private final Input<ModelStringInput> destinationNumber;
    private final Input<ModelStringInput> displayNumber;
    private final Input<ModelStringInput> eventType;
    private final Input<ModelIntInput> expirationUnixTime;
    private final Input<ModelCloudCallWebhookEventsConditionInput> not;
    private final Input<List<ModelCloudCallWebhookEventsConditionInput>> or;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> rawPayload;
    private final Input<ModelStringInput> resourceURL;
    private final Input<ModelStringInput> sourceNumber;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> callSessionId = Input.absent();
        private Input<ModelStringInput> callId = Input.absent();
        private Input<ModelStringInput> customIdentifier = Input.absent();
        private Input<ModelStringInput> providerName = Input.absent();
        private Input<ModelStringInput> connectionId = Input.absent();
        private Input<ModelStringInput> rawPayload = Input.absent();
        private Input<ModelStringInput> eventType = Input.absent();
        private Input<ModelStringInput> sourceNumber = Input.absent();
        private Input<ModelStringInput> callerSource = Input.absent();
        private Input<ModelStringInput> destinationNumber = Input.absent();
        private Input<ModelStringInput> displayNumber = Input.absent();
        private Input<ModelStringInput> agentNumber = Input.absent();
        private Input<ModelStringInput> customerNumber = Input.absent();
        private Input<ModelStringInput> callStartTime = Input.absent();
        private Input<ModelStringInput> callEndTime = Input.absent();
        private Input<ModelIntInput> callDuration = Input.absent();
        private Input<ModelIntInput> actualCallDuration = Input.absent();
        private Input<ModelStringInput> resourceURL = Input.absent();
        private Input<ModelStringInput> callDirection = Input.absent();
        private Input<ModelStringInput> status = Input.absent();
        private Input<ModelIntInput> expirationUnixTime = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelCloudCallWebhookEventsConditionInput>> and = Input.absent();
        private Input<List<ModelCloudCallWebhookEventsConditionInput>> or = Input.absent();
        private Input<ModelCloudCallWebhookEventsConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder actualCallDuration(ModelIntInput modelIntInput) {
            this.actualCallDuration = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder agentNumber(ModelStringInput modelStringInput) {
            this.agentNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelCloudCallWebhookEventsConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudCallWebhookEventsConditionInput build() {
            return new ModelCloudCallWebhookEventsConditionInput(this.accountId, this.contactId, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder callDirection(ModelStringInput modelStringInput) {
            this.callDirection = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callDuration(ModelIntInput modelIntInput) {
            this.callDuration = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder callEndTime(ModelStringInput modelStringInput) {
            this.callEndTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callId(ModelStringInput modelStringInput) {
            this.callId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callSessionId(ModelStringInput modelStringInput) {
            this.callSessionId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callStartTime(ModelStringInput modelStringInput) {
            this.callStartTime = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder callerSource(ModelStringInput modelStringInput) {
            this.callerSource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder connectionId(ModelStringInput modelStringInput) {
            this.connectionId = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder customIdentifier(ModelStringInput modelStringInput) {
            this.customIdentifier = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder customerNumber(ModelStringInput modelStringInput) {
            this.customerNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder destinationNumber(ModelStringInput modelStringInput) {
            this.destinationNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder displayNumber(ModelStringInput modelStringInput) {
            this.displayNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder eventType(ModelStringInput modelStringInput) {
            this.eventType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder expirationUnixTime(ModelIntInput modelIntInput) {
            this.expirationUnixTime = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder not(ModelCloudCallWebhookEventsConditionInput modelCloudCallWebhookEventsConditionInput) {
            this.not = Input.fromNullable(modelCloudCallWebhookEventsConditionInput);
            return this;
        }

        public Builder or(List<ModelCloudCallWebhookEventsConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder providerName(ModelStringInput modelStringInput) {
            this.providerName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder rawPayload(ModelStringInput modelStringInput) {
            this.rawPayload = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder resourceURL(ModelStringInput modelStringInput) {
            this.resourceURL = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder sourceNumber(ModelStringInput modelStringInput) {
            this.sourceNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder status(ModelStringInput modelStringInput) {
            this.status = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelCloudCallWebhookEventsConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelIntInput> input18, Input<ModelIntInput> input19, Input<ModelStringInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelIntInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<List<ModelCloudCallWebhookEventsConditionInput>> input26, Input<List<ModelCloudCallWebhookEventsConditionInput>> input27, Input<ModelCloudCallWebhookEventsConditionInput> input28) {
        this.accountId = input;
        this.contactId = input2;
        this.callSessionId = input3;
        this.callId = input4;
        this.customIdentifier = input5;
        this.providerName = input6;
        this.connectionId = input7;
        this.rawPayload = input8;
        this.eventType = input9;
        this.sourceNumber = input10;
        this.callerSource = input11;
        this.destinationNumber = input12;
        this.displayNumber = input13;
        this.agentNumber = input14;
        this.customerNumber = input15;
        this.callStartTime = input16;
        this.callEndTime = input17;
        this.callDuration = input18;
        this.actualCallDuration = input19;
        this.resourceURL = input20;
        this.callDirection = input21;
        this.status = input22;
        this.expirationUnixTime = input23;
        this.createdAt = input24;
        this.updatedAt = input25;
        this.and = input26;
        this.or = input27;
        this.not = input28;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public ModelIntInput actualCallDuration() {
        return this.actualCallDuration.value;
    }

    public ModelStringInput agentNumber() {
        return this.agentNumber.value;
    }

    public List<ModelCloudCallWebhookEventsConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput callDirection() {
        return this.callDirection.value;
    }

    public ModelIntInput callDuration() {
        return this.callDuration.value;
    }

    public ModelStringInput callEndTime() {
        return this.callEndTime.value;
    }

    public ModelStringInput callId() {
        return this.callId.value;
    }

    public ModelStringInput callSessionId() {
        return this.callSessionId.value;
    }

    public ModelStringInput callStartTime() {
        return this.callStartTime.value;
    }

    public ModelStringInput callerSource() {
        return this.callerSource.value;
    }

    public ModelStringInput connectionId() {
        return this.connectionId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput customIdentifier() {
        return this.customIdentifier.value;
    }

    public ModelStringInput customerNumber() {
        return this.customerNumber.value;
    }

    public ModelStringInput destinationNumber() {
        return this.destinationNumber.value;
    }

    public ModelStringInput displayNumber() {
        return this.displayNumber.value;
    }

    public ModelStringInput eventType() {
        return this.eventType.value;
    }

    public ModelIntInput expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudCallWebhookEventsConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudCallWebhookEventsConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudCallWebhookEventsConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudCallWebhookEventsConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelCloudCallWebhookEventsConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelCloudCallWebhookEventsConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callSessionId.defined) {
                    inputFieldWriter.writeObject("callSessionId", ModelCloudCallWebhookEventsConditionInput.this.callSessionId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callSessionId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callId.defined) {
                    inputFieldWriter.writeObject("callId", ModelCloudCallWebhookEventsConditionInput.this.callId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.customIdentifier.defined) {
                    inputFieldWriter.writeObject("customIdentifier", ModelCloudCallWebhookEventsConditionInput.this.customIdentifier.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.customIdentifier.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudCallWebhookEventsConditionInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.connectionId.defined) {
                    inputFieldWriter.writeObject("connectionId", ModelCloudCallWebhookEventsConditionInput.this.connectionId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.connectionId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.rawPayload.defined) {
                    inputFieldWriter.writeObject("rawPayload", ModelCloudCallWebhookEventsConditionInput.this.rawPayload.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.rawPayload.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.eventType.defined) {
                    inputFieldWriter.writeObject("eventType", ModelCloudCallWebhookEventsConditionInput.this.eventType.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.eventType.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.sourceNumber.defined) {
                    inputFieldWriter.writeObject("sourceNumber", ModelCloudCallWebhookEventsConditionInput.this.sourceNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.sourceNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callerSource.defined) {
                    inputFieldWriter.writeObject("callerSource", ModelCloudCallWebhookEventsConditionInput.this.callerSource.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callerSource.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.destinationNumber.defined) {
                    inputFieldWriter.writeObject("destinationNumber", ModelCloudCallWebhookEventsConditionInput.this.destinationNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.destinationNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.displayNumber.defined) {
                    inputFieldWriter.writeObject("displayNumber", ModelCloudCallWebhookEventsConditionInput.this.displayNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.displayNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.agentNumber.defined) {
                    inputFieldWriter.writeObject("agentNumber", ModelCloudCallWebhookEventsConditionInput.this.agentNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.agentNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.customerNumber.defined) {
                    inputFieldWriter.writeObject("customerNumber", ModelCloudCallWebhookEventsConditionInput.this.customerNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.customerNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callStartTime.defined) {
                    inputFieldWriter.writeObject("callStartTime", ModelCloudCallWebhookEventsConditionInput.this.callStartTime.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callStartTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callEndTime.defined) {
                    inputFieldWriter.writeObject("callEndTime", ModelCloudCallWebhookEventsConditionInput.this.callEndTime.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callEndTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callDuration.defined) {
                    inputFieldWriter.writeObject("callDuration", ModelCloudCallWebhookEventsConditionInput.this.callDuration.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsConditionInput.this.callDuration.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.actualCallDuration.defined) {
                    inputFieldWriter.writeObject("actualCallDuration", ModelCloudCallWebhookEventsConditionInput.this.actualCallDuration.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsConditionInput.this.actualCallDuration.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.resourceURL.defined) {
                    inputFieldWriter.writeObject("resourceURL", ModelCloudCallWebhookEventsConditionInput.this.resourceURL.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.resourceURL.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.callDirection.defined) {
                    inputFieldWriter.writeObject("callDirection", ModelCloudCallWebhookEventsConditionInput.this.callDirection.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.callDirection.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCloudCallWebhookEventsConditionInput.this.status.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.status.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelCloudCallWebhookEventsConditionInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsConditionInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudCallWebhookEventsConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudCallWebhookEventsConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudCallWebhookEventsConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudCallWebhookEventsConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudCallWebhookEventsConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudCallWebhookEventsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudCallWebhookEventsConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudCallWebhookEventsConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudCallWebhookEventsConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudCallWebhookEventsConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudCallWebhookEventsConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudCallWebhookEventsConditionInput.this.not.value != 0 ? ((ModelCloudCallWebhookEventsConditionInput) ModelCloudCallWebhookEventsConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudCallWebhookEventsConditionInput not() {
        return this.not.value;
    }

    public List<ModelCloudCallWebhookEventsConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput providerName() {
        return this.providerName.value;
    }

    public ModelStringInput rawPayload() {
        return this.rawPayload.value;
    }

    public ModelStringInput resourceURL() {
        return this.resourceURL.value;
    }

    public ModelStringInput sourceNumber() {
        return this.sourceNumber.value;
    }

    public ModelStringInput status() {
        return this.status.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
