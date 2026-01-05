package e6;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e6.f */
/* loaded from: classes.dex */
public final class C1963f implements InterfaceC1964g {

    /* renamed from: a */
    public final InputContentInfo f9205a;

    public C1963f(Object obj) {
        this.f9205a = (InputContentInfo) obj;
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: b */
    public final Uri mo60b() {
        return this.f9205a.getContentUri();
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: c */
    public final void mo61c() {
        this.f9205a.requestPermission();
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: h */
    public final Uri mo66h() {
        return this.f9205a.getLinkUri();
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: j */
    public final ClipDescription mo68j() {
        return this.f9205a.getDescription();
    }

    @Override // e6.InterfaceC1964g
    /* renamed from: k */
    public final Object mo69k() {
        return this.f9205a;
    }

    public C1963f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f9205a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
