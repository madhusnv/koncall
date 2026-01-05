package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class MeetingParticipantInput implements InputType {
    private final Input<String> endTime;
    private final Input<String> id;
    private final Input<String> name;
    private final Input<String> startTime;

    public static final class Builder {
        private Input<String> id = Input.absent();
        private Input<String> name = Input.absent();
        private Input<String> startTime = Input.absent();
        private Input<String> endTime = Input.absent();

        public MeetingParticipantInput build() {
            return new MeetingParticipantInput(this.id, this.name, this.startTime, this.endTime);
        }

        public Builder endTime(String str) {
            this.endTime = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder startTime(String str) {
            this.startTime = Input.fromNullable(str);
            return this;
        }
    }

    public MeetingParticipantInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.id = input;
        this.name = input2;
        this.startTime = input3;
        this.endTime = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String endTime() {
        return this.endTime.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MeetingParticipantInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MeetingParticipantInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) MeetingParticipantInput.this.id.value);
                }
                if (MeetingParticipantInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) MeetingParticipantInput.this.name.value);
                }
                if (MeetingParticipantInput.this.startTime.defined) {
                    inputFieldWriter.writeString("startTime", (String) MeetingParticipantInput.this.startTime.value);
                }
                if (MeetingParticipantInput.this.endTime.defined) {
                    inputFieldWriter.writeString("endTime", (String) MeetingParticipantInput.this.endTime.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String startTime() {
        return this.startTime.value;
    }
}
