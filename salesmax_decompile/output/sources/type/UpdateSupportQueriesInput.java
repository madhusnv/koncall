package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateSupportQueriesInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> category;
    private final Input<String> createdAt;
    private final String id;
    private final Input<String> query;
    private final Input<String> queryType;
    private final Input<String> userId;

    public static final class Builder {
        private String id;
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

        public UpdateSupportQueriesInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateSupportQueriesInput(this.id, this.accountId, this.userId, this.query, this.category, this.queryType, this.createdAt);
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
            this.id = str;
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

    public UpdateSupportQueriesInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.id = str;
        this.accountId = input;
        this.userId = input2;
        this.query = input3;
        this.category = input4;
        this.queryType = input5;
        this.createdAt = input6;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateSupportQueriesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateSupportQueriesInput.this.id);
                if (UpdateSupportQueriesInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateSupportQueriesInput.this.accountId.value);
                }
                if (UpdateSupportQueriesInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) UpdateSupportQueriesInput.this.userId.value);
                }
                if (UpdateSupportQueriesInput.this.query.defined) {
                    inputFieldWriter.writeString(SearchIntents.EXTRA_QUERY, (String) UpdateSupportQueriesInput.this.query.value);
                }
                if (UpdateSupportQueriesInput.this.category.defined) {
                    inputFieldWriter.writeString("category", (String) UpdateSupportQueriesInput.this.category.value);
                }
                if (UpdateSupportQueriesInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", (String) UpdateSupportQueriesInput.this.queryType.value);
                }
                if (UpdateSupportQueriesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateSupportQueriesInput.this.createdAt.value);
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
