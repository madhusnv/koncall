package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchablefileObjectRelationshipFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchablefileObjectRelationshipFilterInput>> and;
    private final Input<SearchableIDFilterInput> businessId;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> dealId;
    private final Input<SearchableIDFilterInput> engagementId;
    private final Input<SearchableStringFilterInput> fieldName;
    private final Input<SearchableIDFilterInput> fileId;
    private final Input<SearchableStringFilterInput> fileUrl;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableStringFilterInput> inputContext;
    private final Input<SearchablefileObjectRelationshipFilterInput> not;
    private final Input<List<SearchablefileObjectRelationshipFilterInput>> or;
    private final Input<SearchableIDFilterInput> parentObjectId;
    private final Input<SearchableStringFilterInput> parentObjectType;
    private final Input<SearchableIDFilterInput> productId;
    private final Input<SearchableStringFilterInput> transcription;
    private final Input<SearchableStringFilterInput> translatedTranscription;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableIDFilterInput> fileId = Input.absent();
        private Input<SearchableStringFilterInput> fileUrl = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> engagementId = Input.absent();
        private Input<SearchableIDFilterInput> businessId = Input.absent();
        private Input<SearchableIDFilterInput> dealId = Input.absent();
        private Input<SearchableIDFilterInput> productId = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableIDFilterInput> parentObjectId = Input.absent();
        private Input<SearchableStringFilterInput> parentObjectType = Input.absent();
        private Input<SearchableStringFilterInput> fieldName = Input.absent();
        private Input<SearchableStringFilterInput> inputContext = Input.absent();
        private Input<SearchableStringFilterInput> transcription = Input.absent();
        private Input<SearchableStringFilterInput> translatedTranscription = Input.absent();
        private Input<List<SearchablefileObjectRelationshipFilterInput>> and = Input.absent();
        private Input<List<SearchablefileObjectRelationshipFilterInput>> or = Input.absent();
        private Input<SearchablefileObjectRelationshipFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchablefileObjectRelationshipFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchablefileObjectRelationshipFilterInput build() {
            return new SearchablefileObjectRelationshipFilterInput(this.id, this.accountId, this.fileId, this.fileUrl, this.contactId, this.engagementId, this.businessId, this.dealId, this.productId, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription, this.and, this.or, this.not);
        }

        public Builder businessId(SearchableIDFilterInput searchableIDFilterInput) {
            this.businessId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder dealId(SearchableIDFilterInput searchableIDFilterInput) {
            this.dealId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder engagementId(SearchableIDFilterInput searchableIDFilterInput) {
            this.engagementId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder fieldName(SearchableStringFilterInput searchableStringFilterInput) {
            this.fieldName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileId(SearchableIDFilterInput searchableIDFilterInput) {
            this.fileId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder fileUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder inputContext(SearchableStringFilterInput searchableStringFilterInput) {
            this.inputContext = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchablefileObjectRelationshipFilterInput searchablefileObjectRelationshipFilterInput) {
            this.not = Input.fromNullable(searchablefileObjectRelationshipFilterInput);
            return this;
        }

        public Builder or(List<SearchablefileObjectRelationshipFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentObjectId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder parentObjectType(SearchableStringFilterInput searchableStringFilterInput) {
            this.parentObjectType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder productId(SearchableIDFilterInput searchableIDFilterInput) {
            this.productId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder transcription(SearchableStringFilterInput searchableStringFilterInput) {
            this.transcription = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder translatedTranscription(SearchableStringFilterInput searchableStringFilterInput) {
            this.translatedTranscription = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchablefileObjectRelationshipFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableIDFilterInput> input5, Input<SearchableIDFilterInput> input6, Input<SearchableIDFilterInput> input7, Input<SearchableIDFilterInput> input8, Input<SearchableIDFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableIDFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<List<SearchablefileObjectRelationshipFilterInput>> input18, Input<List<SearchablefileObjectRelationshipFilterInput>> input19, Input<SearchablefileObjectRelationshipFilterInput> input20) {
        this.id = input;
        this.accountId = input2;
        this.fileId = input3;
        this.fileUrl = input4;
        this.contactId = input5;
        this.engagementId = input6;
        this.businessId = input7;
        this.dealId = input8;
        this.productId = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
        this.parentObjectId = input12;
        this.parentObjectType = input13;
        this.fieldName = input14;
        this.inputContext = input15;
        this.transcription = input16;
        this.translatedTranscription = input17;
        this.and = input18;
        this.or = input19;
        this.not = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchablefileObjectRelationshipFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput businessId() {
        return this.businessId.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput dealId() {
        return this.dealId.value;
    }

    public SearchableIDFilterInput engagementId() {
        return this.engagementId.value;
    }

    public SearchableStringFilterInput fieldName() {
        return this.fieldName.value;
    }

    public SearchableIDFilterInput fileId() {
        return this.fileId.value;
    }

    public SearchableStringFilterInput fileUrl() {
        return this.fileUrl.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableStringFilterInput inputContext() {
        return this.inputContext.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchablefileObjectRelationshipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchablefileObjectRelationshipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchablefileObjectRelationshipFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchablefileObjectRelationshipFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.fileId.defined) {
                    inputFieldWriter.writeObject("fileId", SearchablefileObjectRelationshipFilterInput.this.fileId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.fileId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", SearchablefileObjectRelationshipFilterInput.this.fileUrl.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.fileUrl.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchablefileObjectRelationshipFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", SearchablefileObjectRelationshipFilterInput.this.engagementId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", SearchablefileObjectRelationshipFilterInput.this.businessId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.businessId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", SearchablefileObjectRelationshipFilterInput.this.dealId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.dealId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", SearchablefileObjectRelationshipFilterInput.this.productId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.productId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchablefileObjectRelationshipFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchablefileObjectRelationshipFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", SearchablefileObjectRelationshipFilterInput.this.parentObjectId.value != 0 ? ((SearchableIDFilterInput) SearchablefileObjectRelationshipFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", SearchablefileObjectRelationshipFilterInput.this.parentObjectType.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.fieldName.defined) {
                    inputFieldWriter.writeObject("fieldName", SearchablefileObjectRelationshipFilterInput.this.fieldName.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.fieldName.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.inputContext.defined) {
                    inputFieldWriter.writeObject("inputContext", SearchablefileObjectRelationshipFilterInput.this.inputContext.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.inputContext.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.transcription.defined) {
                    inputFieldWriter.writeObject("transcription", SearchablefileObjectRelationshipFilterInput.this.transcription.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.transcription.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.translatedTranscription.defined) {
                    inputFieldWriter.writeObject("translatedTranscription", SearchablefileObjectRelationshipFilterInput.this.translatedTranscription.value != 0 ? ((SearchableStringFilterInput) SearchablefileObjectRelationshipFilterInput.this.translatedTranscription.value).marshaller() : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchablefileObjectRelationshipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablefileObjectRelationshipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablefileObjectRelationshipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablefileObjectRelationshipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchablefileObjectRelationshipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchablefileObjectRelationshipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchablefileObjectRelationshipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchablefileObjectRelationshipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchablefileObjectRelationshipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchablefileObjectRelationshipFilterInput.this.not.value != 0 ? ((SearchablefileObjectRelationshipFilterInput) SearchablefileObjectRelationshipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchablefileObjectRelationshipFilterInput not() {
        return this.not.value;
    }

    public List<SearchablefileObjectRelationshipFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public SearchableStringFilterInput parentObjectType() {
        return this.parentObjectType.value;
    }

    public SearchableIDFilterInput productId() {
        return this.productId.value;
    }

    public SearchableStringFilterInput transcription() {
        return this.transcription.value;
    }

    public SearchableStringFilterInput translatedTranscription() {
        return this.translatedTranscription.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
