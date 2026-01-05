package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class BusinessDetailInput implements InputType {
    private final String id;
    private final Input<String> industry;
    private final String name;
    private final Input<String> website;

    public static final class Builder {
        private String id;
        private String name;
        private Input<String> website = Input.absent();
        private Input<String> industry = Input.absent();

        public BusinessDetailInput build() {
            Utils.checkNotNull(this.id, "id == null");
            Utils.checkNotNull(this.name, "name == null");
            return new BusinessDetailInput(this.id, this.name, this.website, this.industry);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder industry(String str) {
            this.industry = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder website(String str) {
            this.website = Input.fromNullable(str);
            return this;
        }
    }

    public BusinessDetailInput(String str, String str2, Input<String> input, Input<String> input2) {
        this.id = str;
        this.name = str2;
        this.website = input;
        this.industry = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String id() {
        return this.id;
    }

    public String industry() {
        return this.industry.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.BusinessDetailInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, BusinessDetailInput.this.id);
                inputFieldWriter.writeString("name", BusinessDetailInput.this.name);
                if (BusinessDetailInput.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) BusinessDetailInput.this.website.value);
                }
                if (BusinessDetailInput.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) BusinessDetailInput.this.industry.value);
                }
            }
        };
    }

    public String name() {
        return this.name;
    }

    public String website() {
        return this.website.value;
    }
}
