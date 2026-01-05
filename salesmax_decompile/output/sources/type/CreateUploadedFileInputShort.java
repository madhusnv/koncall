package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.android.gms.cast.MediaTrack;

/* loaded from: classes7.dex */
public final class CreateUploadedFileInputShort implements InputType {
    private final Input<String> description;
    private final Input<String> documentCategory;
    private final Input<String> fileMetaData;
    private final Input<String> fileMimeType;
    private final Input<String> fileName;
    private final Input<String> fileStorageDestination;
    private final Input<String> fileUrl;
    private final Input<String> uploadSource;

    public static final class Builder {
        private Input<String> fileUrl = Input.absent();
        private Input<String> fileStorageDestination = Input.absent();
        private Input<String> fileName = Input.absent();
        private Input<String> description = Input.absent();
        private Input<String> documentCategory = Input.absent();
        private Input<String> uploadSource = Input.absent();
        private Input<String> fileMetaData = Input.absent();
        private Input<String> fileMimeType = Input.absent();

        public CreateUploadedFileInputShort build() {
            return new CreateUploadedFileInputShort(this.fileUrl, this.fileStorageDestination, this.fileName, this.description, this.documentCategory, this.uploadSource, this.fileMetaData, this.fileMimeType);
        }

        public Builder description(String str) {
            this.description = Input.fromNullable(str);
            return this;
        }

        public Builder documentCategory(String str) {
            this.documentCategory = Input.fromNullable(str);
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

        public Builder fileUrl(String str) {
            this.fileUrl = Input.fromNullable(str);
            return this;
        }

        public Builder uploadSource(String str) {
            this.uploadSource = Input.fromNullable(str);
            return this;
        }
    }

    public CreateUploadedFileInputShort(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8) {
        this.fileUrl = input;
        this.fileStorageDestination = input2;
        this.fileName = input3;
        this.description = input4;
        this.documentCategory = input5;
        this.uploadSource = input6;
        this.fileMetaData = input7;
        this.fileMimeType = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String description() {
        return this.description.value;
    }

    public String documentCategory() {
        return this.documentCategory.value;
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

    public String fileUrl() {
        return this.fileUrl.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateUploadedFileInputShort.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateUploadedFileInputShort.this.fileUrl.defined) {
                    inputFieldWriter.writeString("fileUrl", (String) CreateUploadedFileInputShort.this.fileUrl.value);
                }
                if (CreateUploadedFileInputShort.this.fileStorageDestination.defined) {
                    inputFieldWriter.writeString("fileStorageDestination", (String) CreateUploadedFileInputShort.this.fileStorageDestination.value);
                }
                if (CreateUploadedFileInputShort.this.fileName.defined) {
                    inputFieldWriter.writeString("fileName", (String) CreateUploadedFileInputShort.this.fileName.value);
                }
                if (CreateUploadedFileInputShort.this.description.defined) {
                    inputFieldWriter.writeString(MediaTrack.ROLE_DESCRIPTION, (String) CreateUploadedFileInputShort.this.description.value);
                }
                if (CreateUploadedFileInputShort.this.documentCategory.defined) {
                    inputFieldWriter.writeString("documentCategory", (String) CreateUploadedFileInputShort.this.documentCategory.value);
                }
                if (CreateUploadedFileInputShort.this.uploadSource.defined) {
                    inputFieldWriter.writeString("uploadSource", (String) CreateUploadedFileInputShort.this.uploadSource.value);
                }
                if (CreateUploadedFileInputShort.this.fileMetaData.defined) {
                    inputFieldWriter.writeString("fileMetaData", (String) CreateUploadedFileInputShort.this.fileMetaData.value);
                }
                if (CreateUploadedFileInputShort.this.fileMimeType.defined) {
                    inputFieldWriter.writeString("fileMimeType", (String) CreateUploadedFileInputShort.this.fileMimeType.value);
                }
            }
        };
    }

    public String uploadSource() {
        return this.uploadSource.value;
    }
}
