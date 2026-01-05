package p001o;

import android.content.res.AssetManager;
import android.net.Uri;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.gjb;

/* loaded from: classes5.dex */
public class sp0 implements gjb {

    /* renamed from: c */
    public static final int f45719c = 22;

    /* renamed from: a */
    public final AssetManager f45720a;

    /* renamed from: b */
    public final InterfaceC16884a f45721b;

    /* renamed from: o.sp0$a */
    public interface InterfaceC16884a {
        /* renamed from: a */
        lu4 mo48596a(AssetManager assetManager, String str);
    }

    /* renamed from: o.sp0$b */
    public static class C16885b implements hjb, InterfaceC16884a {

        /* renamed from: a */
        public final AssetManager f45722a;

        public C16885b(AssetManager assetManager) {
            this.f45722a = assetManager;
        }

        @Override // p001o.sp0.InterfaceC16884a
        /* renamed from: a */
        public lu4 mo48596a(AssetManager assetManager, String str) {
            return new xv6(assetManager, str);
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new sp0(this.f45722a, this);
        }
    }

    /* renamed from: o.sp0$c */
    public static class C16886c implements hjb, InterfaceC16884a {

        /* renamed from: a */
        public final AssetManager f45723a;

        public C16886c(AssetManager assetManager) {
            this.f45723a = assetManager;
        }

        @Override // p001o.sp0.InterfaceC16884a
        /* renamed from: a */
        public lu4 mo48596a(AssetManager assetManager, String str) {
            return new o6g(assetManager, str);
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new sp0(this.f45723a, this);
        }
    }

    public sp0(AssetManager assetManager, InterfaceC16884a interfaceC16884a) {
        this.f45720a = assetManager;
        this.f45721b = interfaceC16884a;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(uri), this.f45721b.mo48596a(this.f45720a, uri.toString().substring(f45719c)));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return TransferTable.COLUMN_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
