package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreateUploadedFileInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final Input<String> description;
    private final Input<String> documentCategory;
    private final Input<String> documentSubCategory;
    private final Input<String> fileMetaData;
    private final Input<String> fileMimeType;
    private final Input<String> fileName;
    private final Input<String> fileStorageDestination;
    private final Input<String> fileThumbnailUrl;
    private final Input<String> fileUrl;
    private final Input<HasParent> hasParent;
    private final Input<String> id;
    private final Input<String> parentFileId;
    private final Input<String> scopeId;
    private final Input<ScopeLevel> scopeLevel;
    private final Input<List<String>> tags;
    private final Input<String> templateBody;
    private final Input<String> templateExternalLink;
    private final Input<String> templateLastUsed;
    private final Input<String> templateTitle;
    private final Input<String> templateType;
    private final Input<String> updatedAt;
    private final Input<String> uploadSource;
    private final Input<String> uploadedById;

    public static final class Builder {
        private String accountId;
        private Input<String> id = Input.absent();
        private Input<String> fileUrl = Input.absent();
        private Input<String> fileStorageDestination = Input.absent();
        private Input<String> fileName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> documentCategory = Input.absent();
        private Input<String> documentSubCategory = Input.absent();
        private Input<List<String>> tags = Input.absent();
        private Input<String> templateType = Input.absent();
        private Input<String> templateTitle = Input.absent();
        private Input<String> templateBody = Input.absent();
        private Input<String> templateLastUsed = Input.absent();
        private Input<String> templateExternalLink = Input.absent();
        private Input<String> uploadSource = Input.absent();
        private Input<String> fileMetaData = Input.absent();
        private Input<String> fileMimeType = Input.absent();
        private Input<String> fileThumbnailUrl = Input.absent();
        private Input<HasParent> hasParent = Input.absent();
        private Input<String> parentFileId = Input.absent();
        private Input<ScopeLevel> scopeLevel = Input.absent();
        private Input<String> scopeId = Input.absent();
        private Input<String> uploadedById = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateUploadedFileInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateUploadedFileInput(this.id, this.accountId, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFileId, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder documentCategory(String str) {
            this.documentCategory = Input.fromNullable(str);
            return this;
        }

        public Builder documentSubCategory(String str) {
            this.documentSubCategory = Input.fromNullable(str);
            return this;
        }

        public Builder fileMetaData(String str) {
            this.fileMetaData = Input.fromNullable(str);
            return this;
        }

        public Builder fileMimeType(String str) {
            this.fileMimeType = Input.fromNullable(str);
            return this;
        }

        public Builder fileName(String str) {
            this.fileName = Input.fromNullable(str);
            return this;
        }

        public Builder fileStorageDestination(String str) {
            this.fileStorageDestination = Input.fromNullable(str);
            return this;
        }

        public Builder fileThumbnailUrl(String str) {
            this.fileThumbnailUrl = Input.fromNullable(str);
            return this;
        }

        public Builder fileUrl(String str) {
            this.fileUrl = Input.fromNullable(str);
            return this;
        }

        public Builder hasParent(HasParent hasParent) {
            this.hasParent = Input.fromNullable(hasParent);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder parentFileId(String str) {
            this.parentFileId = Input.fromNullable(str);
            return this;
        }

        public Builder scopeId(String str) {
            this.scopeId = Input.fromNullable(str);
            return this;
        }

        public Builder scopeLevel(ScopeLevel scopeLevel) {
            this.scopeLevel = Input.fromNullable(scopeLevel);
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = Input.fromNullable(list);
            return this;
        }

        public Builder templateBody(String str) {
            this.templateBody = Input.fromNullable(str);
            return this;
        }

        public Builder templateExternalLink(String str) {
            this.templateExternalLink = Input.fromNullable(str);
            return this;
        }

        public Builder templateLastUsed(String str) {
            this.templateLastUsed = Input.fromNullable(str);
            return this;
        }

        public Builder templateTitle(String str) {
            this.templateTitle = Input.fromNullable(str);
            return this;
        }

        public Builder templateType(String str) {
            this.templateType = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder uploadSource(String str) {
            this.uploadSource = Input.fromNullable(str);
            return this;
        }

        public Builder uploadedById(String str) {
            this.uploadedById = Input.fromNullable(str);
            return this;
        }
    }

    public CreateUploadedFileInput(Input<String> input, String str, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<List<String>> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<HasParent> input18, Input<String> input19, Input<ScopeLevel> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24) {
        this.id = input;
        this.accountId = str;
        this.fileUrl = input2;
        this.fileStorageDestination = input3;
        this.fileName = input4;
        this.description = input5;
        this.documentCategory = input6;
        this.documentSubCategory = input7;
        this.tags = input8;
        this.templateType = input9;
        this.templateTitle = input10;
        this.templateBody = input11;
        this.templateLastUsed = input12;
        this.templateExternalLink = input13;
        this.uploadSource = input14;
        this.fileMetaData = input15;
        this.fileMimeType = input16;
        this.fileThumbnailUrl = input17;
        this.hasParent = input18;
        this.parentFileId = input19;
        this.scopeLevel = input20;
        this.scopeId = input21;
        this.uploadedById = input22;
        this.createdAt = input23;
        this.updatedAt = input24;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String description() {
        return this.description.value;
    }

    public String documentCategory() {
        return this.documentCategory.value;
    }

    public String documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public String fileMetaData() {
        return this.fileMetaData.value;
    }

    public String fileMimeType() {
        return this.fileMimeType.value;
    }

    public String fileName() {
        return this.fileName.value;
    }

    public String fileStorageDestination() {
        return this.fileStorageDestination.value;
    }

    public String fileThumbnailUrl() {
        return this.fileThumbnailUrl.value;
    }

    public String fileUrl() {
        return this.fileUrl.value;
    }

    public HasParent hasParent() {
        return this.hasParent.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateUploadedFileInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateUploadedFileInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateUploadedFileInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateUploadedFileInput.this.accountId);
                if (CreateUploadedFileInput.this.fileUrl.defined) {
                    inputFieldWriter.writeString("fileUrl", (String) CreateUploadedFileInput.this.fileUrl.value);
                }
                if (CreateUploadedFileInput.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeString("fileStorageDestination", (String) CreateUploadedFileInput.this.fileStorageDestination.value);
                }
                if (CreateUploadedFileInput.this.fileName.defined) {
                    inputFieldWriter.writeString("fileName", (String) CreateUploadedFileInput.this.fileName.value);
                }
                if (CreateUploadedFileInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateUploadedFileInput.this.description.value);
                }
                if (CreateUploadedFileInput.this.documentCategory.defined) {
                    inputFieldWriter.writeString("documentCategory", (String) CreateUploadedFileInput.this.documentCategory.value);
                }
                if (CreateUploadedFileInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeString("documentSubCategory", (String) CreateUploadedFileInput.this.documentSubCategory.value);
                }
                if (CreateUploadedFileInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", CreateUploadedFileInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateUploadedFileInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateUploadedFileInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (CreateUploadedFileInput.this.templateType.defined) {
                    inputFieldWriter.writeString("templateType", (String) CreateUploadedFileInput.this.templateType.value);
                }
                if (CreateUploadedFileInput.this.templateTitle.defined) {
                    inputFieldWriter.writeString("templateTitle", (String) CreateUploadedFileInput.this.templateTitle.value);
                }
                if (CreateUploadedFileInput.this.templateBody.defined) {
                    inputFieldWriter.writeString("templateBody", (String) CreateUploadedFileInput.this.templateBody.value);
                }
                if (CreateUploadedFileInput.this.templateLastUsed.defined) {
                    inputFieldWriter.writeString("templateLastUsed", (String) CreateUploadedFileInput.this.templateLastUsed.value);
                }
                if (CreateUploadedFileInput.this.templateExternalLink.defined) {
                    inputFieldWriter.writeString("templateExternalLink", (String) CreateUploadedFileInput.this.templateExternalLink.value);
                }
                if (CreateUploadedFileInput.this.uploadSource.defined) {
                    inputFieldWriter.writeString("uploadSource", (String) CreateUploadedFileInput.this.uploadSource.value);
                }
                if (CreateUploadedFileInput.this.fileMetaData.defined) {
                    inputFieldWriter.writeString("fileMetaData", (String) CreateUploadedFileInput.this.fileMetaData.value);
                }
                if (CreateUploadedFileInput.this.fileMimeType.defined) {
                    inputFieldWriter.writeString("fileMimeType", (String) CreateUploadedFileInput.this.fileMimeType.value);
                }
                if (CreateUploadedFileInput.this.fileThumbnailUrl.defined) {
                    inputFieldWriter.writeString("fileThumbnailUrl", (String) CreateUploadedFileInput.this.fileThumbnailUrl.value);
                }
                if (CreateUploadedFileInput.this.hasParent.defined) {
                    inputFieldWriter.writeString("hasParent", CreateUploadedFileInput.this.hasParent.value != 0 ? ((HasParent) CreateUploadedFileInput.this.hasParent.value).name() : null);
                }
                if (CreateUploadedFileInput.this.parentFileId.defined) {
                    inputFieldWriter.writeString("parentFileId", (String) CreateUploadedFileInput.this.parentFileId.value);
                }
                if (CreateUploadedFileInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeString("scopeLevel", CreateUploadedFileInput.this.scopeLevel.value != 0 ? ((ScopeLevel) CreateUploadedFileInput.this.scopeLevel.value).name() : null);
                }
                if (CreateUploadedFileInput.this.scopeId.defined) {
                    inputFieldWriter.writeString("scopeId", (String) CreateUploadedFileInput.this.scopeId.value);
                }
                if (CreateUploadedFileInput.this.uploadedById.defined) {
                    inputFieldWriter.writeString("uploadedById", (String) CreateUploadedFileInput.this.uploadedById.value);
                }
                if (CreateUploadedFileInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateUploadedFileInput.this.createdAt.value);
                }
                if (CreateUploadedFileInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateUploadedFileInput.this.updatedAt.value);
                }
            }
        };
    }

    public String parentFileId() {
        return this.parentFileId.value;
    }

    public String scopeId() {
        return this.scopeId.value;
    }

    public ScopeLevel scopeLevel() {
        return this.scopeLevel.value;
    }

    public List<String> tags() {
        return this.tags.value;
    }

    public String templateBody() {
        return this.templateBody.value;
    }

    public String templateExternalLink() {
        return this.templateExternalLink.value;
    }

    public String templateLastUsed() {
        return this.templateLastUsed.value;
    }

    public String templateTitle() {
        return this.templateTitle.value;
    }

    public String templateType() {
        return this.templateType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String uploadSource() {
        return this.uploadSource.value;
    }

    public String uploadedById() {
        return this.uploadedById.value;
    }
}
