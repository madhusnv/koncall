package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactNumberFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelContactNumberFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelContactNumberTypeInput> contactNumberType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelBooleanInput> doNotTrack;
    private final Input<ModelIDInput> doNotTrackSetBy;
    private final Input<ModelIDInput> id;
    private final Input<ModelBooleanInput> isPrimary;
    private final Input<ModelBooleanInput> isSpam;
    private final Input<ModelBooleanInput> isValid;
    private final Input<ModelBooleanInput> isVerified;
    private final Input<ModelBooleanInput> isWhatsappNumber;
    private final Input<ModelBooleanInput> isWrongNumber;
    private final Input<ModelContactNumberFilterInput> not;
    private final Input<List<ModelContactNumberFilterInput>> or;
    private final Input<ModelStringInput> phoneNumber;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelContactNumberTypeInput> contactNumberType = Input.absent();
        private Input<ModelBooleanInput> isPrimary = Input.absent();
        private Input<ModelBooleanInput> isValid = Input.absent();
        private Input<ModelBooleanInput> isVerified = Input.absent();
        private Input<ModelBooleanInput> isWhatsappNumber = Input.absent();
        private Input<ModelBooleanInput> isWrongNumber = Input.absent();
        private Input<ModelBooleanInput> isSpam = Input.absent();
        private Input<ModelBooleanInput> doNotTrack = Input.absent();
        private Input<ModelIDInput> doNotTrackSetBy = Input.absent();
        private Input<ModelStringInput> phoneNumber = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelContactNumberFilterInput>> and = Input.absent();
        private Input<List<ModelContactNumberFilterInput>> or = Input.absent();
        private Input<ModelContactNumberFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelContactNumberFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelContactNumberFilterInput build() {
            return new ModelContactNumberFilterInput(this.id, this.contactId, this.accountId, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactNumberType(ModelContactNumberTypeInput modelContactNumberTypeInput) {
            this.contactNumberType = Input.fromNullable(modelContactNumberTypeInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder doNotTrack(ModelBooleanInput modelBooleanInput) {
            this.doNotTrack = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder doNotTrackSetBy(ModelIDInput modelIDInput) {
            this.doNotTrackSetBy = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder isPrimary(ModelBooleanInput modelBooleanInput) {
            this.isPrimary = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isSpam(ModelBooleanInput modelBooleanInput) {
            this.isSpam = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isValid(ModelBooleanInput modelBooleanInput) {
            this.isValid = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isVerified(ModelBooleanInput modelBooleanInput) {
            this.isVerified = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isWhatsappNumber(ModelBooleanInput modelBooleanInput) {
            this.isWhatsappNumber = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder isWrongNumber(ModelBooleanInput modelBooleanInput) {
            this.isWrongNumber = Input.fromNullable(modelBooleanInput);
            return this;
        }

        public Builder not(ModelContactNumberFilterInput modelContactNumberFilterInput) {
            this.not = Input.fromNullable(modelContactNumberFilterInput);
            return this;
        }

        public Builder or(List<ModelContactNumberFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder phoneNumber(ModelStringInput modelStringInput) {
            this.phoneNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelContactNumberFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelContactNumberTypeInput> input4, Input<ModelBooleanInput> input5, Input<ModelBooleanInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelBooleanInput> input9, Input<ModelBooleanInput> input10, Input<ModelBooleanInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<List<ModelContactNumberFilterInput>> input16, Input<List<ModelContactNumberFilterInput>> input17, Input<ModelContactNumberFilterInput> input18) {
        this.id = input;
        this.contactId = input2;
        this.accountId = input3;
        this.contactNumberType = input4;
        this.isPrimary = input5;
        this.isValid = input6;
        this.isVerified = input7;
        this.isWhatsappNumber = input8;
        this.isWrongNumber = input9;
        this.isSpam = input10;
        this.doNotTrack = input11;
        this.doNotTrackSetBy = input12;
        this.phoneNumber = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
        this.and = input16;
        this.or = input17;
        this.not = input18;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelContactNumberFilterInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelContactNumberTypeInput contactNumberType() {
        return this.contactNumberType.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelBooleanInput doNotTrack() {
        return this.doNotTrack.value;
    }

    public ModelIDInput doNotTrackSetBy() {
        return this.doNotTrackSetBy.value;
    }

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelBooleanInput isPrimary() {
        return this.isPrimary.value;
    }

    public ModelBooleanInput isSpam() {
        return this.isSpam.value;
    }

    public ModelBooleanInput isValid() {
        return this.isValid.value;
    }

    public ModelBooleanInput isVerified() {
        return this.isVerified.value;
    }

    public ModelBooleanInput isWhatsappNumber() {
        return this.isWhatsappNumber.value;
    }

    public ModelBooleanInput isWrongNumber() {
        return this.isWrongNumber.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactNumberFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactNumberFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelContactNumberFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelContactNumberFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelContactNumberFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelContactNumberFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactNumberFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactNumberFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.contactNumberType.defined) {
                    inputFieldWriter.writeObject("contactNumberType", ModelContactNumberFilterInput.this.contactNumberType.value != 0 ? ((ModelContactNumberTypeInput) ModelContactNumberFilterInput.this.contactNumberType.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isPrimary.defined) {
                    inputFieldWriter.writeObject("isPrimary", ModelContactNumberFilterInput.this.isPrimary.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isPrimary.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isValid.defined) {
                    inputFieldWriter.writeObject("isValid", ModelContactNumberFilterInput.this.isValid.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isValid.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isVerified.defined) {
                    inputFieldWriter.writeObject("isVerified", ModelContactNumberFilterInput.this.isVerified.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isVerified.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeObject("isWhatsappNumber", ModelContactNumberFilterInput.this.isWhatsappNumber.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isWhatsappNumber.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeObject("isWrongNumber", ModelContactNumberFilterInput.this.isWrongNumber.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isWrongNumber.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.isSpam.defined) {
                    inputFieldWriter.writeObject("isSpam", ModelContactNumberFilterInput.this.isSpam.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.isSpam.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeObject("doNotTrack", ModelContactNumberFilterInput.this.doNotTrack.value != 0 ? ((ModelBooleanInput) ModelContactNumberFilterInput.this.doNotTrack.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.doNotTrackSetBy.defined) {
                    inputFieldWriter.writeObject("doNotTrackSetBy", ModelContactNumberFilterInput.this.doNotTrackSetBy.value != 0 ? ((ModelIDInput) ModelContactNumberFilterInput.this.doNotTrackSetBy.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelContactNumberFilterInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelContactNumberFilterInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactNumberFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactNumberFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactNumberFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactNumberFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactNumberFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactNumberFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactNumberFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactNumberFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactNumberFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactNumberFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactNumberFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactNumberFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactNumberFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactNumberFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactNumberFilterInput.this.not.value != 0 ? ((ModelContactNumberFilterInput) ModelContactNumberFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelContactNumberFilterInput not() {
        return this.not.value;
    }

    public List<ModelContactNumberFilterInput> or() {
        return this.or.value;
    }

    public ModelStringInput phoneNumber() {
        return this.phoneNumber.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
