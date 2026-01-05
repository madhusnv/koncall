package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateMasterBotSpecializedBotInput implements InputType {
    private final Input<String> createdAt;
    private final Input<String> id;
    private final String masterBotId;
    private final String specializedBotId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String masterBotId;
        private String specializedBotId;
        private Input<String> id = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public CreateMasterBotSpecializedBotInput build() {
            Utils.checkNotNull(this.masterBotId, "masterBotId == null");
            Utils.checkNotNull(this.specializedBotId, "specializedBotId == null");
            return new CreateMasterBotSpecializedBotInput(this.id, this.masterBotId, this.specializedBotId, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder masterBotId(String str) {
            this.masterBotId = str;
            return this;
        }

        public Builder specializedBotId(String str) {
            this.specializedBotId = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateMasterBotSpecializedBotInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3) {
        this.id = input;
        this.masterBotId = str;
        this.specializedBotId = str2;
        this.createdAt = input2;
        this.updatedAt = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateMasterBotSpecializedBotInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateMasterBotSpecializedBotInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateMasterBotSpecializedBotInput.this.id.value);
                }
                inputFieldWriter.writeString("masterBotId", CreateMasterBotSpecializedBotInput.this.masterBotId);
                inputFieldWriter.writeString("specializedBotId", CreateMasterBotSpecializedBotInput.this.specializedBotId);
                if (CreateMasterBotSpecializedBotInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateMasterBotSpecializedBotInput.this.createdAt.value);
                }
                if (CreateMasterBotSpecializedBotInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateMasterBotSpecializedBotInput.this.updatedAt.value);
                }
            }
        };
    }

    public String masterBotId() {
        return this.masterBotId;
    }

    public String specializedBotId() {
        return this.specializedBotId;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
