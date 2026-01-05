package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import p001o.id5;
import p001o.sq8;
import p001o.wca;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2139h {

    /* renamed from: a */
    public AtomicReference f7672a = new AtomicReference(null);

    /* renamed from: androidx.lifecycle.h$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C19561a Companion = new C19561a(null);

        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C19561a {

            /* renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C19562a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f7673a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f7673a = iArr;
                }
            }

            public C19561a() {
            }

            public /* synthetic */ C19561a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final a m6525a(b bVar) {
                sq8.m48649h(bVar, "state");
                int i = C19562a.f7673a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_DESTROY;
                }
                if (i == 2) {
                    return a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* renamed from: b */
            public final a m6526b(b bVar) {
                sq8.m48649h(bVar, "state");
                int i = C19562a.f7673a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_STOP;
                }
                if (i == 2) {
                    return a.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            /* renamed from: c */
            public final a m6527c(b bVar) {
                sq8.m48649h(bVar, "state");
                int i = C19562a.f7673a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_START;
                }
                if (i == 2) {
                    return a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            /* renamed from: d */
            public final a m6528d(b bVar) {
                sq8.m48649h(bVar, "state");
                int i = C19562a.f7673a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_CREATE;
                }
                if (i == 2) {
                    return a.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.h$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f7674a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f7674a = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            return Companion.m6525a(bVar);
        }

        public static final a downTo(b bVar) {
            return Companion.m6526b(bVar);
        }

        public static final a upFrom(b bVar) {
            return Companion.m6527c(bVar);
        }

        public static final a upTo(b bVar) {
            return Companion.m6528d(bVar);
        }

        public final b getTargetState() {
            switch (b.f7674a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b bVar) {
            sq8.m48649h(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo6521a(wca wcaVar);

    /* renamed from: b */
    public abstract b mo6522b();

    /* renamed from: c */
    public final AtomicReference m6523c() {
        return this.f7672a;
    }

    /* renamed from: d */
    public abstract void mo6524d(wca wcaVar);
}
