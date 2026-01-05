package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelfileObjectRelationshipConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelfileObjectRelationshipConditionInput>> and;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> fieldName;
    private final Input<ModelIDInput> fileId;
    private final Input<ModelStringInput> fileUrl;
    private final Input<ModelStringInput> inputContext;
    private final Input<ModelfileObjectRelationshipConditionInput> not;
    private final Input<List<ModelfileObjectRelationshipConditionInput>> or;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> transcription;
    private final Input<ModelStringInput> translatedTranscription;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> fileId = Input.absent();
        private Input<ModelStringInput> fileUrl = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelIDInput> businessId = Input.absent();
        private Input<ModelIDInput> dealId = Input.absent();
        private Input<ModelIDInput> productId = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<ModelIDInput> parentObjectId = Input.absent();
        private Input<ModelStringInput> parentObjectType = Input.absent();
        private Input<ModelStringInput> fieldName = Input.absent();
        private Input<ModelStringInput> inputContext = Input.absent();
        private Input<ModelStringInput> transcription = Input.absent();
        private Input<ModelStringInput> translatedTranscription = Input.absent();
        private Input<List<ModelfileObjectRelationshipConditionInput>> and = Input.absent();
        private Input<List<ModelfileObjectRelationshipConditionInput>> or = Input.absent();
        private Input<ModelfileObjectRelationshipConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelfileObjectRelationshipConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelfileObjectRelationshipConditionInput build() {
            return new ModelfileObjectRelationshipConditionInput(this.accountId, this.fileId, this.fileUrl, this.contactId, this.engagementId, this.businessId, this.dealId, this.productId, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription, this.and, this.or, this.not);
        }

        public Builder businessId(ModelIDInput modelIDInput) {
            this.businessId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder dealId(ModelIDInput modelIDInput) {
            this.dealId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder fieldName(ModelStringInput modelStringInput) {
            this.fieldName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileId(ModelIDInput modelIDInput) {
            this.fileId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder fileUrl(ModelStringInput modelStringInput) {
            this.fileUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder inputContext(ModelStringInput modelStringInput) {
            this.inputContext = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelfileObjectRelationshipConditionInput modelfileObjectRelationshipConditionInput) {
            this.not = Input.fromNullable(modelfileObjectRelationshipConditionInput);
            return this;
        }

        public Builder or(List<ModelfileObjectRelationshipConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentObjectId(ModelIDInput modelIDInput) {
            this.parentObjectId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder parentObjectType(ModelStringInput modelStringInput) {
            this.parentObjectType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder productId(ModelIDInput modelIDInput) {
            this.productId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder transcription(ModelStringInput modelStringInput) {
            this.transcription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder translatedTranscription(ModelStringInput modelStringInput) {
            this.translatedTranscription = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelfileObjectRelationshipConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelIDInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<List<ModelfileObjectRelationshipConditionInput>> input17, Input<List<ModelfileObjectRelationshipConditionInput>> input18, Input<ModelfileObjectRelationshipConditionInput> input19) {
        this.accountId = input;
        this.fileId = input2;
        this.fileUrl = input3;
        this.contactId = input4;
        this.engagementId = input5;
        this.businessId = input6;
        this.dealId = input7;
        this.productId = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
        this.parentObjectId = input11;
        this.parentObjectType = input12;
        this.fieldName = input13;
        this.inputContext = input14;
        this.transcription = input15;
        this.translatedTranscription = input16;
        this.and = input17;
        this.or = input18;
        this.not = input19;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelfileObjectRelationshipConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput businessId() {
        return this.businessId.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput dealId() {
        return this.dealId.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput fieldName() {
        return this.fieldName.value;
    }

    public ModelIDInput fileId() {
        return this.fileId.value;
    }

    public ModelStringInput fileUrl() {
        return this.fileUrl.value;
    }

    public ModelStringInput inputContext() {
        return this.inputContext.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelfileObjectRelationshipConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelfileObjectRelationshipConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelfileObjectRelationshipConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.fileId.defined) {
                    inputFieldWriter.writeObject("fileId", ModelfileObjectRelationshipConditionInput.this.fileId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.fileId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", ModelfileObjectRelationshipConditionInput.this.fileUrl.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.fileUrl.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelfileObjectRelationshipConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelfileObjectRelationshipConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelfileObjectRelationshipConditionInput.this.businessId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.businessId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelfileObjectRelationshipConditionInput.this.dealId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.dealId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelfileObjectRelationshipConditionInput.this.productId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.productId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelfileObjectRelationshipConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelfileObjectRelationshipConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelfileObjectRelationshipConditionInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipConditionInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelfileObjectRelationshipConditionInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.fieldName.defined) {
                    inputFieldWriter.writeObject("fieldName", ModelfileObjectRelationshipConditionInput.this.fieldName.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.fieldName.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.inputContext.defined) {
                    inputFieldWriter.writeObject("inputContext", ModelfileObjectRelationshipConditionInput.this.inputContext.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.inputContext.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.transcription.defined) {
                    inputFieldWriter.writeObject("transcription", ModelfileObjectRelationshipConditionInput.this.transcription.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.transcription.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.translatedTranscription.defined) {
                    inputFieldWriter.writeObject("translatedTranscription", ModelfileObjectRelationshipConditionInput.this.translatedTranscription.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipConditionInput.this.translatedTranscription.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelfileObjectRelationshipConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelfileObjectRelationshipConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelfileObjectRelationshipConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelfileObjectRelationshipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelfileObjectRelationshipConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelfileObjectRelationshipConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelfileObjectRelationshipConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelfileObjectRelationshipConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelfileObjectRelationshipConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelfileObjectRelationshipConditionInput.this.not.value != 0 ? ((ModelfileObjectRelationshipConditionInput) ModelfileObjectRelationshipConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelfileObjectRelationshipConditionInput not() {
        return this.not.value;
    }

    public List<ModelfileObjectRelationshipConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput parentObjectId() {
        return this.parentObjectId.value;
    }

    public ModelStringInput parentObjectType() {
        return this.parentObjectType.value;
    }

    public ModelIDInput productId() {
        return this.productId.value;
    }

    public ModelStringInput transcription() {
        return this.transcription.value;
    }

    public ModelStringInput translatedTranscription() {
        return this.translatedTranscription.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
