package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableTemplateGallerySortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableTemplateGallerySortableFields> field;

    public static final class Builder {
        private Input<SearchableTemplateGallerySortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableTemplateGallerySortInput build() {
            return new SearchableTemplateGallerySortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableTemplateGallerySortableFields searchableTemplateGallerySortableFields) {
            this.field = Input.fromNullable(searchableTemplateGallerySortableFields);
            return this;
        }
    }

    public SearchableTemplateGallerySortInput(Input<SearchableTemplateGallerySortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableTemplateGallerySortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableTemplateGallerySortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableTemplateGallerySortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableTemplateGallerySortInput.this.field.value != 0 ? ((SearchableTemplateGallerySortableFields) SearchableTemplateGallerySortInput.this.field.value).name() : null);
                }
                if (SearchableTemplateGallerySortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableTemplateGallerySortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableTemplateGallerySortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
