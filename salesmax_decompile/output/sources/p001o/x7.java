package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class x7 extends q4i {

    /* renamed from: a */
    public EnumC18065b f53285a = EnumC18065b.NOT_READY;

    /* renamed from: b */
    public Object f53286b;

    /* renamed from: o.x7$a */
    public static /* synthetic */ class C18064a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53287a;

        static {
            int[] iArr = new int[EnumC18065b.values().length];
            f53287a = iArr;
            try {
                iArr[EnumC18065b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53287a[EnumC18065b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.x7$b */
    public enum EnumC18065b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo24393a();

    /* renamed from: b */
    public final Object m55754b() {
        this.f53285a = EnumC18065b.DONE;
        return null;
    }

    /* renamed from: e */
    public final boolean m55755e() {
        this.f53285a = EnumC18065b.FAILED;
        this.f53286b = mo24393a();
        if (this.f53285a == EnumC18065b.DONE) {
            return false;
        }
        this.f53285a = EnumC18065b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dgd.m23068u(this.f53285a != EnumC18065b.FAILED);
        int i = C18064a.f53287a[this.f53285a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m55755e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f53285a = EnumC18065b.NOT_READY;
        Object objM16437a = a5c.m16437a(this.f53286b);
        this.f53286b = null;
        return objM16437a;
    }
}
