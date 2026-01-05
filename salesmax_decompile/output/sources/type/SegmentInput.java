package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class SegmentInput implements InputType {
    private final Input<String> criteria;
    private final Input<String> defaultTableName;
    private final Input<String> joinStatement;
    private final Input<Integer> limit;
    private final Input<String> name;
    private final Input<String> template;

    public static final class Builder {
        private Input<String> name = Input.absent();
        private Input<String> template = Input.absent();
        private Input<String> joinStatement = Input.absent();
        private Input<String> criteria = Input.absent();
        private Input<String> defaultTableName = Input.absent();
        private Input<Integer> limit = Input.absent();

        public SegmentInput build() {
            return new SegmentInput(this.name, this.template, this.joinStatement, this.criteria, this.defaultTableName, this.limit);
        }

        public Builder criteria(String str) {
            this.criteria = Input.fromNullable(str);
            return this;
        }

        public Builder defaultTableName(String str) {
            this.defaultTableName = Input.fromNullable(str);
            return this;
        }

        public Builder joinStatement(String str) {
            this.joinStatement = Input.fromNullable(str);
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = Input.fromNullable(num);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder template(String str) {
            this.template = Input.fromNullable(str);
            return this;
        }
    }

    public SegmentInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6) {
        this.name = input;
        this.template = input2;
        this.joinStatement = input3;
        this.criteria = input4;
        this.defaultTableName = input5;
        this.limit = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String criteria() {
        return this.criteria.value;
    }

    public String defaultTableName() {
        return this.defaultTableName.value;
    }

    public String joinStatement() {
        return this.joinStatement.value;
    }

    public Integer limit() {
        return this.limit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SegmentInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SegmentInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) SegmentInput.this.name.value);
                }
                if (SegmentInput.this.template.defined) {
                    inputFieldWriter.writeString("template", (String) SegmentInput.this.template.value);
                }
                if (SegmentInput.this.joinStatement.defined) {
                    inputFieldWriter.writeString("joinStatement", (String) SegmentInput.this.joinStatement.value);
                }
                if (SegmentInput.this.criteria.defined) {
                    inputFieldWriter.writeString("criteria", (String) SegmentInput.this.criteria.value);
                }
                if (SegmentInput.this.defaultTableName.defined) {
                    inputFieldWriter.writeString("defaultTableName", (String) SegmentInput.this.defaultTableName.value);
                }
                if (SegmentInput.this.limit.defined) {
                    inputFieldWriter.writeInt("limit", (Integer) SegmentInput.this.limit.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String template() {
        return this.template.value;
    }
}
