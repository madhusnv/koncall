package hi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 implements com.google.crypto.tink.shaded.protobuf.e0 {

    /* renamed from: b */
    public static final b1 f15982b = new b1(0);

    /* renamed from: c */
    public static final b1 f15983c = new b1(1);

    /* renamed from: d */
    public static final b1 f15984d = new b1(2);

    /* renamed from: e */
    public static final b1 f15985e = new b1(3);

    /* renamed from: a */
    public final /* synthetic */ int f15986a;

    public /* synthetic */ b1(int i10) {
        this.f15986a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    /* renamed from: a */
    public final boolean mo4175a(int i10) {
        switch (this.f15986a) {
            case 0:
                if (c1.forNumber(i10) != null) {
                }
                break;
            case 1:
                if (m1.forNumber(i10) != null) {
                }
                break;
            case 2:
                if (o1.forNumber(i10) != null) {
                }
                break;
            default:
                if (o2.forNumber(i10) != null) {
                }
                break;
        }
        return false;
    }
}
