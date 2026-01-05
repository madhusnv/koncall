package org.slf4j.helpers;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.d */
/* loaded from: classes3.dex */
public enum EnumC5715d {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3);

    int levelInt;

    EnumC5715d(int i10) {
        this.levelInt = i10;
    }

    private int getLevelInt() {
        return this.levelInt;
    }
}
