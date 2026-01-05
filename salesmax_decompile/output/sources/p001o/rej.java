package p001o;

/* loaded from: classes3.dex */
public interface rej {

    /* renamed from: o.rej$a */
    public static final class C16597a {
        /* renamed from: a */
        public static /* synthetic */ xej m46629a(rej rejVar, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peek");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return rejVar.mo36944o(i);
        }
    }

    /* renamed from: a */
    xej mo36943a();

    xej nextToken();

    /* renamed from: o */
    xej mo36944o(int i);
}
