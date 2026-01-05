package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableProductPlanSubscriptionSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableProductPlanSubscriptionSortableFields> field;

    public static final class Builder {
        private Input<SearchableProductPlanSubscriptionSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableProductPlanSubscriptionSortInput build() {
            return new SearchableProductPlanSubscriptionSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableProductPlanSubscriptionSortableFields searchableProductPlanSubscriptionSortableFields) {
            this.field = Input.fromNullable(searchableProductPlanSubscriptionSortableFields);
            return this;
        }
    }

    public SearchableProductPlanSubscriptionSortInput(Input<SearchableProductPlanSubscriptionSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableProductPlanSubscriptionSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableProductPlanSubscriptionSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableProductPlanSubscriptionSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableProductPlanSubscriptionSortInput.this.field.value != 0 ? ((SearchableProductPlanSubscriptionSortableFields) SearchableProductPlanSubscriptionSortInput.this.field.value).name() : null);
                }
                if (SearchableProductPlanSubscriptionSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableProductPlanSubscriptionSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableProductPlanSubscriptionSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
