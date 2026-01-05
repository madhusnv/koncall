package p001o;

/* loaded from: classes5.dex */
public enum wq8 {
    None(1),
    FadeThrough(3),
    Fade(4),
    SharedAxisXForward(5),
    SharedAxisYForward(6),
    SharedAxisZForward(7),
    SharedAxisXBackward(8),
    SharedAxisYBackward(9),
    SharedAxisZBackward(10),
    ElevationScaleGrow(11),
    ElevationScale(12);

    private final int value;

    wq8(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
