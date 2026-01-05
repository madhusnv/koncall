package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateMasterBotSpecializedBotInput implements InputType {
    private final Input<String> createdAt;
    private final String id;
    private final Input<String> masterBotId;
    private final Input<String> specializedBotId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> masterBotId = Input.absent();
        private Input<String> specializedBotId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public UpdateMasterBotSpecializedBotInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateMasterBotSpecializedBotInput(this.id, this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder masterBotId(String str) {
            this.masterBotId = Input.fromNullable(str);
            return this;
        }

        public Builder specializedBotId(String str) {
            this.specializedBotId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateMasterBotSpecializedBotInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.id = str;
        this.masterBotId = input;
        this.specializedBotId = input2;
        this.createdAt = input3;
        this.updatedAt = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateMasterBotSpecializedBotInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateMasterBotSpecializedBotInput.this.id);
                if (UpdateMasterBotSpecializedBotInput.this.masterBotId.defined) {
                    inputFieldWriter.writeString("masterBotId", (String) UpdateMasterBotSpecializedBotInput.this.masterBotId.value);
                }
                if (UpdateMasterBotSpecializedBotInput.this.specializedBotId.defined) {
                    inputFieldWriter.writeString("specializedBotId", (String) UpdateMasterBotSpecializedBotInput.this.specializedBotId.value);
                }
                if (UpdateMasterBotSpecializedBotInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateMasterBotSpecializedBotInput.this.createdAt.value);
                }
                if (UpdateMasterBotSpecializedBotInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateMasterBotSpecializedBotInput.this.updatedAt.value);
                }
            }
        };
    }

    public String masterBotId() {
        return this.masterBotId.value;
    }

    public String specializedBotId() {
        return this.specializedBotId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
