package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateEngagementUpdateInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> dueDateTimeChangedFrom;
    private final Input<String> dueDateTimeChangedTo;
    private final String engagementId;
    private final Input<String> eventType;
    private final Input<String> id;
    private final Input<String> note;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String accountId;
        private String engagementId;
        private Input<String> id = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> eventType = Input.absent();
        private Input<String> note = Input.absent();
        private Input<String> dueDateTimeChangedFrom = Input.absent();
        private Input<String> dueDateTimeChangedTo = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateEngagementUpdateInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.engagementId, "engagementId == null");
            return new CreateEngagementUpdateInput(this.id, this.accountId, this.updatedById, this.contactId, this.eventType, this.engagementId, this.note, this.dueDateTimeChangedFrom, this.dueDateTimeChangedTo, this.updatedAt, this.createdAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dueDateTimeChangedFrom(String str) {
            this.dueDateTimeChangedFrom = Input.fromNullable(str);
            return this;
        }

        public Builder dueDateTimeChangedTo(String str) {
            this.dueDateTimeChangedTo = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = str;
            return this;
        }

        public Builder eventType(String str) {
            this.eventType = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder note(String str) {
            this.note = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }
    }

    public CreateEngagementUpdateInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, String str2, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.accountId = str;
        this.updatedById = input2;
        this.contactId = input3;
        this.eventType = input4;
        this.engagementId = str2;
        this.note = input5;
        this.dueDateTimeChangedFrom = input6;
        this.dueDateTimeChangedTo = input7;
        this.updatedAt = input8;
        this.createdAt = input9;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dueDateTimeChangedFrom() {
        return this.dueDateTimeChangedFrom.value;
    }

    public String dueDateTimeChangedTo() {
        return this.dueDateTimeChangedTo.value;
    }

    public String engagementId() {
        return this.engagementId;
    }

    public String eventType() {
        return this.eventType.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateEngagementUpdateInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateEngagementUpdateInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateEngagementUpdateInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateEngagementUpdateInput.this.accountId);
                if (CreateEngagementUpdateInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateEngagementUpdateInput.this.updatedById.value);
                }
                if (CreateEngagementUpdateInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateEngagementUpdateInput.this.contactId.value);
                }
                if (CreateEngagementUpdateInput.this.eventType.defined) {
                    inputFieldWriter.writeString("eventType", (String) CreateEngagementUpdateInput.this.eventType.value);
                }
                inputFieldWriter.writeString("engagementId", CreateEngagementUpdateInput.this.engagementId);
                if (CreateEngagementUpdateInput.this.note.defined) {
                    inputFieldWriter.writeString("note", (String) CreateEngagementUpdateInput.this.note.value);
                }
                if (CreateEngagementUpdateInput.this.dueDateTimeChangedFrom.defined) {
                    inputFieldWriter.writeString("dueDateTimeChangedFrom", (String) CreateEngagementUpdateInput.this.dueDateTimeChangedFrom.value);
                }
                if (CreateEngagementUpdateInput.this.dueDateTimeChangedTo.defined) {
                    inputFieldWriter.writeString("dueDateTimeChangedTo", (String) CreateEngagementUpdateInput.this.dueDateTimeChangedTo.value);
                }
                if (CreateEngagementUpdateInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateEngagementUpdateInput.this.updatedAt.value);
                }
                if (CreateEngagementUpdateInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateEngagementUpdateInput.this.createdAt.value);
                }
            }
        };
    }

    public String note() {
        return this.note.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
