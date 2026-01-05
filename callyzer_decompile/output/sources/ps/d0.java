package ps;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import p005f.C2162k;
import sq.g2;
import us.C7536c;
import uw.InterfaceC7559c;
import ww.AbstractC8196f;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f29342a;

    /* renamed from: b */
    public final /* synthetic */ Context f29343b;

    /* renamed from: c */
    public final /* synthetic */ C7536c f29344c;

    /* renamed from: d */
    public final /* synthetic */ C2162k f29345d;

    /* renamed from: e */
    public final /* synthetic */ C2162k f29346e;

    public /* synthetic */ d0(Context context, C7536c c7536c, C2162k c2162k, C2162k c2162k2, int i10) {
        this.f29342a = i10;
        this.f29343b = context;
        this.f29344c = c7536c;
        this.f29345d = c2162k;
        this.f29346e = c2162k2;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29342a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    g2.g0(this.f29343b, this.f29344c, this.f29345d);
                } else {
                    int i10 = Build.VERSION.SDK_INT;
                    this.f29346e.mo1274a(i10 < 33 ? i10 < 29 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_MEDIA_AUDIO"});
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    g2.g0(this.f29343b, this.f29344c, this.f29345d);
                } else {
                    int i11 = Build.VERSION.SDK_INT;
                    this.f29346e.mo1274a(i11 < 33 ? i11 < 29 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_MEDIA_AUDIO"});
                    AbstractC8196f.m15349b(Log.e("FolderSelect", "Storage permission not provided"));
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
