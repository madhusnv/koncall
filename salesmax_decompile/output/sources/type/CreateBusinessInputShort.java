package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateBusinessInputShort implements InputType {
    private final String accountId;
    private final Input<String> id;
    private final Input<String> industry;
    private final Input<String> name;
    private final Input<String> priority;
    private final Input<String> website;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> industry = Input.absent();
        private Input<String> priority = Input.absent();
        private Input<String> website = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateBusinessInputShort build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateBusinessInputShort(this.id, this.accountId, this.name, this.industry, this.priority, this.website);
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder industry(String str) {
            this.industry = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder priority(String str) {
            this.priority = Input.fromNullable(str);
            return this;
        }

        public Builder website(String str) {
            this.website = Input.fromNullable(str);
            return this;
        }
    }

    public CreateBusinessInputShort(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.id = input;
        this.accountId = str;
        this.name = input2;
        this.industry = input3;
        this.priority = input4;
        this.website = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String id() {
        return this.id.value;
    }

    public String industry() {
        return this.industry.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateBusinessInputShort.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateBusinessInputShort.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateBusinessInputShort.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateBusinessInputShort.this.accountId);
                if (CreateBusinessInputShort.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateBusinessInputShort.this.name.value);
                }
                if (CreateBusinessInputShort.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) CreateBusinessInputShort.this.industry.value);
                }
                if (CreateBusinessInputShort.this.priority.defined) {
                    inputFieldWriter.writeString("priority", (String) CreateBusinessInputShort.this.priority.value);
                }
                if (CreateBusinessInputShort.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) CreateBusinessInputShort.this.website.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String priority() {
        return this.priority.value;
    }

    public String website() {
        return this.website.value;
    }
}
