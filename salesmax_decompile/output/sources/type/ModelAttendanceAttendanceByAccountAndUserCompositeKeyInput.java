package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput implements InputType {
    private final Input<String> dateOfAttendance;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> dateOfAttendance = Input.absent();
        private Input<String> userId = Input.absent();

        public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput build() {
            return new ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput(this.dateOfAttendance, this.userId);
        }

        public Builder dateOfAttendance(String str) {
            this.dateOfAttendance = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.dateOfAttendance = input;
        this.userId = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String dateOfAttendance() {
        return this.dateOfAttendance.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeString("dateOfAttendance", (String) ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.this.dateOfAttendance.value);
                }
                if (ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) ModelAttendanceAttendanceByAccountAndUserCompositeKeyInput.this.userId.value);
                }
            }
        };
    }

    public String userId() {
        return this.userId.value;
    }
}
