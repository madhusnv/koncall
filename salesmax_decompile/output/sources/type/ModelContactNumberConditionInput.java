package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelContactNumberConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelContactNumberConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelContactNumberTypeInput> contactNumberType;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelBooleanInput> doNotTrack;
    private final Input<ModelIDInput> doNotTrackSetBy;
    private final Input<ModelBooleanInput> isPrimary;
    private final Input<ModelBooleanInput> isSpam;
    private final Input<ModelBooleanInput> isValid;
    private final Input<ModelBooleanInput> isVerified;
    private final Input<ModelBooleanInput> isWhatsappNumber;
    private final Input<ModelBooleanInput> isWrongNumber;
    private final Input<ModelContactNumberConditionInput> not;
    private final Input<List<ModelContactNumberConditionInput>> or;
    private final Input<ModelStringInput> phoneNumber;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
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
        private Input<List<ModelContactNumberConditionInput>> and = Input.absent();
        private Input<List<ModelContactNumberConditionInput>> or = Input.absent();
        private Input<ModelContactNumberConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelContactNumberConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelContactNumberConditionInput build() {
            return new ModelContactNumberConditionInput(this.contactId, this.accountId, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder not(ModelContactNumberConditionInput modelContactNumberConditionInput) {
            this.not = Input.fromNullable(modelContactNumberConditionInput);
            return this;
        }

        public Builder or(List<ModelContactNumberConditionInput> list) {
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

    public ModelContactNumberConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelContactNumberTypeInput> input3, Input<ModelBooleanInput> input4, Input<ModelBooleanInput> input5, Input<ModelBooleanInput> input6, Input<ModelBooleanInput> input7, Input<ModelBooleanInput> input8, Input<ModelBooleanInput> input9, Input<ModelBooleanInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<List<ModelContactNumberConditionInput>> input15, Input<List<ModelContactNumberConditionInput>> input16, Input<ModelContactNumberConditionInput> input17) {
        this.contactId = input;
        this.accountId = input2;
        this.contactNumberType = input3;
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelContactNumberConditionInput> and() {
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
        return new InputFieldMarshaller() { // from class: type.ModelContactNumberConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactNumberConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelContactNumberConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelContactNumberConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelContactNumberConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelContactNumberConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.contactNumberType.defined) {
                    inputFieldWriter.writeObject("contactNumberType", ModelContactNumberConditionInput.this.contactNumberType.value != 0 ? ((ModelContactNumberTypeInput) ModelContactNumberConditionInput.this.contactNumberType.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isPrimary.defined) {
                    inputFieldWriter.writeObject("isPrimary", ModelContactNumberConditionInput.this.isPrimary.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isPrimary.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isValid.defined) {
                    inputFieldWriter.writeObject("isValid", ModelContactNumberConditionInput.this.isValid.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isValid.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isVerified.defined) {
                    inputFieldWriter.writeObject("isVerified", ModelContactNumberConditionInput.this.isVerified.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isVerified.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeObject("isWhatsappNumber", ModelContactNumberConditionInput.this.isWhatsappNumber.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isWhatsappNumber.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeObject("isWrongNumber", ModelContactNumberConditionInput.this.isWrongNumber.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isWrongNumber.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.isSpam.defined) {
                    inputFieldWriter.writeObject("isSpam", ModelContactNumberConditionInput.this.isSpam.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.isSpam.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeObject("doNotTrack", ModelContactNumberConditionInput.this.doNotTrack.value != 0 ? ((ModelBooleanInput) ModelContactNumberConditionInput.this.doNotTrack.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.doNotTrackSetBy.defined) {
                    inputFieldWriter.writeObject("doNotTrackSetBy", ModelContactNumberConditionInput.this.doNotTrackSetBy.value != 0 ? ((ModelIDInput) ModelContactNumberConditionInput.this.doNotTrackSetBy.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeObject("phoneNumber", ModelContactNumberConditionInput.this.phoneNumber.value != 0 ? ((ModelStringInput) ModelContactNumberConditionInput.this.phoneNumber.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelContactNumberConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelContactNumberConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelContactNumberConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelContactNumberConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelContactNumberConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelContactNumberConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactNumberConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactNumberConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactNumberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactNumberConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelContactNumberConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelContactNumberConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelContactNumberConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelContactNumberConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelContactNumberConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelContactNumberConditionInput.this.not.value != 0 ? ((ModelContactNumberConditionInput) ModelContactNumberConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelContactNumberConditionInput not() {
        return this.not.value;
    }

    public List<ModelContactNumberConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput phoneNumber() {
        return this.phoneNumber.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
