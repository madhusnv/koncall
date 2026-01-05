package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchablecustomFormAttachConditionSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchablecustomFormAttachConditionSortableFields> field;

    public static final class Builder {
        private Input<SearchablecustomFormAttachConditionSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchablecustomFormAttachConditionSortInput build() {
            return new SearchablecustomFormAttachConditionSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchablecustomFormAttachConditionSortableFields searchablecustomFormAttachConditionSortableFields) {
            this.field = Input.fromNullable(searchablecustomFormAttachConditionSortableFields);
            return this;
        }
    }

    public SearchablecustomFormAttachConditionSortInput(Input<SearchablecustomFormAttachConditionSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchablecustomFormAttachConditionSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchablecustomFormAttachConditionSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchablecustomFormAttachConditionSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchablecustomFormAttachConditionSortInput.this.field.value != 0 ? ((SearchablecustomFormAttachConditionSortableFields) SearchablecustomFormAttachConditionSortInput.this.field.value).name() : null);
                }
                if (SearchablecustomFormAttachConditionSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchablecustomFormAttachConditionSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchablecustomFormAttachConditionSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
