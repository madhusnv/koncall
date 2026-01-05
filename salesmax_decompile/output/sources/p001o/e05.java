package p001o;

/* loaded from: classes6.dex */
public enum e05 {
    Square,
    Rectangle,
    SeventhWidth,
    FreeForm;

    public final boolean getParentDecidesHeight$view_release() {
        return this == Rectangle;
    }

    public final boolean getParentDecidesWidth$view_release() {
        return this == Square || this == SeventhWidth || this == Rectangle;
    }
}
