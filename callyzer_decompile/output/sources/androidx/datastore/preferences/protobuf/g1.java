package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g1 {
    /* renamed from: a */
    public abstract h1 mo871a(Object obj);

    /* renamed from: b */
    public final boolean m872b(int i10, C0317l c0317l, Object obj) throws InvalidProtocolBufferException {
        int i11 = c0317l.f2363b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            c0317l.m960w(0);
            ((h1) obj).m908c(i12 << 3, Long.valueOf(c0317l.f2362a.mo896s()));
            return true;
        }
        if (i13 == 1) {
            c0317l.m960w(1);
            ((h1) obj).m908c((i12 << 3) | 1, Long.valueOf(c0317l.f2362a.mo893p()));
            return true;
        }
        if (i13 == 2) {
            ((h1) obj).m908c((i12 << 3) | 2, c0317l.m942e());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.m804b();
            }
            c0317l.m960w(5);
            ((h1) obj).m908c(5 | (i12 << 3), Integer.valueOf(c0317l.f2362a.mo892o()));
            return true;
        }
        h1 h1Var = new h1(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0317l.m938a() != Integer.MAX_VALUE && m872b(i16, c0317l, h1Var)) {
        }
        if (i15 != c0317l.f2363b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (h1Var.f2343e) {
            h1Var.f2343e = false;
        }
        ((h1) obj).m908c(i14 | 3, h1Var);
        return true;
    }
}
