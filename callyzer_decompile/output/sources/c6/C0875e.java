package c6;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.e */
/* loaded from: classes.dex */
public final class C0875e implements InterfaceC0874d, InterfaceC0876f {

    /* renamed from: a */
    public final /* synthetic */ int f5440a = 0;

    /* renamed from: b */
    public ClipData f5441b;

    /* renamed from: c */
    public int f5442c;

    /* renamed from: d */
    public int f5443d;

    /* renamed from: e */
    public Uri f5444e;

    /* renamed from: f */
    public Bundle f5445f;

    public /* synthetic */ C0875e() {
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: a */
    public ClipData mo2303a() {
        return this.f5441b;
    }

    @Override // c6.InterfaceC0874d
    /* renamed from: b */
    public void mo2304b(Uri uri) {
        this.f5444e = uri;
    }

    @Override // c6.InterfaceC0874d
    public C0877g build() {
        return new C0877g(new C0875e(this));
    }

    @Override // c6.InterfaceC0874d
    /* renamed from: c */
    public void mo2305c(int i10) {
        this.f5443d = i10;
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: d */
    public int mo2306d() {
        return this.f5443d;
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: e */
    public ContentInfo mo2307e() {
        return null;
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: f */
    public int mo2308f() {
        return this.f5442c;
    }

    @Override // c6.InterfaceC0874d
    public void setExtras(Bundle bundle) {
        this.f5445f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f5440a) {
            case 1:
                Uri uri = this.f5444e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f5441b.getDescription());
                sb2.append(", source=");
                int i10 = this.f5442c;
                sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i11 = this.f5443d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return AbstractC1452a.m4564k(sb2, this.f5445f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0875e(C0875e c0875e) {
        ClipData clipData = c0875e.f5441b;
        clipData.getClass();
        this.f5441b = clipData;
        int i10 = c0875e.f5442c;
        og.y0.m11053c(i10, 0, 5, "source");
        this.f5442c = i10;
        int i11 = c0875e.f5443d;
        if ((i11 & 1) == i11) {
            this.f5443d = i11;
            this.f5444e = c0875e.f5444e;
            this.f5445f = c0875e.f5445f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
