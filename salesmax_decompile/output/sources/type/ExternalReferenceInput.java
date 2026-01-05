package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class ExternalReferenceInput implements InputType {
    private final String externalReferenceId;
    private final String externalReferenceIdSource;
    private final Input<String> externalReferenceSourceDate;

    public static final class Builder {
        private String externalReferenceId;
        private String externalReferenceIdSource;
        private Input<String> externalReferenceSourceDate = Input.absent();

        public ExternalReferenceInput build() {
            Utils.checkNotNull(this.externalReferenceId, "externalReferenceId == null");
            Utils.checkNotNull(this.externalReferenceIdSource, "externalReferenceIdSource == null");
            return new ExternalReferenceInput(this.externalReferenceId, this.externalReferenceIdSource, this.externalReferenceSourceDate);
        }

        public Builder externalReferenceId(String str) {
            this.externalReferenceId = str;
            return this;
        }

        public Builder externalReferenceIdSource(String str) {
            this.externalReferenceIdSource = str;
            return this;
        }

        public Builder externalReferenceSourceDate(String str) {
            this.externalReferenceSourceDate = Input.fromNullable(str);
            return this;
        }
    }

    public ExternalReferenceInput(String str, String str2, Input<String> input) {
        this.externalReferenceId = str;
        this.externalReferenceIdSource = str2;
        this.externalReferenceSourceDate = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String externalReferenceId() {
        return this.externalReferenceId;
    }

    public String externalReferenceIdSource() {
        return this.externalReferenceIdSource;
    }

    public String externalReferenceSourceDate() {
        return this.externalReferenceSourceDate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ExternalReferenceInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("externalReferenceId", ExternalReferenceInput.this.externalReferenceId);
                inputFieldWriter.writeString("externalReferenceIdSource", ExternalReferenceInput.this.externalReferenceIdSource);
                if (ExternalReferenceInput.this.externalReferenceSourceDate.defined) {
                    inputFieldWriter.writeString("externalReferenceSourceDate", (String) ExternalReferenceInput.this.externalReferenceSourceDate.value);
                }
            }
        };
    }
}
