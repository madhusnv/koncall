package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCloudCallWebhookEventsInput implements InputType {
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
    private final String id;
    private final Input<String> providerName;
    private final Input<String> rawPayload;
    private final Input<String> resourceURL;
    private final Input<String> sourceNumber;
    private final Input<String> status;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
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

        public UpdateCloudCallWebhookEventsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCloudCallWebhookEventsInput(this.id, this.accountId, this.contactId, this.callSessionId, this.callId, this.customIdentifier, this.providerName, this.connectionId, this.rawPayload, this.eventType, this.sourceNumber, this.callerSource, this.destinationNumber, this.displayNumber, this.agentNumber, this.customerNumber, this.callStartTime, this.callEndTime, this.callDuration, this.actualCallDuration, this.resourceURL, this.callDirection, this.status, this.expirationUnixTime, this.createdAt, this.updatedAt);
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
            this.id = str;
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

    public UpdateCloudCallWebhookEventsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<Integer> input18, Input<Integer> input19, Input<String> input20, Input<String> input21, Input<String> input22, Input<Long> input23, Input<String> input24, Input<String> input25) {
        this.id = str;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCloudCallWebhookEventsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCloudCallWebhookEventsInput.this.id);
                if (UpdateCloudCallWebhookEventsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCloudCallWebhookEventsInput.this.accountId.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateCloudCallWebhookEventsInput.this.contactId.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callSessionId.defined) {
                    inputFieldWriter.writeString("callSessionId", (String) UpdateCloudCallWebhookEventsInput.this.callSessionId.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callId.defined) {
                    inputFieldWriter.writeString("callId", (String) UpdateCloudCallWebhookEventsInput.this.callId.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.customIdentifier.defined) {
                    inputFieldWriter.writeString("customIdentifier", (String) UpdateCloudCallWebhookEventsInput.this.customIdentifier.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) UpdateCloudCallWebhookEventsInput.this.providerName.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.connectionId.defined) {
                    inputFieldWriter.writeString("connectionId", (String) UpdateCloudCallWebhookEventsInput.this.connectionId.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.rawPayload.defined) {
                    inputFieldWriter.writeString("rawPayload", (String) UpdateCloudCallWebhookEventsInput.this.rawPayload.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.eventType.defined) {
                    inputFieldWriter.writeString("eventType", (String) UpdateCloudCallWebhookEventsInput.this.eventType.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.sourceNumber.defined) {
                    inputFieldWriter.writeString("sourceNumber", (String) UpdateCloudCallWebhookEventsInput.this.sourceNumber.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callerSource.defined) {
                    inputFieldWriter.writeString("callerSource", (String) UpdateCloudCallWebhookEventsInput.this.callerSource.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.destinationNumber.defined) {
                    inputFieldWriter.writeString("destinationNumber", (String) UpdateCloudCallWebhookEventsInput.this.destinationNumber.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.displayNumber.defined) {
                    inputFieldWriter.writeString("displayNumber", (String) UpdateCloudCallWebhookEventsInput.this.displayNumber.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.agentNumber.defined) {
                    inputFieldWriter.writeString("agentNumber", (String) UpdateCloudCallWebhookEventsInput.this.agentNumber.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.customerNumber.defined) {
                    inputFieldWriter.writeString("customerNumber", (String) UpdateCloudCallWebhookEventsInput.this.customerNumber.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callStartTime.defined) {
                    inputFieldWriter.writeString("callStartTime", (String) UpdateCloudCallWebhookEventsInput.this.callStartTime.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callEndTime.defined) {
                    inputFieldWriter.writeString("callEndTime", (String) UpdateCloudCallWebhookEventsInput.this.callEndTime.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callDuration.defined) {
                    inputFieldWriter.writeInt("callDuration", (Integer) UpdateCloudCallWebhookEventsInput.this.callDuration.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.actualCallDuration.defined) {
                    inputFieldWriter.writeInt("actualCallDuration", (Integer) UpdateCloudCallWebhookEventsInput.this.actualCallDuration.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.resourceURL.defined) {
                    inputFieldWriter.writeString("resourceURL", (String) UpdateCloudCallWebhookEventsInput.this.resourceURL.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.callDirection.defined) {
                    inputFieldWriter.writeString("callDirection", (String) UpdateCloudCallWebhookEventsInput.this.callDirection.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateCloudCallWebhookEventsInput.this.status.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.expirationUnixTime.defined) {
                    inputFieldWriter.writeLong("expirationUnixTime", (Long) UpdateCloudCallWebhookEventsInput.this.expirationUnixTime.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCloudCallWebhookEventsInput.this.createdAt.value);
                }
                if (UpdateCloudCallWebhookEventsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCloudCallWebhookEventsInput.this.updatedAt.value);
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
