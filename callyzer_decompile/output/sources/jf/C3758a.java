package jf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jf.a */
/* loaded from: classes.dex */
public final class C3758a {

    /* renamed from: a */
    public final /* synthetic */ int f19625a;

    /* renamed from: b */
    public final String f19626b;

    /* renamed from: c */
    public final boolean f19627c;

    public /* synthetic */ C3758a(String str, boolean z6, int i10) {
        this.f19625a = i10;
        this.f19626b = str;
        this.f19627c = z6;
    }

    public String toString() {
        switch (this.f19625a) {
            case 0:
                String str = this.f19626b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append("{");
                sb2.append(str);
                sb2.append("}");
                sb2.append(this.f19627c);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3758a(boolean z6, String str, int i10) {
        this.f19625a = i10;
        this.f19627c = z6;
        this.f19626b = str;
    }
}
