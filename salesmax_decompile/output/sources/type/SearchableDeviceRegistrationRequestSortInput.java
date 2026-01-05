package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SearchableDeviceRegistrationRequestSortInput implements InputType {
    private final Input<SearchableSortDirection> direction;
    private final Input<SearchableDeviceRegistrationRequestSortableFields> field;

    public static final class Builder {
        private Input<SearchableDeviceRegistrationRequestSortableFields> field = Input.absent();
        private Input<SearchableSortDirection> direction = Input.absent();

        public SearchableDeviceRegistrationRequestSortInput build() {
            return new SearchableDeviceRegistrationRequestSortInput(this.field, this.direction);
        }

        public Builder direction(SearchableSortDirection searchableSortDirection) {
            this.direction = Input.fromNullable(searchableSortDirection);
            return this;
        }

        public Builder field(SearchableDeviceRegistrationRequestSortableFields searchableDeviceRegistrationRequestSortableFields) {
            this.field = Input.fromNullable(searchableDeviceRegistrationRequestSortableFields);
            return this;
        }
    }

    public SearchableDeviceRegistrationRequestSortInput(Input<SearchableDeviceRegistrationRequestSortableFields> input, Input<SearchableSortDirection> input2) {
        this.field = input;
        this.direction = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SearchableSortDirection direction() {
        return this.direction.value;
    }

    public SearchableDeviceRegistrationRequestSortableFields field() {
        return this.field.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableDeviceRegistrationRequestSortInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableDeviceRegistrationRequestSortInput.this.field.defined) {
                    inputFieldWriter.writeString("field", SearchableDeviceRegistrationRequestSortInput.this.field.value != 0 ? ((SearchableDeviceRegistrationRequestSortableFields) SearchableDeviceRegistrationRequestSortInput.this.field.value).name() : null);
                }
                if (SearchableDeviceRegistrationRequestSortInput.this.direction.defined) {
                    inputFieldWriter.writeString("direction", SearchableDeviceRegistrationRequestSortInput.this.direction.value != 0 ? ((SearchableSortDirection) SearchableDeviceRegistrationRequestSortInput.this.direction.value).name() : null);
                }
            }
        };
    }
}
