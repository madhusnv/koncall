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
public final class SearchableUploadedFileFilterInput implements InputType {
    private final Input<SearchableIDFilterInput> accountId;
    private final Input<List<SearchableUploadedFileFilterInput>> and;
    private final Input<SearchableStringFilterInput> createdAt;
    private final Input<SearchableStringFilterInput> description;
    private final Input<SearchableStringFilterInput> documentCategory;
    private final Input<SearchableStringFilterInput> documentSubCategory;
    private final Input<SearchableStringFilterInput> fileMetaData;
    private final Input<SearchableStringFilterInput> fileMimeType;
    private final Input<SearchableStringFilterInput> fileName;
    private final Input<SearchableStringFilterInput> fileStorageDestination;
    private final Input<SearchableStringFilterInput> fileThumbnailUrl;
    private final Input<SearchableStringFilterInput> fileUrl;
    private final Input<SearchableIDFilterInput> id;
    private final Input<SearchableUploadedFileFilterInput> not;
    private final Input<List<SearchableUploadedFileFilterInput>> or;
    private final Input<SearchableIDFilterInput> parentFileId;
    private final Input<SearchableIDFilterInput> scopeId;
    private final Input<SearchableStringFilterInput> tags;
    private final Input<SearchableStringFilterInput> templateBody;
    private final Input<SearchableStringFilterInput> templateExternalLink;
    private final Input<SearchableStringFilterInput> templateLastUsed;
    private final Input<SearchableStringFilterInput> templateTitle;
    private final Input<SearchableStringFilterInput> templateType;
    private final Input<SearchableStringFilterInput> updatedAt;
    private final Input<SearchableStringFilterInput> uploadSource;
    private final Input<SearchableIDFilterInput> uploadedById;

    public static final class Builder {
        private Input<SearchableIDFilterInput> id = Input.absent();
        private Input<SearchableIDFilterInput> accountId = Input.absent();
        private Input<SearchableStringFilterInput> fileUrl = Input.absent();
        private Input<SearchableStringFilterInput> fileStorageDestination = Input.absent();
        private Input<SearchableStringFilterInput> fileName = Input.absent();
        private Input<SearchableStringFilterInput> description = Input.absent();
        private Input<SearchableStringFilterInput> documentCategory = Input.absent();
        private Input<SearchableStringFilterInput> documentSubCategory = Input.absent();
        private Input<SearchableStringFilterInput> tags = Input.absent();
        private Input<SearchableStringFilterInput> templateType = Input.absent();
        private Input<SearchableStringFilterInput> templateTitle = Input.absent();
        private Input<SearchableStringFilterInput> templateBody = Input.absent();
        private Input<SearchableStringFilterInput> templateLastUsed = Input.absent();
        private Input<SearchableStringFilterInput> templateExternalLink = Input.absent();
        private Input<SearchableStringFilterInput> uploadSource = Input.absent();
        private Input<SearchableStringFilterInput> fileMetaData = Input.absent();
        private Input<SearchableStringFilterInput> fileMimeType = Input.absent();
        private Input<SearchableStringFilterInput> fileThumbnailUrl = Input.absent();
        private Input<SearchableIDFilterInput> parentFileId = Input.absent();
        private Input<SearchableIDFilterInput> scopeId = Input.absent();
        private Input<SearchableIDFilterInput> uploadedById = Input.absent();
        private Input<SearchableStringFilterInput> createdAt = Input.absent();
        private Input<SearchableStringFilterInput> updatedAt = Input.absent();
        private Input<List<SearchableUploadedFileFilterInput>> and = Input.absent();
        private Input<List<SearchableUploadedFileFilterInput>> or = Input.absent();
        private Input<SearchableUploadedFileFilterInput> not = Input.absent();

        public Builder accountId(SearchableIDFilterInput searchableIDFilterInput) {
            this.accountId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder and(List<SearchableUploadedFileFilterInput> list) {
            this.and = Input.fromNullable(list);
            return this;
        }

        public SearchableUploadedFileFilterInput build() {
            return new SearchableUploadedFileFilterInput(this.id, this.accountId, this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.documentSubCategory, this.tags, this.templateType, this.templateTitle, this.templateBody, this.templateLastUsed, this.templateExternalLink, this.uploadSource, this.fileMetaData, this.fileMimeType, this.fileThumbnailUrl, this.parentFileId, this.scopeId, this.uploadedById, this.createdAt, this.updatedAt, this.and, this.or, this.not);
        }

        public Builder createdAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.createdAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder description(SearchableStringFilterInput searchableStringFilterInput) {
            this.description = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder documentCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.documentCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder documentSubCategory(SearchableStringFilterInput searchableStringFilterInput) {
            this.documentSubCategory = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileMetaData(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileMetaData = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileMimeType(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileMimeType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileName(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileName = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileStorageDestination(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileStorageDestination = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileThumbnailUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileThumbnailUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder fileUrl(SearchableStringFilterInput searchableStringFilterInput) {
            this.fileUrl = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder id(SearchableIDFilterInput searchableIDFilterInput) {
            this.id = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder not(SearchableUploadedFileFilterInput searchableUploadedFileFilterInput) {
            this.not = Input.fromNullable(searchableUploadedFileFilterInput);
            return this;
        }

        public Builder or(List<SearchableUploadedFileFilterInput> list) {
            this.or = Input.fromNullable(list);
            return this;
        }

        public Builder parentFileId(SearchableIDFilterInput searchableIDFilterInput) {
            this.parentFileId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder scopeId(SearchableIDFilterInput searchableIDFilterInput) {
            this.scopeId = Input.fromNullable(searchableIDFilterInput);
            return this;
        }

        public Builder tags(SearchableStringFilterInput searchableStringFilterInput) {
            this.tags = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateBody(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateBody = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateExternalLink(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateExternalLink = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateLastUsed(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateLastUsed = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateTitle(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateTitle = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder templateType(SearchableStringFilterInput searchableStringFilterInput) {
            this.templateType = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder updatedAt(SearchableStringFilterInput searchableStringFilterInput) {
            this.updatedAt = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder uploadSource(SearchableStringFilterInput searchableStringFilterInput) {
            this.uploadSource = Input.fromNullable(searchableStringFilterInput);
            return this;
        }

        public Builder uploadedById(SearchableIDFilterInput searchableIDFilterInput) {
            this.uploadedById = Input.fromNullable(searchableIDFilterInput);
            return this;
        }
    }

    public SearchableUploadedFileFilterInput(Input<SearchableIDFilterInput> input, Input<SearchableIDFilterInput> input2, Input<SearchableStringFilterInput> input3, Input<SearchableStringFilterInput> input4, Input<SearchableStringFilterInput> input5, Input<SearchableStringFilterInput> input6, Input<SearchableStringFilterInput> input7, Input<SearchableStringFilterInput> input8, Input<SearchableStringFilterInput> input9, Input<SearchableStringFilterInput> input10, Input<SearchableStringFilterInput> input11, Input<SearchableStringFilterInput> input12, Input<SearchableStringFilterInput> input13, Input<SearchableStringFilterInput> input14, Input<SearchableStringFilterInput> input15, Input<SearchableStringFilterInput> input16, Input<SearchableStringFilterInput> input17, Input<SearchableStringFilterInput> input18, Input<SearchableIDFilterInput> input19, Input<SearchableIDFilterInput> input20, Input<SearchableIDFilterInput> input21, Input<SearchableStringFilterInput> input22, Input<SearchableStringFilterInput> input23, Input<List<SearchableUploadedFileFilterInput>> input24, Input<List<SearchableUploadedFileFilterInput>> input25, Input<SearchableUploadedFileFilterInput> input26) {
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
        this.parentFileId = input19;
        this.scopeId = input20;
        this.uploadedById = input21;
        this.createdAt = input22;
        this.updatedAt = input23;
        this.and = input24;
        this.or = input25;
        this.not = input26;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableIDFilterInput accountId() {
        return this.accountId.value;
    }

    public List<SearchableUploadedFileFilterInput> and() {
        return this.and.value;
    }

    public SearchableStringFilterInput createdAt() {
        return this.createdAt.value;
    }

    public SearchableStringFilterInput description() {
        return this.description.value;
    }

    public SearchableStringFilterInput documentCategory() {
        return this.documentCategory.value;
    }

    public SearchableStringFilterInput documentSubCategory() {
        return this.documentSubCategory.value;
    }

    public SearchableStringFilterInput fileMetaData() {
        return this.fileMetaData.value;
    }

    public SearchableStringFilterInput fileMimeType() {
        return this.fileMimeType.value;
    }

    public SearchableStringFilterInput fileName() {
        return this.fileName.value;
    }

    public SearchableStringFilterInput fileStorageDestination() {
        return this.fileStorageDestination.value;
    }

    public SearchableStringFilterInput fileThumbnailUrl() {
        return this.fileThumbnailUrl.value;
    }

    public SearchableStringFilterInput fileUrl() {
        return this.fileUrl.value;
    }

    public SearchableIDFilterInput id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableUploadedFileFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableUploadedFileFilterInput.this.id.defined) {
                    inputFieldWriter.writeObject(OutcomeConstants.OUTCOME_ID, SearchableUploadedFileFilterInput.this.id.value != 0 ? ((SearchableIDFilterInput) SearchableUploadedFileFilterInput.this.id.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.accountId.defined) {
                    inputFieldWriter.writeObject("accountId", SearchableUploadedFileFilterInput.this.accountId.value != 0 ? ((SearchableIDFilterInput) SearchableUploadedFileFilterInput.this.accountId.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileUrl.defined) {
                    inputFieldWriter.writeObject("fileUrl", SearchableUploadedFileFilterInput.this.fileUrl.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileUrl.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeObject("fileStorageDestination", SearchableUploadedFileFilterInput.this.fileStorageDestination.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileStorageDestination.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileName.defined) {
                    inputFieldWriter.writeObject("fileName", SearchableUploadedFileFilterInput.this.fileName.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileName.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.description.defined) {
                    inputFieldWriter.writeObject(MediaTrack.ROLE_DESCRIPTION, SearchableUploadedFileFilterInput.this.description.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.description.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.documentCategory.defined) {
                    inputFieldWriter.writeObject("documentCategory", SearchableUploadedFileFilterInput.this.documentCategory.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.documentCategory.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.documentSubCategory.defined) {
                    inputFieldWriter.writeObject("documentSubCategory", SearchableUploadedFileFilterInput.this.documentSubCategory.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.documentSubCategory.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.tags.defined) {
                    inputFieldWriter.writeObject("tags", SearchableUploadedFileFilterInput.this.tags.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.tags.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.templateType.defined) {
                    inputFieldWriter.writeObject("templateType", SearchableUploadedFileFilterInput.this.templateType.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.templateType.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.templateTitle.defined) {
                    inputFieldWriter.writeObject("templateTitle", SearchableUploadedFileFilterInput.this.templateTitle.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.templateTitle.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.templateBody.defined) {
                    inputFieldWriter.writeObject("templateBody", SearchableUploadedFileFilterInput.this.templateBody.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.templateBody.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.templateLastUsed.defined) {
                    inputFieldWriter.writeObject("templateLastUsed", SearchableUploadedFileFilterInput.this.templateLastUsed.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.templateLastUsed.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.templateExternalLink.defined) {
                    inputFieldWriter.writeObject("templateExternalLink", SearchableUploadedFileFilterInput.this.templateExternalLink.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.templateExternalLink.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.uploadSource.defined) {
                    inputFieldWriter.writeObject("uploadSource", SearchableUploadedFileFilterInput.this.uploadSource.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.uploadSource.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileMetaData.defined) {
                    inputFieldWriter.writeObject("fileMetaData", SearchableUploadedFileFilterInput.this.fileMetaData.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileMetaData.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileMimeType.defined) {
                    inputFieldWriter.writeObject("fileMimeType", SearchableUploadedFileFilterInput.this.fileMimeType.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileMimeType.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.fileThumbnailUrl.defined) {
                    inputFieldWriter.writeObject("fileThumbnailUrl", SearchableUploadedFileFilterInput.this.fileThumbnailUrl.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.fileThumbnailUrl.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.parentFileId.defined) {
                    inputFieldWriter.writeObject("parentFileId", SearchableUploadedFileFilterInput.this.parentFileId.value != 0 ? ((SearchableIDFilterInput) SearchableUploadedFileFilterInput.this.parentFileId.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.scopeId.defined) {
                    inputFieldWriter.writeObject("scopeId", SearchableUploadedFileFilterInput.this.scopeId.value != 0 ? ((SearchableIDFilterInput) SearchableUploadedFileFilterInput.this.scopeId.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.uploadedById.defined) {
                    inputFieldWriter.writeObject("uploadedById", SearchableUploadedFileFilterInput.this.uploadedById.value != 0 ? ((SearchableIDFilterInput) SearchableUploadedFileFilterInput.this.uploadedById.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.createdAt.defined) {
                    inputFieldWriter.writeObject("createdAt", SearchableUploadedFileFilterInput.this.createdAt.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.createdAt.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", SearchableUploadedFileFilterInput.this.updatedAt.value != 0 ? ((SearchableStringFilterInput) SearchableUploadedFileFilterInput.this.updatedAt.value).marshaller() : null);
                }
                if (SearchableUploadedFileFilterInput.this.and.defined) {
                    inputFieldWriter.writeList("and", SearchableUploadedFileFilterInput.this.and.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableUploadedFileFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableUploadedFileFilterInput.this.and.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableUploadedFileFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableUploadedFileFilterInput.this.or.defined) {
                    inputFieldWriter.writeList("or", SearchableUploadedFileFilterInput.this.or.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableUploadedFileFilterInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableUploadedFileFilterInput.this.or.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SearchableUploadedFileFilterInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SearchableUploadedFileFilterInput.this.not.defined) {
                    inputFieldWriter.writeObject("not", SearchableUploadedFileFilterInput.this.not.value != 0 ? ((SearchableUploadedFileFilterInput) SearchableUploadedFileFilterInput.this.not.value).marshaller() : null);
                }
            }
        };
    }

    public SearchableUploadedFileFilterInput not() {
        return this.not.value;
    }

    public List<SearchableUploadedFileFilterInput> or() {
        return this.or.value;
    }

    public SearchableIDFilterInput parentFileId() {
        return this.parentFileId.value;
    }

    public SearchableIDFilterInput scopeId() {
        return this.scopeId.value;
    }

    public SearchableStringFilterInput tags() {
        return this.tags.value;
    }

    public SearchableStringFilterInput templateBody() {
        return this.templateBody.value;
    }

    public SearchableStringFilterInput templateExternalLink() {
        return this.templateExternalLink.value;
    }

    public SearchableStringFilterInput templateLastUsed() {
        return this.templateLastUsed.value;
    }

    public SearchableStringFilterInput templateTitle() {
        return this.templateTitle.value;
    }

    public SearchableStringFilterInput templateType() {
        return this.templateType.value;
    }

    public SearchableStringFilterInput updatedAt() {
        return this.updatedAt.value;
    }

    public SearchableStringFilterInput uploadSource() {
        return this.uploadSource.value;
    }

    public SearchableIDFilterInput uploadedById() {
        return this.uploadedById.value;
    }
}
