package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryFetchDealAmountQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdFrom;
    private final Input<String> createdTill;
    private final Input<String> dealStageUpdatedFrom;
    private final Input<String> dealStageUpdatedTill;
    private final Input<String> teamId;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> userId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<String> createdFrom = Input.absent();
        private Input<String> createdTill = Input.absent();
        private Input<String> dealStageUpdatedFrom = Input.absent();
        private Input<String> dealStageUpdatedTill = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public QueryFetchDealAmountQueryInput build() {
            return new QueryFetchDealAmountQueryInput(this.accountId, this.userId, this.teamId, this.createdFrom, this.createdTill, this.dealStageUpdatedFrom, this.dealStageUpdatedTill);
        }

        public Builder createdFrom(String str) {
            this.createdFrom = Input.fromNullable(str);
            return this;
        }

        public Builder createdTill(String str) {
            this.createdTill = Input.fromNullable(str);
            return this;
        }

        public Builder dealStageUpdatedFrom(String str) {
            this.dealStageUpdatedFrom = Input.fromNullable(str);
            return this;
        }

        public Builder dealStageUpdatedTill(String str) {
            this.dealStageUpdatedTill = Input.fromNullable(str);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryFetchDealAmountQueryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.accountId = input;
        this.userId = input2;
        this.teamId = input3;
        this.createdFrom = input4;
        this.createdTill = input5;
        this.dealStageUpdatedFrom = input6;
        this.dealStageUpdatedTill = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdFrom() {
        return this.createdFrom.value;
    }

    public String createdTill() {
        return this.createdTill.value;
    }

    public String dealStageUpdatedFrom() {
        return this.dealStageUpdatedFrom.value;
    }

    public String dealStageUpdatedTill() {
        return this.dealStageUpdatedTill.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryFetchDealAmountQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryFetchDealAmountQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryFetchDealAmountQueryInput.this.accountId.value);
                }
                if (QueryFetchDealAmountQueryInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) QueryFetchDealAmountQueryInput.this.userId.value);
                }
                if (QueryFetchDealAmountQueryInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) QueryFetchDealAmountQueryInput.this.teamId.value);
                }
                if (QueryFetchDealAmountQueryInput.this.createdFrom.defined) {
                    inputFieldWriter.writeString("createdFrom", (String) QueryFetchDealAmountQueryInput.this.createdFrom.value);
                }
                if (QueryFetchDealAmountQueryInput.this.createdTill.defined) {
                    inputFieldWriter.writeString("createdTill", (String) QueryFetchDealAmountQueryInput.this.createdTill.value);
                }
                if (QueryFetchDealAmountQueryInput.this.dealStageUpdatedFrom.defined) {
                    inputFieldWriter.writeString("dealStageUpdatedFrom", (String) QueryFetchDealAmountQueryInput.this.dealStageUpdatedFrom.value);
                }
                if (QueryFetchDealAmountQueryInput.this.dealStageUpdatedTill.defined) {
                    inputFieldWriter.writeString("dealStageUpdatedTill", (String) QueryFetchDealAmountQueryInput.this.dealStageUpdatedTill.value);
                }
            }
        };
    }

    public String teamId() {
        return this.teamId.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
