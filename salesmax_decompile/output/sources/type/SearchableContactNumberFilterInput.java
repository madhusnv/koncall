package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableContactNumberFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableContactNumberFilterInput>> and;
    private final Input<SearchableIDFilterInput> contactId;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableBooleanFilterInput> doNotTrack;
    private final Input<SearchableIDFilterInput> doNotTrackSetBy;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableBooleanFilterInput> isPrimary;
    private final Input<SearchableBooleanFilterInput> isSpam;
    private final Input<SearchableBooleanFilterInput> isValid;
    private final Input<SearchableBooleanFilterInput> isVerified;
    private final Input<SearchableBooleanFilterInput> isWhatsappNumber;
    private final Input<SearchableBooleanFilterInput> isWrongNumber;
    private final Input<SearchableContactNumberFilterInput> not;
    private final Input<List<SearchableContactNumberFilterInput>> or;
    private final Input<SearchableStringFilterInput> phoneNumber;
    private final Input<SearchableStringFilterInput> updatedAt;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> contactId = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableBooleanFilterInput> isPrimary = Input.absent();
        private Input<SearchableBooleanFilterInput> isValid = Input.absent();
        private Input<SearchableBooleanFilterInput> isVerified = Input.absent();
        private Input<SearchableBooleanFilterInput> isWhatsappNumber = Input.absent();
        private Input<SearchableBooleanFilterInput> isWrongNumber = Input.absent();
        private Input<SearchableBooleanFilterInput> isSpam = Input.absent();
        private Input<SearchableBooleanFilterInput> doNotTrack = Input.absent();
        private Input<SearchableIDFilterInput> doNotTrackSetBy = Input.absent();
        private Input<SearchableStringFilterInput> phoneNumber = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableContactNumberFilterInput>> and = Input.absent();
        private Input<List<SearchableContactNumberFilterInput>> or = Input.absent();
        private Input<SearchableContactNumberFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableContactNumberFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableContactNumberFilterInput build() {
            return new SearchableContactNumberFilterInput(this.id, this.contactId, this.accountId, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(SearchableIDFilterInput searchableIDFilterInput) {
            this.contactId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder doNotTrack(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.doNotTrack = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder doNotTrackSetBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.doNotTrackSetBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder isPrimary(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isPrimary = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isSpam(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isSpam = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isValid(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isValid = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isVerified(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isVerified = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isWhatsappNumber(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isWhatsappNumber = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder isWrongNumber(SearchableBooleanFilterInput searchableBooleanFilterInput) {
            this.isWrongNumber = Input.fromNullable(searchableBooleanFilterInput);
            return this;
        }

        public Builder not(SearchableContactNumberFilterInput searchableContactNumberFilterInput) {
            this.not = Input.fromNullable(searchableContactNumberFilterInput);
            return this;
        }

        public Builder or(List<SearchableContactNumberFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumber(SearchableStringFilterInput searchableStringFilterInput) {
            this.phoneNumber = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }
    }

    public SearchableContactNumberFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableIDFilterInput> input3, Input<SearchableBooleanFilterInput> input4, Input<SearchableBooleanFilterInput> input5, Input<SearchableBooleanFilterInput> input6, Input<SearchableBooleanFilterInput> input7, Input<SearchableBooleanFilterInput> input8, Input<SearchableBooleanFilterInput> input9, Input<SearchableBooleanFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<List<SearchableContactNumberFilterInput>> input15, Input<List<SearchableContactNumberFilterInput>> input16, Input<SearchableContactNumberFilterInput> input17) {
        this.id = input;
        this.contactId = input2;
        this.accountId = input3;
        this.isPrimary = input4;
        this.isValid = input5;
        this.isVerified = input6;
        this.isWhatsappNumber = input7;
        this.isWrongNumber = input8;
        this.isSpam = input9;
        this.doNotTrack = input10;
        this.doNotTrackSetBy = input11;
        this.phoneNumber = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
        this.and = input15;
        this.or = input16;
        this.not = input17;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableContactNumberFilterInput> and() {
        return this.and.value;
    }

    public SearchableIDFilterInput contactId() {
        return this.contactId.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableBooleanFilterInput doNotTrack() {
        return this.doNotTrack.value;
    }

    public SearchableIDFilterInput doNotTrackSetBy() {
        return this.doNotTrackSetBy.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableBooleanFilterInput isPrimary() {
        return this.isPrimary.value;
    }

    public SearchableBooleanFilterInput isSpam() {
        return this.isSpam.value;
    }

    public SearchableBooleanFilterInput isValid() {
        return this.isValid.value;
    }

    public SearchableBooleanFilterInput isVerified() {
        return this.isVerified.value;
    }

    public SearchableBooleanFilterInput isWhatsappNumber() {
        return this.isWhatsappNumber.value;
    }

    public SearchableBooleanFilterInput isWrongNumber() {
        return this.isWrongNumber.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableContactNumberFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableContactNumberFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableContactNumberFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableContactNumberFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", SearchableContactNumberFilterInput.this.contactId.value != 0 ? ((SearchableIDFilterInput) SearchableContactNumberFilterInput.this.contactId.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableContactNumberFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableContactNumberFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isPrimary.defined) {
                    inputFieldWriter.writeObject("isPrimary", SearchableContactNumberFilterInput.this.isPrimary.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isPrimary.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isValid.defined) {
                    inputFieldWriter.writeObject("isValid", SearchableContactNumberFilterInput.this.isValid.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isValid.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isVerified.defined) {
                    inputFieldWriter.writeObject("isVerified", SearchableContactNumberFilterInput.this.isVerified.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isVerified.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeObject("isWhatsappNumber", SearchableContactNumberFilterInput.this.isWhatsappNumber.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isWhatsappNumber.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeObject("isWrongNumber", SearchableContactNumberFilterInput.this.isWrongNumber.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isWrongNumber.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.isSpam.defined) {
                    inputFieldWriter.writeObject("isSpam", SearchableContactNumberFilterInput.this.isSpam.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.isSpam.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeObject("doNotTrack", SearchableContactNumberFilterInput.this.doNotTrack.value != 0 ? ((SearchableBooleanFilterInput) SearchableContactNumberFilterInput.this.doNotTrack.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.doNotTrackSetBy.defined) {
                    inputFieldWriter.writeObject("doNotTrackSetBy", SearchableContactNumberFilterInput.this.doNotTrackSetBy.value != 0 ? ((SearchableIDFilterInput) SearchableContactNumberFilterInput.this.doNotTrackSetBy.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", SearchableContactNumberFilterInput.this.phoneNumber.value != 0 ? ((SearchableStringFilterInput) SearchableContactNumberFilterInput.this.phoneNumber.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableContactNumberFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactNumberFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableContactNumberFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableContactNumberFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableContactNumberFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableContactNumberFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableContactNumberFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableContactNumberFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableContactNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableContactNumberFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableContactNumberFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableContactNumberFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableContactNumberFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableContactNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableContactNumberFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableContactNumberFilterInput.this.not.value != 0 ? ((SearchableContactNumberFilterInput) SearchableContactNumberFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableContactNumberFilterInput not() {
        return this.not.value;
    }

    public List<SearchableContactNumberFilterInput> or() {
        return this.or.value;
    }

    public SearchableStringFilterInput phoneNumber() {
        return this.phoneNumber.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }
}
