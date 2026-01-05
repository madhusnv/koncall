package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelfileObjectRelationshipFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelfileObjectRelationshipFilterInput>> and;
    private final Input<ModelIDInput> businessId;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> dealId;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> fieldName;
    private final Input<ModelIDInput> fileId;
    private final Input<ModelStringInput> fileUrl;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> inputContext;
    private final Input<ModelfileObjectRelationshipFilterInput> not;
    private final Input<List<ModelfileObjectRelationshipFilterInput>> or;
    private final Input<ModelIDInput> parentObjectId;
    private final Input<ModelStringInput> parentObjectType;
    private final Input<ModelIDInput> productId;
    private final Input<ModelStringInput> transcription;
    private final Input<ModelStringInput> translatedTranscription;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelfileObjectRelationshipFilterInput>> and = Input.absent();
        private Input<List<ModelfileObjectRelationshipFilterInput>> or = Input.absent();
        private Input<ModelfileObjectRelationshipFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelfileObjectRelationshipFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelfileObjectRelationshipFilterInput build() {
            return new ModelfileObjectRelationshipFilterInput(this.id, this.accountId, this.fileId, this.fileUrl, this.contactId, this.engagementId, this.businessId, this.dealId, this.productId, this.createdAt, this.updatedAt, this.parentObjectId, this.parentObjectType, this.fieldName, this.inputContext, this.transcription, this.translatedTranscription, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder inputContext(ModelStringInput modelStringInput) {
            this.inputContext = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelfileObjectRelationshipFilterInput modelfileObjectRelationshipFilterInput) {
            this.not = Input.fromNullable(modelfileObjectRelationshipFilterInput);
            return this;
        }

        public Builder or(List<ModelfileObjectRelationshipFilterInput> list) {
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

    public ModelfileObjectRelationshipFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelIDInput> input6, Input<ModelIDInput> input7, Input<ModelIDInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelIDInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<List<ModelfileObjectRelationshipFilterInput>> input18, Input<List<ModelfileObjectRelationshipFilterInput>> input19, Input<ModelfileObjectRelationshipFilterInput> input20) {
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

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelfileObjectRelationshipFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    public ModelStringInput inputContext() {
        return this.inputContext.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelfileObjectRelationshipFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelfileObjectRelationshipFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelfileObjectRelationshipFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelfileObjectRelationshipFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.fileId.defined) {
                    inputFieldWriter.writeObject("fileId", ModelfileObjectRelationshipFilterInput.this.fileId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.fileId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", ModelfileObjectRelationshipFilterInput.this.fileUrl.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.fileUrl.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelfileObjectRelationshipFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelfileObjectRelationshipFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.businessId.defined) {
                    inputFieldWriter.writeObject("businessId", ModelfileObjectRelationshipFilterInput.this.businessId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.businessId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.dealId.defined) {
                    inputFieldWriter.writeObject("dealId", ModelfileObjectRelationshipFilterInput.this.dealId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.dealId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.productId.defined) {
                    inputFieldWriter.writeObject("productId", ModelfileObjectRelationshipFilterInput.this.productId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.productId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelfileObjectRelationshipFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelfileObjectRelationshipFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeObject("parentObjectId", ModelfileObjectRelationshipFilterInput.this.parentObjectId.value != 0 ? ((ModelIDInput) ModelfileObjectRelationshipFilterInput.this.parentObjectId.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeObject("parentObjectType", ModelfileObjectRelationshipFilterInput.this.parentObjectType.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.parentObjectType.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.fieldName.defined) {
                    inputFieldWriter.writeObject("fieldName", ModelfileObjectRelationshipFilterInput.this.fieldName.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.fieldName.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.inputContext.defined) {
                    inputFieldWriter.writeObject("inputContext", ModelfileObjectRelationshipFilterInput.this.inputContext.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.inputContext.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.transcription.defined) {
                    inputFieldWriter.writeObject("transcription", ModelfileObjectRelationshipFilterInput.this.transcription.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.transcription.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.translatedTranscription.defined) {
                    inputFieldWriter.writeObject("translatedTranscription", ModelfileObjectRelationshipFilterInput.this.translatedTranscription.value != 0 ? ((ModelStringInput) ModelfileObjectRelationshipFilterInput.this.translatedTranscription.value).marshaller() : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelfileObjectRelationshipFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelfileObjectRelationshipFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelfileObjectRelationshipFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelfileObjectRelationshipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelfileObjectRelationshipFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelfileObjectRelationshipFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelfileObjectRelationshipFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelfileObjectRelationshipFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelfileObjectRelationshipFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelfileObjectRelationshipFilterInput.this.not.value != 0 ? ((ModelfileObjectRelationshipFilterInput) ModelfileObjectRelationshipFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelfileObjectRelationshipFilterInput not() {
        return this.not.value;
    }

    public List<ModelfileObjectRelationshipFilterInput> or() {
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
