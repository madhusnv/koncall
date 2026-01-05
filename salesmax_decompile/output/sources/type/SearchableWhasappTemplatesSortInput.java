package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableWhasappTemplatesSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableWhasappTemplatesSortableFields> field;

    public static final class Builder {
        private Input<SearchableWhasappTemplatesSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableWhasappTemplatesSortInput build() {
            return new SearchableWhasappTemplatesSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableWhasappTemplatesSortableFields searchableWhasappTemplatesSortableFields) {
            this.field = Input.fromNullable(searchableWhasappTemplatesSortableFields);
            return this;
        }
    }

    public SearchableWhasappTemplatesSortInput(Input<SearchableWhasappTemplatesSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableWhasappTemplatesSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableWhasappTemplatesSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableWhasappTemplatesSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableWhasappTemplatesSortInput.this.field.value != 0 ? ((SearchableWhasappTemplatesSortableFields) SearchableWhasappTemplatesSortInput.this.field.value).name() : null);
                }
                if (SearchableWhasappTemplatesSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableWhasappTemplatesSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableWhasappTemplatesSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
