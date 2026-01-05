package p001o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class up0 implements qdb {

    /* renamed from: a */
    public final AssetManager f49301a;

    public up0(AssetManager assetManager) {
        this.f49301a = assetManager;
    }

    @Override // p001o.qdb
    /* renamed from: a */
    public InputStream mo45202a(String str) {
        try {
            return this.f49301a.open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }
}
