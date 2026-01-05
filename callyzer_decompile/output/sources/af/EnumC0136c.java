package af;

import mj.InterfaceC4755c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: af.c */
/* loaded from: classes.dex */
public enum EnumC0136c implements InterfaceC4755c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    private final int number_;

    EnumC0136c(int i10) {
        this.number_ = i10;
    }

    @Override // mj.InterfaceC4755c
    public int getNumber() {
        return this.number_;
    }
}
