package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes7.dex */
public final class CreateBusinessInput implements InputType {
    private final String accountId;
    private final Input<String> addedById;
    private final Input<List<AddressInput>> addresses;
    private final Input<String> createdAt;
    private final Input<String> domain;
    private final Input<String> id;
    private final Input<String> industry;
    private final Input<String> logo;
    private final String name;
    private final Input<String> priority;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<List<String>> userDefinedTags;
    private final Input<String> website;

    public static final class Builder {
        private String accountId;
        private String name;
        private Input<String> id = Input.absent();
        private Input<List<AddressInput>> addresses = Input.absent();
        private Input<String> industry = Input.absent();
        private Input<String> priority = Input.absent();
        private Input<String> website = Input.absent();
        private Input<String> domain = Input.absent();
        private Input<String> logo = Input.absent();
        private Input<List<String>> userDefinedTags = Input.absent();
        private Input<String> addedById = Input.absent();
        private Input<String> updatedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder addedById(String str) {
            this.addedById = Input.fromNullable(str);
            return this;
        }

        public Builder addresses(List<AddressInput> list) {
            this.addresses = Input.fromNullable(list);
            return this;
        }

        public CreateBusinessInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.name, "name == null");
            return new CreateBusinessInput(this.id, this.accountId, this.name, this.addresses, this.industry, this.priority, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder domain(String str) {
            this.domain = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder industry(String str) {
            this.industry = Input.fromNullable(str);
            return this;
        }

        public Builder logo(String str) {
            this.logo = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder priority(String str) {
            this.priority = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }

        public Builder userDefinedTags(List<String> list) {
            this.userDefinedTags = Input.fromNullable(list);
            return this;
        }

        public Builder website(String str) {
            this.website = Input.fromNullable(str);
            return this;
        }
    }

    public CreateBusinessInput(Input<String> input, String str, String str2, Input<List<AddressInput>> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<List<String>> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12) {
        this.id = input;
        this.accountId = str;
        this.name = str2;
        this.addresses = input2;
        this.industry = input3;
        this.priority = input4;
        this.website = input5;
        this.domain = input6;
        this.logo = input7;
        this.userDefinedTags = input8;
        this.addedById = input9;
        this.updatedById = input10;
        this.createdAt = input11;
        this.updatedAt = input12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String addedById() {
        return this.addedById.value;
    }

    public List<AddressInput> addresses() {
        return this.addresses.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String domain() {
        return this.domain.value;
    }

    public String id() {
        return this.id.value;
    }

    public String industry() {
        return this.industry.value;
    }

    public String logo() {
        return this.logo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateBusinessInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateBusinessInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateBusinessInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateBusinessInput.this.accountId);
                inputFieldWriter.writeString("name", CreateBusinessInput.this.name);
                if (CreateBusinessInput.this.addresses.defined) {
                    inputFieldWriter.writeList("addresses", CreateBusinessInput.this.addresses.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateBusinessInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateBusinessInput.this.addresses.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AddressInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateBusinessInput.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) CreateBusinessInput.this.industry.value);
                }
                if (CreateBusinessInput.this.priority.defined) {
                    inputFieldWriter.writeString("priority", (String) CreateBusinessInput.this.priority.value);
                }
                if (CreateBusinessInput.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) CreateBusinessInput.this.website.value);
                }
                if (CreateBusinessInput.this.domain.defined) {
                    inputFieldWriter.writeString(ClientCookie.DOMAIN_ATTR, (String) CreateBusinessInput.this.domain.value);
                }
                if (CreateBusinessInput.this.logo.defined) {
                    inputFieldWriter.writeString("logo", (String) CreateBusinessInput.this.logo.value);
                }
                if (CreateBusinessInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeList("userDefinedTags", CreateBusinessInput.this.userDefinedTags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateBusinessInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateBusinessInput.this.userDefinedTags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateBusinessInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) CreateBusinessInput.this.addedById.value);
                }
                if (CreateBusinessInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateBusinessInput.this.updatedById.value);
                }
                if (CreateBusinessInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateBusinessInput.this.createdAt.value);
                }
                if (CreateBusinessInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateBusinessInput.this.updatedAt.value);
                }
            }
        };
    }

    public String name() {
        return this.name;
    }

    public String priority() {
        return this.priority.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }

    public List<String> userDefinedTags() {
        return this.userDefinedTags.value;
    }

    public String website() {
        return this.website.value;
    }
}
