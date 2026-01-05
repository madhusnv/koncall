package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchableStringFilterInput implements InputType {
    private final Input<String> eq;
    private final Input<Boolean> exists;
    private final Input<String> gt;
    private final Input<String> gte;
    private final Input<String> lt;
    private final Input<String> lte;
    private final Input<String> match;
    private final Input<String> matchPhrase;
    private final Input<String> matchPhrasePrefix;
    private final Input<String> multiMatch;
    private final Input<String> ne;
    private final Input<List<String>> range;
    private final Input<String> regexp;
    private final Input<String> wildcard;

    public static final class Builder {
        private Input<String> ne = Input.absent();
        private Input<String> gt = Input.absent();
        private Input<String> lt = Input.absent();
        private Input<String> gte = Input.absent();
        private Input<String> lte = Input.absent();
        private Input<String> eq = Input.absent();
        private Input<String> match = Input.absent();
        private Input<String> matchPhrase = Input.absent();
        private Input<String> matchPhrasePrefix = Input.absent();
        private Input<String> multiMatch = Input.absent();
        private Input<Boolean> exists = Input.absent();
        private Input<String> wildcard = Input.absent();
        private Input<String> regexp = Input.absent();
        private Input<List<String>> range = Input.absent();

        public SearchableStringFilterInput build() {
            return new SearchableStringFilterInput(this.ne, this.gt, this.lt, this.gte, this.lte, this.eq, this.match, this.matchPhrase, this.matchPhrasePrefix, this.multiMatch, this.exists, this.wildcard, this.regexp, this.range);
        }

        public Builder eq(String str) {
            this.eq = Input.fromNullable(str);
            return this;
        }

        public Builder exists(Boolean bool) {
            this.exists = Input.fromNullable(bool);
            return this;
        }

        public Builder gt(String str) {
            this.gt = Input.fromNullable(str);
            return this;
        }

        public Builder gte(String str) {
            this.gte = Input.fromNullable(str);
            return this;
        }

        public Builder lt(String str) {
            this.lt = Input.fromNullable(str);
            return this;
        }

        public Builder lte(String str) {
            this.lte = Input.fromNullable(str);
            return this;
        }

        public Builder match(String str) {
            this.match = Input.fromNullable(str);
            return this;
        }

        public Builder matchPhrase(String str) {
            this.matchPhrase = Input.fromNullable(str);
            return this;
        }

        public Builder matchPhrasePrefix(String str) {
            this.matchPhrasePrefix = Input.fromNullable(str);
            return this;
        }

        public Builder multiMatch(String str) {
            this.multiMatch = Input.fromNullable(str);
            return this;
        }

        public Builder ne(String str) {
            this.ne = Input.fromNullable(str);
            return this;
        }

        public Builder range(List<String> list) {
            this.range = Input.fromNullable(list);
            return this;
        }

        public Builder regexp(String str) {
            this.regexp = Input.fromNullable(str);
            return this;
        }

        public Builder wildcard(String str) {
            this.wildcard = Input.fromNullable(str);
            return this;
        }
    }

    public SearchableStringFilterInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<Boolean> input11, Input<String> input12, Input<String> input13, Input<List<String>> input14) {
        this.ne = input;
        this.gt = input2;
        this.lt = input3;
        this.gte = input4;
        this.lte = input5;
        this.eq = input6;
        this.match = input7;
        this.matchPhrase = input8;
        this.matchPhrasePrefix = input9;
        this.multiMatch = input10;
        this.exists = input11;
        this.wildcard = input12;
        this.regexp = input13;
        this.range = input14;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String eq() {
        return this.eq.value;
    }

    public Boolean exists() {
        return this.exists.value;
    }

    public String gt() {
        return this.gt.value;
    }

    public String gte() {
        return this.gte.value;
    }

    public String lt() {
        return this.lt.value;
    }

    public String lte() {
        return this.lte.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.SearchableStringFilterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (SearchableStringFilterInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", (String) SearchableStringFilterInput.this.ne.value);
                }
                if (SearchableStringFilterInput.this.gt.defined) {
                    inputFieldWriter.writeString("gt", (String) SearchableStringFilterInput.this.gt.value);
                }
                if (SearchableStringFilterInput.this.lt.defined) {
                    inputFieldWriter.writeString("lt", (String) SearchableStringFilterInput.this.lt.value);
                }
                if (SearchableStringFilterInput.this.gte.defined) {
                    inputFieldWriter.writeString("gte", (String) SearchableStringFilterInput.this.gte.value);
                }
                if (SearchableStringFilterInput.this.lte.defined) {
                    inputFieldWriter.writeString("lte", (String) SearchableStringFilterInput.this.lte.value);
                }
                if (SearchableStringFilterInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) SearchableStringFilterInput.this.eq.value);
                }
                if (SearchableStringFilterInput.this.match.defined) {
                    inputFieldWriter.writeString("match", (String) SearchableStringFilterInput.this.match.value);
                }
                if (SearchableStringFilterInput.this.matchPhrase.defined) {
                    inputFieldWriter.writeString("matchPhrase", (String) SearchableStringFilterInput.this.matchPhrase.value);
                }
                if (SearchableStringFilterInput.this.matchPhrasePrefix.defined) {
                    inputFieldWriter.writeString("matchPhrasePrefix", (String) SearchableStringFilterInput.this.matchPhrasePrefix.value);
                }
                if (SearchableStringFilterInput.this.multiMatch.defined) {
                    inputFieldWriter.writeString("multiMatch", (String) SearchableStringFilterInput.this.multiMatch.value);
                }
                if (SearchableStringFilterInput.this.exists.defined) {
                    inputFieldWriter.writeBoolean("exists", (Boolean) SearchableStringFilterInput.this.exists.value);
                }
                if (SearchableStringFilterInput.this.wildcard.defined) {
                    inputFieldWriter.writeString("wildcard", (String) SearchableStringFilterInput.this.wildcard.value);
                }
                if (SearchableStringFilterInput.this.regexp.defined) {
                    inputFieldWriter.writeString("regexp", (String) SearchableStringFilterInput.this.regexp.value);
                }
                if (SearchableStringFilterInput.this.range.defined) {
                    inputFieldWriter.writeList("range", SearchableStringFilterInput.this.range.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.SearchableStringFilterInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) SearchableStringFilterInput.this.range.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
            }
        };
    }

    public String match() {
        return this.match.value;
    }

    public String matchPhrase() {
        return this.matchPhrase.value;
    }

    public String matchPhrasePrefix() {
        return this.matchPhrasePrefix.value;
    }

    public String multiMatch() {
        return this.multiMatch.value;
    }

    public String ne() {
        return this.ne.value;
    }

    public List<String> range() {
        return this.range.value;
    }

    public String regexp() {
        return this.regexp.value;
    }

    public String wildcard() {
        return this.wildcard.value;
    }
}
