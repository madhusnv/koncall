package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class TimeSlotToSendInput implements InputType {
    private final Input<String> timeEnd;
    private final Input<String> timeStart;

    public static final class Builder {
        private Input<String> timeStart = Input.absent();
        private Input<String> timeEnd = Input.absent();

        public TimeSlotToSendInput build() {
            return new TimeSlotToSendInput(this.timeStart, this.timeEnd);
        }

        public Builder timeEnd(String str) {
            this.timeEnd = Input.fromNullable(str);
            return this;
        }

        public Builder timeStart(String str) {
            this.timeStart = Input.fromNullable(str);
            return this;
        }
    }

    public TimeSlotToSendInput(Input<String> input, Input<String> input2) {
        this.timeStart = input;
        this.timeEnd = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.TimeSlotToSendInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (TimeSlotToSendInput.this.timeStart.defined) {
                    inputFieldWriter.writeString("timeStart", (String) TimeSlotToSendInput.this.timeStart.value);
                }
                if (TimeSlotToSendInput.this.timeEnd.defined) {
                    inputFieldWriter.writeString("timeEnd", (String) TimeSlotToSendInput.this.timeEnd.value);
                }
            }
        };
    }

    public String timeEnd() {
        return this.timeEnd.value;
    }

    public String timeStart() {
        return this.timeStart.value;
    }
}
