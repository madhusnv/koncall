package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.EnumC0330u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0329t {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2416a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f2417b;

    static {
        int[] iArr = new int[c0.values().length];
        f2417b = iArr;
        try {
            iArr[c0.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2417b[c0.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2417b[c0.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC0330u.a.values().length];
        f2416a = iArr2;
        try {
            iArr2[EnumC0330u.a.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2416a[EnumC0330u.a.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f2416a[EnumC0330u.a.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
