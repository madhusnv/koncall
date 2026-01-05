package xj;

import mj.InterfaceC4755c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xj.c */
/* loaded from: classes.dex */
public enum EnumC8389c implements InterfaceC4755c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    EnumC8389c(int i10) {
        this.number_ = i10;
    }

    @Override // mj.InterfaceC4755c
    public int getNumber() {
        return this.number_;
    }
}
