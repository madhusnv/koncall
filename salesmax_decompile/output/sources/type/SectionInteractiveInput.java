package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SectionInteractiveInput implements InputType {
    private final Input<List<ProductWaInput>> sectionProductItems;
    private final Input<List<SectionRowInput>> sectionRows;
    private final Input<String> sectionTitle;

    public static final class Builder {
        private Input<List<ProductWaInput>> sectionProductItems = Input.absent();
        private Input<List<SectionRowInput>> sectionRows = Input.absent();
        private Input<String> sectionTitle = Input.absent();

        public SectionInteractiveInput build() {
            return new SectionInteractiveInput(this.sectionProductItems, this.sectionRows, this.sectionTitle);
        }

        public Builder sectionProductItems(List<ProductWaInput> list) {
            this.sectionProductItems = Input.fromNullable(list);
            return this;
        }

        public Builder sectionRows(List<SectionRowInput> list) {
            this.sectionRows = Input.fromNullable(list);
            return this;
        }

        public Builder sectionTitle(String str) {
            this.sectionTitle = Input.fromNullable(str);
            return this;
        }
    }

    public SectionInteractiveInput(Input<List<ProductWaInput>> input, Input<List<SectionRowInput>> input2, Input<String> input3) {
        this.sectionProductItems = input;
        this.sectionRows = input2;
        this.sectionTitle = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SectionInteractiveInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SectionInteractiveInput.this.sectionProductItems.defined) {
                    inputFieldWriter.writeList("sectionProductItems", SectionInteractiveInput.this.sectionProductItems.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SectionInteractiveInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SectionInteractiveInput.this.sectionProductItems.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductWaInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SectionInteractiveInput.this.sectionRows.defined) {
                    inputFieldWriter.writeList("sectionRows", SectionInteractiveInput.this.sectionRows.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SectionInteractiveInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SectionInteractiveInput.this.sectionRows.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((SectionRowInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (SectionInteractiveInput.this.sectionTitle.defined) {
                    inputFieldWriter.writeString("sectionTitle", (String) SectionInteractiveInput.this.sectionTitle.value);
                }
            }
        };
    }

    public List<ProductWaInput> sectionProductItems() {
        return this.sectionProductItems.value;
    }

    public List<SectionRowInput> sectionRows() {
        return this.sectionRows.value;
    }

    public String sectionTitle() {
        return this.sectionTitle.value;
    }
}
