package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SectionRowInput implements InputType {
    private final Input<String> sectionRowDescription;
    private final Input<String> sectionRowId;
    private final Input<String> sectionRowTitle;

    public static final class Builder {
        private Input<String> sectionRowId = Input.absent();
        private Input<String> sectionRowTitle = Input.absent();
        private Input<String> sectionRowDescription = Input.absent();

        public SectionRowInput build() {
            return new SectionRowInput(this.sectionRowId, this.sectionRowTitle, this.sectionRowDescription);
        }

        public Builder sectionRowDescription(String str) {
            this.sectionRowDescription = Input.fromNullable(str);
            return this;
        }

        public Builder sectionRowId(String str) {
            this.sectionRowId = Input.fromNullable(str);
            return this;
        }

        public Builder sectionRowTitle(String str) {
            this.sectionRowTitle = Input.fromNullable(str);
            return this;
        }
    }

    public SectionRowInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.sectionRowId = input;
        this.sectionRowTitle = input2;
        this.sectionRowDescription = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SectionRowInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SectionRowInput.this.sectionRowId.defined) {
                    inputFieldWriter.writeString("sectionRowId", (String) SectionRowInput.this.sectionRowId.value);
                }
                if (SectionRowInput.this.sectionRowTitle.defined) {
                    inputFieldWriter.writeString("sectionRowTitle", (String) SectionRowInput.this.sectionRowTitle.value);
                }
                if (SectionRowInput.this.sectionRowDescription.defined) {
                    inputFieldWriter.writeString("sectionRowDescription", (String) SectionRowInput.this.sectionRowDescription.value);
                }
            }
        };
    }

    public String sectionRowDescription() {
        return this.sectionRowDescription.value;
    }

    public String sectionRowId() {
        return this.sectionRowId.value;
    }

    public String sectionRowTitle() {
        return this.sectionRowTitle.value;
    }
}
