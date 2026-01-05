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
public final class ModelProductServiceFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelProductServiceFilterInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> createdBy;
    private final Input<ModelStringInput> currency;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> endDate;
    private final Input<ModelStringInput> hsCode;
    private final Input<ModelIDInput> id;
    private final Input<ModelIntInput> incrementBy;
    private final Input<ModelBooleanInput> isArchived;
    private final Input<ModelStringInput> measurementUnit;
    private final Input<ModelStringInput> name;
    private final Input<ModelProductServiceFilterInput> not;
    private final Input<List<ModelProductServiceFilterInput>> or;
    private final Input<ModelIDInput> parentProductId;
    private final Input<ModelStringInput> productPicture;
    private final Input<ModelStringInput> skuCode;
    private final Input<ModelStringInput> standardPricePerUnit;
    private final Input<ModelStringInput> startDate;

    /* renamed from: type, reason: collision with root package name */
    private final Input<ModelProductServiceTypeInput> f58195type;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelIDInput> updatedBy;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> name = Input.absent();
        private Input<ModelStringInput> description = Input.absent();

        /* renamed from: type, reason: collision with root package name */
        private Input<ModelProductServiceTypeInput> f58196type = Input.absent();
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
        private Input<List<ModelProductServiceFilterInput>> and = Input.absent();
        private Input<List<ModelProductServiceFilterInput>> or = Input.absent();
        private Input<ModelProductServiceFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelProductServiceFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelProductServiceFilterInput build() {
            return new ModelProductServiceFilterInput(this.id, this.accountId, this.name, this.description, this.f58196type, this.measurementUnit, this.incrementBy, this.hsCode, this.skuCode, this.standardPricePerUnit, this.currency, this.parentProductId, this.productPicture, this.startDate, this.endDate, this.isArchived, this.createdBy, this.updatedBy, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
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

        public Builder not(ModelProductServiceFilterInput modelProductServiceFilterInput) {
            this.not = Input.fromNullable(modelProductServiceFilterInput);
            return this;
        }

        public Builder or(List<ModelProductServiceFilterInput> list) {
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
            this.f58196type = Input.fromNullable(modelProductServiceTypeInput);
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

    public ModelProductServiceFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelProductServiceTypeInput> input5, Input<ModelStringInput> input6, Input<ModelIntInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelBooleanInput> input16, Input<ModelIDInput> input17, Input<ModelIDInput> input18, Input<ModelStringInput> input19, Input<ModelStringInput> input20, Input<List<ModelProductServiceFilterInput>> input21, Input<List<ModelProductServiceFilterInput>> input22, Input<ModelProductServiceFilterInput> input23) {
        this.id = input;
        this.accountId = input2;
        this.name = input3;
        this.description = input4;
        this.f58195type = input5;
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
        this.and = input21;
        this.or = input22;
        this.not = input23;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelProductServiceFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelIntInput incrementBy() {
        return this.incrementBy.value;
    }

    public ModelBooleanInput isArchived() {
        return this.isArchived.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductServiceFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductServiceFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelProductServiceFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelProductServiceFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelProductServiceFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelProductServiceFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.name.defined) {
                    inputFieldWriter.writeObject("name", ModelProductServiceFilterInput.this.name.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.name.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelProductServiceFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.f58195type.defined) {
                    inputFieldWriter.writeObject("type", ModelProductServiceFilterInput.this.f58195type.value != 0 ? ((ModelProductServiceTypeInput) ModelProductServiceFilterInput.this.f58195type.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.measurementUnit.defined) {
                    inputFieldWriter.writeObject("measurementUnit", ModelProductServiceFilterInput.this.measurementUnit.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.measurementUnit.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.incrementBy.defined) {
                    inputFieldWriter.writeObject("incrementBy", ModelProductServiceFilterInput.this.incrementBy.value != 0 ? ((ModelIntInput) ModelProductServiceFilterInput.this.incrementBy.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.hsCode.defined) {
                    inputFieldWriter.writeObject("hsCode", ModelProductServiceFilterInput.this.hsCode.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.hsCode.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.skuCode.defined) {
                    inputFieldWriter.writeObject("skuCode", ModelProductServiceFilterInput.this.skuCode.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.skuCode.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.standardPricePerUnit.defined) {
                    inputFieldWriter.writeObject("standardPricePerUnit", ModelProductServiceFilterInput.this.standardPricePerUnit.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.standardPricePerUnit.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.currency.defined) {
                    inputFieldWriter.writeObject(FirebaseAnalytics.Param.CURRENCY, ModelProductServiceFilterInput.this.currency.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.currency.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.parentProductId.defined) {
                    inputFieldWriter.writeObject("parentProductId", ModelProductServiceFilterInput.this.parentProductId.value != 0 ? ((ModelIDInput) ModelProductServiceFilterInput.this.parentProductId.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.productPicture.defined) {
                    inputFieldWriter.writeObject("productPicture", ModelProductServiceFilterInput.this.productPicture.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.productPicture.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.startDate.defined) {
                    inputFieldWriter.writeObject("startDate", ModelProductServiceFilterInput.this.startDate.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.startDate.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.endDate.defined) {
                    inputFieldWriter.writeObject("endDate", ModelProductServiceFilterInput.this.endDate.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.endDate.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.isArchived.defined) {
                    inputFieldWriter.writeObject("isArchived", ModelProductServiceFilterInput.this.isArchived.value != 0 ? ((ModelBooleanInput) ModelProductServiceFilterInput.this.isArchived.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.createdBy.defined) {
                    inputFieldWriter.writeObject("createdBy", ModelProductServiceFilterInput.this.createdBy.value != 0 ? ((ModelIDInput) ModelProductServiceFilterInput.this.createdBy.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.updatedBy.defined) {
                    inputFieldWriter.writeObject("updatedBy", ModelProductServiceFilterInput.this.updatedBy.value != 0 ? ((ModelIDInput) ModelProductServiceFilterInput.this.updatedBy.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelProductServiceFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelProductServiceFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelProductServiceFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelProductServiceFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelProductServiceFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelProductServiceFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelProductServiceFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelProductServiceFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelProductServiceFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelProductServiceFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelProductServiceFilterInput.this.not.value != 0 ? ((ModelProductServiceFilterInput) ModelProductServiceFilterInput.this.not.value).marshaller() : null);
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

    public ModelProductServiceFilterInput not() {
        return this.not.value;
    }

    public List<ModelProductServiceFilterInput> or() {
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
        return this.f58195type.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelIDInput updatedBy() {
        return this.updatedBy.value;
    }
}
