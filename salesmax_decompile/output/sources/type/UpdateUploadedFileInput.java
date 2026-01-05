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
public final class UpdateUploadedFileInput implements InputType {
    private final Input<String> accountId;
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
    private final String id;
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
        private String id;
        private Input<String> accountId = Input.absent();
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
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateUploadedFileInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateUploadedFileInput(this.id, this.accountId, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFileId, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt);
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
            this.id = str;
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

    public UpdateUploadedFileInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<List<String>> input8, Input<String> input9, Input<String> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<HasParent> input18, Input<String> input19, Input<ScopeLevel> input20, Input<String> input21, Input<String> input22, Input<String> input23, Input<String> input24) {
        this.id = str;
        this.accountId = input;
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
        return this.accountId.value;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateUploadedFileInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateUploadedFileInput.this.id);
                if (UpdateUploadedFileInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateUploadedFileInput.this.accountId.value);
                }
                if (UpdateUploadedFileInput.this.fileUrl.defined) {
                    inputFieldWriter.writeString("fileUrl", (String) UpdateUploadedFileInput.this.fileUrl.value);
                }
                if (UpdateUploadedFileInput.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeString("fileStorageDestination", (String) UpdateUploadedFileInput.this.fileStorageDestination.value);
                }
                if (UpdateUploadedFileInput.this.fileName.defined) {
                    inputFieldWriter.writeString("fileName", (String) UpdateUploadedFileInput.this.fileName.value);
                }
                if (UpdateUploadedFileInput.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) UpdateUploadedFileInput.this.description.value);
                }
                if (UpdateUploadedFileInput.this.documentCategory.defined) {
                    inputFieldWriter.writeString("documentCategory", (String) UpdateUploadedFileInput.this.documentCategory.value);
                }
                if (UpdateUploadedFileInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeString("documentSubCategory", (String) UpdateUploadedFileInput.this.documentSubCategory.value);
                }
                if (UpdateUploadedFileInput.this.tags.defined) {
                    inputFieldWriter.writeList("tags", UpdateUploadedFileInput.this.tags.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateUploadedFileInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateUploadedFileInput.this.tags.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (UpdateUploadedFileInput.this.templateType.defined) {
                    inputFieldWriter.writeString("templateType", (String) UpdateUploadedFileInput.this.templateType.value);
                }
                if (UpdateUploadedFileInput.this.templateTitle.defined) {
                    inputFieldWriter.writeString("templateTitle", (String) UpdateUploadedFileInput.this.templateTitle.value);
                }
                if (UpdateUploadedFileInput.this.templateBody.defined) {
                    inputFieldWriter.writeString("templateBody", (String) UpdateUploadedFileInput.this.templateBody.value);
                }
                if (UpdateUploadedFileInput.this.templateLastUsed.defined) {
                    inputFieldWriter.writeString("templateLastUsed", (String) UpdateUploadedFileInput.this.templateLastUsed.value);
                }
                if (UpdateUploadedFileInput.this.templateExternalLink.defined) {
                    inputFieldWriter.writeString("templateExternalLink", (String) UpdateUploadedFileInput.this.templateExternalLink.value);
                }
                if (UpdateUploadedFileInput.this.uploadSource.defined) {
                    inputFieldWriter.writeString("uploadSource", (String) UpdateUploadedFileInput.this.uploadSource.value);
                }
                if (UpdateUploadedFileInput.this.fileMetaData.defined) {
                    inputFieldWriter.writeString("fileMetaData", (String) UpdateUploadedFileInput.this.fileMetaData.value);
                }
                if (UpdateUploadedFileInput.this.fileMimeType.defined) {
                    inputFieldWriter.writeString("fileMimeType", (String) UpdateUploadedFileInput.this.fileMimeType.value);
                }
                if (UpdateUploadedFileInput.this.fileThumbnailUrl.defined) {
                    inputFieldWriter.writeString("fileThumbnailUrl", (String) UpdateUploadedFileInput.this.fileThumbnailUrl.value);
                }
                if (UpdateUploadedFileInput.this.hasParent.defined) {
                    inputFieldWriter.writeString("hasParent", UpdateUploadedFileInput.this.hasParent.value != 0 ? ((HasParent) UpdateUploadedFileInput.this.hasParent.value).name() : null);
                }
                if (UpdateUploadedFileInput.this.parentFileId.defined) {
                    inputFieldWriter.writeString("parentFileId", (String) UpdateUploadedFileInput.this.parentFileId.value);
                }
                if (UpdateUploadedFileInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeString("scopeLevel", UpdateUploadedFileInput.this.scopeLevel.value != 0 ? ((ScopeLevel) UpdateUploadedFileInput.this.scopeLevel.value).name() : null);
                }
                if (UpdateUploadedFileInput.this.scopeId.defined) {
                    inputFieldWriter.writeString("scopeId", (String) UpdateUploadedFileInput.this.scopeId.value);
                }
                if (UpdateUploadedFileInput.this.uploadedById.defined) {
                    inputFieldWriter.writeString("uploadedById", (String) UpdateUploadedFileInput.this.uploadedById.value);
                }
                if (UpdateUploadedFileInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateUploadedFileInput.this.createdAt.value);
                }
                if (UpdateUploadedFileInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateUploadedFileInput.this.updatedAt.value);
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
