package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelCloudCallWebhookEventsFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelIntInput> actualCallDuration;
    private final Input<ModelStringInput> agentNumber;
    private final Input<List<ModelCloudCallWebhookEventsFilterInput>> and;
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
    private final Input<ModelIDInput> id;
    private final Input<ModelCloudCallWebhookEventsFilterInput> not;
    private final Input<List<ModelCloudCallWebhookEventsFilterInput>> or;
    private final Input<ModelStringInput> providerName;
    private final Input<ModelStringInput> rawPayload;
    private final Input<ModelStringInput> resourceURL;
    private final Input<ModelStringInput> sourceNumber;
    private final Input<ModelStringInput> status;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelCloudCallWebhookEventsFilterInput>> and = Input.absent();
        private Input<List<ModelCloudCallWebhookEventsFilterInput>> or = Input.absent();
        private Input<ModelCloudCallWebhookEventsFilterInput> not = Input.absent();

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

        public Builder and(List<ModelCloudCallWebhookEventsFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelCloudCallWebhookEventsFilterInput build() {
            return new ModelCloudCallWebhookEventsFilterInput(this.id, this.accountId, this.contactId, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelCloudCallWebhookEventsFilterInput modelCloudCallWebhookEventsFilterInput) {
            this.not = Input.fromNullable(modelCloudCallWebhookEventsFilterInput);
            return this;
        }

        public Builder or(List<ModelCloudCallWebhookEventsFilterInput> list) {
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

    public ModelCloudCallWebhookEventsFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelIntInput> input19, Input<ModelIntInput> input20, Input<ModelStringInput> input21, Input<ModelStringInput> input22, Input<ModelStringInput> input23, Input<ModelIntInput> input24, Input<ModelStringInput> input25, Input<ModelStringInput> input26, Input<List<ModelCloudCallWebhookEventsFilterInput>> input27, Input<List<ModelCloudCallWebhookEventsFilterInput>> input28, Input<ModelCloudCallWebhookEventsFilterInput> input29) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.callSessionId = input4;
        this.callId = input5;
        this.customIdentifier = input6;
        this.providerName = input7;
        this.connectionId = input8;
        this.rawPayload = input9;
        this.eventType = input10;
        this.sourceNumber = input11;
        this.callerSource = input12;
        this.destinationNumber = input13;
        this.displayNumber = input14;
        this.agentNumber = input15;
        this.customerNumber = input16;
        this.callStartTime = input17;
        this.callEndTime = input18;
        this.callDuration = input19;
        this.actualCallDuration = input20;
        this.resourceURL = input21;
        this.callDirection = input22;
        this.status = input23;
        this.expirationUnixTime = input24;
        this.createdAt = input25;
        this.updatedAt = input26;
        this.and = input27;
        this.or = input28;
        this.not = input29;
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

    public List<ModelCloudCallWebhookEventsFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudCallWebhookEventsFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudCallWebhookEventsFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelCloudCallWebhookEventsFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelCloudCallWebhookEventsFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelCloudCallWebhookEventsFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelCloudCallWebhookEventsFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelCloudCallWebhookEventsFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelCloudCallWebhookEventsFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callSessionId.defined) {
                    inputFieldWriter.writeObject("callSessionId", ModelCloudCallWebhookEventsFilterInput.this.callSessionId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callSessionId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callId.defined) {
                    inputFieldWriter.writeObject("callId", ModelCloudCallWebhookEventsFilterInput.this.callId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.customIdentifier.defined) {
                    inputFieldWriter.writeObject("customIdentifier", ModelCloudCallWebhookEventsFilterInput.this.customIdentifier.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.customIdentifier.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.providerName.defined) {
                    inputFieldWriter.writeObject("providerName", ModelCloudCallWebhookEventsFilterInput.this.providerName.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.providerName.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.connectionId.defined) {
                    inputFieldWriter.writeObject("connectionId", ModelCloudCallWebhookEventsFilterInput.this.connectionId.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.connectionId.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.rawPayload.defined) {
                    inputFieldWriter.writeObject("rawPayload", ModelCloudCallWebhookEventsFilterInput.this.rawPayload.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.rawPayload.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.eventType.defined) {
                    inputFieldWriter.writeObject("eventType", ModelCloudCallWebhookEventsFilterInput.this.eventType.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.eventType.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.sourceNumber.defined) {
                    inputFieldWriter.writeObject("sourceNumber", ModelCloudCallWebhookEventsFilterInput.this.sourceNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.sourceNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callerSource.defined) {
                    inputFieldWriter.writeObject("callerSource", ModelCloudCallWebhookEventsFilterInput.this.callerSource.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callerSource.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.destinationNumber.defined) {
                    inputFieldWriter.writeObject("destinationNumber", ModelCloudCallWebhookEventsFilterInput.this.destinationNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.destinationNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.displayNumber.defined) {
                    inputFieldWriter.writeObject("displayNumber", ModelCloudCallWebhookEventsFilterInput.this.displayNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.displayNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.agentNumber.defined) {
                    inputFieldWriter.writeObject("agentNumber", ModelCloudCallWebhookEventsFilterInput.this.agentNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.agentNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.customerNumber.defined) {
                    inputFieldWriter.writeObject("customerNumber", ModelCloudCallWebhookEventsFilterInput.this.customerNumber.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.customerNumber.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callStartTime.defined) {
                    inputFieldWriter.writeObject("callStartTime", ModelCloudCallWebhookEventsFilterInput.this.callStartTime.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callStartTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callEndTime.defined) {
                    inputFieldWriter.writeObject("callEndTime", ModelCloudCallWebhookEventsFilterInput.this.callEndTime.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callEndTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callDuration.defined) {
                    inputFieldWriter.writeObject("callDuration", ModelCloudCallWebhookEventsFilterInput.this.callDuration.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsFilterInput.this.callDuration.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.actualCallDuration.defined) {
                    inputFieldWriter.writeObject("actualCallDuration", ModelCloudCallWebhookEventsFilterInput.this.actualCallDuration.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsFilterInput.this.actualCallDuration.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.resourceURL.defined) {
                    inputFieldWriter.writeObject("resourceURL", ModelCloudCallWebhookEventsFilterInput.this.resourceURL.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.resourceURL.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.callDirection.defined) {
                    inputFieldWriter.writeObject("callDirection", ModelCloudCallWebhookEventsFilterInput.this.callDirection.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.callDirection.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.status.defined) {
                    inputFieldWriter.writeObject("status", ModelCloudCallWebhookEventsFilterInput.this.status.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.status.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeObject("expirationUnixTime", ModelCloudCallWebhookEventsFilterInput.this.expirationUnixTime.value != 0 ? ((ModelIntInput) ModelCloudCallWebhookEventsFilterInput.this.expirationUnixTime.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelCloudCallWebhookEventsFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelCloudCallWebhookEventsFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelCloudCallWebhookEventsFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelCloudCallWebhookEventsFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudCallWebhookEventsFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudCallWebhookEventsFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudCallWebhookEventsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelCloudCallWebhookEventsFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelCloudCallWebhookEventsFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelCloudCallWebhookEventsFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelCloudCallWebhookEventsFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelCloudCallWebhookEventsFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelCloudCallWebhookEventsFilterInput.this.not.value != 0 ? ((ModelCloudCallWebhookEventsFilterInput) ModelCloudCallWebhookEventsFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelCloudCallWebhookEventsFilterInput not() {
        return this.not.value;
    }

    public List<ModelCloudCallWebhookEventsFilterInput> or() {
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
