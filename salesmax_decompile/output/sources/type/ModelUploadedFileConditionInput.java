package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelUploadedFileConditionInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelUploadedFileConditionInput>> and;
    private final Input<ModelStringInput> createdAt;
    private final Input<ModelStringInput> description;
    private final Input<ModelStringInput> documentCategory;
    private final Input<ModelStringInput> documentSubCategory;
    private final Input<ModelStringInput> fileMetaData;
    private final Input<ModelStringInput> fileMimeType;
    private final Input<ModelStringInput> fileName;
    private final Input<ModelStringInput> fileStorageDestination;
    private final Input<ModelStringInput> fileThumbnailUrl;
    private final Input<ModelStringInput> fileUrl;
    private final Input<ModelHasParentInput> hasParent;
    private final Input<ModelUploadedFileConditionInput> not;
    private final Input<List<ModelUploadedFileConditionInput>> or;
    private final Input<ModelIDInput> parentFileId;
    private final Input<ModelIDInput> scopeId;
    private final Input<ModelScopeLevelInput> scopeLevel;
    private final Input<ModelStringInput> tags;
    private final Input<ModelStringInput> templateBody;
    private final Input<ModelStringInput> templateExternalLink;
    private final Input<ModelStringInput> templateLastUsed;
    private final Input<ModelStringInput> templateTitle;
    private final Input<ModelStringInput> templateType;
    private final Input<ModelStringInput> updatedAt;
    private final Input<ModelStringInput> uploadSource;
    private final Input<ModelIDInput> uploadedById;

    public static final class Builder {
        private Input<ModelIDInput> accountId = Input.absent();
        private Input<ModelStringInput> fileUrl = Input.absent();
        private Input<ModelStringInput> fileStorageDestination = Input.absent();
        private Input<ModelStringInput> fileName = Input.absent();
        private Input<ModelStringInput> description = Input.absent();
        private Input<ModelStringInput> documentCategory = Input.absent();
        private Input<ModelStringInput> documentSubCategory = Input.absent();
        private Input<ModelStringInput> tags = Input.absent();
        private Input<ModelStringInput> templateType = Input.absent();
        private Input<ModelStringInput> templateTitle = Input.absent();
        private Input<ModelStringInput> templateBody = Input.absent();
        private Input<ModelStringInput> templateLastUsed = Input.absent();
        private Input<ModelStringInput> templateExternalLink = Input.absent();
        private Input<ModelStringInput> uploadSource = Input.absent();
        private Input<ModelStringInput> fileMetaData = Input.absent();
        private Input<ModelStringInput> fileMimeType = Input.absent();
        private Input<ModelStringInput> fileThumbnailUrl = Input.absent();
        private Input<ModelHasParentInput> hasParent = Input.absent();
        private Input<ModelIDInput> parentFileId = Input.absent();
        private Input<ModelScopeLevelInput> scopeLevel = Input.absent();
        private Input<ModelIDInput> scopeId = Input.absent();
        private Input<ModelIDInput> uploadedById = Input.absent();
        private Input<ModelStringInput> createdAt = Input.absent();
        private Input<ModelStringInput> updatedAt = Input.absent();
        private Input<List<ModelUploadedFileConditionInput>> and = Input.absent();
        private Input<List<ModelUploadedFileConditionInput>> or = Input.absent();
        private Input<ModelUploadedFileConditionInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelUploadedFileConditionInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelUploadedFileConditionInput build() {
            return new ModelUploadedFileConditionInput(this.accountId, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFileId, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(ModelStringInput modelStringInput) {
            this.createdAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder description(ModelStringInput modelStringInput) {
            this.description = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder documentCategory(ModelStringInput modelStringInput) {
            this.documentCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder documentSubCategory(ModelStringInput modelStringInput) {
            this.documentSubCategory = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileMetaData(ModelStringInput modelStringInput) {
            this.fileMetaData = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileMimeType(ModelStringInput modelStringInput) {
            this.fileMimeType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileName(ModelStringInput modelStringInput) {
            this.fileName = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileStorageDestination(ModelStringInput modelStringInput) {
            this.fileStorageDestination = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileThumbnailUrl(ModelStringInput modelStringInput) {
            this.fileThumbnailUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder fileUrl(ModelStringInput modelStringInput) {
            this.fileUrl = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder hasParent(ModelHasParentInput modelHasParentInput) {
            this.hasParent = Input.fromNullable(modelHasParentInput);
            return this;
        }

        public Builder not(ModelUploadedFileConditionInput modelUploadedFileConditionInput) {
            this.not = Input.fromNullable(modelUploadedFileConditionInput);
            return this;
        }

        public Builder or(List<ModelUploadedFileConditionInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentFileId(ModelIDInput modelIDInput) {
            this.parentFileId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder scopeId(ModelIDInput modelIDInput) {
            this.scopeId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder scopeLevel(ModelScopeLevelInput modelScopeLevelInput) {
            this.scopeLevel = Input.fromNullable(modelScopeLevelInput);
            return this;
        }

        public Builder tags(ModelStringInput modelStringInput) {
            this.tags = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateBody(ModelStringInput modelStringInput) {
            this.templateBody = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateExternalLink(ModelStringInput modelStringInput) {
            this.templateExternalLink = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateLastUsed(ModelStringInput modelStringInput) {
            this.templateLastUsed = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateTitle(ModelStringInput modelStringInput) {
            this.templateTitle = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder templateType(ModelStringInput modelStringInput) {
            this.templateType = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder updatedAt(ModelStringInput modelStringInput) {
            this.updatedAt = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder uploadSource(ModelStringInput modelStringInput) {
            this.uploadSource = Input.fromNullable(modelStringInput);
            return this;
        }

        public Builder uploadedById(ModelIDInput modelIDInput) {
            this.uploadedById = Input.fromNullable(modelIDInput);
            return this;
        }
    }

    public ModelUploadedFileConditionInput(Input<ModelIDInput> input, Input<ModelStringInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelHasParentInput> input18, Input<ModelIDInput> input19, Input<ModelScopeLevelInput> input20, Input<ModelIDInput> input21, Input<ModelIDInput> input22, Input<ModelStringInput> input23, Input<ModelStringInput> input24, Input<List<ModelUploadedFileConditionInput>> input25, Input<List<ModelUploadedFileConditionInput>> input26, Input<ModelUploadedFileConditionInput> input27) {
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
        this.and = input25;
        this.or = input26;
        this.not = input27;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelUploadedFileConditionInput> and() {
        return this.and.value;
    }

    public ModelStringInput createdAt() {
        return this.createdAt.value;
    }

    public ModelStringInput description() {
        return this.description.value;
    }

    public ModelStringInput documentCategory() {
        return this.documentCategory.value;
    }

    public ModelStringInput documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public ModelStringInput fileMetaData() {
        return this.fileMetaData.value;
    }

    public ModelStringInput fileMimeType() {
        return this.fileMimeType.value;
    }

    public ModelStringInput fileName() {
        return this.fileName.value;
    }

    public ModelStringInput fileStorageDestination() {
        return this.fileStorageDestination.value;
    }

    public ModelStringInput fileThumbnailUrl() {
        return this.fileThumbnailUrl.value;
    }

    public ModelStringInput fileUrl() {
        return this.fileUrl.value;
    }

    public ModelHasParentInput hasParent() {
        return this.hasParent.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUploadedFileConditionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUploadedFileConditionInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelUploadedFileConditionInput.this.accountId.value != 0 ? ((ModelIDInput) ModelUploadedFileConditionInput.this.accountId.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", ModelUploadedFileConditionInput.this.fileUrl.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileUrl.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeObject("fileStorageDestination", ModelUploadedFileConditionInput.this.fileStorageDestination.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileStorageDestination.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileName.defined) {
                    inputFieldWriter.writeObject("fileName", ModelUploadedFileConditionInput.this.fileName.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileName.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelUploadedFileConditionInput.this.description.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.description.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", ModelUploadedFileConditionInput.this.documentCategory.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.documentCategory.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", ModelUploadedFileConditionInput.this.documentSubCategory.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelUploadedFileConditionInput.this.tags.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.tags.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", ModelUploadedFileConditionInput.this.templateType.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.templateType.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.templateTitle.defined) {
                    inputFieldWriter.writeObject("templateTitle", ModelUploadedFileConditionInput.this.templateTitle.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.templateTitle.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.templateBody.defined) {
                    inputFieldWriter.writeObject("templateBody", ModelUploadedFileConditionInput.this.templateBody.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.templateBody.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.templateLastUsed.defined) {
                    inputFieldWriter.writeObject("templateLastUsed", ModelUploadedFileConditionInput.this.templateLastUsed.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.templateLastUsed.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.templateExternalLink.defined) {
                    inputFieldWriter.writeObject("templateExternalLink", ModelUploadedFileConditionInput.this.templateExternalLink.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.templateExternalLink.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.uploadSource.defined) {
                    inputFieldWriter.writeObject("uploadSource", ModelUploadedFileConditionInput.this.uploadSource.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.uploadSource.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileMetaData.defined) {
                    inputFieldWriter.writeObject("fileMetaData", ModelUploadedFileConditionInput.this.fileMetaData.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileMetaData.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileMimeType.defined) {
                    inputFieldWriter.writeObject("fileMimeType", ModelUploadedFileConditionInput.this.fileMimeType.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileMimeType.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.fileThumbnailUrl.defined) {
                    inputFieldWriter.writeObject("fileThumbnailUrl", ModelUploadedFileConditionInput.this.fileThumbnailUrl.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.fileThumbnailUrl.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.hasParent.defined) {
                    inputFieldWriter.writeObject("hasParent", ModelUploadedFileConditionInput.this.hasParent.value != 0 ? ((ModelHasParentInput) ModelUploadedFileConditionInput.this.hasParent.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.parentFileId.defined) {
                    inputFieldWriter.writeObject("parentFileId", ModelUploadedFileConditionInput.this.parentFileId.value != 0 ? ((ModelIDInput) ModelUploadedFileConditionInput.this.parentFileId.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelUploadedFileConditionInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelUploadedFileConditionInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelUploadedFileConditionInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelUploadedFileConditionInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.uploadedById.defined) {
                    inputFieldWriter.writeObject("uploadedById", ModelUploadedFileConditionInput.this.uploadedById.value != 0 ? ((ModelIDInput) ModelUploadedFileConditionInput.this.uploadedById.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelUploadedFileConditionInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelUploadedFileConditionInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelUploadedFileConditionInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelUploadedFileConditionInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelUploadedFileConditionInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUploadedFileConditionInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUploadedFileConditionInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUploadedFileConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUploadedFileConditionInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelUploadedFileConditionInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUploadedFileConditionInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUploadedFileConditionInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUploadedFileConditionInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUploadedFileConditionInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelUploadedFileConditionInput.this.not.value != 0 ? ((ModelUploadedFileConditionInput) ModelUploadedFileConditionInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelUploadedFileConditionInput not() {
        return this.not.value;
    }

    public List<ModelUploadedFileConditionInput> or() {
        return this.or.value;
    }

    public ModelIDInput parentFileId() {
        return this.parentFileId.value;
    }

    public ModelIDInput scopeId() {
        return this.scopeId.value;
    }

    public ModelScopeLevelInput scopeLevel() {
        return this.scopeLevel.value;
    }

    public ModelStringInput tags() {
        return this.tags.value;
    }

    public ModelStringInput templateBody() {
        return this.templateBody.value;
    }

    public ModelStringInput templateExternalLink() {
        return this.templateExternalLink.value;
    }

    public ModelStringInput templateLastUsed() {
        return this.templateLastUsed.value;
    }

    public ModelStringInput templateTitle() {
        return this.templateTitle.value;
    }

    public ModelStringInput templateType() {
        return this.templateType.value;
    }

    public ModelStringInput updatedAt() {
        return this.updatedAt.value;
    }

    public ModelStringInput uploadSource() {
        return this.uploadSource.value;
    }

    public ModelIDInput uploadedById() {
        return this.uploadedById.value;
    }
}
