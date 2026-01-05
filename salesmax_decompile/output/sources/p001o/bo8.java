package p001o;

import android.content.Context;
import java.io.File;
import p001o.ut5;

/* loaded from: classes5.dex */
public final class bo8 extends ut5 {

    /* renamed from: o.bo8$a */
    public class C12465a implements ut5.InterfaceC17445a {

        /* renamed from: a */
        public final /* synthetic */ Context f16624a;

        /* renamed from: b */
        public final /* synthetic */ String f16625b;

        public C12465a(Context context, String str) {
            this.f16624a = context;
            this.f16625b = str;
        }

        @Override // p001o.ut5.InterfaceC17445a
        /* renamed from: a */
        public File mo19496a() {
            File cacheDir = this.f16624a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f16625b != null ? new File(cacheDir, this.f16625b) : cacheDir;
        }
    }

    public bo8(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public bo8(Context context, String str, long j) {
        super(new C12465a(context, str), j);
    }
}
