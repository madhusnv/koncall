package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class AssignmentRulesetInput implements InputType {
    private final Input<List<AssigneeInput>> assigneeSet;
    private final Input<String> assigneeSetCondition;
    private final Input<DistributionType> distributionType;
    private final Input<String> incomingCondition;

    public static final class Builder {
        private Input<String> incomingCondition = Input.absent();
        private Input<List<AssigneeInput>> assigneeSet = Input.absent();
        private Input<String> assigneeSetCondition = Input.absent();
        private Input<DistributionType> distributionType = Input.absent();

        public Builder assigneeSet(List<AssigneeInput> list) {
            this.assigneeSet = Input.fromNullable(list);
            return this;
        }

        public Builder assigneeSetCondition(String str) {
            this.assigneeSetCondition = Input.fromNullable(str);
            return this;
        }

        public AssignmentRulesetInput build() {
            return new AssignmentRulesetInput(this.incomingCondition, this.assigneeSet, this.assigneeSetCondition, this.distributionType);
        }

        public Builder distributionType(DistributionType distributionType) {
            this.distributionType = Input.fromNullable(distributionType);
            return this;
        }

        public Builder incomingCondition(String str) {
            this.incomingCondition = Input.fromNullable(str);
            return this;
        }
    }

    public AssignmentRulesetInput(Input<String> input, Input<List<AssigneeInput>> input2, Input<String> input3, Input<DistributionType> input4) {
        this.incomingCondition = input;
        this.assigneeSet = input2;
        this.assigneeSetCondition = input3;
        this.distributionType = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<AssigneeInput> assigneeSet() {
        return this.assigneeSet.value;
    }

    public String assigneeSetCondition() {
        return this.assigneeSetCondition.value;
    }

    public DistributionType distributionType() {
        return this.distributionType.value;
    }

    public String incomingCondition() {
        return this.incomingCondition.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.AssignmentRulesetInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (AssignmentRulesetInput.this.incomingCondition.defined) {
                    inputFieldWriter.writeString("incomingCondition", (String) AssignmentRulesetInput.this.incomingCondition.value);
                }
                if (AssignmentRulesetInput.this.assigneeSet.defined) {
                    inputFieldWriter.writeList("assigneeSet", AssignmentRulesetInput.this.assigneeSet.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.AssignmentRulesetInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) AssignmentRulesetInput.this.assigneeSet.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AssigneeInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (AssignmentRulesetInput.this.assigneeSetCondition.defined) {
                    inputFieldWriter.writeString("assigneeSetCondition", (String) AssignmentRulesetInput.this.assigneeSetCondition.value);
                }
                if (AssignmentRulesetInput.this.distributionType.defined) {
                    inputFieldWriter.writeString("distributionType", AssignmentRulesetInput.this.distributionType.value != 0 ? ((DistributionType) AssignmentRulesetInput.this.distributionType.value).name() : null);
                }
            }
        };
    }
}
