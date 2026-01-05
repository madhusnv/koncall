package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableFloatFilterInput implements InputType {
    private final Input<Double> eq;
    private final Input<Double> gt;
    private final Input<Double> gte;
    private final Input<Double> lt;
    private final Input<Double> lte;
    private final Input<Double> ne;
    private final Input<List<Double>> range;

    public static final class Builder {
        private Input<Double> ne = Input.absent();
        private Input<Double> gt = Input.absent();
        private Input<Double> lt = Input.absent();
        private Input<Double> gte = Input.absent();
        private Input<Double> lte = Input.absent();
        private Input<Double> eq = Input.absent();
        private Input<List<Double>> range = Input.absent();

        public SearchableFloatFilterInput build() {
            return new SearchableFloatFilterInput(this.ne, this.gt, this.lt, this.gte, this.lte, this.eq, this.range);
        }

        public Builder eq(Double d) {
            this.eq = Input.fromNullable(d);
            return this;
        }

        public Builder gt(Double d) {
            this.gt = Input.fromNullable(d);
            return this;
        }

        public Builder gte(Double d) {
            this.gte = Input.fromNullable(d);
            return this;
        }

        public Builder lt(Double d) {
            this.lt = Input.fromNullable(d);
            return this;
        }

        public Builder lte(Double d) {
            this.lte = Input.fromNullable(d);
            return this;
        }

        public Builder ne(Double d) {
            this.ne = Input.fromNullable(d);
            return this;
        }

        public Builder range(List<Double> list) {
            this.range = Input.fromNullable(list);
            return this;
        }
    }

    public SearchableFloatFilterInput(Input<Double> input, Input<Double> input2, Input<Double> input3, Input<Double> input4, Input<Double> input5, Input<Double> input6, Input<List<Double>> input7) {
        this.ne = input;
        this.gt = input2;
        this.lt = input3;
        this.gte = input4;
        this.lte = input5;
        this.eq = input6;
        this.range = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Double eq() {
        return this.eq.value;
    }

    public Double gt() {
        return this.gt.value;
    }

    public Double gte() {
        return this.gte.value;
    }

    public Double lt() {
        return this.lt.value;
    }

    public Double lte() {
        return this.lte.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableFloatFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableFloatFilterInput.this.ne.defined) {
                    inputFieldWriter.writeDouble("ne", (Double) SearchableFloatFilterInput.this.ne.value);
                }
                if (SearchableFloatFilterInput.this.gt.defined) {
                    inputFieldWriter.writeDouble("gt", (Double) SearchableFloatFilterInput.this.gt.value);
                }
                if (SearchableFloatFilterInput.this.lt.defined) {
                    inputFieldWriter.writeDouble("lt", (Double) SearchableFloatFilterInput.this.lt.value);
                }
                if (SearchableFloatFilterInput.this.gte.defined) {
                    inputFieldWriter.writeDouble("gte", (Double) SearchableFloatFilterInput.this.gte.value);
                }
                if (SearchableFloatFilterInput.this.lte.defined) {
                    inputFieldWriter.writeDouble("lte", (Double) SearchableFloatFilterInput.this.lte.value);
                }
                if (SearchableFloatFilterInput.this.eq.defined) {
                    inputFieldWriter.writeDouble("eq", (Double) SearchableFloatFilterInput.this.eq.value);
                }
                if (SearchableFloatFilterInput.this.range.defined) {
                    inputFieldWriter.writeList("range", SearchableFloatFilterInput.this.range.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableFloatFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableFloatFilterInput.this.range.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public Double ne() {
        return this.ne.value;
    }

    public List<Double> range() {
        return this.range.value;
    }
}
