package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelUploadedFileFilterInput implements InputType {
    private final Input<ModelIDInput> accountId;
    private final Input<List<ModelUploadedFileFilterInput>> and;
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
    private final Input<ModelIDInput> id;
    private final Input<ModelUploadedFileFilterInput> not;
    private final Input<List<ModelUploadedFileFilterInput>> or;
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
        private Input<ModelIDInput> id = Input.absent();
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
        private Input<List<ModelUploadedFileFilterInput>> and = Input.absent();
        private Input<List<ModelUploadedFileFilterInput>> or = Input.absent();
        private Input<ModelUploadedFileFilterInput> not = Input.absent();

        public Builder accountId(ModelIDInput modelIDInput) {
            this.accountId = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder and(List<ModelUploadedFileFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public ModelUploadedFileFilterInput build() {
            return new ModelUploadedFileFilterInput(this.id, this.accountId, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.hasParent, this.parentFileId, this.scopeLevel, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
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

        public Builder id(ModelIDInput modelIDInput) {
            this.id = Input.fromNullable(modelIDInput);
            return this;
        }

        public Builder not(ModelUploadedFileFilterInput modelUploadedFileFilterInput) {
            this.not = Input.fromNullable(modelUploadedFileFilterInput);
            return this;
        }

        public Builder or(List<ModelUploadedFileFilterInput> list) {
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

    public ModelUploadedFileFilterInput(Input<ModelIDInput> input, Input<ModelIDInput> input2, Input<ModelStringInput> input3, Input<ModelStringInput> input4, Input<ModelStringInput> input5, Input<ModelStringInput> input6, Input<ModelStringInput> input7, Input<ModelStringInput> input8, Input<ModelStringInput> input9, Input<ModelStringInput> input10, Input<ModelStringInput> input11, Input<ModelStringInput> input12, Input<ModelStringInput> input13, Input<ModelStringInput> input14, Input<ModelStringInput> input15, Input<ModelStringInput> input16, Input<ModelStringInput> input17, Input<ModelStringInput> input18, Input<ModelHasParentInput> input19, Input<ModelIDInput> input20, Input<ModelScopeLevelInput> input21, Input<ModelIDInput> input22, Input<ModelIDInput> input23, Input<ModelStringInput> input24, Input<ModelStringInput> input25, Input<List<ModelUploadedFileFilterInput>> input26, Input<List<ModelUploadedFileFilterInput>> input27, Input<ModelUploadedFileFilterInput> input28) {
        this.id = input;
        this.accountId = input2;
        this.fileUrl = input3;
        this.fileStorageDestination = input4;
        this.fileName = input5;
        this.description = input6;
        this.documentCategory = input7;
        this.documentSubCategory = input8;
        this.tags = input9;
        this.templateType = input10;
        this.templateTitle = input11;
        this.templateBody = input12;
        this.templateLastUsed = input13;
        this.templateExternalLink = input14;
        this.uploadSource = input15;
        this.fileMetaData = input16;
        this.fileMimeType = input17;
        this.fileThumbnailUrl = input18;
        this.hasParent = input19;
        this.parentFileId = input20;
        this.scopeLevel = input21;
        this.scopeId = input22;
        this.uploadedById = input23;
        this.createdAt = input24;
        this.updatedAt = input25;
        this.and = input26;
        this.or = input27;
        this.not = input28;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ModelIDInput accountId() {
        return this.accountId.value;
    }

    public List<ModelUploadedFileFilterInput> and() {
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

    public ModelIDInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelUploadedFileFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelUploadedFileFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, ModelUploadedFileFilterInput.this.id.value != 0 ? ((ModelIDInput) ModelUploadedFileFilterInput.this.id.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", ModelUploadedFileFilterInput.this.accountId.value != 0 ? ((ModelIDInput) ModelUploadedFileFilterInput.this.accountId.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", ModelUploadedFileFilterInput.this.fileUrl.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileUrl.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeObject("fileStorageDestination", ModelUploadedFileFilterInput.this.fileStorageDestination.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileStorageDestination.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileName.defined) {
                    inputFieldWriter.writeObject("fileName", ModelUploadedFileFilterInput.this.fileName.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileName.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, ModelUploadedFileFilterInput.this.description.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.description.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", ModelUploadedFileFilterInput.this.documentCategory.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.documentCategory.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", ModelUploadedFileFilterInput.this.documentSubCategory.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", ModelUploadedFileFilterInput.this.tags.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.tags.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", ModelUploadedFileFilterInput.this.templateType.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.templateType.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.templateTitle.defined) {
                    inputFieldWriter.writeObject("templateTitle", ModelUploadedFileFilterInput.this.templateTitle.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.templateTitle.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.templateBody.defined) {
                    inputFieldWriter.writeObject("templateBody", ModelUploadedFileFilterInput.this.templateBody.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.templateBody.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.templateLastUsed.defined) {
                    inputFieldWriter.writeObject("templateLastUsed", ModelUploadedFileFilterInput.this.templateLastUsed.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.templateLastUsed.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.templateExternalLink.defined) {
                    inputFieldWriter.writeObject("templateExternalLink", ModelUploadedFileFilterInput.this.templateExternalLink.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.templateExternalLink.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.uploadSource.defined) {
                    inputFieldWriter.writeObject("uploadSource", ModelUploadedFileFilterInput.this.uploadSource.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.uploadSource.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileMetaData.defined) {
                    inputFieldWriter.writeObject("fileMetaData", ModelUploadedFileFilterInput.this.fileMetaData.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileMetaData.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileMimeType.defined) {
                    inputFieldWriter.writeObject("fileMimeType", ModelUploadedFileFilterInput.this.fileMimeType.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileMimeType.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.fileThumbnailUrl.defined) {
                    inputFieldWriter.writeObject("fileThumbnailUrl", ModelUploadedFileFilterInput.this.fileThumbnailUrl.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.fileThumbnailUrl.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.hasParent.defined) {
                    inputFieldWriter.writeObject("hasParent", ModelUploadedFileFilterInput.this.hasParent.value != 0 ? ((ModelHasParentInput) ModelUploadedFileFilterInput.this.hasParent.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.parentFileId.defined) {
                    inputFieldWriter.writeObject("parentFileId", ModelUploadedFileFilterInput.this.parentFileId.value != 0 ? ((ModelIDInput) ModelUploadedFileFilterInput.this.parentFileId.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.scopeLevel.defined) {
                    inputFieldWriter.writeObject("scopeLevel", ModelUploadedFileFilterInput.this.scopeLevel.value != 0 ? ((ModelScopeLevelInput) ModelUploadedFileFilterInput.this.scopeLevel.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", ModelUploadedFileFilterInput.this.scopeId.value != 0 ? ((ModelIDInput) ModelUploadedFileFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.uploadedById.defined) {
                    inputFieldWriter.writeObject("uploadedById", ModelUploadedFileFilterInput.this.uploadedById.value != 0 ? ((ModelIDInput) ModelUploadedFileFilterInput.this.uploadedById.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", ModelUploadedFileFilterInput.this.createdAt.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", ModelUploadedFileFilterInput.this.updatedAt.value != 0 ? ((ModelStringInput) ModelUploadedFileFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (ModelUploadedFileFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", ModelUploadedFileFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUploadedFileFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUploadedFileFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUploadedFileFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUploadedFileFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", ModelUploadedFileFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelUploadedFileFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelUploadedFileFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ModelUploadedFileFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ModelUploadedFileFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", ModelUploadedFileFilterInput.this.not.value != 0 ? ((ModelUploadedFileFilterInput) ModelUploadedFileFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public ModelUploadedFileFilterInput not() {
        return this.not.value;
    }

    public List<ModelUploadedFileFilterInput> or() {
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
