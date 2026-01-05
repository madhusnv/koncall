package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class w7 implements Iterator {

    /* renamed from: a */
    public EnumC17789b f51550a = EnumC17789b.NOT_READY;

    /* renamed from: b */
    public Object f51551b;

    /* renamed from: o.w7$a */
    public static /* synthetic */ class C17788a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51552a;

        static {
            int[] iArr = new int[EnumC17789b.values().length];
            f51552a = iArr;
            try {
                iArr[EnumC17789b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51552a[EnumC17789b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.w7$b */
    public enum EnumC17789b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo54014a();

    /* renamed from: b */
    public final Object m54015b() {
        this.f51550a = EnumC17789b.DONE;
        return null;
    }

    /* renamed from: e */
    public final boolean m54016e() {
        this.f51550a = EnumC17789b.FAILED;
        this.f51551b = mo54014a();
        if (this.f51550a == EnumC17789b.DONE) {
            return false;
        }
        this.f51550a = EnumC17789b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dgd.m23068u(this.f51550a != EnumC17789b.FAILED);
        int i = C17788a.f51552a[this.f51550a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m54016e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f51550a = EnumC17789b.NOT_READY;
        Object objM20250a = c5c.m20250a(this.f51551b);
        this.f51551b = null;
        return objM20250a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
