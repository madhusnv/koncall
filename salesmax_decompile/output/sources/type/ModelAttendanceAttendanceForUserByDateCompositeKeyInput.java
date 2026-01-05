package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAttendanceAttendanceForUserByDateCompositeKeyInput implements InputType {
    private final Input<String> dateOfAttendance;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> userId = Input.absent();
        private Input<String> dateOfAttendance = Input.absent();

        public ModelAttendanceAttendanceForUserByDateCompositeKeyInput build() {
            return new ModelAttendanceAttendanceForUserByDateCompositeKeyInput(this.userId, this.dateOfAttendance);
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

    public ModelAttendanceAttendanceForUserByDateCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.userId = input;
        this.dateOfAttendance = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String dateOfAttendance() {
        return this.dateOfAttendance.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAttendanceAttendanceForUserByDateCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) ModelAttendanceAttendanceForUserByDateCompositeKeyInput.this.userId.value);
                }
                if (ModelAttendanceAttendanceForUserByDateCompositeKeyInput.this.dateOfAttendance.defined) {
                    inputFieldWriter.writeString("dateOfAttendance", (String) ModelAttendanceAttendanceForUserByDateCompositeKeyInput.this.dateOfAttendance.value);
                }
            }
        };
    }

    public String userId() {
        return this.userId.value;
    }
}
