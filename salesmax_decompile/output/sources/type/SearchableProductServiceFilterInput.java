package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableProductServiceFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableProductServiceFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableIDFilterInput> createdBy;
    private final Input<SearchableStringFilterInput> currency;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableStringFilterInput> endDate;
    private final Input<SearchableStringFilterInput> externalReference__externalReferenceId;
    private final Input<SearchableStringFilterInput> externalReference__externalReferenceIdSource;
    private final Input<SearchableStringFilterInput> hsCode;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableIntFilterInput> incrementBy;
    private final Input<SearchableStringFilterInput> measurementUnit;
    private final Input<SearchableStringFilterInput> name;
    private final Input<SearchableProductServiceFilterInput> not;
    private final Input<List<SearchableProductServiceFilterInput>> or;
    private final Input<SearchableIDFilterInput> parentProductId;
    private final Input<SearchableStringFilterInput> productPicture;
    private final Input<SearchableStringFilterInput> skuCode;
    private final Input<SearchableStringFilterInput> standardPricePerUnit;
    private final Input<SearchableStringFilterInput> startDate;

    /* renamed from: type, reason: collision with root package name */
    private final Input<SearchableStringFilterInput> f58199type;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableIDFilterInput> updatedBy;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> name = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> measurementUnit = Input.absent();
        private Input<SearchableIntFilterInput> incrementBy = Input.absent();
        private Input<SearchableStringFilterInput> hsCode = Input.absent();
        private Input<SearchableStringFilterInput> skuCode = Input.absent();
        private Input<SearchableStringFilterInput> standardPricePerUnit = Input.absent();
        private Input<SearchableStringFilterInput> currency = Input.absent();
        private Input<SearchableIDFilterInput> parentProductId = Input.absent();
        private Input<SearchableStringFilterInput> productPicture = Input.absent();
        private Input<SearchableStringFilterInput> startDate = Input.absent();
        private Input<SearchableStringFilterInput> endDate = Input.absent();
        private Input<SearchableIDFilterInput> createdBy = Input.absent();
        private Input<SearchableIDFilterInput> updatedBy = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<SearchableStringFilterInput> externalReference__externalReferenceId = Input.absent();
        private Input<SearchableStringFilterInput> externalReference__externalReferenceIdSource = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<SearchableStringFilterInput> f58200type = Input.absent();
        private Input<List<SearchableProductServiceFilterInput>> and = Input.absent();
        private Input<List<SearchableProductServiceFilterInput>> or = Input.absent();
        private Input<SearchableProductServiceFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableProductServiceFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableProductServiceFilterInput build() {
            return new SearchableProductServiceFilterInput(this.id, this.accountId, this.name, this.description, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProductId, this.productPicture, this.startDate, this.endDate, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt, this.externalReference__externalReferenceId, this.externalReference__externalReferenceIdSource, this.f58200type, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder createdBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.createdBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder currency(SearchableStringFilterInput searchableStringFilterInput) {
            this.currency = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder endDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.endDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalReference__externalReferenceId(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalReference__externalReferenceId = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder externalReference__externalReferenceIdSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.externalReference__externalReferenceIdSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder hsCode(SearchableStringFilterInput searchableStringFilterInput) {
            this.hsCode = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder incrementBy(SearchableIntFilterInput searchableIntFilterInput) {
            this.incrementBy = Input.fromNullable(searchableIntFilterInput);
            return this;
        }

        public Builder measurementUnit(SearchableStringFilterInput searchableStringFilterInput) {
            this.measurementUnit = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder name(SearchableStringFilterInput searchableStringFilterInput) {
            this.name = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder not(SearchableProductServiceFilterInput searchableProductServiceFilterInput) {
            this.not = Input.fromNullable(searchableProductServiceFilterInput);
            return this;
        }

        public Builder or(List<SearchableProductServiceFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentProductId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentProductId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder productPicture(SearchableStringFilterInput searchableStringFilterInput) {
            this.productPicture = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder skuCode(SearchableStringFilterInput searchableStringFilterInput) {
            this.skuCode = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder standardPricePerUnit(SearchableStringFilterInput searchableStringFilterInput) {
            this.standardPricePerUnit = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder startDate(SearchableStringFilterInput searchableStringFilterInput) {
            this.startDate = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder type(SearchableStringFilterInput searchableStringFilterInput) {
            this.f58200type = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedBy(SearchableIDFilterInput searchableIDFilterInput) {
            this.updatedBy = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableProductServiceFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableIntFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableIDFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableIDFilterInput> input15, Input<SearchableIDFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableStringFilterInput> input19, Input<SearchableStringFilterInput> input20, Input<SearchableStringFilterInput> input21, Input<List<SearchableProductServiceFilterInput>> input22, Input<List<SearchableProductServiceFilterInput>> input23, Input<SearchableProductServiceFilterInput> input24) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.measurementUnit = input5;
        this.incrementBy = input6;
        this.hsCode = input7;
        this.skuCode = input8;
        this.standardPricePerUnit = input9;
        this.currency = input10;
        this.parentProductId = input11;
        this.productPicture = input12;
        this.startDate = input13;
        this.endDate = input14;
        this.createdBy = input15;
        this.updatedBy = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.externalReference__externalReferenceId = input19;
        this.externalReference__externalReferenceIdSource = input20;
        this.f58199type = input21;
        this.and = input22;
        this.or = input23;
        this.not = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableProductServiceFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableIDFilterInput createdBy() {
        return this.createdBy.value;
    }

    public SearchableStringFilterInput currency() {
        return this.currency.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableStringFilterInput endDate() {
        return this.endDate.value;
    }

    public SearchableStringFilterInput externalReference__externalReferenceId() {
        return this.externalReference__externalReferenceId.value;
    }

    public SearchableStringFilterInput externalReference__externalReferenceIdSource() {
        return this.externalReference__externalReferenceIdSource.value;
    }

    public SearchableStringFilterInput hsCode() {
        return this.hsCode.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    public SearchableIntFilterInput incrementBy() {
        return this.incrementBy.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductServiceFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductServiceFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableProductServiceFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableProductServiceFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", SearchableProductServiceFilterInput.this.name.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.name.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableProductServiceFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.measurementUnit.defined) {
                    inputFieldWriter.writeObject("measurementUnit", SearchableProductServiceFilterInput.this.measurementUnit.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.measurementUnit.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.incrementBy.defined) {
                    inputFieldWriter.writeObject("incrementBy", SearchableProductServiceFilterInput.this.incrementBy.value != 0 ? ((SearchableIntFilterInput) SearchableProductServiceFilterInput.this.incrementBy.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.hsCode.defined) {
                    inputFieldWriter.writeObject("hsCode", SearchableProductServiceFilterInput.this.hsCode.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.hsCode.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.skuCode.defined) {
                    inputFieldWriter.writeObject("skuCode", SearchableProductServiceFilterInput.this.skuCode.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.skuCode.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.standardPricePerUnit.defined) {
                    inputFieldWriter.writeObject("standardPricePerUnit", SearchableProductServiceFilterInput.this.standardPricePerUnit.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.standardPricePerUnit.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, SearchableProductServiceFilterInput.this.currency.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.currency.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.parentProductId.defined) {
                    inputFieldWriter.writeObject("parentProductId", SearchableProductServiceFilterInput.this.parentProductId.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceFilterInput.this.parentProductId.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.productPicture.defined) {
                    inputFieldWriter.writeObject("productPicture", SearchableProductServiceFilterInput.this.productPicture.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.productPicture.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", SearchableProductServiceFilterInput.this.startDate.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.startDate.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", SearchableProductServiceFilterInput.this.endDate.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.endDate.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", SearchableProductServiceFilterInput.this.createdBy.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", SearchableProductServiceFilterInput.this.updatedBy.value != 0 ? ((SearchableIDFilterInput) SearchableProductServiceFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableProductServiceFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableProductServiceFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.externalReference__externalReferenceId.defined) {
                    inputFieldWriter.writeObject("externalReference__externalReferenceId", SearchableProductServiceFilterInput.this.externalReference__externalReferenceId.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.externalReference__externalReferenceId.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.externalReference__externalReferenceIdSource.defined) {
                    inputFieldWriter.writeObject("externalReference__externalReferenceIdSource", SearchableProductServiceFilterInput.this.externalReference__externalReferenceIdSource.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.externalReference__externalReferenceIdSource.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.f58199type.defined) {
                    inputFieldWriter.writeObject("type", SearchableProductServiceFilterInput.this.f58199type.value != 0 ? ((SearchableStringFilterInput) SearchableProductServiceFilterInput.this.f58199type.value).marshaller() : null);
                }
                if (SearchableProductServiceFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableProductServiceFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductServiceFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductServiceFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductServiceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductServiceFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableProductServiceFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableProductServiceFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableProductServiceFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableProductServiceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableProductServiceFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableProductServiceFilterInput.this.not.value != 0 ? ((SearchableProductServiceFilterInput) SearchableProductServiceFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableStringFilterInput measurementUnit() {
        return this.measurementUnit.value;
    }

    public SearchableStringFilterInput name() {
        return this.name.value;
    }

    public SearchableProductServiceFilterInput not() {
        return this.not.value;
    }

    public List<SearchableProductServiceFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput parentProductId() {
        return this.parentProductId.value;
    }

    public SearchableStringFilterInput productPicture() {
        return this.productPicture.value;
    }

    public SearchableStringFilterInput skuCode() {
        return this.skuCode.value;
    }

    public SearchableStringFilterInput standardPricePerUnit() {
        return this.standardPricePerUnit.value;
    }

    public SearchableStringFilterInput startDate() {
        return this.startDate.value;
    }

    public SearchableStringFilterInput type() {
        return this.f58199type.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableIDFilterInput updatedBy() {
        return this.updatedBy.value;
    }
}
