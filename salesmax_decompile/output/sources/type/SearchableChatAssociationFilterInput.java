package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableChatAssociationFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableChatAssociationFilterInput>> and;
    private final Input<SearchableIDFilterInput> channelId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableChatAssociationFilterInput> not;
    private final Input<List<SearchableChatAssociationFilterInput>> or;
    private final Input<SearchableIDFilterInput> relatedObjectId;
    private final Input<SearchableStringFilterInput> relatedObjectType;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> channelId = Input.absent();
        private Input<SearchableIDFilterInput> relatedObjectId = Input.absent();
        private Input<SearchableStringFilterInput> relatedObjectType = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableChatAssociationFilterInput>> and = Input.absent();
        private Input<List<SearchableChatAssociationFilterInput>> or = Input.absent();
        private Input<SearchableChatAssociationFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableChatAssociationFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableChatAssociationFilterInput build() {
            return new SearchableChatAssociationFilterInput(this.id, this.accountId, this.channelId, this.relatedObjectId, this.relatedObjectType, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder channelId(SearchableIDFilterInput searchableIDFilterInput) {
            this.channelId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableChatAssociationFilterInput searchableChatAssociationFilterInput) {
            this.not = Input.fromNullable(searchableChatAssociationFilterInput);
            return this;
        }

        public Builder or(List<SearchableChatAssociationFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder relatedObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.relatedObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder relatedObjectType(SearchableStringFilterInput searchableStringFilterInput) {
            this.relatedObjectType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableChatAssociationFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableIDFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<List<SearchableChatAssociationFilterInput>> input8, Input<List<SearchableChatAssociationFilterInput>> input9, Input<SearchableChatAssociationFilterInput> input10) {
        this.id = input;
        this.accountId = input2;
        this.channelId = input3;
        this.relatedObjectId = input4;
        this.relatedObjectType = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
        this.and = input8;
        this.or = input9;
        this.not = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableChatAssociationFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput channelId() {
        return this.channelId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableChatAssociationFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableChatAssociationFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableChatAssociationFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableChatAssociationFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableChatAssociationFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableChatAssociationFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.channelId.defined) {
                    inputFieldWriter.writeObject("channelId", SearchableChatAssociationFilterInput.this.channelId.value != 0 ? ((SearchableIDFilterInput) SearchableChatAssociationFilterInput.this.channelId.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.relatedObjectId.defined) {
                    inputFieldWriter.writeObject("relatedObjectId", SearchableChatAssociationFilterInput.this.relatedObjectId.value != 0 ? ((SearchableIDFilterInput) SearchableChatAssociationFilterInput.this.relatedObjectId.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.relatedObjectType.defined) {
                    inputFieldWriter.writeObject("relatedObjectType", SearchableChatAssociationFilterInput.this.relatedObjectType.value != 0 ? ((SearchableStringFilterInput) SearchableChatAssociationFilterInput.this.relatedObjectType.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableChatAssociationFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatAssociationFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableChatAssociationFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableChatAssociationFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableChatAssociationFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableChatAssociationFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatAssociationFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatAssociationFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatAssociationFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableChatAssociationFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableChatAssociationFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableChatAssociationFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableChatAssociationFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableChatAssociationFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableChatAssociationFilterInput.this.not.value != 0 ? ((SearchableChatAssociationFilterInput) SearchableChatAssociationFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableChatAssociationFilterInput not() {
        return this.not.value;
    }

    public List<SearchableChatAssociationFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput relatedObjectId() {
        return this.relatedObjectId.value;
    }

    public SearchableStringFilterInput relatedObjectType() {
        return this.relatedObjectType.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
