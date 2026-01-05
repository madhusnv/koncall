package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationScheduleMeetingBodyInput implements InputType {
    private final Input<MeetingRequest> input;

    public static final class Builder {
        private Input<MeetingRequest> input = Input.absent();

        public MutationScheduleMeetingBodyInput build() {
            return new MutationScheduleMeetingBodyInput(this.input);
        }

        public Builder input(MeetingRequest meetingRequest) {
            this.input = Input.fromNullable(meetingRequest);
            return this;
        }
    }

    public MutationScheduleMeetingBodyInput(Input<MeetingRequest> input) {
        this.input = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MeetingRequest input() {
        return this.input.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MutationScheduleMeetingBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationScheduleMeetingBodyInput.this.input.defined) {
                    inputFieldWriter.writeObject("input", MutationScheduleMeetingBodyInput.this.input.value != 0 ? ((MeetingRequest) MutationScheduleMeetingBodyInput.this.input.value).marshaller() : null);
                }
            }
        };
    }
}
