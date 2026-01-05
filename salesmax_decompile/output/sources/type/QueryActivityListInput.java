package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class QueryActivityListInput implements InputType {
    private final String accountId;
    private final Input<ModelStringKeyConditionInput> activityUpdatedAtInput;
    private final Input<String> contactId;
    private final Input<String> ownerId;
    private final Input<ActivityListQueryType> queryType;
    private final Input<String> teamId;

    public static final class Builder {
        private String accountId;
        private Input<String> ownerId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<ActivityListQueryType> queryType = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<ModelStringKeyConditionInput> activityUpdatedAtInput = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder activityUpdatedAtInput(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.activityUpdatedAtInput = Input.fromNullable(modelStringKeyConditionInput);
            return this;
        }

        public QueryActivityListInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new QueryActivityListInput(this.accountId, this.ownerId, this.teamId, this.queryType, this.contactId, this.activityUpdatedAtInput);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder queryType(ActivityListQueryType activityListQueryType) {
            this.queryType = Input.fromNullable(activityListQueryType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryActivityListInput(String str, Input<String> input, Input<String> input2, Input<ActivityListQueryType> input3, Input<String> input4, Input<ModelStringKeyConditionInput> input5) {
        this.accountId = str;
        this.ownerId = input;
        this.teamId = input2;
        this.queryType = input3;
        this.contactId = input4;
        this.activityUpdatedAtInput = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public ModelStringKeyConditionInput activityUpdatedAtInput() {
        return this.activityUpdatedAtInput.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryActivityListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", QueryActivityListInput.this.accountId);
                if (QueryActivityListInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) QueryActivityListInput.this.ownerId.value);
                }
                if (QueryActivityListInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) QueryActivityListInput.this.teamId.value);
                }
                if (QueryActivityListInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", QueryActivityListInput.this.queryType.value != 0 ? ((ActivityListQueryType) QueryActivityListInput.this.queryType.value).name() : null);
                }
                if (QueryActivityListInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) QueryActivityListInput.this.contactId.value);
                }
                if (QueryActivityListInput.this.activityUpdatedAtInput.defined) {
                    inputFieldWriter.writeObject("activityUpdatedAtInput", QueryActivityListInput.this.activityUpdatedAtInput.value != 0 ? ((ModelStringKeyConditionInput) QueryActivityListInput.this.activityUpdatedAtInput.value).marshaller() : null);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public ActivityListQueryType queryType() {
        return this.queryType.value;
    }

    public String teamId() {
        return this.teamId.value;
    }
}
