package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class TemplateComponentInput implements InputType {
    private final Input<WaBodyInput> waBody;
    private final Input<List<WaButtonInput>> waButton;
    private final Input<WaFooterInput> waFooter;
    private final Input<WaHeaderInput> waHeader;

    public static final class Builder {
        private Input<WaHeaderInput> waHeader = Input.absent();
        private Input<WaBodyInput> waBody = Input.absent();
        private Input<WaFooterInput> waFooter = Input.absent();
        private Input<List<WaButtonInput>> waButton = Input.absent();

        public TemplateComponentInput build() {
            return new TemplateComponentInput(this.waHeader, this.waBody, this.waFooter, this.waButton);
        }

        public Builder waBody(WaBodyInput waBodyInput) {
            this.waBody = Input.fromNullable(waBodyInput);
            return this;
        }

        public Builder waButton(List<WaButtonInput> list) {
            this.waButton = Input.fromNullable(list);
            return this;
        }

        public Builder waFooter(WaFooterInput waFooterInput) {
            this.waFooter = Input.fromNullable(waFooterInput);
            return this;
        }

        public Builder waHeader(WaHeaderInput waHeaderInput) {
            this.waHeader = Input.fromNullable(waHeaderInput);
            return this;
        }
    }

    public TemplateComponentInput(Input<WaHeaderInput> input, Input<WaBodyInput> input2, Input<WaFooterInput> input3, Input<List<WaButtonInput>> input4) {
        this.waHeader = input;
        this.waBody = input2;
        this.waFooter = input3;
        this.waButton = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.TemplateComponentInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (TemplateComponentInput.this.waHeader.defined) {
                    inputFieldWriter.writeObject("waHeader", TemplateComponentInput.this.waHeader.value != 0 ? ((WaHeaderInput) TemplateComponentInput.this.waHeader.value).marshaller() : null);
                }
                if (TemplateComponentInput.this.waBody.defined) {
                    inputFieldWriter.writeObject("waBody", TemplateComponentInput.this.waBody.value != 0 ? ((WaBodyInput) TemplateComponentInput.this.waBody.value).marshaller() : null);
                }
                if (TemplateComponentInput.this.waFooter.defined) {
                    inputFieldWriter.writeObject("waFooter", TemplateComponentInput.this.waFooter.value != 0 ? ((WaFooterInput) TemplateComponentInput.this.waFooter.value).marshaller() : null);
                }
                if (TemplateComponentInput.this.waButton.defined) {
                    inputFieldWriter.writeList("waButton", TemplateComponentInput.this.waButton.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.TemplateComponentInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) TemplateComponentInput.this.waButton.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((WaButtonInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public WaBodyInput waBody() {
        return this.waBody.value;
    }

    public List<WaButtonInput> waButton() {
        return this.waButton.value;
    }

    public WaFooterInput waFooter() {
        return this.waFooter.value;
    }

    public WaHeaderInput waHeader() {
        return this.waHeader.value;
    }
}
