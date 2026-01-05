package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelProductServiceConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductServiceConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> endDate;
    private final Input<ModelStringInput> hsCode;
    private final Input<ModelIntInput> incrementBy;
    private final Input<ModelBooleanInput> isArchived;
    private final Input<ModelStringInput> measurementUnit;
    private final Input<ModelStringInput> name;
    private final Input<ModelProductServiceConditionInput> not;
    private final Input<List<ModelProductServiceConditionInput>> or;
    private final Input<ModelIDInput> parentProductId;
    private final Input<ModelStringInput> productPicture;
    private final Input<ModelStringInput> skuCode;
    private final Input<ModelStringInput> standardPricePerUnit;
    private final Input<ModelStringInput> startDate;

    /* renamed from: type, reason: collision with root package name */
    private final Input<ModelProductServiceTypeInput> f58193type;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedBy;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<ModelProductServiceTypeInput> f58194type = Input.absent();
        private Input<ModelStringInput> measurementUnit = Input.absent();
        private Input<ModelIntInput> incrementBy = Input.absent();
        private Input<ModelStringInput> hsCode = Input.absent();
        private Input<ModelStringInput> skuCode = Input.absent();
        private Input<ModelStringInput> standardPricePerUnit = Input.absent();
        private Input<ModelStringInput> currency = Input.absent();
        private Input<ModelIDInput> parentProductId = Input.absent();
        private Input<ModelStringInput> productPicture = Input.absent();
        private Input<ModelStringInput> startDate = Input.absent();
        private Input<ModelStringInput> endDate = Input.absent();
        private Input<ModelBooleanInput> isArchived = Input.absent();
        private Input<ModelIDInput> createdBy = Input.absent();
        private Input<ModelIDInput> updatedBy = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelProductServiceConditionInput>> and = Input.absent();
        private Input<List<ModelProductServiceConditionInput>> or = Input.absent();
        private Input<ModelProductServiceConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductServiceConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductServiceConditionInput build() {
            return new ModelProductServiceConditionInput(this.accountId, this.name, this.description, this.f58194type, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProductId, this.productPicture, this.startDate, this.endDate, this.isArchived, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdBy(ModelIDInput modelIDInput) {
            this.createdBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder currency(ModelStringInput modelStringInput) {
            this.currency = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder endDate(ModelStringInput modelStringInput) {
            this.endDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder hsCode(ModelStringInput modelStringInput) {
            this.hsCode = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder incrementBy(ModelIntInput modelIntInput) {
            this.incrementBy = Input.fromNullable(modelIntInput);
            return this;
        }

        public Builder isArchived(ModelBooleanInput modelBooleanInput) {
            this.isArchived = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder measurementUnit(ModelStringInput modelStringInput) {
            this.measurementUnit = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder name(ModelStringInput modelStringInput) {
            this.name = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelProductServiceConditionInput modelProductServiceConditionInput) {
            this.not = Input.fromNullable(modelProductServiceConditionInput);
            return this;
        }

        public Builder or(List<ModelProductServiceConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentProductId(ModelIDInput modelIDInput) {
            this.parentProductId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder productPicture(ModelStringInput modelStringInput) {
            this.productPicture = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder skuCode(ModelStringInput modelStringInput) {
            this.skuCode = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder standardPricePerUnit(ModelStringInput modelStringInput) {
            this.standardPricePerUnit = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder startDate(ModelStringInput modelStringInput) {
            this.startDate = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder type(ModelProductServiceTypeInput modelProductServiceTypeInput) {
            this.f58194type = Input.fromNullable(modelProductServiceTypeInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedBy(ModelIDInput modelIDInput) {
            this.updatedBy = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelProductServiceConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelProductServiceTypeInput> input4, Input<ModelStringInput> input5, Input<ModelIntInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelBooleanInput> input15, Input<ModelIDInput> input16, Input<ModelIDInput> input17, Input<ModelStringInput> input18, Input<ModelStringInput> input19, Input<List<ModelProductServiceConditionInput>> input20, Input<List<ModelProductServiceConditionInput>> input21, Input<ModelProductServiceConditionInput> input22) {
        this.accountId = input;
        this.name = input2;
        this.description = input3;
        this.f58193type = input4;
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
        this.isArchived = input15;
        this.createdBy = input16;
        this.updatedBy = input17;
        this.createdAt = input18;
        this.updatedAt = input19;
        this.and = input20;
        this.or = input21;
        this.not = input22;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductServiceConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput createdBy() {
        return this.createdBy.value;
    }

    public ModelStringInput currency() {
        return this.currency.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput endDate() {
        return this.endDate.value;
    }

    public ModelStringInput hsCode() {
        return this.hsCode.value;
    }

    public ModelIntInput incrementBy() {
        return this.incrementBy.value;
    }

    public ModelBooleanInput isArchived() {
        return this.isArchived.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductServiceConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductServiceConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductServiceConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductServiceConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelProductServiceConditionInput.this.name.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.name.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelProductServiceConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.f58193type.defined) {
                    inputFieldWriter.writeObject("type", ModelProductServiceConditionInput.this.f58193type.value != 0 ? ((ModelProductServiceTypeInput) ModelProductServiceConditionInput.this.f58193type.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.measurementUnit.defined) {
                    inputFieldWriter.writeObject("measurementUnit", ModelProductServiceConditionInput.this.measurementUnit.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.measurementUnit.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.incrementBy.defined) {
                    inputFieldWriter.writeObject("incrementBy", ModelProductServiceConditionInput.this.incrementBy.value != 0 ? ((ModelIntInput) ModelProductServiceConditionInput.this.incrementBy.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.hsCode.defined) {
                    inputFieldWriter.writeObject("hsCode", ModelProductServiceConditionInput.this.hsCode.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.hsCode.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.skuCode.defined) {
                    inputFieldWriter.writeObject("skuCode", ModelProductServiceConditionInput.this.skuCode.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.skuCode.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.standardPricePerUnit.defined) {
                    inputFieldWriter.writeObject("standardPricePerUnit", ModelProductServiceConditionInput.this.standardPricePerUnit.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.standardPricePerUnit.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductServiceConditionInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.parentProductId.defined) {
                    inputFieldWriter.writeObject("parentProductId", ModelProductServiceConditionInput.this.parentProductId.value != 0 ? ((ModelIDInput) ModelProductServiceConditionInput.this.parentProductId.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.productPicture.defined) {
                    inputFieldWriter.writeObject("productPicture", ModelProductServiceConditionInput.this.productPicture.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.productPicture.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", ModelProductServiceConditionInput.this.startDate.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.startDate.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", ModelProductServiceConditionInput.this.endDate.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.endDate.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.isArchived.defined) {
                    inputFieldWriter.writeObject("isArchived", ModelProductServiceConditionInput.this.isArchived.value != 0 ? ((ModelBooleanInput) ModelProductServiceConditionInput.this.isArchived.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelProductServiceConditionInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelProductServiceConditionInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelProductServiceConditionInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelProductServiceConditionInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductServiceConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductServiceConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductServiceConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductServiceConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductServiceConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductServiceConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductServiceConditionInput.this.not.value != 0 ? ((ModelProductServiceConditionInput) ModelProductServiceConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput measurementUnit() {
        return this.measurementUnit.value;
    }

    public ModelStringInput name() {
        return this.name.value;
    }

    public ModelProductServiceConditionInput not() {
        return this.not.value;
    }

    public List<ModelProductServiceConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput parentProductId() {
        return this.parentProductId.value;
    }

    public ModelStringInput productPicture() {
        return this.productPicture.value;
    }

    public ModelStringInput skuCode() {
        return this.skuCode.value;
    }

    public ModelStringInput standardPricePerUnit() {
        return this.standardPricePerUnit.value;
    }

    public ModelStringInput startDate() {
        return this.startDate.value;
    }

    public ModelProductServiceTypeInput type() {
        return this.f58193type.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedBy() {
        return this.updatedBy.value;
    }
}
