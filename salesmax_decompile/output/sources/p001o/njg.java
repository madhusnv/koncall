package p001o;

/* loaded from: classes3.dex */
public final class njg extends bxc {

    /* renamed from: b */
    public final int f36916b;

    /* renamed from: c */
    public final int f36917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njg(String str, int i, int i2, int i3) {
        super(str, "expected at least " + i2 + " matches of predicate; only matched " + i3, i);
        sq8.m48649h(str, "input");
        this.f36916b = i2;
        this.f36917c = i3;
    }

    /* renamed from: b */
    public final int m40679b() {
        return this.f36916b;
    }

    /* renamed from: c */
    public final int m40680c() {
        return this.f36917c;
    }
}
