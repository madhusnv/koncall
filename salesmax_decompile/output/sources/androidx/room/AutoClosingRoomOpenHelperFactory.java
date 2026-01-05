package androidx.room;

import p001o.meg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelperFactory implements meg.InterfaceC15303c {
    private final AutoCloser autoCloser;
    private final meg.InterfaceC15303c delegate;

    public AutoClosingRoomOpenHelperFactory(meg.InterfaceC15303c interfaceC15303c, AutoCloser autoCloser) {
        sq8.m48649h(interfaceC15303c, "delegate");
        sq8.m48649h(autoCloser, "autoCloser");
        this.delegate = interfaceC15303c;
        this.autoCloser = autoCloser;
    }

    @Override // p001o.meg.InterfaceC15303c
    public AutoClosingRoomOpenHelper create(meg.C15302b c15302b) {
        sq8.m48649h(c15302b, "configuration");
        return new AutoClosingRoomOpenHelper(this.delegate.create(c15302b), this.autoCloser);
    }
}
