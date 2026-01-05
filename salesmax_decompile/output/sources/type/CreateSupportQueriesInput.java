package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateSupportQueriesInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> category;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final Input<String> query;
    private final Input<String> queryType;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> query = Input.absent();
        private Input<String> category = Input.absent();
        private Input<String> queryType = Input.absent();
        private Input<String> createdAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public CreateSupportQueriesInput build() {
            return new CreateSupportQueriesInput(this.id, this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt);
        }

        public Builder category(String str) {
            this.category = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder query(String str) {
            this.query = Input.fromNullable(str);
            return this;
        }

        public Builder queryType(String str) {
            this.queryType = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public CreateSupportQueriesInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = input;
        this.accountId = input2;
        this.userId = input3;
        this.query = input4;
        this.category = input5;
        this.queryType = input6;
        this.createdAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String category() {
        return this.category.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateSupportQueriesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateSupportQueriesInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateSupportQueriesInput.this.id.value);
                }
                if (CreateSupportQueriesInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) CreateSupportQueriesInput.this.accountId.value);
                }
                if (CreateSupportQueriesInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) CreateSupportQueriesInput.this.userId.value);
                }
                if (CreateSupportQueriesInput.this.query.defined) {
                    inputFieldWriter.writeString(SearchIntents.EXTRA_QUERY, (String) CreateSupportQueriesInput.this.query.value);
                }
                if (CreateSupportQueriesInput.this.category.defined) {
                    inputFieldWriter.writeString("category", (String) CreateSupportQueriesInput.this.category.value);
                }
                if (CreateSupportQueriesInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", (String) CreateSupportQueriesInput.this.queryType.value);
                }
                if (CreateSupportQueriesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateSupportQueriesInput.this.createdAt.value);
                }
            }
        };
    }

    public String query() {
        return this.query.value;
    }

    public String queryType() {
        return this.queryType.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
