package d5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d5.c */
/* loaded from: classes.dex */
public final class C1599c implements InterfaceC1600d {

    /* renamed from: a */
    public boolean f8001a;

    /* renamed from: b */
    public String f8002b;

    /* renamed from: c */
    public String f8003c;

    /* renamed from: d */
    public float f8004d;

    /* renamed from: e */
    public float f8005e;

    @Override // d5.InterfaceC1600d
    public final float value() {
        float f6 = this.f8004d;
        if (f6 >= this.f8005e) {
            this.f8001a = true;
        }
        if (!this.f8001a) {
            this.f8004d = f6 + 1.0f;
        }
        return this.f8004d;
    }
}
