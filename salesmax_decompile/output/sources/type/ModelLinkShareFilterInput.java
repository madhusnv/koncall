package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelLinkShareFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<ModelStringInput> accountLogoUrl;
    private final Input<ModelStringInput> accountName;
    private final Input<ModelStringInput> accountWebsite;
    private final Input<List<ModelLinkShareFilterInput>> and;
    private final Input<ModelIDInput> contactId;
    private final Input<ModelStringInput> contactName;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelIDInput> engagementId;
    private final Input<ModelStringInput> externalLink;
    private final Input<ModelStringInput> fileKey;
    private final Input<ModelIDInput> id;
    private final Input<ModelStringInput> mimeType;
    private final Input<ModelLinkShareFilterInput> not;
    private final Input<List<ModelLinkShareFilterInput>> or;
    private final Input<ModelStringInput> sharedByEmail;
    private final Input<ModelIDInput> sharedById;
    private final Input<ModelStringInput> sharedByName;
    private final Input<ModelStringInput> sharedByNumber;
    private final Input<ModelStringInput> templateTitle;
    private final Input<ModelStringInput> updatedAt;

    public static final class Builder {
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelLinkShareFilterInput>> and = Input.absent();
        private Input<List<ModelLinkShareFilterInput>> or = Input.absent();
        private Input<ModelLinkShareFilterInput> not = Input.absent();

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

        public Builder and(List<ModelLinkShareFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelLinkShareFilterInput build() {
            return new ModelLinkShareFilterInput(this.id, this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder mimeType(ModelStringInput modelStringInput) {
            this.mimeType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder not(ModelLinkShareFilterInput modelLinkShareFilterInput) {
            this.not = Input.fromNullable(modelLinkShareFilterInput);
            return this;
        }

        public Builder or(List<ModelLinkShareFilterInput> list) {
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

    public ModelLinkShareFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelIDInput> input3, Input<ModelStringInput> input4, Input<ModelIDInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelIDInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<List<ModelLinkShareFilterInput>> input19, Input<List<ModelLinkShareFilterInput>> input20, Input<ModelLinkShareFilterInput> input21) {
        this.id = input;
        this.accountId = input2;
        this.contactId = input3;
        this.contactName = input4;
        this.engagementId = input5;
        this.fileKey = input6;
        this.mimeType = input7;
        this.externalLink = input8;
        this.sharedById = input9;
        this.sharedByName = input10;
        this.sharedByEmail = input11;
        this.templateTitle = input12;
        this.accountName = input13;
        this.accountLogoUrl = input14;
        this.accountWebsite = input15;
        this.sharedByNumber = input16;
        this.createdAt = input17;
        this.updatedAt = input18;
        this.and = input19;
        this.or = input20;
        this.not = input21;
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

    public List<ModelLinkShareFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelLinkShareFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelLinkShareFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelLinkShareFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelLinkShareFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelLinkShareFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelLinkShareFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.contactId.defined) {
                    inputFieldWriter.writeObject("contactId", ModelLinkShareFilterInput.this.contactId.value != 0 ? ((ModelIDInput) ModelLinkShareFilterInput.this.contactId.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.contactName.defined) {
                    inputFieldWriter.writeObject("contactName", ModelLinkShareFilterInput.this.contactName.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.contactName.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.engagementId.defined) {
                    inputFieldWriter.writeObject("engagementId", ModelLinkShareFilterInput.this.engagementId.value != 0 ? ((ModelIDInput) ModelLinkShareFilterInput.this.engagementId.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.fileKey.defined) {
                    inputFieldWriter.writeObject("fileKey", ModelLinkShareFilterInput.this.fileKey.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.fileKey.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.mimeType.defined) {
                    inputFieldWriter.writeObject("mimeType", ModelLinkShareFilterInput.this.mimeType.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.mimeType.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.externalLink.defined) {
                    inputFieldWriter.writeObject("externalLink", ModelLinkShareFilterInput.this.externalLink.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.externalLink.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.sharedById.defined) {
                    inputFieldWriter.writeObject("sharedById", ModelLinkShareFilterInput.this.sharedById.value != 0 ? ((ModelIDInput) ModelLinkShareFilterInput.this.sharedById.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.sharedByName.defined) {
                    inputFieldWriter.writeObject("sharedByName", ModelLinkShareFilterInput.this.sharedByName.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.sharedByName.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.sharedByEmail.defined) {
                    inputFieldWriter.writeObject("sharedByEmail", ModelLinkShareFilterInput.this.sharedByEmail.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.sharedByEmail.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.templateTitle.defined) {
                    inputFieldWriter.writeObject("templateTitle", ModelLinkShareFilterInput.this.templateTitle.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.templateTitle.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.accountName.defined) {
                    inputFieldWriter.writeObject("accountName", ModelLinkShareFilterInput.this.accountName.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.accountName.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.accountLogoUrl.defined) {
                    inputFieldWriter.writeObject("accountLogoUrl", ModelLinkShareFilterInput.this.accountLogoUrl.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.accountLogoUrl.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.accountWebsite.defined) {
                    inputFieldWriter.writeObject("accountWebsite", ModelLinkShareFilterInput.this.accountWebsite.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.accountWebsite.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.sharedByNumber.defined) {
                    inputFieldWriter.writeObject("sharedByNumber", ModelLinkShareFilterInput.this.sharedByNumber.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.sharedByNumber.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelLinkShareFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelLinkShareFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelLinkShareFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelLinkShareFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelLinkShareFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelLinkShareFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelLinkShareFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelLinkShareFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelLinkShareFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelLinkShareFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelLinkShareFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelLinkShareFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelLinkShareFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelLinkShareFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelLinkShareFilterInput.this.not.value != 0 ? ((ModelLinkShareFilterInput) ModelLinkShareFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelStringInput mimeType() {
        return this.mimeType.value;
    }

    public ModelLinkShareFilterInput not() {
        return this.not.value;
    }

    public List<ModelLinkShareFilterInput> or() {
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
