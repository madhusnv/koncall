package p001o;

import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public enum mwf {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<mwf> ALL;
    public static final C15438a Companion = new C15438a(null);
    private final long value;

    /* renamed from: o.mwf$a */
    public static final class C15438a {
        public C15438a() {
        }

        public /* synthetic */ C15438a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final EnumSet m39740a(long j) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(mwf.class);
            Iterator it = mwf.ALL.iterator();
            while (it.hasNext()) {
                mwf mwfVar = (mwf) it.next();
                if ((mwfVar.getValue() & j) != 0) {
                    enumSetNoneOf.add(mwfVar);
                }
            }
            sq8.m48648g(enumSetNoneOf, "result");
            return enumSetNoneOf;
        }
    }

    static {
        EnumSet<mwf> enumSetAllOf = EnumSet.allOf(mwf.class);
        sq8.m48648g(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        ALL = enumSetAllOf;
    }

    mwf(long j) {
        this.value = j;
    }

    public static final EnumSet<mwf> parseOptions(long j) {
        return Companion.m39740a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
