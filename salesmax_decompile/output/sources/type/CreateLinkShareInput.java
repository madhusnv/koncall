package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateLinkShareInput implements InputType {
    private final String accountId;
    private final Input<String> accountLogoUrl;
    private final Input<String> accountName;
    private final Input<String> accountWebsite;
    private final String contactId;
    private final Input<String> contactName;
    private final Input<String> createdAt;
    private final String engagementId;
    private final Input<String> externalLink;
    private final Input<String> fileKey;
    private final Input<String> id;
    private final Input<String> mimeType;
    private final Input<String> sharedByEmail;
    private final String sharedById;
    private final Input<String> sharedByName;
    private final Input<String> sharedByNumber;
    private final Input<String> templateTitle;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String contactId;
        private String engagementId;
        private String sharedById;
        private Input<String> id = Input.absent();
        private Input<String> contactName = Input.absent();
        private Input<String> fileKey = Input.absent();
        private Input<String> mimeType = Input.absent();
        private Input<String> externalLink = Input.absent();
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
            this.accountId = str;
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

        public CreateLinkShareInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.engagementId, "engagementId == null");
            Utils.checkNotNull(this.sharedById, "sharedById == null");
            return new CreateLinkShareInput(this.id, this.accountId, this.contactId, this.contactName, this.engagementId, this.fileKey, this.mimeType, this.externalLink, this.sharedById, this.sharedByName, this.sharedByEmail, this.templateTitle, this.accountName, this.accountLogoUrl, this.accountWebsite, this.sharedByNumber, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = str;
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
            this.engagementId = str;
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
            this.id = Input.fromNullable(str);
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
            this.sharedById = str;
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

    public CreateLinkShareInput(Input<String> input, String str, String str2, Input<String> input2, String str3, Input<String> input3, Input<String> input4, Input<String> input5, String str4, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = input;
        this.accountId = str;
        this.contactId = str2;
        this.contactName = input2;
        this.engagementId = str3;
        this.fileKey = input3;
        this.mimeType = input4;
        this.externalLink = input5;
        this.sharedById = str4;
        this.sharedByName = input6;
        this.sharedByEmail = input7;
        this.templateTitle = input8;
        this.accountName = input9;
        this.accountLogoUrl = input10;
        this.accountWebsite = input11;
        this.sharedByNumber = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.contactId;
    }

    public String contactName() {
        return this.contactName.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String engagementId() {
        return this.engagementId;
    }

    public String externalLink() {
        return this.externalLink.value;
    }

    public String fileKey() {
        return this.fileKey.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateLinkShareInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateLinkShareInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateLinkShareInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateLinkShareInput.this.accountId);
                inputFieldWriter.writeString("contactId", CreateLinkShareInput.this.contactId);
                if (CreateLinkShareInput.this.contactName.defined) {
                    inputFieldWriter.writeString("contactName", (String) CreateLinkShareInput.this.contactName.value);
                }
                inputFieldWriter.writeString("engagementId", CreateLinkShareInput.this.engagementId);
                if (CreateLinkShareInput.this.fileKey.defined) {
                    inputFieldWriter.writeString("fileKey", (String) CreateLinkShareInput.this.fileKey.value);
                }
                if (CreateLinkShareInput.this.mimeType.defined) {
                    inputFieldWriter.writeString("mimeType", (String) CreateLinkShareInput.this.mimeType.value);
                }
                if (CreateLinkShareInput.this.externalLink.defined) {
                    inputFieldWriter.writeString("externalLink", (String) CreateLinkShareInput.this.externalLink.value);
                }
                inputFieldWriter.writeString("sharedById", CreateLinkShareInput.this.sharedById);
                if (CreateLinkShareInput.this.sharedByName.defined) {
                    inputFieldWriter.writeString("sharedByName", (String) CreateLinkShareInput.this.sharedByName.value);
                }
                if (CreateLinkShareInput.this.sharedByEmail.defined) {
                    inputFieldWriter.writeString("sharedByEmail", (String) CreateLinkShareInput.this.sharedByEmail.value);
                }
                if (CreateLinkShareInput.this.templateTitle.defined) {
                    inputFieldWriter.writeString("templateTitle", (String) CreateLinkShareInput.this.templateTitle.value);
                }
                if (CreateLinkShareInput.this.accountName.defined) {
                    inputFieldWriter.writeString("accountName", (String) CreateLinkShareInput.this.accountName.value);
                }
                if (CreateLinkShareInput.this.accountLogoUrl.defined) {
                    inputFieldWriter.writeString("accountLogoUrl", (String) CreateLinkShareInput.this.accountLogoUrl.value);
                }
                if (CreateLinkShareInput.this.accountWebsite.defined) {
                    inputFieldWriter.writeString("accountWebsite", (String) CreateLinkShareInput.this.accountWebsite.value);
                }
                if (CreateLinkShareInput.this.sharedByNumber.defined) {
                    inputFieldWriter.writeString("sharedByNumber", (String) CreateLinkShareInput.this.sharedByNumber.value);
                }
                if (CreateLinkShareInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateLinkShareInput.this.createdAt.value);
                }
                if (CreateLinkShareInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateLinkShareInput.this.updatedAt.value);
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
        return this.sharedById;
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
