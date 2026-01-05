package p001o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class o6g extends rp0 {
    public o6g(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return InputStream.class;
    }

    @Override // p001o.rp0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo41647c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p001o.rp0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo41648f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
