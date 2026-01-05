package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifyDocumentTextResult implements IdentifyResult {
    private final String fullText;
    private final List<BoundedKeyValue> keyValues;
    private final List<IdentifiedText> lines;
    private final List<String> rawLineText;
    private final List<Selection> selections;
    private final List<Table> tables;
    private final List<IdentifiedText> words;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private String fullText;
        private List<BoundedKeyValue> keyValues;
        private List<IdentifiedText> lines;
        private List<String> rawLineText;
        private List<Selection> selections;
        private List<Table> tables;
        private List<IdentifiedText> words;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public IdentifyDocumentTextResult build() {
            return new IdentifyDocumentTextResult(this, 0);
        }

        public Builder fullText(String str) {
            Objects.requireNonNull(str);
            this.fullText = str;
            return this;
        }

        public String getFullText() {
            String str = this.fullText;
            Objects.requireNonNull(str);
            return str;
        }

        public List<BoundedKeyValue> getKeyValues() {
            List<BoundedKeyValue> list = this.keyValues;
            Objects.requireNonNull(list);
            return list;
        }

        public List<IdentifiedText> getLines() {
            List<IdentifiedText> list = this.lines;
            Objects.requireNonNull(list);
            return list;
        }

        public List<String> getRawLineText() {
            List<String> list = this.rawLineText;
            Objects.requireNonNull(list);
            return list;
        }

        public List<Selection> getSelections() {
            List<Selection> list = this.selections;
            Objects.requireNonNull(list);
            return list;
        }

        public List<Table> getTables() {
            List<Table> list = this.tables;
            Objects.requireNonNull(list);
            return list;
        }

        public List<IdentifiedText> getWords() {
            List<IdentifiedText> list = this.words;
            Objects.requireNonNull(list);
            return list;
        }

        public Builder keyValues(List<BoundedKeyValue> list) {
            Objects.requireNonNull(list);
            this.keyValues = list;
            return this;
        }

        public Builder lines(List<IdentifiedText> list) {
            Objects.requireNonNull(list);
            this.lines = list;
            return this;
        }

        public Builder rawLineText(List<String> list) {
            Objects.requireNonNull(list);
            this.rawLineText = list;
            return this;
        }

        public Builder selections(List<Selection> list) {
            Objects.requireNonNull(list);
            this.selections = list;
            return this;
        }

        public Builder tables(List<Table> list) {
            Objects.requireNonNull(list);
            this.tables = list;
            return this;
        }

        public Builder words(List<IdentifiedText> list) {
            Objects.requireNonNull(list);
            this.words = list;
            return this;
        }

        private Builder() {
            List list = Collections.EMPTY_LIST;
            this.rawLineText = list;
            this.words = list;
            this.lines = list;
            this.selections = list;
            this.tables = list;
            this.keyValues = list;
        }
    }

    public /* synthetic */ IdentifyDocumentTextResult(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public String getFullText() {
        return this.fullText;
    }

    public List<BoundedKeyValue> getKeyValues() {
        return Immutable.of(this.keyValues);
    }

    public List<IdentifiedText> getLines() {
        return Immutable.of(this.lines);
    }

    public List<String> getRawLineText() {
        return Immutable.of(this.rawLineText);
    }

    public List<Selection> getSelections() {
        return Immutable.of(this.selections);
    }

    public List<Table> getTables() {
        return Immutable.of(this.tables);
    }

    public List<IdentifiedText> getWords() {
        return Immutable.of(this.words);
    }

    private IdentifyDocumentTextResult(Builder builder) {
        this.fullText = builder.getFullText();
        this.rawLineText = builder.getRawLineText();
        this.words = builder.getWords();
        this.lines = builder.getLines();
        this.selections = builder.getSelections();
        this.tables = builder.getTables();
        this.keyValues = builder.getKeyValues();
    }
}
