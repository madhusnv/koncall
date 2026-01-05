package ty;

import ee.C2039g;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.b */
/* loaded from: classes3.dex */
public final class C7268b {

    /* renamed from: i */
    public static final C7268b f34703i = new C7268b();

    /* renamed from: a */
    public final C2039g f34704a;

    /* renamed from: b */
    public final int f34705b;

    /* renamed from: c */
    public final long f34706c;

    /* renamed from: d */
    public final int f34707d;

    /* renamed from: e */
    public final int f34708e;

    /* renamed from: f */
    public final long f34709f;

    /* renamed from: g */
    public final long f34710g;

    /* renamed from: h */
    public final HashMap f34711h;

    public C7268b() {
        this.f34711h = new HashMap();
        this.f34705b = 0;
        this.f34708e = 0;
        this.f34707d = 0;
        long j6 = 0;
        this.f34710g = j6;
        this.f34709f = j6;
        this.f34706c = j6;
        this.f34704a = new C2039g(0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        EnumC7267a enumC7267a = EnumC7267a.SIZE;
        int i10 = this.f34705b;
        if (enumC7267a.isSet(i10)) {
            sb2.append("size=");
            sb2.append(this.f34706c);
            sb2.append(";");
        }
        if (EnumC7267a.UIDGID.isSet(i10)) {
            sb2.append("uid=");
            sb2.append(this.f34707d);
            sb2.append(",gid=");
            sb2.append(this.f34708e);
            sb2.append(";");
        }
        if (EnumC7267a.MODE.isSet(i10)) {
            sb2.append("mode=");
            sb2.append(this.f34704a.toString());
            sb2.append(";");
        }
        if (EnumC7267a.ACMODTIME.isSet(i10)) {
            sb2.append("atime=");
            sb2.append(this.f34709f);
            sb2.append(",mtime=");
            sb2.append(this.f34710g);
            sb2.append(";");
        }
        if (EnumC7267a.EXTENDED.isSet(i10)) {
            sb2.append("ext=");
            sb2.append(this.f34711h);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public C7268b(int i10, long j6, int i11, int i12, C2039g c2039g, long j10, long j11, HashMap map) {
        HashMap map2 = new HashMap();
        this.f34711h = map2;
        this.f34705b = i10;
        this.f34706c = j6;
        this.f34707d = i11;
        this.f34708e = i12;
        this.f34704a = c2039g;
        this.f34709f = j10;
        this.f34710g = j11;
        map2.putAll(map);
    }
}
