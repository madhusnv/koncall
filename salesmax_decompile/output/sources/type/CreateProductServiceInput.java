package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateProductServiceInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> createdBy;
    private final Input<String> currency;
    private final Input<String> description;
    private final Input<String> endDate;
    private final Input<List<ExternalReferenceInput>> externalReference;
    private final Input<String> hsCode;
    private final Input<String> id;
    private final Input<Integer> incrementBy;
    private final Input<Boolean> isArchived;
    private final Input<String> measurementUnit;
    private final Input<String> name;
    private final Input<String> parentProductId;
    private final Input<String> productPicture;
    private final Input<String> skuCode;
    private final Input<String> standardPricePerUnit;
    private final Input<String> startDate;

    /* renamed from: type, reason: collision with root package name */
    private final Input<ProductServiceType> f58189type;
    private final Input<String> updatedAt;
    private final Input<String> updatedBy;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<List<ExternalReferenceInput>> externalReference = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> description = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<ProductServiceType> f58190type = Input.absent();
        private Input<String> measurementUnit = Input.absent();
        private Input<Integer> incrementBy = Input.absent();
        private Input<String> hsCode = Input.absent();
        private Input<String> skuCode = Input.absent();
        private Input<String> standardPricePerUnit = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> parentProductId = Input.absent();
        private Input<String> productPicture = Input.absent();
        private Input<String> startDate = Input.absent();
        private Input<String> endDate = Input.absent();
        private Input<Boolean> isArchived = Input.absent();
        private Input<String> createdBy = Input.absent();
        private Input<String> updatedBy = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateProductServiceInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateProductServiceInput(this.id, this.accountId, this.externalReference, this.name, this.description, this.f58190type, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProductId, this.productPicture, this.startDate, this.endDate, this.isArchived, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdBy(String str) {
            this.createdBy = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder endDate(String str) {
            this.endDate = Input.fromNullable(str);
            return this;
        }

        public Builder externalReference(List<ExternalReferenceInput> list) {
            this.externalReference = Input.fromNullable(list);
            return this;
        }

        public Builder hsCode(String str) {
            this.hsCode = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder incrementBy(Integer num) {
            this.incrementBy = Input.fromNullable(num);
            return this;
        }

        public Builder isArchived(Boolean bool) {
            this.isArchived = Input.fromNullable(bool);
            return this;
        }

        public Builder measurementUnit(String str) {
            this.measurementUnit = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder parentProductId(String str) {
            this.parentProductId = Input.fromNullable(str);
            return this;
        }

        public Builder productPicture(String str) {
            this.productPicture = Input.fromNullable(str);
            return this;
        }

        public Builder skuCode(String str) {
            this.skuCode = Input.fromNullable(str);
            return this;
        }

        public Builder standardPricePerUnit(String str) {
            this.standardPricePerUnit = Input.fromNullable(str);
            return this;
        }

        public Builder startDate(String str) {
            this.startDate = Input.fromNullable(str);
            return this;
        }

        public Builder type(ProductServiceType productServiceType) {
            this.f58190type = Input.fromNullable(productServiceType);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedBy(String str) {
            this.updatedBy = Input.fromNullable(str);
            return this;
        }
    }

    public CreateProductServiceInput(Input<String> input, String str, Input<List<ExternalReferenceInput>> input2, Input<String> input3, Input<String> input4, Input<ProductServiceType> input5, Input<String> input6, Input<Integer> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<Boolean> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20) {
        this.id = input;
        this.accountId = str;
        this.externalReference = input2;
        this.name = input3;
        this.description = input4;
        this.f58189type = input5;
        this.measurementUnit = input6;
        this.incrementBy = input7;
        this.hsCode = input8;
        this.skuCode = input9;
        this.standardPricePerUnit = input10;
        this.currency = input11;
        this.parentProductId = input12;
        this.productPicture = input13;
        this.startDate = input14;
        this.endDate = input15;
        this.isArchived = input16;
        this.createdBy = input17;
        this.updatedBy = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String createdBy() {
        return this.createdBy.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public String description() {
        return this.description.value;
    }

    public String endDate() {
        return this.endDate.value;
    }

    public List<ExternalReferenceInput> externalReference() {
        return this.externalReference.value;
    }

    public String hsCode() {
        return this.hsCode.value;
    }

    public String id() {
        return this.id.value;
    }

    public Integer incrementBy() {
        return this.incrementBy.value;
    }

    public Boolean isArchived() {
        return this.isArchived.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductServiceInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductServiceInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductServiceInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateProductServiceInput.this.accountId);
                if (CreateProductServiceInput.this.externalReference.defined) {
                    inputFieldWriter.writeList("externalReference", CreateProductServiceInput.this.externalReference.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateProductServiceInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateProductServiceInput.this.externalReference.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ExternalReferenceInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateProductServiceInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) CreateProductServiceInput.this.name.value);
                }
                if (CreateProductServiceInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateProductServiceInput.this.description.value);
                }
                if (CreateProductServiceInput.this.f58189type.defined) {
                    inputFieldWriter.writeString("type", CreateProductServiceInput.this.f58189type.value != 0 ? ((ProductServiceType) CreateProductServiceInput.this.f58189type.value).name() : null);
                }
                if (CreateProductServiceInput.this.measurementUnit.defined) {
                    inputFieldWriter.writeString("measurementUnit", (String) CreateProductServiceInput.this.measurementUnit.value);
                }
                if (CreateProductServiceInput.this.incrementBy.defined) {
                    inputFieldWriter.writeInt("incrementBy", (Integer) CreateProductServiceInput.this.incrementBy.value);
                }
                if (CreateProductServiceInput.this.hsCode.defined) {
                    inputFieldWriter.writeString("hsCode", (String) CreateProductServiceInput.this.hsCode.value);
                }
                if (CreateProductServiceInput.this.skuCode.defined) {
                    inputFieldWriter.writeString("skuCode", (String) CreateProductServiceInput.this.skuCode.value);
                }
                if (CreateProductServiceInput.this.standardPricePerUnit.defined) {
                    inputFieldWriter.writeString("standardPricePerUnit", (String) CreateProductServiceInput.this.standardPricePerUnit.value);
                }
                if (CreateProductServiceInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreateProductServiceInput.this.currency.value);
                }
                if (CreateProductServiceInput.this.parentProductId.defined) {
                    inputFieldWriter.writeString("parentProductId", (String) CreateProductServiceInput.this.parentProductId.value);
                }
                if (CreateProductServiceInput.this.productPicture.defined) {
                    inputFieldWriter.writeString("productPicture", (String) CreateProductServiceInput.this.productPicture.value);
                }
                if (CreateProductServiceInput.this.startDate.defined) {
                    inputFieldWriter.writeString("startDate", (String) CreateProductServiceInput.this.startDate.value);
                }
                if (CreateProductServiceInput.this.endDate.defined) {
                    inputFieldWriter.writeString("endDate", (String) CreateProductServiceInput.this.endDate.value);
                }
                if (CreateProductServiceInput.this.isArchived.defined) {
                    inputFieldWriter.writeBoolean("isArchived", (Boolean) CreateProductServiceInput.this.isArchived.value);
                }
                if (CreateProductServiceInput.this.createdBy.defined) {
                    inputFieldWriter.writeString("createdBy", (String) CreateProductServiceInput.this.createdBy.value);
                }
                if (CreateProductServiceInput.this.updatedBy.defined) {
                    inputFieldWriter.writeString("updatedBy", (String) CreateProductServiceInput.this.updatedBy.value);
                }
                if (CreateProductServiceInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateProductServiceInput.this.createdAt.value);
                }
                if (CreateProductServiceInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateProductServiceInput.this.updatedAt.value);
                }
            }
        };
    }

    public String measurementUnit() {
        return this.measurementUnit.value;
    }

    public String name() {
        return this.name.value;
    }

    public String parentProductId() {
        return this.parentProductId.value;
    }

    public String productPicture() {
        return this.productPicture.value;
    }

    public String skuCode() {
        return this.skuCode.value;
    }

    public String standardPricePerUnit() {
        return this.standardPricePerUnit.value;
    }

    public String startDate() {
        return this.startDate.value;
    }

    public ProductServiceType type() {
        return this.f58189type.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedBy() {
        return this.updatedBy.value;
    }
}
