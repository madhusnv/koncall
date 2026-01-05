package p001o;

/* loaded from: classes5.dex */
public enum za {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    private final boolean canExtendToken;

    /* renamed from: o.za$a */
    public /* synthetic */ class C18594a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56805a;

        static {
            int[] iArr = new int[za.values().length];
            try {
                iArr[za.INSTAGRAM_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[za.INSTAGRAM_CUSTOM_CHROME_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[za.INSTAGRAM_WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56805a = iArr;
        }
    }

    za(boolean z) {
        this.canExtendToken = z;
    }

    public final boolean canExtendToken() {
        return this.canExtendToken;
    }

    public final boolean fromInstagram() {
        int i = C18594a.f56805a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
