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
public final class UpdateBusinessInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> addedById;
    private final Input<List<AddressInput>> addresses;
    private final Input<String> createdAt;
    private final Input<String> domain;
    private final String id;
    private final Input<String> industry;
    private final Input<String> logo;
    private final Input<String> name;
    private final Input<String> priority;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;
    private final Input<List<String>> userDefinedTags;
    private final Input<String> website;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> name = Input.absent();
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
            this.accountId = Input.fromNullable(str);
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

        public UpdateBusinessInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateBusinessInput(this.id, this.accountId, this.name, this.addresses, this.industry, this.priority, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt);
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
            this.id = str;
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
            this.name = Input.fromNullable(str);
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

    public UpdateBusinessInput(String str, Input<String> input, Input<String> input2, Input<List<AddressInput>> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<List<String>> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13) {
        this.id = str;
        this.accountId = input;
        this.name = input2;
        this.addresses = input3;
        this.industry = input4;
        this.priority = input5;
        this.website = input6;
        this.domain = input7;
        this.logo = input8;
        this.userDefinedTags = input9;
        this.addedById = input10;
        this.updatedById = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
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
        return this.id;
    }

    public String industry() {
        return this.industry.value;
    }

    public String logo() {
        return this.logo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateBusinessInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateBusinessInput.this.id);
                if (UpdateBusinessInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateBusinessInput.this.accountId.value);
                }
                if (UpdateBusinessInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) UpdateBusinessInput.this.name.value);
                }
                if (UpdateBusinessInput.this.addresses.defined) {
                    inputFieldWriter.writeList("addresses", UpdateBusinessInput.this.addresses.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateBusinessInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateBusinessInput.this.addresses.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AddressInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateBusinessInput.this.industry.defined) {
                    inputFieldWriter.writeString("industry", (String) UpdateBusinessInput.this.industry.value);
                }
                if (UpdateBusinessInput.this.priority.defined) {
                    inputFieldWriter.writeString("priority", (String) UpdateBusinessInput.this.priority.value);
                }
                if (UpdateBusinessInput.this.website.defined) {
                    inputFieldWriter.writeString("website", (String) UpdateBusinessInput.this.website.value);
                }
                if (UpdateBusinessInput.this.domain.defined) {
                    inputFieldWriter.writeString(ClientCookie.DOMAIN_ATTR, (String) UpdateBusinessInput.this.domain.value);
                }
                if (UpdateBusinessInput.this.logo.defined) {
                    inputFieldWriter.writeString("logo", (String) UpdateBusinessInput.this.logo.value);
                }
                if (UpdateBusinessInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeList("userDefinedTags", UpdateBusinessInput.this.userDefinedTags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateBusinessInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateBusinessInput.this.userDefinedTags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateBusinessInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) UpdateBusinessInput.this.addedById.value);
                }
                if (UpdateBusinessInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateBusinessInput.this.updatedById.value);
                }
                if (UpdateBusinessInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateBusinessInput.this.createdAt.value);
                }
                if (UpdateBusinessInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateBusinessInput.this.updatedAt.value);
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
