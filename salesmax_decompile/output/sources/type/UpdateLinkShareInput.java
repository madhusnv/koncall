package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateLinkShareInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> accountLogoUrl;
    private final Input<String> accountName;
    private final Input<String> accountWebsite;
    private final Input<String> contactId;
    private final Input<String> contactName;
    private final Input<String> createdAt;
    private final Input<String> engagementId;
    private final Input<String> externalLink;
    private final Input<String> fileKey;
    private final String id;
    private final Input<String> mimeType;
    private final Input<String> sharedByEmail;
    private final Input<String> sharedById;
    private final Input<String> sharedByName;
    private final Input<String> sharedByNumber;
    private final Input<String> templateTitle;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> contactName = Input.absent();
        private Input<String> engagementId = Input.absent();
        private Input<String> fileKey = Input.absent();
        private Input<String> mimeType = Input.absent();
        private Input<String> externalLink = Input.absent();
        private Input<String> sharedById = Input.absent();
        private Input<String> sharedByName = Input.absent();
        private Input<String> sharedByEmail = Input.absent();
        private Input<String> templateTitle = Input.absent();
        private Input<String> accountName = Input.absent();
        private Input<String> accountLogoUrl = Input.absent();
        private Input<String> accountWebsite = Input.absent();
        private Input<String> sharedByNumber = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder accountLogoUrl(String str) {
            this.accountLogoUrl = Input.fromNullable(str);
            return this;
        }

        public Builder accountName(String str) {
            this.accountName = Input.fromNullable(str);
            return this;
        }

        public Builder accountWebsite(String str) {
            this.accountWebsite = Input.fromNullable(str);
            return this;
        }

        public UpdateLinkShareInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateLinkShareInput(this.id, this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactName(String str) {
            this.contactName = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder engagementId(String str) {
            this.engagementId = Input.fromNullable(str);
            return this;
        }

        public Builder externalLink(String str) {
            this.externalLink = Input.fromNullable(str);
            return this;
        }

        public Builder fileKey(String str) {
            this.fileKey = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder mimeType(String str) {
            this.mimeType = Input.fromNullable(str);
            return this;
        }

        public Builder sharedByEmail(String str) {
            this.sharedByEmail = Input.fromNullable(str);
            return this;
        }

        public Builder sharedById(String str) {
            this.sharedById = Input.fromNullable(str);
            return this;
        }

        public Builder sharedByName(String str) {
            this.sharedByName = Input.fromNullable(str);
            return this;
        }

        public Builder sharedByNumber(String str) {
            this.sharedByNumber = Input.fromNullable(str);
            return this;
        }

        public Builder templateTitle(String str) {
            this.templateTitle = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateLinkShareInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17) {
        this.id = str;
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String accountLogoUrl() {
        return this.accountLogoUrl.value;
    }

    public String accountName() {
        return this.accountName.value;
    }

    public String accountWebsite() {
        return this.accountWebsite.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String contactName() {
        return this.contactName.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String engagementId() {
        return this.engagementId.value;
    }

    public String externalLink() {
        return this.externalLink.value;
    }

    public String fileKey() {
        return this.fileKey.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateLinkShareInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateLinkShareInput.this.id);
                if (UpdateLinkShareInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateLinkShareInput.this.accountId.value);
                }
                if (UpdateLinkShareInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateLinkShareInput.this.contactId.value);
                }
                if (UpdateLinkShareInput.this.contactName.defined) {
                    inputFieldWriter.writeString("contactName", (String) UpdateLinkShareInput.this.contactName.value);
                }
                if (UpdateLinkShareInput.this.engagementId.defined) {
                    inputFieldWriter.writeString("engagementId", (String) UpdateLinkShareInput.this.engagementId.value);
                }
                if (UpdateLinkShareInput.this.fileKey.defined) {
                    inputFieldWriter.writeString("fileKey", (String) UpdateLinkShareInput.this.fileKey.value);
                }
                if (UpdateLinkShareInput.this.mimeType.defined) {
                    inputFieldWriter.writeString("mimeType", (String) UpdateLinkShareInput.this.mimeType.value);
                }
                if (UpdateLinkShareInput.this.externalLink.defined) {
                    inputFieldWriter.writeString("externalLink", (String) UpdateLinkShareInput.this.externalLink.value);
                }
                if (UpdateLinkShareInput.this.sharedById.defined) {
                    inputFieldWriter.writeString("sharedById", (String) UpdateLinkShareInput.this.sharedById.value);
                }
                if (UpdateLinkShareInput.this.sharedByName.defined) {
                    inputFieldWriter.writeString("sharedByName", (String) UpdateLinkShareInput.this.sharedByName.value);
                }
                if (UpdateLinkShareInput.this.sharedByEmail.defined) {
                    inputFieldWriter.writeString("sharedByEmail", (String) UpdateLinkShareInput.this.sharedByEmail.value);
                }
                if (UpdateLinkShareInput.this.templateTitle.defined) {
                    inputFieldWriter.writeString("templateTitle", (String) UpdateLinkShareInput.this.templateTitle.value);
                }
                if (UpdateLinkShareInput.this.accountName.defined) {
                    inputFieldWriter.writeString("accountName", (String) UpdateLinkShareInput.this.accountName.value);
                }
                if (UpdateLinkShareInput.this.accountLogoUrl.defined) {
                    inputFieldWriter.writeString("accountLogoUrl", (String) UpdateLinkShareInput.this.accountLogoUrl.value);
                }
                if (UpdateLinkShareInput.this.accountWebsite.defined) {
                    inputFieldWriter.writeString("accountWebsite", (String) UpdateLinkShareInput.this.accountWebsite.value);
                }
                if (UpdateLinkShareInput.this.sharedByNumber.defined) {
                    inputFieldWriter.writeString("sharedByNumber", (String) UpdateLinkShareInput.this.sharedByNumber.value);
                }
                if (UpdateLinkShareInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateLinkShareInput.this.createdAt.value);
                }
                if (UpdateLinkShareInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateLinkShareInput.this.updatedAt.value);
                }
            }
        };
    }

    public String mimeType() {
        return this.mimeType.value;
    }

    public String sharedByEmail() {
        return this.sharedByEmail.value;
    }

    public String sharedById() {
        return this.sharedById.value;
    }

    public String sharedByName() {
        return this.sharedByName.value;
    }

    public String sharedByNumber() {
        return this.sharedByNumber.value;
    }

    public String templateTitle() {
        return this.templateTitle.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
