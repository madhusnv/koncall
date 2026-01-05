package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput implements InputType {
    private final Input<String> eventType;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private Input<String> updatedById = Input.absent();
        private Input<String> eventType = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput build() {
            return new ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput(this.updatedById, this.eventType, this.updatedAt);
        }

        public Builder eventType(String str) {
            this.eventType = Input.fromNullable(str);
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

    public ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.updatedById = input;
        this.eventType = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String eventType() {
        return this.eventType.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.updatedById.value);
                }
                if (ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.eventType.defined) {
                    inputFieldWriter.writeString("eventType", (String) ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.eventType.value);
                }
                if (ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) ModelEngagementUpdateUpdateByOwnerAndEventTypeCompositeKeyInput.this.updatedAt.value);
                }
            }
        };
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
