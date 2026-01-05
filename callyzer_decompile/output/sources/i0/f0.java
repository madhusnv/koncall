package i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum f0 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    private final boolean mHoldsCameraSlot;

    f0(boolean z6) {
        this.mHoldsCameraSlot = z6;
    }

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }
}
