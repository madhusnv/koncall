package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelContactAssignmentStatusInput implements InputType {
    private final Input<ContactAssignmentStatus> eq;
    private final Input<ContactAssignmentStatus> ne;

    public static final class Builder {
        private Input<ContactAssignmentStatus> eq = Input.absent();
        private Input<ContactAssignmentStatus> ne = Input.absent();

        public ModelContactAssignmentStatusInput build() {
            return new ModelContactAssignmentStatusInput(this.eq, this.ne);
        }

        public Builder eq(ContactAssignmentStatus contactAssignmentStatus) {
            this.eq = Input.fromNullable(contactAssignmentStatus);
            return this;
        }

        public Builder ne(ContactAssignmentStatus contactAssignmentStatus) {
            this.ne = Input.fromNullable(contactAssignmentStatus);
            return this;
        }
    }

    public ModelContactAssignmentStatusInput(Input<ContactAssignmentStatus> input, Input<ContactAssignmentStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ContactAssignmentStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelContactAssignmentStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelContactAssignmentStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelContactAssignmentStatusInput.this.eq.value != 0 ? ((ContactAssignmentStatus) ModelContactAssignmentStatusInput.this.eq.value).name() : null);
                }
                if (ModelContactAssignmentStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelContactAssignmentStatusInput.this.ne.value != 0 ? ((ContactAssignmentStatus) ModelContactAssignmentStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ContactAssignmentStatus ne() {
        return this.ne.value;
    }
}
