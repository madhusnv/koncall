package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput implements InputType {
    private final Input<String> ownerId;
    private final Input<String> scheduledAt;

    public static final class Builder {
        private Input<String> ownerId = Input.absent();
        private Input<String> scheduledAt = Input.absent();

        public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput build() {
            return new ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput(this.ownerId, this.scheduledAt);
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder scheduledAt(String str) {
            this.scheduledAt = Input.fromNullable(str);
            return this;
        }
    }

    public ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.ownerId = input;
        this.scheduledAt = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.this.ownerId.value);
                }
                if (ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.this.scheduledAt.defined) {
                    inputFieldWriter.writeString("scheduledAt", (String) ModelNotificationStagingAllNotificationsByOwnerCompositeKeyInput.this.scheduledAt.value);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String scheduledAt() {
        return this.scheduledAt.value;
    }
}
