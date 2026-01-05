package com.amplifyframework.storage.options;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SubpathStrategy {

    public static final class Exclude extends SubpathStrategy {
        private final String delimiter;

        /* JADX WARN: Multi-variable type inference failed */
        public Exclude() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Exclude copy$default(Exclude exclude, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exclude.delimiter;
            }
            return exclude.copy(str);
        }

        public final String component1() {
            return this.delimiter;
        }

        public final Exclude copy(String str) {
            sq8.m48649h(str, "delimiter");
            return new Exclude(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Exclude) && sq8.m48644c(this.delimiter, ((Exclude) obj).delimiter);
        }

        public final String getDelimiter() {
            return this.delimiter;
        }

        public int hashCode() {
            return this.delimiter.hashCode();
        }

        public String toString() {
            return "Exclude(delimiter=" + this.delimiter + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exclude(String str) {
            super(null);
            sq8.m48649h(str, "delimiter");
            this.delimiter = str;
        }

        public /* synthetic */ Exclude(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "/" : str);
        }
    }

    public static final class Include extends SubpathStrategy {
        public static final Include INSTANCE = new Include();

        private Include() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Include)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 12676664;
        }

        public String toString() {
            return "Include";
        }
    }

    private SubpathStrategy() {
    }

    public /* synthetic */ SubpathStrategy(id5 id5Var) {
        this();
    }
}
