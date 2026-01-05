package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes7.dex */
public final class SearchableBusinessFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<SearchableIDFilterInput> addedById;
    private final Input<SearchableStringFilterInput> addresses__rawAddressText;
    private final Input<List<SearchableBusinessFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> domain;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> industry;
    private final Input<SearchableStringFilterInput> logo;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableBusinessFilterInput> not;
    private final Input<List<SearchableBusinessFilterInput>> or;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedById;
    private final Input<SearchableStringFilterInput> userDefinedTags;
    private final Input<SearchableStringFilterInput> website;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> addresses__rawAddressText = Input.absent();
        private Input<SearchableStringFilterInput> industry = Input.absent();
        private Input<SearchableStringFilterInput> website = Input.absent();
        private Input<SearchableStringFilterInput> domain = Input.absent();
        private Input<SearchableStringFilterInput> logo = Input.absent();
        private Input<SearchableStringFilterInput> userDefinedTags = Input.absent();
        private Input<SearchableIDFilterInput> addedById = Input.absent();
        private Input<SearchableIDFilterInput> updatedById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableBusinessFilterInput>> and = Input.absent();
        private Input<List<SearchableBusinessFilterInput>> or = Input.absent();
        private Input<SearchableBusinessFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.addedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder addresses__rawAddressText(SearchableStringFilterInput searchableStringFilterInput) {
            this.addresses__rawAddressText = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder and(List<SearchableBusinessFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableBusinessFilterInput build() {
            return new SearchableBusinessFilterInput(this.id, this.accountId, this.name, this.addresses__rawAddressText, this.industry, this.website, this.domain, this.logo, this.userDefinedTags, this.addedById, this.updatedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder domain(SearchableStringFilterInput searchableStringFilterInput) {
            this.domain = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder industry(SearchableStringFilterInput searchableStringFilterInput) {
            this.industry = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder logo(SearchableStringFilterInput searchableStringFilterInput) {
            this.logo = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableBusinessFilterInput searchableBusinessFilterInput) {
            this.not = Input.fromNullable(searchableBusinessFilterInput);
            return this;
        }

        public Builder or(List<SearchableBusinessFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder userDefinedTags(SearchableStringFilterInput searchableStringFilterInput) {
            this.userDefinedTags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder website(SearchableStringFilterInput searchableStringFilterInput) {
            this.website = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableBusinessFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableIDFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<List<SearchableBusinessFilterInput>> input14, Input<List<SearchableBusinessFilterInput>> input15, Input<SearchableBusinessFilterInput> input16) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.addresses__rawAddressText = input4;
        this.industry = input5;
        this.website = input6;
        this.domain = input7;
        this.logo = input8;
        this.userDefinedTags = input9;
        this.addedById = input10;
        this.updatedById = input11;
        this.createdAt = input12;
        this.updatedAt = input13;
        this.and = input14;
        this.or = input15;
        this.not = input16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public SearchableIDFilterInput addedById() {
        return this.addedById.value;
    }

    public SearchableStringFilterInput addresses__rawAddressText() {
        return this.addresses__rawAddressText.value;
    }

    public List<SearchableBusinessFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput domain() {
        return this.domain.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput industry() {
        return this.industry.value;
    }

    public SearchableStringFilterInput logo() {
        return this.logo.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableBusinessFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableBusinessFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableBusinessFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableBusinessFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableBusinessFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableBusinessFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableBusinessFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.addresses__rawAddressText.defined) {
                    inputFieldWriter.writeObject("addresses__rawAddressText", SearchableBusinessFilterInput.this.addresses__rawAddressText.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.addresses__rawAddressText.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.industry.defined) {
                    inputFieldWriter.writeObject("industry", SearchableBusinessFilterInput.this.industry.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.industry.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.website.defined) {
                    inputFieldWriter.writeObject("website", SearchableBusinessFilterInput.this.website.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.website.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.domain.defined) {
                    inputFieldWriter.writeObject(ClientCookie.DOMAIN_ATTR, SearchableBusinessFilterInput.this.domain.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.domain.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.logo.defined) {
                    inputFieldWriter.writeObject("logo", SearchableBusinessFilterInput.this.logo.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.logo.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.userDefinedTags.defined) {
                    inputFieldWriter.writeObject("userDefinedTags", SearchableBusinessFilterInput.this.userDefinedTags.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.userDefinedTags.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.addedById.defined) {
                    inputFieldWriter.writeObject("addedById", SearchableBusinessFilterInput.this.addedById.value != 0 ? ((SearchableIDFilterInput) SearchableBusinessFilterInput.this.addedById.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.updatedById.defined) {
                    inputFieldWriter.writeObject("updatedById", SearchableBusinessFilterInput.this.updatedById.value != 0 ? ((SearchableIDFilterInput) SearchableBusinessFilterInput.this.updatedById.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableBusinessFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableBusinessFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableBusinessFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableBusinessFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableBusinessFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableBusinessFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableBusinessFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableBusinessFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableBusinessFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableBusinessFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableBusinessFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableBusinessFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableBusinessFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableBusinessFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableBusinessFilterInput.this.not.value != 0 ? ((SearchableBusinessFilterInput) SearchableBusinessFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableBusinessFilterInput not() {
        return this.not.value;
    }

    public List<SearchableBusinessFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedById() {
        return this.updatedById.value;
    }

    public SearchableStringFilterInput userDefinedTags() {
        return this.userDefinedTags.value;
    }

    public SearchableStringFilterInput website() {
        return this.website.value;
    }
}
