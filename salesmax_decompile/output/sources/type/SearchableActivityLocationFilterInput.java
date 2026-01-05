package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableActivityLocationFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableActivityLocationFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> engagementId;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> lat;
    private final Input<SearchableStringFilterInput> lng;
    private final Input<SearchableActivityLocationFilterInput> not;
    private final Input<List<SearchableActivityLocationFilterInput>> or;
    private final Input<SearchableIDFilterInput> ownerId;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> engagementId = Input.absent();
        private Input<SearchableStringFilterInput> lat = Input.absent();
        private Input<SearchableStringFilterInput> lng = Input.absent();
        private Input<SearchableIDFilterInput> ownerId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableActivityLocationFilterInput>> and = Input.absent();
        private Input<List<SearchableActivityLocationFilterInput>> or = Input.absent();
        private Input<SearchableActivityLocationFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableActivityLocationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableActivityLocationFilterInput build() {
            return new SearchableActivityLocationFilterInput(this.id, this.accountId, this.engagementId, this.lat, this.lng, this.ownerId, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder engagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.engagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder lat(SearchableStringFilterInput searchableStringFilterInput) {
            this.lat = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder lng(SearchableStringFilterInput searchableStringFilterInput) {
            this.lng = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableActivityLocationFilterInput searchableActivityLocationFilterInput) {
            this.not = Input.fromNullable(searchableActivityLocationFilterInput);
            return this;
        }

        public Builder or(List<SearchableActivityLocationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder ownerId(SearchableIDFilterInput searchableIDFilterInput) {
            this.ownerId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableActivityLocationFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<List<SearchableActivityLocationFilterInput>> input9, Input<List<SearchableActivityLocationFilterInput>> input10, Input<SearchableActivityLocationFilterInput> input11) {
        this.id = input;
        this.accountId = input2;
        this.engagementId = input3;
        this.lat = input4;
        this.lng = input5;
        this.ownerId = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
        this.and = input9;
        this.or = input10;
        this.not = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableActivityLocationFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput engagementId() {
        return this.engagementId.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput lat() {
        return this.lat.value;
    }

    public SearchableStringFilterInput lng() {
        return this.lng.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableActivityLocationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableActivityLocationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableActivityLocationFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableActivityLocationFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableActivityLocationFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityLocationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", SearchableActivityLocationFilterInput.this.engagementId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityLocationFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.lat.defined) {
                    inputFieldWriter.writeObject("lat", SearchableActivityLocationFilterInput.this.lat.value != 0 ? ((SearchableStringFilterInput) SearchableActivityLocationFilterInput.this.lat.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.lng.defined) {
                    inputFieldWriter.writeObject("lng", SearchableActivityLocationFilterInput.this.lng.value != 0 ? ((SearchableStringFilterInput) SearchableActivityLocationFilterInput.this.lng.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.ownerId.defined) {
                    inputFieldWriter.writeObject("ownerId", SearchableActivityLocationFilterInput.this.ownerId.value != 0 ? ((SearchableIDFilterInput) SearchableActivityLocationFilterInput.this.ownerId.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableActivityLocationFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableActivityLocationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableActivityLocationFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableActivityLocationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableActivityLocationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableActivityLocationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableActivityLocationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableActivityLocationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableActivityLocationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableActivityLocationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableActivityLocationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableActivityLocationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableActivityLocationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableActivityLocationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableActivityLocationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableActivityLocationFilterInput.this.not.value != 0 ? ((SearchableActivityLocationFilterInput) SearchableActivityLocationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableActivityLocationFilterInput not() {
        return this.not.value;
    }

    public List<SearchableActivityLocationFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput ownerId() {
        return this.ownerId.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
