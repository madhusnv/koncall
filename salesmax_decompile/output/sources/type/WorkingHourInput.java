package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WorkingHourInput implements InputType {
    private final Input<Day> day;
    private final Input<String> endTime;
    private final Input<String> startTime;

    public static final class Builder {
        private Input<Day> day = Input.absent();
        private Input<String> startTime = Input.absent();
        private Input<String> endTime = Input.absent();

        public WorkingHourInput build() {
            return new WorkingHourInput(this.day, this.startTime, this.endTime);
        }

        public Builder day(Day day) {
            this.day = Input.fromNullable(day);
            return this;
        }

        public Builder endTime(String str) {
            this.endTime = Input.fromNullable(str);
            return this;
        }

        public Builder startTime(String str) {
            this.startTime = Input.fromNullable(str);
            return this;
        }
    }

    public WorkingHourInput(Input<Day> input, Input<String> input2, Input<String> input3) {
        this.day = input;
        this.startTime = input2;
        this.endTime = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Day day() {
        return this.day.value;
    }

    public String endTime() {
        return this.endTime.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WorkingHourInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WorkingHourInput.this.day.defined) {
                    inputFieldWriter.writeString("day", WorkingHourInput.this.day.value != 0 ? ((Day) WorkingHourInput.this.day.value).name() : null);
                }
                if (WorkingHourInput.this.startTime.defined) {
                    inputFieldWriter.writeString("startTime", (String) WorkingHourInput.this.startTime.value);
                }
                if (WorkingHourInput.this.endTime.defined) {
                    inputFieldWriter.writeString("endTime", (String) WorkingHourInput.this.endTime.value);
                }
            }
        };
    }

    public String startTime() {
        return this.startTime.value;
    }
}
