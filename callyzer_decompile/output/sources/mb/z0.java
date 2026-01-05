package mb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends a1 {

    /* renamed from: c */
    public static final z0 f23578c = new z0(0);

    /* renamed from: d */
    public static final z0 f23579d = new z0(1);

    /* renamed from: e */
    public static final z0 f23580e = new z0(2);

    /* renamed from: f */
    public static final z0 f23581f = new z0(3);

    /* renamed from: g */
    public static final z0 f23582g = new z0(4);

    /* renamed from: h */
    public static final z0 f23583h = new z0(5);

    /* renamed from: i */
    public static final z0 f23584i = new z0(6);

    /* renamed from: b */
    public final /* synthetic */ int f23585b;

    public /* synthetic */ z0(int i10) {
        this.f23585b = i10;
    }

    @Override // mb.a1
    /* renamed from: a */
    public final String mo9579a() {
        switch (this.f23585b) {
            case 0:
                return "authenticated-read";
            case 1:
                return "aws-exec-read";
            case 2:
                return "bucket-owner-full-control";
            case 3:
                return "bucket-owner-read";
            case 4:
                return "private";
            case 5:
                return "public-read";
            default:
                return "public-read-write";
        }
    }

    public final String toString() {
        switch (this.f23585b) {
            case 0:
                return "AuthenticatedRead";
            case 1:
                return "AwsExecRead";
            case 2:
                return "BucketOwnerFullControl";
            case 3:
                return "BucketOwnerRead";
            case 4:
                return "Private";
            case 5:
                return "PublicRead";
            default:
                return "PublicReadWrite";
        }
    }
}
