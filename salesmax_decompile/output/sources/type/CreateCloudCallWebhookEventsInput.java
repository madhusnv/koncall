package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCloudCallWebhookEventsInput implements InputType {
    private final Input<String> accountId;
    private final Input<Integer> actualCallDuration;
    private final Input<String> agentNumber;
    private final Input<String> callDirection;
    private final Input<Integer> callDuration;
    private final Input<String> callEndTime;
    private final Input<String> callId;
    private final Input<String> callSessionId;
    private final Input<String> callStartTime;
    private final Input<String> callerSource;
    private final Input<String> connectionId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> customIdentifier;
    private final Input<String> customerNumber;
    private final Input<String> destinationNumber;
    private final Input<String> displayNumber;
    private final Input<String> eventType;
    private final Input<Long> expirationUnixTime;
    private final Input<String> id;
    private final Input<String> providerName;
    private final Input<String> rawPayload;
    private final Input<String> resourceURL;
    private final Input<String> sourceNumber;
    private final Input<String> status;
    private final Input<String> updatedAt;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> callSessionId = Input.absent();
        private Input<String> callId = Input.absent();
        private Input<String> customIdentifier = Input.absent();
        private Input<String> providerName = Input.absent();
        private Input<String> connectionId = Input.absent();
        private Input<String> rawPayload = Input.absent();
        private Input<String> eventType = Input.absent();
        private Input<String> sourceNumber = Input.absent();
        private Input<String> callerSource = Input.absent();
        private Input<String> destinationNumber = Input.absent();
        private Input<String> displayNumber = Input.absent();
        private Input<String> agentNumber = Input.absent();
        private Input<String> customerNumber = Input.absent();
        private Input<String> callStartTime = Input.absent();
        private Input<String> callEndTime = Input.absent();
        private Input<Integer> callDuration = Input.absent();
        private Input<Integer> actualCallDuration = Input.absent();
        private Input<String> resourceURL = Input.absent();
        private Input<String> callDirection = Input.absent();
        private Input<String> status = Input.absent();
        private Input<Long> expirationUnixTime = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder actualCallDuration(Integer num) {
            this.actualCallDuration = Input.fromNullable(num);
            return this;
        }

        public Builder agentNumber(String str) {
            this.agentNumber = Input.fromNullable(str);
            return this;
        }

        public CreateCloudCallWebhookEventsInput build() {
            return new CreateCloudCallWebhookEventsInput(this.id, this.accountId, this.contactId, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
        }

        public Builder callDirection(String str) {
            this.callDirection = Input.fromNullable(str);
            return this;
        }

        public Builder callDuration(Integer num) {
            this.callDuration = Input.fromNullable(num);
            return this;
        }

        public Builder callEndTime(String str) {
            this.callEndTime = Input.fromNullable(str);
            return this;
        }

        public Builder callId(String str) {
            this.callId = Input.fromNullable(str);
            return this;
        }

        public Builder callSessionId(String str) {
            this.callSessionId = Input.fromNullable(str);
            return this;
        }

        public Builder callStartTime(String str) {
            this.callStartTime = Input.fromNullable(str);
            return this;
        }

        public Builder callerSource(String str) {
            this.callerSource = Input.fromNullable(str);
            return this;
        }

        public Builder connectionId(String str) {
            this.connectionId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder customIdentifier(String str) {
            this.customIdentifier = Input.fromNullable(str);
            return this;
        }

        public Builder customerNumber(String str) {
            this.customerNumber = Input.fromNullable(str);
            return this;
        }

        public Builder destinationNumber(String str) {
            this.destinationNumber = Input.fromNullable(str);
            return this;
        }

        public Builder displayNumber(String str) {
            this.displayNumber = Input.fromNullable(str);
            return this;
        }

        public Builder eventType(String str) {
            this.eventType = Input.fromNullable(str);
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

        public Builder providerName(String str) {
            this.providerName = Input.fromNullable(str);
            return this;
        }

        public Builder rawPayload(String str) {
            this.rawPayload = Input.fromNullable(str);
            return this;
        }

        public Builder resourceURL(String str) {
            this.resourceURL = Input.fromNullable(str);
            return this;
        }

        public Builder sourceNumber(String str) {
            this.sourceNumber = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCloudCallWebhookEventsInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<Integer> input19, Input<Integer> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<Long> input24, Input<String> input25, Input<String> input26) {
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Integer actualCallDuration() {
        return this.actualCallDuration.value;
    }

    public String agentNumber() {
        return this.agentNumber.value;
    }

    public String callDirection() {
        return this.callDirection.value;
    }

    public Integer callDuration() {
        return this.callDuration.value;
    }

    public String callEndTime() {
        return this.callEndTime.value;
    }

    public String callId() {
        return this.callId.value;
    }

    public String callSessionId() {
        return this.callSessionId.value;
    }

    public String callStartTime() {
        return this.callStartTime.value;
    }

    public String callerSource() {
        return this.callerSource.value;
    }

    public String connectionId() {
        return this.connectionId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String customIdentifier() {
        return this.customIdentifier.value;
    }

    public String customerNumber() {
        return this.customerNumber.value;
    }

    public String destinationNumber() {
        return this.destinationNumber.value;
    }

    public String displayNumber() {
        return this.displayNumber.value;
    }

    public String eventType() {
        return this.eventType.value;
    }

    public Long expirationUnixTime() {
        return this.expirationUnixTime.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCloudCallWebhookEventsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCloudCallWebhookEventsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCloudCallWebhookEventsInput.this.id.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateCloudCallWebhookEventsInput.this.accountId.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateCloudCallWebhookEventsInput.this.contactId.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callSessionId.defined) {
                    inputFieldWriter.writeString("callSessionId", (String) CreateCloudCallWebhookEventsInput.this.callSessionId.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callId.defined) {
                    inputFieldWriter.writeString("callId", (String) CreateCloudCallWebhookEventsInput.this.callId.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.customIdentifier.defined) {
                    inputFieldWriter.writeString("customIdentifier", (String) CreateCloudCallWebhookEventsInput.this.customIdentifier.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) CreateCloudCallWebhookEventsInput.this.providerName.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.connectionId.defined) {
                    inputFieldWriter.writeString("connectionId", (String) CreateCloudCallWebhookEventsInput.this.connectionId.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.rawPayload.defined) {
                    inputFieldWriter.writeString("rawPayload", (String) CreateCloudCallWebhookEventsInput.this.rawPayload.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.eventType.defined) {
                    inputFieldWriter.writeString("eventType", (String) CreateCloudCallWebhookEventsInput.this.eventType.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.sourceNumber.defined) {
                    inputFieldWriter.writeString("sourceNumber", (String) CreateCloudCallWebhookEventsInput.this.sourceNumber.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callerSource.defined) {
                    inputFieldWriter.writeString("callerSource", (String) CreateCloudCallWebhookEventsInput.this.callerSource.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.destinationNumber.defined) {
                    inputFieldWriter.writeString("destinationNumber", (String) CreateCloudCallWebhookEventsInput.this.destinationNumber.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.displayNumber.defined) {
                    inputFieldWriter.writeString("displayNumber", (String) CreateCloudCallWebhookEventsInput.this.displayNumber.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.agentNumber.defined) {
                    inputFieldWriter.writeString("agentNumber", (String) CreateCloudCallWebhookEventsInput.this.agentNumber.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.customerNumber.defined) {
                    inputFieldWriter.writeString("customerNumber", (String) CreateCloudCallWebhookEventsInput.this.customerNumber.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callStartTime.defined) {
                    inputFieldWriter.writeString("callStartTime", (String) CreateCloudCallWebhookEventsInput.this.callStartTime.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callEndTime.defined) {
                    inputFieldWriter.writeString("callEndTime", (String) CreateCloudCallWebhookEventsInput.this.callEndTime.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callDuration.defined) {
                    inputFieldWriter.writeInt("callDuration", (Integer) CreateCloudCallWebhookEventsInput.this.callDuration.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.actualCallDuration.defined) {
                    inputFieldWriter.writeInt("actualCallDuration", (Integer) CreateCloudCallWebhookEventsInput.this.actualCallDuration.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.resourceURL.defined) {
                    inputFieldWriter.writeString("resourceURL", (String) CreateCloudCallWebhookEventsInput.this.resourceURL.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.callDirection.defined) {
                    inputFieldWriter.writeString("callDirection", (String) CreateCloudCallWebhookEventsInput.this.callDirection.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateCloudCallWebhookEventsInput.this.status.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) CreateCloudCallWebhookEventsInput.this.expirationUnixTime.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCloudCallWebhookEventsInput.this.createdAt.value);
                }
                if (CreateCloudCallWebhookEventsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCloudCallWebhookEventsInput.this.updatedAt.value);
                }
            }
        };
    }

    public String providerName() {
        return this.providerName.value;
    }

    public String rawPayload() {
        return this.rawPayload.value;
    }

    public String resourceURL() {
        return this.resourceURL.value;
    }

    public String sourceNumber() {
        return this.sourceNumber.value;
    }

    public String status() {
        return this.status.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
