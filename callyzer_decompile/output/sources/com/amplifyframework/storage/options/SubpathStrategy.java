package com.amplifyframework.storage.options;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SubpathStrategy {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Exclude extends SubpathStrategy {
        private final String delimiter;

        /* JADX WARN: Multi-variable type inference failed */
        public Exclude() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Exclude copy$default(Exclude exclude, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = exclude.delimiter;
            }
            return exclude.copy(str);
        }

        public final String component1() {
            return this.delimiter;
        }

        public final Exclude copy(String delimiter) {
            AbstractC4154l.m8923f(delimiter, "delimiter");
            return new Exclude(delimiter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Exclude) && AbstractC4154l.m8918a(this.delimiter, ((Exclude) obj).delimiter);
        }

        public final String getDelimiter() {
            return this.delimiter;
        }

        public int hashCode() {
            return this.delimiter.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("Exclude(delimiter=", this.delimiter, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exclude(String delimiter) {
            super(null);
            AbstractC4154l.m8923f(delimiter, "delimiter");
            this.delimiter = delimiter;
        }

        public /* synthetic */ Exclude(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "/" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Include extends SubpathStrategy {
        public static final Include INSTANCE = new Include();

        private Include() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Include);
        }

        public int hashCode() {
            return 12676664;
        }

        public String toString() {
            return "Include";
        }
    }

    public /* synthetic */ SubpathStrategy(AbstractC4148f abstractC4148f) {
        this();
    }

    private SubpathStrategy() {
    }
}
