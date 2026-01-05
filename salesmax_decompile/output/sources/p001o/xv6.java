package p001o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* loaded from: classes5.dex */
public class xv6 extends rp0 {
    public xv6(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return AssetFileDescriptor.class;
    }

    @Override // p001o.rp0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo41647c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p001o.rp0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo41648f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
