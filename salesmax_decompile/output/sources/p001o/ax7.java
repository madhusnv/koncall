package p001o;

/* loaded from: classes3.dex */
public interface ax7 {

    /* renamed from: o.ax7$a */
    public static final class C12265a {
        /* renamed from: a */
        public static /* synthetic */ void m17935a(ax7 ax7Var, byte[] bArr, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length - i;
            }
            ax7Var.mo17933b(bArr, i, i2);
        }
    }

    /* renamed from: a */
    byte[] mo17932a();

    /* renamed from: b */
    void mo17933b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    int mo17934c();

    void reset();
}
