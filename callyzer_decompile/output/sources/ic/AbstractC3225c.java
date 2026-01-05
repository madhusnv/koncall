package ic;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ic.c */
/* loaded from: classes.dex */
public abstract class AbstractC3225c implements InterfaceC3227e {
    @Override // ic.InterfaceC3227e
    /* renamed from: a */
    public final byte[] mo7578a() {
        int iMo7577c = mo7577c();
        reset();
        return new byte[]{(byte) ((iMo7577c >>> 24) & 255), (byte) ((iMo7577c >>> 16) & 255), (byte) ((iMo7577c >>> 8) & 255), (byte) (iMo7577c & 255)};
    }

    @Override // ic.InterfaceC3227e
    /* renamed from: b */
    public final int mo7579b() {
        return 4;
    }

    /* renamed from: c */
    public abstract int mo7577c();
}
