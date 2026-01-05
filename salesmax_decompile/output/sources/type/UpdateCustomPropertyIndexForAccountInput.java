package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class UpdateCustomPropertyIndexForAccountInput implements InputType {
    private final String accountId;
    private final Input<Integer> boolIndex;
    private final Input<Integer> boolIndexUser;
    private final Input<String> createdAt;
    private final Input<Integer> numIndex;
    private final Input<Integer> numIndexUser;
    private final Input<Integer> textIndex;
    private final Input<Integer> textIndexUser;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private Input<Integer> textIndex = Input.absent();
        private Input<Integer> numIndex = Input.absent();
        private Input<Integer> boolIndex = Input.absent();
        private Input<Integer> textIndexUser = Input.absent();
        private Input<Integer> numIndexUser = Input.absent();
        private Input<Integer> boolIndexUser = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder boolIndex(Integer num) {
            this.boolIndex = Input.fromNullable(num);
            return this;
        }

        public Builder boolIndexUser(Integer num) {
            this.boolIndexUser = Input.fromNullable(num);
            return this;
        }

        public UpdateCustomPropertyIndexForAccountInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new UpdateCustomPropertyIndexForAccountInput(this.accountId, this.textIndex, this.numIndex, this.boolIndex, this.textIndexUser, this.numIndexUser, this.boolIndexUser, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder numIndex(Integer num) {
            this.numIndex = Input.fromNullable(num);
            return this;
        }

        public Builder numIndexUser(Integer num) {
            this.numIndexUser = Input.fromNullable(num);
            return this;
        }

        public Builder textIndex(Integer num) {
            this.textIndex = Input.fromNullable(num);
            return this;
        }

        public Builder textIndexUser(Integer num) {
            this.textIndexUser = Input.fromNullable(num);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCustomPropertyIndexForAccountInput(String str, Input<Integer> input, Input<Integer> input2, Input<Integer> input3, Input<Integer> input4, Input<Integer> input5, Input<Integer> input6, Input<String> input7, Input<String> input8) {
        this.accountId = str;
        this.textIndex = input;
        this.numIndex = input2;
        this.boolIndex = input3;
        this.textIndexUser = input4;
        this.numIndexUser = input5;
        this.boolIndexUser = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Integer boolIndex() {
        return this.boolIndex.value;
    }

    public Integer boolIndexUser() {
        return this.boolIndexUser.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomPropertyIndexForAccountInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", UpdateCustomPropertyIndexForAccountInput.this.accountId);
                if (UpdateCustomPropertyIndexForAccountInput.this.textIndex.defined) {
                    inputFieldWriter.writeInt("textIndex", (Integer) UpdateCustomPropertyIndexForAccountInput.this.textIndex.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.numIndex.defined) {
                    inputFieldWriter.writeInt("numIndex", (Integer) UpdateCustomPropertyIndexForAccountInput.this.numIndex.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.boolIndex.defined) {
                    inputFieldWriter.writeInt("boolIndex", (Integer) UpdateCustomPropertyIndexForAccountInput.this.boolIndex.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.textIndexUser.defined) {
                    inputFieldWriter.writeInt("textIndexUser", (Integer) UpdateCustomPropertyIndexForAccountInput.this.textIndexUser.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.numIndexUser.defined) {
                    inputFieldWriter.writeInt("numIndexUser", (Integer) UpdateCustomPropertyIndexForAccountInput.this.numIndexUser.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.boolIndexUser.defined) {
                    inputFieldWriter.writeInt("boolIndexUser", (Integer) UpdateCustomPropertyIndexForAccountInput.this.boolIndexUser.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomPropertyIndexForAccountInput.this.createdAt.value);
                }
                if (UpdateCustomPropertyIndexForAccountInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomPropertyIndexForAccountInput.this.updatedAt.value);
                }
            }
        };
    }

    public Integer numIndex() {
        return this.numIndex.value;
    }

    public Integer numIndexUser() {
        return this.numIndexUser.value;
    }

    public Integer textIndex() {
        return this.textIndex.value;
    }

    public Integer textIndexUser() {
        return this.textIndexUser.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
