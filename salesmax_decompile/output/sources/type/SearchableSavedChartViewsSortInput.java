package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableSavedChartViewsSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableSavedChartViewsSortableFields> field;

    public static final class Builder {
        private Input<SearchableSavedChartViewsSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableSavedChartViewsSortInput build() {
            return new SearchableSavedChartViewsSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableSavedChartViewsSortableFields searchableSavedChartViewsSortableFields) {
            this.field = Input.fromNullable(searchableSavedChartViewsSortableFields);
            return this;
        }
    }

    public SearchableSavedChartViewsSortInput(Input<SearchableSavedChartViewsSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableSavedChartViewsSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableSavedChartViewsSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableSavedChartViewsSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableSavedChartViewsSortInput.this.field.value != 0 ? ((SearchableSavedChartViewsSortableFields) SearchableSavedChartViewsSortInput.this.field.value).name() : null);
                }
                if (SearchableSavedChartViewsSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableSavedChartViewsSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableSavedChartViewsSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
