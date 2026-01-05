package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelLinkShareConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> accountLogoUrl;
    private final Input<ModelStringInput> accountName;
    private final Input<ModelStringInput> accountWebsite;
    private final Input<List<ModelLinkShareConditionInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactName;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> externalLink;
    private final Input<ModelStringInput> fileKey;
    private final Input<ModelStringInput> mimeType;
    private final Input<ModelLinkShareConditionInput> not;
    private final Input<List<ModelLinkShareConditionInput>> or;
    private final Input<ModelStringInput> sharedByEmail;
    private final Input<ModelIDInput> sharedById;
    private final Input<ModelStringInput> sharedByName;
    private final Input<ModelStringInput> sharedByNumber;
    private final Input<ModelStringInput> templateTitle;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelIDInput> contactId = Input.absent();
        private Input<ModelStringInput> contactName = Input.absent();
        private Input<ModelIDInput> engagementId = Input.absent();
        private Input<ModelStringInput> fileKey = Input.absent();
        private Input<ModelStringInput> mimeType = Input.absent();
        private Input<ModelStringInput> externalLink = Input.absent();
        private Input<ModelIDInput> sharedById = Input.absent();
        private Input<ModelStringInput> sharedByName = Input.absent();
        private Input<ModelStringInput> sharedByEmail = Input.absent();
        private Input<ModelStringInput> templateTitle = Input.absent();
        private Input<ModelStringInput> accountName = Input.absent();
        private Input<ModelStringInput> accountLogoUrl = Input.absent();
        private Input<ModelStringInput> accountWebsite = Input.absent();
        private Input<ModelStringInput> sharedByNumber = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelLinkShareConditionInput>> and = Input.absent();
        private Input<List<ModelLinkShareConditionInput>> or = Input.absent();
        private Input<ModelLinkShareConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder accountLogoUrl(ModelStringInput modelStringInput) {
            this.accountLogoUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountName(ModelStringInput modelStringInput) {
            this.accountName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder accountWebsite(ModelStringInput modelStringInput) {
            this.accountWebsite = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder and(List<ModelLinkShareConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelLinkShareConditionInput build() {
            return new ModelLinkShareConditionInput(this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder contactId(ModelIDInput modelIDInput) {
            this.contactId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder contactName(ModelStringInput modelStringInput) {
            this.contactName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder engagementId(ModelIDInput modelIDInput) {
            this.engagementId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder externalLink(ModelStringInput modelStringInput) {
            this.externalLink = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileKey(ModelStringInput modelStringInput) {
            this.fileKey = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder mimeType(ModelStringInput modelStringInput) {
            this.mimeType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelLinkShareConditionInput modelLinkShareConditionInput) {
            this.not = Input.fromNullable(modelLinkShareConditionInput);
            return this;
        }

        public Builder or(List<ModelLinkShareConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder sharedByEmail(ModelStringInput modelStringInput) {
            this.sharedByEmail = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder sharedById(ModelIDInput modelIDInput) {
            this.sharedById = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder sharedByName(ModelStringInput modelStringInput) {
            this.sharedByName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder sharedByNumber(ModelStringInput modelStringInput) {
            this.sharedByNumber = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateTitle(ModelStringInput modelStringInput) {
            this.templateTitle = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }
    }

    public ModelLinkShareConditionInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelIDInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelIDInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<List<ModelLinkShareConditionInput>> input18, Input<List<ModelLinkShareConditionInput>> input19, Input<ModelLinkShareConditionInput> input20) {
        this.accountId = input;
        this.contactId = input2;
        this.contactName = input3;
        this.engagementId = input4;
        this.fileKey = input5;
        this.mimeType = input6;
        this.externalLink = input7;
        this.sharedById = input8;
        this.sharedByName = input9;
        this.sharedByEmail = input10;
        this.templateTitle = input11;
        this.accountName = input12;
        this.accountLogoUrl = input13;
        this.accountWebsite = input14;
        this.sharedByNumber = input15;
        this.createdAt = input16;
        this.updatedAt = input17;
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

    public ModelStringInput accountLogoUrl() {
        return this.accountLogoUrl.value;
    }

    public ModelStringInput accountName() {
        return this.accountName.value;
    }

    public ModelStringInput accountWebsite() {
        return this.accountWebsite.value;
    }

    public List<ModelLinkShareConditionInput> and() {
        return this.and.value;
    }

    public ModelIDInput contactId() {
        return this.contactId.value;
    }

    public ModelStringInput contactName() {
        return this.contactName.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelIDInput engagementId() {
        return this.engagementId.value;
    }

    public ModelStringInput externalLink() {
        return this.externalLink.value;
    }

    public ModelStringInput fileKey() {
        return this.fileKey.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelLinkShareConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelLinkShareConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelLinkShareConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelLinkShareConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelLinkShareConditionInput.this.contactId.value != 0 ? ((ModelIDInput) ModelLinkShareConditionInput.this.contactId.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.contactName.defined) {
                    inputFieldWriter.writeObject("contactName", ModelLinkShareConditionInput.this.contactName.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.contactName.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelLinkShareConditionInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelLinkShareConditionInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.fileKey.defined) {
                    inputFieldWriter.writeObject("fileKey", ModelLinkShareConditionInput.this.fileKey.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.fileKey.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.mimeType.defined) {
                    inputFieldWriter.writeObject("mimeType", ModelLinkShareConditionInput.this.mimeType.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.mimeType.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.externalLink.defined) {
                    inputFieldWriter.writeObject("externalLink", ModelLinkShareConditionInput.this.externalLink.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.externalLink.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.sharedById.defined) {
                    inputFieldWriter.writeObject("sharedById", ModelLinkShareConditionInput.this.sharedById.value != 0 ? ((ModelIDInput) ModelLinkShareConditionInput.this.sharedById.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.sharedByName.defined) {
                    inputFieldWriter.writeObject("sharedByName", ModelLinkShareConditionInput.this.sharedByName.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.sharedByName.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.sharedByEmail.defined) {
                    inputFieldWriter.writeObject("sharedByEmail", ModelLinkShareConditionInput.this.sharedByEmail.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.sharedByEmail.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.templateTitle.defined) {
                    inputFieldWriter.writeObject("templateTitle", ModelLinkShareConditionInput.this.templateTitle.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.templateTitle.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.accountName.defined) {
                    inputFieldWriter.writeObject("accountName", ModelLinkShareConditionInput.this.accountName.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.accountName.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.accountLogoUrl.defined) {
                    inputFieldWriter.writeObject("accountLogoUrl", ModelLinkShareConditionInput.this.accountLogoUrl.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.accountLogoUrl.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.accountWebsite.defined) {
                    inputFieldWriter.writeObject("accountWebsite", ModelLinkShareConditionInput.this.accountWebsite.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.accountWebsite.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.sharedByNumber.defined) {
                    inputFieldWriter.writeObject("sharedByNumber", ModelLinkShareConditionInput.this.sharedByNumber.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.sharedByNumber.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelLinkShareConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelLinkShareConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelLinkShareConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelLinkShareConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelLinkShareConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelLinkShareConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelLinkShareConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelLinkShareConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelLinkShareConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelLinkShareConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelLinkShareConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelLinkShareConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelLinkShareConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelLinkShareConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelLinkShareConditionInput.this.not.value != 0 ? ((ModelLinkShareConditionInput) ModelLinkShareConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput mimeType() {
        return this.mimeType.value;
    }

    public ModelLinkShareConditionInput not() {
        return this.not.value;
    }

    public List<ModelLinkShareConditionInput> or() {
        return this.or.value;
    }

    public ModelStringInput sharedByEmail() {
        return this.sharedByEmail.value;
    }

    public ModelIDInput sharedById() {
        return this.sharedById.value;
    }

    public ModelStringInput sharedByName() {
        return this.sharedByName.value;
    }

    public ModelStringInput sharedByNumber() {
        return this.sharedByNumber.value;
    }

    public ModelStringInput templateTitle() {
        return this.templateTitle.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }
}
