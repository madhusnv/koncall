package p001o;

/* loaded from: classes2.dex */
public final class jo6 extends RuntimeException {

    /* renamed from: a */
    public final int f30846a;

    public jo6(int i) {
        super(m34150a(i));
        this.f30846a = i;
    }

    /* renamed from: a */
    public static String m34150a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
