package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableIntFilterInput implements InputType {
    private final Input<Integer> eq;
    private final Input<Boolean> exists;
    private final Input<Integer> gt;
    private final Input<Integer> gte;
    private final Input<Integer> lt;
    private final Input<Integer> lte;
    private final Input<Integer> ne;
    private final Input<List<Integer>> range;

    public static final class Builder {
        private Input<Integer> ne = Input.absent();
        private Input<Integer> gt = Input.absent();
        private Input<Integer> lt = Input.absent();
        private Input<Integer> gte = Input.absent();
        private Input<Integer> lte = Input.absent();
        private Input<Integer> eq = Input.absent();
        private Input<List<Integer>> range = Input.absent();
        private Input<Boolean> exists = Input.absent();

        public SearchableIntFilterInput build() {
            return new SearchableIntFilterInput(this.ne, this.gt, this.lt, this.gte, this.lte, this.eq, this.range, this.exists);
        }

        public Builder eq(Integer num) {
            this.eq = Input.fromNullable(num);
            return this;
        }

        public Builder exists(Boolean bool) {
            this.exists = Input.fromNullable(bool);
            return this;
        }

        public Builder gt(Integer num) {
            this.gt = Input.fromNullable(num);
            return this;
        }

        public Builder gte(Integer num) {
            this.gte = Input.fromNullable(num);
            return this;
        }

        public Builder lt(Integer num) {
            this.lt = Input.fromNullable(num);
            return this;
        }

        public Builder lte(Integer num) {
            this.lte = Input.fromNullable(num);
            return this;
        }

        public Builder ne(Integer num) {
            this.ne = Input.fromNullable(num);
            return this;
        }

        public Builder range(List<Integer> list) {
            this.range = Input.fromNullable(list);
            return this;
        }
    }

    public SearchableIntFilterInput(Input<Integer> input, Input<Integer> input2, Input<Integer> input3, Input<Integer> input4, Input<Integer> input5, Input<Integer> input6, Input<List<Integer>> input7, Input<Boolean> input8) {
        this.ne = input;
        this.gt = input2;
        this.lt = input3;
        this.gte = input4;
        this.lte = input5;
        this.eq = input6;
        this.range = input7;
        this.exists = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer eq() {
        return this.eq.value;
    }

    public Boolean exists() {
        return this.exists.value;
    }

    public Integer gt() {
        return this.gt.value;
    }

    public Integer gte() {
        return this.gte.value;
    }

    public Integer lt() {
        return this.lt.value;
    }

    public Integer lte() {
        return this.lte.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableIntFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableIntFilterInput.this.ne.defined) {
                    inputFieldWriter.writeInt("ne", (Integer) SearchableIntFilterInput.this.ne.value);
                }
                if (SearchableIntFilterInput.this.gt.defined) {
                    inputFieldWriter.writeInt("gt", (Integer) SearchableIntFilterInput.this.gt.value);
                }
                if (SearchableIntFilterInput.this.lt.defined) {
                    inputFieldWriter.writeInt("lt", (Integer) SearchableIntFilterInput.this.lt.value);
                }
                if (SearchableIntFilterInput.this.gte.defined) {
                    inputFieldWriter.writeInt("gte", (Integer) SearchableIntFilterInput.this.gte.value);
                }
                if (SearchableIntFilterInput.this.lte.defined) {
                    inputFieldWriter.writeInt("lte", (Integer) SearchableIntFilterInput.this.lte.value);
                }
                if (SearchableIntFilterInput.this.eq.defined) {
                    inputFieldWriter.writeInt("eq", (Integer) SearchableIntFilterInput.this.eq.value);
                }
                if (SearchableIntFilterInput.this.range.defined) {
                    inputFieldWriter.writeList("range", SearchableIntFilterInput.this.range.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableIntFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableIntFilterInput.this.range.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeInt((Integer) it.next());
                            }
                        }
                    } : null);
                }
                if (SearchableIntFilterInput.this.exists.defined) {
                    inputFieldWriter.writeBoolean("exists", (Boolean) SearchableIntFilterInput.this.exists.value);
                }
            }
        };
    }

    public Integer ne() {
        return this.ne.value;
    }

    public List<Integer> range() {
        return this.range.value;
    }
}
